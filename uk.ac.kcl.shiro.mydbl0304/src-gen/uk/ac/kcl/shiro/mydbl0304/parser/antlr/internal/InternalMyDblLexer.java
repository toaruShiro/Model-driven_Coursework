package uk.ac.kcl.shiro.mydbl0304.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDblLexer extends Lexer {
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

    public InternalMyDblLexer() {;} 
    public InternalMyDblLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDblLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDbl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:11:7: ( 'create' )
            // InternalMyDbl.g:11:9: 'create'
            {
            match("create"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:12:7: ( 'database' )
            // InternalMyDbl.g:12:9: 'database'
            {
            match("database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:13:7: ( 'named' )
            // InternalMyDbl.g:13:9: 'named'
            {
            match("named"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:14:7: ( 'a' )
            // InternalMyDbl.g:14:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:15:7: ( 'table' )
            // InternalMyDbl.g:15:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:16:7: ( ',' )
            // InternalMyDbl.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:17:7: ( 'which' )
            // InternalMyDbl.g:17:9: 'which'
            {
            match("which"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:18:7: ( 'saves' )
            // InternalMyDbl.g:18:9: 'saves'
            {
            match("saves"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:19:7: ( 'data' )
            // InternalMyDbl.g:19:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:20:7: ( 'of' )
            // InternalMyDbl.g:20:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:21:7: ( 'has' )
            // InternalMyDbl.g:21:9: 'has'
            {
            match("has"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:22:7: ( 'attribute' )
            // InternalMyDbl.g:22:9: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:23:7: ( 'is' )
            // InternalMyDbl.g:23:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:24:7: ( 'Binary' )
            // InternalMyDbl.g:24:9: 'Binary'
            {
            match("Binary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:25:7: ( 'Varbinary' )
            // InternalMyDbl.g:25:9: 'Varbinary'
            {
            match("Varbinary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:26:7: ( 'Image' )
            // InternalMyDbl.g:26:9: 'Image'
            {
            match("Image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:27:7: ( 'Char' )
            // InternalMyDbl.g:27:9: 'Char'
            {
            match("Char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:28:7: ( 'Varchar' )
            // InternalMyDbl.g:28:9: 'Varchar'
            {
            match("Varchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:29:7: ( 'Text' )
            // InternalMyDbl.g:29:9: 'Text'
            {
            match("Text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:30:7: ( 'Nchar' )
            // InternalMyDbl.g:30:9: 'Nchar'
            {
            match("Nchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:31:7: ( 'Nvarchar' )
            // InternalMyDbl.g:31:9: 'Nvarchar'
            {
            match("Nvarchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:32:7: ( 'Ntext' )
            // InternalMyDbl.g:32:9: 'Ntext'
            {
            match("Ntext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:33:7: ( 'Datetime' )
            // InternalMyDbl.g:33:9: 'Datetime'
            {
            match("Datetime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:34:7: ( 'Smalldatetime' )
            // InternalMyDbl.g:34:9: 'Smalldatetime'
            {
            match("Smalldatetime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:35:7: ( 'Date' )
            // InternalMyDbl.g:35:9: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:36:7: ( 'TimeStamp' )
            // InternalMyDbl.g:36:9: 'TimeStamp'
            {
            match("TimeStamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:37:7: ( 'Integer' )
            // InternalMyDbl.g:37:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:38:7: ( 'Double' )
            // InternalMyDbl.g:38:9: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:39:7: ( 'Float' )
            // InternalMyDbl.g:39:9: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:40:7: ( 'add' )
            // InternalMyDbl.g:40:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:41:7: ( 'with' )
            // InternalMyDbl.g:41:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:42:7: ( 'find' )
            // InternalMyDbl.g:42:9: 'find'
            {
            match("find"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:43:7: ( 'the' )
            // InternalMyDbl.g:43:9: 'the'
            {
            match("the"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:44:7: ( 'whose' )
            // InternalMyDbl.g:44:9: 'whose'
            {
            match("whose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:45:7: ( 'in' )
            // InternalMyDbl.g:45:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:46:7: ( '\\'s' )
            // InternalMyDbl.g:46:9: '\\'s'
            {
            match("'s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:47:7: ( 'as' )
            // InternalMyDbl.g:47:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:48:7: ( 'equals' )
            // InternalMyDbl.g:48:9: 'equals'
            {
            match("equals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:49:7: ( 'not' )
            // InternalMyDbl.g:49:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:50:7: ( 'larger' )
            // InternalMyDbl.g:50:9: 'larger'
            {
            match("larger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:51:7: ( 'than' )
            // InternalMyDbl.g:51:9: 'than'
            {
            match("than"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:52:7: ( 'less' )
            // InternalMyDbl.g:52:9: 'less'
            {
            match("less"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:53:7: ( 'no' )
            // InternalMyDbl.g:53:9: 'no'
            {
            match("no"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:54:7: ( 'remove' )
            // InternalMyDbl.g:54:9: 'remove'
            {
            match("remove"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:1787:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalMyDbl.g:1787:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalMyDbl.g:1787:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDbl.g:1787:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDbl.g:1787:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:1789:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDbl.g:1789:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDbl.g:1789:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDbl.g:1789:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDbl.g:1789:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDbl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:1791:10: ( ( '0' .. '9' )+ )
            // InternalMyDbl.g:1791:12: ( '0' .. '9' )+
            {
            // InternalMyDbl.g:1791:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDbl.g:1791:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:1793:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDbl.g:1793:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDbl.g:1793:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDbl.g:1793:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:1795:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDbl.g:1795:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDbl.g:1795:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDbl.g:1795:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMyDbl.g:1795:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDbl.g:1795:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDbl.g:1795:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDbl.g:1795:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:1797:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDbl.g:1797:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDbl.g:1797:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDbl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDbl.g:1799:16: ( . )
            // InternalMyDbl.g:1799:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDbl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=51;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalMyDbl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalMyDbl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalMyDbl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalMyDbl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalMyDbl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalMyDbl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalMyDbl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalMyDbl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalMyDbl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalMyDbl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalMyDbl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalMyDbl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalMyDbl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalMyDbl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalMyDbl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalMyDbl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalMyDbl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalMyDbl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalMyDbl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalMyDbl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalMyDbl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalMyDbl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalMyDbl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalMyDbl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalMyDbl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalMyDbl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalMyDbl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalMyDbl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalMyDbl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalMyDbl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalMyDbl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalMyDbl.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalMyDbl.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalMyDbl.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalMyDbl.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalMyDbl.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalMyDbl.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalMyDbl.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalMyDbl.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalMyDbl.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalMyDbl.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalMyDbl.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalMyDbl.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalMyDbl.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalMyDbl.g:1:274: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 46 :
                // InternalMyDbl.g:1:286: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 47 :
                // InternalMyDbl.g:1:294: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 48 :
                // InternalMyDbl.g:1:303: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 49 :
                // InternalMyDbl.g:1:319: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 50 :
                // InternalMyDbl.g:1:335: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 51 :
                // InternalMyDbl.g:1:343: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\3\42\1\51\1\42\1\uffff\17\42\1\40\3\42\2\40\2\uffff\1\40\2\uffff\1\42\1\uffff\2\42\1\121\2\42\1\124\1\uffff\2\42\1\uffff\3\42\1\134\1\42\1\136\1\137\17\42\1\uffff\4\42\5\uffff\3\42\1\166\1\uffff\1\42\1\170\1\uffff\1\42\1\172\5\42\1\uffff\1\u0080\2\uffff\24\42\1\u0097\1\42\1\uffff\1\42\1\uffff\1\42\1\uffff\1\u009b\2\42\1\u009e\1\42\1\uffff\5\42\1\u00a5\1\u00a6\4\42\1\u00ac\3\42\1\u00b0\2\42\1\u00b3\3\42\1\uffff\1\u00b7\1\42\1\u00b9\1\uffff\1\u00ba\1\u00bb\1\uffff\1\u00bc\3\42\1\u00c0\1\42\2\uffff\1\42\1\u00c3\1\42\1\u00c5\1\42\1\uffff\2\42\1\u00c9\1\uffff\2\42\1\uffff\1\42\1\u00cd\1\42\1\uffff\1\42\4\uffff\1\u00d0\2\42\1\uffff\2\42\1\uffff\1\42\1\uffff\1\42\1\u00d7\1\42\1\uffff\1\u00d9\1\u00da\1\u00db\1\uffff\2\42\1\uffff\1\42\1\u00df\1\u00e0\3\42\1\uffff\1\42\3\uffff\1\u00e5\2\42\2\uffff\1\42\1\u00e9\1\u00ea\1\42\1\uffff\1\u00ec\1\u00ed\1\u00ee\2\uffff\1\42\3\uffff\3\42\1\u00f3\1\uffff";
    static final String DFA10_eofS =
        "\u00f4\uffff";
    static final String DFA10_minS =
        "\1\0\1\162\2\141\1\60\1\141\1\uffff\1\150\1\141\1\146\1\141\1\156\1\151\1\141\1\155\1\150\1\145\1\143\1\141\1\155\1\154\1\151\1\163\1\161\1\141\1\145\1\0\1\101\2\uffff\1\52\2\uffff\1\145\1\uffff\1\164\1\155\1\60\1\164\1\144\1\60\1\uffff\1\142\1\141\1\uffff\1\151\1\164\1\166\1\60\1\163\2\60\1\156\1\162\1\141\1\164\1\141\1\170\1\155\1\150\1\141\1\145\1\164\1\165\1\141\1\157\1\156\1\uffff\1\165\1\162\1\163\1\155\5\uffff\2\141\1\145\1\60\1\uffff\1\162\1\60\1\uffff\1\154\1\60\1\156\1\143\1\163\1\150\1\145\1\uffff\1\60\2\uffff\1\141\1\142\1\147\1\145\1\162\1\164\1\145\1\141\1\162\1\170\1\145\1\142\1\154\1\141\1\144\1\141\1\147\1\163\1\157\1\164\1\60\1\144\1\uffff\1\151\1\uffff\1\145\1\uffff\1\60\1\150\1\145\1\60\1\163\1\uffff\1\162\1\151\1\150\1\145\1\147\2\60\1\123\1\162\1\143\1\164\1\60\2\154\1\164\1\60\1\154\1\145\1\60\1\166\1\145\1\141\1\uffff\1\60\1\142\1\60\1\uffff\2\60\1\uffff\1\60\1\171\1\156\1\141\1\60\1\145\2\uffff\1\164\1\60\1\150\1\60\1\151\1\uffff\1\145\1\144\1\60\1\uffff\1\163\1\162\1\uffff\1\145\1\60\1\163\1\uffff\1\165\4\uffff\1\60\1\141\1\162\1\uffff\1\162\1\141\1\uffff\1\141\1\uffff\1\155\1\60\1\141\1\uffff\3\60\1\uffff\1\145\1\164\1\uffff\1\162\2\60\1\155\1\162\1\145\1\uffff\1\164\3\uffff\1\60\1\145\1\171\2\uffff\1\160\2\60\1\145\1\uffff\3\60\2\uffff\1\164\3\uffff\1\151\1\155\1\145\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\162\1\141\1\157\1\172\1\150\1\uffff\1\151\1\141\1\146\1\141\1\163\1\151\1\141\1\156\1\150\1\151\1\166\1\157\1\155\1\154\1\151\1\163\1\161\2\145\1\uffff\1\172\2\uffff\1\57\2\uffff\1\145\1\uffff\1\164\1\155\1\172\1\164\1\144\1\172\1\uffff\1\142\1\145\1\uffff\1\157\1\164\1\166\1\172\1\163\2\172\1\156\1\162\1\141\1\164\1\141\1\170\1\155\1\150\1\141\1\145\1\164\1\165\1\141\1\157\1\156\1\uffff\1\165\1\162\1\163\1\155\5\uffff\2\141\1\145\1\172\1\uffff\1\162\1\172\1\uffff\1\154\1\172\1\156\1\143\1\163\1\150\1\145\1\uffff\1\172\2\uffff\1\141\1\143\1\147\1\145\1\162\1\164\1\145\1\141\1\162\1\170\1\145\1\142\1\154\1\141\1\144\1\141\1\147\1\163\1\157\1\164\1\172\1\144\1\uffff\1\151\1\uffff\1\145\1\uffff\1\172\1\150\1\145\1\172\1\163\1\uffff\1\162\1\151\1\150\1\145\1\147\2\172\1\123\1\162\1\143\1\164\1\172\2\154\1\164\1\172\1\154\1\145\1\172\1\166\1\145\1\141\1\uffff\1\172\1\142\1\172\1\uffff\2\172\1\uffff\1\172\1\171\1\156\1\141\1\172\1\145\2\uffff\1\164\1\172\1\150\1\172\1\151\1\uffff\1\145\1\144\1\172\1\uffff\1\163\1\162\1\uffff\1\145\1\172\1\163\1\uffff\1\165\4\uffff\1\172\1\141\1\162\1\uffff\1\162\1\141\1\uffff\1\141\1\uffff\1\155\1\172\1\141\1\uffff\3\172\1\uffff\1\145\1\164\1\uffff\1\162\2\172\1\155\1\162\1\145\1\uffff\1\164\3\uffff\1\172\1\145\1\171\2\uffff\1\160\2\172\1\145\1\uffff\3\172\2\uffff\1\164\3\uffff\1\151\1\155\1\145\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\6\uffff\1\6\25\uffff\1\56\1\57\1\uffff\1\62\1\63\1\uffff\1\56\6\uffff\1\4\2\uffff\1\6\26\uffff\1\44\4\uffff\1\55\1\57\1\60\1\61\1\62\4\uffff\1\53\2\uffff\1\45\7\uffff\1\12\1\uffff\1\15\1\43\26\uffff\1\47\1\uffff\1\36\1\uffff\1\41\5\uffff\1\13\26\uffff\1\11\3\uffff\1\51\2\uffff\1\37\6\uffff\1\21\1\23\5\uffff\1\31\3\uffff\1\40\2\uffff\1\52\3\uffff\1\3\1\uffff\1\5\1\7\1\42\1\10\3\uffff\1\20\2\uffff\1\24\1\uffff\1\26\3\uffff\1\35\3\uffff\1\1\2\uffff\1\16\6\uffff\1\34\1\uffff\1\46\1\50\1\54\3\uffff\1\22\1\33\4\uffff\1\2\3\uffff\1\25\1\27\1\uffff\1\14\1\17\1\32\4\uffff\1\30";
    static final String DFA10_specialS =
        "\1\1\31\uffff\1\0\u00d9\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\32\4\40\1\26\4\40\1\6\2\40\1\36\12\35\7\40\1\34\1\14\1\17\1\22\1\34\1\24\2\34\1\16\4\34\1\21\4\34\1\23\1\20\1\34\1\15\4\34\3\40\1\33\1\34\1\40\1\4\1\34\1\1\1\2\1\27\1\25\1\34\1\12\1\13\2\34\1\30\1\34\1\3\1\11\2\34\1\31\1\10\1\5\2\34\1\7\3\34\uff85\40",
            "\1\41",
            "\1\43",
            "\1\44\15\uffff\1\45",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\47\16\42\1\50\1\46\6\42",
            "\1\52\6\uffff\1\53",
            "",
            "\1\55\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\63\4\uffff\1\62",
            "\1\64",
            "\1\65",
            "\1\66\1\67",
            "\1\70",
            "\1\71\3\uffff\1\72",
            "\1\73\20\uffff\1\75\1\uffff\1\74",
            "\1\76\15\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105\3\uffff\1\106",
            "\1\107",
            "\0\110",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\112\4\uffff\1\113",
            "",
            "",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\120\6\42",
            "\1\122",
            "\1\123",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\125",
            "\1\127\3\uffff\1\126",
            "",
            "\1\130\5\uffff\1\131",
            "\1\132",
            "\1\133",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\135",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\167",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\171",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u0081",
            "\1\u0082\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\42\1\u0096\30\42",
            "\1\u0098",
            "",
            "\1\u0099",
            "",
            "\1\u009a",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009c",
            "\1\u009d",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\23\42\1\u00ab\6\42",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00b1",
            "\1\u00b2",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00b8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c1",
            "",
            "",
            "\1\u00c2",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c4",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00d8",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "",
            "\1\u00e8",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00eb",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\u00ef",
            "",
            "",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_26 = input.LA(1);

                        s = -1;
                        if ( ((LA10_26>='\u0000' && LA10_26<='\uFFFF')) ) {s = 72;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='c') ) {s = 1;}

                        else if ( (LA10_0=='d') ) {s = 2;}

                        else if ( (LA10_0=='n') ) {s = 3;}

                        else if ( (LA10_0=='a') ) {s = 4;}

                        else if ( (LA10_0=='t') ) {s = 5;}

                        else if ( (LA10_0==',') ) {s = 6;}

                        else if ( (LA10_0=='w') ) {s = 7;}

                        else if ( (LA10_0=='s') ) {s = 8;}

                        else if ( (LA10_0=='o') ) {s = 9;}

                        else if ( (LA10_0=='h') ) {s = 10;}

                        else if ( (LA10_0=='i') ) {s = 11;}

                        else if ( (LA10_0=='B') ) {s = 12;}

                        else if ( (LA10_0=='V') ) {s = 13;}

                        else if ( (LA10_0=='I') ) {s = 14;}

                        else if ( (LA10_0=='C') ) {s = 15;}

                        else if ( (LA10_0=='T') ) {s = 16;}

                        else if ( (LA10_0=='N') ) {s = 17;}

                        else if ( (LA10_0=='D') ) {s = 18;}

                        else if ( (LA10_0=='S') ) {s = 19;}

                        else if ( (LA10_0=='F') ) {s = 20;}

                        else if ( (LA10_0=='f') ) {s = 21;}

                        else if ( (LA10_0=='\'') ) {s = 22;}

                        else if ( (LA10_0=='e') ) {s = 23;}

                        else if ( (LA10_0=='l') ) {s = 24;}

                        else if ( (LA10_0=='r') ) {s = 25;}

                        else if ( (LA10_0=='\"') ) {s = 26;}

                        else if ( (LA10_0=='^') ) {s = 27;}

                        else if ( (LA10_0=='A'||LA10_0=='E'||(LA10_0>='G' && LA10_0<='H')||(LA10_0>='J' && LA10_0<='M')||(LA10_0>='O' && LA10_0<='R')||LA10_0=='U'||(LA10_0>='W' && LA10_0<='Z')||LA10_0=='_'||LA10_0=='b'||LA10_0=='g'||(LA10_0>='j' && LA10_0<='k')||LA10_0=='m'||(LA10_0>='p' && LA10_0<='q')||(LA10_0>='u' && LA10_0<='v')||(LA10_0>='x' && LA10_0<='z')) ) {s = 28;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 29;}

                        else if ( (LA10_0=='/') ) {s = 30;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 31;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='#' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='+')||(LA10_0>='-' && LA10_0<='.')||(LA10_0>=':' && LA10_0<='@')||(LA10_0>='[' && LA10_0<=']')||LA10_0=='`'||(LA10_0>='{' && LA10_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}