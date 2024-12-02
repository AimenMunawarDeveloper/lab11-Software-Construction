// Generated from Expression.g4 by ANTLR 4.5.1

package expressivo.parser;
// Do not edit this .java file! Edit the grammar in Expression.g4 and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INTEGER=7, SPACES=8;
  public static final int
    RULE_root = 0, RULE_polynomial = 1, RULE_term = 2, RULE_factor = 3, 
    RULE_variable = 4, RULE_exponent = 5;
  public static final String[] ruleNames = {
    "root", "polynomial", "term", "factor", "variable", "exponent"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'+'", "'-'", "'*'", "'/'", "'x'", "'^'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, "INTEGER", "SPACES"
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
  public String getGrammarFileName() { return "Expression.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


      // This method makes the lexer or parser stop running if it encounters
      // invalid input and throw a ParseCancellationException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol,
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
                  throw new ParseCancellationException(msg, e);
              }
          });
      }

  public ExpressionParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public PolynomialContext polynomial() {
      return getRuleContext(PolynomialContext.class,0);
    }
    public TerminalNode EOF() { return getToken(ExpressionParser.EOF, 0); }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(12);
      polynomial();
      setState(13);
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

  public static class PolynomialContext extends ParserRuleContext {
    public List<TermContext> term() {
      return getRuleContexts(TermContext.class);
    }
    public TermContext term(int i) {
      return getRuleContext(TermContext.class,i);
    }
    public PolynomialContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_polynomial; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPolynomial(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPolynomial(this);
    }
  }

  public final PolynomialContext polynomial() throws RecognitionException {
    PolynomialContext _localctx = new PolynomialContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_polynomial);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(15);
      term();
      setState(22);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0 || _la==T__1) {
        {
        setState(20);
        switch (_input.LA(1)) {
        case T__0:
          {
          setState(16);
          match(T__0);
          setState(17);
          term();
          }
          break;
        case T__1:
          {
          setState(18);
          match(T__1);
          setState(19);
          term();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(24);
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

  public static class TermContext extends ParserRuleContext {
    public List<FactorContext> factor() {
      return getRuleContexts(FactorContext.class);
    }
    public FactorContext factor(int i) {
      return getRuleContext(FactorContext.class,i);
    }
    public TermContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_term; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterTerm(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitTerm(this);
    }
  }

  public final TermContext term() throws RecognitionException {
    TermContext _localctx = new TermContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_term);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(25);
      factor();
      {
      setState(32);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__2 || _la==T__3) {
        {
        setState(30);
        switch (_input.LA(1)) {
        case T__2:
          {
          setState(26);
          match(T__2);
          setState(27);
          factor();
          }
          break;
        case T__3:
          {
          setState(28);
          match(T__3);
          setState(29);
          factor();
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        setState(34);
        _errHandler.sync(this);
        _la = _input.LA(1);
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

  public static class FactorContext extends ParserRuleContext {
    public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
    public VariableContext variable() {
      return getRuleContext(VariableContext.class,0);
    }
    public ExponentContext exponent() {
      return getRuleContext(ExponentContext.class,0);
    }
    public FactorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_factor; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterFactor(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitFactor(this);
    }
  }

  public final FactorContext factor() throws RecognitionException {
    FactorContext _localctx = new FactorContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_factor);
    int _la;
    try {
      setState(44);
      switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(35);
        match(INTEGER);
        setState(37);
        _la = _input.LA(1);
        if (_la==T__4) {
          {
          setState(36);
          variable();
          }
        }

        setState(40);
        _la = _input.LA(1);
        if (_la==T__5) {
          {
          setState(39);
          exponent();
          }
        }

        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(42);
        match(INTEGER);
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(43);
        variable();
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

  public static class VariableContext extends ParserRuleContext {
    public VariableContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_variable; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterVariable(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitVariable(this);
    }
  }

  public final VariableContext variable() throws RecognitionException {
    VariableContext _localctx = new VariableContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_variable);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(46);
      match(T__4);
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

  public static class ExponentContext extends ParserRuleContext {
    public TerminalNode INTEGER() { return getToken(ExpressionParser.INTEGER, 0); }
    public ExponentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_exponent; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExponent(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExponent(this);
    }
  }

  public final ExponentContext exponent() throws RecognitionException {
    ExponentContext _localctx = new ExponentContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_exponent);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(48);
      match(T__5);
      setState(49);
      match(INTEGER);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\66\4\2\t\2\4"+
      "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
      "\3\3\7\3\27\n\3\f\3\16\3\32\13\3\3\4\3\4\3\4\3\4\3\4\7\4!\n\4\f\4"+
      "\16\4$\13\4\3\5\3\5\5\5(\n\5\3\5\5\5+\n\5\3\5\3\5\5\5/\n\5\3\6\3\6"+
      "\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\67\2\16\3\2\2\2\4\21\3\2\2"+
      "\2\6\33\3\2\2\2\b.\3\2\2\2\n\60\3\2\2\2\f\62\3\2\2\2\16\17\5\4\3\2"+
      "\17\20\7\2\2\3\20\3\3\2\2\2\21\30\5\6\4\2\22\23\7\3\2\2\23\27\5\6"+
      "\4\2\24\25\7\4\2\2\25\27\5\6\4\2\26\22\3\2\2\2\26\24\3\2\2\2\27\32"+
      "\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\30\3\2\2\2\33"+
      "\"\5\b\5\2\34\35\7\5\2\2\35!\5\b\5\2\36\37\7\6\2\2\37!\5\b\5\2 \34"+
      "\3\2\2\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\7\3\2\2\2$\""+
      "\3\2\2\2%\'\7\t\2\2&(\5\n\6\2\'&\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)+\5"+
      "\f\7\2*)\3\2\2\2*+\3\2\2\2+/\3\2\2\2,/\7\t\2\2-/\5\n\6\2.%\3\2\2\2"+
      ".,\3\2\2\2.-\3\2\2\2/\t\3\2\2\2\60\61\7\7\2\2\61\13\3\2\2\2\62\63"+
      "\7\b\2\2\63\64\7\t\2\2\64\r\3\2\2\2\t\26\30 \"\'*.";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}