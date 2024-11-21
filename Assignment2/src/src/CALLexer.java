// Generated from ./src/CAL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CALLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "Variable", "Constant", "Return", "IntType", "BoolType", "VoidType", 
		"Main", "If", "Else", "True", "False", "While", "Begin", "End", "Is", 
		"Skip", "Assign", "Plus", "Minus", "Neg", "Or", "And", "Equals", "NotEquals", 
		"Less", "LessOrEquals", "Greater", "GreaterOrEquals", "Comma", "Colon", 
		"Semicolon", "LBR", "RBR", "Number", "ID", "Comment", "CommentLine", "WS"
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


	public CALLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CAL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0185\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u00e5\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u00f4\n\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\5"+
		"?\u0152\n?\3?\3?\7?\u0156\n?\f?\16?\u0159\13?\3?\5?\u015c\n?\3@\3@\7@"+
		"\u0160\n@\f@\16@\u0163\13@\3A\3A\3A\3A\3A\7A\u016a\nA\fA\16A\u016d\13"+
		"A\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u0178\nB\fB\16B\u017b\13B\3B\3B\3C\6C"+
		"\u0180\nC\rC\16C\u0181\3C\3C\3\u016b\2D\3\3\5\4\7\2\t\2\13\2\r\2\17\2"+
		"\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2"+
		"\63\2\65\2\67\29\2;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23"+
		"Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'"+
		"\u0081(\u0083)\u0085*\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4"+
		"\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPp"+
		"p\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2"+
		"YYyy\4\2ZZzz\4\2[[{{\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\4\2,,\61"+
		"\61\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0174\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2"+
		"\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2"+
		"\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u0089\3\2\2\2\7\u008b\3\2\2\2\t\u008d"+
		"\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2\2\2\17\u0093\3\2\2\2\21\u0095\3"+
		"\2\2\2\23\u0097\3\2\2\2\25\u0099\3\2\2\2\27\u009b\3\2\2\2\31\u009d\3\2"+
		"\2\2\33\u009f\3\2\2\2\35\u00a1\3\2\2\2\37\u00a3\3\2\2\2!\u00a5\3\2\2\2"+
		"#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'\u00ab\3\2\2\2)\u00ad\3\2\2\2+\u00af\3"+
		"\2\2\2-\u00b1\3\2\2\2/\u00b3\3\2\2\2\61\u00b5\3\2\2\2\63\u00b7\3\2\2\2"+
		"\65\u00b9\3\2\2\2\67\u00bb\3\2\2\29\u00bd\3\2\2\2;\u00bf\3\2\2\2=\u00c8"+
		"\3\2\2\2?\u00d1\3\2\2\2A\u00e4\3\2\2\2C\u00f3\3\2\2\2E\u00f5\3\2\2\2G"+
		"\u00fa\3\2\2\2I\u00ff\3\2\2\2K\u0102\3\2\2\2M\u0107\3\2\2\2O\u010c\3\2"+
		"\2\2Q\u0112\3\2\2\2S\u0118\3\2\2\2U\u011e\3\2\2\2W\u0122\3\2\2\2Y\u0125"+
		"\3\2\2\2[\u012a\3\2\2\2]\u012d\3\2\2\2_\u012f\3\2\2\2a\u0131\3\2\2\2c"+
		"\u0133\3\2\2\2e\u0135\3\2\2\2g\u0137\3\2\2\2i\u0139\3\2\2\2k\u013c\3\2"+
		"\2\2m\u013e\3\2\2\2o\u0141\3\2\2\2q\u0143\3\2\2\2s\u0146\3\2\2\2u\u0148"+
		"\3\2\2\2w\u014a\3\2\2\2y\u014c\3\2\2\2{\u014e\3\2\2\2}\u015b\3\2\2\2\177"+
		"\u015d\3\2\2\2\u0081\u0164\3\2\2\2\u0083\u0173\3\2\2\2\u0085\u017f\3\2"+
		"\2\2\u0087\u0088\7,\2\2\u0088\4\3\2\2\2\u0089\u008a\7\'\2\2\u008a\6\3"+
		"\2\2\2\u008b\u008c\t\2\2\2\u008c\b\3\2\2\2\u008d\u008e\t\3\2\2\u008e\n"+
		"\3\2\2\2\u008f\u0090\t\4\2\2\u0090\f\3\2\2\2\u0091\u0092\t\5\2\2\u0092"+
		"\16\3\2\2\2\u0093\u0094\t\6\2\2\u0094\20\3\2\2\2\u0095\u0096\t\7\2\2\u0096"+
		"\22\3\2\2\2\u0097\u0098\t\b\2\2\u0098\24\3\2\2\2\u0099\u009a\t\t\2\2\u009a"+
		"\26\3\2\2\2\u009b\u009c\t\n\2\2\u009c\30\3\2\2\2\u009d\u009e\t\13\2\2"+
		"\u009e\32\3\2\2\2\u009f\u00a0\t\f\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\t\r"+
		"\2\2\u00a2\36\3\2\2\2\u00a3\u00a4\t\16\2\2\u00a4 \3\2\2\2\u00a5\u00a6"+
		"\t\17\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\t\20\2\2\u00a8$\3\2\2\2\u00a9\u00aa"+
		"\t\21\2\2\u00aa&\3\2\2\2\u00ab\u00ac\t\22\2\2\u00ac(\3\2\2\2\u00ad\u00ae"+
		"\t\23\2\2\u00ae*\3\2\2\2\u00af\u00b0\t\24\2\2\u00b0,\3\2\2\2\u00b1\u00b2"+
		"\t\25\2\2\u00b2.\3\2\2\2\u00b3\u00b4\t\26\2\2\u00b4\60\3\2\2\2\u00b5\u00b6"+
		"\t\27\2\2\u00b6\62\3\2\2\2\u00b7\u00b8\t\30\2\2\u00b8\64\3\2\2\2\u00b9"+
		"\u00ba\t\31\2\2\u00ba\66\3\2\2\2\u00bb\u00bc\t\32\2\2\u00bc8\3\2\2\2\u00bd"+
		"\u00be\7|\2\2\u00be:\3\2\2\2\u00bf\u00c0\5\61\31\2\u00c0\u00c1\5\7\4\2"+
		"\u00c1\u00c2\5)\25\2\u00c2\u00c3\5\27\f\2\u00c3\u00c4\5\7\4\2\u00c4\u00c5"+
		"\5\t\5\2\u00c5\u00c6\5\35\17\2\u00c6\u00c7\5\17\b\2\u00c7<\3\2\2\2\u00c8"+
		"\u00c9\5\13\6\2\u00c9\u00ca\5#\22\2\u00ca\u00cb\5!\21\2\u00cb\u00cc\5"+
		"+\26\2\u00cc\u00cd\5-\27\2\u00cd\u00ce\5\7\4\2\u00ce\u00cf\5!\21\2\u00cf"+
		"\u00d0\5-\27\2\u00d0>\3\2\2\2\u00d1\u00d2\5)\25\2\u00d2\u00d3\5\17\b\2"+
		"\u00d3\u00d4\5-\27\2\u00d4\u00d5\5/\30\2\u00d5\u00d6\5)\25\2\u00d6\u00d7"+
		"\5!\21\2\u00d7@\3\2\2\2\u00d8\u00d9\5\27\f\2\u00d9\u00da\5!\21\2\u00da"+
		"\u00db\5-\27\2\u00db\u00e5\3\2\2\2\u00dc\u00dd\5\27\f\2\u00dd\u00de\5"+
		"!\21\2\u00de\u00df\5-\27\2\u00df\u00e0\5\17\b\2\u00e0\u00e1\5\23\n\2\u00e1"+
		"\u00e2\5\17\b\2\u00e2\u00e3\5)\25\2\u00e3\u00e5\3\2\2\2\u00e4\u00d8\3"+
		"\2\2\2\u00e4\u00dc\3\2\2\2\u00e5B\3\2\2\2\u00e6\u00e7\5\t\5\2\u00e7\u00e8"+
		"\5#\22\2\u00e8\u00e9\5#\22\2\u00e9\u00ea\5\35\17\2\u00ea\u00f4\3\2\2\2"+
		"\u00eb\u00ec\5\t\5\2\u00ec\u00ed\5#\22\2\u00ed\u00ee\5#\22\2\u00ee\u00ef"+
		"\5\35\17\2\u00ef\u00f0\5\17\b\2\u00f0\u00f1\5\7\4\2\u00f1\u00f2\5!\21"+
		"\2\u00f2\u00f4\3\2\2\2\u00f3\u00e6\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f4D"+
		"\3\2\2\2\u00f5\u00f6\5\61\31\2\u00f6\u00f7\5#\22\2\u00f7\u00f8\5\27\f"+
		"\2\u00f8\u00f9\5\r\7\2\u00f9F\3\2\2\2\u00fa\u00fb\5\37\20\2\u00fb\u00fc"+
		"\5\7\4\2\u00fc\u00fd\5\27\f\2\u00fd\u00fe\5!\21\2\u00feH\3\2\2\2\u00ff"+
		"\u0100\5\27\f\2\u0100\u0101\5\21\t\2\u0101J\3\2\2\2\u0102\u0103\5\17\b"+
		"\2\u0103\u0104\5\35\17\2\u0104\u0105\5+\26\2\u0105\u0106\5\17\b\2\u0106"+
		"L\3\2\2\2\u0107\u0108\5-\27\2\u0108\u0109\5)\25\2\u0109\u010a\5/\30\2"+
		"\u010a\u010b\5\17\b\2\u010bN\3\2\2\2\u010c\u010d\5\21\t\2\u010d\u010e"+
		"\5\7\4\2\u010e\u010f\5\35\17\2\u010f\u0110\5+\26\2\u0110\u0111\5\17\b"+
		"\2\u0111P\3\2\2\2\u0112\u0113\5\63\32\2\u0113\u0114\5\25\13\2\u0114\u0115"+
		"\5\27\f\2\u0115\u0116\5\35\17\2\u0116\u0117\5\17\b\2\u0117R\3\2\2\2\u0118"+
		"\u0119\5\t\5\2\u0119\u011a\5\17\b\2\u011a\u011b\5\23\n\2\u011b\u011c\5"+
		"\27\f\2\u011c\u011d\5!\21\2\u011dT\3\2\2\2\u011e\u011f\5\17\b\2\u011f"+
		"\u0120\5!\21\2\u0120\u0121\5\r\7\2\u0121V\3\2\2\2\u0122\u0123\5\27\f\2"+
		"\u0123\u0124\5+\26\2\u0124X\3\2\2\2\u0125\u0126\5+\26\2\u0126\u0127\5"+
		"\33\16\2\u0127\u0128\5\27\f\2\u0128\u0129\5%\23\2\u0129Z\3\2\2\2\u012a"+
		"\u012b\7<\2\2\u012b\u012c\7?\2\2\u012c\\\3\2\2\2\u012d\u012e\7-\2\2\u012e"+
		"^\3\2\2\2\u012f\u0130\7/\2\2\u0130`\3\2\2\2\u0131\u0132\7\u0080\2\2\u0132"+
		"b\3\2\2\2\u0133\u0134\7~\2\2\u0134d\3\2\2\2\u0135\u0136\7(\2\2\u0136f"+
		"\3\2\2\2\u0137\u0138\7?\2\2\u0138h\3\2\2\2\u0139\u013a\7#\2\2\u013a\u013b"+
		"\7?\2\2\u013bj\3\2\2\2\u013c\u013d\7>\2\2\u013dl\3\2\2\2\u013e\u013f\7"+
		">\2\2\u013f\u0140\7?\2\2\u0140n\3\2\2\2\u0141\u0142\7@\2\2\u0142p\3\2"+
		"\2\2\u0143\u0144\7@\2\2\u0144\u0145\7?\2\2\u0145r\3\2\2\2\u0146\u0147"+
		"\7.\2\2\u0147t\3\2\2\2\u0148\u0149\7<\2\2\u0149v\3\2\2\2\u014a\u014b\7"+
		"=\2\2\u014bx\3\2\2\2\u014c\u014d\7*\2\2\u014dz\3\2\2\2\u014e\u014f\7+"+
		"\2\2\u014f|\3\2\2\2\u0150\u0152\7/\2\2\u0151\u0150\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0157\t\33\2\2\u0154\u0156\t\34\2\2"+
		"\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158\u015c\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\7\62\2\2"+
		"\u015b\u0151\3\2\2\2\u015b\u015a\3\2\2\2\u015c~\3\2\2\2\u015d\u0161\t"+
		"\35\2\2\u015e\u0160\t\36\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0080\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0164\u0165\7\61\2\2\u0165\u0166\7,\2\2\u0166\u016b\3\2\2\2\u0167"+
		"\u016a\5\u0081A\2\u0168\u016a\n\37\2\2\u0169\u0167\3\2\2\2\u0169\u0168"+
		"\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7,\2\2\u016f\u0170\7\61"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0172\bA\2\2\u0172\u0082\3\2\2\2\u0173"+
		"\u0174\7\61\2\2\u0174\u0175\7\61\2\2\u0175\u0179\3\2\2\2\u0176\u0178\n"+
		" \2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\bB"+
		"\2\2\u017d\u0084\3\2\2\2\u017e\u0180\t!\2\2\u017f\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\bC\2\2\u0184\u0086\3\2\2\2\r\2\u00e4\u00f3\u0151\u0157"+
		"\u015b\u0161\u0169\u016b\u0179\u0181\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}