// Generated from Cora.g4 by ANTLR 4.5.2
 
	package parser.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoraParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrace(CoraParser.TraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#firstState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstState(CoraParser.FirstStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#gotoState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoState(CoraParser.GotoStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(CoraParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(CoraParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#systemStates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemStates(CoraParser.SystemStatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(CoraParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#clocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocks(CoraParser.ClocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#transactionGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionGuard(CoraParser.TransactionGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#synchronization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronization(CoraParser.SynchronizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignments(CoraParser.AssignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#systemState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemState(CoraParser.SystemStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CoraParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#clock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClock(CoraParser.ClockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clockLHSZeroMinusObject}
	 * labeled alternative in {@link CoraParser#clockLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockLHSZeroMinusObject(CoraParser.ClockLHSZeroMinusObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clockLHSObjectMinusZero}
	 * labeled alternative in {@link CoraParser#clockLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockLHSObjectMinusZero(CoraParser.ClockLHSObjectMinusZeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clockLHSObjectMinusObject}
	 * labeled alternative in {@link CoraParser#clockLHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockLHSObjectMinusObject(CoraParser.ClockLHSObjectMinusObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(CoraParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#syncExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyncExpr(CoraParser.SyncExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CoraParser.ExprContext ctx);
}