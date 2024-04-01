// Intro to ANTLR+LLVM
// sawickib, 2014-2023

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception {
//        ANTLRFileStream input = new ANTLRFileStream(args[0]);
        String input = "x = 1+2 \n out x \n";

        gramatykaLexer lexer = new gramatykaLexer(CharStreams.fromString(input));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gramatykaParser parser = new gramatykaParser(tokens);

        ParseTree tree = parser.prog(); 

        System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new gramatykaActions(), tree);

    }
}
