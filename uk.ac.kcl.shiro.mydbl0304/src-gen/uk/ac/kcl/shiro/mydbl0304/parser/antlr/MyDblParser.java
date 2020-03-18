/*
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.shiro.mydbl0304.parser.antlr.internal.InternalMyDblParser;
import uk.ac.kcl.shiro.mydbl0304.services.MyDblGrammarAccess;

public class MyDblParser extends AbstractAntlrParser {

	@Inject
	private MyDblGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyDblParser createParser(XtextTokenStream stream) {
		return new InternalMyDblParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Database";
	}

	public MyDblGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDblGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}