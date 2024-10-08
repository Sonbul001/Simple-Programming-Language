
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
enum VarType{ INT, FLOAT, DOUBLE, STRING, BOOLEAN, ARRAY, FUNCTION, UNKNOWN }

class Value{
    public String name;
    public VarType type;
    public int length;

    public Value( String name, VarType type, int length ){
        this.name = name;
        this.type = type;
        this.length = length;
    }
}
public class gramatykaActions extends gramatykaBaseListener {

    HashMap<String, Value> localVariables = new HashMap<String, Value>();
    HashMap<String, Value> globalVariables = new HashMap<String, Value>();

    HashSet<String> globalnames = new HashSet<String>();
    HashSet<String> localnames = new HashSet<String>();

    HashSet<String> functions = new HashSet<String>();
    Stack<Value> stack = new Stack<Value>();
    Stack<Integer> blockStack = new Stack<Integer>();
    String function;
    boolean global;
    
    static int BUFFER_SIZE = 16;

    public String set_variable(String ID){
        String id;
        if( global ){
            if( ! globalnames.contains(ID) ) {
                globalnames.add(ID);
                gramatykaGenerator.declare_int(ID, true);
            }
            id = ID;
        } else {
            if( ! localnames.contains(ID) ) {
                localnames.add(ID);
                gramatykaGenerator.declare_int(ID, false);
            }
            id = ID;
        }
        return id;
    }
    @Override
    public void exitFparam(gramatykaParser.FparamContext ctx) {
        String ID = ctx.ID().getText();
        functions.add(ID);
        function = ID;
        gramatykaGenerator.functionstart(ID);
    }

    @Override
    public void exitFblock(gramatykaParser.FblockContext ctx) {
        if( ! localnames.contains(function) ){
            gramatykaGenerator.assign_int(set_variable(function), "0", global);
        }
        gramatykaGenerator.load_int( function , global);
        gramatykaGenerator.functionend();
        localnames = new HashSet<String>();
        localVariables.clear();
        global = true;
    }

    @Override
    public void enterFblock(gramatykaParser.FblockContext ctx) {
        global = false;
    }

    @Override
    public void exitCall(gramatykaParser.CallContext ctx) {
        gramatykaGenerator.call(ctx.ID().getText());
    }

    @Override
    public void exitAssign(gramatykaParser.AssignContext ctx) { 
       String ID = ctx.ID().getText();
       Value v = stack.pop();
       if(!globalVariables.containsKey(ID) && ctx.GLOBAL() != null ) {
           globalVariables.put(ID, v);
            if( v.type == VarType.INT ){
                gramatykaGenerator.declare_int(ID, true);
            }
            if( v.type == VarType.STRING ){
                gramatykaGenerator.declare_string(ID, true);
            }
            if( v.type == VarType.FLOAT ){
                gramatykaGenerator.declare_float(ID, true);
            }
            if( v.type == VarType.DOUBLE ){
                gramatykaGenerator.declare_double(ID, true);
            }
            if( v.type == VarType.BOOLEAN ){
                gramatykaGenerator.declare_boolean(ID, true);
            }
            if( v.type == VarType.ARRAY){
                gramatykaGenerator.declare_array(ID, v.length);
            }
       }
        else if(!localVariables.containsKey(ID) && ctx.GLOBAL() == null ) {
            localVariables.put(ID, v);
            if( v.type == VarType.INT ){
                gramatykaGenerator.declare_int(ID, false);
            }
            if( v.type == VarType.STRING ){
                gramatykaGenerator.declare_string(ID, false);
            }
            if( v.type == VarType.FLOAT ){
                gramatykaGenerator.declare_float(ID, false);
            }
            if( v.type == VarType.DOUBLE ){
                gramatykaGenerator.declare_double(ID, false);
            }
            if( v.type == VarType.BOOLEAN ){
                gramatykaGenerator.declare_boolean(ID, false);
            }
            if( v.type == VarType.ARRAY){
                gramatykaGenerator.declare_array(ID, v.length);
            }
        }
        if (ctx.GLOBAL() != null) {
            if( v.type == VarType.INT){
                gramatykaGenerator.assign_int(ID, v.name, true);
            }
            if( v.type == VarType.STRING ){
                gramatykaGenerator.assign_string(ID, true);
            }
            if (v.type == VarType.FLOAT){
                gramatykaGenerator.assign_float(ID, v.name);
            }
            if (v.type == VarType.DOUBLE){
                gramatykaGenerator.assign_double(ID, v.name, true);
            }
            if( v.type == VarType.BOOLEAN){
                gramatykaGenerator.assign_boolean(ID, v.name, true);
            }
        } else if (ctx.GLOBAL() == null) {
            if( v.type == VarType.INT){
                gramatykaGenerator.assign_int(ID, v.name, false);
            }
            if( v.type == VarType.STRING ){
                gramatykaGenerator.assign_string(ID, false);
            }
            if (v.type == VarType.FLOAT){
                gramatykaGenerator.assign_float(ID, v.name);
            }
            if (v.type == VarType.DOUBLE){
                gramatykaGenerator.assign_double(ID, v.name, false);
            }
            if( v.type == VarType.BOOLEAN){
                gramatykaGenerator.assign_boolean(ID, v.name, false);
            }
        }
//       if( v.type == VarType.ARRAY){
//       }
    }

