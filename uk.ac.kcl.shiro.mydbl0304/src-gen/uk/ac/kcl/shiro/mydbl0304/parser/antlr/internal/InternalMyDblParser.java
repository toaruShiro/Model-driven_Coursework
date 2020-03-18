package uk.ac.kcl.shiro.mydbl0304.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.shiro.mydbl0304.services.MyDblGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDblParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'database'", "'named'", "'a'", "'table'", "','", "'which'", "'saves'", "'data'", "'of'", "'has'", "'attribute'", "'is'", "'Binary'", "'Varbinary'", "'Image'", "'Char'", "'Varchar'", "'Text'", "'Nchar'", "'Nvarchar'", "'Ntext'", "'Datetime'", "'Smalldatetime'", "'Date'", "'TimeStamp'", "'Integer'", "'Double'", "'Float'", "'add'", "'with'", "'find'", "'the'", "'whose'", "'in'", "'\\'s'", "'as'", "'equals'", "'not'", "'larger'", "'than'", "'less'", "'no'", "'remove'"
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

        public InternalMyDblParser(TokenStream input, MyDblGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Database";
       	}

       	@Override
       	protected MyDblGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDatabase"
    // InternalMyDbl.g:64:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalMyDbl.g:64:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalMyDbl.g:65:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalMyDbl.g:71:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'database' otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) ( (lv_instructions_4_0= ruleInstructions ) )* ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_instructions_4_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:77:2: ( (otherlv_0= 'create' otherlv_1= 'database' otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) ( (lv_instructions_4_0= ruleInstructions ) )* ) )
            // InternalMyDbl.g:78:2: (otherlv_0= 'create' otherlv_1= 'database' otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) ( (lv_instructions_4_0= ruleInstructions ) )* )
            {
            // InternalMyDbl.g:78:2: (otherlv_0= 'create' otherlv_1= 'database' otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) ( (lv_instructions_4_0= ruleInstructions ) )* )
            // InternalMyDbl.g:79:3: otherlv_0= 'create' otherlv_1= 'database' otherlv_2= 'named' ( (lv_name_3_0= RULE_ID ) ) ( (lv_instructions_4_0= ruleInstructions ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseAccess().getDatabaseKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDatabaseAccess().getNamedKeyword_2());
            		
            // InternalMyDbl.g:91:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDbl.g:92:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDbl.g:92:4: (lv_name_3_0= RULE_ID )
            // InternalMyDbl.g:93:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatabaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDbl.g:109:3: ( (lv_instructions_4_0= ruleInstructions ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==16||LA1_0==40||LA1_0==42||LA1_0==54) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDbl.g:110:4: (lv_instructions_4_0= ruleInstructions )
            	    {
            	    // InternalMyDbl.g:110:4: (lv_instructions_4_0= ruleInstructions )
            	    // InternalMyDbl.g:111:5: lv_instructions_4_0= ruleInstructions
            	    {

            	    					newCompositeNode(grammarAccess.getDatabaseAccess().getInstructionsInstructionsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_instructions_4_0=ruleInstructions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_4_0,
            	    						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Instructions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleInstructions"
    // InternalMyDbl.g:132:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalMyDbl.g:132:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalMyDbl.g:133:2: iv_ruleInstructions= ruleInstructions EOF
            {
             newCompositeNode(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructions=ruleInstructions();

            state._fsp--;

             current =iv_ruleInstructions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // InternalMyDbl.g:139:1: ruleInstructions returns [EObject current=null] : (this_CreateTableInstruction_0= ruleCreateTableInstruction | this_CreateElementInstruction_1= ruleCreateElementInstruction | this_CreateAttributeInstruction_2= ruleCreateAttributeInstruction | this_AddInstruction_3= ruleAddInstruction | this_FindInstruction_4= ruleFindInstruction | this_DeleteInstruction_5= ruleDeleteInstruction ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        EObject this_CreateTableInstruction_0 = null;

        EObject this_CreateElementInstruction_1 = null;

        EObject this_CreateAttributeInstruction_2 = null;

        EObject this_AddInstruction_3 = null;

        EObject this_FindInstruction_4 = null;

        EObject this_DeleteInstruction_5 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:145:2: ( (this_CreateTableInstruction_0= ruleCreateTableInstruction | this_CreateElementInstruction_1= ruleCreateElementInstruction | this_CreateAttributeInstruction_2= ruleCreateAttributeInstruction | this_AddInstruction_3= ruleAddInstruction | this_FindInstruction_4= ruleFindInstruction | this_DeleteInstruction_5= ruleDeleteInstruction ) )
            // InternalMyDbl.g:146:2: (this_CreateTableInstruction_0= ruleCreateTableInstruction | this_CreateElementInstruction_1= ruleCreateElementInstruction | this_CreateAttributeInstruction_2= ruleCreateAttributeInstruction | this_AddInstruction_3= ruleAddInstruction | this_FindInstruction_4= ruleFindInstruction | this_DeleteInstruction_5= ruleDeleteInstruction )
            {
            // InternalMyDbl.g:146:2: (this_CreateTableInstruction_0= ruleCreateTableInstruction | this_CreateElementInstruction_1= ruleCreateElementInstruction | this_CreateAttributeInstruction_2= ruleCreateAttributeInstruction | this_AddInstruction_3= ruleAddInstruction | this_FindInstruction_4= ruleFindInstruction | this_DeleteInstruction_5= ruleDeleteInstruction )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            case 40:
                {
                alt2=4;
                }
                break;
            case 42:
                {
                alt2=5;
                }
                break;
            case 54:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDbl.g:147:3: this_CreateTableInstruction_0= ruleCreateTableInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getCreateTableInstructionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateTableInstruction_0=ruleCreateTableInstruction();

                    state._fsp--;


                    			current = this_CreateTableInstruction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:156:3: this_CreateElementInstruction_1= ruleCreateElementInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getCreateElementInstructionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateElementInstruction_1=ruleCreateElementInstruction();

                    state._fsp--;


                    			current = this_CreateElementInstruction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDbl.g:165:3: this_CreateAttributeInstruction_2= ruleCreateAttributeInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getCreateAttributeInstructionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateAttributeInstruction_2=ruleCreateAttributeInstruction();

                    state._fsp--;


                    			current = this_CreateAttributeInstruction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDbl.g:174:3: this_AddInstruction_3= ruleAddInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getAddInstructionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddInstruction_3=ruleAddInstruction();

                    state._fsp--;


                    			current = this_AddInstruction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDbl.g:183:3: this_FindInstruction_4= ruleFindInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getFindInstructionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FindInstruction_4=ruleFindInstruction();

                    state._fsp--;


                    			current = this_FindInstruction_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDbl.g:192:3: this_DeleteInstruction_5= ruleDeleteInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionsAccess().getDeleteInstructionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteInstruction_5=ruleDeleteInstruction();

                    state._fsp--;


                    			current = this_DeleteInstruction_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "entryRuleCreateTableInstruction"
    // InternalMyDbl.g:204:1: entryRuleCreateTableInstruction returns [EObject current=null] : iv_ruleCreateTableInstruction= ruleCreateTableInstruction EOF ;
    public final EObject entryRuleCreateTableInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableInstruction = null;


        try {
            // InternalMyDbl.g:204:63: (iv_ruleCreateTableInstruction= ruleCreateTableInstruction EOF )
            // InternalMyDbl.g:205:2: iv_ruleCreateTableInstruction= ruleCreateTableInstruction EOF
            {
             newCompositeNode(grammarAccess.getCreateTableInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateTableInstruction=ruleCreateTableInstruction();

            state._fsp--;

             current =iv_ruleCreateTableInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateTableInstruction"


    // $ANTLR start "ruleCreateTableInstruction"
    // InternalMyDbl.g:211:1: ruleCreateTableInstruction returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_table_4_0= ruleTable ) ) ( (lv_element_5_0= ruleCreateElementInstruction ) ) ) ;
    public final EObject ruleCreateTableInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_table_4_0 = null;

        EObject lv_element_5_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:217:2: ( (otherlv_0= 'create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_table_4_0= ruleTable ) ) ( (lv_element_5_0= ruleCreateElementInstruction ) ) ) )
            // InternalMyDbl.g:218:2: (otherlv_0= 'create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_table_4_0= ruleTable ) ) ( (lv_element_5_0= ruleCreateElementInstruction ) ) )
            {
            // InternalMyDbl.g:218:2: (otherlv_0= 'create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_table_4_0= ruleTable ) ) ( (lv_element_5_0= ruleCreateElementInstruction ) ) )
            // InternalMyDbl.g:219:3: otherlv_0= 'create' otherlv_1= 'a' otherlv_2= 'table' otherlv_3= 'named' ( (lv_table_4_0= ruleTable ) ) ( (lv_element_5_0= ruleCreateElementInstruction ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateTableInstructionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateTableInstructionAccess().getAKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateTableInstructionAccess().getTableKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateTableInstructionAccess().getNamedKeyword_3());
            		
            // InternalMyDbl.g:235:3: ( (lv_table_4_0= ruleTable ) )
            // InternalMyDbl.g:236:4: (lv_table_4_0= ruleTable )
            {
            // InternalMyDbl.g:236:4: (lv_table_4_0= ruleTable )
            // InternalMyDbl.g:237:5: lv_table_4_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getCreateTableInstructionAccess().getTableTableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_table_4_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateTableInstructionRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_4_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:254:3: ( (lv_element_5_0= ruleCreateElementInstruction ) )
            // InternalMyDbl.g:255:4: (lv_element_5_0= ruleCreateElementInstruction )
            {
            // InternalMyDbl.g:255:4: (lv_element_5_0= ruleCreateElementInstruction )
            // InternalMyDbl.g:256:5: lv_element_5_0= ruleCreateElementInstruction
            {

            					newCompositeNode(grammarAccess.getCreateTableInstructionAccess().getElementCreateElementInstructionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_5_0=ruleCreateElementInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateTableInstructionRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_5_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.CreateElementInstruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateTableInstruction"


    // $ANTLR start "entryRuleTable"
    // InternalMyDbl.g:277:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMyDbl.g:277:46: (iv_ruleTable= ruleTable EOF )
            // InternalMyDbl.g:278:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDbl.g:284:1: ruleTable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDbl.g:290:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDbl.g:291:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDbl.g:291:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDbl.g:292:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDbl.g:292:3: (lv_name_0_0= RULE_ID )
            // InternalMyDbl.g:293:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleCreateElementInstruction"
    // InternalMyDbl.g:312:1: entryRuleCreateElementInstruction returns [EObject current=null] : iv_ruleCreateElementInstruction= ruleCreateElementInstruction EOF ;
    public final EObject entryRuleCreateElementInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateElementInstruction = null;


        try {
            // InternalMyDbl.g:312:65: (iv_ruleCreateElementInstruction= ruleCreateElementInstruction EOF )
            // InternalMyDbl.g:313:2: iv_ruleCreateElementInstruction= ruleCreateElementInstruction EOF
            {
             newCompositeNode(grammarAccess.getCreateElementInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateElementInstruction=ruleCreateElementInstruction();

            state._fsp--;

             current =iv_ruleCreateElementInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateElementInstruction"


    // $ANTLR start "ruleCreateElementInstruction"
    // InternalMyDbl.g:319:1: ruleCreateElementInstruction returns [EObject current=null] : (otherlv_0= ',' otherlv_1= 'which' otherlv_2= 'saves' otherlv_3= 'data' otherlv_4= 'of' ( (lv_element_5_0= ruleElement ) ) ) ;
    public final EObject ruleCreateElementInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_element_5_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:325:2: ( (otherlv_0= ',' otherlv_1= 'which' otherlv_2= 'saves' otherlv_3= 'data' otherlv_4= 'of' ( (lv_element_5_0= ruleElement ) ) ) )
            // InternalMyDbl.g:326:2: (otherlv_0= ',' otherlv_1= 'which' otherlv_2= 'saves' otherlv_3= 'data' otherlv_4= 'of' ( (lv_element_5_0= ruleElement ) ) )
            {
            // InternalMyDbl.g:326:2: (otherlv_0= ',' otherlv_1= 'which' otherlv_2= 'saves' otherlv_3= 'data' otherlv_4= 'of' ( (lv_element_5_0= ruleElement ) ) )
            // InternalMyDbl.g:327:3: otherlv_0= ',' otherlv_1= 'which' otherlv_2= 'saves' otherlv_3= 'data' otherlv_4= 'of' ( (lv_element_5_0= ruleElement ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateElementInstructionAccess().getCommaKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateElementInstructionAccess().getWhichKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateElementInstructionAccess().getSavesKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateElementInstructionAccess().getDataKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getCreateElementInstructionAccess().getOfKeyword_4());
            		
            // InternalMyDbl.g:347:3: ( (lv_element_5_0= ruleElement ) )
            // InternalMyDbl.g:348:4: (lv_element_5_0= ruleElement )
            {
            // InternalMyDbl.g:348:4: (lv_element_5_0= ruleElement )
            // InternalMyDbl.g:349:5: lv_element_5_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getCreateElementInstructionAccess().getElementElementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_5_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateElementInstructionRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_5_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateElementInstruction"


    // $ANTLR start "entryRuleElement"
    // InternalMyDbl.g:370:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDbl.g:370:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDbl.g:371:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDbl.g:377:1: ruleElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDbl.g:383:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDbl.g:384:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDbl.g:384:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDbl.g:385:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDbl.g:385:3: (lv_name_0_0= RULE_ID )
            // InternalMyDbl.g:386:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getElementAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCreateAttributeInstruction"
    // InternalMyDbl.g:405:1: entryRuleCreateAttributeInstruction returns [EObject current=null] : iv_ruleCreateAttributeInstruction= ruleCreateAttributeInstruction EOF ;
    public final EObject entryRuleCreateAttributeInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateAttributeInstruction = null;


        try {
            // InternalMyDbl.g:405:67: (iv_ruleCreateAttributeInstruction= ruleCreateAttributeInstruction EOF )
            // InternalMyDbl.g:406:2: iv_ruleCreateAttributeInstruction= ruleCreateAttributeInstruction EOF
            {
             newCompositeNode(grammarAccess.getCreateAttributeInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateAttributeInstruction=ruleCreateAttributeInstruction();

            state._fsp--;

             current =iv_ruleCreateAttributeInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateAttributeInstruction"


    // $ANTLR start "ruleCreateAttributeInstruction"
    // InternalMyDbl.g:412:1: ruleCreateAttributeInstruction returns [EObject current=null] : ( ( (lv_element_0_0= ruleElement ) ) otherlv_1= 'has' otherlv_2= 'attribute' otherlv_3= 'named' ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ',' otherlv_6= 'which' otherlv_7= 'is' ( (lv_attributeType_8_0= ruleAttributeType ) ) ) ;
    public final EObject ruleCreateAttributeInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_element_0_0 = null;

        EObject lv_attribute_4_0 = null;

        AntlrDatatypeRuleToken lv_attributeType_8_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:418:2: ( ( ( (lv_element_0_0= ruleElement ) ) otherlv_1= 'has' otherlv_2= 'attribute' otherlv_3= 'named' ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ',' otherlv_6= 'which' otherlv_7= 'is' ( (lv_attributeType_8_0= ruleAttributeType ) ) ) )
            // InternalMyDbl.g:419:2: ( ( (lv_element_0_0= ruleElement ) ) otherlv_1= 'has' otherlv_2= 'attribute' otherlv_3= 'named' ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ',' otherlv_6= 'which' otherlv_7= 'is' ( (lv_attributeType_8_0= ruleAttributeType ) ) )
            {
            // InternalMyDbl.g:419:2: ( ( (lv_element_0_0= ruleElement ) ) otherlv_1= 'has' otherlv_2= 'attribute' otherlv_3= 'named' ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ',' otherlv_6= 'which' otherlv_7= 'is' ( (lv_attributeType_8_0= ruleAttributeType ) ) )
            // InternalMyDbl.g:420:3: ( (lv_element_0_0= ruleElement ) ) otherlv_1= 'has' otherlv_2= 'attribute' otherlv_3= 'named' ( (lv_attribute_4_0= ruleAttribute ) ) otherlv_5= ',' otherlv_6= 'which' otherlv_7= 'is' ( (lv_attributeType_8_0= ruleAttributeType ) )
            {
            // InternalMyDbl.g:420:3: ( (lv_element_0_0= ruleElement ) )
            // InternalMyDbl.g:421:4: (lv_element_0_0= ruleElement )
            {
            // InternalMyDbl.g:421:4: (lv_element_0_0= ruleElement )
            // InternalMyDbl.g:422:5: lv_element_0_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getCreateAttributeInstructionAccess().getElementElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_element_0_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateAttributeInstructionRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAttributeInstructionAccess().getHasKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateAttributeInstructionAccess().getAttributeKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateAttributeInstructionAccess().getNamedKeyword_3());
            		
            // InternalMyDbl.g:451:3: ( (lv_attribute_4_0= ruleAttribute ) )
            // InternalMyDbl.g:452:4: (lv_attribute_4_0= ruleAttribute )
            {
            // InternalMyDbl.g:452:4: (lv_attribute_4_0= ruleAttribute )
            // InternalMyDbl.g:453:5: lv_attribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getCreateAttributeInstructionAccess().getAttributeAttributeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_attribute_4_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateAttributeInstructionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_4_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getCreateAttributeInstructionAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getCreateAttributeInstructionAccess().getWhichKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getCreateAttributeInstructionAccess().getIsKeyword_7());
            		
            // InternalMyDbl.g:482:3: ( (lv_attributeType_8_0= ruleAttributeType ) )
            // InternalMyDbl.g:483:4: (lv_attributeType_8_0= ruleAttributeType )
            {
            // InternalMyDbl.g:483:4: (lv_attributeType_8_0= ruleAttributeType )
            // InternalMyDbl.g:484:5: lv_attributeType_8_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getCreateAttributeInstructionAccess().getAttributeTypeAttributeTypeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_attributeType_8_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateAttributeInstructionRule());
            					}
            					set(
            						current,
            						"attributeType",
            						lv_attributeType_8_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateAttributeInstruction"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDbl.g:505:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDbl.g:505:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDbl.g:506:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDbl.g:512:1: ruleAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDbl.g:518:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyDbl.g:519:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyDbl.g:519:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDbl.g:520:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDbl.g:520:3: (lv_name_0_0= RULE_ID )
            // InternalMyDbl.g:521:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAttributeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalMyDbl.g:540:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // InternalMyDbl.g:540:53: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalMyDbl.g:541:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalMyDbl.g:547:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Binary' | kw= 'Varbinary' | kw= 'Image' | kw= 'Char' | kw= 'Varchar' | kw= 'Text' | kw= 'Nchar' | kw= 'Nvarchar' | kw= 'Ntext' | kw= 'Datetime' | kw= 'Smalldatetime' | kw= 'Date' | kw= 'TimeStamp' | kw= 'Integer' | kw= 'Double' | kw= 'Float' ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDbl.g:553:2: ( (kw= 'Binary' | kw= 'Varbinary' | kw= 'Image' | kw= 'Char' | kw= 'Varchar' | kw= 'Text' | kw= 'Nchar' | kw= 'Nvarchar' | kw= 'Ntext' | kw= 'Datetime' | kw= 'Smalldatetime' | kw= 'Date' | kw= 'TimeStamp' | kw= 'Integer' | kw= 'Double' | kw= 'Float' ) )
            // InternalMyDbl.g:554:2: (kw= 'Binary' | kw= 'Varbinary' | kw= 'Image' | kw= 'Char' | kw= 'Varchar' | kw= 'Text' | kw= 'Nchar' | kw= 'Nvarchar' | kw= 'Ntext' | kw= 'Datetime' | kw= 'Smalldatetime' | kw= 'Date' | kw= 'TimeStamp' | kw= 'Integer' | kw= 'Double' | kw= 'Float' )
            {
            // InternalMyDbl.g:554:2: (kw= 'Binary' | kw= 'Varbinary' | kw= 'Image' | kw= 'Char' | kw= 'Varchar' | kw= 'Text' | kw= 'Nchar' | kw= 'Nvarchar' | kw= 'Ntext' | kw= 'Datetime' | kw= 'Smalldatetime' | kw= 'Date' | kw= 'TimeStamp' | kw= 'Integer' | kw= 'Double' | kw= 'Float' )
            int alt3=16;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 28:
                {
                alt3=5;
                }
                break;
            case 29:
                {
                alt3=6;
                }
                break;
            case 30:
                {
                alt3=7;
                }
                break;
            case 31:
                {
                alt3=8;
                }
                break;
            case 32:
                {
                alt3=9;
                }
                break;
            case 33:
                {
                alt3=10;
                }
                break;
            case 34:
                {
                alt3=11;
                }
                break;
            case 35:
                {
                alt3=12;
                }
                break;
            case 36:
                {
                alt3=13;
                }
                break;
            case 37:
                {
                alt3=14;
                }
                break;
            case 38:
                {
                alt3=15;
                }
                break;
            case 39:
                {
                alt3=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDbl.g:555:3: kw= 'Binary'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getBinaryKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:561:3: kw= 'Varbinary'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getVarbinaryKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDbl.g:567:3: kw= 'Image'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getImageKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDbl.g:573:3: kw= 'Char'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getCharKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDbl.g:579:3: kw= 'Varchar'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getVarcharKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDbl.g:585:3: kw= 'Text'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getTextKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDbl.g:591:3: kw= 'Nchar'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getNcharKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDbl.g:597:3: kw= 'Nvarchar'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getNvarcharKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDbl.g:603:3: kw= 'Ntext'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getNtextKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDbl.g:609:3: kw= 'Datetime'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getDatetimeKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDbl.g:615:3: kw= 'Smalldatetime'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getSmalldatetimeKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDbl.g:621:3: kw= 'Date'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getDateKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDbl.g:627:3: kw= 'TimeStamp'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getTimeStampKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyDbl.g:633:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getIntegerKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalMyDbl.g:639:3: kw= 'Double'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getDoubleKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalMyDbl.g:645:3: kw= 'Float'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getFloatKeyword_15());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleBasicVar"
    // InternalMyDbl.g:654:1: entryRuleBasicVar returns [EObject current=null] : iv_ruleBasicVar= ruleBasicVar EOF ;
    public final EObject entryRuleBasicVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicVar = null;


        try {
            // InternalMyDbl.g:654:49: (iv_ruleBasicVar= ruleBasicVar EOF )
            // InternalMyDbl.g:655:2: iv_ruleBasicVar= ruleBasicVar EOF
            {
             newCompositeNode(grammarAccess.getBasicVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicVar=ruleBasicVar();

            state._fsp--;

             current =iv_ruleBasicVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicVar"


    // $ANTLR start "ruleBasicVar"
    // InternalMyDbl.g:661:1: ruleBasicVar returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBasicVar() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_string_1_0=null;


        	enterRule();

        try {
            // InternalMyDbl.g:667:2: ( ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalMyDbl.g:668:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalMyDbl.g:668:2: ( ( (lv_integer_0_0= RULE_INT ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDbl.g:669:3: ( (lv_integer_0_0= RULE_INT ) )
                    {
                    // InternalMyDbl.g:669:3: ( (lv_integer_0_0= RULE_INT ) )
                    // InternalMyDbl.g:670:4: (lv_integer_0_0= RULE_INT )
                    {
                    // InternalMyDbl.g:670:4: (lv_integer_0_0= RULE_INT )
                    // InternalMyDbl.g:671:5: lv_integer_0_0= RULE_INT
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getBasicVarAccess().getIntegerINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicVarRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:688:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalMyDbl.g:688:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalMyDbl.g:689:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalMyDbl.g:689:4: (lv_string_1_0= RULE_STRING )
                    // InternalMyDbl.g:690:5: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_1_0, grammarAccess.getBasicVarAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicVarRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_1_0,
                    						"uk.ac.kcl.shiro.mydbl0304.MyDbl.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicVar"


    // $ANTLR start "entryRuleAddInstruction"
    // InternalMyDbl.g:710:1: entryRuleAddInstruction returns [EObject current=null] : iv_ruleAddInstruction= ruleAddInstruction EOF ;
    public final EObject entryRuleAddInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddInstruction = null;


        try {
            // InternalMyDbl.g:710:55: (iv_ruleAddInstruction= ruleAddInstruction EOF )
            // InternalMyDbl.g:711:2: iv_ruleAddInstruction= ruleAddInstruction EOF
            {
             newCompositeNode(grammarAccess.getAddInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddInstruction=ruleAddInstruction();

            state._fsp--;

             current =iv_ruleAddInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddInstruction"


    // $ANTLR start "ruleAddInstruction"
    // InternalMyDbl.g:717:1: ruleAddInstruction returns [EObject current=null] : (otherlv_0= 'add' otherlv_1= 'a' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'with' ( (lv_insertInstruction_4_0= ruleInsertInstruction ) ) ) ;
    public final EObject ruleAddInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_element_2_0 = null;

        EObject lv_insertInstruction_4_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:723:2: ( (otherlv_0= 'add' otherlv_1= 'a' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'with' ( (lv_insertInstruction_4_0= ruleInsertInstruction ) ) ) )
            // InternalMyDbl.g:724:2: (otherlv_0= 'add' otherlv_1= 'a' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'with' ( (lv_insertInstruction_4_0= ruleInsertInstruction ) ) )
            {
            // InternalMyDbl.g:724:2: (otherlv_0= 'add' otherlv_1= 'a' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'with' ( (lv_insertInstruction_4_0= ruleInsertInstruction ) ) )
            // InternalMyDbl.g:725:3: otherlv_0= 'add' otherlv_1= 'a' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'with' ( (lv_insertInstruction_4_0= ruleInsertInstruction ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAddInstructionAccess().getAddKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddInstructionAccess().getAKeyword_1());
            		
            // InternalMyDbl.g:733:3: ( (lv_element_2_0= ruleElement ) )
            // InternalMyDbl.g:734:4: (lv_element_2_0= ruleElement )
            {
            // InternalMyDbl.g:734:4: (lv_element_2_0= ruleElement )
            // InternalMyDbl.g:735:5: lv_element_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getAddInstructionAccess().getElementElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_element_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddInstructionRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_2_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAddInstructionAccess().getWithKeyword_3());
            		
            // InternalMyDbl.g:756:3: ( (lv_insertInstruction_4_0= ruleInsertInstruction ) )
            // InternalMyDbl.g:757:4: (lv_insertInstruction_4_0= ruleInsertInstruction )
            {
            // InternalMyDbl.g:757:4: (lv_insertInstruction_4_0= ruleInsertInstruction )
            // InternalMyDbl.g:758:5: lv_insertInstruction_4_0= ruleInsertInstruction
            {

            					newCompositeNode(grammarAccess.getAddInstructionAccess().getInsertInstructionInsertInstructionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_insertInstruction_4_0=ruleInsertInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddInstructionRule());
            					}
            					set(
            						current,
            						"insertInstruction",
            						lv_insertInstruction_4_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.InsertInstruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddInstruction"


    // $ANTLR start "entryRuleInsertInstruction"
    // InternalMyDbl.g:779:1: entryRuleInsertInstruction returns [EObject current=null] : iv_ruleInsertInstruction= ruleInsertInstruction EOF ;
    public final EObject entryRuleInsertInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertInstruction = null;


        try {
            // InternalMyDbl.g:779:58: (iv_ruleInsertInstruction= ruleInsertInstruction EOF )
            // InternalMyDbl.g:780:2: iv_ruleInsertInstruction= ruleInsertInstruction EOF
            {
             newCompositeNode(grammarAccess.getInsertInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertInstruction=ruleInsertInstruction();

            state._fsp--;

             current =iv_ruleInsertInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsertInstruction"


    // $ANTLR start "ruleInsertInstruction"
    // InternalMyDbl.g:786:1: ruleInsertInstruction returns [EObject current=null] : ( ( (lv_setAttributeInstructions_0_0= ruleSetAttributeInstruction ) ) (otherlv_1= ',' ( (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction ) ) )* ) ;
    public final EObject ruleInsertInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_setAttributeInstructions_0_0 = null;

        EObject lv_setAttributeInstructions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:792:2: ( ( ( (lv_setAttributeInstructions_0_0= ruleSetAttributeInstruction ) ) (otherlv_1= ',' ( (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction ) ) )* ) )
            // InternalMyDbl.g:793:2: ( ( (lv_setAttributeInstructions_0_0= ruleSetAttributeInstruction ) ) (otherlv_1= ',' ( (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction ) ) )* )
            {
            // InternalMyDbl.g:793:2: ( ( (lv_setAttributeInstructions_0_0= ruleSetAttributeInstruction ) ) (otherlv_1= ',' ( (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction ) ) )* )
            // InternalMyDbl.g:794:3: ( (lv_setAttributeInstructions_0_0= ruleSetAttributeInstruction ) ) (otherlv_1= ',' ( (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction ) ) )*
            {
            // InternalMyDbl.g:794:3: ( (lv_setAttributeInstructions_0_0= ruleSetAttributeInstruction ) )
            // InternalMyDbl.g:795:4: (lv_setAttributeInstructions_0_0= ruleSetAttributeInstruction )
            {
            // InternalMyDbl.g:795:4: (lv_setAttributeInstructions_0_0= ruleSetAttributeInstruction )
            // InternalMyDbl.g:796:5: lv_setAttributeInstructions_0_0= ruleSetAttributeInstruction
            {

            					newCompositeNode(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsSetAttributeInstructionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_setAttributeInstructions_0_0=ruleSetAttributeInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertInstructionRule());
            					}
            					add(
            						current,
            						"setAttributeInstructions",
            						lv_setAttributeInstructions_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.SetAttributeInstruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:813:3: (otherlv_1= ',' ( (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDbl.g:814:4: otherlv_1= ',' ( (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInsertInstructionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDbl.g:818:4: ( (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction ) )
            	    // InternalMyDbl.g:819:5: (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction )
            	    {
            	    // InternalMyDbl.g:819:5: (lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction )
            	    // InternalMyDbl.g:820:6: lv_setAttributeInstructions_2_0= ruleSetAttributeInstruction
            	    {

            	    						newCompositeNode(grammarAccess.getInsertInstructionAccess().getSetAttributeInstructionsSetAttributeInstructionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_setAttributeInstructions_2_0=ruleSetAttributeInstruction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInsertInstructionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"setAttributeInstructions",
            	    							lv_setAttributeInstructions_2_0,
            	    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.SetAttributeInstruction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsertInstruction"


    // $ANTLR start "entryRuleSetAttributeInstruction"
    // InternalMyDbl.g:842:1: entryRuleSetAttributeInstruction returns [EObject current=null] : iv_ruleSetAttributeInstruction= ruleSetAttributeInstruction EOF ;
    public final EObject entryRuleSetAttributeInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetAttributeInstruction = null;


        try {
            // InternalMyDbl.g:842:64: (iv_ruleSetAttributeInstruction= ruleSetAttributeInstruction EOF )
            // InternalMyDbl.g:843:2: iv_ruleSetAttributeInstruction= ruleSetAttributeInstruction EOF
            {
             newCompositeNode(grammarAccess.getSetAttributeInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetAttributeInstruction=ruleSetAttributeInstruction();

            state._fsp--;

             current =iv_ruleSetAttributeInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetAttributeInstruction"


    // $ANTLR start "ruleSetAttributeInstruction"
    // InternalMyDbl.g:849:1: ruleSetAttributeInstruction returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= 'of' ( (lv_attributeValue_2_0= ruleBasicVar ) ) ) ;
    public final EObject ruleSetAttributeInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attribute_0_0 = null;

        EObject lv_attributeValue_2_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:855:2: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= 'of' ( (lv_attributeValue_2_0= ruleBasicVar ) ) ) )
            // InternalMyDbl.g:856:2: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= 'of' ( (lv_attributeValue_2_0= ruleBasicVar ) ) )
            {
            // InternalMyDbl.g:856:2: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= 'of' ( (lv_attributeValue_2_0= ruleBasicVar ) ) )
            // InternalMyDbl.g:857:3: ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= 'of' ( (lv_attributeValue_2_0= ruleBasicVar ) )
            {
            // InternalMyDbl.g:857:3: ( (lv_attribute_0_0= ruleAttribute ) )
            // InternalMyDbl.g:858:4: (lv_attribute_0_0= ruleAttribute )
            {
            // InternalMyDbl.g:858:4: (lv_attribute_0_0= ruleAttribute )
            // InternalMyDbl.g:859:5: lv_attribute_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getSetAttributeInstructionAccess().getAttributeAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_attribute_0_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetAttributeInstructionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAttributeInstructionAccess().getOfKeyword_1());
            		
            // InternalMyDbl.g:880:3: ( (lv_attributeValue_2_0= ruleBasicVar ) )
            // InternalMyDbl.g:881:4: (lv_attributeValue_2_0= ruleBasicVar )
            {
            // InternalMyDbl.g:881:4: (lv_attributeValue_2_0= ruleBasicVar )
            // InternalMyDbl.g:882:5: lv_attributeValue_2_0= ruleBasicVar
            {

            					newCompositeNode(grammarAccess.getSetAttributeInstructionAccess().getAttributeValueBasicVarParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attributeValue_2_0=ruleBasicVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetAttributeInstructionRule());
            					}
            					set(
            						current,
            						"attributeValue",
            						lv_attributeValue_2_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.BasicVar");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetAttributeInstruction"


    // $ANTLR start "entryRuleFindInstruction"
    // InternalMyDbl.g:903:1: entryRuleFindInstruction returns [EObject current=null] : iv_ruleFindInstruction= ruleFindInstruction EOF ;
    public final EObject entryRuleFindInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindInstruction = null;


        try {
            // InternalMyDbl.g:903:56: (iv_ruleFindInstruction= ruleFindInstruction EOF )
            // InternalMyDbl.g:904:2: iv_ruleFindInstruction= ruleFindInstruction EOF
            {
             newCompositeNode(grammarAccess.getFindInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFindInstruction=ruleFindInstruction();

            state._fsp--;

             current =iv_ruleFindInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFindInstruction"


    // $ANTLR start "ruleFindInstruction"
    // InternalMyDbl.g:910:1: ruleFindInstruction returns [EObject current=null] : (otherlv_0= 'find' otherlv_1= 'the' (this_SingleElement_2= ruleSingleElement | this_JointElement_3= ruleJointElement ) ) ;
    public final EObject ruleFindInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_SingleElement_2 = null;

        EObject this_JointElement_3 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:916:2: ( (otherlv_0= 'find' otherlv_1= 'the' (this_SingleElement_2= ruleSingleElement | this_JointElement_3= ruleJointElement ) ) )
            // InternalMyDbl.g:917:2: (otherlv_0= 'find' otherlv_1= 'the' (this_SingleElement_2= ruleSingleElement | this_JointElement_3= ruleJointElement ) )
            {
            // InternalMyDbl.g:917:2: (otherlv_0= 'find' otherlv_1= 'the' (this_SingleElement_2= ruleSingleElement | this_JointElement_3= ruleJointElement ) )
            // InternalMyDbl.g:918:3: otherlv_0= 'find' otherlv_1= 'the' (this_SingleElement_2= ruleSingleElement | this_JointElement_3= ruleJointElement )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getFindInstructionAccess().getFindKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFindInstructionAccess().getTheKeyword_1());
            		
            // InternalMyDbl.g:926:3: (this_SingleElement_2= ruleSingleElement | this_JointElement_3= ruleJointElement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==41) ) {
                    alt6=2;
                }
                else if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==11||LA6_1==16||LA6_1==20||LA6_1==40||LA6_1==42||LA6_1==54) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDbl.g:927:4: this_SingleElement_2= ruleSingleElement
                    {

                    				newCompositeNode(grammarAccess.getFindInstructionAccess().getSingleElementParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_SingleElement_2=ruleSingleElement();

                    state._fsp--;


                    				current = this_SingleElement_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:936:4: this_JointElement_3= ruleJointElement
                    {

                    				newCompositeNode(grammarAccess.getFindInstructionAccess().getJointElementParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_JointElement_3=ruleJointElement();

                    state._fsp--;


                    				current = this_JointElement_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFindInstruction"


    // $ANTLR start "entryRuleSingleElement"
    // InternalMyDbl.g:949:1: entryRuleSingleElement returns [EObject current=null] : iv_ruleSingleElement= ruleSingleElement EOF ;
    public final EObject entryRuleSingleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleElement = null;


        try {
            // InternalMyDbl.g:949:54: (iv_ruleSingleElement= ruleSingleElement EOF )
            // InternalMyDbl.g:950:2: iv_ruleSingleElement= ruleSingleElement EOF
            {
             newCompositeNode(grammarAccess.getSingleElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleElement=ruleSingleElement();

            state._fsp--;

             current =iv_ruleSingleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleElement"


    // $ANTLR start "ruleSingleElement"
    // InternalMyDbl.g:956:1: ruleSingleElement returns [EObject current=null] : ( ( ( (lv_targets_0_0= ruleTarget ) ) otherlv_1= 'of' )? ( (lv_element_2_0= ruleElement ) ) (otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) )? ) ;
    public final EObject ruleSingleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_targets_0_0 = null;

        EObject lv_element_2_0 = null;

        EObject lv_conditions_5_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:962:2: ( ( ( ( (lv_targets_0_0= ruleTarget ) ) otherlv_1= 'of' )? ( (lv_element_2_0= ruleElement ) ) (otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) )? ) )
            // InternalMyDbl.g:963:2: ( ( ( (lv_targets_0_0= ruleTarget ) ) otherlv_1= 'of' )? ( (lv_element_2_0= ruleElement ) ) (otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) )? )
            {
            // InternalMyDbl.g:963:2: ( ( ( (lv_targets_0_0= ruleTarget ) ) otherlv_1= 'of' )? ( (lv_element_2_0= ruleElement ) ) (otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) )? )
            // InternalMyDbl.g:964:3: ( ( (lv_targets_0_0= ruleTarget ) ) otherlv_1= 'of' )? ( (lv_element_2_0= ruleElement ) ) (otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) )?
            {
            // InternalMyDbl.g:964:3: ( ( (lv_targets_0_0= ruleTarget ) ) otherlv_1= 'of' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==16) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==RULE_ID) ) {
                        alt7=1;
                    }
                }
                else if ( (LA7_1==20) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDbl.g:965:4: ( (lv_targets_0_0= ruleTarget ) ) otherlv_1= 'of'
                    {
                    // InternalMyDbl.g:965:4: ( (lv_targets_0_0= ruleTarget ) )
                    // InternalMyDbl.g:966:5: (lv_targets_0_0= ruleTarget )
                    {
                    // InternalMyDbl.g:966:5: (lv_targets_0_0= ruleTarget )
                    // InternalMyDbl.g:967:6: lv_targets_0_0= ruleTarget
                    {

                    						newCompositeNode(grammarAccess.getSingleElementAccess().getTargetsTargetParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_targets_0_0=ruleTarget();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleElementRule());
                    						}
                    						set(
                    							current,
                    							"targets",
                    							lv_targets_0_0,
                    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.Target");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getSingleElementAccess().getOfKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDbl.g:989:3: ( (lv_element_2_0= ruleElement ) )
            // InternalMyDbl.g:990:4: (lv_element_2_0= ruleElement )
            {
            // InternalMyDbl.g:990:4: (lv_element_2_0= ruleElement )
            // InternalMyDbl.g:991:5: lv_element_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getSingleElementAccess().getElementElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_element_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleElementRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_2_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:1008:3: (otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==44) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDbl.g:1009:4: otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getSingleElementAccess().getCommaKeyword_2_0());
                    			
                    otherlv_4=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSingleElementAccess().getWhoseKeyword_2_1());
                    			
                    // InternalMyDbl.g:1017:4: ( (lv_conditions_5_0= ruleSingleCondition ) )
                    // InternalMyDbl.g:1018:5: (lv_conditions_5_0= ruleSingleCondition )
                    {
                    // InternalMyDbl.g:1018:5: (lv_conditions_5_0= ruleSingleCondition )
                    // InternalMyDbl.g:1019:6: lv_conditions_5_0= ruleSingleCondition
                    {

                    						newCompositeNode(grammarAccess.getSingleElementAccess().getConditionsSingleConditionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_conditions_5_0=ruleSingleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleElementRule());
                    						}
                    						set(
                    							current,
                    							"conditions",
                    							lv_conditions_5_0,
                    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.SingleCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleElement"


    // $ANTLR start "entryRuleTarget"
    // InternalMyDbl.g:1041:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalMyDbl.g:1041:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalMyDbl.g:1042:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalMyDbl.g:1048:1: ruleTarget returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attributes_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:1054:2: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attributes_2_0= ruleAttribute ) ) )* ) )
            // InternalMyDbl.g:1055:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            {
            // InternalMyDbl.g:1055:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            // InternalMyDbl.g:1056:3: ( (lv_attributes_0_0= ruleAttribute ) ) (otherlv_1= ',' ( (lv_attributes_2_0= ruleAttribute ) ) )*
            {
            // InternalMyDbl.g:1056:3: ( (lv_attributes_0_0= ruleAttribute ) )
            // InternalMyDbl.g:1057:4: (lv_attributes_0_0= ruleAttribute )
            {
            // InternalMyDbl.g:1057:4: (lv_attributes_0_0= ruleAttribute )
            // InternalMyDbl.g:1058:5: lv_attributes_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getTargetAccess().getAttributesAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_attributes_0_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTargetRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:1075:3: (otherlv_1= ',' ( (lv_attributes_2_0= ruleAttribute ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDbl.g:1076:4: otherlv_1= ',' ( (lv_attributes_2_0= ruleAttribute ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTargetAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDbl.g:1080:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // InternalMyDbl.g:1081:5: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalMyDbl.g:1081:5: (lv_attributes_2_0= ruleAttribute )
            	    // InternalMyDbl.g:1082:6: lv_attributes_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getTargetAccess().getAttributesAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTargetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_2_0,
            	    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleJointElement"
    // InternalMyDbl.g:1104:1: entryRuleJointElement returns [EObject current=null] : iv_ruleJointElement= ruleJointElement EOF ;
    public final EObject entryRuleJointElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointElement = null;


        try {
            // InternalMyDbl.g:1104:53: (iv_ruleJointElement= ruleJointElement EOF )
            // InternalMyDbl.g:1105:2: iv_ruleJointElement= ruleJointElement EOF
            {
             newCompositeNode(grammarAccess.getJointElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointElement=ruleJointElement();

            state._fsp--;

             current =iv_ruleJointElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJointElement"


    // $ANTLR start "ruleJointElement"
    // InternalMyDbl.g:1111:1: ruleJointElement returns [EObject current=null] : ( ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= 'with' ( (lv_elements_2_0= ruleElement ) ) )+ otherlv_3= ',' otherlv_4= 'in' otherlv_5= 'which' ( (lv_conditions_6_0= ruleJointCondition ) ) ) ;
    public final EObject ruleJointElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_conditions_6_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:1117:2: ( ( ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= 'with' ( (lv_elements_2_0= ruleElement ) ) )+ otherlv_3= ',' otherlv_4= 'in' otherlv_5= 'which' ( (lv_conditions_6_0= ruleJointCondition ) ) ) )
            // InternalMyDbl.g:1118:2: ( ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= 'with' ( (lv_elements_2_0= ruleElement ) ) )+ otherlv_3= ',' otherlv_4= 'in' otherlv_5= 'which' ( (lv_conditions_6_0= ruleJointCondition ) ) )
            {
            // InternalMyDbl.g:1118:2: ( ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= 'with' ( (lv_elements_2_0= ruleElement ) ) )+ otherlv_3= ',' otherlv_4= 'in' otherlv_5= 'which' ( (lv_conditions_6_0= ruleJointCondition ) ) )
            // InternalMyDbl.g:1119:3: ( (lv_elements_0_0= ruleElement ) ) (otherlv_1= 'with' ( (lv_elements_2_0= ruleElement ) ) )+ otherlv_3= ',' otherlv_4= 'in' otherlv_5= 'which' ( (lv_conditions_6_0= ruleJointCondition ) )
            {
            // InternalMyDbl.g:1119:3: ( (lv_elements_0_0= ruleElement ) )
            // InternalMyDbl.g:1120:4: (lv_elements_0_0= ruleElement )
            {
            // InternalMyDbl.g:1120:4: (lv_elements_0_0= ruleElement )
            // InternalMyDbl.g:1121:5: lv_elements_0_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getJointElementAccess().getElementsElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_elements_0_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointElementRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:1138:3: (otherlv_1= 'with' ( (lv_elements_2_0= ruleElement ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==41) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDbl.g:1139:4: otherlv_1= 'with' ( (lv_elements_2_0= ruleElement ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getJointElementAccess().getWithKeyword_1_0());
            	    			
            	    // InternalMyDbl.g:1143:4: ( (lv_elements_2_0= ruleElement ) )
            	    // InternalMyDbl.g:1144:5: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalMyDbl.g:1144:5: (lv_elements_2_0= ruleElement )
            	    // InternalMyDbl.g:1145:6: lv_elements_2_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getJointElementAccess().getElementsElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJointElementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_2_0,
            	    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getJointElementAccess().getCommaKeyword_2());
            		
            otherlv_4=(Token)match(input,45,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getJointElementAccess().getInKeyword_3());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getJointElementAccess().getWhichKeyword_4());
            		
            // InternalMyDbl.g:1175:3: ( (lv_conditions_6_0= ruleJointCondition ) )
            // InternalMyDbl.g:1176:4: (lv_conditions_6_0= ruleJointCondition )
            {
            // InternalMyDbl.g:1176:4: (lv_conditions_6_0= ruleJointCondition )
            // InternalMyDbl.g:1177:5: lv_conditions_6_0= ruleJointCondition
            {

            					newCompositeNode(grammarAccess.getJointElementAccess().getConditionsJointConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_conditions_6_0=ruleJointCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointElementRule());
            					}
            					set(
            						current,
            						"conditions",
            						lv_conditions_6_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.JointCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJointElement"


    // $ANTLR start "entryRuleSingleCondition"
    // InternalMyDbl.g:1198:1: entryRuleSingleCondition returns [EObject current=null] : iv_ruleSingleCondition= ruleSingleCondition EOF ;
    public final EObject entryRuleSingleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleCondition = null;


        try {
            // InternalMyDbl.g:1198:56: (iv_ruleSingleCondition= ruleSingleCondition EOF )
            // InternalMyDbl.g:1199:2: iv_ruleSingleCondition= ruleSingleCondition EOF
            {
             newCompositeNode(grammarAccess.getSingleConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleCondition=ruleSingleCondition();

            state._fsp--;

             current =iv_ruleSingleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleCondition"


    // $ANTLR start "ruleSingleCondition"
    // InternalMyDbl.g:1205:1: ruleSingleCondition returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleSingleConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleSingleConditionUnit ) ) )* ) ;
    public final EObject ruleSingleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_conditions_0_0 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:1211:2: ( ( ( (lv_conditions_0_0= ruleSingleConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleSingleConditionUnit ) ) )* ) )
            // InternalMyDbl.g:1212:2: ( ( (lv_conditions_0_0= ruleSingleConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleSingleConditionUnit ) ) )* )
            {
            // InternalMyDbl.g:1212:2: ( ( (lv_conditions_0_0= ruleSingleConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleSingleConditionUnit ) ) )* )
            // InternalMyDbl.g:1213:3: ( (lv_conditions_0_0= ruleSingleConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleSingleConditionUnit ) ) )*
            {
            // InternalMyDbl.g:1213:3: ( (lv_conditions_0_0= ruleSingleConditionUnit ) )
            // InternalMyDbl.g:1214:4: (lv_conditions_0_0= ruleSingleConditionUnit )
            {
            // InternalMyDbl.g:1214:4: (lv_conditions_0_0= ruleSingleConditionUnit )
            // InternalMyDbl.g:1215:5: lv_conditions_0_0= ruleSingleConditionUnit
            {

            					newCompositeNode(grammarAccess.getSingleConditionAccess().getConditionsSingleConditionUnitParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_conditions_0_0=ruleSingleConditionUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleConditionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.SingleConditionUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:1232:3: (otherlv_1= ',' ( (lv_conditions_2_0= ruleSingleConditionUnit ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDbl.g:1233:4: otherlv_1= ',' ( (lv_conditions_2_0= ruleSingleConditionUnit ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSingleConditionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDbl.g:1237:4: ( (lv_conditions_2_0= ruleSingleConditionUnit ) )
            	    // InternalMyDbl.g:1238:5: (lv_conditions_2_0= ruleSingleConditionUnit )
            	    {
            	    // InternalMyDbl.g:1238:5: (lv_conditions_2_0= ruleSingleConditionUnit )
            	    // InternalMyDbl.g:1239:6: lv_conditions_2_0= ruleSingleConditionUnit
            	    {

            	    						newCompositeNode(grammarAccess.getSingleConditionAccess().getConditionsSingleConditionUnitParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_conditions_2_0=ruleSingleConditionUnit();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSingleConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_2_0,
            	    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.SingleConditionUnit");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleCondition"


    // $ANTLR start "entryRuleJointCondition"
    // InternalMyDbl.g:1261:1: entryRuleJointCondition returns [EObject current=null] : iv_ruleJointCondition= ruleJointCondition EOF ;
    public final EObject entryRuleJointCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointCondition = null;


        try {
            // InternalMyDbl.g:1261:55: (iv_ruleJointCondition= ruleJointCondition EOF )
            // InternalMyDbl.g:1262:2: iv_ruleJointCondition= ruleJointCondition EOF
            {
             newCompositeNode(grammarAccess.getJointConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointCondition=ruleJointCondition();

            state._fsp--;

             current =iv_ruleJointCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJointCondition"


    // $ANTLR start "ruleJointCondition"
    // InternalMyDbl.g:1268:1: ruleJointCondition returns [EObject current=null] : ( ( (lv_conditions_0_0= ruleJointConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleJointConditionUnit ) ) )* ) ;
    public final EObject ruleJointCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_conditions_0_0 = null;

        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:1274:2: ( ( ( (lv_conditions_0_0= ruleJointConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleJointConditionUnit ) ) )* ) )
            // InternalMyDbl.g:1275:2: ( ( (lv_conditions_0_0= ruleJointConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleJointConditionUnit ) ) )* )
            {
            // InternalMyDbl.g:1275:2: ( ( (lv_conditions_0_0= ruleJointConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleJointConditionUnit ) ) )* )
            // InternalMyDbl.g:1276:3: ( (lv_conditions_0_0= ruleJointConditionUnit ) ) (otherlv_1= ',' ( (lv_conditions_2_0= ruleJointConditionUnit ) ) )*
            {
            // InternalMyDbl.g:1276:3: ( (lv_conditions_0_0= ruleJointConditionUnit ) )
            // InternalMyDbl.g:1277:4: (lv_conditions_0_0= ruleJointConditionUnit )
            {
            // InternalMyDbl.g:1277:4: (lv_conditions_0_0= ruleJointConditionUnit )
            // InternalMyDbl.g:1278:5: lv_conditions_0_0= ruleJointConditionUnit
            {

            					newCompositeNode(grammarAccess.getJointConditionAccess().getConditionsJointConditionUnitParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_conditions_0_0=ruleJointConditionUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointConditionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.JointConditionUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:1295:3: (otherlv_1= ',' ( (lv_conditions_2_0= ruleJointConditionUnit ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDbl.g:1296:4: otherlv_1= ',' ( (lv_conditions_2_0= ruleJointConditionUnit ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getJointConditionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDbl.g:1300:4: ( (lv_conditions_2_0= ruleJointConditionUnit ) )
            	    // InternalMyDbl.g:1301:5: (lv_conditions_2_0= ruleJointConditionUnit )
            	    {
            	    // InternalMyDbl.g:1301:5: (lv_conditions_2_0= ruleJointConditionUnit )
            	    // InternalMyDbl.g:1302:6: lv_conditions_2_0= ruleJointConditionUnit
            	    {

            	    						newCompositeNode(grammarAccess.getJointConditionAccess().getConditionsJointConditionUnitParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_conditions_2_0=ruleJointConditionUnit();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJointConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_2_0,
            	    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.JointConditionUnit");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJointCondition"


    // $ANTLR start "entryRuleSingleConditionUnit"
    // InternalMyDbl.g:1324:1: entryRuleSingleConditionUnit returns [EObject current=null] : iv_ruleSingleConditionUnit= ruleSingleConditionUnit EOF ;
    public final EObject entryRuleSingleConditionUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleConditionUnit = null;


        try {
            // InternalMyDbl.g:1324:60: (iv_ruleSingleConditionUnit= ruleSingleConditionUnit EOF )
            // InternalMyDbl.g:1325:2: iv_ruleSingleConditionUnit= ruleSingleConditionUnit EOF
            {
             newCompositeNode(grammarAccess.getSingleConditionUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleConditionUnit=ruleSingleConditionUnit();

            state._fsp--;

             current =iv_ruleSingleConditionUnit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleConditionUnit"


    // $ANTLR start "ruleSingleConditionUnit"
    // InternalMyDbl.g:1331:1: ruleSingleConditionUnit returns [EObject current=null] : ( ( (lv_attributeLeft_0_0= ruleAttribute ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_attributeRight_2_0= ruleAttribute ) ) | ( (lv_value_3_0= ruleBasicVar ) ) ) ) ;
    public final EObject ruleSingleConditionUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_attributeLeft_0_0 = null;

        AntlrDatatypeRuleToken lv_judgement_1_0 = null;

        EObject lv_attributeRight_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:1337:2: ( ( ( (lv_attributeLeft_0_0= ruleAttribute ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_attributeRight_2_0= ruleAttribute ) ) | ( (lv_value_3_0= ruleBasicVar ) ) ) ) )
            // InternalMyDbl.g:1338:2: ( ( (lv_attributeLeft_0_0= ruleAttribute ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_attributeRight_2_0= ruleAttribute ) ) | ( (lv_value_3_0= ruleBasicVar ) ) ) )
            {
            // InternalMyDbl.g:1338:2: ( ( (lv_attributeLeft_0_0= ruleAttribute ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_attributeRight_2_0= ruleAttribute ) ) | ( (lv_value_3_0= ruleBasicVar ) ) ) )
            // InternalMyDbl.g:1339:3: ( (lv_attributeLeft_0_0= ruleAttribute ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_attributeRight_2_0= ruleAttribute ) ) | ( (lv_value_3_0= ruleBasicVar ) ) )
            {
            // InternalMyDbl.g:1339:3: ( (lv_attributeLeft_0_0= ruleAttribute ) )
            // InternalMyDbl.g:1340:4: (lv_attributeLeft_0_0= ruleAttribute )
            {
            // InternalMyDbl.g:1340:4: (lv_attributeLeft_0_0= ruleAttribute )
            // InternalMyDbl.g:1341:5: lv_attributeLeft_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getSingleConditionUnitAccess().getAttributeLeftAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_attributeLeft_0_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleConditionUnitRule());
            					}
            					set(
            						current,
            						"attributeLeft",
            						lv_attributeLeft_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:1358:3: ( (lv_judgement_1_0= ruleJudgement ) )
            // InternalMyDbl.g:1359:4: (lv_judgement_1_0= ruleJudgement )
            {
            // InternalMyDbl.g:1359:4: (lv_judgement_1_0= ruleJudgement )
            // InternalMyDbl.g:1360:5: lv_judgement_1_0= ruleJudgement
            {

            					newCompositeNode(grammarAccess.getSingleConditionUnitAccess().getJudgementJudgementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_judgement_1_0=ruleJudgement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleConditionUnitRule());
            					}
            					set(
            						current,
            						"judgement",
            						lv_judgement_1_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Judgement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:1377:3: ( ( (lv_attributeRight_2_0= ruleAttribute ) ) | ( (lv_value_3_0= ruleBasicVar ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_STRING)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDbl.g:1378:4: ( (lv_attributeRight_2_0= ruleAttribute ) )
                    {
                    // InternalMyDbl.g:1378:4: ( (lv_attributeRight_2_0= ruleAttribute ) )
                    // InternalMyDbl.g:1379:5: (lv_attributeRight_2_0= ruleAttribute )
                    {
                    // InternalMyDbl.g:1379:5: (lv_attributeRight_2_0= ruleAttribute )
                    // InternalMyDbl.g:1380:6: lv_attributeRight_2_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getSingleConditionUnitAccess().getAttributeRightAttributeParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_attributeRight_2_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleConditionUnitRule());
                    						}
                    						set(
                    							current,
                    							"attributeRight",
                    							lv_attributeRight_2_0,
                    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:1398:4: ( (lv_value_3_0= ruleBasicVar ) )
                    {
                    // InternalMyDbl.g:1398:4: ( (lv_value_3_0= ruleBasicVar ) )
                    // InternalMyDbl.g:1399:5: (lv_value_3_0= ruleBasicVar )
                    {
                    // InternalMyDbl.g:1399:5: (lv_value_3_0= ruleBasicVar )
                    // InternalMyDbl.g:1400:6: lv_value_3_0= ruleBasicVar
                    {

                    						newCompositeNode(grammarAccess.getSingleConditionUnitAccess().getValueBasicVarParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleBasicVar();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSingleConditionUnitRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.BasicVar");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleConditionUnit"


    // $ANTLR start "entryRuleJointConditionUnit"
    // InternalMyDbl.g:1422:1: entryRuleJointConditionUnit returns [EObject current=null] : iv_ruleJointConditionUnit= ruleJointConditionUnit EOF ;
    public final EObject entryRuleJointConditionUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJointConditionUnit = null;


        try {
            // InternalMyDbl.g:1422:59: (iv_ruleJointConditionUnit= ruleJointConditionUnit EOF )
            // InternalMyDbl.g:1423:2: iv_ruleJointConditionUnit= ruleJointConditionUnit EOF
            {
             newCompositeNode(grammarAccess.getJointConditionUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJointConditionUnit=ruleJointConditionUnit();

            state._fsp--;

             current =iv_ruleJointConditionUnit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJointConditionUnit"


    // $ANTLR start "ruleJointConditionUnit"
    // InternalMyDbl.g:1429:1: ruleJointConditionUnit returns [EObject current=null] : ( ( (lv_elementLeft_0_0= ruleAttributeOfElement ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_elementRight_2_0= ruleAttributeOfElement ) ) | ( (lv_value_3_0= ruleBasicVar ) ) ) ) ;
    public final EObject ruleJointConditionUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_elementLeft_0_0 = null;

        AntlrDatatypeRuleToken lv_judgement_1_0 = null;

        EObject lv_elementRight_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:1435:2: ( ( ( (lv_elementLeft_0_0= ruleAttributeOfElement ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_elementRight_2_0= ruleAttributeOfElement ) ) | ( (lv_value_3_0= ruleBasicVar ) ) ) ) )
            // InternalMyDbl.g:1436:2: ( ( (lv_elementLeft_0_0= ruleAttributeOfElement ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_elementRight_2_0= ruleAttributeOfElement ) ) | ( (lv_value_3_0= ruleBasicVar ) ) ) )
            {
            // InternalMyDbl.g:1436:2: ( ( (lv_elementLeft_0_0= ruleAttributeOfElement ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_elementRight_2_0= ruleAttributeOfElement ) ) | ( (lv_value_3_0= ruleBasicVar ) ) ) )
            // InternalMyDbl.g:1437:3: ( (lv_elementLeft_0_0= ruleAttributeOfElement ) ) ( (lv_judgement_1_0= ruleJudgement ) ) ( ( (lv_elementRight_2_0= ruleAttributeOfElement ) ) | ( (lv_value_3_0= ruleBasicVar ) ) )
            {
            // InternalMyDbl.g:1437:3: ( (lv_elementLeft_0_0= ruleAttributeOfElement ) )
            // InternalMyDbl.g:1438:4: (lv_elementLeft_0_0= ruleAttributeOfElement )
            {
            // InternalMyDbl.g:1438:4: (lv_elementLeft_0_0= ruleAttributeOfElement )
            // InternalMyDbl.g:1439:5: lv_elementLeft_0_0= ruleAttributeOfElement
            {

            					newCompositeNode(grammarAccess.getJointConditionUnitAccess().getElementLeftAttributeOfElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_elementLeft_0_0=ruleAttributeOfElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointConditionUnitRule());
            					}
            					set(
            						current,
            						"elementLeft",
            						lv_elementLeft_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.AttributeOfElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:1456:3: ( (lv_judgement_1_0= ruleJudgement ) )
            // InternalMyDbl.g:1457:4: (lv_judgement_1_0= ruleJudgement )
            {
            // InternalMyDbl.g:1457:4: (lv_judgement_1_0= ruleJudgement )
            // InternalMyDbl.g:1458:5: lv_judgement_1_0= ruleJudgement
            {

            					newCompositeNode(grammarAccess.getJointConditionUnitAccess().getJudgementJudgementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_judgement_1_0=ruleJudgement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointConditionUnitRule());
            					}
            					set(
            						current,
            						"judgement",
            						lv_judgement_1_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Judgement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDbl.g:1475:3: ( ( (lv_elementRight_2_0= ruleAttributeOfElement ) ) | ( (lv_value_3_0= ruleBasicVar ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_STRING)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDbl.g:1476:4: ( (lv_elementRight_2_0= ruleAttributeOfElement ) )
                    {
                    // InternalMyDbl.g:1476:4: ( (lv_elementRight_2_0= ruleAttributeOfElement ) )
                    // InternalMyDbl.g:1477:5: (lv_elementRight_2_0= ruleAttributeOfElement )
                    {
                    // InternalMyDbl.g:1477:5: (lv_elementRight_2_0= ruleAttributeOfElement )
                    // InternalMyDbl.g:1478:6: lv_elementRight_2_0= ruleAttributeOfElement
                    {

                    						newCompositeNode(grammarAccess.getJointConditionUnitAccess().getElementRightAttributeOfElementParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elementRight_2_0=ruleAttributeOfElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointConditionUnitRule());
                    						}
                    						set(
                    							current,
                    							"elementRight",
                    							lv_elementRight_2_0,
                    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.AttributeOfElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:1496:4: ( (lv_value_3_0= ruleBasicVar ) )
                    {
                    // InternalMyDbl.g:1496:4: ( (lv_value_3_0= ruleBasicVar ) )
                    // InternalMyDbl.g:1497:5: (lv_value_3_0= ruleBasicVar )
                    {
                    // InternalMyDbl.g:1497:5: (lv_value_3_0= ruleBasicVar )
                    // InternalMyDbl.g:1498:6: lv_value_3_0= ruleBasicVar
                    {

                    						newCompositeNode(grammarAccess.getJointConditionUnitAccess().getValueBasicVarParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleBasicVar();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointConditionUnitRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"uk.ac.kcl.shiro.mydbl0304.MyDbl.BasicVar");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJointConditionUnit"


    // $ANTLR start "entryRuleAttributeOfElement"
    // InternalMyDbl.g:1520:1: entryRuleAttributeOfElement returns [EObject current=null] : iv_ruleAttributeOfElement= ruleAttributeOfElement EOF ;
    public final EObject entryRuleAttributeOfElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeOfElement = null;


        try {
            // InternalMyDbl.g:1520:59: (iv_ruleAttributeOfElement= ruleAttributeOfElement EOF )
            // InternalMyDbl.g:1521:2: iv_ruleAttributeOfElement= ruleAttributeOfElement EOF
            {
             newCompositeNode(grammarAccess.getAttributeOfElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeOfElement=ruleAttributeOfElement();

            state._fsp--;

             current =iv_ruleAttributeOfElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeOfElement"


    // $ANTLR start "ruleAttributeOfElement"
    // InternalMyDbl.g:1527:1: ruleAttributeOfElement returns [EObject current=null] : ( ( (lv_element_0_0= ruleElement ) ) otherlv_1= '\\'s' ( (lv_attribute_2_0= ruleAttribute ) ) ) ;
    public final EObject ruleAttributeOfElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_element_0_0 = null;

        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:1533:2: ( ( ( (lv_element_0_0= ruleElement ) ) otherlv_1= '\\'s' ( (lv_attribute_2_0= ruleAttribute ) ) ) )
            // InternalMyDbl.g:1534:2: ( ( (lv_element_0_0= ruleElement ) ) otherlv_1= '\\'s' ( (lv_attribute_2_0= ruleAttribute ) ) )
            {
            // InternalMyDbl.g:1534:2: ( ( (lv_element_0_0= ruleElement ) ) otherlv_1= '\\'s' ( (lv_attribute_2_0= ruleAttribute ) ) )
            // InternalMyDbl.g:1535:3: ( (lv_element_0_0= ruleElement ) ) otherlv_1= '\\'s' ( (lv_attribute_2_0= ruleAttribute ) )
            {
            // InternalMyDbl.g:1535:3: ( (lv_element_0_0= ruleElement ) )
            // InternalMyDbl.g:1536:4: (lv_element_0_0= ruleElement )
            {
            // InternalMyDbl.g:1536:4: (lv_element_0_0= ruleElement )
            // InternalMyDbl.g:1537:5: lv_element_0_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getAttributeOfElementAccess().getElementElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_element_0_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeOfElementRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_0_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeOfElementAccess().getSKeyword_1());
            		
            // InternalMyDbl.g:1558:3: ( (lv_attribute_2_0= ruleAttribute ) )
            // InternalMyDbl.g:1559:4: (lv_attribute_2_0= ruleAttribute )
            {
            // InternalMyDbl.g:1559:4: (lv_attribute_2_0= ruleAttribute )
            // InternalMyDbl.g:1560:5: lv_attribute_2_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeOfElementAccess().getAttributeAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_attribute_2_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeOfElementRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeOfElement"


    // $ANTLR start "entryRuleJudgement"
    // InternalMyDbl.g:1581:1: entryRuleJudgement returns [String current=null] : iv_ruleJudgement= ruleJudgement EOF ;
    public final String entryRuleJudgement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJudgement = null;


        try {
            // InternalMyDbl.g:1581:49: (iv_ruleJudgement= ruleJudgement EOF )
            // InternalMyDbl.g:1582:2: iv_ruleJudgement= ruleJudgement EOF
            {
             newCompositeNode(grammarAccess.getJudgementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJudgement=ruleJudgement();

            state._fsp--;

             current =iv_ruleJudgement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJudgement"


    // $ANTLR start "ruleJudgement"
    // InternalMyDbl.g:1588:1: ruleJudgement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'is' | kw= 'as' | kw= 'equals' | (kw= 'is' kw= 'not' ) | (kw= 'not' kw= 'equals' ) | (kw= 'is' kw= 'larger' kw= 'than' ) | (kw= 'is' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'larger' kw= 'than' ) ) ;
    public final AntlrDatatypeRuleToken ruleJudgement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDbl.g:1594:2: ( (kw= 'is' | kw= 'as' | kw= 'equals' | (kw= 'is' kw= 'not' ) | (kw= 'not' kw= 'equals' ) | (kw= 'is' kw= 'larger' kw= 'than' ) | (kw= 'is' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'larger' kw= 'than' ) ) )
            // InternalMyDbl.g:1595:2: (kw= 'is' | kw= 'as' | kw= 'equals' | (kw= 'is' kw= 'not' ) | (kw= 'not' kw= 'equals' ) | (kw= 'is' kw= 'larger' kw= 'than' ) | (kw= 'is' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'larger' kw= 'than' ) )
            {
            // InternalMyDbl.g:1595:2: (kw= 'is' | kw= 'as' | kw= 'equals' | (kw= 'is' kw= 'not' ) | (kw= 'not' kw= 'equals' ) | (kw= 'is' kw= 'larger' kw= 'than' ) | (kw= 'is' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'larger' kw= 'than' ) )
            int alt15=9;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalMyDbl.g:1596:3: kw= 'is'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJudgementAccess().getIsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDbl.g:1602:3: kw= 'as'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJudgementAccess().getAsKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDbl.g:1608:3: kw= 'equals'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getJudgementAccess().getEqualsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDbl.g:1614:3: (kw= 'is' kw= 'not' )
                    {
                    // InternalMyDbl.g:1614:3: (kw= 'is' kw= 'not' )
                    // InternalMyDbl.g:1615:4: kw= 'is' kw= 'not'
                    {
                    kw=(Token)match(input,23,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getIsKeyword_3_0());
                    			
                    kw=(Token)match(input,49,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getNotKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDbl.g:1627:3: (kw= 'not' kw= 'equals' )
                    {
                    // InternalMyDbl.g:1627:3: (kw= 'not' kw= 'equals' )
                    // InternalMyDbl.g:1628:4: kw= 'not' kw= 'equals'
                    {
                    kw=(Token)match(input,49,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getNotKeyword_4_0());
                    			
                    kw=(Token)match(input,48,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getEqualsKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDbl.g:1640:3: (kw= 'is' kw= 'larger' kw= 'than' )
                    {
                    // InternalMyDbl.g:1640:3: (kw= 'is' kw= 'larger' kw= 'than' )
                    // InternalMyDbl.g:1641:4: kw= 'is' kw= 'larger' kw= 'than'
                    {
                    kw=(Token)match(input,23,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getIsKeyword_5_0());
                    			
                    kw=(Token)match(input,50,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getLargerKeyword_5_1());
                    			
                    kw=(Token)match(input,51,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getThanKeyword_5_2());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDbl.g:1658:3: (kw= 'is' kw= 'less' kw= 'than' )
                    {
                    // InternalMyDbl.g:1658:3: (kw= 'is' kw= 'less' kw= 'than' )
                    // InternalMyDbl.g:1659:4: kw= 'is' kw= 'less' kw= 'than'
                    {
                    kw=(Token)match(input,23,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getIsKeyword_6_0());
                    			
                    kw=(Token)match(input,52,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getLessKeyword_6_1());
                    			
                    kw=(Token)match(input,51,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getThanKeyword_6_2());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDbl.g:1676:3: (kw= 'no' kw= 'less' kw= 'than' )
                    {
                    // InternalMyDbl.g:1676:3: (kw= 'no' kw= 'less' kw= 'than' )
                    // InternalMyDbl.g:1677:4: kw= 'no' kw= 'less' kw= 'than'
                    {
                    kw=(Token)match(input,53,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getNoKeyword_7_0());
                    			
                    kw=(Token)match(input,52,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getLessKeyword_7_1());
                    			
                    kw=(Token)match(input,51,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getThanKeyword_7_2());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDbl.g:1694:3: (kw= 'no' kw= 'larger' kw= 'than' )
                    {
                    // InternalMyDbl.g:1694:3: (kw= 'no' kw= 'larger' kw= 'than' )
                    // InternalMyDbl.g:1695:4: kw= 'no' kw= 'larger' kw= 'than'
                    {
                    kw=(Token)match(input,53,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getNoKeyword_8_0());
                    			
                    kw=(Token)match(input,50,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getLargerKeyword_8_1());
                    			
                    kw=(Token)match(input,51,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getJudgementAccess().getThanKeyword_8_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJudgement"


    // $ANTLR start "entryRuleDeleteInstruction"
    // InternalMyDbl.g:1715:1: entryRuleDeleteInstruction returns [EObject current=null] : iv_ruleDeleteInstruction= ruleDeleteInstruction EOF ;
    public final EObject entryRuleDeleteInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteInstruction = null;


        try {
            // InternalMyDbl.g:1715:58: (iv_ruleDeleteInstruction= ruleDeleteInstruction EOF )
            // InternalMyDbl.g:1716:2: iv_ruleDeleteInstruction= ruleDeleteInstruction EOF
            {
             newCompositeNode(grammarAccess.getDeleteInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteInstruction=ruleDeleteInstruction();

            state._fsp--;

             current =iv_ruleDeleteInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteInstruction"


    // $ANTLR start "ruleDeleteInstruction"
    // InternalMyDbl.g:1722:1: ruleDeleteInstruction returns [EObject current=null] : (otherlv_0= 'remove' otherlv_1= 'the' ( (lv_element_2_0= ruleElement ) ) otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) ) ;
    public final EObject ruleDeleteInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_element_2_0 = null;

        EObject lv_conditions_5_0 = null;



        	enterRule();

        try {
            // InternalMyDbl.g:1728:2: ( (otherlv_0= 'remove' otherlv_1= 'the' ( (lv_element_2_0= ruleElement ) ) otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) ) )
            // InternalMyDbl.g:1729:2: (otherlv_0= 'remove' otherlv_1= 'the' ( (lv_element_2_0= ruleElement ) ) otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) )
            {
            // InternalMyDbl.g:1729:2: (otherlv_0= 'remove' otherlv_1= 'the' ( (lv_element_2_0= ruleElement ) ) otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) ) )
            // InternalMyDbl.g:1730:3: otherlv_0= 'remove' otherlv_1= 'the' ( (lv_element_2_0= ruleElement ) ) otherlv_3= ',' otherlv_4= 'whose' ( (lv_conditions_5_0= ruleSingleCondition ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteInstructionAccess().getRemoveKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteInstructionAccess().getTheKeyword_1());
            		
            // InternalMyDbl.g:1738:3: ( (lv_element_2_0= ruleElement ) )
            // InternalMyDbl.g:1739:4: (lv_element_2_0= ruleElement )
            {
            // InternalMyDbl.g:1739:4: (lv_element_2_0= ruleElement )
            // InternalMyDbl.g:1740:5: lv_element_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getDeleteInstructionAccess().getElementElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_element_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteInstructionRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_2_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteInstructionAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteInstructionAccess().getWhoseKeyword_4());
            		
            // InternalMyDbl.g:1765:3: ( (lv_conditions_5_0= ruleSingleCondition ) )
            // InternalMyDbl.g:1766:4: (lv_conditions_5_0= ruleSingleCondition )
            {
            // InternalMyDbl.g:1766:4: (lv_conditions_5_0= ruleSingleCondition )
            // InternalMyDbl.g:1767:5: lv_conditions_5_0= ruleSingleCondition
            {

            					newCompositeNode(grammarAccess.getDeleteInstructionAccess().getConditionsSingleConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_conditions_5_0=ruleSingleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteInstructionRule());
            					}
            					set(
            						current,
            						"conditions",
            						lv_conditions_5_0,
            						"uk.ac.kcl.shiro.mydbl0304.MyDbl.SingleCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteInstruction"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\7\12\uffff";
    static final String dfa_3s = "\1\27\1\4\3\uffff\1\62\6\uffff";
    static final String dfa_4s = "\1\65\1\64\3\uffff\1\64\6\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\5\1\uffff\1\4\1\1\1\7\1\6\1\11\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\27\uffff\1\2\1\3\1\4\3\uffff\1\5",
            "\3\7\52\uffff\1\6\1\11\1\uffff\1\10",
            "",
            "",
            "",
            "\1\12\1\uffff\1\13",
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

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1595:2: (kw= 'is' | kw= 'as' | kw= 'equals' | (kw= 'is' kw= 'not' ) | (kw= 'not' kw= 'equals' ) | (kw= 'is' kw= 'larger' kw= 'than' ) | (kw= 'is' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'less' kw= 'than' ) | (kw= 'no' kw= 'larger' kw= 'than' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0040050000010812L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000FFFF000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0023800000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});

}