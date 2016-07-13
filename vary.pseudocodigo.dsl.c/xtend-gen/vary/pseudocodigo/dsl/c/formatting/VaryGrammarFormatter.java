/**
 * generated by Xtext
 */
package vary.pseudocodigo.dsl.c.formatting;

import com.google.inject.Inject;
import java.util.List;
import java.util.ResourceBundle;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;
import vary.pseudocodigo.dsl.c.keywords.ReadKeywords;
import vary.pseudocodigo.dsl.c.keywords.ReadKeywordsInterface;
import vary.pseudocodigo.dsl.c.services.VaryGrammarGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class VaryGrammarFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private VaryGrammarGrammarAccess _varyGrammarGrammarAccess;
  
  protected final ReadKeywordsInterface readerKeywords = new ReadKeywords();
  
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    List<Pair<Keyword, Keyword>> _findKeywordPairs = this._varyGrammarGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword, Keyword> pair : _findKeywordPairs) {
      {
        Keyword _first = pair.getFirst();
        Keyword _second = pair.getSecond();
        c.setIndentation(_first, _second);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(1);
        Keyword _first_1 = pair.getFirst();
        _setLinewrap.after(_first_1);
        FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(1);
        Keyword _second_1 = pair.getSecond();
        _setLinewrap_1.before(_second_1);
        FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(1);
        Keyword _second_2 = pair.getSecond();
        _setLinewrap_2.after(_second_2);
      }
    }
    List<Keyword> _findKeywords = this._varyGrammarGrammarAccess.findKeywords(",");
    for (final Keyword comma : _findKeywords) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(comma);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(comma);
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap();
        _setLinewrap.after(comma);
      }
    }
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this._varyGrammarGrammarAccess.getSL_COMMENTRule();
    _setLinewrap.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this._varyGrammarGrammarAccess.getML_COMMENTRule();
    _setLinewrap_1.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this._varyGrammarGrammarAccess.getML_COMMENTRule();
    _setLinewrap_2.after(_mL_COMMENTRule_1);
    List<Keyword> _findKeywords_1 = this._varyGrammarGrammarAccess.findKeywords(",");
    for (final Keyword comma_1 : _findKeywords_1) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(comma_1);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(comma_1);
        FormattingConfig.SpaceLocator _setSpace = c.setSpace(" ");
        _setSpace.after(comma_1);
      }
    }
    List<Keyword> _findKeywords_2 = this._varyGrammarGrammarAccess.findKeywords("//");
    for (final Keyword comentario : _findKeywords_2) {
      FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap(2);
      _setLinewrap_3.before(comentario);
    }
    List<Keyword> _findKeywords_3 = this._varyGrammarGrammarAccess.findKeywords(":");
    for (final Keyword dosPuntos : _findKeywords_3) {
      {
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(dosPuntos);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        _setNoSpace_1.after(dosPuntos);
      }
    }
    List<Keyword> _findKeywords_4 = this._varyGrammarGrammarAccess.findKeywords("--");
    for (final Keyword menosMenos : _findKeywords_4) {
      FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
      _setNoSpace.before(menosMenos);
    }
    List<Keyword> _findKeywords_5 = this._varyGrammarGrammarAccess.findKeywords("++");
    for (final Keyword masMas : _findKeywords_5) {
      FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
      _setNoSpace_1.before(masMas);
    }
    ResourceBundle _bundle = this.readerKeywords.getBundle();
    String _string = _bundle.getString("KEYWORD_REGISTRO");
    List<Keyword> _findKeywords_6 = this._varyGrammarGrammarAccess.findKeywords(_string);
    for (final Keyword registro : _findKeywords_6) {
      FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap(1);
      _setLinewrap_4.before(registro);
    }
    ResourceBundle _bundle_1 = this.readerKeywords.getBundle();
    String _string_1 = _bundle_1.getString("KEYWORD_FIN_REGISTRO");
    List<Keyword> _findKeywords_7 = this._varyGrammarGrammarAccess.findKeywords(_string_1);
    for (final Keyword finRegistro : _findKeywords_7) {
      FormattingConfig.LinewrapLocator _setLinewrap_5 = c.setLinewrap(2);
      _setLinewrap_5.after(finRegistro);
    }
    FormattingConfig.LinewrapLocator _setLinewrap_6 = c.setLinewrap(1);
    VaryGrammarGrammarAccess.RegistroElements _registroAccess = this._varyGrammarGrammarAccess.getRegistroAccess();
    RuleCall _nombreEStringParserRuleCall_1_0 = _registroAccess.getNombreEStringParserRuleCall_1_0();
    _setLinewrap_6.after(_nombreEStringParserRuleCall_1_0);
    FormattingConfig.LinewrapLocator _setLinewrap_7 = c.setLinewrap(2);
    ParserRule _tipoComplejoRule = this._varyGrammarGrammarAccess.getTipoComplejoRule();
    _setLinewrap_7.after(_tipoComplejoRule);
    FormattingConfig.LinewrapLocator _setLinewrap_8 = c.setLinewrap(1);
    ParserRule _declaracionRule = this._varyGrammarGrammarAccess.getDeclaracionRule();
    _setLinewrap_8.after(_declaracionRule);
    FormattingConfig.LinewrapLocator _setLinewrap_9 = c.setLinewrap(1);
    ParserRule _declaracionVariableRule = this._varyGrammarGrammarAccess.getDeclaracionVariableRule();
    _setLinewrap_9.after(_declaracionVariableRule);
    List<Keyword> _findKeywords_8 = this._varyGrammarGrammarAccess.findKeywords(".");
    for (final Keyword variable : _findKeywords_8) {
      {
        FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
        _setNoSpace_2.before(variable);
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        _setNoSpace_3.after(variable);
      }
    }
    FormattingConfig.LinewrapLocator _setLinewrap_10 = c.setLinewrap(2);
    ParserRule _sentenciasRule = this._varyGrammarGrammarAccess.getSentenciasRule();
    _setLinewrap_10.after(_sentenciasRule);
    ResourceBundle _bundle_2 = this.readerKeywords.getBundle();
    String _string_2 = _bundle_2.getString("KEYWORD_ENTONCES");
    List<Keyword> _findKeywords_9 = this._varyGrammarGrammarAccess.findKeywords(_string_2);
    for (final Keyword keyEntonces : _findKeywords_9) {
      FormattingConfig.LinewrapLocator _setLinewrap_11 = c.setLinewrap(2);
      _setLinewrap_11.after(keyEntonces);
    }
    List<Keyword> _findKeywords_10 = this._varyGrammarGrammarAccess.findKeywords("[");
    for (final Keyword llave : _findKeywords_10) {
      {
        FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
        _setNoSpace_2.before(llave);
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        _setNoSpace_3.after(llave);
      }
    }
    List<Keyword> _findKeywords_11 = this._varyGrammarGrammarAccess.findKeywords("]");
    for (final Keyword llave_1 : _findKeywords_11) {
      FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
      _setNoSpace_2.before(llave_1);
    }
    List<Keyword> _findKeywords_12 = this._varyGrammarGrammarAccess.findKeywords("][");
    for (final Keyword llave_2 : _findKeywords_12) {
      {
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        _setNoSpace_3.before(llave_2);
        FormattingConfig.NoSpaceLocator _setNoSpace_4 = c.setNoSpace();
        _setNoSpace_4.after(llave_2);
      }
    }
    List<Keyword> _findKeywords_13 = this._varyGrammarGrammarAccess.findKeywords("(");
    for (final Keyword llave_3 : _findKeywords_13) {
      {
        FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
        _setNoSpace_3.after(llave_3);
        FormattingConfig.NoSpaceLocator _setNoSpace_4 = c.setNoSpace();
        _setNoSpace_4.before(llave_3);
      }
    }
    List<Keyword> _findKeywords_14 = this._varyGrammarGrammarAccess.findKeywords(")");
    for (final Keyword llave_4 : _findKeywords_14) {
      FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
      _setNoSpace_3.before(llave_4);
    }
    ResourceBundle _bundle_3 = this.readerKeywords.getBundle();
    String _string_3 = _bundle_3.getString("KEYWORD_CONST");
    List<Keyword> _findKeywords_15 = this._varyGrammarGrammarAccess.findKeywords(_string_3);
    for (final Keyword keyConst : _findKeywords_15) {
      FormattingConfig.LinewrapLocator _setLinewrap_12 = c.setLinewrap(2);
      _setLinewrap_12.before(keyConst);
    }
    ResourceBundle _bundle_4 = this.readerKeywords.getBundle();
    String _string_4 = _bundle_4.getString("KEYWORD_TIPO");
    List<Keyword> _findKeywords_16 = this._varyGrammarGrammarAccess.findKeywords(_string_4);
    for (final Keyword keyTipo : _findKeywords_16) {
      FormattingConfig.LinewrapLocator _setLinewrap_13 = c.setLinewrap(2);
      _setLinewrap_13.before(keyTipo);
    }
    ResourceBundle _bundle_5 = this.readerKeywords.getBundle();
    String _string_5 = _bundle_5.getString("KEYWORD_INICIO");
    List<Keyword> _findKeywords_17 = this._varyGrammarGrammarAccess.findKeywords(_string_5);
    for (final Keyword keyInicio : _findKeywords_17) {
      FormattingConfig.LinewrapLocator _setLinewrap_14 = c.setLinewrap(2);
      _setLinewrap_14.before(keyInicio);
    }
    ResourceBundle _bundle_6 = this.readerKeywords.getBundle();
    String _string_6 = _bundle_6.getString("KEYWORD_FIN_DESDE");
    List<Keyword> _findKeywords_18 = this._varyGrammarGrammarAccess.findKeywords(_string_6);
    for (final Keyword keyFinDesde : _findKeywords_18) {
      FormattingConfig.LinewrapLocator _setLinewrap_15 = c.setLinewrap(2);
      _setLinewrap_15.after(keyFinDesde);
    }
    ResourceBundle _bundle_7 = this.readerKeywords.getBundle();
    String _string_7 = _bundle_7.getString("KEYWORD_CONST");
    List<Keyword> _findKeywords_19 = this._varyGrammarGrammarAccess.findKeywords(_string_7);
    for (final Keyword keyConst_1 : _findKeywords_19) {
      FormattingConfig.IndentationLocatorStart _setIndentationIncrement = c.setIndentationIncrement();
      _setIndentationIncrement.after(keyConst_1);
    }
    ResourceBundle _bundle_8 = this.readerKeywords.getBundle();
    String _string_8 = _bundle_8.getString("KEYWORD_TIPO");
    List<Keyword> _findKeywords_20 = this._varyGrammarGrammarAccess.findKeywords(_string_8);
    for (final Keyword keyTipo_1 : _findKeywords_20) {
      {
        FormattingConfig.IndentationLocatorEnd _setIndentationDecrement = c.setIndentationDecrement();
        _setIndentationDecrement.before(keyTipo_1);
        FormattingConfig.IndentationLocatorStart _setIndentationIncrement_1 = c.setIndentationIncrement();
        _setIndentationIncrement_1.after(keyTipo_1);
      }
    }
    FormattingConfig.IndentationLocatorEnd _setIndentationDecrement = c.setIndentationDecrement();
    ParserRule _subprocesoRule = this._varyGrammarGrammarAccess.getSubprocesoRule();
    _setIndentationDecrement.before(_subprocesoRule);
    ResourceBundle _bundle_9 = this.readerKeywords.getBundle();
    String _string_9 = _bundle_9.getString("KEYWORD_VAR");
    List<Keyword> _findKeywords_21 = this._varyGrammarGrammarAccess.findKeywords(_string_9);
    for (final Keyword keyVar : _findKeywords_21) {
      {
        FormattingConfig.LinewrapLocator _setLinewrap_16 = c.setLinewrap(2);
        _setLinewrap_16.before(keyVar);
        FormattingConfig.LinewrapLocator _setLinewrap_17 = c.setLinewrap(2);
        _setLinewrap_17.after(keyVar);
        FormattingConfig.IndentationLocatorStart _setIndentationIncrement_1 = c.setIndentationIncrement();
        _setIndentationIncrement_1.before(keyVar);
        FormattingConfig.IndentationLocatorStart _setIndentationIncrement_2 = c.setIndentationIncrement();
        _setIndentationIncrement_2.after(keyVar);
      }
    }
    FormattingConfig.LinewrapLocator _setLinewrap_16 = c.setLinewrap(2);
    ParserRule _subprocesoRule_1 = this._varyGrammarGrammarAccess.getSubprocesoRule();
    _setLinewrap_16.after(_subprocesoRule_1);
    FormattingConfig.LinewrapLocator _setLinewrap_17 = c.setLinewrap(2);
    ParserRule _tipoComplejoRule_1 = this._varyGrammarGrammarAccess.getTipoComplejoRule();
    _setLinewrap_17.after(_tipoComplejoRule_1);
    ResourceBundle _bundle_10 = this.readerKeywords.getBundle();
    String _string_10 = _bundle_10.getString("KEYWORD_INICIO");
    List<Keyword> _findKeywords_22 = this._varyGrammarGrammarAccess.findKeywords(_string_10);
    for (final Keyword keyInicio_1 : _findKeywords_22) {
      {
        FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_1 = c.setIndentationDecrement();
        _setIndentationDecrement_1.before(keyInicio_1);
        FormattingConfig.IndentationLocatorStart _setIndentationIncrement_1 = c.setIndentationIncrement();
        _setIndentationIncrement_1.after(keyInicio_1);
      }
    }
    FormattingConfig.LinewrapLocator _setLinewrap_18 = c.setLinewrap(2);
    ParserRule _devolverRule = this._varyGrammarGrammarAccess.getDevolverRule();
    _setLinewrap_18.after(_devolverRule);
    ResourceBundle _bundle_11 = this.readerKeywords.getBundle();
    String _string_11 = _bundle_11.getString("KEYWORD_FIN_FUNCION");
    List<Keyword> _findKeywords_23 = this._varyGrammarGrammarAccess.findKeywords(_string_11);
    for (final Keyword keyFinFuncion : _findKeywords_23) {
      FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_1 = c.setIndentationDecrement();
      _setIndentationDecrement_1.before(keyFinFuncion);
    }
    FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_2 = c.setIndentationDecrement();
    ParserRule _subprocesoRule_2 = this._varyGrammarGrammarAccess.getSubprocesoRule();
    ParserRule _inicioRule = this._varyGrammarGrammarAccess.getInicioRule();
    _setIndentationDecrement_2.between(_subprocesoRule_2, _inicioRule);
    FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_3 = c.setIndentationDecrement();
    ParserRule _subprocesoRule_3 = this._varyGrammarGrammarAccess.getSubprocesoRule();
    ParserRule _inicioRule_1 = this._varyGrammarGrammarAccess.getInicioRule();
    _setIndentationDecrement_3.between(_subprocesoRule_3, _inicioRule_1);
    ResourceBundle _bundle_12 = this.readerKeywords.getBundle();
    String _string_12 = _bundle_12.getString("KEYWORD_FIN_PROCEDIMIENTO");
    List<Keyword> _findKeywords_24 = this._varyGrammarGrammarAccess.findKeywords(_string_12);
    for (final Keyword keyFinProc : _findKeywords_24) {
      FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_4 = c.setIndentationDecrement();
      _setIndentationDecrement_4.before(keyFinProc);
    }
    ResourceBundle _bundle_13 = this.readerKeywords.getBundle();
    String _string_13 = _bundle_13.getString("KEYWORD_FIN_INICIO");
    List<Keyword> _findKeywords_25 = this._varyGrammarGrammarAccess.findKeywords(_string_13);
    for (final Keyword keyFinInicio : _findKeywords_25) {
      FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_5 = c.setIndentationDecrement();
      _setIndentationDecrement_5.before(keyFinInicio);
    }
    ResourceBundle _bundle_14 = this.readerKeywords.getBundle();
    String _string_14 = _bundle_14.getString("KEYWORD_HACER");
    List<Keyword> _findKeywords_26 = this._varyGrammarGrammarAccess.findKeywords(_string_14);
    for (final Keyword keyHacerDesde : _findKeywords_26) {
      {
        FormattingConfig.LinewrapLocator _setLinewrap_19 = c.setLinewrap(1);
        _setLinewrap_19.after(keyHacerDesde);
        FormattingConfig.IndentationLocatorStart _setIndentationIncrement_1 = c.setIndentationIncrement();
        _setIndentationIncrement_1.before(keyHacerDesde);
      }
    }
    ResourceBundle _bundle_15 = this.readerKeywords.getBundle();
    String _string_15 = _bundle_15.getString("KEYWORD_FIN_DESDE");
    List<Keyword> _findKeywords_27 = this._varyGrammarGrammarAccess.findKeywords(_string_15);
    for (final Keyword keyFinDesde_1 : _findKeywords_27) {
      FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_6 = c.setIndentationDecrement();
      _setIndentationDecrement_6.before(keyFinDesde_1);
    }
    ResourceBundle _bundle_16 = this.readerKeywords.getBundle();
    String _string_16 = _bundle_16.getString("KEYWORD_ENTONCES");
    List<Keyword> _findKeywords_28 = this._varyGrammarGrammarAccess.findKeywords(_string_16);
    for (final Keyword keyEntoncesSi : _findKeywords_28) {
      FormattingConfig.IndentationLocatorStart _setIndentationIncrement_1 = c.setIndentationIncrement();
      _setIndentationIncrement_1.before(keyEntoncesSi);
    }
    ResourceBundle _bundle_17 = this.readerKeywords.getBundle();
    String _string_17 = _bundle_17.getString("KEYWORD_SINO");
    List<Keyword> _findKeywords_29 = this._varyGrammarGrammarAccess.findKeywords(_string_17);
    for (final Keyword keySinoSi : _findKeywords_29) {
      {
        FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_7 = c.setIndentationDecrement();
        _setIndentationDecrement_7.before(keySinoSi);
        FormattingConfig.IndentationLocatorStart _setIndentationIncrement_2 = c.setIndentationIncrement();
        _setIndentationIncrement_2.after(keySinoSi);
      }
    }
    ResourceBundle _bundle_18 = this.readerKeywords.getBundle();
    String _string_18 = _bundle_18.getString("KEYWORD_FIN_SI");
    List<Keyword> _findKeywords_30 = this._varyGrammarGrammarAccess.findKeywords(_string_18);
    for (final Keyword keyFinSi : _findKeywords_30) {
      FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_7 = c.setIndentationDecrement();
      _setIndentationDecrement_7.before(keyFinSi);
    }
    ResourceBundle _bundle_19 = this.readerKeywords.getBundle();
    String _string_19 = _bundle_19.getString("KEYWORD_FIN_MIENTRAS");
    List<Keyword> _findKeywords_31 = this._varyGrammarGrammarAccess.findKeywords(_string_19);
    for (final Keyword keyFinMientras : _findKeywords_31) {
      FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_8 = c.setIndentationDecrement();
      _setIndentationDecrement_8.before(keyFinMientras);
    }
    ResourceBundle _bundle_20 = this.readerKeywords.getBundle();
    String _string_20 = _bundle_20.getString("KEYWORD_REPETIR");
    List<Keyword> _findKeywords_32 = this._varyGrammarGrammarAccess.findKeywords(_string_20);
    for (final Keyword keyRepetir : _findKeywords_32) {
      FormattingConfig.IndentationLocatorStart _setIndentationIncrement_2 = c.setIndentationIncrement();
      _setIndentationIncrement_2.after(keyRepetir);
    }
    ResourceBundle _bundle_21 = this.readerKeywords.getBundle();
    String _string_21 = _bundle_21.getString("KEYWORD_HASTA_QUE");
    List<Keyword> _findKeywords_33 = this._varyGrammarGrammarAccess.findKeywords(_string_21);
    for (final Keyword keyHastaQueRepetir : _findKeywords_33) {
      FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_9 = c.setIndentationDecrement();
      _setIndentationDecrement_9.before(keyHastaQueRepetir);
    }
    ResourceBundle _bundle_22 = this.readerKeywords.getBundle();
    String _string_22 = _bundle_22.getString("KEYWORD_FIN_SEGUN");
    List<Keyword> _findKeywords_34 = this._varyGrammarGrammarAccess.findKeywords(_string_22);
    for (final Keyword keyFinSegun : _findKeywords_34) {
      FormattingConfig.IndentationLocatorEnd _setIndentationDecrement_10 = c.setIndentationDecrement();
      _setIndentationDecrement_10.before(keyFinSegun);
    }
    FormattingConfig.LinewrapLocator _setLinewrap_19 = c.setLinewrap(1);
    ParserRule _sentenciasRule_1 = this._varyGrammarGrammarAccess.getSentenciasRule();
    _setLinewrap_19.after(_sentenciasRule_1);
  }
}