    @Override
    public void enterAssign(gramatykaParser.AssignContext ctx) {
        if (!global) {
            localVariables.clear();
        }
    }

    @Override
    public void exitProg(gramatykaParser.ProgContext ctx) {
        gramatykaGenerator.close_main();
        System.out.println( gramatykaGenerator.generate() );
    }

    @Override 
    public void exitValue(gramatykaParser.ValueContext ctx) { 
       if( ctx.ID() != null ){
         String ID = ctx.ID().getText();
         if (globalVariables.containsKey(ID) || localVariables.containsKey(ID)) {
             if (globalVariables.containsKey(ID)) {
                 Value v = globalVariables.get( ID );;
                 if( v.type == VarType.INT ){
                     gramatykaGenerator.load_int( ID, true);
                 }
                 if( v.type == VarType.STRING ){
                     gramatykaGenerator.load_string( ID, true );
                 }
                 if( v.type == VarType.FLOAT ){
                     gramatykaGenerator.load_float( ID );
                 }
                 if( v.type == VarType.DOUBLE ){
                     gramatykaGenerator.load_double( ID, true );
                 }
                 stack.push( new Value("%"+(gramatykaGenerator.reg-1), v.type, v.length));
             }
             else if (localVariables.containsKey(ID)) {
                 Value v = localVariables.get( ID );;
                 if( v.type == VarType.INT ){
                     gramatykaGenerator.load_int( ID, false);
                 }
                 if( v.type == VarType.STRING ){
                     gramatykaGenerator.load_string( ID, false );
                 }
                 if( v.type == VarType.FLOAT ){
                     gramatykaGenerator.load_float( ID );
                 }
                 if( v.type == VarType.DOUBLE ){
                     gramatykaGenerator.load_double( ID, false );
                 }
                 stack.push( new Value("%"+(gramatykaGenerator.reg-1), v.type, v.length));
             }
         } else {
            error(ctx.getStart().getLine(), "unknown variable "+ID);         
         }
       }
       if( ctx.INT() != null ){
         stack.push( new Value(ctx.INT().getText(), VarType.INT, 0) );
       } 
       if( ctx.STRING() != null ){
         String tmp = ctx.STRING().getText(); 
         String content = tmp.substring(1, tmp.length()-1);
         gramatykaGenerator.constant_string(content);
         String n = "ptrstr"+(gramatykaGenerator.str-1);
         stack.push( new Value(n, VarType.STRING, content.length()) );
       }
       if( ctx.FLOAT() != null){
           stack.push( new Value(ctx.REAL().getText(), VarType.FLOAT, 0) );
       }
       if( ctx.DOUBLE() != null){
           stack.push( new Value(ctx.REAL().getText(), VarType.DOUBLE, 0) );
       }
    }

    @Override
    public void exitLogic_value(gramatykaParser.Logic_valueContext ctx) {
        if( ctx.ID() != null ){
            String ID = ctx.ID().getText();
            if(globalVariables.containsKey(ID) || localVariables.containsKey(ID) ) {
                Value v = null;
                if (localVariables.containsKey(ID)) {
                    v = localVariables.get( ID );
                    if( v.type == VarType.BOOLEAN ){
                        gramatykaGenerator.load_boolean( ID, false );
                    }
                    stack.push( new Value("%"+(gramatykaGenerator.reg-1), v.type, 0));
                }
                else if (globalVariables.containsKey(ID)) {
                    v = globalVariables.get( ID );
                    if( v.type == VarType.BOOLEAN ){
                        gramatykaGenerator.load_boolean( ID, true );
                    }
                    stack.push( new Value("%"+(gramatykaGenerator.reg-1), v.type, 0));
                }
            } else {
                error(ctx.getStart().getLine(), "unknown variable "+ID);
            }
        }
        if( ctx.BOOLEAN() != null ){
            stack.push( new Value(ctx.BOOLEAN().getText(), VarType.BOOLEAN, 0) );
        }
    }

