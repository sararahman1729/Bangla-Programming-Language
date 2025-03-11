// Generated from Bangla.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BanglaParser}.
 */
public interface BanglaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BanglaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BanglaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BanglaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BanglaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BanglaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BanglaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BanglaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BanglaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BanglaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(BanglaParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(BanglaParser.ConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BanglaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BanglaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BanglaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BanglaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BanglaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BanglaParser.ExpressionContext ctx);
}