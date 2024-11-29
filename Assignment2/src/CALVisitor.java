// Generated from src/CAL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CALParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CALVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CALParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CALParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl(CALParser.Function_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#main_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_block(CALParser.Main_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CALParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(CALParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CALParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_list(CALParser.Decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(CALParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(CALParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CALParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CALParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(CALParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(CALParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CALParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(CALParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(CALParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#func_call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call_stmt(CALParser.Func_call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(CALParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(CALParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CALParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CALParser.ExprContext ctx);
}