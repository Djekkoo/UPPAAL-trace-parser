// Generated from Cora.g4 by ANTLR 4.5.2
 
	package parser.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoraParser}.
 */
public interface CoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoraParser#trace}.
	 * @param ctx the parse tree
	 */
	void enterTrace(CoraParser.TraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#trace}.
	 * @param ctx the parse tree
	 */
	void exitTrace(CoraParser.TraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#firstState}.
	 * @param ctx the parse tree
	 */
	void enterFirstState(CoraParser.FirstStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#firstState}.
	 * @param ctx the parse tree
	 */
	void exitFirstState(CoraParser.FirstStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#gotoState}.
	 * @param ctx the parse tree
	 */
	void enterGotoState(CoraParser.GotoStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#gotoState}.
	 * @param ctx the parse tree
	 */
	void exitGotoState(CoraParser.GotoStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(CoraParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(CoraParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(CoraParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(CoraParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#systemStates}.
	 * @param ctx the parse tree
	 */
	void enterSystemStates(CoraParser.SystemStatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#systemStates}.
	 * @param ctx the parse tree
	 */
	void exitSystemStates(CoraParser.SystemStatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(CoraParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(CoraParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#clocks}.
	 * @param ctx the parse tree
	 */
	void enterClocks(CoraParser.ClocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#clocks}.
	 * @param ctx the parse tree
	 */
	void exitClocks(CoraParser.ClocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#transactionGuard}.
	 * @param ctx the parse tree
	 */
	void enterTransactionGuard(CoraParser.TransactionGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#transactionGuard}.
	 * @param ctx the parse tree
	 */
	void exitTransactionGuard(CoraParser.TransactionGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#synchronization}.
	 * @param ctx the parse tree
	 */
	void enterSynchronization(CoraParser.SynchronizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#synchronization}.
	 * @param ctx the parse tree
	 */
	void exitSynchronization(CoraParser.SynchronizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(CoraParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(CoraParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#systemState}.
	 * @param ctx the parse tree
	 */
	void enterSystemState(CoraParser.SystemStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#systemState}.
	 * @param ctx the parse tree
	 */
	void exitSystemState(CoraParser.SystemStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CoraParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CoraParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#clock}.
	 * @param ctx the parse tree
	 */
	void enterClock(CoraParser.ClockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#clock}.
	 * @param ctx the parse tree
	 */
	void exitClock(CoraParser.ClockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clockLHSZeroMinusObject}
	 * labeled alternative in {@link CoraParser#clockLHS}.
	 * @param ctx the parse tree
	 */
	void enterClockLHSZeroMinusObject(CoraParser.ClockLHSZeroMinusObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clockLHSZeroMinusObject}
	 * labeled alternative in {@link CoraParser#clockLHS}.
	 * @param ctx the parse tree
	 */
	void exitClockLHSZeroMinusObject(CoraParser.ClockLHSZeroMinusObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clockLHSObjectMinusZero}
	 * labeled alternative in {@link CoraParser#clockLHS}.
	 * @param ctx the parse tree
	 */
	void enterClockLHSObjectMinusZero(CoraParser.ClockLHSObjectMinusZeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clockLHSObjectMinusZero}
	 * labeled alternative in {@link CoraParser#clockLHS}.
	 * @param ctx the parse tree
	 */
	void exitClockLHSObjectMinusZero(CoraParser.ClockLHSObjectMinusZeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clockLHSObjectMinusObject}
	 * labeled alternative in {@link CoraParser#clockLHS}.
	 * @param ctx the parse tree
	 */
	void enterClockLHSObjectMinusObject(CoraParser.ClockLHSObjectMinusObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clockLHSObjectMinusObject}
	 * labeled alternative in {@link CoraParser#clockLHS}.
	 * @param ctx the parse tree
	 */
	void exitClockLHSObjectMinusObject(CoraParser.ClockLHSObjectMinusObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(CoraParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(CoraParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#syncExpr}.
	 * @param ctx the parse tree
	 */
	void enterSyncExpr(CoraParser.SyncExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#syncExpr}.
	 * @param ctx the parse tree
	 */
	void exitSyncExpr(CoraParser.SyncExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoraParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoraParser.ExprContext ctx);
}