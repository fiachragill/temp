// Generated from ./src/CAL.g4 by ANTLR 4.7.1
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
	 * Enter a parse tree produced by {@link CALParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CALParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CALParser.DeclContext ctx);
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
	 * Enter a parse tree produced by {@link CALParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl(CALParser.Const_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl(CALParser.Const_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_list(CALParser.Function_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_list(CALParser.Function_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CALParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CALParser.FunctionContext ctx);
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
	 * Enter a parse tree produced by {@link CALParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(CALParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(CALParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_parameter_list(CALParser.Nemp_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_parameter_list(CALParser.Nemp_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CALParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CALParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(CALParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(CALParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CALParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CALParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CALParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CALParser.AssignContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link CALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_arith_op(CALParser.Binary_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_arith_op(CALParser.Binary_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CALParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterFrag(CALParser.FragContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitFrag(CALParser.FragContext ctx);
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
	 * Enter a parse tree produced by {@link CALParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(CALParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(CALParser.Comp_opContext ctx);
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
	 * Enter a parse tree produced by {@link CALParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_arg_list(CALParser.Nemp_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CALParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_arg_list(CALParser.Nemp_arg_listContext ctx);
}