package com.aptana.editor.css.parsing;

import beaver.*;
import com.aptana.editor.css.parsing.ast.*;
import com.aptana.parsing.IParser;
import com.aptana.parsing.ast.*;

import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "CSS.grammar".
 */
@SuppressWarnings("nls")
public class CSSParser extends Parser implements IParser {

	// suppress the error printouts
	private static class CSSEvents extends Events
	{

		public void scannerError(Scanner.Exception e)
		{
		}

		public void syntaxError(Symbol token)
		{
		}

		public void unexpectedTokenRemoved(Symbol token)
		{
		}

		public void missingTokenInserted(Symbol token)
		{
		}

		public void misspelledTokenReplaced(Symbol token)
		{
		}

		public void errorPhraseRemoved(Symbol error)
		{
		}
	}

    static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9oTLbTqb4KK$lujw8eaOWGI2G6Zo6v8M598GB89f8e55Mo8W0KxbeXYvHmynrTVVF0Soml" +
		"dsCM2YbXYxmsne1BiMB2B1JlNR#xCRYR97xEwET$SEtVkdU$EdVbd0WIhq80PQCL8b61FLA" +
		"45zQZ4S1o0wUmtOmhIc8fgrA0MTPY694PfH1T6Op5ceGcp6P72xXfH41An52TY3nJXL9o0K" +
		"rn48#ClnVbOWKNoAVR3PUZ0KRWSuz6ElH137CEm2tP5WXbbS10pYdWHDwEO4MKQiGywKU57" +
		"Y62vSexbJ9Qp41VWGcTTXadMAa#hzMoCm#7O3MFaAOpevI3lP79KaYCgMvdXINsoidFjpJL" +
		"RXeCzXb8SugnjQZqiou3ZoB0l9c9$784ZSzO5$NWpMLuimSauBOIt0cSuXbPbE5FthOjHTW" +
		"wpFmjnLewXdWmppVx8a$B4WFqntajOVs2UVCRwryFyp6u2yqEzEzJZKFg2tfqvRmpmjlcQd" +
		"ystqwjJMyvgwsH#1s8EgzEhjM42ohNVWRdKZY5drkTeNCJMp7GiH#nCVTakfdOwERjm2Ijp" +
		"F2jZVkVWN9n76vmjuDbAiSO5F2TLN462AqZmF8zWlv0dToI$WoAUfL4yyMDuUXCQaUHu1S$" +
		"h19x017SrhX6j8H4HxkHinjWzj17bZ4ynVZBtpEnlckEcQaOFMDC6rdC6gpfJCueoerbUH0" +
		"VdIpDV6r76RywFWEONPKIMCyvJCDnP0y9QesfDy5iguKaUo$uuZwFAsyk1MTcvObopdIlm6" +
		"6BCp5fJQetb65h8OCz5mhF61kLDiXV6synpuJEqQrIIKNOEuvNcTvXbI92XIVUdb7$zzyVk" +
		"Pi1x8wuhvGr2dTvi2qAz0$MWBzi4ohBUb67UKHsn#PPvTKhbhBeAzTBgz6eSQKH6#u7HD3$" +
		"dOyuhMpEJ6R4pzMKRJwsKd4dUNreP7JFtpoGagTbg0IjNwOU1JUPxCVfWqBC5b3cza5XcT4" +
		"wxqzbgGc8wERw3ybhNlz79kKIBqnTQ6KJOD7gnvbxOPl9sVVct$8O2vn$DfZX$VzuSm1N4L" +
		"Qw$chYUynIx$XedrvhIE7szu#BwWddErktaSjggd3w5#YAFw#eG$WtqcU$q5SH6f$SGMqBM" +
		"jpIF6aptvYyY5WyLamMtOIknVMWEb3XPwUHr7dzHFzyhGtWsKvIxyRpp6oINTJx$$vyd6FB" +
		"SmExln7wsRjhck7NzH76JDxPwa7ckSVA6F3XxyiWzUuPMMY4xvI$vK$wGt#Kt#LKjExJzXV" +
		"YP#48#bsVb6UVDhEL7rROJFwZsaNoYyWDvd#qMUKVUbWTblJmWw#H#kK$kbRLoZzmjTycTw" +
		"hTDUkHnUKmUbMxPBE$AU$AXc$rZ9xydlbFjM#8RrRuclY8soPkoKLwN3V8AUo$BI$AYlA0U" +
		"pslxdBQtoQroYxmghyaQkKDkbpVa4NbO7f8lvItvcmuB#7O6V1aZ#ZhM389wtgaDYXXV7eC" +
		"utvye4IECFeolKPI8yKsA4Z5zcwhqfRUlVQCYeZ93cQ6iewoZhALFBMDggJTHRwAzIVM0Tu" +
		"95DUtLb6bzomBUr14YK5HGhw1CAY8EsNwKYFC$aK0npQ7TeRaVMZnC$O#ezD3c8VKFlud$T" +
		"m==");

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	private final Action[] actions;

	private CSSScanner fScanner;

	@SuppressWarnings("unchecked")
	public CSSParser() {
		super(PARSING_TABLES);
		report = new CSSEvents();
		fScanner = new CSSScanner();

		actions = new Action[] {
			new Action() {	// [0] Program = Statements.p
                public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_p = _symbols[offset + 1];
					final ArrayList _list_p = (ArrayList) _symbol_p.value;
					final beaver.Symbol[] p = _list_p == null ? new beaver.Symbol[0] : (beaver.Symbol[]) _list_p.toArray(new beaver.Symbol[_list_p.size()]);
					return new ParseRootNode(CSSNode.LANGUAGE, p, _symbol_p.getStart(), _symbol_p.getEnd());
				}
			},
			new Action() {	// [1] Statements = Statements Statement
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [2] Statements = Statement
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [3] Statement = CharSet
			Action.RETURN,	// [4] Statement = Import
			Action.RETURN,	// [5] Statement = Media
			Action.RETURN,	// [6] Statement = Page
			Action.RETURN,	// [7] Statement = AtRule
			Action.RETURN,	// [8] Statement = Rule
			new Action() {	// [9] CharSet = CHARSET.c STRING.s SEMICOLON.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol c = _symbols[offset + 1];
					final Symbol _symbol_s = _symbols[offset + 2];
					final String s = (String) _symbol_s.value;
					final Symbol e = _symbols[offset + 3];
					return new CSSCharSetNode(s, c.getStart(), e.getEnd());
				}
			},
			new Action() {	// [10] Import = IMPORT.i ImportWord.s SEMICOLON.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol i = _symbols[offset + 1];
					final Symbol _symbol_s = _symbols[offset + 2];
					final String s = (String) _symbol_s.value;
					final Symbol e = _symbols[offset + 3];
					return new CSSImportNode(s, i.getStart(), e.getEnd());
				}
			},
			new Action() {	// [11] Import = IMPORT.i ImportWord.s List.m SEMICOLON.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol i = _symbols[offset + 1];
					final Symbol _symbol_s = _symbols[offset + 2];
					final String s = (String) _symbol_s.value;
					final Symbol _symbol_m = _symbols[offset + 3];
					final ArrayList _list_m = (ArrayList) _symbol_m.value;
					final String[] m = _list_m == null ? new String[0] : (String[]) _list_m.toArray(new String[_list_m.size()]);
					final Symbol e = _symbols[offset + 4];
					return new CSSImportNode(s, m, i.getStart(), e.getEnd());
				}
			},
			new Action() {	// [12] Media = MEDIA.m List.l LCURLY RCURLY.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol m = _symbols[offset + 1];
					final Symbol _symbol_l = _symbols[offset + 2];
					final ArrayList _list_l = (ArrayList) _symbol_l.value;
					final String[] l = _list_l == null ? new String[0] : (String[]) _list_l.toArray(new String[_list_l.size()]);
					final Symbol r = _symbols[offset + 4];
					return new CSSMediaNode(l, m.getStart(), r.getEnd());
				}
			},
			new Action() {	// [13] Media = MEDIA.m List.l LCURLY Statements RCURLY.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol m = _symbols[offset + 1];
					final Symbol _symbol_l = _symbols[offset + 2];
					final ArrayList _list_l = (ArrayList) _symbol_l.value;
					final String[] l = _list_l == null ? new String[0] : (String[]) _list_l.toArray(new String[_list_l.size()]);
					final Symbol r = _symbols[offset + 5];
					return new CSSMediaNode(l, m.getStart(), r.getEnd());
				}
			},
			new Action() {	// [14] Page = PAGE.p LCURLY RCURLY.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol p = _symbols[offset + 1];
					final Symbol r = _symbols[offset + 3];
					return new CSSPageNode(p.getStart(), r.getEnd());
				}
			},
			new Action() {	// [15] Page = PAGE.p LCURLY Declarations.d RCURLY.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol p = _symbols[offset + 1];
					final Symbol d = _symbols[offset + 3];
					final Symbol r = _symbols[offset + 4];
					return new CSSPageNode(d.value, p.getStart(), r.getEnd());
				}
			},
			new Action() {	// [16] Page = PAGE.p COLON IDENTIFIER.s LCURLY RCURLY.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol p = _symbols[offset + 1];
					final Symbol _symbol_s = _symbols[offset + 3];
					final String s = (String) _symbol_s.value;
					final Symbol r = _symbols[offset + 5];
					return new CSSPageNode(s, p.getStart(), r.getEnd());
				}
			},
			new Action() {	// [17] Page = PAGE.p COLON IDENTIFIER.s LCURLY Declarations.d RCURLY.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol p = _symbols[offset + 1];
					final Symbol _symbol_s = _symbols[offset + 3];
					final String s = (String) _symbol_s.value;
					final Symbol d = _symbols[offset + 5];
					final Symbol r = _symbols[offset + 6];
					return new CSSPageNode(s, d.value, p.getStart(), r.getEnd());
				}
			},
			RETURN3,	// [18] AtRule = AT_KEYWORD STRING SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN4,	// [19] AtRule = AT_KEYWORD STRING LCURLY RCURLY; returns 'RCURLY' although none is marked
			new Action() {	// [20] Rule = Selectors.s LCURLY RCURLY.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 1];
					final ArrayList _list_s = (ArrayList) _symbol_s.value;
					final beaver.Symbol[] s = _list_s == null ? new beaver.Symbol[0] : (beaver.Symbol[]) _list_s.toArray(new beaver.Symbol[_list_s.size()]);
					final Symbol r = _symbols[offset + 3];
					return new CSSRuleNode(s, r.getEnd());
				}
			},
			new Action() {	// [21] Rule = Selectors.s LCURLY Declarations.d RCURLY.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 1];
					final ArrayList _list_s = (ArrayList) _symbol_s.value;
					final beaver.Symbol[] s = _list_s == null ? new beaver.Symbol[0] : (beaver.Symbol[]) _list_s.toArray(new beaver.Symbol[_list_s.size()]);
					final Symbol d = _symbols[offset + 3];
					final Symbol r = _symbols[offset + 4];
					return new CSSRuleNode(s, d.value, r.getEnd());
				}
			},
			Action.RETURN,	// [22] Rule = error
			new Action() {	// [23] Function = FUNCTION.l Expression.e RPAREN.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol l = _symbols[offset + 1];
					final Symbol _symbol_e = _symbols[offset + 2];
					final CSSExpressionNode e = (CSSExpressionNode) _symbol_e.value;
					final Symbol r = _symbols[offset + 3];
					return new CSSFunctionNode(e, l.getStart(), r.getEnd());
				}
			},
			new Action() {	// [24] List = List COMMA IDENTIFIER
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3].value); return _symbols[offset + 1];
				}
			},
			new Action() {	// [25] List = IDENTIFIER
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [26] Declarations = Subdeclarations
			new Action() {	// [27] Declarations = Subdeclarations.l Declaration2.d
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_l = _symbols[offset + 1];
					final ArrayList _list_l = (ArrayList) _symbol_l.value;
					final Symbol _symbol_d = _symbols[offset + 2];
					final CSSDeclarationNode d = (CSSDeclarationNode) _symbol_d.value;
					_list_l.add(d); return _symbol_l;
				}
			},
			Action.RETURN,	// [28] Declarations = Declaration2
			new Action() {	// [29] Subdeclarations = Subdeclarations Declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			new Action() {	// [30] Subdeclarations = Declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [31] Declaration = Declaration2.d SEMICOLON.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 1];
					final CSSDeclarationNode d = (CSSDeclarationNode) _symbol_d.value;
					final Symbol s = _symbols[offset + 2];
					((CSSDeclarationNode) d).setHasSemicolon(s); return d;
				}
			},
			new Action() {	// [32] Declaration = SEMICOLON.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol s = _symbols[offset + 1];
					return new CSSDeclarationNode(s);
				}
			},
			new Action() {	// [33] Declaration2 = Identifier.i COLON Expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final Symbol _symbol_e = _symbols[offset + 3];
					final CSSExpressionNode e = (CSSExpressionNode) _symbol_e.value;
					return new CSSDeclarationNode(_symbol_i, e);
				}
			},
			new Action() {	// [34] Declaration2 = Identifier.i COLON Expression.e IMPORTANT.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final Symbol _symbol_e = _symbols[offset + 3];
					final CSSExpressionNode e = (CSSExpressionNode) _symbol_e.value;
					final Symbol _symbol_s = _symbols[offset + 4];
					return new CSSDeclarationNode(_symbol_i, e, _symbol_s);
				}
			},
			new Action() {	// [35] Declaration2 = error.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol e = _symbols[offset + 1];
					return new CSSErrorDeclarationNode(e.getStart(), e.getEnd());
				}
			},
			new Action() {	// [36] Expression = Expression.e Separator.s Term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final CSSExpressionNode e = (CSSExpressionNode) _symbol_e.value;
					final Symbol _symbol_s = _symbols[offset + 2];
					final String s = (String) _symbol_s.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final CSSExpressionNode t = (CSSExpressionNode) _symbol_t.value;
					return new CSSTermListNode(e, t, s);
				}
			},
			new Action() {	// [37] Expression = Expression.e Term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final CSSExpressionNode e = (CSSExpressionNode) _symbol_e.value;
					final Symbol _symbol_t = _symbols[offset + 2];
					final CSSExpressionNode t = (CSSExpressionNode) _symbol_t.value;
					return new CSSTermListNode(e, t);
				}
			},
			Action.RETURN,	// [38] Expression = Term
			new Action() {	// [39] Expression = error.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol e = _symbols[offset + 1];
					return new CSSErrorExpressionNode(e.getStart(), e.getEnd());
				}
			},
			new Action() {	// [40] Term = Primitive.p
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_p = _symbols[offset + 1];
					return new CSSTermNode(_symbol_p);
				}
			},
			Action.RETURN,	// [41] Term = Function
			new Action() {	// [42] Selectors = Selectors Combinator Selector
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [43] Selectors = Selector
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [44] Selector = Selector SimpleSelector
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [45] Selector = SimpleSelector
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [46] SimpleSelector = TypeOrUniversalSelector.t AttributeSelectors.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Symbol _symbol_a = _symbols[offset + 2];
					final ArrayList _list_a = (ArrayList) _symbol_a.value;
					final CSSAttributeSelectorNode[] a = _list_a == null ? new CSSAttributeSelectorNode[0] : (CSSAttributeSelectorNode[]) _list_a.toArray(new CSSAttributeSelectorNode[_list_a.size()]);
					return new CSSSimpleSelectorNode(_symbol_t, a);
				}
			},
			new Action() {	// [47] SimpleSelector = TypeOrUniversalSelector.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					return new CSSSimpleSelectorNode(_symbol_t);
				}
			},
			new Action() {	// [48] SimpleSelector = AttributeSelectors.a
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_a = _symbols[offset + 1];
					final ArrayList _list_a = (ArrayList) _symbol_a.value;
					final CSSAttributeSelectorNode[] a = _list_a == null ? new CSSAttributeSelectorNode[0] : (CSSAttributeSelectorNode[]) _list_a.toArray(new CSSAttributeSelectorNode[_list_a.size()]);
					return new CSSSimpleSelectorNode(a);
				}
			},
			new Action() {	// [49] AttributeSelectors = AttributeSelectors AttributeSelector
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			new Action() {	// [50] AttributeSelectors = AttributeSelector
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [51] AttributeSelector = CLASS.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 1];
					final String c = (String) _symbol_c.value;
					return new CSSAttributeSelectorNode(c, _symbol_c.getStart(), _symbol_c.getEnd());
				}
			},
			new Action() {	// [52] AttributeSelector = COLON.c IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol c = _symbols[offset + 1];
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					return new CSSAttributeSelectorNode(":" + i, c.getStart(), _symbol_i.getEnd());
				}
			},
			new Action() {	// [53] AttributeSelector = COLON.c Function.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol c = _symbols[offset + 1];
					final Symbol _symbol_f = _symbols[offset + 2];
					final CSSExpressionNode f = (CSSExpressionNode) _symbol_f.value;
					return new CSSAttributeSelectorNode(f, c.getStart());
				}
			},
			new Action() {	// [54] AttributeSelector = COLOR.c
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_c = _symbols[offset + 1];
					final String c = (String) _symbol_c.value;
					return new CSSAttributeSelectorNode(c, _symbol_c.getStart(), _symbol_c.getEnd());
				}
			},
			new Action() {	// [55] AttributeSelector = HASH.h
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_h = _symbols[offset + 1];
					final String h = (String) _symbol_h.value;
					return new CSSAttributeSelectorNode(h, _symbol_h.getStart(), _symbol_h.getEnd());
				}
			},
			new Action() {	// [56] AttributeSelector = LBRACKET.l IDENTIFIER.i RBRACKET.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol l = _symbols[offset + 1];
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					final Symbol r = _symbols[offset + 3];
					return new CSSAttributeSelectorNode("[" + i + "]", l.getStart(), r.getEnd());
				}
			},
			new Action() {	// [57] AttributeSelector = LBRACKET.l IDENTIFIER.i AttributeValueOperator.o IdentiferOrString.s RBRACKET.r
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol l = _symbols[offset + 1];
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					final Symbol _symbol_o = _symbols[offset + 3];
					final String o = (String) _symbol_o.value;
					final Symbol _symbol_s = _symbols[offset + 4];
					final String s = (String) _symbol_s.value;
					final Symbol r = _symbols[offset + 5];
					return new CSSAttributeSelectorNode("[" + i + " " + o + " " + s + "]", l.getStart(), r.getEnd());
				}
			},
			Action.RETURN,	// [58] ImportWord = STRING
			Action.RETURN,	// [59] ImportWord = URL
			Action.RETURN,	// [60] Identifier = IDENTIFIER
			Action.RETURN,	// [61] Identifier = PROPERTY
			Action.RETURN,	// [62] IdentiferOrString = IDENTIFIER
			Action.RETURN,	// [63] IdentiferOrString = STRING
			Action.RETURN,	// [64] Separator = FORWARD_SLASH
			Action.RETURN,	// [65] Separator = COMMA
			Action.RETURN,	// [66] Separator = PLUS
			Action.RETURN,	// [67] Separator = MINUS
			Action.RETURN,	// [68] Combinator = COMMA
			Action.RETURN,	// [69] Combinator = PLUS
			Action.RETURN,	// [70] Combinator = GREATER
			Action.RETURN,	// [71] Primitive = NUMBER
			Action.RETURN,	// [72] Primitive = PERCENTAGE
			Action.RETURN,	// [73] Primitive = LENGTH
			Action.RETURN,	// [74] Primitive = EMS
			Action.RETURN,	// [75] Primitive = EXS
			Action.RETURN,	// [76] Primitive = ANGLE
			Action.RETURN,	// [77] Primitive = TIME
			Action.RETURN,	// [78] Primitive = FREQUENCY
			Action.RETURN,	// [79] Primitive = STRING
			Action.RETURN,	// [80] Primitive = IDENTIFIER
			Action.RETURN,	// [81] Primitive = URL
			Action.RETURN,	// [82] Primitive = COLOR
			Action.RETURN,	// [83] TypeOrUniversalSelector = IDENTIFIER
			Action.RETURN,	// [84] TypeOrUniversalSelector = STAR
			Action.RETURN,	// [85] TypeOrUniversalSelector = SELECTOR
			Action.RETURN,	// [86] AttributeValueOperator = EQUAL
			Action.RETURN,	// [87] AttributeValueOperator = INCLUDES
			Action.RETURN	// [88] AttributeValueOperator = DASHMATCH
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}

	@Override
	public IParseNode parse(String source) throws java.lang.Exception
	{
		fScanner.setSource(source);
		return (IParseNode) parse(fScanner);
	}
}
