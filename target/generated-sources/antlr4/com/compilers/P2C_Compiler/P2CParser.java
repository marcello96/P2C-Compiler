// Generated from P2C.g4 by ANTLR 4.4
package com.compilers.P2C_Compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class P2CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, INT=2, DOUBLE=3, FLOAT=4, CHAR=5, BOOL=6, OF=7, ARRAY=8, UNDERLINE=9, 
		INT_NUMBER=10, DEC_NUMER=11, NUMBER=12, LETTER=13, COLON=14, LEFT_SQ_BRACKET=15, 
		RIGHT_SQ_BRACKET=16, LEFT_BRACKET=17, RIGHT_BRACKET=18, WHITESPACE=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'let'", "'int'", "'double'", "'float'", "'char'", "'bool'", 
		"'of'", "'array'", "'_'", "INT_NUMBER", "DEC_NUMER", "NUMBER", "LETTER", 
		"':'", "'['", "']'", "'('", "')'", "WHITESPACE"
	};
	public static final int
		RULE_varDeclaration = 0, RULE_text = 1, RULE_ident = 2, RULE_type = 3, 
		RULE_array = 4;
	public static final String[] ruleNames = {
		"varDeclaration", "text", "ident", "type", "array"
	};

	@Override
	public String getGrammarFileName() { return "P2C.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public P2CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VarDeclarationContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode COLON() { return getToken(P2CParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LET() { return getToken(P2CParser.LET, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); match(LET);
			setState(11); ident();
			setState(12); match(COLON);
			setState(14);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(13); array();
				}
			}

			setState(16); type();
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

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(P2CParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(P2CParser.LETTER, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(18); match(LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(21); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(P2CParser.NUMBER, i);
		}
		public TerminalNode LETTER() { return getToken(P2CParser.LETTER, 0); }
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public List<TerminalNode> UNDERLINE() { return getTokens(P2CParser.UNDERLINE); }
		public List<TerminalNode> NUMBER() { return getTokens(P2CParser.NUMBER); }
		public TerminalNode UNDERLINE(int i) {
			return getToken(P2CParser.UNDERLINE, i);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_la = _input.LA(1);
			if ( !(_la==UNDERLINE || _la==LETTER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNDERLINE) | (1L << NUMBER) | (1L << LETTER))) != 0)) {
				{
				setState(27);
				switch (_input.LA(1)) {
				case LETTER:
					{
					setState(24); text();
					}
					break;
				case NUMBER:
					{
					setState(25); match(NUMBER);
					}
					break;
				case UNDERLINE:
					{
					setState(26); match(UNDERLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(P2CParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(P2CParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(P2CParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(P2CParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(P2CParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(P2CParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(P2CParser.OF, 0); }
		public TerminalNode LEFT_SQ_BRACKET() { return getToken(P2CParser.LEFT_SQ_BRACKET, 0); }
		public TerminalNode RIGHT_SQ_BRACKET() { return getToken(P2CParser.RIGHT_SQ_BRACKET, 0); }
		public TerminalNode INT_NUMBER() { return getToken(P2CParser.INT_NUMBER, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof P2CListener ) ((P2CListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(ARRAY);
			setState(35); match(LEFT_SQ_BRACKET);
			setState(36); match(INT_NUMBER);
			setState(37); match(RIGHT_SQ_BRACKET);
			setState(38); match(OF);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\5\2\21\n\2\3\2\3\2\3\3\6\3"+
		"\26\n\3\r\3\16\3\27\3\4\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\4\4\2\13\13\17\17\3\2\4"+
		"\b*\2\f\3\2\2\2\4\25\3\2\2\2\6\31\3\2\2\2\b\"\3\2\2\2\n$\3\2\2\2\f\r\7"+
		"\3\2\2\r\16\5\6\4\2\16\20\7\20\2\2\17\21\5\n\6\2\20\17\3\2\2\2\20\21\3"+
		"\2\2\2\21\22\3\2\2\2\22\23\5\b\5\2\23\3\3\2\2\2\24\26\7\17\2\2\25\24\3"+
		"\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\37\t"+
		"\2\2\2\32\36\5\4\3\2\33\36\7\16\2\2\34\36\7\13\2\2\35\32\3\2\2\2\35\33"+
		"\3\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \7\3\2\2"+
		"\2!\37\3\2\2\2\"#\t\3\2\2#\t\3\2\2\2$%\7\n\2\2%&\7\21\2\2&\'\7\f\2\2\'"+
		"(\7\22\2\2()\7\t\2\2)\13\3\2\2\2\6\20\27\35\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}