    @Override
    public void exitPlusminus(gramatykaParser.PlusminusContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if (v1.type == v2.type) {
            if( v1.type==VarType.INT ){
                if (ctx.ADD() != null) {
                    gramatykaGenerator.add_int(v1.name, v2.name );
                }
                else if (ctx.MINUS() != null) {
                    gramatykaGenerator.minus_int(v1.name, v2.name);
                }
                Value v = new Value("%"+(gramatykaGenerator.reg-1), VarType.INT, 0);
                stack.push(v);
            }
            else if( v1.type==VarType.STRING ){
                if (ctx.ADD() != null) {
                    gramatykaGenerator.add_string(v1.name, v1.length, v2.name, v2.length);
                }
                else if (ctx.MINUS() != null) {
                    error(ctx.getStart().getLine(), "no minus in string");
                }
                Value v = new Value("%"+(gramatykaGenerator.reg-3), VarType.STRING, v1.length);
                stack.push(v);
            }
            else if( v1.type==VarType.FLOAT ){
                if (ctx.ADD() != null) {
                    gramatykaGenerator.add_float(v1.name, v2.name );
                }
                else if (ctx.MINUS() != null) {
                    gramatykaGenerator.minus_float(v1.name, v2.name);
                }
                Value v = new Value("%"+(gramatykaGenerator.reg-1), VarType.FLOAT, 0);
                stack.push(v);
            }
            else if( v1.type==VarType.DOUBLE ){
                if (ctx.ADD() != null) {
                    gramatykaGenerator.add_double(v1.name, v2.name );
                }
                else if (ctx.MINUS() != null) {
                    gramatykaGenerator.minus_double(v1.name, v2.name);
                }
                Value v = new Value("%"+(gramatykaGenerator.reg-1), VarType.DOUBLE, 0);
                stack.push(v);
            }
        }
        else {
            error(ctx.getStart().getLine(), "type mismatch");
        }
    }

