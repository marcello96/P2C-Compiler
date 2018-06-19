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
		T__0=1, INT=2, LONG=3, DOUBLE=4, FLOAT=5, CHAR=6, BOOL=7, STRING=8, NULL=9, 
		TRUE=10, FALSE=11, IF=12, ELSIF=13, ELSE=14, WHILE=15, DO=16, DONE=17, 
		FOR=18, FUN=19, RETURN=20, LET=21, OF=22, ARRAY=23, UNDERLINE=24, LEFT_SQ_BRACKET=25, 
		RIGHT_SQ_BRACKET=26, LEFT_BRACKET=27, RIGHT_BRACKET=28, ASSIGN=29, AND=30, 
		OR=31, RELATIONALEXPR=32, ADD_OPERATORS=33, MUL_OPERATORS=34, EXCLAMATION=35, 
		ARROW=36, COLON=37, COMMA=38, SEMICOLON=39, IDENT=40, FLOATING_CONSTANT=41, 
		INTEGER_CONSTANT=42, WHITESPACE=43, BLOCK_COMMENT=44, LINE_COMMENT=45;
	public static final String[] tokenNames = {
		"<INVALID>", "'-'", "'int'", "'long'", "'double'", "'float'", "'char'", 
		"'bool'", "'string'", "'null'", "'true'", "'false'", "'if'", "'elsif'", 
		"'else'", "'while'", "'do'", "'done'", "'for'", "'fun'", "'return'", "'let'", 
		"'of'", "'array'", "'_'", "'['", "']'", "'('", "')'", "'='", "'and'", 
		"'or'", "RELATIONALEXPR", "ADD_OPERATORS", "MUL_OPERATORS", "'!'", "'->'", 
		"':'", "','", "';'", "IDENT", "FLOATING_CONSTANT", "INTEGER_CONSTANT", 
		"WHITESPACE", "BLOCK_COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_start = 1, RULE_varDeclaration = 2, RULE_assignment = 3, 
		RULE_parameterGroup = 4, RULE_identifier = 5, RULE_type = 6, RULE_primitiveType = 7, 
		RULE_array = 8, RULE_constant = 9, RULE_ifDefinition = 10, RULE_loopDefinition = 11, 
		RULE_expression = 12, RULE_atom = 13, RULE_funDefinition = 14, RULE_parameterList = 15, 
		RULE_resultType = 16, RULE_funDesignator = 17, RULE_argumentList = 18, 
		RULE_blockElement = 19, RULE_returnStatement = 20, RULE_blockWithoutReturn = 21, 
		RULE_block = 22;
	public static final String[] ruleNames = {
		"program", "start", "varDeclaration", "assignment", "parameterGroup", 
		"identifier", "type", "primitiveType", "array", "constant", "ifDefinition", 
		"loopDefinition", "expression", "atom", "funDefinition", "parameterList", 
		"resultType", "funDesignator", "argumentList", "blockElement", "returnStatement", 
		"blockWithoutReturn", "block"
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode DONE() { return getToken(P2CParser.DONE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(P2CParser.SEMICOLON); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode DO() { return getToken(P2CParser.DO, 0); }
		public List<FunDefinitionContext> funDefinition() {
			return getRuleContexts(FunDefinitionContext.class);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(P2CParser.SEMICOLON, i);
		}
		public FunDefinitionContext funDefinition(int i) {
			return getRuleContext(FunDefinitionContext.class,i);
		}
		public BlockWithoutReturnContext blockWithoutReturn() {
			return getRuleContext(BlockWithoutReturnContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(59);
			switch (_input.LA(1)) {
			case EOF:
			case FUN:
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN || _la==LET) {
					{
					setState(50);
					switch (_input.LA(1)) {
					case LET:
						{
						setState(46); varDeclaration();
						setState(47); match(SEMICOLON);
						}
						break;
					case FUN:
						{
						setState(49); funDefinition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(DO);
				setState(56); blockWithoutReturn();
				setState(57); match(DONE);
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(P2CParser.SEMICOLON, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunDefinitionContext funDefinition() {
			return getRuleContext(FunDefinitionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfDefinitionContext ifDefinition() {
			return getRuleContext(IfDefinitionContext.class,0);
		}
		public LoopDefinitionContext loopDefinition() {
			return getRuleContext(LoopDefinitionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); varDeclaration();
				setState(62); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); expression(0);
				setState(65); match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); assignment();
				setState(68); match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); funDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71); loopDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72); ifDefinition();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(P2CParser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode LET() { return getToken(P2CParser.LET, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(LET);
			setState(76); parameterGroup();
			setState(79);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(77); match(ASSIGN);
				setState(78); constant();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(P2CParser.ASSIGN, 0); }
		public TerminalNode LEFT_SQ_BRACKET() { return getToken(P2CParser.LEFT_SQ_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTEGER_CONSTANT() { return getToken(P2CParser.INTEGER_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(P2CParser.IDENT, 0); }
		public TerminalNode RIGHT_SQ_BRACKET() { return getToken(P2CParser.RIGHT_SQ_BRACKET, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(IDENT);
			setState(85);
			_la = _input.LA(1);
			if (_la==LEFT_SQ_BRACKET) {
				{
				setState(82); match(LEFT_SQ_BRACKET);
				setState(83); match(INTEGER_CONSTANT);
				setState(84); match(RIGHT_SQ_BRACKET);
				}
			}

			setState(87); match(ASSIGN);
			setState(88); expression(0);
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(P2CParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); identifier();
			setState(91); match(COLON);
			setState(92); type();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(P2CParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(IDENT);
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
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(96); array();
				}
			}

			setState(99); primitiveType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(P2CParser.BOOL, 0); }
		public TerminalNode LONG() { return getToken(P2CParser.LONG, 0); }
		public TerminalNode STRING() { return getToken(P2CParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(P2CParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(P2CParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(P2CParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(P2CParser.FLOAT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LONG) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
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
		public TerminalNode INTEGER_CONSTANT() { return getToken(P2CParser.INTEGER_CONSTANT, 0); }
		public TerminalNode RIGHT_SQ_BRACKET() { return getToken(P2CParser.RIGHT_SQ_BRACKET, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(ARRAY);
			setState(104); match(LEFT_SQ_BRACKET);
			setState(105); match(INTEGER_CONSTANT);
			setState(106); match(RIGHT_SQ_BRACKET);
			setState(107); match(OF);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER_CONSTANT() { return getToken(P2CParser.INTEGER_CONSTANT, 0); }
		public TerminalNode FLOATING_CONSTANT() { return getToken(P2CParser.FLOATING_CONSTANT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		int _la;
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(109); match(T__0);
					}
				}

				setState(112); match(INTEGER_CONSTANT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(113); match(T__0);
					}
				}

				setState(116); match(FLOATING_CONSTANT);
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

	public static class IfDefinitionContext extends ParserRuleContext {
		public BlockWithoutReturnContext blockWithoutReturn(int i) {
			return getRuleContext(BlockWithoutReturnContext.class,i);
		}
		public TerminalNode ELSIF(int i) {
			return getToken(P2CParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(P2CParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(P2CParser.IF, 0); }
		public List<TerminalNode> ELSIF() { return getTokens(P2CParser.ELSIF); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(P2CParser.RIGHT_BRACKET, i);
		}
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(P2CParser.LEFT_BRACKET, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DONE() { return getTokens(P2CParser.DONE); }
		public List<TerminalNode> DO() { return getTokens(P2CParser.DO); }
		public TerminalNode DONE(int i) {
			return getToken(P2CParser.DONE, i);
		}
		public TerminalNode DO(int i) {
			return getToken(P2CParser.DO, i);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(P2CParser.LEFT_BRACKET); }
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(P2CParser.RIGHT_BRACKET); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<BlockWithoutReturnContext> blockWithoutReturn() {
			return getRuleContexts(BlockWithoutReturnContext.class);
		}
		public IfDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitIfDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDefinitionContext ifDefinition() throws RecognitionException {
		IfDefinitionContext _localctx = new IfDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(IF);
			setState(120); match(LEFT_BRACKET);
			setState(121); expression(0);
			setState(122); match(RIGHT_BRACKET);
			setState(123); match(DO);
			setState(124); blockWithoutReturn();
			setState(125); match(DONE);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(126); match(ELSIF);
				setState(127); match(LEFT_BRACKET);
				setState(128); expression(0);
				setState(129); match(RIGHT_BRACKET);
				setState(130); match(DO);
				setState(131); blockWithoutReturn();
				setState(132); match(DONE);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(139); match(ELSE);
				setState(140); match(DO);
				setState(141); blockWithoutReturn();
				setState(142); match(DONE);
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

	public static class LoopDefinitionContext extends ParserRuleContext {
		public TerminalNode DONE() { return getToken(P2CParser.DONE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(P2CParser.SEMICOLON); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public TerminalNode DO() { return getToken(P2CParser.DO, 0); }
		public TerminalNode FOR() { return getToken(P2CParser.FOR, 0); }
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(P2CParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(P2CParser.RIGHT_BRACKET, 0); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(P2CParser.SEMICOLON, i);
		}
		public TerminalNode WHILE() { return getToken(P2CParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockWithoutReturnContext blockWithoutReturn() {
			return getRuleContext(BlockWithoutReturnContext.class,0);
		}
		public LoopDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitLoopDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopDefinitionContext loopDefinition() throws RecognitionException {
		LoopDefinitionContext _localctx = new LoopDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loopDefinition);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); match(WHILE);
				setState(147); match(LEFT_BRACKET);
				setState(148); expression(0);
				setState(149); match(RIGHT_BRACKET);
				setState(150); match(DO);
				setState(151); blockWithoutReturn();
				setState(152); match(DONE);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); match(FOR);
				setState(155); match(LEFT_BRACKET);
				setState(156); assignment();
				setState(157); match(SEMICOLON);
				setState(158); expression(0);
				setState(159); match(SEMICOLON);
				setState(160); assignment();
				setState(161); match(RIGHT_BRACKET);
				setState(162); match(DO);
				setState(163); blockWithoutReturn();
				setState(164); match(DONE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode RELATIONALEXPR() { return getToken(P2CParser.RELATIONALEXPR, 0); }
		public TerminalNode EXCLAMATION() { return getToken(P2CParser.EXCLAMATION, 0); }
		public TerminalNode ADD_OPERATORS() { return getToken(P2CParser.ADD_OPERATORS, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(P2CParser.AND, 0); }
		public TerminalNode OR() { return getToken(P2CParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode MUL_OPERATORS() { return getToken(P2CParser.MUL_OPERATORS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				{
				setState(169); match(EXCLAMATION);
				setState(170); expression(7);
				}
				break;
			case T__0:
			case NULL:
			case TRUE:
			case FALSE:
			case LEFT_BRACKET:
			case IDENT:
			case FLOATING_CONSTANT:
			case INTEGER_CONSTANT:
				{
				setState(171); atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(175); match(MUL_OPERATORS);
						setState(176); expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(178); match(ADD_OPERATORS);
						setState(179); expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(181); match(RELATIONALEXPR);
						setState(182); expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184); match(AND);
						setState(185); expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187); match(OR);
						setState(188); expression(3);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public FunDesignatorContext funDesignator() {
			return getRuleContext(FunDesignatorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode NULL() { return getToken(P2CParser.NULL, 0); }
		public TerminalNode FALSE() { return getToken(P2CParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(P2CParser.TRUE, 0); }
		public TerminalNode LEFT_SQ_BRACKET() { return getToken(P2CParser.LEFT_SQ_BRACKET, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(P2CParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(P2CParser.RIGHT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INTEGER_CONSTANT() { return getToken(P2CParser.INTEGER_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(P2CParser.IDENT, 0); }
		public TerminalNode RIGHT_SQ_BRACKET() { return getToken(P2CParser.RIGHT_SQ_BRACKET, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atom);
		int _la;
		try {
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); match(LEFT_BRACKET);
				setState(195); expression(0);
				setState(196); match(RIGHT_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199); funDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201); match(IDENT);
				setState(205);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(202); match(LEFT_SQ_BRACKET);
					setState(203); match(INTEGER_CONSTANT);
					setState(204); match(RIGHT_SQ_BRACKET);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207); match(NULL);
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

	public static class FunDefinitionContext extends ParserRuleContext {
		public TerminalNode DONE() { return getToken(P2CParser.DONE, 0); }
		public TerminalNode DO() { return getToken(P2CParser.DO, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(P2CParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(P2CParser.RIGHT_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FUN() { return getToken(P2CParser.FUN, 0); }
		public TerminalNode ARROW() { return getToken(P2CParser.ARROW, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public FunDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitFunDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDefinitionContext funDefinition() throws RecognitionException {
		FunDefinitionContext _localctx = new FunDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(FUN);
			setState(211); identifier();
			setState(212); match(LEFT_BRACKET);
			setState(214);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(213); parameterList();
				}
			}

			setState(216); match(RIGHT_BRACKET);
			setState(219);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(217); match(ARROW);
				setState(218); resultType();
				}
			}

			setState(221); match(DO);
			setState(222); block();
			setState(223); match(DONE);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup(int i) {
			return getRuleContext(ParameterGroupContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(P2CParser.COMMA); }
		public List<ParameterGroupContext> parameterGroup() {
			return getRuleContexts(ParameterGroupContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(P2CParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); parameterGroup();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226); match(COMMA);
				setState(227); parameterGroup();
				}
				}
				setState(232);
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); type();
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

	public static class FunDesignatorContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(P2CParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(P2CParser.RIGHT_BRACKET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDesignator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitFunDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDesignatorContext funDesignator() throws RecognitionException {
		FunDesignatorContext _localctx = new FunDesignatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funDesignator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); identifier();
			setState(236); match(LEFT_BRACKET);
			setState(238);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << LEFT_BRACKET) | (1L << EXCLAMATION) | (1L << IDENT) | (1L << FLOATING_CONSTANT) | (1L << INTEGER_CONSTANT))) != 0)) {
				{
				setState(237); argumentList();
				}
			}

			setState(240); match(RIGHT_BRACKET);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(P2CParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(P2CParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); expression(0);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(243); match(COMMA);
				setState(244); expression(0);
				}
				}
				setState(249);
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

	public static class BlockElementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(P2CParser.SEMICOLON, 0); }
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfDefinitionContext ifDefinition() {
			return getRuleContext(IfDefinitionContext.class,0);
		}
		public LoopDefinitionContext loopDefinition() {
			return getRuleContext(LoopDefinitionContext.class,0);
		}
		public BlockElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitBlockElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockElementContext blockElement() throws RecognitionException {
		BlockElementContext _localctx = new BlockElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockElement);
		try {
			setState(258);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); varDeclaration();
				setState(251); match(SEMICOLON);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); assignment();
				setState(254); match(SEMICOLON);
				}
				break;
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(256); loopDefinition();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(257); ifDefinition();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(P2CParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(P2CParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(RETURN);
			setState(261); expression(0);
			setState(262); match(SEMICOLON);
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

	public static class BlockWithoutReturnContext extends ParserRuleContext {
		public List<BlockElementContext> blockElement() {
			return getRuleContexts(BlockElementContext.class);
		}
		public BlockElementContext blockElement(int i) {
			return getRuleContext(BlockElementContext.class,i);
		}
		public BlockWithoutReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockWithoutReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitBlockWithoutReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockWithoutReturnContext blockWithoutReturn() throws RecognitionException {
		BlockWithoutReturnContext _localctx = new BlockWithoutReturnContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_blockWithoutReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << LET) | (1L << IDENT))) != 0)) {
				{
				{
				setState(264); blockElement();
				}
				}
				setState(269);
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockElementContext> blockElement() {
			return getRuleContexts(BlockElementContext.class);
		}
		public BlockElementContext blockElement(int i) {
			return getRuleContext(BlockElementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof P2CVisitor ) return ((P2CVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << LET) | (1L << IDENT))) != 0)) {
				{
				{
				setState(270); blockElement();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276); returnStatement();
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
		case 12: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		case 3: return precpred(_ctx, 3);
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\2\3\2\5\2>\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\5\4R\n\4"+
		"\3\5\3\5\3\5\3\5\5\5X\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\5\b"+
		"d\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13q\n\13\3\13\3\13"+
		"\5\13u\n\13\3\13\5\13x\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0093\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\16\3\16\5\16\u00af"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00c0\n\16\f\16\16\16\u00c3\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d0\n\17\3\17\5\17\u00d3\n"+
		"\17\3\20\3\20\3\20\3\20\5\20\u00d9\n\20\3\20\3\20\3\20\5\20\u00de\n\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00e7\n\21\f\21\16\21\u00ea\13"+
		"\21\3\22\3\22\3\23\3\23\3\23\5\23\u00f1\n\23\3\23\3\23\3\24\3\24\3\24"+
		"\7\24\u00f8\n\24\f\24\16\24\u00fb\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0105\n\25\3\26\3\26\3\26\3\26\3\27\7\27\u010c\n\27\f"+
		"\27\16\27\u010f\13\27\3\30\7\30\u0112\n\30\f\30\16\30\u0115\13\30\3\30"+
		"\3\30\3\30\2\3\32\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\4\3\2\4\n\3\2\f\r\u0128\2=\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bS\3\2\2\2\n"+
		"\\\3\2\2\2\f`\3\2\2\2\16c\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24w\3\2\2\2"+
		"\26y\3\2\2\2\30\u00a8\3\2\2\2\32\u00ae\3\2\2\2\34\u00d2\3\2\2\2\36\u00d4"+
		"\3\2\2\2 \u00e3\3\2\2\2\"\u00eb\3\2\2\2$\u00ed\3\2\2\2&\u00f4\3\2\2\2"+
		"(\u0104\3\2\2\2*\u0106\3\2\2\2,\u010d\3\2\2\2.\u0113\3\2\2\2\60\61\5\6"+
		"\4\2\61\62\7)\2\2\62\65\3\2\2\2\63\65\5\36\20\2\64\60\3\2\2\2\64\63\3"+
		"\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67>\3\2\2\28\66\3\2\2\2"+
		"9:\7\22\2\2:;\5,\27\2;<\7\23\2\2<>\3\2\2\2=\66\3\2\2\2=9\3\2\2\2>\3\3"+
		"\2\2\2?@\5\6\4\2@A\7)\2\2AL\3\2\2\2BC\5\32\16\2CD\7)\2\2DL\3\2\2\2EF\5"+
		"\b\5\2FG\7)\2\2GL\3\2\2\2HL\5\36\20\2IL\5\30\r\2JL\5\26\f\2K?\3\2\2\2"+
		"KB\3\2\2\2KE\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\7\27\2"+
		"\2NQ\5\n\6\2OP\7\37\2\2PR\5\24\13\2QO\3\2\2\2QR\3\2\2\2R\7\3\2\2\2SW\7"+
		"*\2\2TU\7\33\2\2UV\7,\2\2VX\7\34\2\2WT\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7"+
		"\37\2\2Z[\5\32\16\2[\t\3\2\2\2\\]\5\f\7\2]^\7\'\2\2^_\5\16\b\2_\13\3\2"+
		"\2\2`a\7*\2\2a\r\3\2\2\2bd\5\22\n\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\5"+
		"\20\t\2f\17\3\2\2\2gh\t\2\2\2h\21\3\2\2\2ij\7\31\2\2jk\7\33\2\2kl\7,\2"+
		"\2lm\7\34\2\2mn\7\30\2\2n\23\3\2\2\2oq\7\3\2\2po\3\2\2\2pq\3\2\2\2qr\3"+
		"\2\2\2rx\7,\2\2su\7\3\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\7+\2\2wp\3\2"+
		"\2\2wt\3\2\2\2x\25\3\2\2\2yz\7\16\2\2z{\7\35\2\2{|\5\32\16\2|}\7\36\2"+
		"\2}~\7\22\2\2~\177\5,\27\2\177\u008a\7\23\2\2\u0080\u0081\7\17\2\2\u0081"+
		"\u0082\7\35\2\2\u0082\u0083\5\32\16\2\u0083\u0084\7\36\2\2\u0084\u0085"+
		"\7\22\2\2\u0085\u0086\5,\27\2\u0086\u0087\7\23\2\2\u0087\u0089\3\2\2\2"+
		"\u0088\u0080\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0092\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\20\2\2"+
		"\u008e\u008f\7\22\2\2\u008f\u0090\5,\27\2\u0090\u0091\7\23\2\2\u0091\u0093"+
		"\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u0093\3\2\2\2\u0093\27\3\2\2\2\u0094"+
		"\u0095\7\21\2\2\u0095\u0096\7\35\2\2\u0096\u0097\5\32\16\2\u0097\u0098"+
		"\7\36\2\2\u0098\u0099\7\22\2\2\u0099\u009a\5,\27\2\u009a\u009b\7\23\2"+
		"\2\u009b\u00a9\3\2\2\2\u009c\u009d\7\24\2\2\u009d\u009e\7\35\2\2\u009e"+
		"\u009f\5\b\5\2\u009f\u00a0\7)\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7"+
		")\2\2\u00a2\u00a3\5\b\5\2\u00a3\u00a4\7\36\2\2\u00a4\u00a5\7\22\2\2\u00a5"+
		"\u00a6\5,\27\2\u00a6\u00a7\7\23\2\2\u00a7\u00a9\3\2\2\2\u00a8\u0094\3"+
		"\2\2\2\u00a8\u009c\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\b\16\1\2\u00ab"+
		"\u00ac\7%\2\2\u00ac\u00af\5\32\16\t\u00ad\u00af\5\34\17\2\u00ae\u00aa"+
		"\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00c1\3\2\2\2\u00b0\u00b1\f\b\2\2\u00b1"+
		"\u00b2\7$\2\2\u00b2\u00c0\5\32\16\t\u00b3\u00b4\f\7\2\2\u00b4\u00b5\7"+
		"#\2\2\u00b5\u00c0\5\32\16\b\u00b6\u00b7\f\6\2\2\u00b7\u00b8\7\"\2\2\u00b8"+
		"\u00c0\5\32\16\7\u00b9\u00ba\f\5\2\2\u00ba\u00bb\7 \2\2\u00bb\u00c0\5"+
		"\32\16\6\u00bc\u00bd\f\4\2\2\u00bd\u00be\7!\2\2\u00be\u00c0\5\32\16\5"+
		"\u00bf\u00b0\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9"+
		"\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\33\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\35\2"+
		"\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7\36\2\2\u00c7\u00d3\3\2\2\2\u00c8"+
		"\u00d3\5\24\13\2\u00c9\u00d3\5$\23\2\u00ca\u00d3\t\3\2\2\u00cb\u00cf\7"+
		"*\2\2\u00cc\u00cd\7\33\2\2\u00cd\u00ce\7,\2\2\u00ce\u00d0\7\34\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\7\13"+
		"\2\2\u00d2\u00c4\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2"+
		"\u00ca\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\35\3\2\2"+
		"\2\u00d4\u00d5\7\25\2\2\u00d5\u00d6\5\f\7\2\u00d6\u00d8\7\35\2\2\u00d7"+
		"\u00d9\5 \21\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dd\7\36\2\2\u00db\u00dc\7&\2\2\u00dc\u00de\5\"\22\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\22"+
		"\2\2\u00e0\u00e1\5.\30\2\u00e1\u00e2\7\23\2\2\u00e2\37\3\2\2\2\u00e3\u00e8"+
		"\5\n\6\2\u00e4\u00e5\7(\2\2\u00e5\u00e7\5\n\6\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9!\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5\16\b\2\u00ec#\3\2\2\2\u00ed\u00ee\5"+
		"\f\7\2\u00ee\u00f0\7\35\2\2\u00ef\u00f1\5&\24\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\36\2\2\u00f3%\3\2\2\2"+
		"\u00f4\u00f9\5\32\16\2\u00f5\u00f6\7(\2\2\u00f6\u00f8\5\32\16\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\'\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\5\6\4\2\u00fd\u00fe"+
		"\7)\2\2\u00fe\u0105\3\2\2\2\u00ff\u0100\5\b\5\2\u0100\u0101\7)\2\2\u0101"+
		"\u0105\3\2\2\2\u0102\u0105\5\30\r\2\u0103\u0105\5\26\f\2\u0104\u00fc\3"+
		"\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		")\3\2\2\2\u0106\u0107\7\26\2\2\u0107\u0108\5\32\16\2\u0108\u0109\7)\2"+
		"\2\u0109+\3\2\2\2\u010a\u010c\5(\25\2\u010b\u010a\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e-\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0112\5(\25\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\5*\26\2\u0117/\3\2\2\2\34\64\66=KQWcptw\u008a"+
		"\u0092\u00a8\u00ae\u00bf\u00c1\u00cf\u00d2\u00d8\u00dd\u00e8\u00f0\u00f9"+
		"\u0104\u010d\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}