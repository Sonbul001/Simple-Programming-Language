
import java.util.HashMap;
import java.util.Stack;
enum VarType{ INT, FLOAT, DOUBLE, STRING, BOOLEAN, UNKNOWN }

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

    HashMap<String, Value> variables = new HashMap<String, Value>();
    Stack<Value> stack = new Stack<Value>();
    
    static int BUFFER_SIZE = 16;

    @Override
    public void exitAssign(gramatykaParser.AssignContext ctx) { 
       String ID = ctx.ID().getText();
       Value v = stack.pop();
       if( !variables.containsKey(ID) ) {
            variables.put(ID, v);
            if( v.type == VarType.INT ){
                gramatykaGenerator.declare_int(ID);
            }
            if( v.type == VarType.STRING ){
                gramatykaGenerator.declare_string(ID);
            }
            if( v.type == VarType.FLOAT ){
                gramatykaGenerator.declare_float(ID);
            }
            if( v.type == VarType.DOUBLE ){
                gramatykaGenerator.declare_double(ID);
            }
            if( v.type == VarType.BOOLEAN ){
                gramatykaGenerator.declare_boolean(ID);
            }
       }   
       if( v.type == VarType.INT ){
         gramatykaGenerator.assign_int(ID, v.name);
       } 
       if( v.type == VarType.STRING ){
         gramatykaGenerator.assign_string(ID);
       }
       if (v.type == VarType.FLOAT){
           gramatykaGenerator.assign_float(ID, v.name);
       }
       if (v.type == VarType.DOUBLE){
           gramatykaGenerator.assign_double(ID, v.name);
       }
       if( v.type == VarType.BOOLEAN){
           gramatykaGenerator.assign_boolean(ID, v.name);
       }
    }

    @Override 
    public void exitProg(gramatykaParser.ProgContext ctx) { 
       System.out.println( gramatykaGenerator.generate() );
    }

    @Override 
    public void exitValue(gramatykaParser.ValueContext ctx) { 
       if( ctx.ID() != null ){
         String ID = ctx.ID().getText();     
         if( variables.containsKey(ID) ) {
            Value v = variables.get( ID );
            if( v.type == VarType.INT ){
               gramatykaGenerator.load_int( ID );
            }
            if( v.type == VarType.STRING ){
               gramatykaGenerator.load_string( ID );
            }
            if( v.type == VarType.FLOAT ){
                gramatykaGenerator.load_float( ID );
            }
            if( v.type == VarType.DOUBLE ){
                gramatykaGenerator.load_double( ID );
            }
            stack.push( new Value("%"+(gramatykaGenerator.reg-1), v.type, v.length));
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
            if( variables.containsKey(ID) ) {
                Value v = variables.get( ID );
                if( v.type == VarType.BOOLEAN ){
                    gramatykaGenerator.load_boolean( ID );
                }
                stack.push( new Value("%"+(gramatykaGenerator.reg-1), v.type, 0));
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
       if( variables.containsKey(ID) ) {
          Value v = variables.get( ID );
          if( v.type != null ) {
              if( v.type == VarType.INT ){
                gramatykaGenerator.printf_value( ID,"int" );
              }
              if( v.type == VarType.STRING ){
                gramatykaGenerator.printf_value( ID, "string" );
              }
              if( v.type == VarType.FLOAT ){
                  gramatykaGenerator.printf_value( ID, "float" );
              }
              if( v.type == VarType.DOUBLE ){
                  gramatykaGenerator.printf_value( ID, "double" );
              }
              if( v.type == VarType.BOOLEAN ){
                  gramatykaGenerator.printf_value( ID, "boolean" );
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
           variables.put(ID, v);
           gramatykaGenerator.scanf(ID, "int");
       } else if (ctx.FLOAT() != null) {
           Value v = new Value(ID, VarType.FLOAT, 0);
           variables.put(ID, v);
           gramatykaGenerator.scanf(ID, "float");
       } else if (ctx.DOUBLE() != null) {
           Value v = new Value(ID, VarType.DOUBLE, 0);
           variables.put(ID, v);
           gramatykaGenerator.scanf(ID, "double");
       } else if (ctx.BOOLTYPE() != null) {
           Value v = new Value(ID, VarType.BOOLEAN, 0);
           variables.put(ID, v);
           gramatykaGenerator.scanf(ID, "boolean");
       } else if (ctx.STRINGTYPE() != null) {
           Value v = new Value(ID, VarType.STRING, BUFFER_SIZE-1);
           variables.put(ID, v);
           gramatykaGenerator.scanf_string(ID, BUFFER_SIZE);
       } else {
           error(ctx.getStart().getLine(), "wrong type for input");
       }
    }

    void error(int line, String msg){
       System.err.println("Error, line "+line+", "+msg);
       System.exit(1);
    }
       
}
