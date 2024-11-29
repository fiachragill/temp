// Generated from src/CAL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CALParser}.
 */
public interface CALListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CALParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CALParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CALParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl(CALParser.Function_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#function_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl(CALParser.Function_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#main_block}.
	 * @param ctx the parse tree
	 */
	void enterMain_block(CALParser.Main_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#main_block}.
	 * @param ctx the parse tree
	 */
	void exitMain_block(CALParser.Main_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CALParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CALParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(CALParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(CALParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CALParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CALParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(CALParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(CALParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CALParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CALParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(CALParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(CALParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CALParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CALParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CALParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CALParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(CALParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(CALParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(CALParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(CALParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CALParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CALParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(CALParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(CALParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(CALParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(CALParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#func_call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_stmt(CALParser.Func_call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#func_call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_stmt(CALParser.Func_call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(CALParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(CALParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(CALParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(CALParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CALParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CALParser.ExprContext ctx);
}