    @Override
    public void exitMultidivide(gramatykaParser.MultidivideContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                if (ctx.MULTIPLY() != null) {
                    gramatykaGenerator.mult_int(v1.name, v2.name);
                }
                else if (ctx.DIVIDE() != null) {
                    gramatykaGenerator.divide_int(v1.name, v2.name);
                }
                stack.push( new Value("%"+(gramatykaGenerator.reg-1), VarType.INT, 0 ));
            }
            if( v1.type == VarType.FLOAT ){
                if (ctx.MULTIPLY() != null) {
                    gramatykaGenerator.mult_float(v1.name, v2.name);
                }
                else if (ctx.DIVIDE() != null) {
                    gramatykaGenerator.divide_float(v1.name, v2.name);
                }
                stack.push( new Value("%"+(gramatykaGenerator.reg-1), VarType.FLOAT, 0 ));
            }
            if( v1.type == VarType.DOUBLE ){
                if (ctx.MULTIPLY() != null) {
                    gramatykaGenerator.mult_double(v1.name, v2.name);
                }
                else if (ctx.DIVIDE() != null) {
                    gramatykaGenerator.divide_double(v1.name, v2.name);
                }
                stack.push( new Value("%"+(gramatykaGenerator.reg-1), VarType.DOUBLE, 0 ));
            }
        } else {
            error(ctx.getStart().getLine(), "type mismatch");
        }
    }

    @Override
    public void exitOutput(gramatykaParser.OutputContext ctx) {
       String ID = ctx.ID().getText();
        if(globalVariables.containsKey(ID) || localVariables.containsKey(ID) ) {
            Value v = null;
            if (localVariables.containsKey(ID)) {
                v = localVariables.get( ID );
                if( v.type != null ) {
                    if (v.type == VarType.INT) {

                        gramatykaGenerator.printf_value(ID, "int", false);
                    }
                    if (v.type == VarType.STRING) {
                        gramatykaGenerator.printf_value(ID, "string", false);
                    }
                    if (v.type == VarType.FLOAT) {
                        gramatykaGenerator.printf_value(ID, "float", false);
                    }
                    if (v.type == VarType.DOUBLE) {
                        gramatykaGenerator.printf_value(ID, "double", false);
                    }
                    if (v.type == VarType.BOOLEAN) {
                        gramatykaGenerator.printf_value(ID, "boolean", false);
                    }
                }
            }
            else if (globalVariables.containsKey(ID)) {
                v = globalVariables.get( ID );
                if( v.type != null ) {
                    if (v.type == VarType.INT) {

                        gramatykaGenerator.printf_value(ID, "int", true);
                    }
                    if (v.type == VarType.STRING) {
                        gramatykaGenerator.printf_value(ID, "string", true);
                    }
                    if (v.type == VarType.FLOAT) {
                        gramatykaGenerator.printf_value(ID, "float", true);
                    }
                    if (v.type == VarType.DOUBLE) {
                        gramatykaGenerator.printf_value(ID, "double", true);
                    }
                    if (v.type == VarType.BOOLEAN) {
                        gramatykaGenerator.printf_value(ID, "boolean", true);
                    }
                }
            }
       } else {
          error(ctx.getStart().getLine(), "unknown variable");
       }       
    }

    @Override
    public void exitLogic_opp(gramatykaParser.Logic_oppContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();

        if (ctx.AND() != null) {
            gramatykaGenerator.and(v1.name, v2.name );
        }
        else if (ctx.OR() != null) {
            gramatykaGenerator.or(v1.name, v2.name);
        }
        else if (ctx.XOR() != null) {
            gramatykaGenerator.xor(v1.name, v2.name);
        }
        Value v = new Value("%"+(gramatykaGenerator.reg-1), VarType.BOOLEAN, 0);
        stack.push(v);
    }

    @Override
    public void exitNeg(gramatykaParser.NegContext ctx) {
        Value v1 = stack.pop();
        gramatykaGenerator.neg(v1.name);
        Value v = new Value("%"+(gramatykaGenerator.reg-1), VarType.BOOLEAN, 0);
        stack.push(v);
    }

    @Override
    public void exitInput(gramatykaParser.InputContext ctx) {
       String ID = ctx.ID().getText();
       if (ctx.INTTYPE() != null) {
           Value v = new Value(ID, VarType.INT, 0);
           if (ctx.GLOBAL() != null) {
               globalVariables.put(ID, v);
               gramatykaGenerator.scanf(ID, "int", true);
           } else if (ctx.GLOBAL() == null) {
               localVariables.put(ID, v);
               gramatykaGenerator.scanf(ID, "int", false);
           }
       } else if (ctx.FLOAT() != null) {
           Value v = new Value(ID, VarType.FLOAT, 0);
           if (ctx.GLOBAL() != null) {
               globalVariables.put(ID, v);
               gramatykaGenerator.scanf(ID, "float", true);
           } else if (ctx.GLOBAL() == null) {
               localVariables.put(ID, v);
               gramatykaGenerator.scanf(ID, "float", false);
           }
       } else if (ctx.DOUBLE() != null) {
           Value v = new Value(ID, VarType.DOUBLE, 0);
           if (ctx.GLOBAL() != null) {
               globalVariables.put(ID, v);
               gramatykaGenerator.scanf(ID, "double", true);
           } else if (ctx.GLOBAL() == null) {
               localVariables.put(ID, v);
               gramatykaGenerator.scanf(ID, "double", false);
           }
       } else if (ctx.BOOLTYPE() != null) {
           Value v = new Value(ID, VarType.BOOLEAN, 0);
           if (ctx.GLOBAL() != null) {
               globalVariables.put(ID, v);
               gramatykaGenerator.scanf(ID, "boolean", true);
           } else if (ctx.GLOBAL() == null) {
               localVariables.put(ID, v);
               gramatykaGenerator.scanf(ID, "boolean", false);
           }
       } else if (ctx.STRINGTYPE() != null) {
           Value v = new Value(ID, VarType.STRING, BUFFER_SIZE-1);
           if (ctx.GLOBAL() != null) {
               globalVariables.put(ID, v);
               gramatykaGenerator.scanf_string(ID, BUFFER_SIZE, true);
           } else if (ctx.GLOBAL() == null) {
               localVariables.put(ID, v);
               gramatykaGenerator.scanf_string(ID, BUFFER_SIZE, false);
           }
       } else {
           error(ctx.getStart().getLine(), "wrong type for input");
       }
    }

    @Override
    public void exitArray(gramatykaParser.ArrayContext ctx) {
        stack.push( new Value(ctx.INT(0).getText(), VarType.ARRAY, Integer.parseInt(ctx.size.getText())) );
    }

    @Override
    public void exitCondition(gramatykaParser.ConditionContext ctx) {
        String ID = "";
        if( ctx.ID(0) != null ) {
            ID = ctx.ID(0).getText();
            if(globalVariables.containsKey(ID) || localVariables.containsKey(ID) ) {
                Value v = null;
                if (localVariables.containsKey(ID)) {
                    v = localVariables.get( ID );
                    if (v.type == VarType.INT) {
                        gramatykaGenerator.load_int(ID, false);
                    }
                    stack.push(new Value("%" + (gramatykaGenerator.reg - 1), v.type, v.length));
                }
                else if (globalVariables.containsKey(ID)) {
                    v = globalVariables.get( ID );
                    if (v.type == VarType.INT) {
                        gramatykaGenerator.load_int(ID, true);
                    }
                    stack.push(new Value("%" + (gramatykaGenerator.reg - 1), v.type, v.length));
                }
            }
            else {
                error(ctx.getStart().getLine(), "unknown variable ");
            }
        }
        if ( ctx.ID(1) != null ) {
            ID = ctx.ID(1).getText();
            if(globalVariables.containsKey(ID) || localVariables.containsKey(ID) ) {
                Value v = null;
                if (localVariables.containsKey(ID)) {
                    v = localVariables.get( ID );
                    if (v.type == VarType.INT) {
                        gramatykaGenerator.load_int(ID, false);
                    }
                    stack.push(new Value("%" + (gramatykaGenerator.reg - 1), v.type, v.length));
                }
                else if (globalVariables.containsKey(ID)) {
                    v = globalVariables.get( ID );
                    if (v.type == VarType.INT) {
                        gramatykaGenerator.load_int(ID, true);
                    }
                    stack.push(new Value("%" + (gramatykaGenerator.reg - 1), v.type, v.length));
                }
            }
            else {
                error(ctx.getStart().getLine(), "unknown variable "+ID);
            }
        } else {
            error(ctx.getStart().getLine(), "condition can have only ID");
        }

        Value vright = stack.pop();
        Value vleft = stack.pop();

        if (ctx.BIGGER() != null){
            gramatykaGenerator.bigger(vleft.name, vright.name);
        } else if (ctx.SMALLER() != null){
            gramatykaGenerator.smaller(vleft.name, vright.name);
        } else if (ctx.EQUAL() != null){
            gramatykaGenerator.equal(vleft.name, vright.name);
        } else if (ctx.NOTEQUAL() != null){
            gramatykaGenerator.notequal(vleft.name, vright.name);
        } else {
            error(ctx.getStart().getLine(), "You can only use >, <, ==, != ");
        }
        Value v = new Value("%"+(gramatykaGenerator.reg-1), VarType.INT, 0);
        stack.push(v);
        gramatykaGenerator.ifCond(ctx.getStart().getLine());
    }

