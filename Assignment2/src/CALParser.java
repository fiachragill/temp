// Generated from ./src/CAL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CALParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Variable=3, Constant=4, Return=5, IntType=6, BoolType=7, 
		VoidType=8, Main=9, If=10, Else=11, True=12, False=13, While=14, Begin=15, 
		End=16, Is=17, Skip=18, Assign=19, Plus=20, Minus=21, Neg=22, Or=23, And=24, 
		Equals=25, NotEquals=26, Less=27, LessOrEquals=28, Greater=29, GreaterOrEquals=30, 
		Comma=31, Colon=32, Semicolon=33, LBR=34, RBR=35, Number=36, ID=37, Comment=38, 
		CommentLine=39, WS=40;
	public static final int
		RULE_program = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_var_decl = 3, 
		RULE_const_decl = 4, RULE_function_list = 5, RULE_function = 6, RULE_type = 7, 
		RULE_parameter_list = 8, RULE_nemp_parameter_list = 9, RULE_main = 10, 
		RULE_statement_block = 11, RULE_statement = 12, RULE_assign = 13, RULE_expr = 14, 
		RULE_binary_arith_op = 15, RULE_frag = 16, RULE_condition = 17, RULE_comp_op = 18, 
		RULE_arg_list = 19, RULE_nemp_arg_list = 20;
	public static final String[] ruleNames = {
		"program", "decl_list", "decl", "var_decl", "const_decl", "function_list", 
		"function", "type", "parameter_list", "nemp_parameter_list", "main", "statement_block", 
		"statement", "assign", "expr", "binary_arith_op", "frag", "condition", 
		"comp_op", "arg_list", "nemp_arg_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'%'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "':='", "'+'", "'-'", "'~'", 
		"'|'", "'&'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "','", "':'", 
		"';'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Variable", "Constant", "Return", "IntType", "BoolType", 
		"VoidType", "Main", "If", "Else", "True", "False", "While", "Begin", "End", 
		"Is", "Skip", "Assign", "Plus", "Minus", "Neg", "Or", "And", "Equals", 
		"NotEquals", "Less", "LessOrEquals", "Greater", "GreaterOrEquals", "Comma", 
		"Colon", "Semicolon", "LBR", "RBR", "Number", "ID", "Comment", "CommentLine", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CAL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CALParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CALParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			decl_list();
			setState(43);
			function_list();
			setState(44);
			main();
			setState(45);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_listContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(CALParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(CALParser.Semicolon, i);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterDecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitDecl_list(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Variable || _la==Constant) {
				{
				{
				setState(47);
				decl();
				setState(48);
				match(Semicolon);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				var_decl();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				const_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(CALParser.Variable, 0); }
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode Colon() { return getToken(CALParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(Variable);
			setState(60);
			match(ID);
			setState(61);
			match(Colon);
			setState(62);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(CALParser.Constant, 0); }
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode Colon() { return getToken(CALParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CALParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterConst_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitConst_decl(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Constant);
			setState(65);
			match(ID);
			setState(66);
			match(Colon);
			setState(67);
			type();
			setState(68);
			match(Assign);
			setState(69);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_listContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFunction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFunction_list(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << BoolType) | (1L << VoidType))) != 0)) {
				{
				{
				setState(71);
				function();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public List<TerminalNode> LBR() { return getTokens(CALParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(CALParser.LBR, i);
		}
		public List<TerminalNode> RBR() { return getTokens(CALParser.RBR); }
		public TerminalNode RBR(int i) {
			return getToken(CALParser.RBR, i);
		}
		public TerminalNode Is() { return getToken(CALParser.Is, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public TerminalNode Begin() { return getToken(CALParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode Return() { return getToken(CALParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(CALParser.Semicolon, 0); }
		public TerminalNode End() { return getToken(CALParser.End, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			type();
			setState(78);
			match(ID);
			setState(79);
			match(LBR);
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(80);
				parameter_list();
				}
				break;
			}
			setState(83);
			match(RBR);
			setState(84);
			match(Is);
			setState(85);
			decl_list();
			setState(86);
			match(Begin);
			setState(87);
			statement_block();
			setState(88);
			match(Return);
			setState(89);
			match(LBR);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << True) | (1L << False) | (1L << Minus) | (1L << LBR) | (1L << Number) | (1L << ID))) != 0)) {
				{
				setState(90);
				expr(0);
				}
			}

			setState(93);
			match(RBR);
			setState(94);
			match(Semicolon);
			setState(95);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IntType() { return getToken(CALParser.IntType, 0); }
		public TerminalNode BoolType() { return getToken(CALParser.BoolType, 0); }
		public TerminalNode VoidType() { return getToken(CALParser.VoidType, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << BoolType) | (1L << VoidType))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(99);
				nemp_parameter_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nemp_parameter_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CALParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CALParser.ID, i);
		}
		public List<TerminalNode> Colon() { return getTokens(CALParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(CALParser.Colon, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CALParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CALParser.Comma, i);
		}
		public Nemp_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterNemp_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitNemp_parameter_list(this);
		}
	}

	public final Nemp_parameter_listContext nemp_parameter_list() throws RecognitionException {
		Nemp_parameter_listContext _localctx = new Nemp_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(Colon);
			setState(104);
			type();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(105);
				match(Comma);
				setState(106);
				match(ID);
				setState(107);
				match(Colon);
				setState(108);
				type();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(CALParser.Main, 0); }
		public TerminalNode Begin() { return getToken(CALParser.Begin, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(CALParser.End, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Main);
			setState(115);
			match(Begin);
			setState(116);
			decl_list();
			setState(117);
			statement_block();
			setState(118);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_blockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitStatement_block(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					statement();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode LBR() { return getToken(CALParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(CALParser.RBR, 0); }
		public TerminalNode Semicolon() { return getToken(CALParser.Semicolon, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public List<TerminalNode> Begin() { return getTokens(CALParser.Begin); }
		public TerminalNode Begin(int i) {
			return getToken(CALParser.Begin, i);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public List<TerminalNode> End() { return getTokens(CALParser.End); }
		public TerminalNode End(int i) {
			return getToken(CALParser.End, i);
		}
		public TerminalNode If() { return getToken(CALParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Else() { return getToken(CALParser.Else, 0); }
		public TerminalNode While() { return getToken(CALParser.While, 0); }
		public TerminalNode Return() { return getToken(CALParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Skip() { return getToken(CALParser.Skip, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ID);
				setState(128);
				match(LBR);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(129);
					arg_list();
					}
					break;
				}
				setState(132);
				match(RBR);
				setState(133);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(Begin);
				setState(135);
				statement_block();
				setState(136);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(If);
				setState(139);
				condition(0);
				setState(140);
				match(Begin);
				setState(141);
				statement_block();
				setState(142);
				match(End);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Else) {
					{
					setState(143);
					match(Else);
					setState(144);
					match(Begin);
					setState(145);
					statement_block();
					setState(146);
					match(End);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(While);
				setState(151);
				condition(0);
				setState(152);
				match(Begin);
				setState(153);
				statement_block();
				setState(154);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				match(Return);
				setState(157);
				match(LBR);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << True) | (1L << False) | (1L << Minus) | (1L << LBR) | (1L << Number) | (1L << ID))) != 0)) {
					{
					setState(158);
					expr(0);
					}
				}

				setState(161);
				match(RBR);
				setState(162);
				match(Semicolon);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				match(Skip);
				setState(164);
				match(Semicolon);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode Assign() { return getToken(CALParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(CALParser.Semicolon, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(Assign);
			setState(169);
			expr(0);
			setState(170);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LBR() { return getToken(CALParser.LBR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBR() { return getToken(CALParser.RBR, 0); }
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public FragContext frag() {
			return getRuleContext(FragContext.class,0);
		}
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(173);
				match(LBR);
				setState(174);
				expr(0);
				setState(175);
				match(RBR);
				}
				break;
			case 2:
				{
				setState(177);
				match(ID);
				setState(178);
				match(LBR);
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(179);
					arg_list();
					}
					break;
				}
				setState(182);
				match(RBR);
				}
				break;
			case 3:
				{
				setState(183);
				frag();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(186);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(187);
					binary_arith_op();
					setState(188);
					expr(5);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Binary_arith_opContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(CALParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CALParser.Minus, 0); }
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterBinary_arith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitBinary_arith_op(this);
		}
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binary_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Plus) | (1L << Minus))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FragContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CALParser.ID, 0); }
		public TerminalNode Minus() { return getToken(CALParser.Minus, 0); }
		public TerminalNode Number() { return getToken(CALParser.Number, 0); }
		public TerminalNode True() { return getToken(CALParser.True, 0); }
		public TerminalNode False() { return getToken(CALParser.False, 0); }
		public TerminalNode LBR() { return getToken(CALParser.LBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBR() { return getToken(CALParser.RBR, 0); }
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterFrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitFrag(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_frag);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(ID);
				}
				break;
			case Minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(Minus);
				setState(199);
				match(ID);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(Number);
				}
				break;
			case True:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(False);
				}
				break;
			case LBR:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(LBR);
				setState(204);
				expr(0);
				setState(205);
				match(RBR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode Neg() { return getToken(CALParser.Neg, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LBR() { return getToken(CALParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(CALParser.RBR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode Or() { return getToken(CALParser.Or, 0); }
		public TerminalNode And() { return getToken(CALParser.And, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(210);
				match(Neg);
				setState(211);
				condition(4);
				}
				break;
			case 2:
				{
				setState(212);
				match(LBR);
				setState(213);
				condition(0);
				setState(214);
				match(RBR);
				}
				break;
			case 3:
				{
				setState(216);
				expr(0);
				setState(217);
				comp_op();
				setState(218);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(222);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(223);
					_la = _input.LA(1);
					if ( !(_la==Or || _la==And) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(224);
					condition(2);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(CALParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(CALParser.NotEquals, 0); }
		public TerminalNode Less() { return getToken(CALParser.Less, 0); }
		public TerminalNode LessOrEquals() { return getToken(CALParser.LessOrEquals, 0); }
		public TerminalNode Greater() { return getToken(CALParser.Greater, 0); }
		public TerminalNode GreaterOrEquals() { return getToken(CALParser.GreaterOrEquals, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << NotEquals) | (1L << Less) | (1L << LessOrEquals) | (1L << Greater) | (1L << GreaterOrEquals))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_listContext extends ParserRuleContext {
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << True) | (1L << False) | (1L << Minus) | (1L << LBR) | (1L << Number) | (1L << ID))) != 0)) {
				{
				setState(232);
				nemp_arg_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nemp_arg_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CALParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CALParser.Comma, i);
		}
		public Nemp_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).enterNemp_arg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CALListener ) ((CALListener)listener).exitNemp_arg_list(this);
		}
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nemp_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			expr(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(236);
				match(Comma);
				setState(237);
				expr(0);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 17:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7K\n\7\f\7\16\7N\13\7\3\b\3\b\3\b\3\b\5"+
		"\bT\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\5\ng\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13p\n\13\f\13\16"+
		"\13s\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\7\r|\n\r\f\r\16\r\177\13\r\3\16"+
		"\3\16\3\16\3\16\5\16\u0085\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0097\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a2\n\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00a8\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00b7\n\20\3\20\3\20\5\20\u00bb\n\20\3\20\3\20\3\20\3\20\7"+
		"\20\u00c1\n\20\f\20\16\20\u00c4\13\20\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00df\n\23\3\23\3\23\3\23\7\23\u00e4"+
		"\n\23\f\23\16\23\u00e7\13\23\3\24\3\24\3\25\5\25\u00ec\n\25\3\26\3\26"+
		"\3\26\7\26\u00f1\n\26\f\26\16\26\u00f4\13\26\3\26\2\4\36$\27\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\3\2\b\n\4\2\3\4\26\27\3\2\31"+
		"\32\3\2\33 \2\u00ff\2,\3\2\2\2\4\66\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nB\3"+
		"\2\2\2\fL\3\2\2\2\16O\3\2\2\2\20c\3\2\2\2\22f\3\2\2\2\24h\3\2\2\2\26t"+
		"\3\2\2\2\30}\3\2\2\2\32\u00a7\3\2\2\2\34\u00a9\3\2\2\2\36\u00ba\3\2\2"+
		"\2 \u00c5\3\2\2\2\"\u00d1\3\2\2\2$\u00de\3\2\2\2&\u00e8\3\2\2\2(\u00eb"+
		"\3\2\2\2*\u00ed\3\2\2\2,-\5\4\3\2-.\5\f\7\2./\5\26\f\2/\60\7\2\2\3\60"+
		"\3\3\2\2\2\61\62\5\6\4\2\62\63\7#\2\2\63\65\3\2\2\2\64\61\3\2\2\2\658"+
		"\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66\3\2\2\29<\5\b\5"+
		"\2:<\5\n\6\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>\7\5\2\2>?\7\'\2\2?@\7\""+
		"\2\2@A\5\20\t\2A\t\3\2\2\2BC\7\6\2\2CD\7\'\2\2DE\7\"\2\2EF\5\20\t\2FG"+
		"\7\25\2\2GH\5\36\20\2H\13\3\2\2\2IK\5\16\b\2JI\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2LM\3\2\2\2M\r\3\2\2\2NL\3\2\2\2OP\5\20\t\2PQ\7\'\2\2QS\7$\2\2RT\5"+
		"\22\n\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7%\2\2VW\7\23\2\2WX\5\4\3\2XY"+
		"\7\21\2\2YZ\5\30\r\2Z[\7\7\2\2[]\7$\2\2\\^\5\36\20\2]\\\3\2\2\2]^\3\2"+
		"\2\2^_\3\2\2\2_`\7%\2\2`a\7#\2\2ab\7\22\2\2b\17\3\2\2\2cd\t\2\2\2d\21"+
		"\3\2\2\2eg\5\24\13\2fe\3\2\2\2fg\3\2\2\2g\23\3\2\2\2hi\7\'\2\2ij\7\"\2"+
		"\2jq\5\20\t\2kl\7!\2\2lm\7\'\2\2mn\7\"\2\2np\5\20\t\2ok\3\2\2\2ps\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2r\25\3\2\2\2sq\3\2\2\2tu\7\13\2\2uv\7\21\2\2v"+
		"w\5\4\3\2wx\5\30\r\2xy\7\22\2\2y\27\3\2\2\2z|\5\32\16\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\31\3\2\2\2\177}\3\2\2\2\u0080\u00a8\5\34"+
		"\17\2\u0081\u0082\7\'\2\2\u0082\u0084\7$\2\2\u0083\u0085\5(\25\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7%"+
		"\2\2\u0087\u00a8\7#\2\2\u0088\u0089\7\21\2\2\u0089\u008a\5\30\r\2\u008a"+
		"\u008b\7\22\2\2\u008b\u00a8\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e\5"+
		"$\23\2\u008e\u008f\7\21\2\2\u008f\u0090\5\30\r\2\u0090\u0096\7\22\2\2"+
		"\u0091\u0092\7\r\2\2\u0092\u0093\7\21\2\2\u0093\u0094\5\30\r\2\u0094\u0095"+
		"\7\22\2\2\u0095\u0097\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u00a8\3\2\2\2\u0098\u0099\7\20\2\2\u0099\u009a\5$\23\2\u009a\u009b"+
		"\7\21\2\2\u009b\u009c\5\30\r\2\u009c\u009d\7\22\2\2\u009d\u00a8\3\2\2"+
		"\2\u009e\u009f\7\7\2\2\u009f\u00a1\7$\2\2\u00a0\u00a2\5\36\20\2\u00a1"+
		"\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7%"+
		"\2\2\u00a4\u00a8\7#\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a8\7#\2\2\u00a7"+
		"\u0080\3\2\2\2\u00a7\u0081\3\2\2\2\u00a7\u0088\3\2\2\2\u00a7\u008c\3\2"+
		"\2\2\u00a7\u0098\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\33\3\2\2\2\u00a9\u00aa\7\'\2\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\5\36"+
		"\20\2\u00ac\u00ad\7#\2\2\u00ad\35\3\2\2\2\u00ae\u00af\b\20\1\2\u00af\u00b0"+
		"\7$\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\7%\2\2\u00b2\u00bb\3\2\2\2\u00b3"+
		"\u00b4\7\'\2\2\u00b4\u00b6\7$\2\2\u00b5\u00b7\5(\25\2\u00b6\u00b5\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\7%\2\2\u00b9"+
		"\u00bb\5\"\22\2\u00ba\u00ae\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba\u00b9\3"+
		"\2\2\2\u00bb\u00c2\3\2\2\2\u00bc\u00bd\f\6\2\2\u00bd\u00be\5 \21\2\u00be"+
		"\u00bf\5\36\20\7\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\37\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\t\3\2\2\u00c6!\3\2\2\2\u00c7\u00d2\7\'\2\2"+
		"\u00c8\u00c9\7\27\2\2\u00c9\u00d2\7\'\2\2\u00ca\u00d2\7&\2\2\u00cb\u00d2"+
		"\7\16\2\2\u00cc\u00d2\7\17\2\2\u00cd\u00ce\7$\2\2\u00ce\u00cf\5\36\20"+
		"\2\u00cf\u00d0\7%\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d1\u00c8"+
		"\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d2#\3\2\2\2\u00d3\u00d4\b\23\1\2\u00d4\u00d5\7\30\2"+
		"\2\u00d5\u00df\5$\23\6\u00d6\u00d7\7$\2\2\u00d7\u00d8\5$\23\2\u00d8\u00d9"+
		"\7%\2\2\u00d9\u00df\3\2\2\2\u00da\u00db\5\36\20\2\u00db\u00dc\5&\24\2"+
		"\u00dc\u00dd\5\36\20\2\u00dd\u00df\3\2\2\2\u00de\u00d3\3\2\2\2\u00de\u00d6"+
		"\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u00e5\3\2\2\2\u00e0\u00e1\f\3\2\2\u00e1"+
		"\u00e2\t\4\2\2\u00e2\u00e4\5$\23\4\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6%\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00e9\t\5\2\2\u00e9\'\3\2\2\2\u00ea\u00ec\5*\26\2\u00eb"+
		"\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec)\3\2\2\2\u00ed\u00f2\5\36\20"+
		"\2\u00ee\u00ef\7!\2\2\u00ef\u00f1\5\36\20\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3+\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\26\66;LS]fq}\u0084\u0096\u00a1\u00a7\u00b6\u00ba"+
		"\u00c2\u00d1\u00de\u00e5\u00eb\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}