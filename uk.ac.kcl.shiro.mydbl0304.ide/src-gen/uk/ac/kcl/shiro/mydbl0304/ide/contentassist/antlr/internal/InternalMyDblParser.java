package uk.ac.kcl.shiro.mydbl0304.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.shiro.mydbl0304.services.MyDblGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDblParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Binary'", "'Varbinary'", "'Image'", "'Char'", "'Varchar'", "'Text'", "'Nchar'", "'Nvarchar'", "'Ntext'", "'Datetime'", "'Smalldatetime'", "'Date'", "'TimeStamp'", "'Integer'", "'Double'", "'Float'", "'is'", "'as'", "'equals'", "'create'", "'database'", "'named'", "'a'", "'table'", "','", "'which'", "'saves'", "'data'", "'of'", "'has'", "'attribute'", "'add'", "'with'", "'find'", "'the'", "'whose'", "'in'", "'\\'s'", "'not'", "'larger'", "'than'", "'less'", "'no'", "'remove'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDblParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDblParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDblParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDbl.g"; }


    	private MyDblGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDblGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDatabase"
    // InternalMyDbl.g:53:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalMyDbl.g:54:1: ( ruleDatabase EOF )
            // InternalMyDbl.g:55:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalMyDbl.g:62:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:66:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalMyDbl.g:67:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalMyDbl.g:67:2: ( ( rule__Database__Group__0 ) )
            // InternalMyDbl.g:68:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalMyDbl.g:69:3: ( rule__Database__Group__0 )
            // InternalMyDbl.g:69:4: rule__Database__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleInstructions"
    // InternalMyDbl.g:78:1: entryRuleInstructions : ruleInstructions EOF ;
    public final void entryRuleInstructions() throws RecognitionException {
        try {
            // InternalMyDbl.g:79:1: ( ruleInstructions EOF )
            // InternalMyDbl.g:80:1: ruleInstructions EOF
            {
             before(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_1);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getInstructionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // InternalMyDbl.g:87:1: ruleInstructions : ( ( rule__Instructions__Alternatives ) ) ;
    public final void ruleInstructions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:91:2: ( ( ( rule__Instructions__Alternatives ) ) )
            // InternalMyDbl.g:92:2: ( ( rule__Instructions__Alternatives ) )
            {
            // InternalMyDbl.g:92:2: ( ( rule__Instructions__Alternatives ) )
            // InternalMyDbl.g:93:3: ( rule__Instructions__Alternatives )
            {
             before(grammarAccess.getInstructionsAccess().getAlternatives()); 
            // InternalMyDbl.g:94:3: ( rule__Instructions__Alternatives )
            // InternalMyDbl.g:94:4: rule__Instructions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instructions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "entryRuleCreateTableInstruction"
    // InternalMyDbl.g:103:1: entryRuleCreateTableInstruction : ruleCreateTableInstruction EOF ;
    public final void entryRuleCreateTableInstruction() throws RecognitionException {
        try {
            // InternalMyDbl.g:104:1: ( ruleCreateTableInstruction EOF )
            // InternalMyDbl.g:105:1: ruleCreateTableInstruction EOF
            {
             before(grammarAccess.getCreateTableInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateTableInstruction();

            state._fsp--;

             after(grammarAccess.getCreateTableInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreateTableInstruction"


    // $ANTLR start "ruleCreateTableInstruction"
    // InternalMyDbl.g:112:1: ruleCreateTableInstruction : ( ( rule__CreateTableInstruction__Group__0 ) ) ;
    public final void ruleCreateTableInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:116:2: ( ( ( rule__CreateTableInstruction__Group__0 ) ) )
            // InternalMyDbl.g:117:2: ( ( rule__CreateTableInstruction__Group__0 ) )
            {
            // InternalMyDbl.g:117:2: ( ( rule__CreateTableInstruction__Group__0 ) )
            // InternalMyDbl.g:118:3: ( rule__CreateTableInstruction__Group__0 )
            {
             before(grammarAccess.getCreateTableInstructionAccess().getGroup()); 
            // InternalMyDbl.g:119:3: ( rule__CreateTableInstruction__Group__0 )
            // InternalMyDbl.g:119:4: rule__CreateTableInstruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableInstruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateTableInstruction"


    // $ANTLR start "entryRuleTable"
    // InternalMyDbl.g:128:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalMyDbl.g:129:1: ( ruleTable EOF )
            // InternalMyDbl.g:130:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDbl.g:137:1: ruleTable : ( ( rule__Table__NameAssignment ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:141:2: ( ( ( rule__Table__NameAssignment ) ) )
            // InternalMyDbl.g:142:2: ( ( rule__Table__NameAssignment ) )
            {
            // InternalMyDbl.g:142:2: ( ( rule__Table__NameAssignment ) )
            // InternalMyDbl.g:143:3: ( rule__Table__NameAssignment )
            {
             before(grammarAccess.getTableAccess().getNameAssignment()); 
            // InternalMyDbl.g:144:3: ( rule__Table__NameAssignment )
            // InternalMyDbl.g:144:4: rule__Table__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleCreateElementInstruction"
    // InternalMyDbl.g:153:1: entryRuleCreateElementInstruction : ruleCreateElementInstruction EOF ;
    public final void entryRuleCreateElementInstruction() throws RecognitionException {
        try {
            // InternalMyDbl.g:154:1: ( ruleCreateElementInstruction EOF )
            // InternalMyDbl.g:155:1: ruleCreateElementInstruction EOF
            {
             before(grammarAccess.getCreateElementInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateElementInstruction();

            state._fsp--;

             after(grammarAccess.getCreateElementInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreateElementInstruction"


    // $ANTLR start "ruleCreateElementInstruction"
    // InternalMyDbl.g:162:1: ruleCreateElementInstruction : ( ( rule__CreateElementInstruction__Group__0 ) ) ;
    public final void ruleCreateElementInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:166:2: ( ( ( rule__CreateElementInstruction__Group__0 ) ) )
            // InternalMyDbl.g:167:2: ( ( rule__CreateElementInstruction__Group__0 ) )
            {
            // InternalMyDbl.g:167:2: ( ( rule__CreateElementInstruction__Group__0 ) )
            // InternalMyDbl.g:168:3: ( rule__CreateElementInstruction__Group__0 )
            {
             before(grammarAccess.getCreateElementInstructionAccess().getGroup()); 
            // InternalMyDbl.g:169:3: ( rule__CreateElementInstruction__Group__0 )
            // InternalMyDbl.g:169:4: rule__CreateElementInstruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateElementInstruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateElementInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateElementInstruction"


    // $ANTLR start "entryRuleElement"
    // InternalMyDbl.g:178:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDbl.g:179:1: ( ruleElement EOF )
            // InternalMyDbl.g:180:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDbl.g:187:1: ruleElement : ( ( rule__Element__NameAssignment ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:191:2: ( ( ( rule__Element__NameAssignment ) ) )
            // InternalMyDbl.g:192:2: ( ( rule__Element__NameAssignment ) )
            {
            // InternalMyDbl.g:192:2: ( ( rule__Element__NameAssignment ) )
            // InternalMyDbl.g:193:3: ( rule__Element__NameAssignment )
            {
             before(grammarAccess.getElementAccess().getNameAssignment()); 
            // InternalMyDbl.g:194:3: ( rule__Element__NameAssignment )
            // InternalMyDbl.g:194:4: rule__Element__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Element__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCreateAttributeInstruction"
    // InternalMyDbl.g:203:1: entryRuleCreateAttributeInstruction : ruleCreateAttributeInstruction EOF ;
    public final void entryRuleCreateAttributeInstruction() throws RecognitionException {
        try {
            // InternalMyDbl.g:204:1: ( ruleCreateAttributeInstruction EOF )
            // InternalMyDbl.g:205:1: ruleCreateAttributeInstruction EOF
            {
             before(grammarAccess.getCreateAttributeInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleCreateAttributeInstruction();

            state._fsp--;

             after(grammarAccess.getCreateAttributeInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreateAttributeInstruction"


    // $ANTLR start "ruleCreateAttributeInstruction"
    // InternalMyDbl.g:212:1: ruleCreateAttributeInstruction : ( ( rule__CreateAttributeInstruction__Group__0 ) ) ;
    public final void ruleCreateAttributeInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:216:2: ( ( ( rule__CreateAttributeInstruction__Group__0 ) ) )
            // InternalMyDbl.g:217:2: ( ( rule__CreateAttributeInstruction__Group__0 ) )
            {
            // InternalMyDbl.g:217:2: ( ( rule__CreateAttributeInstruction__Group__0 ) )
            // InternalMyDbl.g:218:3: ( rule__CreateAttributeInstruction__Group__0 )
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getGroup()); 
            // InternalMyDbl.g:219:3: ( rule__CreateAttributeInstruction__Group__0 )
            // InternalMyDbl.g:219:4: rule__CreateAttributeInstruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAttributeInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreateAttributeInstruction"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDbl.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDbl.g:229:1: ( ruleAttribute EOF )
            // InternalMyDbl.g:230:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDbl.g:237:1: ruleAttribute : ( ( rule__Attribute__NameAssignment ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:241:2: ( ( ( rule__Attribute__NameAssignment ) ) )
            // InternalMyDbl.g:242:2: ( ( rule__Attribute__NameAssignment ) )
            {
            // InternalMyDbl.g:242:2: ( ( rule__Attribute__NameAssignment ) )
            // InternalMyDbl.g:243:3: ( rule__Attribute__NameAssignment )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment()); 
            // InternalMyDbl.g:244:3: ( rule__Attribute__NameAssignment )
            // InternalMyDbl.g:244:4: rule__Attribute__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalMyDbl.g:253:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalMyDbl.g:254:1: ( ruleAttributeType EOF )
            // InternalMyDbl.g:255:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalMyDbl.g:262:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:266:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalMyDbl.g:267:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalMyDbl.g:267:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalMyDbl.g:268:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalMyDbl.g:269:3: ( rule__AttributeType__Alternatives )
            // InternalMyDbl.g:269:4: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleBasicVar"
    // InternalMyDbl.g:278:1: entryRuleBasicVar : ruleBasicVar EOF ;
    public final void entryRuleBasicVar() throws RecognitionException {
        try {
            // InternalMyDbl.g:279:1: ( ruleBasicVar EOF )
            // InternalMyDbl.g:280:1: ruleBasicVar EOF
            {
             before(grammarAccess.getBasicVarRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicVar();

            state._fsp--;

             after(grammarAccess.getBasicVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicVar"


    // $ANTLR start "ruleBasicVar"
    // InternalMyDbl.g:287:1: ruleBasicVar : ( ( rule__BasicVar__Alternatives ) ) ;
    public final void ruleBasicVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:291:2: ( ( ( rule__BasicVar__Alternatives ) ) )
            // InternalMyDbl.g:292:2: ( ( rule__BasicVar__Alternatives ) )
            {
            // InternalMyDbl.g:292:2: ( ( rule__BasicVar__Alternatives ) )
            // InternalMyDbl.g:293:3: ( rule__BasicVar__Alternatives )
            {
             before(grammarAccess.getBasicVarAccess().getAlternatives()); 
            // InternalMyDbl.g:294:3: ( rule__BasicVar__Alternatives )
            // InternalMyDbl.g:294:4: rule__BasicVar__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicVar__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicVarAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicVar"


    // $ANTLR start "entryRuleAddInstruction"
    // InternalMyDbl.g:303:1: entryRuleAddInstruction : ruleAddInstruction EOF ;
    public final void entryRuleAddInstruction() throws RecognitionException {
        try {
            // InternalMyDbl.g:304:1: ( ruleAddInstruction EOF )
            // InternalMyDbl.g:305:1: ruleAddInstruction EOF
            {
             before(grammarAccess.getAddInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddInstruction();

            state._fsp--;

             after(grammarAccess.getAddInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddInstruction"


    // $ANTLR start "ruleAddInstruction"
    // InternalMyDbl.g:312:1: ruleAddInstruction : ( ( rule__AddInstruction__Group__0 ) ) ;
    public final void ruleAddInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:316:2: ( ( ( rule__AddInstruction__Group__0 ) ) )
            // InternalMyDbl.g:317:2: ( ( rule__AddInstruction__Group__0 ) )
            {
            // InternalMyDbl.g:317:2: ( ( rule__AddInstruction__Group__0 ) )
            // InternalMyDbl.g:318:3: ( rule__AddInstruction__Group__0 )
            {
             before(grammarAccess.getAddInstructionAccess().getGroup()); 
            // InternalMyDbl.g:319:3: ( rule__AddInstruction__Group__0 )
            // InternalMyDbl.g:319:4: rule__AddInstruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddInstruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddInstruction"


    // $ANTLR start "entryRuleInsertInstruction"
    // InternalMyDbl.g:328:1: entryRuleInsertInstruction : ruleInsertInstruction EOF ;
    public final void entryRuleInsertInstruction() throws RecognitionException {
        try {
            // InternalMyDbl.g:329:1: ( ruleInsertInstruction EOF )
            // InternalMyDbl.g:330:1: ruleInsertInstruction EOF
            {
             before(grammarAccess.getInsertInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertInstruction();

            state._fsp--;

             after(grammarAccess.getInsertInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsertInstruction"


    // $ANTLR start "ruleInsertInstruction"
    // InternalMyDbl.g:337:1: ruleInsertInstruction : ( ( rule__InsertInstruction__Group__0 ) ) ;
    public final void ruleInsertInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:341:2: ( ( ( rule__InsertInstruction__Group__0 ) ) )
            // InternalMyDbl.g:342:2: ( ( rule__InsertInstruction__Group__0 ) )
            {
            // InternalMyDbl.g:342:2: ( ( rule__InsertInstruction__Group__0 ) )
            // InternalMyDbl.g:343:3: ( rule__InsertInstruction__Group__0 )
            {
             before(grammarAccess.getInsertInstructionAccess().getGroup()); 
            // InternalMyDbl.g:344:3: ( rule__InsertInstruction__Group__0 )
            // InternalMyDbl.g:344:4: rule__InsertInstruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertInstruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsertInstruction"


    // $ANTLR start "entryRuleSetAttributeInstruction"
    // InternalMyDbl.g:353:1: entryRuleSetAttributeInstruction : ruleSetAttributeInstruction EOF ;
    public final void entryRuleSetAttributeInstruction() throws RecognitionException {
        try {
            // InternalMyDbl.g:354:1: ( ruleSetAttributeInstruction EOF )
            // InternalMyDbl.g:355:1: ruleSetAttributeInstruction EOF
            {
             before(grammarAccess.getSetAttributeInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleSetAttributeInstruction();

            state._fsp--;

             after(grammarAccess.getSetAttributeInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSetAttributeInstruction"


    // $ANTLR start "ruleSetAttributeInstruction"
    // InternalMyDbl.g:362:1: ruleSetAttributeInstruction : ( ( rule__SetAttributeInstruction__Group__0 ) ) ;
    public final void ruleSetAttributeInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:366:2: ( ( ( rule__SetAttributeInstruction__Group__0 ) ) )
            // InternalMyDbl.g:367:2: ( ( rule__SetAttributeInstruction__Group__0 ) )
            {
            // InternalMyDbl.g:367:2: ( ( rule__SetAttributeInstruction__Group__0 ) )
            // InternalMyDbl.g:368:3: ( rule__SetAttributeInstruction__Group__0 )
            {
             before(grammarAccess.getSetAttributeInstructionAccess().getGroup()); 
            // InternalMyDbl.g:369:3: ( rule__SetAttributeInstruction__Group__0 )
            // InternalMyDbl.g:369:4: rule__SetAttributeInstruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetAttributeInstruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAttributeInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetAttributeInstruction"


    // $ANTLR start "entryRuleFindInstruction"
    // InternalMyDbl.g:378:1: entryRuleFindInstruction : ruleFindInstruction EOF ;
    public final void entryRuleFindInstruction() throws RecognitionException {
        try {
            // InternalMyDbl.g:379:1: ( ruleFindInstruction EOF )
            // InternalMyDbl.g:380:1: ruleFindInstruction EOF
            {
             before(grammarAccess.getFindInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleFindInstruction();

            state._fsp--;

             after(grammarAccess.getFindInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFindInstruction"


    // $ANTLR start "ruleFindInstruction"
    // InternalMyDbl.g:387:1: ruleFindInstruction : ( ( rule__FindInstruction__Group__0 ) ) ;
    public final void ruleFindInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:391:2: ( ( ( rule__FindInstruction__Group__0 ) ) )
            // InternalMyDbl.g:392:2: ( ( rule__FindInstruction__Group__0 ) )
            {
            // InternalMyDbl.g:392:2: ( ( rule__FindInstruction__Group__0 ) )
            // InternalMyDbl.g:393:3: ( rule__FindInstruction__Group__0 )
            {
             before(grammarAccess.getFindInstructionAccess().getGroup()); 
            // InternalMyDbl.g:394:3: ( rule__FindInstruction__Group__0 )
            // InternalMyDbl.g:394:4: rule__FindInstruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FindInstruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFindInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFindInstruction"


    // $ANTLR start "entryRuleSingleElement"
    // InternalMyDbl.g:403:1: entryRuleSingleElement : ruleSingleElement EOF ;
    public final void entryRuleSingleElement() throws RecognitionException {
        try {
            // InternalMyDbl.g:404:1: ( ruleSingleElement EOF )
            // InternalMyDbl.g:405:1: ruleSingleElement EOF
            {
             before(grammarAccess.getSingleElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleElement();

            state._fsp--;

             after(grammarAccess.getSingleElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleElement"


    // $ANTLR start "ruleSingleElement"
    // InternalMyDbl.g:412:1: ruleSingleElement : ( ( rule__SingleElement__Group__0 ) ) ;
    public final void ruleSingleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:416:2: ( ( ( rule__SingleElement__Group__0 ) ) )
            // InternalMyDbl.g:417:2: ( ( rule__SingleElement__Group__0 ) )
            {
            // InternalMyDbl.g:417:2: ( ( rule__SingleElement__Group__0 ) )
            // InternalMyDbl.g:418:3: ( rule__SingleElement__Group__0 )
            {
             before(grammarAccess.getSingleElementAccess().getGroup()); 
            // InternalMyDbl.g:419:3: ( rule__SingleElement__Group__0 )
            // InternalMyDbl.g:419:4: rule__SingleElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleElement"


    // $ANTLR start "entryRuleTarget"
    // InternalMyDbl.g:428:1: entryRuleTarget : ruleTarget EOF ;
    public final void entryRuleTarget() throws RecognitionException {
        try {
            // InternalMyDbl.g:429:1: ( ruleTarget EOF )
            // InternalMyDbl.g:430:1: ruleTarget EOF
            {
             before(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getTargetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalMyDbl.g:437:1: ruleTarget : ( ( rule__Target__Group__0 ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:441:2: ( ( ( rule__Target__Group__0 ) ) )
            // InternalMyDbl.g:442:2: ( ( rule__Target__Group__0 ) )
            {
            // InternalMyDbl.g:442:2: ( ( rule__Target__Group__0 ) )
            // InternalMyDbl.g:443:3: ( rule__Target__Group__0 )
            {
             before(grammarAccess.getTargetAccess().getGroup()); 
            // InternalMyDbl.g:444:3: ( rule__Target__Group__0 )
            // InternalMyDbl.g:444:4: rule__Target__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleJointElement"
    // InternalMyDbl.g:453:1: entryRuleJointElement : ruleJointElement EOF ;
    public final void entryRuleJointElement() throws RecognitionException {
        try {
            // InternalMyDbl.g:454:1: ( ruleJointElement EOF )
            // InternalMyDbl.g:455:1: ruleJointElement EOF
            {
             before(grammarAccess.getJointElementRule()); 
            pushFollow(FOLLOW_1);
            ruleJointElement();

            state._fsp--;

             after(grammarAccess.getJointElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJointElement"


    // $ANTLR start "ruleJointElement"
    // InternalMyDbl.g:462:1: ruleJointElement : ( ( rule__JointElement__Group__0 ) ) ;
    public final void ruleJointElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:466:2: ( ( ( rule__JointElement__Group__0 ) ) )
            // InternalMyDbl.g:467:2: ( ( rule__JointElement__Group__0 ) )
            {
            // InternalMyDbl.g:467:2: ( ( rule__JointElement__Group__0 ) )
            // InternalMyDbl.g:468:3: ( rule__JointElement__Group__0 )
            {
             before(grammarAccess.getJointElementAccess().getGroup()); 
            // InternalMyDbl.g:469:3: ( rule__JointElement__Group__0 )
            // InternalMyDbl.g:469:4: rule__JointElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JointElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointElement"


    // $ANTLR start "entryRuleSingleCondition"
    // InternalMyDbl.g:478:1: entryRuleSingleCondition : ruleSingleCondition EOF ;
    public final void entryRuleSingleCondition() throws RecognitionException {
        try {
            // InternalMyDbl.g:479:1: ( ruleSingleCondition EOF )
            // InternalMyDbl.g:480:1: ruleSingleCondition EOF
            {
             before(grammarAccess.getSingleConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleCondition();

            state._fsp--;

             after(grammarAccess.getSingleConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleCondition"


    // $ANTLR start "ruleSingleCondition"
    // InternalMyDbl.g:487:1: ruleSingleCondition : ( ( rule__SingleCondition__Group__0 ) ) ;
    public final void ruleSingleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:491:2: ( ( ( rule__SingleCondition__Group__0 ) ) )
            // InternalMyDbl.g:492:2: ( ( rule__SingleCondition__Group__0 ) )
            {
            // InternalMyDbl.g:492:2: ( ( rule__SingleCondition__Group__0 ) )
            // InternalMyDbl.g:493:3: ( rule__SingleCondition__Group__0 )
            {
             before(grammarAccess.getSingleConditionAccess().getGroup()); 
            // InternalMyDbl.g:494:3: ( rule__SingleCondition__Group__0 )
            // InternalMyDbl.g:494:4: rule__SingleCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleCondition"


    // $ANTLR start "entryRuleJointCondition"
    // InternalMyDbl.g:503:1: entryRuleJointCondition : ruleJointCondition EOF ;
    public final void entryRuleJointCondition() throws RecognitionException {
        try {
            // InternalMyDbl.g:504:1: ( ruleJointCondition EOF )
            // InternalMyDbl.g:505:1: ruleJointCondition EOF
            {
             before(grammarAccess.getJointConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleJointCondition();

            state._fsp--;

             after(grammarAccess.getJointConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJointCondition"


    // $ANTLR start "ruleJointCondition"
    // InternalMyDbl.g:512:1: ruleJointCondition : ( ( rule__JointCondition__Group__0 ) ) ;
    public final void ruleJointCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:516:2: ( ( ( rule__JointCondition__Group__0 ) ) )
            // InternalMyDbl.g:517:2: ( ( rule__JointCondition__Group__0 ) )
            {
            // InternalMyDbl.g:517:2: ( ( rule__JointCondition__Group__0 ) )
            // InternalMyDbl.g:518:3: ( rule__JointCondition__Group__0 )
            {
             before(grammarAccess.getJointConditionAccess().getGroup()); 
            // InternalMyDbl.g:519:3: ( rule__JointCondition__Group__0 )
            // InternalMyDbl.g:519:4: rule__JointCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JointCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointCondition"


    // $ANTLR start "entryRuleSingleConditionUnit"
    // InternalMyDbl.g:528:1: entryRuleSingleConditionUnit : ruleSingleConditionUnit EOF ;
    public final void entryRuleSingleConditionUnit() throws RecognitionException {
        try {
            // InternalMyDbl.g:529:1: ( ruleSingleConditionUnit EOF )
            // InternalMyDbl.g:530:1: ruleSingleConditionUnit EOF
            {
             before(grammarAccess.getSingleConditionUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleConditionUnit();

            state._fsp--;

             after(grammarAccess.getSingleConditionUnitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleConditionUnit"


    // $ANTLR start "ruleSingleConditionUnit"
    // InternalMyDbl.g:537:1: ruleSingleConditionUnit : ( ( rule__SingleConditionUnit__Group__0 ) ) ;
    public final void ruleSingleConditionUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:541:2: ( ( ( rule__SingleConditionUnit__Group__0 ) ) )
            // InternalMyDbl.g:542:2: ( ( rule__SingleConditionUnit__Group__0 ) )
            {
            // InternalMyDbl.g:542:2: ( ( rule__SingleConditionUnit__Group__0 ) )
            // InternalMyDbl.g:543:3: ( rule__SingleConditionUnit__Group__0 )
            {
             before(grammarAccess.getSingleConditionUnitAccess().getGroup()); 
            // InternalMyDbl.g:544:3: ( rule__SingleConditionUnit__Group__0 )
            // InternalMyDbl.g:544:4: rule__SingleConditionUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleConditionUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleConditionUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleConditionUnit"


    // $ANTLR start "entryRuleJointConditionUnit"
    // InternalMyDbl.g:553:1: entryRuleJointConditionUnit : ruleJointConditionUnit EOF ;
    public final void entryRuleJointConditionUnit() throws RecognitionException {
        try {
            // InternalMyDbl.g:554:1: ( ruleJointConditionUnit EOF )
            // InternalMyDbl.g:555:1: ruleJointConditionUnit EOF
            {
             before(grammarAccess.getJointConditionUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleJointConditionUnit();

            state._fsp--;

             after(grammarAccess.getJointConditionUnitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJointConditionUnit"


    // $ANTLR start "ruleJointConditionUnit"
    // InternalMyDbl.g:562:1: ruleJointConditionUnit : ( ( rule__JointConditionUnit__Group__0 ) ) ;
    public final void ruleJointConditionUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:566:2: ( ( ( rule__JointConditionUnit__Group__0 ) ) )
            // InternalMyDbl.g:567:2: ( ( rule__JointConditionUnit__Group__0 ) )
            {
            // InternalMyDbl.g:567:2: ( ( rule__JointConditionUnit__Group__0 ) )
            // InternalMyDbl.g:568:3: ( rule__JointConditionUnit__Group__0 )
            {
             before(grammarAccess.getJointConditionUnitAccess().getGroup()); 
            // InternalMyDbl.g:569:3: ( rule__JointConditionUnit__Group__0 )
            // InternalMyDbl.g:569:4: rule__JointConditionUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JointConditionUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointConditionUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointConditionUnit"


    // $ANTLR start "entryRuleAttributeOfElement"
    // InternalMyDbl.g:578:1: entryRuleAttributeOfElement : ruleAttributeOfElement EOF ;
    public final void entryRuleAttributeOfElement() throws RecognitionException {
        try {
            // InternalMyDbl.g:579:1: ( ruleAttributeOfElement EOF )
            // InternalMyDbl.g:580:1: ruleAttributeOfElement EOF
            {
             before(grammarAccess.getAttributeOfElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeOfElement();

            state._fsp--;

             after(grammarAccess.getAttributeOfElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeOfElement"


    // $ANTLR start "ruleAttributeOfElement"
    // InternalMyDbl.g:587:1: ruleAttributeOfElement : ( ( rule__AttributeOfElement__Group__0 ) ) ;
    public final void ruleAttributeOfElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:591:2: ( ( ( rule__AttributeOfElement__Group__0 ) ) )
            // InternalMyDbl.g:592:2: ( ( rule__AttributeOfElement__Group__0 ) )
            {
            // InternalMyDbl.g:592:2: ( ( rule__AttributeOfElement__Group__0 ) )
            // InternalMyDbl.g:593:3: ( rule__AttributeOfElement__Group__0 )
            {
             before(grammarAccess.getAttributeOfElementAccess().getGroup()); 
            // InternalMyDbl.g:594:3: ( rule__AttributeOfElement__Group__0 )
            // InternalMyDbl.g:594:4: rule__AttributeOfElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOfElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeOfElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeOfElement"


    // $ANTLR start "entryRuleJudgement"
    // InternalMyDbl.g:603:1: entryRuleJudgement : ruleJudgement EOF ;
    public final void entryRuleJudgement() throws RecognitionException {
        try {
            // InternalMyDbl.g:604:1: ( ruleJudgement EOF )
            // InternalMyDbl.g:605:1: ruleJudgement EOF
            {
             before(grammarAccess.getJudgementRule()); 
            pushFollow(FOLLOW_1);
            ruleJudgement();

            state._fsp--;

             after(grammarAccess.getJudgementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJudgement"


    // $ANTLR start "ruleJudgement"
    // InternalMyDbl.g:612:1: ruleJudgement : ( ( rule__Judgement__Alternatives ) ) ;
    public final void ruleJudgement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:616:2: ( ( ( rule__Judgement__Alternatives ) ) )
            // InternalMyDbl.g:617:2: ( ( rule__Judgement__Alternatives ) )
            {
            // InternalMyDbl.g:617:2: ( ( rule__Judgement__Alternatives ) )
            // InternalMyDbl.g:618:3: ( rule__Judgement__Alternatives )
            {
             before(grammarAccess.getJudgementAccess().getAlternatives()); 
            // InternalMyDbl.g:619:3: ( rule__Judgement__Alternatives )
            // InternalMyDbl.g:619:4: rule__Judgement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Judgement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJudgementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJudgement"


    // $ANTLR start "entryRuleDeleteInstruction"
    // InternalMyDbl.g:628:1: entryRuleDeleteInstruction : ruleDeleteInstruction EOF ;
    public final void entryRuleDeleteInstruction() throws RecognitionException {
        try {
            // InternalMyDbl.g:629:1: ( ruleDeleteInstruction EOF )
            // InternalMyDbl.g:630:1: ruleDeleteInstruction EOF
            {
             before(grammarAccess.getDeleteInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteInstruction();

            state._fsp--;

             after(grammarAccess.getDeleteInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeleteInstruction"


    // $ANTLR start "ruleDeleteInstruction"
    // InternalMyDbl.g:637:1: ruleDeleteInstruction : ( ( rule__DeleteInstruction__Group__0 ) ) ;
    public final void ruleDeleteInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:641:2: ( ( ( rule__DeleteInstruction__Group__0 ) ) )
            // InternalMyDbl.g:642:2: ( ( rule__DeleteInstruction__Group__0 ) )
            {
            // InternalMyDbl.g:642:2: ( ( rule__DeleteInstruction__Group__0 ) )
            // InternalMyDbl.g:643:3: ( rule__DeleteInstruction__Group__0 )
            {
             before(grammarAccess.getDeleteInstructionAccess().getGroup()); 
            // InternalMyDbl.g:644:3: ( rule__DeleteInstruction__Group__0 )
            // InternalMyDbl.g:644:4: rule__DeleteInstruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteInstruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeleteInstruction"


    // $ANTLR start "rule__Instructions__Alternatives"
    // InternalMyDbl.g:652:1: rule__Instructions__Alternatives : ( ( ruleCreateTableInstruction ) | ( ruleCreateElementInstruction ) | ( ruleCreateAttributeInstruction ) | ( ruleAddInstruction ) | ( ruleFindInstruction ) | ( ruleDeleteInstruction ) );
    public final void rule__Instructions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:656:1: ( ( ruleCreateTableInstruction ) | ( ruleCreateElementInstruction ) | ( ruleCreateAttributeInstruction ) | ( ruleAddInstruction ) | ( ruleFindInstruction ) | ( ruleDeleteInstruction ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 35:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            case 42:
                {
                alt1=4;
                }
                break;
            case 44:
                {
                alt1=5;
                }
                break;
            case 54:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDbl.g:657:2: ( ruleCreateTableInstruction )
                    {
                    // InternalMyDbl.g:657:2: ( ruleCreateTableInstruction )
                    // InternalMyDbl.g:658:3: ruleCreateTableInstruction
                    {
                     before(grammarAccess.getInstructionsAccess().getCreateTableInstructionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateTableInstruction();

                    state._fsp--;

                     after(grammarAccess.getInstructionsAccess().getCreateTableInstructionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:663:2: ( ruleCreateElementInstruction )
                    {
                    // InternalMyDbl.g:663:2: ( ruleCreateElementInstruction )
                    // InternalMyDbl.g:664:3: ruleCreateElementInstruction
                    {
                     before(grammarAccess.getInstructionsAccess().getCreateElementInstructionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateElementInstruction();

                    state._fsp--;

                     after(grammarAccess.getInstructionsAccess().getCreateElementInstructionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDbl.g:669:2: ( ruleCreateAttributeInstruction )
                    {
                    // InternalMyDbl.g:669:2: ( ruleCreateAttributeInstruction )
                    // InternalMyDbl.g:670:3: ruleCreateAttributeInstruction
                    {
                     before(grammarAccess.getInstructionsAccess().getCreateAttributeInstructionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCreateAttributeInstruction();

                    state._fsp--;

                     after(grammarAccess.getInstructionsAccess().getCreateAttributeInstructionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDbl.g:675:2: ( ruleAddInstruction )
                    {
                    // InternalMyDbl.g:675:2: ( ruleAddInstruction )
                    // InternalMyDbl.g:676:3: ruleAddInstruction
                    {
                     before(grammarAccess.getInstructionsAccess().getAddInstructionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAddInstruction();

                    state._fsp--;

                     after(grammarAccess.getInstructionsAccess().getAddInstructionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDbl.g:681:2: ( ruleFindInstruction )
                    {
                    // InternalMyDbl.g:681:2: ( ruleFindInstruction )
                    // InternalMyDbl.g:682:3: ruleFindInstruction
                    {
                     before(grammarAccess.getInstructionsAccess().getFindInstructionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFindInstruction();

                    state._fsp--;

                     after(grammarAccess.getInstructionsAccess().getFindInstructionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDbl.g:687:2: ( ruleDeleteInstruction )
                    {
                    // InternalMyDbl.g:687:2: ( ruleDeleteInstruction )
                    // InternalMyDbl.g:688:3: ruleDeleteInstruction
                    {
                     before(grammarAccess.getInstructionsAccess().getDeleteInstructionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteInstruction();

                    state._fsp--;

                     after(grammarAccess.getInstructionsAccess().getDeleteInstructionParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalMyDbl.g:697:1: rule__AttributeType__Alternatives : ( ( 'Binary' ) | ( 'Varbinary' ) | ( 'Image' ) | ( 'Char' ) | ( 'Varchar' ) | ( 'Text' ) | ( 'Nchar' ) | ( 'Nvarchar' ) | ( 'Ntext' ) | ( 'Datetime' ) | ( 'Smalldatetime' ) | ( 'Date' ) | ( 'TimeStamp' ) | ( 'Integer' ) | ( 'Double' ) | ( 'Float' ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:701:1: ( ( 'Binary' ) | ( 'Varbinary' ) | ( 'Image' ) | ( 'Char' ) | ( 'Varchar' ) | ( 'Text' ) | ( 'Nchar' ) | ( 'Nvarchar' ) | ( 'Ntext' ) | ( 'Datetime' ) | ( 'Smalldatetime' ) | ( 'Date' ) | ( 'TimeStamp' ) | ( 'Integer' ) | ( 'Double' ) | ( 'Float' ) )
            int alt2=16;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            case 22:
                {
                alt2=12;
                }
                break;
            case 23:
                {
                alt2=13;
                }
                break;
            case 24:
                {
                alt2=14;
                }
                break;
            case 25:
                {
                alt2=15;
                }
                break;
            case 26:
                {
                alt2=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDbl.g:702:2: ( 'Binary' )
                    {
                    // InternalMyDbl.g:702:2: ( 'Binary' )
                    // InternalMyDbl.g:703:3: 'Binary'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getBinaryKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getBinaryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:708:2: ( 'Varbinary' )
                    {
                    // InternalMyDbl.g:708:2: ( 'Varbinary' )
                    // InternalMyDbl.g:709:3: 'Varbinary'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getVarbinaryKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getVarbinaryKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDbl.g:714:2: ( 'Image' )
                    {
                    // InternalMyDbl.g:714:2: ( 'Image' )
                    // InternalMyDbl.g:715:3: 'Image'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getImageKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getImageKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDbl.g:720:2: ( 'Char' )
                    {
                    // InternalMyDbl.g:720:2: ( 'Char' )
                    // InternalMyDbl.g:721:3: 'Char'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getCharKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getCharKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDbl.g:726:2: ( 'Varchar' )
                    {
                    // InternalMyDbl.g:726:2: ( 'Varchar' )
                    // InternalMyDbl.g:727:3: 'Varchar'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getVarcharKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getVarcharKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDbl.g:732:2: ( 'Text' )
                    {
                    // InternalMyDbl.g:732:2: ( 'Text' )
                    // InternalMyDbl.g:733:3: 'Text'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getTextKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getTextKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDbl.g:738:2: ( 'Nchar' )
                    {
                    // InternalMyDbl.g:738:2: ( 'Nchar' )
                    // InternalMyDbl.g:739:3: 'Nchar'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNcharKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getNcharKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDbl.g:744:2: ( 'Nvarchar' )
                    {
                    // InternalMyDbl.g:744:2: ( 'Nvarchar' )
                    // InternalMyDbl.g:745:3: 'Nvarchar'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNvarcharKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getNvarcharKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDbl.g:750:2: ( 'Ntext' )
                    {
                    // InternalMyDbl.g:750:2: ( 'Ntext' )
                    // InternalMyDbl.g:751:3: 'Ntext'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNtextKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getNtextKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDbl.g:756:2: ( 'Datetime' )
                    {
                    // InternalMyDbl.g:756:2: ( 'Datetime' )
                    // InternalMyDbl.g:757:3: 'Datetime'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDatetimeKeyword_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getDatetimeKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDbl.g:762:2: ( 'Smalldatetime' )
                    {
                    // InternalMyDbl.g:762:2: ( 'Smalldatetime' )
                    // InternalMyDbl.g:763:3: 'Smalldatetime'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getSmalldatetimeKeyword_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getSmalldatetimeKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDbl.g:768:2: ( 'Date' )
                    {
                    // InternalMyDbl.g:768:2: ( 'Date' )
                    // InternalMyDbl.g:769:3: 'Date'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDateKeyword_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getDateKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDbl.g:774:2: ( 'TimeStamp' )
                    {
                    // InternalMyDbl.g:774:2: ( 'TimeStamp' )
                    // InternalMyDbl.g:775:3: 'TimeStamp'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getTimeStampKeyword_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getTimeStampKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDbl.g:780:2: ( 'Integer' )
                    {
                    // InternalMyDbl.g:780:2: ( 'Integer' )
                    // InternalMyDbl.g:781:3: 'Integer'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIntegerKeyword_13()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getIntegerKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDbl.g:786:2: ( 'Double' )
                    {
                    // InternalMyDbl.g:786:2: ( 'Double' )
                    // InternalMyDbl.g:787:3: 'Double'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDoubleKeyword_14()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getDoubleKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyDbl.g:792:2: ( 'Float' )
                    {
                    // InternalMyDbl.g:792:2: ( 'Float' )
                    // InternalMyDbl.g:793:3: 'Float'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getFloatKeyword_15()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getFloatKeyword_15()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__BasicVar__Alternatives"
    // InternalMyDbl.g:802:1: rule__BasicVar__Alternatives : ( ( ( rule__BasicVar__IntegerAssignment_0 ) ) | ( ( rule__BasicVar__StringAssignment_1 ) ) );
    public final void rule__BasicVar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:806:1: ( ( ( rule__BasicVar__IntegerAssignment_0 ) ) | ( ( rule__BasicVar__StringAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDbl.g:807:2: ( ( rule__BasicVar__IntegerAssignment_0 ) )
                    {
                    // InternalMyDbl.g:807:2: ( ( rule__BasicVar__IntegerAssignment_0 ) )
                    // InternalMyDbl.g:808:3: ( rule__BasicVar__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getBasicVarAccess().getIntegerAssignment_0()); 
                    // InternalMyDbl.g:809:3: ( rule__BasicVar__IntegerAssignment_0 )
                    // InternalMyDbl.g:809:4: rule__BasicVar__IntegerAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicVar__IntegerAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicVarAccess().getIntegerAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:813:2: ( ( rule__BasicVar__StringAssignment_1 ) )
                    {
                    // InternalMyDbl.g:813:2: ( ( rule__BasicVar__StringAssignment_1 ) )
                    // InternalMyDbl.g:814:3: ( rule__BasicVar__StringAssignment_1 )
                    {
                     before(grammarAccess.getBasicVarAccess().getStringAssignment_1()); 
                    // InternalMyDbl.g:815:3: ( rule__BasicVar__StringAssignment_1 )
                    // InternalMyDbl.g:815:4: rule__BasicVar__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicVar__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicVarAccess().getStringAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicVar__Alternatives"


    // $ANTLR start "rule__FindInstruction__Alternatives_2"
    // InternalMyDbl.g:823:1: rule__FindInstruction__Alternatives_2 : ( ( ruleSingleElement ) | ( ruleJointElement ) );
    public final void rule__FindInstruction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:827:1: ( ( ruleSingleElement ) | ( ruleJointElement ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==RULE_ID||LA4_1==30||LA4_1==35||LA4_1==39||LA4_1==42||LA4_1==44||LA4_1==54) ) {
                    alt4=1;
                }
                else if ( (LA4_1==43) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDbl.g:828:2: ( ruleSingleElement )
                    {
                    // InternalMyDbl.g:828:2: ( ruleSingleElement )
                    // InternalMyDbl.g:829:3: ruleSingleElement
                    {
                     before(grammarAccess.getFindInstructionAccess().getSingleElementParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleElement();

                    state._fsp--;

                     after(grammarAccess.getFindInstructionAccess().getSingleElementParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:834:2: ( ruleJointElement )
                    {
                    // InternalMyDbl.g:834:2: ( ruleJointElement )
                    // InternalMyDbl.g:835:3: ruleJointElement
                    {
                     before(grammarAccess.getFindInstructionAccess().getJointElementParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJointElement();

                    state._fsp--;

                     after(grammarAccess.getFindInstructionAccess().getJointElementParserRuleCall_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindInstruction__Alternatives_2"


    // $ANTLR start "rule__SingleConditionUnit__Alternatives_2"
    // InternalMyDbl.g:844:1: rule__SingleConditionUnit__Alternatives_2 : ( ( ( rule__SingleConditionUnit__AttributeRightAssignment_2_0 ) ) | ( ( rule__SingleConditionUnit__ValueAssignment_2_1 ) ) );
    public final void rule__SingleConditionUnit__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:848:1: ( ( ( rule__SingleConditionUnit__AttributeRightAssignment_2_0 ) ) | ( ( rule__SingleConditionUnit__ValueAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_STRING)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDbl.g:849:2: ( ( rule__SingleConditionUnit__AttributeRightAssignment_2_0 ) )
                    {
                    // InternalMyDbl.g:849:2: ( ( rule__SingleConditionUnit__AttributeRightAssignment_2_0 ) )
                    // InternalMyDbl.g:850:3: ( rule__SingleConditionUnit__AttributeRightAssignment_2_0 )
                    {
                     before(grammarAccess.getSingleConditionUnitAccess().getAttributeRightAssignment_2_0()); 
                    // InternalMyDbl.g:851:3: ( rule__SingleConditionUnit__AttributeRightAssignment_2_0 )
                    // InternalMyDbl.g:851:4: rule__SingleConditionUnit__AttributeRightAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleConditionUnit__AttributeRightAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleConditionUnitAccess().getAttributeRightAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:855:2: ( ( rule__SingleConditionUnit__ValueAssignment_2_1 ) )
                    {
                    // InternalMyDbl.g:855:2: ( ( rule__SingleConditionUnit__ValueAssignment_2_1 ) )
                    // InternalMyDbl.g:856:3: ( rule__SingleConditionUnit__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getSingleConditionUnitAccess().getValueAssignment_2_1()); 
                    // InternalMyDbl.g:857:3: ( rule__SingleConditionUnit__ValueAssignment_2_1 )
                    // InternalMyDbl.g:857:4: rule__SingleConditionUnit__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleConditionUnit__ValueAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleConditionUnitAccess().getValueAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__Alternatives_2"


    // $ANTLR start "rule__JointConditionUnit__Alternatives_2"
    // InternalMyDbl.g:865:1: rule__JointConditionUnit__Alternatives_2 : ( ( ( rule__JointConditionUnit__ElementRightAssignment_2_0 ) ) | ( ( rule__JointConditionUnit__ValueAssignment_2_1 ) ) );
    public final void rule__JointConditionUnit__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:869:1: ( ( ( rule__JointConditionUnit__ElementRightAssignment_2_0 ) ) | ( ( rule__JointConditionUnit__ValueAssignment_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDbl.g:870:2: ( ( rule__JointConditionUnit__ElementRightAssignment_2_0 ) )
                    {
                    // InternalMyDbl.g:870:2: ( ( rule__JointConditionUnit__ElementRightAssignment_2_0 ) )
                    // InternalMyDbl.g:871:3: ( rule__JointConditionUnit__ElementRightAssignment_2_0 )
                    {
                     before(grammarAccess.getJointConditionUnitAccess().getElementRightAssignment_2_0()); 
                    // InternalMyDbl.g:872:3: ( rule__JointConditionUnit__ElementRightAssignment_2_0 )
                    // InternalMyDbl.g:872:4: rule__JointConditionUnit__ElementRightAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointConditionUnit__ElementRightAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointConditionUnitAccess().getElementRightAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:876:2: ( ( rule__JointConditionUnit__ValueAssignment_2_1 ) )
                    {
                    // InternalMyDbl.g:876:2: ( ( rule__JointConditionUnit__ValueAssignment_2_1 ) )
                    // InternalMyDbl.g:877:3: ( rule__JointConditionUnit__ValueAssignment_2_1 )
                    {
                     before(grammarAccess.getJointConditionUnitAccess().getValueAssignment_2_1()); 
                    // InternalMyDbl.g:878:3: ( rule__JointConditionUnit__ValueAssignment_2_1 )
                    // InternalMyDbl.g:878:4: rule__JointConditionUnit__ValueAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__JointConditionUnit__ValueAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getJointConditionUnitAccess().getValueAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__Alternatives_2"


    // $ANTLR start "rule__Judgement__Alternatives"
    // InternalMyDbl.g:886:1: rule__Judgement__Alternatives : ( ( 'is' ) | ( 'as' ) | ( 'equals' ) | ( ( rule__Judgement__Group_3__0 ) ) | ( ( rule__Judgement__Group_4__0 ) ) | ( ( rule__Judgement__Group_5__0 ) ) | ( ( rule__Judgement__Group_6__0 ) ) | ( ( rule__Judgement__Group_7__0 ) ) | ( ( rule__Judgement__Group_8__0 ) ) );
    public final void rule__Judgement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:890:1: ( ( 'is' ) | ( 'as' ) | ( 'equals' ) | ( ( rule__Judgement__Group_3__0 ) ) | ( ( rule__Judgement__Group_4__0 ) ) | ( ( rule__Judgement__Group_5__0 ) ) | ( ( rule__Judgement__Group_6__0 ) ) | ( ( rule__Judgement__Group_7__0 ) ) | ( ( rule__Judgement__Group_8__0 ) ) )
            int alt7=9;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMyDbl.g:891:2: ( 'is' )
                    {
                    // InternalMyDbl.g:891:2: ( 'is' )
                    // InternalMyDbl.g:892:3: 'is'
                    {
                     before(grammarAccess.getJudgementAccess().getIsKeyword_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getJudgementAccess().getIsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:897:2: ( 'as' )
                    {
                    // InternalMyDbl.g:897:2: ( 'as' )
                    // InternalMyDbl.g:898:3: 'as'
                    {
                     before(grammarAccess.getJudgementAccess().getAsKeyword_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getJudgementAccess().getAsKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDbl.g:903:2: ( 'equals' )
                    {
                    // InternalMyDbl.g:903:2: ( 'equals' )
                    // InternalMyDbl.g:904:3: 'equals'
                    {
                     before(grammarAccess.getJudgementAccess().getEqualsKeyword_2()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getJudgementAccess().getEqualsKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDbl.g:909:2: ( ( rule__Judgement__Group_3__0 ) )
                    {
                    // InternalMyDbl.g:909:2: ( ( rule__Judgement__Group_3__0 ) )
                    // InternalMyDbl.g:910:3: ( rule__Judgement__Group_3__0 )
                    {
                     before(grammarAccess.getJudgementAccess().getGroup_3()); 
                    // InternalMyDbl.g:911:3: ( rule__Judgement__Group_3__0 )
                    // InternalMyDbl.g:911:4: rule__Judgement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Judgement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJudgementAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDbl.g:915:2: ( ( rule__Judgement__Group_4__0 ) )
                    {
                    // InternalMyDbl.g:915:2: ( ( rule__Judgement__Group_4__0 ) )
                    // InternalMyDbl.g:916:3: ( rule__Judgement__Group_4__0 )
                    {
                     before(grammarAccess.getJudgementAccess().getGroup_4()); 
                    // InternalMyDbl.g:917:3: ( rule__Judgement__Group_4__0 )
                    // InternalMyDbl.g:917:4: rule__Judgement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Judgement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJudgementAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDbl.g:921:2: ( ( rule__Judgement__Group_5__0 ) )
                    {
                    // InternalMyDbl.g:921:2: ( ( rule__Judgement__Group_5__0 ) )
                    // InternalMyDbl.g:922:3: ( rule__Judgement__Group_5__0 )
                    {
                     before(grammarAccess.getJudgementAccess().getGroup_5()); 
                    // InternalMyDbl.g:923:3: ( rule__Judgement__Group_5__0 )
                    // InternalMyDbl.g:923:4: rule__Judgement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Judgement__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJudgementAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDbl.g:927:2: ( ( rule__Judgement__Group_6__0 ) )
                    {
                    // InternalMyDbl.g:927:2: ( ( rule__Judgement__Group_6__0 ) )
                    // InternalMyDbl.g:928:3: ( rule__Judgement__Group_6__0 )
                    {
                     before(grammarAccess.getJudgementAccess().getGroup_6()); 
                    // InternalMyDbl.g:929:3: ( rule__Judgement__Group_6__0 )
                    // InternalMyDbl.g:929:4: rule__Judgement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Judgement__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJudgementAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDbl.g:933:2: ( ( rule__Judgement__Group_7__0 ) )
                    {
                    // InternalMyDbl.g:933:2: ( ( rule__Judgement__Group_7__0 ) )
                    // InternalMyDbl.g:934:3: ( rule__Judgement__Group_7__0 )
                    {
                     before(grammarAccess.getJudgementAccess().getGroup_7()); 
                    // InternalMyDbl.g:935:3: ( rule__Judgement__Group_7__0 )
                    // InternalMyDbl.g:935:4: rule__Judgement__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Judgement__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJudgementAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDbl.g:939:2: ( ( rule__Judgement__Group_8__0 ) )
                    {
                    // InternalMyDbl.g:939:2: ( ( rule__Judgement__Group_8__0 ) )
                    // InternalMyDbl.g:940:3: ( rule__Judgement__Group_8__0 )
                    {
                     before(grammarAccess.getJudgementAccess().getGroup_8()); 
                    // InternalMyDbl.g:941:3: ( rule__Judgement__Group_8__0 )
                    // InternalMyDbl.g:941:4: rule__Judgement__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Judgement__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJudgementAccess().getGroup_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Alternatives"


    // $ANTLR start "rule__Database__Group__0"
    // InternalMyDbl.g:949:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:953:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalMyDbl.g:954:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // InternalMyDbl.g:961:1: rule__Database__Group__0__Impl : ( 'create' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:965:1: ( ( 'create' ) )
            // InternalMyDbl.g:966:1: ( 'create' )
            {
            // InternalMyDbl.g:966:1: ( 'create' )
            // InternalMyDbl.g:967:2: 'create'
            {
             before(grammarAccess.getDatabaseAccess().getCreateKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // InternalMyDbl.g:976:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:980:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalMyDbl.g:981:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // InternalMyDbl.g:988:1: rule__Database__Group__1__Impl : ( 'database' ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:992:1: ( ( 'database' ) )
            // InternalMyDbl.g:993:1: ( 'database' )
            {
            // InternalMyDbl.g:993:1: ( 'database' )
            // InternalMyDbl.g:994:2: 'database'
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getDatabaseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // InternalMyDbl.g:1003:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1007:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalMyDbl.g:1008:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // InternalMyDbl.g:1015:1: rule__Database__Group__2__Impl : ( 'named' ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1019:1: ( ( 'named' ) )
            // InternalMyDbl.g:1020:1: ( 'named' )
            {
            // InternalMyDbl.g:1020:1: ( 'named' )
            // InternalMyDbl.g:1021:2: 'named'
            {
             before(grammarAccess.getDatabaseAccess().getNamedKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getNamedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__3"
    // InternalMyDbl.g:1030:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1034:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalMyDbl.g:1035:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3"


    // $ANTLR start "rule__Database__Group__3__Impl"
    // InternalMyDbl.g:1042:1: rule__Database__Group__3__Impl : ( ( rule__Database__NameAssignment_3 ) ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1046:1: ( ( ( rule__Database__NameAssignment_3 ) ) )
            // InternalMyDbl.g:1047:1: ( ( rule__Database__NameAssignment_3 ) )
            {
            // InternalMyDbl.g:1047:1: ( ( rule__Database__NameAssignment_3 ) )
            // InternalMyDbl.g:1048:2: ( rule__Database__NameAssignment_3 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_3()); 
            // InternalMyDbl.g:1049:2: ( rule__Database__NameAssignment_3 )
            // InternalMyDbl.g:1049:3: rule__Database__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Database__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__3__Impl"


    // $ANTLR start "rule__Database__Group__4"
    // InternalMyDbl.g:1057:1: rule__Database__Group__4 : rule__Database__Group__4__Impl ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1061:1: ( rule__Database__Group__4__Impl )
            // InternalMyDbl.g:1062:2: rule__Database__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4"


    // $ANTLR start "rule__Database__Group__4__Impl"
    // InternalMyDbl.g:1068:1: rule__Database__Group__4__Impl : ( ( rule__Database__InstructionsAssignment_4 )* ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1072:1: ( ( ( rule__Database__InstructionsAssignment_4 )* ) )
            // InternalMyDbl.g:1073:1: ( ( rule__Database__InstructionsAssignment_4 )* )
            {
            // InternalMyDbl.g:1073:1: ( ( rule__Database__InstructionsAssignment_4 )* )
            // InternalMyDbl.g:1074:2: ( rule__Database__InstructionsAssignment_4 )*
            {
             before(grammarAccess.getDatabaseAccess().getInstructionsAssignment_4()); 
            // InternalMyDbl.g:1075:2: ( rule__Database__InstructionsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==30||LA8_0==35||LA8_0==42||LA8_0==44||LA8_0==54) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDbl.g:1075:3: rule__Database__InstructionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Database__InstructionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDatabaseAccess().getInstructionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__Group__4__Impl"


    // $ANTLR start "rule__CreateTableInstruction__Group__0"
    // InternalMyDbl.g:1084:1: rule__CreateTableInstruction__Group__0 : rule__CreateTableInstruction__Group__0__Impl rule__CreateTableInstruction__Group__1 ;
    public final void rule__CreateTableInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1088:1: ( rule__CreateTableInstruction__Group__0__Impl rule__CreateTableInstruction__Group__1 )
            // InternalMyDbl.g:1089:2: rule__CreateTableInstruction__Group__0__Impl rule__CreateTableInstruction__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__CreateTableInstruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableInstruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__0"


    // $ANTLR start "rule__CreateTableInstruction__Group__0__Impl"
    // InternalMyDbl.g:1096:1: rule__CreateTableInstruction__Group__0__Impl : ( 'create' ) ;
    public final void rule__CreateTableInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1100:1: ( ( 'create' ) )
            // InternalMyDbl.g:1101:1: ( 'create' )
            {
            // InternalMyDbl.g:1101:1: ( 'create' )
            // InternalMyDbl.g:1102:2: 'create'
            {
             before(grammarAccess.getCreateTableInstructionAccess().getCreateKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCreateTableInstructionAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__0__Impl"


    // $ANTLR start "rule__CreateTableInstruction__Group__1"
    // InternalMyDbl.g:1111:1: rule__CreateTableInstruction__Group__1 : rule__CreateTableInstruction__Group__1__Impl rule__CreateTableInstruction__Group__2 ;
    public final void rule__CreateTableInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1115:1: ( rule__CreateTableInstruction__Group__1__Impl rule__CreateTableInstruction__Group__2 )
            // InternalMyDbl.g:1116:2: rule__CreateTableInstruction__Group__1__Impl rule__CreateTableInstruction__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CreateTableInstruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableInstruction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__1"


    // $ANTLR start "rule__CreateTableInstruction__Group__1__Impl"
    // InternalMyDbl.g:1123:1: rule__CreateTableInstruction__Group__1__Impl : ( 'a' ) ;
    public final void rule__CreateTableInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1127:1: ( ( 'a' ) )
            // InternalMyDbl.g:1128:1: ( 'a' )
            {
            // InternalMyDbl.g:1128:1: ( 'a' )
            // InternalMyDbl.g:1129:2: 'a'
            {
             before(grammarAccess.getCreateTableInstructionAccess().getAKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCreateTableInstructionAccess().getAKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__1__Impl"


    // $ANTLR start "rule__CreateTableInstruction__Group__2"
    // InternalMyDbl.g:1138:1: rule__CreateTableInstruction__Group__2 : rule__CreateTableInstruction__Group__2__Impl rule__CreateTableInstruction__Group__3 ;
    public final void rule__CreateTableInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1142:1: ( rule__CreateTableInstruction__Group__2__Impl rule__CreateTableInstruction__Group__3 )
            // InternalMyDbl.g:1143:2: rule__CreateTableInstruction__Group__2__Impl rule__CreateTableInstruction__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CreateTableInstruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableInstruction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__2"


    // $ANTLR start "rule__CreateTableInstruction__Group__2__Impl"
    // InternalMyDbl.g:1150:1: rule__CreateTableInstruction__Group__2__Impl : ( 'table' ) ;
    public final void rule__CreateTableInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1154:1: ( ( 'table' ) )
            // InternalMyDbl.g:1155:1: ( 'table' )
            {
            // InternalMyDbl.g:1155:1: ( 'table' )
            // InternalMyDbl.g:1156:2: 'table'
            {
             before(grammarAccess.getCreateTableInstructionAccess().getTableKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCreateTableInstructionAccess().getTableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__2__Impl"


    // $ANTLR start "rule__CreateTableInstruction__Group__3"
    // InternalMyDbl.g:1165:1: rule__CreateTableInstruction__Group__3 : rule__CreateTableInstruction__Group__3__Impl rule__CreateTableInstruction__Group__4 ;
    public final void rule__CreateTableInstruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1169:1: ( rule__CreateTableInstruction__Group__3__Impl rule__CreateTableInstruction__Group__4 )
            // InternalMyDbl.g:1170:2: rule__CreateTableInstruction__Group__3__Impl rule__CreateTableInstruction__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CreateTableInstruction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableInstruction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__3"


    // $ANTLR start "rule__CreateTableInstruction__Group__3__Impl"
    // InternalMyDbl.g:1177:1: rule__CreateTableInstruction__Group__3__Impl : ( 'named' ) ;
    public final void rule__CreateTableInstruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1181:1: ( ( 'named' ) )
            // InternalMyDbl.g:1182:1: ( 'named' )
            {
            // InternalMyDbl.g:1182:1: ( 'named' )
            // InternalMyDbl.g:1183:2: 'named'
            {
             before(grammarAccess.getCreateTableInstructionAccess().getNamedKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCreateTableInstructionAccess().getNamedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__3__Impl"


    // $ANTLR start "rule__CreateTableInstruction__Group__4"
    // InternalMyDbl.g:1192:1: rule__CreateTableInstruction__Group__4 : rule__CreateTableInstruction__Group__4__Impl rule__CreateTableInstruction__Group__5 ;
    public final void rule__CreateTableInstruction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1196:1: ( rule__CreateTableInstruction__Group__4__Impl rule__CreateTableInstruction__Group__5 )
            // InternalMyDbl.g:1197:2: rule__CreateTableInstruction__Group__4__Impl rule__CreateTableInstruction__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__CreateTableInstruction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateTableInstruction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__4"


    // $ANTLR start "rule__CreateTableInstruction__Group__4__Impl"
    // InternalMyDbl.g:1204:1: rule__CreateTableInstruction__Group__4__Impl : ( ( rule__CreateTableInstruction__TableAssignment_4 ) ) ;
    public final void rule__CreateTableInstruction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1208:1: ( ( ( rule__CreateTableInstruction__TableAssignment_4 ) ) )
            // InternalMyDbl.g:1209:1: ( ( rule__CreateTableInstruction__TableAssignment_4 ) )
            {
            // InternalMyDbl.g:1209:1: ( ( rule__CreateTableInstruction__TableAssignment_4 ) )
            // InternalMyDbl.g:1210:2: ( rule__CreateTableInstruction__TableAssignment_4 )
            {
             before(grammarAccess.getCreateTableInstructionAccess().getTableAssignment_4()); 
            // InternalMyDbl.g:1211:2: ( rule__CreateTableInstruction__TableAssignment_4 )
            // InternalMyDbl.g:1211:3: rule__CreateTableInstruction__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableInstruction__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableInstructionAccess().getTableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__4__Impl"


    // $ANTLR start "rule__CreateTableInstruction__Group__5"
    // InternalMyDbl.g:1219:1: rule__CreateTableInstruction__Group__5 : rule__CreateTableInstruction__Group__5__Impl ;
    public final void rule__CreateTableInstruction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1223:1: ( rule__CreateTableInstruction__Group__5__Impl )
            // InternalMyDbl.g:1224:2: rule__CreateTableInstruction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableInstruction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__5"


    // $ANTLR start "rule__CreateTableInstruction__Group__5__Impl"
    // InternalMyDbl.g:1230:1: rule__CreateTableInstruction__Group__5__Impl : ( ( rule__CreateTableInstruction__ElementAssignment_5 ) ) ;
    public final void rule__CreateTableInstruction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1234:1: ( ( ( rule__CreateTableInstruction__ElementAssignment_5 ) ) )
            // InternalMyDbl.g:1235:1: ( ( rule__CreateTableInstruction__ElementAssignment_5 ) )
            {
            // InternalMyDbl.g:1235:1: ( ( rule__CreateTableInstruction__ElementAssignment_5 ) )
            // InternalMyDbl.g:1236:2: ( rule__CreateTableInstruction__ElementAssignment_5 )
            {
             before(grammarAccess.getCreateTableInstructionAccess().getElementAssignment_5()); 
            // InternalMyDbl.g:1237:2: ( rule__CreateTableInstruction__ElementAssignment_5 )
            // InternalMyDbl.g:1237:3: rule__CreateTableInstruction__ElementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CreateTableInstruction__ElementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCreateTableInstructionAccess().getElementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__Group__5__Impl"


    // $ANTLR start "rule__CreateElementInstruction__Group__0"
    // InternalMyDbl.g:1246:1: rule__CreateElementInstruction__Group__0 : rule__CreateElementInstruction__Group__0__Impl rule__CreateElementInstruction__Group__1 ;
    public final void rule__CreateElementInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1250:1: ( rule__CreateElementInstruction__Group__0__Impl rule__CreateElementInstruction__Group__1 )
            // InternalMyDbl.g:1251:2: rule__CreateElementInstruction__Group__0__Impl rule__CreateElementInstruction__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CreateElementInstruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateElementInstruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__0"


    // $ANTLR start "rule__CreateElementInstruction__Group__0__Impl"
    // InternalMyDbl.g:1258:1: rule__CreateElementInstruction__Group__0__Impl : ( ',' ) ;
    public final void rule__CreateElementInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1262:1: ( ( ',' ) )
            // InternalMyDbl.g:1263:1: ( ',' )
            {
            // InternalMyDbl.g:1263:1: ( ',' )
            // InternalMyDbl.g:1264:2: ','
            {
             before(grammarAccess.getCreateElementInstructionAccess().getCommaKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCreateElementInstructionAccess().getCommaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__0__Impl"


    // $ANTLR start "rule__CreateElementInstruction__Group__1"
    // InternalMyDbl.g:1273:1: rule__CreateElementInstruction__Group__1 : rule__CreateElementInstruction__Group__1__Impl rule__CreateElementInstruction__Group__2 ;
    public final void rule__CreateElementInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1277:1: ( rule__CreateElementInstruction__Group__1__Impl rule__CreateElementInstruction__Group__2 )
            // InternalMyDbl.g:1278:2: rule__CreateElementInstruction__Group__1__Impl rule__CreateElementInstruction__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__CreateElementInstruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateElementInstruction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__1"


    // $ANTLR start "rule__CreateElementInstruction__Group__1__Impl"
    // InternalMyDbl.g:1285:1: rule__CreateElementInstruction__Group__1__Impl : ( 'which' ) ;
    public final void rule__CreateElementInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1289:1: ( ( 'which' ) )
            // InternalMyDbl.g:1290:1: ( 'which' )
            {
            // InternalMyDbl.g:1290:1: ( 'which' )
            // InternalMyDbl.g:1291:2: 'which'
            {
             before(grammarAccess.getCreateElementInstructionAccess().getWhichKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCreateElementInstructionAccess().getWhichKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__1__Impl"


    // $ANTLR start "rule__CreateElementInstruction__Group__2"
    // InternalMyDbl.g:1300:1: rule__CreateElementInstruction__Group__2 : rule__CreateElementInstruction__Group__2__Impl rule__CreateElementInstruction__Group__3 ;
    public final void rule__CreateElementInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1304:1: ( rule__CreateElementInstruction__Group__2__Impl rule__CreateElementInstruction__Group__3 )
            // InternalMyDbl.g:1305:2: rule__CreateElementInstruction__Group__2__Impl rule__CreateElementInstruction__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__CreateElementInstruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateElementInstruction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__2"


    // $ANTLR start "rule__CreateElementInstruction__Group__2__Impl"
    // InternalMyDbl.g:1312:1: rule__CreateElementInstruction__Group__2__Impl : ( 'saves' ) ;
    public final void rule__CreateElementInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1316:1: ( ( 'saves' ) )
            // InternalMyDbl.g:1317:1: ( 'saves' )
            {
            // InternalMyDbl.g:1317:1: ( 'saves' )
            // InternalMyDbl.g:1318:2: 'saves'
            {
             before(grammarAccess.getCreateElementInstructionAccess().getSavesKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCreateElementInstructionAccess().getSavesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__2__Impl"


    // $ANTLR start "rule__CreateElementInstruction__Group__3"
    // InternalMyDbl.g:1327:1: rule__CreateElementInstruction__Group__3 : rule__CreateElementInstruction__Group__3__Impl rule__CreateElementInstruction__Group__4 ;
    public final void rule__CreateElementInstruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1331:1: ( rule__CreateElementInstruction__Group__3__Impl rule__CreateElementInstruction__Group__4 )
            // InternalMyDbl.g:1332:2: rule__CreateElementInstruction__Group__3__Impl rule__CreateElementInstruction__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__CreateElementInstruction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateElementInstruction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__3"


    // $ANTLR start "rule__CreateElementInstruction__Group__3__Impl"
    // InternalMyDbl.g:1339:1: rule__CreateElementInstruction__Group__3__Impl : ( 'data' ) ;
    public final void rule__CreateElementInstruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1343:1: ( ( 'data' ) )
            // InternalMyDbl.g:1344:1: ( 'data' )
            {
            // InternalMyDbl.g:1344:1: ( 'data' )
            // InternalMyDbl.g:1345:2: 'data'
            {
             before(grammarAccess.getCreateElementInstructionAccess().getDataKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCreateElementInstructionAccess().getDataKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__3__Impl"


    // $ANTLR start "rule__CreateElementInstruction__Group__4"
    // InternalMyDbl.g:1354:1: rule__CreateElementInstruction__Group__4 : rule__CreateElementInstruction__Group__4__Impl rule__CreateElementInstruction__Group__5 ;
    public final void rule__CreateElementInstruction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1358:1: ( rule__CreateElementInstruction__Group__4__Impl rule__CreateElementInstruction__Group__5 )
            // InternalMyDbl.g:1359:2: rule__CreateElementInstruction__Group__4__Impl rule__CreateElementInstruction__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__CreateElementInstruction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateElementInstruction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__4"


    // $ANTLR start "rule__CreateElementInstruction__Group__4__Impl"
    // InternalMyDbl.g:1366:1: rule__CreateElementInstruction__Group__4__Impl : ( 'of' ) ;
    public final void rule__CreateElementInstruction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1370:1: ( ( 'of' ) )
            // InternalMyDbl.g:1371:1: ( 'of' )
            {
            // InternalMyDbl.g:1371:1: ( 'of' )
            // InternalMyDbl.g:1372:2: 'of'
            {
             before(grammarAccess.getCreateElementInstructionAccess().getOfKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCreateElementInstructionAccess().getOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__4__Impl"


    // $ANTLR start "rule__CreateElementInstruction__Group__5"
    // InternalMyDbl.g:1381:1: rule__CreateElementInstruction__Group__5 : rule__CreateElementInstruction__Group__5__Impl ;
    public final void rule__CreateElementInstruction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1385:1: ( rule__CreateElementInstruction__Group__5__Impl )
            // InternalMyDbl.g:1386:2: rule__CreateElementInstruction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateElementInstruction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__5"


    // $ANTLR start "rule__CreateElementInstruction__Group__5__Impl"
    // InternalMyDbl.g:1392:1: rule__CreateElementInstruction__Group__5__Impl : ( ( rule__CreateElementInstruction__ElementAssignment_5 ) ) ;
    public final void rule__CreateElementInstruction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1396:1: ( ( ( rule__CreateElementInstruction__ElementAssignment_5 ) ) )
            // InternalMyDbl.g:1397:1: ( ( rule__CreateElementInstruction__ElementAssignment_5 ) )
            {
            // InternalMyDbl.g:1397:1: ( ( rule__CreateElementInstruction__ElementAssignment_5 ) )
            // InternalMyDbl.g:1398:2: ( rule__CreateElementInstruction__ElementAssignment_5 )
            {
             before(grammarAccess.getCreateElementInstructionAccess().getElementAssignment_5()); 
            // InternalMyDbl.g:1399:2: ( rule__CreateElementInstruction__ElementAssignment_5 )
            // InternalMyDbl.g:1399:3: rule__CreateElementInstruction__ElementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CreateElementInstruction__ElementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCreateElementInstructionAccess().getElementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__Group__5__Impl"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__0"
    // InternalMyDbl.g:1408:1: rule__CreateAttributeInstruction__Group__0 : rule__CreateAttributeInstruction__Group__0__Impl rule__CreateAttributeInstruction__Group__1 ;
    public final void rule__CreateAttributeInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1412:1: ( rule__CreateAttributeInstruction__Group__0__Impl rule__CreateAttributeInstruction__Group__1 )
            // InternalMyDbl.g:1413:2: rule__CreateAttributeInstruction__Group__0__Impl rule__CreateAttributeInstruction__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CreateAttributeInstruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__0"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__0__Impl"
    // InternalMyDbl.g:1420:1: rule__CreateAttributeInstruction__Group__0__Impl : ( ( rule__CreateAttributeInstruction__ElementAssignment_0 ) ) ;
    public final void rule__CreateAttributeInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1424:1: ( ( ( rule__CreateAttributeInstruction__ElementAssignment_0 ) ) )
            // InternalMyDbl.g:1425:1: ( ( rule__CreateAttributeInstruction__ElementAssignment_0 ) )
            {
            // InternalMyDbl.g:1425:1: ( ( rule__CreateAttributeInstruction__ElementAssignment_0 ) )
            // InternalMyDbl.g:1426:2: ( rule__CreateAttributeInstruction__ElementAssignment_0 )
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getElementAssignment_0()); 
            // InternalMyDbl.g:1427:2: ( rule__CreateAttributeInstruction__ElementAssignment_0 )
            // InternalMyDbl.g:1427:3: rule__CreateAttributeInstruction__ElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAttributeInstructionAccess().getElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__0__Impl"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__1"
    // InternalMyDbl.g:1435:1: rule__CreateAttributeInstruction__Group__1 : rule__CreateAttributeInstruction__Group__1__Impl rule__CreateAttributeInstruction__Group__2 ;
    public final void rule__CreateAttributeInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1439:1: ( rule__CreateAttributeInstruction__Group__1__Impl rule__CreateAttributeInstruction__Group__2 )
            // InternalMyDbl.g:1440:2: rule__CreateAttributeInstruction__Group__1__Impl rule__CreateAttributeInstruction__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__CreateAttributeInstruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__1"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__1__Impl"
    // InternalMyDbl.g:1447:1: rule__CreateAttributeInstruction__Group__1__Impl : ( 'has' ) ;
    public final void rule__CreateAttributeInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1451:1: ( ( 'has' ) )
            // InternalMyDbl.g:1452:1: ( 'has' )
            {
            // InternalMyDbl.g:1452:1: ( 'has' )
            // InternalMyDbl.g:1453:2: 'has'
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getHasKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCreateAttributeInstructionAccess().getHasKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__1__Impl"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__2"
    // InternalMyDbl.g:1462:1: rule__CreateAttributeInstruction__Group__2 : rule__CreateAttributeInstruction__Group__2__Impl rule__CreateAttributeInstruction__Group__3 ;
    public final void rule__CreateAttributeInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1466:1: ( rule__CreateAttributeInstruction__Group__2__Impl rule__CreateAttributeInstruction__Group__3 )
            // InternalMyDbl.g:1467:2: rule__CreateAttributeInstruction__Group__2__Impl rule__CreateAttributeInstruction__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CreateAttributeInstruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__2"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__2__Impl"
    // InternalMyDbl.g:1474:1: rule__CreateAttributeInstruction__Group__2__Impl : ( 'attribute' ) ;
    public final void rule__CreateAttributeInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1478:1: ( ( 'attribute' ) )
            // InternalMyDbl.g:1479:1: ( 'attribute' )
            {
            // InternalMyDbl.g:1479:1: ( 'attribute' )
            // InternalMyDbl.g:1480:2: 'attribute'
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getAttributeKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCreateAttributeInstructionAccess().getAttributeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__2__Impl"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__3"
    // InternalMyDbl.g:1489:1: rule__CreateAttributeInstruction__Group__3 : rule__CreateAttributeInstruction__Group__3__Impl rule__CreateAttributeInstruction__Group__4 ;
    public final void rule__CreateAttributeInstruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1493:1: ( rule__CreateAttributeInstruction__Group__3__Impl rule__CreateAttributeInstruction__Group__4 )
            // InternalMyDbl.g:1494:2: rule__CreateAttributeInstruction__Group__3__Impl rule__CreateAttributeInstruction__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CreateAttributeInstruction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__3"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__3__Impl"
    // InternalMyDbl.g:1501:1: rule__CreateAttributeInstruction__Group__3__Impl : ( 'named' ) ;
    public final void rule__CreateAttributeInstruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1505:1: ( ( 'named' ) )
            // InternalMyDbl.g:1506:1: ( 'named' )
            {
            // InternalMyDbl.g:1506:1: ( 'named' )
            // InternalMyDbl.g:1507:2: 'named'
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getNamedKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCreateAttributeInstructionAccess().getNamedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__3__Impl"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__4"
    // InternalMyDbl.g:1516:1: rule__CreateAttributeInstruction__Group__4 : rule__CreateAttributeInstruction__Group__4__Impl rule__CreateAttributeInstruction__Group__5 ;
    public final void rule__CreateAttributeInstruction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1520:1: ( rule__CreateAttributeInstruction__Group__4__Impl rule__CreateAttributeInstruction__Group__5 )
            // InternalMyDbl.g:1521:2: rule__CreateAttributeInstruction__Group__4__Impl rule__CreateAttributeInstruction__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__CreateAttributeInstruction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__4"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__4__Impl"
    // InternalMyDbl.g:1528:1: rule__CreateAttributeInstruction__Group__4__Impl : ( ( rule__CreateAttributeInstruction__AttributeAssignment_4 ) ) ;
    public final void rule__CreateAttributeInstruction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1532:1: ( ( ( rule__CreateAttributeInstruction__AttributeAssignment_4 ) ) )
            // InternalMyDbl.g:1533:1: ( ( rule__CreateAttributeInstruction__AttributeAssignment_4 ) )
            {
            // InternalMyDbl.g:1533:1: ( ( rule__CreateAttributeInstruction__AttributeAssignment_4 ) )
            // InternalMyDbl.g:1534:2: ( rule__CreateAttributeInstruction__AttributeAssignment_4 )
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getAttributeAssignment_4()); 
            // InternalMyDbl.g:1535:2: ( rule__CreateAttributeInstruction__AttributeAssignment_4 )
            // InternalMyDbl.g:1535:3: rule__CreateAttributeInstruction__AttributeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__AttributeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateAttributeInstructionAccess().getAttributeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__4__Impl"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__5"
    // InternalMyDbl.g:1543:1: rule__CreateAttributeInstruction__Group__5 : rule__CreateAttributeInstruction__Group__5__Impl rule__CreateAttributeInstruction__Group__6 ;
    public final void rule__CreateAttributeInstruction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1547:1: ( rule__CreateAttributeInstruction__Group__5__Impl rule__CreateAttributeInstruction__Group__6 )
            // InternalMyDbl.g:1548:2: rule__CreateAttributeInstruction__Group__5__Impl rule__CreateAttributeInstruction__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__CreateAttributeInstruction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__5"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__5__Impl"
    // InternalMyDbl.g:1555:1: rule__CreateAttributeInstruction__Group__5__Impl : ( ',' ) ;
    public final void rule__CreateAttributeInstruction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1559:1: ( ( ',' ) )
            // InternalMyDbl.g:1560:1: ( ',' )
            {
            // InternalMyDbl.g:1560:1: ( ',' )
            // InternalMyDbl.g:1561:2: ','
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getCommaKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCreateAttributeInstructionAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__5__Impl"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__6"
    // InternalMyDbl.g:1570:1: rule__CreateAttributeInstruction__Group__6 : rule__CreateAttributeInstruction__Group__6__Impl rule__CreateAttributeInstruction__Group__7 ;
    public final void rule__CreateAttributeInstruction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1574:1: ( rule__CreateAttributeInstruction__Group__6__Impl rule__CreateAttributeInstruction__Group__7 )
            // InternalMyDbl.g:1575:2: rule__CreateAttributeInstruction__Group__6__Impl rule__CreateAttributeInstruction__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__CreateAttributeInstruction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__6"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__6__Impl"
    // InternalMyDbl.g:1582:1: rule__CreateAttributeInstruction__Group__6__Impl : ( 'which' ) ;
    public final void rule__CreateAttributeInstruction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1586:1: ( ( 'which' ) )
            // InternalMyDbl.g:1587:1: ( 'which' )
            {
            // InternalMyDbl.g:1587:1: ( 'which' )
            // InternalMyDbl.g:1588:2: 'which'
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getWhichKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCreateAttributeInstructionAccess().getWhichKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__6__Impl"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__7"
    // InternalMyDbl.g:1597:1: rule__CreateAttributeInstruction__Group__7 : rule__CreateAttributeInstruction__Group__7__Impl rule__CreateAttributeInstruction__Group__8 ;
    public final void rule__CreateAttributeInstruction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1601:1: ( rule__CreateAttributeInstruction__Group__7__Impl rule__CreateAttributeInstruction__Group__8 )
            // InternalMyDbl.g:1602:2: rule__CreateAttributeInstruction__Group__7__Impl rule__CreateAttributeInstruction__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__CreateAttributeInstruction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__7"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__7__Impl"
    // InternalMyDbl.g:1609:1: rule__CreateAttributeInstruction__Group__7__Impl : ( 'is' ) ;
    public final void rule__CreateAttributeInstruction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1613:1: ( ( 'is' ) )
            // InternalMyDbl.g:1614:1: ( 'is' )
            {
            // InternalMyDbl.g:1614:1: ( 'is' )
            // InternalMyDbl.g:1615:2: 'is'
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getIsKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCreateAttributeInstructionAccess().getIsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__7__Impl"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__8"
    // InternalMyDbl.g:1624:1: rule__CreateAttributeInstruction__Group__8 : rule__CreateAttributeInstruction__Group__8__Impl ;
    public final void rule__CreateAttributeInstruction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1628:1: ( rule__CreateAttributeInstruction__Group__8__Impl )
            // InternalMyDbl.g:1629:2: rule__CreateAttributeInstruction__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__8"


    // $ANTLR start "rule__CreateAttributeInstruction__Group__8__Impl"
    // InternalMyDbl.g:1635:1: rule__CreateAttributeInstruction__Group__8__Impl : ( ( rule__CreateAttributeInstruction__AttributeTypeAssignment_8 ) ) ;
    public final void rule__CreateAttributeInstruction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1639:1: ( ( ( rule__CreateAttributeInstruction__AttributeTypeAssignment_8 ) ) )
            // InternalMyDbl.g:1640:1: ( ( rule__CreateAttributeInstruction__AttributeTypeAssignment_8 ) )
            {
            // InternalMyDbl.g:1640:1: ( ( rule__CreateAttributeInstruction__AttributeTypeAssignment_8 ) )
            // InternalMyDbl.g:1641:2: ( rule__CreateAttributeInstruction__AttributeTypeAssignment_8 )
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getAttributeTypeAssignment_8()); 
            // InternalMyDbl.g:1642:2: ( rule__CreateAttributeInstruction__AttributeTypeAssignment_8 )
            // InternalMyDbl.g:1642:3: rule__CreateAttributeInstruction__AttributeTypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CreateAttributeInstruction__AttributeTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCreateAttributeInstructionAccess().getAttributeTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__Group__8__Impl"


    // $ANTLR start "rule__AddInstruction__Group__0"
    // InternalMyDbl.g:1651:1: rule__AddInstruction__Group__0 : rule__AddInstruction__Group__0__Impl rule__AddInstruction__Group__1 ;
    public final void rule__AddInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1655:1: ( rule__AddInstruction__Group__0__Impl rule__AddInstruction__Group__1 )
            // InternalMyDbl.g:1656:2: rule__AddInstruction__Group__0__Impl rule__AddInstruction__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AddInstruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddInstruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__0"


    // $ANTLR start "rule__AddInstruction__Group__0__Impl"
    // InternalMyDbl.g:1663:1: rule__AddInstruction__Group__0__Impl : ( 'add' ) ;
    public final void rule__AddInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1667:1: ( ( 'add' ) )
            // InternalMyDbl.g:1668:1: ( 'add' )
            {
            // InternalMyDbl.g:1668:1: ( 'add' )
            // InternalMyDbl.g:1669:2: 'add'
            {
             before(grammarAccess.getAddInstructionAccess().getAddKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAddInstructionAccess().getAddKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__0__Impl"


    // $ANTLR start "rule__AddInstruction__Group__1"
    // InternalMyDbl.g:1678:1: rule__AddInstruction__Group__1 : rule__AddInstruction__Group__1__Impl rule__AddInstruction__Group__2 ;
    public final void rule__AddInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1682:1: ( rule__AddInstruction__Group__1__Impl rule__AddInstruction__Group__2 )
            // InternalMyDbl.g:1683:2: rule__AddInstruction__Group__1__Impl rule__AddInstruction__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AddInstruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddInstruction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__1"


    // $ANTLR start "rule__AddInstruction__Group__1__Impl"
    // InternalMyDbl.g:1690:1: rule__AddInstruction__Group__1__Impl : ( 'a' ) ;
    public final void rule__AddInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1694:1: ( ( 'a' ) )
            // InternalMyDbl.g:1695:1: ( 'a' )
            {
            // InternalMyDbl.g:1695:1: ( 'a' )
            // InternalMyDbl.g:1696:2: 'a'
            {
             before(grammarAccess.getAddInstructionAccess().getAKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAddInstructionAccess().getAKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__1__Impl"


    // $ANTLR start "rule__AddInstruction__Group__2"
    // InternalMyDbl.g:1705:1: rule__AddInstruction__Group__2 : rule__AddInstruction__Group__2__Impl rule__AddInstruction__Group__3 ;
    public final void rule__AddInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1709:1: ( rule__AddInstruction__Group__2__Impl rule__AddInstruction__Group__3 )
            // InternalMyDbl.g:1710:2: rule__AddInstruction__Group__2__Impl rule__AddInstruction__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__AddInstruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddInstruction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__2"


    // $ANTLR start "rule__AddInstruction__Group__2__Impl"
    // InternalMyDbl.g:1717:1: rule__AddInstruction__Group__2__Impl : ( ( rule__AddInstruction__ElementAssignment_2 ) ) ;
    public final void rule__AddInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1721:1: ( ( ( rule__AddInstruction__ElementAssignment_2 ) ) )
            // InternalMyDbl.g:1722:1: ( ( rule__AddInstruction__ElementAssignment_2 ) )
            {
            // InternalMyDbl.g:1722:1: ( ( rule__AddInstruction__ElementAssignment_2 ) )
            // InternalMyDbl.g:1723:2: ( rule__AddInstruction__ElementAssignment_2 )
            {
             before(grammarAccess.getAddInstructionAccess().getElementAssignment_2()); 
            // InternalMyDbl.g:1724:2: ( rule__AddInstruction__ElementAssignment_2 )
            // InternalMyDbl.g:1724:3: rule__AddInstruction__ElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddInstruction__ElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddInstructionAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__2__Impl"


    // $ANTLR start "rule__AddInstruction__Group__3"
    // InternalMyDbl.g:1732:1: rule__AddInstruction__Group__3 : rule__AddInstruction__Group__3__Impl rule__AddInstruction__Group__4 ;
    public final void rule__AddInstruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1736:1: ( rule__AddInstruction__Group__3__Impl rule__AddInstruction__Group__4 )
            // InternalMyDbl.g:1737:2: rule__AddInstruction__Group__3__Impl rule__AddInstruction__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__AddInstruction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddInstruction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__3"


    // $ANTLR start "rule__AddInstruction__Group__3__Impl"
    // InternalMyDbl.g:1744:1: rule__AddInstruction__Group__3__Impl : ( 'with' ) ;
    public final void rule__AddInstruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1748:1: ( ( 'with' ) )
            // InternalMyDbl.g:1749:1: ( 'with' )
            {
            // InternalMyDbl.g:1749:1: ( 'with' )
            // InternalMyDbl.g:1750:2: 'with'
            {
             before(grammarAccess.getAddInstructionAccess().getWithKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAddInstructionAccess().getWithKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__3__Impl"


    // $ANTLR start "rule__AddInstruction__Group__4"
    // InternalMyDbl.g:1759:1: rule__AddInstruction__Group__4 : rule__AddInstruction__Group__4__Impl ;
    public final void rule__AddInstruction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1763:1: ( rule__AddInstruction__Group__4__Impl )
            // InternalMyDbl.g:1764:2: rule__AddInstruction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddInstruction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__4"


    // $ANTLR start "rule__AddInstruction__Group__4__Impl"
    // InternalMyDbl.g:1770:1: rule__AddInstruction__Group__4__Impl : ( ( rule__AddInstruction__InsertInstructionAssignment_4 ) ) ;
    public final void rule__AddInstruction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1774:1: ( ( ( rule__AddInstruction__InsertInstructionAssignment_4 ) ) )
            // InternalMyDbl.g:1775:1: ( ( rule__AddInstruction__InsertInstructionAssignment_4 ) )
            {
            // InternalMyDbl.g:1775:1: ( ( rule__AddInstruction__InsertInstructionAssignment_4 ) )
            // InternalMyDbl.g:1776:2: ( rule__AddInstruction__InsertInstructionAssignment_4 )
            {
             before(grammarAccess.getAddInstructionAccess().getInsertInstructionAssignment_4()); 
            // InternalMyDbl.g:1777:2: ( rule__AddInstruction__InsertInstructionAssignment_4 )
            // InternalMyDbl.g:1777:3: rule__AddInstruction__InsertInstructionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddInstruction__InsertInstructionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddInstructionAccess().getInsertInstructionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__Group__4__Impl"


    // $ANTLR start "rule__InsertInstruction__Group__0"
    // InternalMyDbl.g:1786:1: rule__InsertInstruction__Group__0 : rule__InsertInstruction__Group__0__Impl rule__InsertInstruction__Group__1 ;
    public final void rule__InsertInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1790:1: ( rule__InsertInstruction__Group__0__Impl rule__InsertInstruction__Group__1 )
            // InternalMyDbl.g:1791:2: rule__InsertInstruction__Group__0__Impl rule__InsertInstruction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__InsertInstruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertInstruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__Group__0"


    // $ANTLR start "rule__InsertInstruction__Group__0__Impl"
    // InternalMyDbl.g:1798:1: rule__InsertInstruction__Group__0__Impl : ( ( rule__InsertInstruction__SetAttributeInstructionsAssignment_0 ) ) ;
    public final void rule__InsertInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1802:1: ( ( ( rule__InsertInstruction__SetAttributeInstructionsAssignment_0 ) ) )
            // InternalMyDbl.g:1803:1: ( ( rule__InsertInstruction__SetAttributeInstructionsAssignment_0 ) )
            {
            // InternalMyDbl.g:1803:1: ( ( rule__InsertInstruction__SetAttributeInstructionsAssignment_0 ) )
            // InternalMyDbl.g:1804:2: ( rule__InsertInstruction__SetAttributeInstructionsAssignment_0 )
            {
             before(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsAssignment_0()); 
            // InternalMyDbl.g:1805:2: ( rule__InsertInstruction__SetAttributeInstructionsAssignment_0 )
            // InternalMyDbl.g:1805:3: rule__InsertInstruction__SetAttributeInstructionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__InsertInstruction__SetAttributeInstructionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__Group__0__Impl"


    // $ANTLR start "rule__InsertInstruction__Group__1"
    // InternalMyDbl.g:1813:1: rule__InsertInstruction__Group__1 : rule__InsertInstruction__Group__1__Impl ;
    public final void rule__InsertInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1817:1: ( rule__InsertInstruction__Group__1__Impl )
            // InternalMyDbl.g:1818:2: rule__InsertInstruction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertInstruction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__Group__1"


    // $ANTLR start "rule__InsertInstruction__Group__1__Impl"
    // InternalMyDbl.g:1824:1: rule__InsertInstruction__Group__1__Impl : ( ( rule__InsertInstruction__Group_1__0 )* ) ;
    public final void rule__InsertInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1828:1: ( ( ( rule__InsertInstruction__Group_1__0 )* ) )
            // InternalMyDbl.g:1829:1: ( ( rule__InsertInstruction__Group_1__0 )* )
            {
            // InternalMyDbl.g:1829:1: ( ( rule__InsertInstruction__Group_1__0 )* )
            // InternalMyDbl.g:1830:2: ( rule__InsertInstruction__Group_1__0 )*
            {
             before(grammarAccess.getInsertInstructionAccess().getGroup_1()); 
            // InternalMyDbl.g:1831:2: ( rule__InsertInstruction__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==RULE_ID) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDbl.g:1831:3: rule__InsertInstruction__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__InsertInstruction__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getInsertInstructionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__Group__1__Impl"


    // $ANTLR start "rule__InsertInstruction__Group_1__0"
    // InternalMyDbl.g:1840:1: rule__InsertInstruction__Group_1__0 : rule__InsertInstruction__Group_1__0__Impl rule__InsertInstruction__Group_1__1 ;
    public final void rule__InsertInstruction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1844:1: ( rule__InsertInstruction__Group_1__0__Impl rule__InsertInstruction__Group_1__1 )
            // InternalMyDbl.g:1845:2: rule__InsertInstruction__Group_1__0__Impl rule__InsertInstruction__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__InsertInstruction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertInstruction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__Group_1__0"


    // $ANTLR start "rule__InsertInstruction__Group_1__0__Impl"
    // InternalMyDbl.g:1852:1: rule__InsertInstruction__Group_1__0__Impl : ( ',' ) ;
    public final void rule__InsertInstruction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1856:1: ( ( ',' ) )
            // InternalMyDbl.g:1857:1: ( ',' )
            {
            // InternalMyDbl.g:1857:1: ( ',' )
            // InternalMyDbl.g:1858:2: ','
            {
             before(grammarAccess.getInsertInstructionAccess().getCommaKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInsertInstructionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__Group_1__0__Impl"


    // $ANTLR start "rule__InsertInstruction__Group_1__1"
    // InternalMyDbl.g:1867:1: rule__InsertInstruction__Group_1__1 : rule__InsertInstruction__Group_1__1__Impl ;
    public final void rule__InsertInstruction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1871:1: ( rule__InsertInstruction__Group_1__1__Impl )
            // InternalMyDbl.g:1872:2: rule__InsertInstruction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertInstruction__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__Group_1__1"


    // $ANTLR start "rule__InsertInstruction__Group_1__1__Impl"
    // InternalMyDbl.g:1878:1: rule__InsertInstruction__Group_1__1__Impl : ( ( rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1 ) ) ;
    public final void rule__InsertInstruction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1882:1: ( ( ( rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1 ) ) )
            // InternalMyDbl.g:1883:1: ( ( rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1 ) )
            {
            // InternalMyDbl.g:1883:1: ( ( rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1 ) )
            // InternalMyDbl.g:1884:2: ( rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1 )
            {
             before(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsAssignment_1_1()); 
            // InternalMyDbl.g:1885:2: ( rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1 )
            // InternalMyDbl.g:1885:3: rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__Group_1__1__Impl"


    // $ANTLR start "rule__SetAttributeInstruction__Group__0"
    // InternalMyDbl.g:1894:1: rule__SetAttributeInstruction__Group__0 : rule__SetAttributeInstruction__Group__0__Impl rule__SetAttributeInstruction__Group__1 ;
    public final void rule__SetAttributeInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1898:1: ( rule__SetAttributeInstruction__Group__0__Impl rule__SetAttributeInstruction__Group__1 )
            // InternalMyDbl.g:1899:2: rule__SetAttributeInstruction__Group__0__Impl rule__SetAttributeInstruction__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SetAttributeInstruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetAttributeInstruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAttributeInstruction__Group__0"


    // $ANTLR start "rule__SetAttributeInstruction__Group__0__Impl"
    // InternalMyDbl.g:1906:1: rule__SetAttributeInstruction__Group__0__Impl : ( ( rule__SetAttributeInstruction__AttributeAssignment_0 ) ) ;
    public final void rule__SetAttributeInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1910:1: ( ( ( rule__SetAttributeInstruction__AttributeAssignment_0 ) ) )
            // InternalMyDbl.g:1911:1: ( ( rule__SetAttributeInstruction__AttributeAssignment_0 ) )
            {
            // InternalMyDbl.g:1911:1: ( ( rule__SetAttributeInstruction__AttributeAssignment_0 ) )
            // InternalMyDbl.g:1912:2: ( rule__SetAttributeInstruction__AttributeAssignment_0 )
            {
             before(grammarAccess.getSetAttributeInstructionAccess().getAttributeAssignment_0()); 
            // InternalMyDbl.g:1913:2: ( rule__SetAttributeInstruction__AttributeAssignment_0 )
            // InternalMyDbl.g:1913:3: rule__SetAttributeInstruction__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SetAttributeInstruction__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetAttributeInstructionAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAttributeInstruction__Group__0__Impl"


    // $ANTLR start "rule__SetAttributeInstruction__Group__1"
    // InternalMyDbl.g:1921:1: rule__SetAttributeInstruction__Group__1 : rule__SetAttributeInstruction__Group__1__Impl rule__SetAttributeInstruction__Group__2 ;
    public final void rule__SetAttributeInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1925:1: ( rule__SetAttributeInstruction__Group__1__Impl rule__SetAttributeInstruction__Group__2 )
            // InternalMyDbl.g:1926:2: rule__SetAttributeInstruction__Group__1__Impl rule__SetAttributeInstruction__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__SetAttributeInstruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetAttributeInstruction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAttributeInstruction__Group__1"


    // $ANTLR start "rule__SetAttributeInstruction__Group__1__Impl"
    // InternalMyDbl.g:1933:1: rule__SetAttributeInstruction__Group__1__Impl : ( 'of' ) ;
    public final void rule__SetAttributeInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1937:1: ( ( 'of' ) )
            // InternalMyDbl.g:1938:1: ( 'of' )
            {
            // InternalMyDbl.g:1938:1: ( 'of' )
            // InternalMyDbl.g:1939:2: 'of'
            {
             before(grammarAccess.getSetAttributeInstructionAccess().getOfKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSetAttributeInstructionAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAttributeInstruction__Group__1__Impl"


    // $ANTLR start "rule__SetAttributeInstruction__Group__2"
    // InternalMyDbl.g:1948:1: rule__SetAttributeInstruction__Group__2 : rule__SetAttributeInstruction__Group__2__Impl ;
    public final void rule__SetAttributeInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1952:1: ( rule__SetAttributeInstruction__Group__2__Impl )
            // InternalMyDbl.g:1953:2: rule__SetAttributeInstruction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetAttributeInstruction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAttributeInstruction__Group__2"


    // $ANTLR start "rule__SetAttributeInstruction__Group__2__Impl"
    // InternalMyDbl.g:1959:1: rule__SetAttributeInstruction__Group__2__Impl : ( ( rule__SetAttributeInstruction__AttributeValueAssignment_2 ) ) ;
    public final void rule__SetAttributeInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1963:1: ( ( ( rule__SetAttributeInstruction__AttributeValueAssignment_2 ) ) )
            // InternalMyDbl.g:1964:1: ( ( rule__SetAttributeInstruction__AttributeValueAssignment_2 ) )
            {
            // InternalMyDbl.g:1964:1: ( ( rule__SetAttributeInstruction__AttributeValueAssignment_2 ) )
            // InternalMyDbl.g:1965:2: ( rule__SetAttributeInstruction__AttributeValueAssignment_2 )
            {
             before(grammarAccess.getSetAttributeInstructionAccess().getAttributeValueAssignment_2()); 
            // InternalMyDbl.g:1966:2: ( rule__SetAttributeInstruction__AttributeValueAssignment_2 )
            // InternalMyDbl.g:1966:3: rule__SetAttributeInstruction__AttributeValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SetAttributeInstruction__AttributeValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetAttributeInstructionAccess().getAttributeValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAttributeInstruction__Group__2__Impl"


    // $ANTLR start "rule__FindInstruction__Group__0"
    // InternalMyDbl.g:1975:1: rule__FindInstruction__Group__0 : rule__FindInstruction__Group__0__Impl rule__FindInstruction__Group__1 ;
    public final void rule__FindInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1979:1: ( rule__FindInstruction__Group__0__Impl rule__FindInstruction__Group__1 )
            // InternalMyDbl.g:1980:2: rule__FindInstruction__Group__0__Impl rule__FindInstruction__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__FindInstruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FindInstruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindInstruction__Group__0"


    // $ANTLR start "rule__FindInstruction__Group__0__Impl"
    // InternalMyDbl.g:1987:1: rule__FindInstruction__Group__0__Impl : ( 'find' ) ;
    public final void rule__FindInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:1991:1: ( ( 'find' ) )
            // InternalMyDbl.g:1992:1: ( 'find' )
            {
            // InternalMyDbl.g:1992:1: ( 'find' )
            // InternalMyDbl.g:1993:2: 'find'
            {
             before(grammarAccess.getFindInstructionAccess().getFindKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFindInstructionAccess().getFindKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindInstruction__Group__0__Impl"


    // $ANTLR start "rule__FindInstruction__Group__1"
    // InternalMyDbl.g:2002:1: rule__FindInstruction__Group__1 : rule__FindInstruction__Group__1__Impl rule__FindInstruction__Group__2 ;
    public final void rule__FindInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2006:1: ( rule__FindInstruction__Group__1__Impl rule__FindInstruction__Group__2 )
            // InternalMyDbl.g:2007:2: rule__FindInstruction__Group__1__Impl rule__FindInstruction__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FindInstruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FindInstruction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindInstruction__Group__1"


    // $ANTLR start "rule__FindInstruction__Group__1__Impl"
    // InternalMyDbl.g:2014:1: rule__FindInstruction__Group__1__Impl : ( 'the' ) ;
    public final void rule__FindInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2018:1: ( ( 'the' ) )
            // InternalMyDbl.g:2019:1: ( 'the' )
            {
            // InternalMyDbl.g:2019:1: ( 'the' )
            // InternalMyDbl.g:2020:2: 'the'
            {
             before(grammarAccess.getFindInstructionAccess().getTheKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFindInstructionAccess().getTheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindInstruction__Group__1__Impl"


    // $ANTLR start "rule__FindInstruction__Group__2"
    // InternalMyDbl.g:2029:1: rule__FindInstruction__Group__2 : rule__FindInstruction__Group__2__Impl ;
    public final void rule__FindInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2033:1: ( rule__FindInstruction__Group__2__Impl )
            // InternalMyDbl.g:2034:2: rule__FindInstruction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FindInstruction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindInstruction__Group__2"


    // $ANTLR start "rule__FindInstruction__Group__2__Impl"
    // InternalMyDbl.g:2040:1: rule__FindInstruction__Group__2__Impl : ( ( rule__FindInstruction__Alternatives_2 ) ) ;
    public final void rule__FindInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2044:1: ( ( ( rule__FindInstruction__Alternatives_2 ) ) )
            // InternalMyDbl.g:2045:1: ( ( rule__FindInstruction__Alternatives_2 ) )
            {
            // InternalMyDbl.g:2045:1: ( ( rule__FindInstruction__Alternatives_2 ) )
            // InternalMyDbl.g:2046:2: ( rule__FindInstruction__Alternatives_2 )
            {
             before(grammarAccess.getFindInstructionAccess().getAlternatives_2()); 
            // InternalMyDbl.g:2047:2: ( rule__FindInstruction__Alternatives_2 )
            // InternalMyDbl.g:2047:3: rule__FindInstruction__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__FindInstruction__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getFindInstructionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FindInstruction__Group__2__Impl"


    // $ANTLR start "rule__SingleElement__Group__0"
    // InternalMyDbl.g:2056:1: rule__SingleElement__Group__0 : rule__SingleElement__Group__0__Impl rule__SingleElement__Group__1 ;
    public final void rule__SingleElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2060:1: ( rule__SingleElement__Group__0__Impl rule__SingleElement__Group__1 )
            // InternalMyDbl.g:2061:2: rule__SingleElement__Group__0__Impl rule__SingleElement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group__0"


    // $ANTLR start "rule__SingleElement__Group__0__Impl"
    // InternalMyDbl.g:2068:1: rule__SingleElement__Group__0__Impl : ( ( rule__SingleElement__Group_0__0 )? ) ;
    public final void rule__SingleElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2072:1: ( ( ( rule__SingleElement__Group_0__0 )? ) )
            // InternalMyDbl.g:2073:1: ( ( rule__SingleElement__Group_0__0 )? )
            {
            // InternalMyDbl.g:2073:1: ( ( rule__SingleElement__Group_0__0 )? )
            // InternalMyDbl.g:2074:2: ( rule__SingleElement__Group_0__0 )?
            {
             before(grammarAccess.getSingleElementAccess().getGroup_0()); 
            // InternalMyDbl.g:2075:2: ( rule__SingleElement__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==35) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==RULE_ID) ) {
                        alt10=1;
                    }
                }
                else if ( (LA10_1==39) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDbl.g:2075:3: rule__SingleElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleElement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleElementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group__0__Impl"


    // $ANTLR start "rule__SingleElement__Group__1"
    // InternalMyDbl.g:2083:1: rule__SingleElement__Group__1 : rule__SingleElement__Group__1__Impl rule__SingleElement__Group__2 ;
    public final void rule__SingleElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2087:1: ( rule__SingleElement__Group__1__Impl rule__SingleElement__Group__2 )
            // InternalMyDbl.g:2088:2: rule__SingleElement__Group__1__Impl rule__SingleElement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SingleElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group__1"


    // $ANTLR start "rule__SingleElement__Group__1__Impl"
    // InternalMyDbl.g:2095:1: rule__SingleElement__Group__1__Impl : ( ( rule__SingleElement__ElementAssignment_1 ) ) ;
    public final void rule__SingleElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2099:1: ( ( ( rule__SingleElement__ElementAssignment_1 ) ) )
            // InternalMyDbl.g:2100:1: ( ( rule__SingleElement__ElementAssignment_1 ) )
            {
            // InternalMyDbl.g:2100:1: ( ( rule__SingleElement__ElementAssignment_1 ) )
            // InternalMyDbl.g:2101:2: ( rule__SingleElement__ElementAssignment_1 )
            {
             before(grammarAccess.getSingleElementAccess().getElementAssignment_1()); 
            // InternalMyDbl.g:2102:2: ( rule__SingleElement__ElementAssignment_1 )
            // InternalMyDbl.g:2102:3: rule__SingleElement__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleElement__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleElementAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group__1__Impl"


    // $ANTLR start "rule__SingleElement__Group__2"
    // InternalMyDbl.g:2110:1: rule__SingleElement__Group__2 : rule__SingleElement__Group__2__Impl ;
    public final void rule__SingleElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2114:1: ( rule__SingleElement__Group__2__Impl )
            // InternalMyDbl.g:2115:2: rule__SingleElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group__2"


    // $ANTLR start "rule__SingleElement__Group__2__Impl"
    // InternalMyDbl.g:2121:1: rule__SingleElement__Group__2__Impl : ( ( rule__SingleElement__Group_2__0 )? ) ;
    public final void rule__SingleElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2125:1: ( ( ( rule__SingleElement__Group_2__0 )? ) )
            // InternalMyDbl.g:2126:1: ( ( rule__SingleElement__Group_2__0 )? )
            {
            // InternalMyDbl.g:2126:1: ( ( rule__SingleElement__Group_2__0 )? )
            // InternalMyDbl.g:2127:2: ( rule__SingleElement__Group_2__0 )?
            {
             before(grammarAccess.getSingleElementAccess().getGroup_2()); 
            // InternalMyDbl.g:2128:2: ( rule__SingleElement__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==46) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDbl.g:2128:3: rule__SingleElement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleElement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleElementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group__2__Impl"


    // $ANTLR start "rule__SingleElement__Group_0__0"
    // InternalMyDbl.g:2137:1: rule__SingleElement__Group_0__0 : rule__SingleElement__Group_0__0__Impl rule__SingleElement__Group_0__1 ;
    public final void rule__SingleElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2141:1: ( rule__SingleElement__Group_0__0__Impl rule__SingleElement__Group_0__1 )
            // InternalMyDbl.g:2142:2: rule__SingleElement__Group_0__0__Impl rule__SingleElement__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__SingleElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleElement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_0__0"


    // $ANTLR start "rule__SingleElement__Group_0__0__Impl"
    // InternalMyDbl.g:2149:1: rule__SingleElement__Group_0__0__Impl : ( ( rule__SingleElement__TargetsAssignment_0_0 ) ) ;
    public final void rule__SingleElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2153:1: ( ( ( rule__SingleElement__TargetsAssignment_0_0 ) ) )
            // InternalMyDbl.g:2154:1: ( ( rule__SingleElement__TargetsAssignment_0_0 ) )
            {
            // InternalMyDbl.g:2154:1: ( ( rule__SingleElement__TargetsAssignment_0_0 ) )
            // InternalMyDbl.g:2155:2: ( rule__SingleElement__TargetsAssignment_0_0 )
            {
             before(grammarAccess.getSingleElementAccess().getTargetsAssignment_0_0()); 
            // InternalMyDbl.g:2156:2: ( rule__SingleElement__TargetsAssignment_0_0 )
            // InternalMyDbl.g:2156:3: rule__SingleElement__TargetsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleElement__TargetsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleElementAccess().getTargetsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_0__0__Impl"


    // $ANTLR start "rule__SingleElement__Group_0__1"
    // InternalMyDbl.g:2164:1: rule__SingleElement__Group_0__1 : rule__SingleElement__Group_0__1__Impl ;
    public final void rule__SingleElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2168:1: ( rule__SingleElement__Group_0__1__Impl )
            // InternalMyDbl.g:2169:2: rule__SingleElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleElement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_0__1"


    // $ANTLR start "rule__SingleElement__Group_0__1__Impl"
    // InternalMyDbl.g:2175:1: rule__SingleElement__Group_0__1__Impl : ( 'of' ) ;
    public final void rule__SingleElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2179:1: ( ( 'of' ) )
            // InternalMyDbl.g:2180:1: ( 'of' )
            {
            // InternalMyDbl.g:2180:1: ( 'of' )
            // InternalMyDbl.g:2181:2: 'of'
            {
             before(grammarAccess.getSingleElementAccess().getOfKeyword_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSingleElementAccess().getOfKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_0__1__Impl"


    // $ANTLR start "rule__SingleElement__Group_2__0"
    // InternalMyDbl.g:2191:1: rule__SingleElement__Group_2__0 : rule__SingleElement__Group_2__0__Impl rule__SingleElement__Group_2__1 ;
    public final void rule__SingleElement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2195:1: ( rule__SingleElement__Group_2__0__Impl rule__SingleElement__Group_2__1 )
            // InternalMyDbl.g:2196:2: rule__SingleElement__Group_2__0__Impl rule__SingleElement__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__SingleElement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleElement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_2__0"


    // $ANTLR start "rule__SingleElement__Group_2__0__Impl"
    // InternalMyDbl.g:2203:1: rule__SingleElement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SingleElement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2207:1: ( ( ',' ) )
            // InternalMyDbl.g:2208:1: ( ',' )
            {
            // InternalMyDbl.g:2208:1: ( ',' )
            // InternalMyDbl.g:2209:2: ','
            {
             before(grammarAccess.getSingleElementAccess().getCommaKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSingleElementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_2__0__Impl"


    // $ANTLR start "rule__SingleElement__Group_2__1"
    // InternalMyDbl.g:2218:1: rule__SingleElement__Group_2__1 : rule__SingleElement__Group_2__1__Impl rule__SingleElement__Group_2__2 ;
    public final void rule__SingleElement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2222:1: ( rule__SingleElement__Group_2__1__Impl rule__SingleElement__Group_2__2 )
            // InternalMyDbl.g:2223:2: rule__SingleElement__Group_2__1__Impl rule__SingleElement__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__SingleElement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleElement__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_2__1"


    // $ANTLR start "rule__SingleElement__Group_2__1__Impl"
    // InternalMyDbl.g:2230:1: rule__SingleElement__Group_2__1__Impl : ( 'whose' ) ;
    public final void rule__SingleElement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2234:1: ( ( 'whose' ) )
            // InternalMyDbl.g:2235:1: ( 'whose' )
            {
            // InternalMyDbl.g:2235:1: ( 'whose' )
            // InternalMyDbl.g:2236:2: 'whose'
            {
             before(grammarAccess.getSingleElementAccess().getWhoseKeyword_2_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSingleElementAccess().getWhoseKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_2__1__Impl"


    // $ANTLR start "rule__SingleElement__Group_2__2"
    // InternalMyDbl.g:2245:1: rule__SingleElement__Group_2__2 : rule__SingleElement__Group_2__2__Impl ;
    public final void rule__SingleElement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2249:1: ( rule__SingleElement__Group_2__2__Impl )
            // InternalMyDbl.g:2250:2: rule__SingleElement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleElement__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_2__2"


    // $ANTLR start "rule__SingleElement__Group_2__2__Impl"
    // InternalMyDbl.g:2256:1: rule__SingleElement__Group_2__2__Impl : ( ( rule__SingleElement__ConditionsAssignment_2_2 ) ) ;
    public final void rule__SingleElement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2260:1: ( ( ( rule__SingleElement__ConditionsAssignment_2_2 ) ) )
            // InternalMyDbl.g:2261:1: ( ( rule__SingleElement__ConditionsAssignment_2_2 ) )
            {
            // InternalMyDbl.g:2261:1: ( ( rule__SingleElement__ConditionsAssignment_2_2 ) )
            // InternalMyDbl.g:2262:2: ( rule__SingleElement__ConditionsAssignment_2_2 )
            {
             before(grammarAccess.getSingleElementAccess().getConditionsAssignment_2_2()); 
            // InternalMyDbl.g:2263:2: ( rule__SingleElement__ConditionsAssignment_2_2 )
            // InternalMyDbl.g:2263:3: rule__SingleElement__ConditionsAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleElement__ConditionsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleElementAccess().getConditionsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__Group_2__2__Impl"


    // $ANTLR start "rule__Target__Group__0"
    // InternalMyDbl.g:2272:1: rule__Target__Group__0 : rule__Target__Group__0__Impl rule__Target__Group__1 ;
    public final void rule__Target__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2276:1: ( rule__Target__Group__0__Impl rule__Target__Group__1 )
            // InternalMyDbl.g:2277:2: rule__Target__Group__0__Impl rule__Target__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Target__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__0"


    // $ANTLR start "rule__Target__Group__0__Impl"
    // InternalMyDbl.g:2284:1: rule__Target__Group__0__Impl : ( ( rule__Target__AttributesAssignment_0 ) ) ;
    public final void rule__Target__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2288:1: ( ( ( rule__Target__AttributesAssignment_0 ) ) )
            // InternalMyDbl.g:2289:1: ( ( rule__Target__AttributesAssignment_0 ) )
            {
            // InternalMyDbl.g:2289:1: ( ( rule__Target__AttributesAssignment_0 ) )
            // InternalMyDbl.g:2290:2: ( rule__Target__AttributesAssignment_0 )
            {
             before(grammarAccess.getTargetAccess().getAttributesAssignment_0()); 
            // InternalMyDbl.g:2291:2: ( rule__Target__AttributesAssignment_0 )
            // InternalMyDbl.g:2291:3: rule__Target__AttributesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Target__AttributesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getAttributesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__0__Impl"


    // $ANTLR start "rule__Target__Group__1"
    // InternalMyDbl.g:2299:1: rule__Target__Group__1 : rule__Target__Group__1__Impl ;
    public final void rule__Target__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2303:1: ( rule__Target__Group__1__Impl )
            // InternalMyDbl.g:2304:2: rule__Target__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__1"


    // $ANTLR start "rule__Target__Group__1__Impl"
    // InternalMyDbl.g:2310:1: rule__Target__Group__1__Impl : ( ( rule__Target__Group_1__0 )* ) ;
    public final void rule__Target__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2314:1: ( ( ( rule__Target__Group_1__0 )* ) )
            // InternalMyDbl.g:2315:1: ( ( rule__Target__Group_1__0 )* )
            {
            // InternalMyDbl.g:2315:1: ( ( rule__Target__Group_1__0 )* )
            // InternalMyDbl.g:2316:2: ( rule__Target__Group_1__0 )*
            {
             before(grammarAccess.getTargetAccess().getGroup_1()); 
            // InternalMyDbl.g:2317:2: ( rule__Target__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDbl.g:2317:3: rule__Target__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Target__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTargetAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group__1__Impl"


    // $ANTLR start "rule__Target__Group_1__0"
    // InternalMyDbl.g:2326:1: rule__Target__Group_1__0 : rule__Target__Group_1__0__Impl rule__Target__Group_1__1 ;
    public final void rule__Target__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2330:1: ( rule__Target__Group_1__0__Impl rule__Target__Group_1__1 )
            // InternalMyDbl.g:2331:2: rule__Target__Group_1__0__Impl rule__Target__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Target__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Target__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_1__0"


    // $ANTLR start "rule__Target__Group_1__0__Impl"
    // InternalMyDbl.g:2338:1: rule__Target__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Target__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2342:1: ( ( ',' ) )
            // InternalMyDbl.g:2343:1: ( ',' )
            {
            // InternalMyDbl.g:2343:1: ( ',' )
            // InternalMyDbl.g:2344:2: ','
            {
             before(grammarAccess.getTargetAccess().getCommaKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTargetAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_1__0__Impl"


    // $ANTLR start "rule__Target__Group_1__1"
    // InternalMyDbl.g:2353:1: rule__Target__Group_1__1 : rule__Target__Group_1__1__Impl ;
    public final void rule__Target__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2357:1: ( rule__Target__Group_1__1__Impl )
            // InternalMyDbl.g:2358:2: rule__Target__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Target__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_1__1"


    // $ANTLR start "rule__Target__Group_1__1__Impl"
    // InternalMyDbl.g:2364:1: rule__Target__Group_1__1__Impl : ( ( rule__Target__AttributesAssignment_1_1 ) ) ;
    public final void rule__Target__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2368:1: ( ( ( rule__Target__AttributesAssignment_1_1 ) ) )
            // InternalMyDbl.g:2369:1: ( ( rule__Target__AttributesAssignment_1_1 ) )
            {
            // InternalMyDbl.g:2369:1: ( ( rule__Target__AttributesAssignment_1_1 ) )
            // InternalMyDbl.g:2370:2: ( rule__Target__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getTargetAccess().getAttributesAssignment_1_1()); 
            // InternalMyDbl.g:2371:2: ( rule__Target__AttributesAssignment_1_1 )
            // InternalMyDbl.g:2371:3: rule__Target__AttributesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Target__AttributesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getAttributesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__Group_1__1__Impl"


    // $ANTLR start "rule__JointElement__Group__0"
    // InternalMyDbl.g:2380:1: rule__JointElement__Group__0 : rule__JointElement__Group__0__Impl rule__JointElement__Group__1 ;
    public final void rule__JointElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2384:1: ( rule__JointElement__Group__0__Impl rule__JointElement__Group__1 )
            // InternalMyDbl.g:2385:2: rule__JointElement__Group__0__Impl rule__JointElement__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__JointElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__0"


    // $ANTLR start "rule__JointElement__Group__0__Impl"
    // InternalMyDbl.g:2392:1: rule__JointElement__Group__0__Impl : ( ( rule__JointElement__ElementsAssignment_0 ) ) ;
    public final void rule__JointElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2396:1: ( ( ( rule__JointElement__ElementsAssignment_0 ) ) )
            // InternalMyDbl.g:2397:1: ( ( rule__JointElement__ElementsAssignment_0 ) )
            {
            // InternalMyDbl.g:2397:1: ( ( rule__JointElement__ElementsAssignment_0 ) )
            // InternalMyDbl.g:2398:2: ( rule__JointElement__ElementsAssignment_0 )
            {
             before(grammarAccess.getJointElementAccess().getElementsAssignment_0()); 
            // InternalMyDbl.g:2399:2: ( rule__JointElement__ElementsAssignment_0 )
            // InternalMyDbl.g:2399:3: rule__JointElement__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JointElement__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJointElementAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__0__Impl"


    // $ANTLR start "rule__JointElement__Group__1"
    // InternalMyDbl.g:2407:1: rule__JointElement__Group__1 : rule__JointElement__Group__1__Impl rule__JointElement__Group__2 ;
    public final void rule__JointElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2411:1: ( rule__JointElement__Group__1__Impl rule__JointElement__Group__2 )
            // InternalMyDbl.g:2412:2: rule__JointElement__Group__1__Impl rule__JointElement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__JointElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__1"


    // $ANTLR start "rule__JointElement__Group__1__Impl"
    // InternalMyDbl.g:2419:1: rule__JointElement__Group__1__Impl : ( ( ( rule__JointElement__Group_1__0 ) ) ( ( rule__JointElement__Group_1__0 )* ) ) ;
    public final void rule__JointElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2423:1: ( ( ( ( rule__JointElement__Group_1__0 ) ) ( ( rule__JointElement__Group_1__0 )* ) ) )
            // InternalMyDbl.g:2424:1: ( ( ( rule__JointElement__Group_1__0 ) ) ( ( rule__JointElement__Group_1__0 )* ) )
            {
            // InternalMyDbl.g:2424:1: ( ( ( rule__JointElement__Group_1__0 ) ) ( ( rule__JointElement__Group_1__0 )* ) )
            // InternalMyDbl.g:2425:2: ( ( rule__JointElement__Group_1__0 ) ) ( ( rule__JointElement__Group_1__0 )* )
            {
            // InternalMyDbl.g:2425:2: ( ( rule__JointElement__Group_1__0 ) )
            // InternalMyDbl.g:2426:3: ( rule__JointElement__Group_1__0 )
            {
             before(grammarAccess.getJointElementAccess().getGroup_1()); 
            // InternalMyDbl.g:2427:3: ( rule__JointElement__Group_1__0 )
            // InternalMyDbl.g:2427:4: rule__JointElement__Group_1__0
            {
            pushFollow(FOLLOW_24);
            rule__JointElement__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getJointElementAccess().getGroup_1()); 

            }

            // InternalMyDbl.g:2430:2: ( ( rule__JointElement__Group_1__0 )* )
            // InternalMyDbl.g:2431:3: ( rule__JointElement__Group_1__0 )*
            {
             before(grammarAccess.getJointElementAccess().getGroup_1()); 
            // InternalMyDbl.g:2432:3: ( rule__JointElement__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDbl.g:2432:4: rule__JointElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__JointElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getJointElementAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__1__Impl"


    // $ANTLR start "rule__JointElement__Group__2"
    // InternalMyDbl.g:2441:1: rule__JointElement__Group__2 : rule__JointElement__Group__2__Impl rule__JointElement__Group__3 ;
    public final void rule__JointElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2445:1: ( rule__JointElement__Group__2__Impl rule__JointElement__Group__3 )
            // InternalMyDbl.g:2446:2: rule__JointElement__Group__2__Impl rule__JointElement__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__JointElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__2"


    // $ANTLR start "rule__JointElement__Group__2__Impl"
    // InternalMyDbl.g:2453:1: rule__JointElement__Group__2__Impl : ( ',' ) ;
    public final void rule__JointElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2457:1: ( ( ',' ) )
            // InternalMyDbl.g:2458:1: ( ',' )
            {
            // InternalMyDbl.g:2458:1: ( ',' )
            // InternalMyDbl.g:2459:2: ','
            {
             before(grammarAccess.getJointElementAccess().getCommaKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getJointElementAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__2__Impl"


    // $ANTLR start "rule__JointElement__Group__3"
    // InternalMyDbl.g:2468:1: rule__JointElement__Group__3 : rule__JointElement__Group__3__Impl rule__JointElement__Group__4 ;
    public final void rule__JointElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2472:1: ( rule__JointElement__Group__3__Impl rule__JointElement__Group__4 )
            // InternalMyDbl.g:2473:2: rule__JointElement__Group__3__Impl rule__JointElement__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__JointElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__3"


    // $ANTLR start "rule__JointElement__Group__3__Impl"
    // InternalMyDbl.g:2480:1: rule__JointElement__Group__3__Impl : ( 'in' ) ;
    public final void rule__JointElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2484:1: ( ( 'in' ) )
            // InternalMyDbl.g:2485:1: ( 'in' )
            {
            // InternalMyDbl.g:2485:1: ( 'in' )
            // InternalMyDbl.g:2486:2: 'in'
            {
             before(grammarAccess.getJointElementAccess().getInKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getJointElementAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__3__Impl"


    // $ANTLR start "rule__JointElement__Group__4"
    // InternalMyDbl.g:2495:1: rule__JointElement__Group__4 : rule__JointElement__Group__4__Impl rule__JointElement__Group__5 ;
    public final void rule__JointElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2499:1: ( rule__JointElement__Group__4__Impl rule__JointElement__Group__5 )
            // InternalMyDbl.g:2500:2: rule__JointElement__Group__4__Impl rule__JointElement__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__JointElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__4"


    // $ANTLR start "rule__JointElement__Group__4__Impl"
    // InternalMyDbl.g:2507:1: rule__JointElement__Group__4__Impl : ( 'which' ) ;
    public final void rule__JointElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2511:1: ( ( 'which' ) )
            // InternalMyDbl.g:2512:1: ( 'which' )
            {
            // InternalMyDbl.g:2512:1: ( 'which' )
            // InternalMyDbl.g:2513:2: 'which'
            {
             before(grammarAccess.getJointElementAccess().getWhichKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getJointElementAccess().getWhichKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__4__Impl"


    // $ANTLR start "rule__JointElement__Group__5"
    // InternalMyDbl.g:2522:1: rule__JointElement__Group__5 : rule__JointElement__Group__5__Impl ;
    public final void rule__JointElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2526:1: ( rule__JointElement__Group__5__Impl )
            // InternalMyDbl.g:2527:2: rule__JointElement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JointElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__5"


    // $ANTLR start "rule__JointElement__Group__5__Impl"
    // InternalMyDbl.g:2533:1: rule__JointElement__Group__5__Impl : ( ( rule__JointElement__ConditionsAssignment_5 ) ) ;
    public final void rule__JointElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2537:1: ( ( ( rule__JointElement__ConditionsAssignment_5 ) ) )
            // InternalMyDbl.g:2538:1: ( ( rule__JointElement__ConditionsAssignment_5 ) )
            {
            // InternalMyDbl.g:2538:1: ( ( rule__JointElement__ConditionsAssignment_5 ) )
            // InternalMyDbl.g:2539:2: ( rule__JointElement__ConditionsAssignment_5 )
            {
             before(grammarAccess.getJointElementAccess().getConditionsAssignment_5()); 
            // InternalMyDbl.g:2540:2: ( rule__JointElement__ConditionsAssignment_5 )
            // InternalMyDbl.g:2540:3: rule__JointElement__ConditionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__JointElement__ConditionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJointElementAccess().getConditionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group__5__Impl"


    // $ANTLR start "rule__JointElement__Group_1__0"
    // InternalMyDbl.g:2549:1: rule__JointElement__Group_1__0 : rule__JointElement__Group_1__0__Impl rule__JointElement__Group_1__1 ;
    public final void rule__JointElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2553:1: ( rule__JointElement__Group_1__0__Impl rule__JointElement__Group_1__1 )
            // InternalMyDbl.g:2554:2: rule__JointElement__Group_1__0__Impl rule__JointElement__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__JointElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group_1__0"


    // $ANTLR start "rule__JointElement__Group_1__0__Impl"
    // InternalMyDbl.g:2561:1: rule__JointElement__Group_1__0__Impl : ( 'with' ) ;
    public final void rule__JointElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2565:1: ( ( 'with' ) )
            // InternalMyDbl.g:2566:1: ( 'with' )
            {
            // InternalMyDbl.g:2566:1: ( 'with' )
            // InternalMyDbl.g:2567:2: 'with'
            {
             before(grammarAccess.getJointElementAccess().getWithKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getJointElementAccess().getWithKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group_1__0__Impl"


    // $ANTLR start "rule__JointElement__Group_1__1"
    // InternalMyDbl.g:2576:1: rule__JointElement__Group_1__1 : rule__JointElement__Group_1__1__Impl ;
    public final void rule__JointElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2580:1: ( rule__JointElement__Group_1__1__Impl )
            // InternalMyDbl.g:2581:2: rule__JointElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JointElement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group_1__1"


    // $ANTLR start "rule__JointElement__Group_1__1__Impl"
    // InternalMyDbl.g:2587:1: rule__JointElement__Group_1__1__Impl : ( ( rule__JointElement__ElementsAssignment_1_1 ) ) ;
    public final void rule__JointElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2591:1: ( ( ( rule__JointElement__ElementsAssignment_1_1 ) ) )
            // InternalMyDbl.g:2592:1: ( ( rule__JointElement__ElementsAssignment_1_1 ) )
            {
            // InternalMyDbl.g:2592:1: ( ( rule__JointElement__ElementsAssignment_1_1 ) )
            // InternalMyDbl.g:2593:2: ( rule__JointElement__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getJointElementAccess().getElementsAssignment_1_1()); 
            // InternalMyDbl.g:2594:2: ( rule__JointElement__ElementsAssignment_1_1 )
            // InternalMyDbl.g:2594:3: rule__JointElement__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JointElement__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJointElementAccess().getElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__Group_1__1__Impl"


    // $ANTLR start "rule__SingleCondition__Group__0"
    // InternalMyDbl.g:2603:1: rule__SingleCondition__Group__0 : rule__SingleCondition__Group__0__Impl rule__SingleCondition__Group__1 ;
    public final void rule__SingleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2607:1: ( rule__SingleCondition__Group__0__Impl rule__SingleCondition__Group__1 )
            // InternalMyDbl.g:2608:2: rule__SingleCondition__Group__0__Impl rule__SingleCondition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SingleCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__Group__0"


    // $ANTLR start "rule__SingleCondition__Group__0__Impl"
    // InternalMyDbl.g:2615:1: rule__SingleCondition__Group__0__Impl : ( ( rule__SingleCondition__ConditionsAssignment_0 ) ) ;
    public final void rule__SingleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2619:1: ( ( ( rule__SingleCondition__ConditionsAssignment_0 ) ) )
            // InternalMyDbl.g:2620:1: ( ( rule__SingleCondition__ConditionsAssignment_0 ) )
            {
            // InternalMyDbl.g:2620:1: ( ( rule__SingleCondition__ConditionsAssignment_0 ) )
            // InternalMyDbl.g:2621:2: ( rule__SingleCondition__ConditionsAssignment_0 )
            {
             before(grammarAccess.getSingleConditionAccess().getConditionsAssignment_0()); 
            // InternalMyDbl.g:2622:2: ( rule__SingleCondition__ConditionsAssignment_0 )
            // InternalMyDbl.g:2622:3: rule__SingleCondition__ConditionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleCondition__ConditionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleConditionAccess().getConditionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__Group__0__Impl"


    // $ANTLR start "rule__SingleCondition__Group__1"
    // InternalMyDbl.g:2630:1: rule__SingleCondition__Group__1 : rule__SingleCondition__Group__1__Impl ;
    public final void rule__SingleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2634:1: ( rule__SingleCondition__Group__1__Impl )
            // InternalMyDbl.g:2635:2: rule__SingleCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__Group__1"


    // $ANTLR start "rule__SingleCondition__Group__1__Impl"
    // InternalMyDbl.g:2641:1: rule__SingleCondition__Group__1__Impl : ( ( rule__SingleCondition__Group_1__0 )* ) ;
    public final void rule__SingleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2645:1: ( ( ( rule__SingleCondition__Group_1__0 )* ) )
            // InternalMyDbl.g:2646:1: ( ( rule__SingleCondition__Group_1__0 )* )
            {
            // InternalMyDbl.g:2646:1: ( ( rule__SingleCondition__Group_1__0 )* )
            // InternalMyDbl.g:2647:2: ( rule__SingleCondition__Group_1__0 )*
            {
             before(grammarAccess.getSingleConditionAccess().getGroup_1()); 
            // InternalMyDbl.g:2648:2: ( rule__SingleCondition__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDbl.g:2648:3: rule__SingleCondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SingleCondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSingleConditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__Group__1__Impl"


    // $ANTLR start "rule__SingleCondition__Group_1__0"
    // InternalMyDbl.g:2657:1: rule__SingleCondition__Group_1__0 : rule__SingleCondition__Group_1__0__Impl rule__SingleCondition__Group_1__1 ;
    public final void rule__SingleCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2661:1: ( rule__SingleCondition__Group_1__0__Impl rule__SingleCondition__Group_1__1 )
            // InternalMyDbl.g:2662:2: rule__SingleCondition__Group_1__0__Impl rule__SingleCondition__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleCondition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__Group_1__0"


    // $ANTLR start "rule__SingleCondition__Group_1__0__Impl"
    // InternalMyDbl.g:2669:1: rule__SingleCondition__Group_1__0__Impl : ( ',' ) ;
    public final void rule__SingleCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2673:1: ( ( ',' ) )
            // InternalMyDbl.g:2674:1: ( ',' )
            {
            // InternalMyDbl.g:2674:1: ( ',' )
            // InternalMyDbl.g:2675:2: ','
            {
             before(grammarAccess.getSingleConditionAccess().getCommaKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSingleConditionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__Group_1__0__Impl"


    // $ANTLR start "rule__SingleCondition__Group_1__1"
    // InternalMyDbl.g:2684:1: rule__SingleCondition__Group_1__1 : rule__SingleCondition__Group_1__1__Impl ;
    public final void rule__SingleCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2688:1: ( rule__SingleCondition__Group_1__1__Impl )
            // InternalMyDbl.g:2689:2: rule__SingleCondition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleCondition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__Group_1__1"


    // $ANTLR start "rule__SingleCondition__Group_1__1__Impl"
    // InternalMyDbl.g:2695:1: rule__SingleCondition__Group_1__1__Impl : ( ( rule__SingleCondition__ConditionsAssignment_1_1 ) ) ;
    public final void rule__SingleCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2699:1: ( ( ( rule__SingleCondition__ConditionsAssignment_1_1 ) ) )
            // InternalMyDbl.g:2700:1: ( ( rule__SingleCondition__ConditionsAssignment_1_1 ) )
            {
            // InternalMyDbl.g:2700:1: ( ( rule__SingleCondition__ConditionsAssignment_1_1 ) )
            // InternalMyDbl.g:2701:2: ( rule__SingleCondition__ConditionsAssignment_1_1 )
            {
             before(grammarAccess.getSingleConditionAccess().getConditionsAssignment_1_1()); 
            // InternalMyDbl.g:2702:2: ( rule__SingleCondition__ConditionsAssignment_1_1 )
            // InternalMyDbl.g:2702:3: rule__SingleCondition__ConditionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleCondition__ConditionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleConditionAccess().getConditionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__Group_1__1__Impl"


    // $ANTLR start "rule__JointCondition__Group__0"
    // InternalMyDbl.g:2711:1: rule__JointCondition__Group__0 : rule__JointCondition__Group__0__Impl rule__JointCondition__Group__1 ;
    public final void rule__JointCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2715:1: ( rule__JointCondition__Group__0__Impl rule__JointCondition__Group__1 )
            // InternalMyDbl.g:2716:2: rule__JointCondition__Group__0__Impl rule__JointCondition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__JointCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__Group__0"


    // $ANTLR start "rule__JointCondition__Group__0__Impl"
    // InternalMyDbl.g:2723:1: rule__JointCondition__Group__0__Impl : ( ( rule__JointCondition__ConditionsAssignment_0 ) ) ;
    public final void rule__JointCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2727:1: ( ( ( rule__JointCondition__ConditionsAssignment_0 ) ) )
            // InternalMyDbl.g:2728:1: ( ( rule__JointCondition__ConditionsAssignment_0 ) )
            {
            // InternalMyDbl.g:2728:1: ( ( rule__JointCondition__ConditionsAssignment_0 ) )
            // InternalMyDbl.g:2729:2: ( rule__JointCondition__ConditionsAssignment_0 )
            {
             before(grammarAccess.getJointConditionAccess().getConditionsAssignment_0()); 
            // InternalMyDbl.g:2730:2: ( rule__JointCondition__ConditionsAssignment_0 )
            // InternalMyDbl.g:2730:3: rule__JointCondition__ConditionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JointCondition__ConditionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJointConditionAccess().getConditionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__Group__0__Impl"


    // $ANTLR start "rule__JointCondition__Group__1"
    // InternalMyDbl.g:2738:1: rule__JointCondition__Group__1 : rule__JointCondition__Group__1__Impl ;
    public final void rule__JointCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2742:1: ( rule__JointCondition__Group__1__Impl )
            // InternalMyDbl.g:2743:2: rule__JointCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JointCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__Group__1"


    // $ANTLR start "rule__JointCondition__Group__1__Impl"
    // InternalMyDbl.g:2749:1: rule__JointCondition__Group__1__Impl : ( ( rule__JointCondition__Group_1__0 )* ) ;
    public final void rule__JointCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2753:1: ( ( ( rule__JointCondition__Group_1__0 )* ) )
            // InternalMyDbl.g:2754:1: ( ( rule__JointCondition__Group_1__0 )* )
            {
            // InternalMyDbl.g:2754:1: ( ( rule__JointCondition__Group_1__0 )* )
            // InternalMyDbl.g:2755:2: ( rule__JointCondition__Group_1__0 )*
            {
             before(grammarAccess.getJointConditionAccess().getGroup_1()); 
            // InternalMyDbl.g:2756:2: ( rule__JointCondition__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDbl.g:2756:3: rule__JointCondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__JointCondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getJointConditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__Group__1__Impl"


    // $ANTLR start "rule__JointCondition__Group_1__0"
    // InternalMyDbl.g:2765:1: rule__JointCondition__Group_1__0 : rule__JointCondition__Group_1__0__Impl rule__JointCondition__Group_1__1 ;
    public final void rule__JointCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2769:1: ( rule__JointCondition__Group_1__0__Impl rule__JointCondition__Group_1__1 )
            // InternalMyDbl.g:2770:2: rule__JointCondition__Group_1__0__Impl rule__JointCondition__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__JointCondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointCondition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__Group_1__0"


    // $ANTLR start "rule__JointCondition__Group_1__0__Impl"
    // InternalMyDbl.g:2777:1: rule__JointCondition__Group_1__0__Impl : ( ',' ) ;
    public final void rule__JointCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2781:1: ( ( ',' ) )
            // InternalMyDbl.g:2782:1: ( ',' )
            {
            // InternalMyDbl.g:2782:1: ( ',' )
            // InternalMyDbl.g:2783:2: ','
            {
             before(grammarAccess.getJointConditionAccess().getCommaKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getJointConditionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__Group_1__0__Impl"


    // $ANTLR start "rule__JointCondition__Group_1__1"
    // InternalMyDbl.g:2792:1: rule__JointCondition__Group_1__1 : rule__JointCondition__Group_1__1__Impl ;
    public final void rule__JointCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2796:1: ( rule__JointCondition__Group_1__1__Impl )
            // InternalMyDbl.g:2797:2: rule__JointCondition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JointCondition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__Group_1__1"


    // $ANTLR start "rule__JointCondition__Group_1__1__Impl"
    // InternalMyDbl.g:2803:1: rule__JointCondition__Group_1__1__Impl : ( ( rule__JointCondition__ConditionsAssignment_1_1 ) ) ;
    public final void rule__JointCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2807:1: ( ( ( rule__JointCondition__ConditionsAssignment_1_1 ) ) )
            // InternalMyDbl.g:2808:1: ( ( rule__JointCondition__ConditionsAssignment_1_1 ) )
            {
            // InternalMyDbl.g:2808:1: ( ( rule__JointCondition__ConditionsAssignment_1_1 ) )
            // InternalMyDbl.g:2809:2: ( rule__JointCondition__ConditionsAssignment_1_1 )
            {
             before(grammarAccess.getJointConditionAccess().getConditionsAssignment_1_1()); 
            // InternalMyDbl.g:2810:2: ( rule__JointCondition__ConditionsAssignment_1_1 )
            // InternalMyDbl.g:2810:3: rule__JointCondition__ConditionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__JointCondition__ConditionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJointConditionAccess().getConditionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__Group_1__1__Impl"


    // $ANTLR start "rule__SingleConditionUnit__Group__0"
    // InternalMyDbl.g:2819:1: rule__SingleConditionUnit__Group__0 : rule__SingleConditionUnit__Group__0__Impl rule__SingleConditionUnit__Group__1 ;
    public final void rule__SingleConditionUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2823:1: ( rule__SingleConditionUnit__Group__0__Impl rule__SingleConditionUnit__Group__1 )
            // InternalMyDbl.g:2824:2: rule__SingleConditionUnit__Group__0__Impl rule__SingleConditionUnit__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__SingleConditionUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleConditionUnit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__Group__0"


    // $ANTLR start "rule__SingleConditionUnit__Group__0__Impl"
    // InternalMyDbl.g:2831:1: rule__SingleConditionUnit__Group__0__Impl : ( ( rule__SingleConditionUnit__AttributeLeftAssignment_0 ) ) ;
    public final void rule__SingleConditionUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2835:1: ( ( ( rule__SingleConditionUnit__AttributeLeftAssignment_0 ) ) )
            // InternalMyDbl.g:2836:1: ( ( rule__SingleConditionUnit__AttributeLeftAssignment_0 ) )
            {
            // InternalMyDbl.g:2836:1: ( ( rule__SingleConditionUnit__AttributeLeftAssignment_0 ) )
            // InternalMyDbl.g:2837:2: ( rule__SingleConditionUnit__AttributeLeftAssignment_0 )
            {
             before(grammarAccess.getSingleConditionUnitAccess().getAttributeLeftAssignment_0()); 
            // InternalMyDbl.g:2838:2: ( rule__SingleConditionUnit__AttributeLeftAssignment_0 )
            // InternalMyDbl.g:2838:3: rule__SingleConditionUnit__AttributeLeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SingleConditionUnit__AttributeLeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleConditionUnitAccess().getAttributeLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__Group__0__Impl"


    // $ANTLR start "rule__SingleConditionUnit__Group__1"
    // InternalMyDbl.g:2846:1: rule__SingleConditionUnit__Group__1 : rule__SingleConditionUnit__Group__1__Impl rule__SingleConditionUnit__Group__2 ;
    public final void rule__SingleConditionUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2850:1: ( rule__SingleConditionUnit__Group__1__Impl rule__SingleConditionUnit__Group__2 )
            // InternalMyDbl.g:2851:2: rule__SingleConditionUnit__Group__1__Impl rule__SingleConditionUnit__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__SingleConditionUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleConditionUnit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__Group__1"


    // $ANTLR start "rule__SingleConditionUnit__Group__1__Impl"
    // InternalMyDbl.g:2858:1: rule__SingleConditionUnit__Group__1__Impl : ( ( rule__SingleConditionUnit__JudgementAssignment_1 ) ) ;
    public final void rule__SingleConditionUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2862:1: ( ( ( rule__SingleConditionUnit__JudgementAssignment_1 ) ) )
            // InternalMyDbl.g:2863:1: ( ( rule__SingleConditionUnit__JudgementAssignment_1 ) )
            {
            // InternalMyDbl.g:2863:1: ( ( rule__SingleConditionUnit__JudgementAssignment_1 ) )
            // InternalMyDbl.g:2864:2: ( rule__SingleConditionUnit__JudgementAssignment_1 )
            {
             before(grammarAccess.getSingleConditionUnitAccess().getJudgementAssignment_1()); 
            // InternalMyDbl.g:2865:2: ( rule__SingleConditionUnit__JudgementAssignment_1 )
            // InternalMyDbl.g:2865:3: rule__SingleConditionUnit__JudgementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleConditionUnit__JudgementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleConditionUnitAccess().getJudgementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__Group__1__Impl"


    // $ANTLR start "rule__SingleConditionUnit__Group__2"
    // InternalMyDbl.g:2873:1: rule__SingleConditionUnit__Group__2 : rule__SingleConditionUnit__Group__2__Impl ;
    public final void rule__SingleConditionUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2877:1: ( rule__SingleConditionUnit__Group__2__Impl )
            // InternalMyDbl.g:2878:2: rule__SingleConditionUnit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleConditionUnit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__Group__2"


    // $ANTLR start "rule__SingleConditionUnit__Group__2__Impl"
    // InternalMyDbl.g:2884:1: rule__SingleConditionUnit__Group__2__Impl : ( ( rule__SingleConditionUnit__Alternatives_2 ) ) ;
    public final void rule__SingleConditionUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2888:1: ( ( ( rule__SingleConditionUnit__Alternatives_2 ) ) )
            // InternalMyDbl.g:2889:1: ( ( rule__SingleConditionUnit__Alternatives_2 ) )
            {
            // InternalMyDbl.g:2889:1: ( ( rule__SingleConditionUnit__Alternatives_2 ) )
            // InternalMyDbl.g:2890:2: ( rule__SingleConditionUnit__Alternatives_2 )
            {
             before(grammarAccess.getSingleConditionUnitAccess().getAlternatives_2()); 
            // InternalMyDbl.g:2891:2: ( rule__SingleConditionUnit__Alternatives_2 )
            // InternalMyDbl.g:2891:3: rule__SingleConditionUnit__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleConditionUnit__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleConditionUnitAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__Group__2__Impl"


    // $ANTLR start "rule__JointConditionUnit__Group__0"
    // InternalMyDbl.g:2900:1: rule__JointConditionUnit__Group__0 : rule__JointConditionUnit__Group__0__Impl rule__JointConditionUnit__Group__1 ;
    public final void rule__JointConditionUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2904:1: ( rule__JointConditionUnit__Group__0__Impl rule__JointConditionUnit__Group__1 )
            // InternalMyDbl.g:2905:2: rule__JointConditionUnit__Group__0__Impl rule__JointConditionUnit__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__JointConditionUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointConditionUnit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__Group__0"


    // $ANTLR start "rule__JointConditionUnit__Group__0__Impl"
    // InternalMyDbl.g:2912:1: rule__JointConditionUnit__Group__0__Impl : ( ( rule__JointConditionUnit__ElementLeftAssignment_0 ) ) ;
    public final void rule__JointConditionUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2916:1: ( ( ( rule__JointConditionUnit__ElementLeftAssignment_0 ) ) )
            // InternalMyDbl.g:2917:1: ( ( rule__JointConditionUnit__ElementLeftAssignment_0 ) )
            {
            // InternalMyDbl.g:2917:1: ( ( rule__JointConditionUnit__ElementLeftAssignment_0 ) )
            // InternalMyDbl.g:2918:2: ( rule__JointConditionUnit__ElementLeftAssignment_0 )
            {
             before(grammarAccess.getJointConditionUnitAccess().getElementLeftAssignment_0()); 
            // InternalMyDbl.g:2919:2: ( rule__JointConditionUnit__ElementLeftAssignment_0 )
            // InternalMyDbl.g:2919:3: rule__JointConditionUnit__ElementLeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JointConditionUnit__ElementLeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJointConditionUnitAccess().getElementLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__Group__0__Impl"


    // $ANTLR start "rule__JointConditionUnit__Group__1"
    // InternalMyDbl.g:2927:1: rule__JointConditionUnit__Group__1 : rule__JointConditionUnit__Group__1__Impl rule__JointConditionUnit__Group__2 ;
    public final void rule__JointConditionUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2931:1: ( rule__JointConditionUnit__Group__1__Impl rule__JointConditionUnit__Group__2 )
            // InternalMyDbl.g:2932:2: rule__JointConditionUnit__Group__1__Impl rule__JointConditionUnit__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__JointConditionUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JointConditionUnit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__Group__1"


    // $ANTLR start "rule__JointConditionUnit__Group__1__Impl"
    // InternalMyDbl.g:2939:1: rule__JointConditionUnit__Group__1__Impl : ( ( rule__JointConditionUnit__JudgementAssignment_1 ) ) ;
    public final void rule__JointConditionUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2943:1: ( ( ( rule__JointConditionUnit__JudgementAssignment_1 ) ) )
            // InternalMyDbl.g:2944:1: ( ( rule__JointConditionUnit__JudgementAssignment_1 ) )
            {
            // InternalMyDbl.g:2944:1: ( ( rule__JointConditionUnit__JudgementAssignment_1 ) )
            // InternalMyDbl.g:2945:2: ( rule__JointConditionUnit__JudgementAssignment_1 )
            {
             before(grammarAccess.getJointConditionUnitAccess().getJudgementAssignment_1()); 
            // InternalMyDbl.g:2946:2: ( rule__JointConditionUnit__JudgementAssignment_1 )
            // InternalMyDbl.g:2946:3: rule__JointConditionUnit__JudgementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JointConditionUnit__JudgementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointConditionUnitAccess().getJudgementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__Group__1__Impl"


    // $ANTLR start "rule__JointConditionUnit__Group__2"
    // InternalMyDbl.g:2954:1: rule__JointConditionUnit__Group__2 : rule__JointConditionUnit__Group__2__Impl ;
    public final void rule__JointConditionUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2958:1: ( rule__JointConditionUnit__Group__2__Impl )
            // InternalMyDbl.g:2959:2: rule__JointConditionUnit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JointConditionUnit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__Group__2"


    // $ANTLR start "rule__JointConditionUnit__Group__2__Impl"
    // InternalMyDbl.g:2965:1: rule__JointConditionUnit__Group__2__Impl : ( ( rule__JointConditionUnit__Alternatives_2 ) ) ;
    public final void rule__JointConditionUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2969:1: ( ( ( rule__JointConditionUnit__Alternatives_2 ) ) )
            // InternalMyDbl.g:2970:1: ( ( rule__JointConditionUnit__Alternatives_2 ) )
            {
            // InternalMyDbl.g:2970:1: ( ( rule__JointConditionUnit__Alternatives_2 ) )
            // InternalMyDbl.g:2971:2: ( rule__JointConditionUnit__Alternatives_2 )
            {
             before(grammarAccess.getJointConditionUnitAccess().getAlternatives_2()); 
            // InternalMyDbl.g:2972:2: ( rule__JointConditionUnit__Alternatives_2 )
            // InternalMyDbl.g:2972:3: rule__JointConditionUnit__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__JointConditionUnit__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getJointConditionUnitAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__Group__2__Impl"


    // $ANTLR start "rule__AttributeOfElement__Group__0"
    // InternalMyDbl.g:2981:1: rule__AttributeOfElement__Group__0 : rule__AttributeOfElement__Group__0__Impl rule__AttributeOfElement__Group__1 ;
    public final void rule__AttributeOfElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2985:1: ( rule__AttributeOfElement__Group__0__Impl rule__AttributeOfElement__Group__1 )
            // InternalMyDbl.g:2986:2: rule__AttributeOfElement__Group__0__Impl rule__AttributeOfElement__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AttributeOfElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOfElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOfElement__Group__0"


    // $ANTLR start "rule__AttributeOfElement__Group__0__Impl"
    // InternalMyDbl.g:2993:1: rule__AttributeOfElement__Group__0__Impl : ( ( rule__AttributeOfElement__ElementAssignment_0 ) ) ;
    public final void rule__AttributeOfElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:2997:1: ( ( ( rule__AttributeOfElement__ElementAssignment_0 ) ) )
            // InternalMyDbl.g:2998:1: ( ( rule__AttributeOfElement__ElementAssignment_0 ) )
            {
            // InternalMyDbl.g:2998:1: ( ( rule__AttributeOfElement__ElementAssignment_0 ) )
            // InternalMyDbl.g:2999:2: ( rule__AttributeOfElement__ElementAssignment_0 )
            {
             before(grammarAccess.getAttributeOfElementAccess().getElementAssignment_0()); 
            // InternalMyDbl.g:3000:2: ( rule__AttributeOfElement__ElementAssignment_0 )
            // InternalMyDbl.g:3000:3: rule__AttributeOfElement__ElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOfElement__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeOfElementAccess().getElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOfElement__Group__0__Impl"


    // $ANTLR start "rule__AttributeOfElement__Group__1"
    // InternalMyDbl.g:3008:1: rule__AttributeOfElement__Group__1 : rule__AttributeOfElement__Group__1__Impl rule__AttributeOfElement__Group__2 ;
    public final void rule__AttributeOfElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3012:1: ( rule__AttributeOfElement__Group__1__Impl rule__AttributeOfElement__Group__2 )
            // InternalMyDbl.g:3013:2: rule__AttributeOfElement__Group__1__Impl rule__AttributeOfElement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AttributeOfElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeOfElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOfElement__Group__1"


    // $ANTLR start "rule__AttributeOfElement__Group__1__Impl"
    // InternalMyDbl.g:3020:1: rule__AttributeOfElement__Group__1__Impl : ( '\\'s' ) ;
    public final void rule__AttributeOfElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3024:1: ( ( '\\'s' ) )
            // InternalMyDbl.g:3025:1: ( '\\'s' )
            {
            // InternalMyDbl.g:3025:1: ( '\\'s' )
            // InternalMyDbl.g:3026:2: '\\'s'
            {
             before(grammarAccess.getAttributeOfElementAccess().getSKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAttributeOfElementAccess().getSKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOfElement__Group__1__Impl"


    // $ANTLR start "rule__AttributeOfElement__Group__2"
    // InternalMyDbl.g:3035:1: rule__AttributeOfElement__Group__2 : rule__AttributeOfElement__Group__2__Impl ;
    public final void rule__AttributeOfElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3039:1: ( rule__AttributeOfElement__Group__2__Impl )
            // InternalMyDbl.g:3040:2: rule__AttributeOfElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOfElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOfElement__Group__2"


    // $ANTLR start "rule__AttributeOfElement__Group__2__Impl"
    // InternalMyDbl.g:3046:1: rule__AttributeOfElement__Group__2__Impl : ( ( rule__AttributeOfElement__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeOfElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3050:1: ( ( ( rule__AttributeOfElement__AttributeAssignment_2 ) ) )
            // InternalMyDbl.g:3051:1: ( ( rule__AttributeOfElement__AttributeAssignment_2 ) )
            {
            // InternalMyDbl.g:3051:1: ( ( rule__AttributeOfElement__AttributeAssignment_2 ) )
            // InternalMyDbl.g:3052:2: ( rule__AttributeOfElement__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeOfElementAccess().getAttributeAssignment_2()); 
            // InternalMyDbl.g:3053:2: ( rule__AttributeOfElement__AttributeAssignment_2 )
            // InternalMyDbl.g:3053:3: rule__AttributeOfElement__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeOfElement__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeOfElementAccess().getAttributeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOfElement__Group__2__Impl"


    // $ANTLR start "rule__Judgement__Group_3__0"
    // InternalMyDbl.g:3062:1: rule__Judgement__Group_3__0 : rule__Judgement__Group_3__0__Impl rule__Judgement__Group_3__1 ;
    public final void rule__Judgement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3066:1: ( rule__Judgement__Group_3__0__Impl rule__Judgement__Group_3__1 )
            // InternalMyDbl.g:3067:2: rule__Judgement__Group_3__0__Impl rule__Judgement__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Judgement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_3__0"


    // $ANTLR start "rule__Judgement__Group_3__0__Impl"
    // InternalMyDbl.g:3074:1: rule__Judgement__Group_3__0__Impl : ( 'is' ) ;
    public final void rule__Judgement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3078:1: ( ( 'is' ) )
            // InternalMyDbl.g:3079:1: ( 'is' )
            {
            // InternalMyDbl.g:3079:1: ( 'is' )
            // InternalMyDbl.g:3080:2: 'is'
            {
             before(grammarAccess.getJudgementAccess().getIsKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getIsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_3__0__Impl"


    // $ANTLR start "rule__Judgement__Group_3__1"
    // InternalMyDbl.g:3089:1: rule__Judgement__Group_3__1 : rule__Judgement__Group_3__1__Impl ;
    public final void rule__Judgement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3093:1: ( rule__Judgement__Group_3__1__Impl )
            // InternalMyDbl.g:3094:2: rule__Judgement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Judgement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_3__1"


    // $ANTLR start "rule__Judgement__Group_3__1__Impl"
    // InternalMyDbl.g:3100:1: rule__Judgement__Group_3__1__Impl : ( 'not' ) ;
    public final void rule__Judgement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3104:1: ( ( 'not' ) )
            // InternalMyDbl.g:3105:1: ( 'not' )
            {
            // InternalMyDbl.g:3105:1: ( 'not' )
            // InternalMyDbl.g:3106:2: 'not'
            {
             before(grammarAccess.getJudgementAccess().getNotKeyword_3_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getNotKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_3__1__Impl"


    // $ANTLR start "rule__Judgement__Group_4__0"
    // InternalMyDbl.g:3116:1: rule__Judgement__Group_4__0 : rule__Judgement__Group_4__0__Impl rule__Judgement__Group_4__1 ;
    public final void rule__Judgement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3120:1: ( rule__Judgement__Group_4__0__Impl rule__Judgement__Group_4__1 )
            // InternalMyDbl.g:3121:2: rule__Judgement__Group_4__0__Impl rule__Judgement__Group_4__1
            {
            pushFollow(FOLLOW_30);
            rule__Judgement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_4__0"


    // $ANTLR start "rule__Judgement__Group_4__0__Impl"
    // InternalMyDbl.g:3128:1: rule__Judgement__Group_4__0__Impl : ( 'not' ) ;
    public final void rule__Judgement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3132:1: ( ( 'not' ) )
            // InternalMyDbl.g:3133:1: ( 'not' )
            {
            // InternalMyDbl.g:3133:1: ( 'not' )
            // InternalMyDbl.g:3134:2: 'not'
            {
             before(grammarAccess.getJudgementAccess().getNotKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getNotKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_4__0__Impl"


    // $ANTLR start "rule__Judgement__Group_4__1"
    // InternalMyDbl.g:3143:1: rule__Judgement__Group_4__1 : rule__Judgement__Group_4__1__Impl ;
    public final void rule__Judgement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3147:1: ( rule__Judgement__Group_4__1__Impl )
            // InternalMyDbl.g:3148:2: rule__Judgement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Judgement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_4__1"


    // $ANTLR start "rule__Judgement__Group_4__1__Impl"
    // InternalMyDbl.g:3154:1: rule__Judgement__Group_4__1__Impl : ( 'equals' ) ;
    public final void rule__Judgement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3158:1: ( ( 'equals' ) )
            // InternalMyDbl.g:3159:1: ( 'equals' )
            {
            // InternalMyDbl.g:3159:1: ( 'equals' )
            // InternalMyDbl.g:3160:2: 'equals'
            {
             before(grammarAccess.getJudgementAccess().getEqualsKeyword_4_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getEqualsKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_4__1__Impl"


    // $ANTLR start "rule__Judgement__Group_5__0"
    // InternalMyDbl.g:3170:1: rule__Judgement__Group_5__0 : rule__Judgement__Group_5__0__Impl rule__Judgement__Group_5__1 ;
    public final void rule__Judgement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3174:1: ( rule__Judgement__Group_5__0__Impl rule__Judgement__Group_5__1 )
            // InternalMyDbl.g:3175:2: rule__Judgement__Group_5__0__Impl rule__Judgement__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__Judgement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_5__0"


    // $ANTLR start "rule__Judgement__Group_5__0__Impl"
    // InternalMyDbl.g:3182:1: rule__Judgement__Group_5__0__Impl : ( 'is' ) ;
    public final void rule__Judgement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3186:1: ( ( 'is' ) )
            // InternalMyDbl.g:3187:1: ( 'is' )
            {
            // InternalMyDbl.g:3187:1: ( 'is' )
            // InternalMyDbl.g:3188:2: 'is'
            {
             before(grammarAccess.getJudgementAccess().getIsKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getIsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_5__0__Impl"


    // $ANTLR start "rule__Judgement__Group_5__1"
    // InternalMyDbl.g:3197:1: rule__Judgement__Group_5__1 : rule__Judgement__Group_5__1__Impl rule__Judgement__Group_5__2 ;
    public final void rule__Judgement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3201:1: ( rule__Judgement__Group_5__1__Impl rule__Judgement__Group_5__2 )
            // InternalMyDbl.g:3202:2: rule__Judgement__Group_5__1__Impl rule__Judgement__Group_5__2
            {
            pushFollow(FOLLOW_32);
            rule__Judgement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_5__1"


    // $ANTLR start "rule__Judgement__Group_5__1__Impl"
    // InternalMyDbl.g:3209:1: rule__Judgement__Group_5__1__Impl : ( 'larger' ) ;
    public final void rule__Judgement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3213:1: ( ( 'larger' ) )
            // InternalMyDbl.g:3214:1: ( 'larger' )
            {
            // InternalMyDbl.g:3214:1: ( 'larger' )
            // InternalMyDbl.g:3215:2: 'larger'
            {
             before(grammarAccess.getJudgementAccess().getLargerKeyword_5_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getLargerKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_5__1__Impl"


    // $ANTLR start "rule__Judgement__Group_5__2"
    // InternalMyDbl.g:3224:1: rule__Judgement__Group_5__2 : rule__Judgement__Group_5__2__Impl ;
    public final void rule__Judgement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3228:1: ( rule__Judgement__Group_5__2__Impl )
            // InternalMyDbl.g:3229:2: rule__Judgement__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Judgement__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_5__2"


    // $ANTLR start "rule__Judgement__Group_5__2__Impl"
    // InternalMyDbl.g:3235:1: rule__Judgement__Group_5__2__Impl : ( 'than' ) ;
    public final void rule__Judgement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3239:1: ( ( 'than' ) )
            // InternalMyDbl.g:3240:1: ( 'than' )
            {
            // InternalMyDbl.g:3240:1: ( 'than' )
            // InternalMyDbl.g:3241:2: 'than'
            {
             before(grammarAccess.getJudgementAccess().getThanKeyword_5_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getThanKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_5__2__Impl"


    // $ANTLR start "rule__Judgement__Group_6__0"
    // InternalMyDbl.g:3251:1: rule__Judgement__Group_6__0 : rule__Judgement__Group_6__0__Impl rule__Judgement__Group_6__1 ;
    public final void rule__Judgement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3255:1: ( rule__Judgement__Group_6__0__Impl rule__Judgement__Group_6__1 )
            // InternalMyDbl.g:3256:2: rule__Judgement__Group_6__0__Impl rule__Judgement__Group_6__1
            {
            pushFollow(FOLLOW_33);
            rule__Judgement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_6__0"


    // $ANTLR start "rule__Judgement__Group_6__0__Impl"
    // InternalMyDbl.g:3263:1: rule__Judgement__Group_6__0__Impl : ( 'is' ) ;
    public final void rule__Judgement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3267:1: ( ( 'is' ) )
            // InternalMyDbl.g:3268:1: ( 'is' )
            {
            // InternalMyDbl.g:3268:1: ( 'is' )
            // InternalMyDbl.g:3269:2: 'is'
            {
             before(grammarAccess.getJudgementAccess().getIsKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getIsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_6__0__Impl"


    // $ANTLR start "rule__Judgement__Group_6__1"
    // InternalMyDbl.g:3278:1: rule__Judgement__Group_6__1 : rule__Judgement__Group_6__1__Impl rule__Judgement__Group_6__2 ;
    public final void rule__Judgement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3282:1: ( rule__Judgement__Group_6__1__Impl rule__Judgement__Group_6__2 )
            // InternalMyDbl.g:3283:2: rule__Judgement__Group_6__1__Impl rule__Judgement__Group_6__2
            {
            pushFollow(FOLLOW_32);
            rule__Judgement__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_6__1"


    // $ANTLR start "rule__Judgement__Group_6__1__Impl"
    // InternalMyDbl.g:3290:1: rule__Judgement__Group_6__1__Impl : ( 'less' ) ;
    public final void rule__Judgement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3294:1: ( ( 'less' ) )
            // InternalMyDbl.g:3295:1: ( 'less' )
            {
            // InternalMyDbl.g:3295:1: ( 'less' )
            // InternalMyDbl.g:3296:2: 'less'
            {
             before(grammarAccess.getJudgementAccess().getLessKeyword_6_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getLessKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_6__1__Impl"


    // $ANTLR start "rule__Judgement__Group_6__2"
    // InternalMyDbl.g:3305:1: rule__Judgement__Group_6__2 : rule__Judgement__Group_6__2__Impl ;
    public final void rule__Judgement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3309:1: ( rule__Judgement__Group_6__2__Impl )
            // InternalMyDbl.g:3310:2: rule__Judgement__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Judgement__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_6__2"


    // $ANTLR start "rule__Judgement__Group_6__2__Impl"
    // InternalMyDbl.g:3316:1: rule__Judgement__Group_6__2__Impl : ( 'than' ) ;
    public final void rule__Judgement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3320:1: ( ( 'than' ) )
            // InternalMyDbl.g:3321:1: ( 'than' )
            {
            // InternalMyDbl.g:3321:1: ( 'than' )
            // InternalMyDbl.g:3322:2: 'than'
            {
             before(grammarAccess.getJudgementAccess().getThanKeyword_6_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getThanKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_6__2__Impl"


    // $ANTLR start "rule__Judgement__Group_7__0"
    // InternalMyDbl.g:3332:1: rule__Judgement__Group_7__0 : rule__Judgement__Group_7__0__Impl rule__Judgement__Group_7__1 ;
    public final void rule__Judgement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3336:1: ( rule__Judgement__Group_7__0__Impl rule__Judgement__Group_7__1 )
            // InternalMyDbl.g:3337:2: rule__Judgement__Group_7__0__Impl rule__Judgement__Group_7__1
            {
            pushFollow(FOLLOW_33);
            rule__Judgement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_7__0"


    // $ANTLR start "rule__Judgement__Group_7__0__Impl"
    // InternalMyDbl.g:3344:1: rule__Judgement__Group_7__0__Impl : ( 'no' ) ;
    public final void rule__Judgement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3348:1: ( ( 'no' ) )
            // InternalMyDbl.g:3349:1: ( 'no' )
            {
            // InternalMyDbl.g:3349:1: ( 'no' )
            // InternalMyDbl.g:3350:2: 'no'
            {
             before(grammarAccess.getJudgementAccess().getNoKeyword_7_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getNoKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_7__0__Impl"


    // $ANTLR start "rule__Judgement__Group_7__1"
    // InternalMyDbl.g:3359:1: rule__Judgement__Group_7__1 : rule__Judgement__Group_7__1__Impl rule__Judgement__Group_7__2 ;
    public final void rule__Judgement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3363:1: ( rule__Judgement__Group_7__1__Impl rule__Judgement__Group_7__2 )
            // InternalMyDbl.g:3364:2: rule__Judgement__Group_7__1__Impl rule__Judgement__Group_7__2
            {
            pushFollow(FOLLOW_32);
            rule__Judgement__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_7__1"


    // $ANTLR start "rule__Judgement__Group_7__1__Impl"
    // InternalMyDbl.g:3371:1: rule__Judgement__Group_7__1__Impl : ( 'less' ) ;
    public final void rule__Judgement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3375:1: ( ( 'less' ) )
            // InternalMyDbl.g:3376:1: ( 'less' )
            {
            // InternalMyDbl.g:3376:1: ( 'less' )
            // InternalMyDbl.g:3377:2: 'less'
            {
             before(grammarAccess.getJudgementAccess().getLessKeyword_7_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getLessKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_7__1__Impl"


    // $ANTLR start "rule__Judgement__Group_7__2"
    // InternalMyDbl.g:3386:1: rule__Judgement__Group_7__2 : rule__Judgement__Group_7__2__Impl ;
    public final void rule__Judgement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3390:1: ( rule__Judgement__Group_7__2__Impl )
            // InternalMyDbl.g:3391:2: rule__Judgement__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Judgement__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_7__2"


    // $ANTLR start "rule__Judgement__Group_7__2__Impl"
    // InternalMyDbl.g:3397:1: rule__Judgement__Group_7__2__Impl : ( 'than' ) ;
    public final void rule__Judgement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3401:1: ( ( 'than' ) )
            // InternalMyDbl.g:3402:1: ( 'than' )
            {
            // InternalMyDbl.g:3402:1: ( 'than' )
            // InternalMyDbl.g:3403:2: 'than'
            {
             before(grammarAccess.getJudgementAccess().getThanKeyword_7_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getThanKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_7__2__Impl"


    // $ANTLR start "rule__Judgement__Group_8__0"
    // InternalMyDbl.g:3413:1: rule__Judgement__Group_8__0 : rule__Judgement__Group_8__0__Impl rule__Judgement__Group_8__1 ;
    public final void rule__Judgement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3417:1: ( rule__Judgement__Group_8__0__Impl rule__Judgement__Group_8__1 )
            // InternalMyDbl.g:3418:2: rule__Judgement__Group_8__0__Impl rule__Judgement__Group_8__1
            {
            pushFollow(FOLLOW_31);
            rule__Judgement__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_8__0"


    // $ANTLR start "rule__Judgement__Group_8__0__Impl"
    // InternalMyDbl.g:3425:1: rule__Judgement__Group_8__0__Impl : ( 'no' ) ;
    public final void rule__Judgement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3429:1: ( ( 'no' ) )
            // InternalMyDbl.g:3430:1: ( 'no' )
            {
            // InternalMyDbl.g:3430:1: ( 'no' )
            // InternalMyDbl.g:3431:2: 'no'
            {
             before(grammarAccess.getJudgementAccess().getNoKeyword_8_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getNoKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_8__0__Impl"


    // $ANTLR start "rule__Judgement__Group_8__1"
    // InternalMyDbl.g:3440:1: rule__Judgement__Group_8__1 : rule__Judgement__Group_8__1__Impl rule__Judgement__Group_8__2 ;
    public final void rule__Judgement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3444:1: ( rule__Judgement__Group_8__1__Impl rule__Judgement__Group_8__2 )
            // InternalMyDbl.g:3445:2: rule__Judgement__Group_8__1__Impl rule__Judgement__Group_8__2
            {
            pushFollow(FOLLOW_32);
            rule__Judgement__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Judgement__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_8__1"


    // $ANTLR start "rule__Judgement__Group_8__1__Impl"
    // InternalMyDbl.g:3452:1: rule__Judgement__Group_8__1__Impl : ( 'larger' ) ;
    public final void rule__Judgement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3456:1: ( ( 'larger' ) )
            // InternalMyDbl.g:3457:1: ( 'larger' )
            {
            // InternalMyDbl.g:3457:1: ( 'larger' )
            // InternalMyDbl.g:3458:2: 'larger'
            {
             before(grammarAccess.getJudgementAccess().getLargerKeyword_8_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getLargerKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_8__1__Impl"


    // $ANTLR start "rule__Judgement__Group_8__2"
    // InternalMyDbl.g:3467:1: rule__Judgement__Group_8__2 : rule__Judgement__Group_8__2__Impl ;
    public final void rule__Judgement__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3471:1: ( rule__Judgement__Group_8__2__Impl )
            // InternalMyDbl.g:3472:2: rule__Judgement__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Judgement__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_8__2"


    // $ANTLR start "rule__Judgement__Group_8__2__Impl"
    // InternalMyDbl.g:3478:1: rule__Judgement__Group_8__2__Impl : ( 'than' ) ;
    public final void rule__Judgement__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3482:1: ( ( 'than' ) )
            // InternalMyDbl.g:3483:1: ( 'than' )
            {
            // InternalMyDbl.g:3483:1: ( 'than' )
            // InternalMyDbl.g:3484:2: 'than'
            {
             before(grammarAccess.getJudgementAccess().getThanKeyword_8_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getJudgementAccess().getThanKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Judgement__Group_8__2__Impl"


    // $ANTLR start "rule__DeleteInstruction__Group__0"
    // InternalMyDbl.g:3494:1: rule__DeleteInstruction__Group__0 : rule__DeleteInstruction__Group__0__Impl rule__DeleteInstruction__Group__1 ;
    public final void rule__DeleteInstruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3498:1: ( rule__DeleteInstruction__Group__0__Impl rule__DeleteInstruction__Group__1 )
            // InternalMyDbl.g:3499:2: rule__DeleteInstruction__Group__0__Impl rule__DeleteInstruction__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DeleteInstruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteInstruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__0"


    // $ANTLR start "rule__DeleteInstruction__Group__0__Impl"
    // InternalMyDbl.g:3506:1: rule__DeleteInstruction__Group__0__Impl : ( 'remove' ) ;
    public final void rule__DeleteInstruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3510:1: ( ( 'remove' ) )
            // InternalMyDbl.g:3511:1: ( 'remove' )
            {
            // InternalMyDbl.g:3511:1: ( 'remove' )
            // InternalMyDbl.g:3512:2: 'remove'
            {
             before(grammarAccess.getDeleteInstructionAccess().getRemoveKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDeleteInstructionAccess().getRemoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__0__Impl"


    // $ANTLR start "rule__DeleteInstruction__Group__1"
    // InternalMyDbl.g:3521:1: rule__DeleteInstruction__Group__1 : rule__DeleteInstruction__Group__1__Impl rule__DeleteInstruction__Group__2 ;
    public final void rule__DeleteInstruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3525:1: ( rule__DeleteInstruction__Group__1__Impl rule__DeleteInstruction__Group__2 )
            // InternalMyDbl.g:3526:2: rule__DeleteInstruction__Group__1__Impl rule__DeleteInstruction__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeleteInstruction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteInstruction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__1"


    // $ANTLR start "rule__DeleteInstruction__Group__1__Impl"
    // InternalMyDbl.g:3533:1: rule__DeleteInstruction__Group__1__Impl : ( 'the' ) ;
    public final void rule__DeleteInstruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3537:1: ( ( 'the' ) )
            // InternalMyDbl.g:3538:1: ( 'the' )
            {
            // InternalMyDbl.g:3538:1: ( 'the' )
            // InternalMyDbl.g:3539:2: 'the'
            {
             before(grammarAccess.getDeleteInstructionAccess().getTheKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDeleteInstructionAccess().getTheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__1__Impl"


    // $ANTLR start "rule__DeleteInstruction__Group__2"
    // InternalMyDbl.g:3548:1: rule__DeleteInstruction__Group__2 : rule__DeleteInstruction__Group__2__Impl rule__DeleteInstruction__Group__3 ;
    public final void rule__DeleteInstruction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3552:1: ( rule__DeleteInstruction__Group__2__Impl rule__DeleteInstruction__Group__3 )
            // InternalMyDbl.g:3553:2: rule__DeleteInstruction__Group__2__Impl rule__DeleteInstruction__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__DeleteInstruction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteInstruction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__2"


    // $ANTLR start "rule__DeleteInstruction__Group__2__Impl"
    // InternalMyDbl.g:3560:1: rule__DeleteInstruction__Group__2__Impl : ( ( rule__DeleteInstruction__ElementAssignment_2 ) ) ;
    public final void rule__DeleteInstruction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3564:1: ( ( ( rule__DeleteInstruction__ElementAssignment_2 ) ) )
            // InternalMyDbl.g:3565:1: ( ( rule__DeleteInstruction__ElementAssignment_2 ) )
            {
            // InternalMyDbl.g:3565:1: ( ( rule__DeleteInstruction__ElementAssignment_2 ) )
            // InternalMyDbl.g:3566:2: ( rule__DeleteInstruction__ElementAssignment_2 )
            {
             before(grammarAccess.getDeleteInstructionAccess().getElementAssignment_2()); 
            // InternalMyDbl.g:3567:2: ( rule__DeleteInstruction__ElementAssignment_2 )
            // InternalMyDbl.g:3567:3: rule__DeleteInstruction__ElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeleteInstruction__ElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteInstructionAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__2__Impl"


    // $ANTLR start "rule__DeleteInstruction__Group__3"
    // InternalMyDbl.g:3575:1: rule__DeleteInstruction__Group__3 : rule__DeleteInstruction__Group__3__Impl rule__DeleteInstruction__Group__4 ;
    public final void rule__DeleteInstruction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3579:1: ( rule__DeleteInstruction__Group__3__Impl rule__DeleteInstruction__Group__4 )
            // InternalMyDbl.g:3580:2: rule__DeleteInstruction__Group__3__Impl rule__DeleteInstruction__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__DeleteInstruction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteInstruction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__3"


    // $ANTLR start "rule__DeleteInstruction__Group__3__Impl"
    // InternalMyDbl.g:3587:1: rule__DeleteInstruction__Group__3__Impl : ( ',' ) ;
    public final void rule__DeleteInstruction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3591:1: ( ( ',' ) )
            // InternalMyDbl.g:3592:1: ( ',' )
            {
            // InternalMyDbl.g:3592:1: ( ',' )
            // InternalMyDbl.g:3593:2: ','
            {
             before(grammarAccess.getDeleteInstructionAccess().getCommaKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeleteInstructionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__3__Impl"


    // $ANTLR start "rule__DeleteInstruction__Group__4"
    // InternalMyDbl.g:3602:1: rule__DeleteInstruction__Group__4 : rule__DeleteInstruction__Group__4__Impl rule__DeleteInstruction__Group__5 ;
    public final void rule__DeleteInstruction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3606:1: ( rule__DeleteInstruction__Group__4__Impl rule__DeleteInstruction__Group__5 )
            // InternalMyDbl.g:3607:2: rule__DeleteInstruction__Group__4__Impl rule__DeleteInstruction__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__DeleteInstruction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteInstruction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__4"


    // $ANTLR start "rule__DeleteInstruction__Group__4__Impl"
    // InternalMyDbl.g:3614:1: rule__DeleteInstruction__Group__4__Impl : ( 'whose' ) ;
    public final void rule__DeleteInstruction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3618:1: ( ( 'whose' ) )
            // InternalMyDbl.g:3619:1: ( 'whose' )
            {
            // InternalMyDbl.g:3619:1: ( 'whose' )
            // InternalMyDbl.g:3620:2: 'whose'
            {
             before(grammarAccess.getDeleteInstructionAccess().getWhoseKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDeleteInstructionAccess().getWhoseKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__4__Impl"


    // $ANTLR start "rule__DeleteInstruction__Group__5"
    // InternalMyDbl.g:3629:1: rule__DeleteInstruction__Group__5 : rule__DeleteInstruction__Group__5__Impl ;
    public final void rule__DeleteInstruction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3633:1: ( rule__DeleteInstruction__Group__5__Impl )
            // InternalMyDbl.g:3634:2: rule__DeleteInstruction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteInstruction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__5"


    // $ANTLR start "rule__DeleteInstruction__Group__5__Impl"
    // InternalMyDbl.g:3640:1: rule__DeleteInstruction__Group__5__Impl : ( ( rule__DeleteInstruction__ConditionsAssignment_5 ) ) ;
    public final void rule__DeleteInstruction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3644:1: ( ( ( rule__DeleteInstruction__ConditionsAssignment_5 ) ) )
            // InternalMyDbl.g:3645:1: ( ( rule__DeleteInstruction__ConditionsAssignment_5 ) )
            {
            // InternalMyDbl.g:3645:1: ( ( rule__DeleteInstruction__ConditionsAssignment_5 ) )
            // InternalMyDbl.g:3646:2: ( rule__DeleteInstruction__ConditionsAssignment_5 )
            {
             before(grammarAccess.getDeleteInstructionAccess().getConditionsAssignment_5()); 
            // InternalMyDbl.g:3647:2: ( rule__DeleteInstruction__ConditionsAssignment_5 )
            // InternalMyDbl.g:3647:3: rule__DeleteInstruction__ConditionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DeleteInstruction__ConditionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeleteInstructionAccess().getConditionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__Group__5__Impl"


    // $ANTLR start "rule__Database__NameAssignment_3"
    // InternalMyDbl.g:3656:1: rule__Database__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Database__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3660:1: ( ( RULE_ID ) )
            // InternalMyDbl.g:3661:2: ( RULE_ID )
            {
            // InternalMyDbl.g:3661:2: ( RULE_ID )
            // InternalMyDbl.g:3662:3: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__NameAssignment_3"


    // $ANTLR start "rule__Database__InstructionsAssignment_4"
    // InternalMyDbl.g:3671:1: rule__Database__InstructionsAssignment_4 : ( ruleInstructions ) ;
    public final void rule__Database__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3675:1: ( ( ruleInstructions ) )
            // InternalMyDbl.g:3676:2: ( ruleInstructions )
            {
            // InternalMyDbl.g:3676:2: ( ruleInstructions )
            // InternalMyDbl.g:3677:3: ruleInstructions
            {
             before(grammarAccess.getDatabaseAccess().getInstructionsInstructionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getInstructionsInstructionsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Database__InstructionsAssignment_4"


    // $ANTLR start "rule__CreateTableInstruction__TableAssignment_4"
    // InternalMyDbl.g:3686:1: rule__CreateTableInstruction__TableAssignment_4 : ( ruleTable ) ;
    public final void rule__CreateTableInstruction__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3690:1: ( ( ruleTable ) )
            // InternalMyDbl.g:3691:2: ( ruleTable )
            {
            // InternalMyDbl.g:3691:2: ( ruleTable )
            // InternalMyDbl.g:3692:3: ruleTable
            {
             before(grammarAccess.getCreateTableInstructionAccess().getTableTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getCreateTableInstructionAccess().getTableTableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__TableAssignment_4"


    // $ANTLR start "rule__CreateTableInstruction__ElementAssignment_5"
    // InternalMyDbl.g:3701:1: rule__CreateTableInstruction__ElementAssignment_5 : ( ruleCreateElementInstruction ) ;
    public final void rule__CreateTableInstruction__ElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3705:1: ( ( ruleCreateElementInstruction ) )
            // InternalMyDbl.g:3706:2: ( ruleCreateElementInstruction )
            {
            // InternalMyDbl.g:3706:2: ( ruleCreateElementInstruction )
            // InternalMyDbl.g:3707:3: ruleCreateElementInstruction
            {
             before(grammarAccess.getCreateTableInstructionAccess().getElementCreateElementInstructionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCreateElementInstruction();

            state._fsp--;

             after(grammarAccess.getCreateTableInstructionAccess().getElementCreateElementInstructionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateTableInstruction__ElementAssignment_5"


    // $ANTLR start "rule__Table__NameAssignment"
    // InternalMyDbl.g:3716:1: rule__Table__NameAssignment : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3720:1: ( ( RULE_ID ) )
            // InternalMyDbl.g:3721:2: ( RULE_ID )
            {
            // InternalMyDbl.g:3721:2: ( RULE_ID )
            // InternalMyDbl.g:3722:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment"


    // $ANTLR start "rule__CreateElementInstruction__ElementAssignment_5"
    // InternalMyDbl.g:3731:1: rule__CreateElementInstruction__ElementAssignment_5 : ( ruleElement ) ;
    public final void rule__CreateElementInstruction__ElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3735:1: ( ( ruleElement ) )
            // InternalMyDbl.g:3736:2: ( ruleElement )
            {
            // InternalMyDbl.g:3736:2: ( ruleElement )
            // InternalMyDbl.g:3737:3: ruleElement
            {
             before(grammarAccess.getCreateElementInstructionAccess().getElementElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getCreateElementInstructionAccess().getElementElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateElementInstruction__ElementAssignment_5"


    // $ANTLR start "rule__Element__NameAssignment"
    // InternalMyDbl.g:3746:1: rule__Element__NameAssignment : ( RULE_ID ) ;
    public final void rule__Element__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3750:1: ( ( RULE_ID ) )
            // InternalMyDbl.g:3751:2: ( RULE_ID )
            {
            // InternalMyDbl.g:3751:2: ( RULE_ID )
            // InternalMyDbl.g:3752:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__NameAssignment"


    // $ANTLR start "rule__CreateAttributeInstruction__ElementAssignment_0"
    // InternalMyDbl.g:3761:1: rule__CreateAttributeInstruction__ElementAssignment_0 : ( ruleElement ) ;
    public final void rule__CreateAttributeInstruction__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3765:1: ( ( ruleElement ) )
            // InternalMyDbl.g:3766:2: ( ruleElement )
            {
            // InternalMyDbl.g:3766:2: ( ruleElement )
            // InternalMyDbl.g:3767:3: ruleElement
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getElementElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getCreateAttributeInstructionAccess().getElementElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__ElementAssignment_0"


    // $ANTLR start "rule__CreateAttributeInstruction__AttributeAssignment_4"
    // InternalMyDbl.g:3776:1: rule__CreateAttributeInstruction__AttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__CreateAttributeInstruction__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3780:1: ( ( ruleAttribute ) )
            // InternalMyDbl.g:3781:2: ( ruleAttribute )
            {
            // InternalMyDbl.g:3781:2: ( ruleAttribute )
            // InternalMyDbl.g:3782:3: ruleAttribute
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getAttributeAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getCreateAttributeInstructionAccess().getAttributeAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__AttributeAssignment_4"


    // $ANTLR start "rule__CreateAttributeInstruction__AttributeTypeAssignment_8"
    // InternalMyDbl.g:3791:1: rule__CreateAttributeInstruction__AttributeTypeAssignment_8 : ( ruleAttributeType ) ;
    public final void rule__CreateAttributeInstruction__AttributeTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3795:1: ( ( ruleAttributeType ) )
            // InternalMyDbl.g:3796:2: ( ruleAttributeType )
            {
            // InternalMyDbl.g:3796:2: ( ruleAttributeType )
            // InternalMyDbl.g:3797:3: ruleAttributeType
            {
             before(grammarAccess.getCreateAttributeInstructionAccess().getAttributeTypeAttributeTypeParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getCreateAttributeInstructionAccess().getAttributeTypeAttributeTypeParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CreateAttributeInstruction__AttributeTypeAssignment_8"


    // $ANTLR start "rule__Attribute__NameAssignment"
    // InternalMyDbl.g:3806:1: rule__Attribute__NameAssignment : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3810:1: ( ( RULE_ID ) )
            // InternalMyDbl.g:3811:2: ( RULE_ID )
            {
            // InternalMyDbl.g:3811:2: ( RULE_ID )
            // InternalMyDbl.g:3812:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment"


    // $ANTLR start "rule__BasicVar__IntegerAssignment_0"
    // InternalMyDbl.g:3821:1: rule__BasicVar__IntegerAssignment_0 : ( RULE_INT ) ;
    public final void rule__BasicVar__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3825:1: ( ( RULE_INT ) )
            // InternalMyDbl.g:3826:2: ( RULE_INT )
            {
            // InternalMyDbl.g:3826:2: ( RULE_INT )
            // InternalMyDbl.g:3827:3: RULE_INT
            {
             before(grammarAccess.getBasicVarAccess().getIntegerINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBasicVarAccess().getIntegerINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicVar__IntegerAssignment_0"


    // $ANTLR start "rule__BasicVar__StringAssignment_1"
    // InternalMyDbl.g:3836:1: rule__BasicVar__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__BasicVar__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3840:1: ( ( RULE_STRING ) )
            // InternalMyDbl.g:3841:2: ( RULE_STRING )
            {
            // InternalMyDbl.g:3841:2: ( RULE_STRING )
            // InternalMyDbl.g:3842:3: RULE_STRING
            {
             before(grammarAccess.getBasicVarAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBasicVarAccess().getStringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicVar__StringAssignment_1"


    // $ANTLR start "rule__AddInstruction__ElementAssignment_2"
    // InternalMyDbl.g:3851:1: rule__AddInstruction__ElementAssignment_2 : ( ruleElement ) ;
    public final void rule__AddInstruction__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3855:1: ( ( ruleElement ) )
            // InternalMyDbl.g:3856:2: ( ruleElement )
            {
            // InternalMyDbl.g:3856:2: ( ruleElement )
            // InternalMyDbl.g:3857:3: ruleElement
            {
             before(grammarAccess.getAddInstructionAccess().getElementElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getAddInstructionAccess().getElementElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__ElementAssignment_2"


    // $ANTLR start "rule__AddInstruction__InsertInstructionAssignment_4"
    // InternalMyDbl.g:3866:1: rule__AddInstruction__InsertInstructionAssignment_4 : ( ruleInsertInstruction ) ;
    public final void rule__AddInstruction__InsertInstructionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3870:1: ( ( ruleInsertInstruction ) )
            // InternalMyDbl.g:3871:2: ( ruleInsertInstruction )
            {
            // InternalMyDbl.g:3871:2: ( ruleInsertInstruction )
            // InternalMyDbl.g:3872:3: ruleInsertInstruction
            {
             before(grammarAccess.getAddInstructionAccess().getInsertInstructionInsertInstructionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInsertInstruction();

            state._fsp--;

             after(grammarAccess.getAddInstructionAccess().getInsertInstructionInsertInstructionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddInstruction__InsertInstructionAssignment_4"


    // $ANTLR start "rule__InsertInstruction__SetAttributeInstructionsAssignment_0"
    // InternalMyDbl.g:3881:1: rule__InsertInstruction__SetAttributeInstructionsAssignment_0 : ( ruleSetAttributeInstruction ) ;
    public final void rule__InsertInstruction__SetAttributeInstructionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3885:1: ( ( ruleSetAttributeInstruction ) )
            // InternalMyDbl.g:3886:2: ( ruleSetAttributeInstruction )
            {
            // InternalMyDbl.g:3886:2: ( ruleSetAttributeInstruction )
            // InternalMyDbl.g:3887:3: ruleSetAttributeInstruction
            {
             before(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsSetAttributeInstructionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSetAttributeInstruction();

            state._fsp--;

             after(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsSetAttributeInstructionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__SetAttributeInstructionsAssignment_0"


    // $ANTLR start "rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1"
    // InternalMyDbl.g:3896:1: rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1 : ( ruleSetAttributeInstruction ) ;
    public final void rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3900:1: ( ( ruleSetAttributeInstruction ) )
            // InternalMyDbl.g:3901:2: ( ruleSetAttributeInstruction )
            {
            // InternalMyDbl.g:3901:2: ( ruleSetAttributeInstruction )
            // InternalMyDbl.g:3902:3: ruleSetAttributeInstruction
            {
             before(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsSetAttributeInstructionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSetAttributeInstruction();

            state._fsp--;

             after(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsSetAttributeInstructionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertInstruction__SetAttributeInstructionsAssignment_1_1"


    // $ANTLR start "rule__SetAttributeInstruction__AttributeAssignment_0"
    // InternalMyDbl.g:3911:1: rule__SetAttributeInstruction__AttributeAssignment_0 : ( ruleAttribute ) ;
    public final void rule__SetAttributeInstruction__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3915:1: ( ( ruleAttribute ) )
            // InternalMyDbl.g:3916:2: ( ruleAttribute )
            {
            // InternalMyDbl.g:3916:2: ( ruleAttribute )
            // InternalMyDbl.g:3917:3: ruleAttribute
            {
             before(grammarAccess.getSetAttributeInstructionAccess().getAttributeAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSetAttributeInstructionAccess().getAttributeAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAttributeInstruction__AttributeAssignment_0"


    // $ANTLR start "rule__SetAttributeInstruction__AttributeValueAssignment_2"
    // InternalMyDbl.g:3926:1: rule__SetAttributeInstruction__AttributeValueAssignment_2 : ( ruleBasicVar ) ;
    public final void rule__SetAttributeInstruction__AttributeValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3930:1: ( ( ruleBasicVar ) )
            // InternalMyDbl.g:3931:2: ( ruleBasicVar )
            {
            // InternalMyDbl.g:3931:2: ( ruleBasicVar )
            // InternalMyDbl.g:3932:3: ruleBasicVar
            {
             before(grammarAccess.getSetAttributeInstructionAccess().getAttributeValueBasicVarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicVar();

            state._fsp--;

             after(grammarAccess.getSetAttributeInstructionAccess().getAttributeValueBasicVarParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetAttributeInstruction__AttributeValueAssignment_2"


    // $ANTLR start "rule__SingleElement__TargetsAssignment_0_0"
    // InternalMyDbl.g:3941:1: rule__SingleElement__TargetsAssignment_0_0 : ( ruleTarget ) ;
    public final void rule__SingleElement__TargetsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3945:1: ( ( ruleTarget ) )
            // InternalMyDbl.g:3946:2: ( ruleTarget )
            {
            // InternalMyDbl.g:3946:2: ( ruleTarget )
            // InternalMyDbl.g:3947:3: ruleTarget
            {
             before(grammarAccess.getSingleElementAccess().getTargetsTargetParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getSingleElementAccess().getTargetsTargetParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__TargetsAssignment_0_0"


    // $ANTLR start "rule__SingleElement__ElementAssignment_1"
    // InternalMyDbl.g:3956:1: rule__SingleElement__ElementAssignment_1 : ( ruleElement ) ;
    public final void rule__SingleElement__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3960:1: ( ( ruleElement ) )
            // InternalMyDbl.g:3961:2: ( ruleElement )
            {
            // InternalMyDbl.g:3961:2: ( ruleElement )
            // InternalMyDbl.g:3962:3: ruleElement
            {
             before(grammarAccess.getSingleElementAccess().getElementElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getSingleElementAccess().getElementElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__ElementAssignment_1"


    // $ANTLR start "rule__SingleElement__ConditionsAssignment_2_2"
    // InternalMyDbl.g:3971:1: rule__SingleElement__ConditionsAssignment_2_2 : ( ruleSingleCondition ) ;
    public final void rule__SingleElement__ConditionsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3975:1: ( ( ruleSingleCondition ) )
            // InternalMyDbl.g:3976:2: ( ruleSingleCondition )
            {
            // InternalMyDbl.g:3976:2: ( ruleSingleCondition )
            // InternalMyDbl.g:3977:3: ruleSingleCondition
            {
             before(grammarAccess.getSingleElementAccess().getConditionsSingleConditionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleCondition();

            state._fsp--;

             after(grammarAccess.getSingleElementAccess().getConditionsSingleConditionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleElement__ConditionsAssignment_2_2"


    // $ANTLR start "rule__Target__AttributesAssignment_0"
    // InternalMyDbl.g:3986:1: rule__Target__AttributesAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Target__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:3990:1: ( ( ruleAttribute ) )
            // InternalMyDbl.g:3991:2: ( ruleAttribute )
            {
            // InternalMyDbl.g:3991:2: ( ruleAttribute )
            // InternalMyDbl.g:3992:3: ruleAttribute
            {
             before(grammarAccess.getTargetAccess().getAttributesAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getTargetAccess().getAttributesAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__AttributesAssignment_0"


    // $ANTLR start "rule__Target__AttributesAssignment_1_1"
    // InternalMyDbl.g:4001:1: rule__Target__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__Target__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4005:1: ( ( ruleAttribute ) )
            // InternalMyDbl.g:4006:2: ( ruleAttribute )
            {
            // InternalMyDbl.g:4006:2: ( ruleAttribute )
            // InternalMyDbl.g:4007:3: ruleAttribute
            {
             before(grammarAccess.getTargetAccess().getAttributesAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getTargetAccess().getAttributesAttributeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Target__AttributesAssignment_1_1"


    // $ANTLR start "rule__JointElement__ElementsAssignment_0"
    // InternalMyDbl.g:4016:1: rule__JointElement__ElementsAssignment_0 : ( ruleElement ) ;
    public final void rule__JointElement__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4020:1: ( ( ruleElement ) )
            // InternalMyDbl.g:4021:2: ( ruleElement )
            {
            // InternalMyDbl.g:4021:2: ( ruleElement )
            // InternalMyDbl.g:4022:3: ruleElement
            {
             before(grammarAccess.getJointElementAccess().getElementsElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getJointElementAccess().getElementsElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__ElementsAssignment_0"


    // $ANTLR start "rule__JointElement__ElementsAssignment_1_1"
    // InternalMyDbl.g:4031:1: rule__JointElement__ElementsAssignment_1_1 : ( ruleElement ) ;
    public final void rule__JointElement__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4035:1: ( ( ruleElement ) )
            // InternalMyDbl.g:4036:2: ( ruleElement )
            {
            // InternalMyDbl.g:4036:2: ( ruleElement )
            // InternalMyDbl.g:4037:3: ruleElement
            {
             before(grammarAccess.getJointElementAccess().getElementsElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getJointElementAccess().getElementsElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__ElementsAssignment_1_1"


    // $ANTLR start "rule__JointElement__ConditionsAssignment_5"
    // InternalMyDbl.g:4046:1: rule__JointElement__ConditionsAssignment_5 : ( ruleJointCondition ) ;
    public final void rule__JointElement__ConditionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4050:1: ( ( ruleJointCondition ) )
            // InternalMyDbl.g:4051:2: ( ruleJointCondition )
            {
            // InternalMyDbl.g:4051:2: ( ruleJointCondition )
            // InternalMyDbl.g:4052:3: ruleJointCondition
            {
             before(grammarAccess.getJointElementAccess().getConditionsJointConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleJointCondition();

            state._fsp--;

             after(grammarAccess.getJointElementAccess().getConditionsJointConditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointElement__ConditionsAssignment_5"


    // $ANTLR start "rule__SingleCondition__ConditionsAssignment_0"
    // InternalMyDbl.g:4061:1: rule__SingleCondition__ConditionsAssignment_0 : ( ruleSingleConditionUnit ) ;
    public final void rule__SingleCondition__ConditionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4065:1: ( ( ruleSingleConditionUnit ) )
            // InternalMyDbl.g:4066:2: ( ruleSingleConditionUnit )
            {
            // InternalMyDbl.g:4066:2: ( ruleSingleConditionUnit )
            // InternalMyDbl.g:4067:3: ruleSingleConditionUnit
            {
             before(grammarAccess.getSingleConditionAccess().getConditionsSingleConditionUnitParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleConditionUnit();

            state._fsp--;

             after(grammarAccess.getSingleConditionAccess().getConditionsSingleConditionUnitParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__ConditionsAssignment_0"


    // $ANTLR start "rule__SingleCondition__ConditionsAssignment_1_1"
    // InternalMyDbl.g:4076:1: rule__SingleCondition__ConditionsAssignment_1_1 : ( ruleSingleConditionUnit ) ;
    public final void rule__SingleCondition__ConditionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4080:1: ( ( ruleSingleConditionUnit ) )
            // InternalMyDbl.g:4081:2: ( ruleSingleConditionUnit )
            {
            // InternalMyDbl.g:4081:2: ( ruleSingleConditionUnit )
            // InternalMyDbl.g:4082:3: ruleSingleConditionUnit
            {
             before(grammarAccess.getSingleConditionAccess().getConditionsSingleConditionUnitParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleConditionUnit();

            state._fsp--;

             after(grammarAccess.getSingleConditionAccess().getConditionsSingleConditionUnitParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleCondition__ConditionsAssignment_1_1"


    // $ANTLR start "rule__JointCondition__ConditionsAssignment_0"
    // InternalMyDbl.g:4091:1: rule__JointCondition__ConditionsAssignment_0 : ( ruleJointConditionUnit ) ;
    public final void rule__JointCondition__ConditionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4095:1: ( ( ruleJointConditionUnit ) )
            // InternalMyDbl.g:4096:2: ( ruleJointConditionUnit )
            {
            // InternalMyDbl.g:4096:2: ( ruleJointConditionUnit )
            // InternalMyDbl.g:4097:3: ruleJointConditionUnit
            {
             before(grammarAccess.getJointConditionAccess().getConditionsJointConditionUnitParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJointConditionUnit();

            state._fsp--;

             after(grammarAccess.getJointConditionAccess().getConditionsJointConditionUnitParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__ConditionsAssignment_0"


    // $ANTLR start "rule__JointCondition__ConditionsAssignment_1_1"
    // InternalMyDbl.g:4106:1: rule__JointCondition__ConditionsAssignment_1_1 : ( ruleJointConditionUnit ) ;
    public final void rule__JointCondition__ConditionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4110:1: ( ( ruleJointConditionUnit ) )
            // InternalMyDbl.g:4111:2: ( ruleJointConditionUnit )
            {
            // InternalMyDbl.g:4111:2: ( ruleJointConditionUnit )
            // InternalMyDbl.g:4112:3: ruleJointConditionUnit
            {
             before(grammarAccess.getJointConditionAccess().getConditionsJointConditionUnitParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJointConditionUnit();

            state._fsp--;

             after(grammarAccess.getJointConditionAccess().getConditionsJointConditionUnitParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointCondition__ConditionsAssignment_1_1"


    // $ANTLR start "rule__SingleConditionUnit__AttributeLeftAssignment_0"
    // InternalMyDbl.g:4121:1: rule__SingleConditionUnit__AttributeLeftAssignment_0 : ( ruleAttribute ) ;
    public final void rule__SingleConditionUnit__AttributeLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4125:1: ( ( ruleAttribute ) )
            // InternalMyDbl.g:4126:2: ( ruleAttribute )
            {
            // InternalMyDbl.g:4126:2: ( ruleAttribute )
            // InternalMyDbl.g:4127:3: ruleAttribute
            {
             before(grammarAccess.getSingleConditionUnitAccess().getAttributeLeftAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSingleConditionUnitAccess().getAttributeLeftAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__AttributeLeftAssignment_0"


    // $ANTLR start "rule__SingleConditionUnit__JudgementAssignment_1"
    // InternalMyDbl.g:4136:1: rule__SingleConditionUnit__JudgementAssignment_1 : ( ruleJudgement ) ;
    public final void rule__SingleConditionUnit__JudgementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4140:1: ( ( ruleJudgement ) )
            // InternalMyDbl.g:4141:2: ( ruleJudgement )
            {
            // InternalMyDbl.g:4141:2: ( ruleJudgement )
            // InternalMyDbl.g:4142:3: ruleJudgement
            {
             before(grammarAccess.getSingleConditionUnitAccess().getJudgementJudgementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJudgement();

            state._fsp--;

             after(grammarAccess.getSingleConditionUnitAccess().getJudgementJudgementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__JudgementAssignment_1"


    // $ANTLR start "rule__SingleConditionUnit__AttributeRightAssignment_2_0"
    // InternalMyDbl.g:4151:1: rule__SingleConditionUnit__AttributeRightAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__SingleConditionUnit__AttributeRightAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4155:1: ( ( ruleAttribute ) )
            // InternalMyDbl.g:4156:2: ( ruleAttribute )
            {
            // InternalMyDbl.g:4156:2: ( ruleAttribute )
            // InternalMyDbl.g:4157:3: ruleAttribute
            {
             before(grammarAccess.getSingleConditionUnitAccess().getAttributeRightAttributeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getSingleConditionUnitAccess().getAttributeRightAttributeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__AttributeRightAssignment_2_0"


    // $ANTLR start "rule__SingleConditionUnit__ValueAssignment_2_1"
    // InternalMyDbl.g:4166:1: rule__SingleConditionUnit__ValueAssignment_2_1 : ( ruleBasicVar ) ;
    public final void rule__SingleConditionUnit__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4170:1: ( ( ruleBasicVar ) )
            // InternalMyDbl.g:4171:2: ( ruleBasicVar )
            {
            // InternalMyDbl.g:4171:2: ( ruleBasicVar )
            // InternalMyDbl.g:4172:3: ruleBasicVar
            {
             before(grammarAccess.getSingleConditionUnitAccess().getValueBasicVarParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicVar();

            state._fsp--;

             after(grammarAccess.getSingleConditionUnitAccess().getValueBasicVarParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleConditionUnit__ValueAssignment_2_1"


    // $ANTLR start "rule__JointConditionUnit__ElementLeftAssignment_0"
    // InternalMyDbl.g:4181:1: rule__JointConditionUnit__ElementLeftAssignment_0 : ( ruleAttributeOfElement ) ;
    public final void rule__JointConditionUnit__ElementLeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4185:1: ( ( ruleAttributeOfElement ) )
            // InternalMyDbl.g:4186:2: ( ruleAttributeOfElement )
            {
            // InternalMyDbl.g:4186:2: ( ruleAttributeOfElement )
            // InternalMyDbl.g:4187:3: ruleAttributeOfElement
            {
             before(grammarAccess.getJointConditionUnitAccess().getElementLeftAttributeOfElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeOfElement();

            state._fsp--;

             after(grammarAccess.getJointConditionUnitAccess().getElementLeftAttributeOfElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__ElementLeftAssignment_0"


    // $ANTLR start "rule__JointConditionUnit__JudgementAssignment_1"
    // InternalMyDbl.g:4196:1: rule__JointConditionUnit__JudgementAssignment_1 : ( ruleJudgement ) ;
    public final void rule__JointConditionUnit__JudgementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4200:1: ( ( ruleJudgement ) )
            // InternalMyDbl.g:4201:2: ( ruleJudgement )
            {
            // InternalMyDbl.g:4201:2: ( ruleJudgement )
            // InternalMyDbl.g:4202:3: ruleJudgement
            {
             before(grammarAccess.getJointConditionUnitAccess().getJudgementJudgementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJudgement();

            state._fsp--;

             after(grammarAccess.getJointConditionUnitAccess().getJudgementJudgementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__JudgementAssignment_1"


    // $ANTLR start "rule__JointConditionUnit__ElementRightAssignment_2_0"
    // InternalMyDbl.g:4211:1: rule__JointConditionUnit__ElementRightAssignment_2_0 : ( ruleAttributeOfElement ) ;
    public final void rule__JointConditionUnit__ElementRightAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4215:1: ( ( ruleAttributeOfElement ) )
            // InternalMyDbl.g:4216:2: ( ruleAttributeOfElement )
            {
            // InternalMyDbl.g:4216:2: ( ruleAttributeOfElement )
            // InternalMyDbl.g:4217:3: ruleAttributeOfElement
            {
             before(grammarAccess.getJointConditionUnitAccess().getElementRightAttributeOfElementParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeOfElement();

            state._fsp--;

             after(grammarAccess.getJointConditionUnitAccess().getElementRightAttributeOfElementParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__ElementRightAssignment_2_0"


    // $ANTLR start "rule__JointConditionUnit__ValueAssignment_2_1"
    // InternalMyDbl.g:4226:1: rule__JointConditionUnit__ValueAssignment_2_1 : ( ruleBasicVar ) ;
    public final void rule__JointConditionUnit__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4230:1: ( ( ruleBasicVar ) )
            // InternalMyDbl.g:4231:2: ( ruleBasicVar )
            {
            // InternalMyDbl.g:4231:2: ( ruleBasicVar )
            // InternalMyDbl.g:4232:3: ruleBasicVar
            {
             before(grammarAccess.getJointConditionUnitAccess().getValueBasicVarParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicVar();

            state._fsp--;

             after(grammarAccess.getJointConditionUnitAccess().getValueBasicVarParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointConditionUnit__ValueAssignment_2_1"


    // $ANTLR start "rule__AttributeOfElement__ElementAssignment_0"
    // InternalMyDbl.g:4241:1: rule__AttributeOfElement__ElementAssignment_0 : ( ruleElement ) ;
    public final void rule__AttributeOfElement__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4245:1: ( ( ruleElement ) )
            // InternalMyDbl.g:4246:2: ( ruleElement )
            {
            // InternalMyDbl.g:4246:2: ( ruleElement )
            // InternalMyDbl.g:4247:3: ruleElement
            {
             before(grammarAccess.getAttributeOfElementAccess().getElementElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getAttributeOfElementAccess().getElementElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOfElement__ElementAssignment_0"


    // $ANTLR start "rule__AttributeOfElement__AttributeAssignment_2"
    // InternalMyDbl.g:4256:1: rule__AttributeOfElement__AttributeAssignment_2 : ( ruleAttribute ) ;
    public final void rule__AttributeOfElement__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4260:1: ( ( ruleAttribute ) )
            // InternalMyDbl.g:4261:2: ( ruleAttribute )
            {
            // InternalMyDbl.g:4261:2: ( ruleAttribute )
            // InternalMyDbl.g:4262:3: ruleAttribute
            {
             before(grammarAccess.getAttributeOfElementAccess().getAttributeAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeOfElementAccess().getAttributeAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeOfElement__AttributeAssignment_2"


    // $ANTLR start "rule__DeleteInstruction__ElementAssignment_2"
    // InternalMyDbl.g:4271:1: rule__DeleteInstruction__ElementAssignment_2 : ( ruleElement ) ;
    public final void rule__DeleteInstruction__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4275:1: ( ( ruleElement ) )
            // InternalMyDbl.g:4276:2: ( ruleElement )
            {
            // InternalMyDbl.g:4276:2: ( ruleElement )
            // InternalMyDbl.g:4277:3: ruleElement
            {
             before(grammarAccess.getDeleteInstructionAccess().getElementElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getDeleteInstructionAccess().getElementElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__ElementAssignment_2"


    // $ANTLR start "rule__DeleteInstruction__ConditionsAssignment_5"
    // InternalMyDbl.g:4286:1: rule__DeleteInstruction__ConditionsAssignment_5 : ( ruleSingleCondition ) ;
    public final void rule__DeleteInstruction__ConditionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDbl.g:4290:1: ( ( ruleSingleCondition ) )
            // InternalMyDbl.g:4291:2: ( ruleSingleCondition )
            {
            // InternalMyDbl.g:4291:2: ( ruleSingleCondition )
            // InternalMyDbl.g:4292:3: ruleSingleCondition
            {
             before(grammarAccess.getDeleteInstructionAccess().getConditionsSingleConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleCondition();

            state._fsp--;

             after(grammarAccess.getDeleteInstructionAccess().getConditionsSingleConditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteInstruction__ConditionsAssignment_5"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\7\12\uffff";
    static final String dfa_3s = "\1\33\1\4\3\uffff\1\62\6\uffff";
    static final String dfa_4s = "\1\65\1\64\3\uffff\1\64\6\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\5\1\uffff\1\7\1\1\1\4\1\6\1\10\1\11";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\23\uffff\1\4\3\uffff\1\5",
            "\3\7\52\uffff\1\10\1\11\1\uffff\1\6",
            "",
            "",
            "",
            "\1\13\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "886:1: rule__Judgement__Alternatives : ( ( 'is' ) | ( 'as' ) | ( 'equals' ) | ( ( rule__Judgement__Group_3__0 ) ) | ( ( rule__Judgement__Group_4__0 ) ) | ( ( rule__Judgement__Group_5__0 ) ) | ( ( rule__Judgement__Group_6__0 ) ) | ( ( rule__Judgement__Group_7__0 ) ) | ( ( rule__Judgement__Group_8__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0040140840000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0040140840000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007FFF800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0022000038000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000000L});

}