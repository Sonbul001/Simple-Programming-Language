
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream(args[0]);
//        String input = "in (int) x \n out x \n";

        gramatykaLexer lexer = new gramatykaLexer(input);
//        gramatykaLexer lexer = new gramatykaLexer(CharStreams.fromString(input));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramatykaParser parser = new gramatykaParser(tokens);

        ParseTree tree = parser.prog();

        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new gramatykaActions(), tree);

    }
}
