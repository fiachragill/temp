// Generated from src/CAL.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, RETURN=7, MAIN=8, VARIABLE=9, 
		IS=10, BEGIN=11, END=12, INTEGER=13, VOID=14, WHILE=15, IF=16, ELSE=17, 
		ASSIGN=18, COLON=19, SEMICOLON=20, COMMA=21, LPAREN=22, RPAREN=23, PLUS=24, 
		MINUS=25, MUL=26, DIV=27, ID=28, NUMBER=29, Comment=30, CommentLine=31, 
		WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "A", "B", "C", "D", "E", 
		"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
		"T", "U", "V", "W", "X", "Y", "Z", "RETURN", "MAIN", "VARIABLE", "IS", 
		"BEGIN", "END", "INTEGER", "VOID", "WHILE", "IF", "ELSE", "ASSIGN", "COLON", 
		"SEMICOLON", "COMMA", "LPAREN", "RPAREN", "PLUS", "MINUS", "MUL", "DIV", 
		"ID", "NUMBER", "Comment", "CommentLine", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'>'", "'<'", "'>='", "'<='", "'='", "'!='", null, null, null, null, 
		null, null, null, null, null, null, null, "':='", "':'", "';'", "','", 
		"'('", "')'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "RETURN", "MAIN", "VARIABLE", 
		"IS", "BEGIN", "END", "INTEGER", "VOID", "WHILE", "IF", "ELSE", "ASSIGN", 
		"COLON", "SEMICOLON", "COMMA", "LPAREN", "RPAREN", "PLUS", "MINUS", "MUL", 
		"DIV", "ID", "NUMBER", "Comment", "CommentLine", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\7\67\u010f\n\67\f\67\16\67\u0112\13\67\38\6"+
		"8\u0115\n8\r8\168\u0116\39\39\39\39\39\79\u011e\n9\f9\169\u0121\139\3"+
		"9\39\39\39\39\3:\3:\3:\3:\7:\u012c\n:\f:\16:\u012f\13:\3:\3:\3;\6;\u0134"+
		"\n;\r;\16;\u0135\3;\3;\3\u011f\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65"+
		"\2\67\29\2;\2=\2?\2A\2C\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25"+
		"]\26_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"\3\2!\4\2CCcc\4\2DDdd\4"+
		"\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMm"+
		"m\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2"+
		"VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\5\2C\\aac|\6\2\62;C\\aac"+
		"|\3\2\62;\4\2,,\61\61\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0124\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2C\3"+
		"\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2"+
		"\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2"+
		"]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3"+
		"\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2"+
		"\2\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t~\3\2\2\2\13\u0081\3\2\2\2\r\u0083"+
		"\3\2\2\2\17\u0086\3\2\2\2\21\u0088\3\2\2\2\23\u008a\3\2\2\2\25\u008c\3"+
		"\2\2\2\27\u008e\3\2\2\2\31\u0090\3\2\2\2\33\u0092\3\2\2\2\35\u0094\3\2"+
		"\2\2\37\u0096\3\2\2\2!\u0098\3\2\2\2#\u009a\3\2\2\2%\u009c\3\2\2\2\'\u009e"+
		"\3\2\2\2)\u00a0\3\2\2\2+\u00a2\3\2\2\2-\u00a4\3\2\2\2/\u00a6\3\2\2\2\61"+
		"\u00a8\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac\3\2\2\2\67\u00ae\3\2\2\29\u00b0"+
		"\3\2\2\2;\u00b2\3\2\2\2=\u00b4\3\2\2\2?\u00b6\3\2\2\2A\u00b8\3\2\2\2C"+
		"\u00ba\3\2\2\2E\u00c1\3\2\2\2G\u00c6\3\2\2\2I\u00cf\3\2\2\2K\u00d2\3\2"+
		"\2\2M\u00d8\3\2\2\2O\u00dc\3\2\2\2Q\u00e4\3\2\2\2S\u00e9\3\2\2\2U\u00ef"+
		"\3\2\2\2W\u00f2\3\2\2\2Y\u00f7\3\2\2\2[\u00fa\3\2\2\2]\u00fc\3\2\2\2_"+
		"\u00fe\3\2\2\2a\u0100\3\2\2\2c\u0102\3\2\2\2e\u0104\3\2\2\2g\u0106\3\2"+
		"\2\2i\u0108\3\2\2\2k\u010a\3\2\2\2m\u010c\3\2\2\2o\u0114\3\2\2\2q\u0118"+
		"\3\2\2\2s\u0127\3\2\2\2u\u0133\3\2\2\2wx\7@\2\2x\4\3\2\2\2yz\7>\2\2z\6"+
		"\3\2\2\2{|\7@\2\2|}\7?\2\2}\b\3\2\2\2~\177\7>\2\2\177\u0080\7?\2\2\u0080"+
		"\n\3\2\2\2\u0081\u0082\7?\2\2\u0082\f\3\2\2\2\u0083\u0084\7#\2\2\u0084"+
		"\u0085\7?\2\2\u0085\16\3\2\2\2\u0086\u0087\t\2\2\2\u0087\20\3\2\2\2\u0088"+
		"\u0089\t\3\2\2\u0089\22\3\2\2\2\u008a\u008b\t\4\2\2\u008b\24\3\2\2\2\u008c"+
		"\u008d\t\5\2\2\u008d\26\3\2\2\2\u008e\u008f\t\6\2\2\u008f\30\3\2\2\2\u0090"+
		"\u0091\t\7\2\2\u0091\32\3\2\2\2\u0092\u0093\t\b\2\2\u0093\34\3\2\2\2\u0094"+
		"\u0095\t\t\2\2\u0095\36\3\2\2\2\u0096\u0097\t\n\2\2\u0097 \3\2\2\2\u0098"+
		"\u0099\t\13\2\2\u0099\"\3\2\2\2\u009a\u009b\t\f\2\2\u009b$\3\2\2\2\u009c"+
		"\u009d\t\r\2\2\u009d&\3\2\2\2\u009e\u009f\t\16\2\2\u009f(\3\2\2\2\u00a0"+
		"\u00a1\t\17\2\2\u00a1*\3\2\2\2\u00a2\u00a3\t\20\2\2\u00a3,\3\2\2\2\u00a4"+
		"\u00a5\t\21\2\2\u00a5.\3\2\2\2\u00a6\u00a7\t\22\2\2\u00a7\60\3\2\2\2\u00a8"+
		"\u00a9\t\23\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\t\24\2\2\u00ab\64\3\2\2\2"+
		"\u00ac\u00ad\t\25\2\2\u00ad\66\3\2\2\2\u00ae\u00af\t\26\2\2\u00af8\3\2"+
		"\2\2\u00b0\u00b1\t\27\2\2\u00b1:\3\2\2\2\u00b2\u00b3\t\30\2\2\u00b3<\3"+
		"\2\2\2\u00b4\u00b5\t\31\2\2\u00b5>\3\2\2\2\u00b6\u00b7\t\32\2\2\u00b7"+
		"@\3\2\2\2\u00b8\u00b9\7|\2\2\u00b9B\3\2\2\2\u00ba\u00bb\5\61\31\2\u00bb"+
		"\u00bc\5\27\f\2\u00bc\u00bd\5\65\33\2\u00bd\u00be\5\67\34\2\u00be\u00bf"+
		"\5\61\31\2\u00bf\u00c0\5)\25\2\u00c0D\3\2\2\2\u00c1\u00c2\5\'\24\2\u00c2"+
		"\u00c3\5\17\b\2\u00c3\u00c4\5\37\20\2\u00c4\u00c5\5)\25\2\u00c5F\3\2\2"+
		"\2\u00c6\u00c7\59\35\2\u00c7\u00c8\5\17\b\2\u00c8\u00c9\5\61\31\2\u00c9"+
		"\u00ca\5\37\20\2\u00ca\u00cb\5\17\b\2\u00cb\u00cc\5\21\t\2\u00cc\u00cd"+
		"\5%\23\2\u00cd\u00ce\5\27\f\2\u00ceH\3\2\2\2\u00cf\u00d0\5\37\20\2\u00d0"+
		"\u00d1\5\63\32\2\u00d1J\3\2\2\2\u00d2\u00d3\5\21\t\2\u00d3\u00d4\5\27"+
		"\f\2\u00d4\u00d5\5\33\16\2\u00d5\u00d6\5\37\20\2\u00d6\u00d7\5)\25\2\u00d7"+
		"L\3\2\2\2\u00d8\u00d9\5\27\f\2\u00d9\u00da\5)\25\2\u00da\u00db\5\25\13"+
		"\2\u00dbN\3\2\2\2\u00dc\u00dd\5\37\20\2\u00dd\u00de\5)\25\2\u00de\u00df"+
		"\5\65\33\2\u00df\u00e0\5\27\f\2\u00e0\u00e1\5\33\16\2\u00e1\u00e2\5\27"+
		"\f\2\u00e2\u00e3\5\61\31\2\u00e3P\3\2\2\2\u00e4\u00e5\59\35\2\u00e5\u00e6"+
		"\5+\26\2\u00e6\u00e7\5\37\20\2\u00e7\u00e8\5\25\13\2\u00e8R\3\2\2\2\u00e9"+
		"\u00ea\5;\36\2\u00ea\u00eb\5\35\17\2\u00eb\u00ec\5\37\20\2\u00ec\u00ed"+
		"\5%\23\2\u00ed\u00ee\5\27\f\2\u00eeT\3\2\2\2\u00ef\u00f0\5\37\20\2\u00f0"+
		"\u00f1\5\31\r\2\u00f1V\3\2\2\2\u00f2\u00f3\5\27\f\2\u00f3\u00f4\5%\23"+
		"\2\u00f4\u00f5\5\63\32\2\u00f5\u00f6\5\27\f\2\u00f6X\3\2\2\2\u00f7\u00f8"+
		"\7<\2\2\u00f8\u00f9\7?\2\2\u00f9Z\3\2\2\2\u00fa\u00fb\7<\2\2\u00fb\\\3"+
		"\2\2\2\u00fc\u00fd\7=\2\2\u00fd^\3\2\2\2\u00fe\u00ff\7.\2\2\u00ff`\3\2"+
		"\2\2\u0100\u0101\7*\2\2\u0101b\3\2\2\2\u0102\u0103\7+\2\2\u0103d\3\2\2"+
		"\2\u0104\u0105\7-\2\2\u0105f\3\2\2\2\u0106\u0107\7/\2\2\u0107h\3\2\2\2"+
		"\u0108\u0109\7,\2\2\u0109j\3\2\2\2\u010a\u010b\7\61\2\2\u010bl\3\2\2\2"+
		"\u010c\u0110\t\33\2\2\u010d\u010f\t\34\2\2\u010e\u010d\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111n\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0115\t\35\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117p\3\2\2\2\u0118\u0119"+
		"\7\61\2\2\u0119\u011a\7,\2\2\u011a\u011f\3\2\2\2\u011b\u011e\5q9\2\u011c"+
		"\u011e\n\36\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7,\2\2\u0123\u0124\7\61\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\b9\2\2\u0126r\3\2\2\2\u0127\u0128\7\61\2\2\u0128\u0129"+
		"\7\61\2\2\u0129\u012d\3\2\2\2\u012a\u012c\n\37\2\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\b:\2\2\u0131t\3\2\2\2\u0132\u0134"+
		"\t \2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b;\2\2\u0138v\3\2\2\2\t"+
		"\2\u0110\u0116\u011d\u011f\u012d\u0135\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}