//    @Override
//    public void exitBlock(LangXParser.BlockContext ctx) {
//        if( ctx.getParent() instanceof LangXParser.RepeatContext ){
//            LLVMGenerator.repeatend();
//        }
//    }

//    @Override
//    public void enterIf(gramatykaParser.IfContext ctx) {
//        gramatykaGenerator.ifCond(ctx.getStart().getLine());
//    }

    @Override
    public void exitRepetitions(gramatykaParser.RepetitionsContext ctx) {
        if (ctx.ID() != null) {
            String ID = ctx.ID().getText();
            if(globalVariables.containsKey(ID) || localVariables.containsKey(ID) ) {
                Value v = null;
                if (localVariables.containsKey(ID)) {
                    v = localVariables.get( ID );
                    if (v.type == VarType.INT) {
                        gramatykaGenerator.load_int(ID, false);
                    }
                    gramatykaGenerator.repeatstart(v.name);
                }
                else if (globalVariables.containsKey(ID)) {
                    v = globalVariables.get( ID );
                    if (v.type == VarType.INT) {
                        gramatykaGenerator.load_int(ID, true);
                    }
                    gramatykaGenerator.repeatstart(v.name);
                }
            }
            else {
                error(ctx.getStart().getLine(), "unknown variable ");
            }
        }
        if (ctx.INT() != null) {
            gramatykaGenerator.repeatstart(ctx.getText());
        }

    }

    @Override
    public void enterBlock(gramatykaParser.BlockContext ctx) {
        if (!(ctx.getParent() instanceof gramatykaParser.RepeatContext)) {
            blockStack.push(ctx.getStart().getLine());
            gramatykaGenerator.blockStart(ctx.getStart().getLine());
        }
    }

    @Override
    public void exitBlock(gramatykaParser.BlockContext ctx) {
        if( ctx.getParent() instanceof gramatykaParser.RepeatContext ){
            gramatykaGenerator.repeatend();
        } else {
            Integer x = blockStack.pop();
            gramatykaGenerator.blockEnd(x);
        }
    }

    void error(int line, String msg){
       System.err.println("Error, line "+line+", "+msg);
       System.exit(1);
    }
       
}
