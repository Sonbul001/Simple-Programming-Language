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
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInput(gramatykaParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInput(gramatykaParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code output}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOutput(gramatykaParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code output}
	 * labeled alternative in {@link gramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOutput(gramatykaParser.OutputContext ctx);
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
	 * Enter a parse tree produced by the {@code logic_val}
	 * labeled alternative in {@link gramatykaParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic_val(gramatykaParser.Logic_valContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logic_val}
	 * labeled alternative in {@link gramatykaParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic_val(gramatykaParser.Logic_valContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link gramatykaParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void enterNeg(gramatykaParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link gramatykaParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void exitNeg(gramatykaParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logic_opp}
	 * labeled alternative in {@link gramatykaParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic_opp(gramatykaParser.Logic_oppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logic_opp}
	 * labeled alternative in {@link gramatykaParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic_opp(gramatykaParser.Logic_oppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logic_par}
	 * labeled alternative in {@link gramatykaParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic_par(gramatykaParser.Logic_parContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logic_par}
	 * labeled alternative in {@link gramatykaParser#expr_logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic_par(gramatykaParser.Logic_parContext ctx);
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
	 * Enter a parse tree produced by the {@code single4}
	 * labeled alternative in {@link gramatykaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterSingle4(gramatykaParser.Single4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single4}
	 * labeled alternative in {@link gramatykaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitSingle4(gramatykaParser.Single4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_par}
	 * labeled alternative in {@link gramatykaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr_par(gramatykaParser.Expr_parContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_par}
	 * labeled alternative in {@link gramatykaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr_par(gramatykaParser.Expr_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(gramatykaParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(gramatykaParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(gramatykaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(gramatykaParser.ArrayContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#logic_value}.
	 * @param ctx the parse tree
	 */
	void enterLogic_value(gramatykaParser.Logic_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#logic_value}.
	 * @param ctx the parse tree
	 */
	void exitLogic_value(gramatykaParser.Logic_valueContext ctx);
}