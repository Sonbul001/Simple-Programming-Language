// Generated from gramatyka.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatykaParser}.
 */
public interface gramatykaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gramatykaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gramatykaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(gramatykaParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(gramatykaParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(gramatykaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(gramatykaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(gramatykaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(gramatykaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramatykaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramatykaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link gramatykaParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(gramatykaParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link gramatykaParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(gramatykaParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code logical}
	 * labeled alternative in {@link gramatykaParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterLogical(gramatykaParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logical}
	 * labeled alternative in {@link gramatykaParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitLogical(gramatykaParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link gramatykaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(gramatykaParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link gramatykaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(gramatykaParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link gramatykaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterPlusminus(gramatykaParser.PlusminusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusminus}
	 * labeled alternative in {@link gramatykaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitPlusminus(gramatykaParser.PlusminusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single2}
	 * labeled alternative in {@link gramatykaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterSingle2(gramatykaParser.Single2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single2}
	 * labeled alternative in {@link gramatykaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitSingle2(gramatykaParser.Single2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multidivide}
	 * labeled alternative in {@link gramatykaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterMultidivide(gramatykaParser.MultidivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multidivide}
	 * labeled alternative in {@link gramatykaParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitMultidivide(gramatykaParser.MultidivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single3}
	 * labeled alternative in {@link gramatykaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterSingle3(gramatykaParser.Single3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single3}
	 * labeled alternative in {@link gramatykaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitSingle3(gramatykaParser.Single3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link gramatykaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterNegative(gramatykaParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link gramatykaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitNegative(gramatykaParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single4}
	 * labeled alternative in {@link gramatykaParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterSingle4(gramatykaParser.Single4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single4}
	 * labeled alternative in {@link gramatykaParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitSingle4(gramatykaParser.Single4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link gramatykaParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterPar(gramatykaParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link gramatykaParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitPar(gramatykaParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gramatykaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gramatykaParser.ValueContext ctx);
}