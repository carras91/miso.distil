package miso.distil.codeGenerator.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import miso.distil.codeGenerator.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Artifact'", "'['", "'extension '", "'.'", "'format '", "'services : '", "','", "']'", "'{'", "'}'", "'Entity'", "'many'", "'required'", "':'", "'Service'", "'input : '", "'output : '", "'when : '", "'MultiService'", "'parallel'", "'XMI'", "'BINARY'", "'TEXT'", "'XML'", "'JSON'", "'ATL'", "'ZIP'", "'upload'", "'download'", "'update'", "'read'", "'readAll'", "'search'", "'Boolean'", "'Double'", "'Integer'", "'String'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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


        public InternalRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesParser.tokenNames; }
    public String getGrammarFileName() { return "../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g"; }



     	private RulesGrammarAccess grammarAccess;
     	
        public InternalRulesParser(TokenStream input, RulesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	}
       	
       	@Override
       	protected RulesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoot"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:68:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:69:2: (iv_ruleRoot= ruleRoot EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:70:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot75);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot85); 

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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:77:1: ruleRoot returns [EObject current=null] : ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_artifacts_0_0 = null;

        EObject lv_artifacts_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_services_3_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:80:28: ( ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:1: ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:1: ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:2: ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )*
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:2: ( (lv_artifacts_0_0= ruleArtifact ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:82:1: (lv_artifacts_0_0= ruleArtifact )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:82:1: (lv_artifacts_0_0= ruleArtifact )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:83:3: lv_artifacts_0_0= ruleArtifact
            {
             
            	        newCompositeNode(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_ruleRoot131);
            lv_artifacts_0_0=ruleArtifact();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootRule());
            	        }
                   		add(
                   			current, 
                   			"artifacts",
                    		lv_artifacts_0_0, 
                    		"Artifact");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:99:2: ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 11:
                    {
                    alt1=1;
                    }
                    break;
                case 21:
                    {
                    alt1=2;
                    }
                    break;
                case 25:
                case 29:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:99:3: ( (lv_artifacts_1_0= ruleArtifact ) )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:99:3: ( (lv_artifacts_1_0= ruleArtifact ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:100:1: (lv_artifacts_1_0= ruleArtifact )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:100:1: (lv_artifacts_1_0= ruleArtifact )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:101:3: lv_artifacts_1_0= ruleArtifact
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_ruleRoot153);
            	    lv_artifacts_1_0=ruleArtifact();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"artifacts",
            	            		lv_artifacts_1_0, 
            	            		"Artifact");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:118:6: ( (lv_entities_2_0= ruleEntity ) )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:118:6: ( (lv_entities_2_0= ruleEntity ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:119:1: (lv_entities_2_0= ruleEntity )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:119:1: (lv_entities_2_0= ruleEntity )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:120:3: lv_entities_2_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getEntitiesEntityParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_ruleRoot180);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_2_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:137:6: ( (lv_services_3_0= ruleService ) )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:137:6: ( (lv_services_3_0= ruleService ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:138:1: (lv_services_3_0= ruleService )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:138:1: (lv_services_3_0= ruleService )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:139:3: lv_services_3_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getServicesServiceParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleService_in_ruleRoot207);
            	    lv_services_3_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_3_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleEString"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:163:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:164:2: (iv_ruleEString= ruleEString EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:165:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString246);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString257); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:172:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:175:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:176:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:176:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:176:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString297); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:184:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString323); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleService"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:201:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:202:2: (iv_ruleService= ruleService EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:203:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_entryRuleService370);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService380); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:210:1: ruleService returns [EObject current=null] : (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleService_0 = null;

        EObject this_MultiService_1 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:213:28: ( (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:214:1: (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:214:1: (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:215:5: this_SimpleService_0= ruleSimpleService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getSimpleServiceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_ruleService427);
                    this_SimpleService_0=ruleSimpleService();

                    state._fsp--;

                     
                            current = this_SimpleService_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:225:5: this_MultiService_1= ruleMultiService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getMultiServiceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_ruleService454);
                    this_MultiService_1=ruleMultiService();

                    state._fsp--;

                     
                            current = this_MultiService_1; 
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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleAttribute"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:241:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:242:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:243:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute489);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute499); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:250:1: ruleAttribute returns [EObject current=null] : (this_SimpleAttribute_0= ruleSimpleAttribute | this_MultiAttribute_1= ruleMultiAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAttribute_0 = null;

        EObject this_MultiAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:253:28: ( (this_SimpleAttribute_0= ruleSimpleAttribute | this_MultiAttribute_1= ruleMultiAttribute ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:254:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_MultiAttribute_1= ruleMultiAttribute )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:254:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_MultiAttribute_1= ruleMultiAttribute )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==24) ) {
                    int LA4_4 = input.LA(3);

                    if ( ((LA4_4>=44 && LA4_4<=47)) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==24) ) {
                    int LA4_4 = input.LA(3);

                    if ( ((LA4_4>=44 && LA4_4<=47)) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:255:5: this_SimpleAttribute_0= ruleSimpleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleAttribute_in_ruleAttribute546);
                    this_SimpleAttribute_0=ruleSimpleAttribute();

                    state._fsp--;

                     
                            current = this_SimpleAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:265:5: this_MultiAttribute_1= ruleMultiAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getMultiAttributeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiAttribute_in_ruleAttribute573);
                    this_MultiAttribute_1=ruleMultiAttribute();

                    state._fsp--;

                     
                            current = this_MultiAttribute_1; 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleArtifact"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:283:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:284:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:285:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_entryRuleArtifact610);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtifact620); 

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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:292:1: ruleArtifact returns [EObject current=null] : (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_extension_5_0 = null;

        Enumerator lv_format_7_0 = null;

        Enumerator lv_basicServices_9_0 = null;

        Enumerator lv_basicServices_11_0 = null;

        EObject lv_attributes_14_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:295:28: ( (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:296:1: (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:296:1: (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:296:3: otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleArtifact657); 

                	newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:300:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:301:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:301:1: (lv_name_1_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:302:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifact678);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArtifactRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:318:2: (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:318:4: otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']'
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArtifact691); 

                        	newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:322:1: (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==13) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:322:3: otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) )
                            {
                            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArtifact704); 

                                	newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getExtensionKeyword_2_1_0());
                                
                            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArtifact716); 

                                	newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getFullStopKeyword_2_1_1());
                                
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:330:1: ( (lv_extension_5_0= ruleEString ) )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:331:1: (lv_extension_5_0= ruleEString )
                            {
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:331:1: (lv_extension_5_0= ruleEString )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:332:3: lv_extension_5_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_2_1_2_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifact737);
                            lv_extension_5_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getArtifactRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"extension",
                                    		lv_extension_5_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:348:4: (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:348:6: otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) )
                            {
                            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArtifact752); 

                                	newLeafNode(otherlv_6, grammarAccess.getArtifactAccess().getFormatKeyword_2_2_0());
                                
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:352:1: ( (lv_format_7_0= ruleFormatEnum ) )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:353:1: (lv_format_7_0= ruleFormatEnum )
                            {
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:353:1: (lv_format_7_0= ruleFormatEnum )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:354:3: lv_format_7_0= ruleFormatEnum
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_2_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleFormatEnum_in_ruleArtifact773);
                            lv_format_7_0=ruleFormatEnum();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getArtifactRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"format",
                                    		lv_format_7_0, 
                                    		"FormatEnum");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:370:4: (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==16) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:370:6: otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )*
                            {
                            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleArtifact788); 

                                	newLeafNode(otherlv_8, grammarAccess.getArtifactAccess().getServicesKeyword_2_3_0());
                                
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:374:1: ( (lv_basicServices_9_0= ruleServiceEnum ) )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:375:1: (lv_basicServices_9_0= ruleServiceEnum )
                            {
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:375:1: (lv_basicServices_9_0= ruleServiceEnum )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:376:3: lv_basicServices_9_0= ruleServiceEnum
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleArtifact809);
                            lv_basicServices_9_0=ruleServiceEnum();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getArtifactRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"basicServices",
                                    		lv_basicServices_9_0, 
                                    		"ServiceEnum");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:392:2: (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==17) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:392:4: otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) )
                            	    {
                            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleArtifact822); 

                            	        	newLeafNode(otherlv_10, grammarAccess.getArtifactAccess().getCommaKeyword_2_3_2_0());
                            	        
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:396:1: ( (lv_basicServices_11_0= ruleServiceEnum ) )
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:397:1: (lv_basicServices_11_0= ruleServiceEnum )
                            	    {
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:397:1: (lv_basicServices_11_0= ruleServiceEnum )
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:398:3: lv_basicServices_11_0= ruleServiceEnum
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleArtifact843);
                            	    lv_basicServices_11_0=ruleServiceEnum();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getArtifactRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"basicServices",
                            	            		lv_basicServices_11_0, 
                            	            		"ServiceEnum");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArtifact859); 

                        	newLeafNode(otherlv_12, grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_2_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArtifact873); 

                	newLeafNode(otherlv_13, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:422:1: ( (lv_attributes_14_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||(LA10_0>=22 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:423:1: (lv_attributes_14_0= ruleAttribute )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:423:1: (lv_attributes_14_0= ruleAttribute )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:424:3: lv_attributes_14_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleArtifact894);
            	    lv_attributes_14_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArtifactRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_14_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArtifact907); 

                	newLeafNode(otherlv_15, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleEntity"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:452:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:453:2: (iv_ruleEntity= ruleEntity EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:454:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity943);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity953); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:461:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:464:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:465:1: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:465:1: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:465:3: otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEntity990); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:469:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:470:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:470:1: (lv_name_1_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:471:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntity1011);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEntity1023); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:491:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)||(LA11_0>=22 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:492:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:492:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:493:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleEntity1044);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEntity1057); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleSimpleAttribute"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:521:1: entryRuleSimpleAttribute returns [EObject current=null] : iv_ruleSimpleAttribute= ruleSimpleAttribute EOF ;
    public final EObject entryRuleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttribute = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:522:2: (iv_ruleSimpleAttribute= ruleSimpleAttribute EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:523:2: iv_ruleSimpleAttribute= ruleSimpleAttribute EOF
            {
             newCompositeNode(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute1093);
            iv_ruleSimpleAttribute=ruleSimpleAttribute();

            state._fsp--;

             current =iv_ruleSimpleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAttribute1103); 

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
    // $ANTLR end "entryRuleSimpleAttribute"


    // $ANTLR start "ruleSimpleAttribute"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:530:1: ruleSimpleAttribute returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) ) ) ;
    public final EObject ruleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_required_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_data_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:533:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:534:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:534:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:534:2: ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:534:2: ( (lv_many_0_0= 'many' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:535:1: (lv_many_0_0= 'many' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:535:1: (lv_many_0_0= 'many' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:536:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSimpleAttribute1146); 

                            newLeafNode(lv_many_0_0, grammarAccess.getSimpleAttributeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:549:3: ( (lv_required_1_0= 'required' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:550:1: (lv_required_1_0= 'required' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:550:1: (lv_required_1_0= 'required' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:551:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSimpleAttribute1178); 

                            newLeafNode(lv_required_1_0, grammarAccess.getSimpleAttributeAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:564:3: ( (lv_name_2_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:565:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:565:1: (lv_name_2_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:566:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSimpleAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleAttribute1213);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSimpleAttribute1225); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleAttributeAccess().getColonKeyword_3());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:586:1: ( (lv_data_4_0= ruleDataEnum ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:587:1: (lv_data_4_0= ruleDataEnum )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:587:1: (lv_data_4_0= ruleDataEnum )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:588:3: lv_data_4_0= ruleDataEnum
            {
             
            	        newCompositeNode(grammarAccess.getSimpleAttributeAccess().getDataDataEnumEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataEnum_in_ruleSimpleAttribute1246);
            lv_data_4_0=ruleDataEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"data",
                    		lv_data_4_0, 
                    		"DataEnum");
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
    // $ANTLR end "ruleSimpleAttribute"


    // $ANTLR start "entryRuleMultiAttribute"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:612:1: entryRuleMultiAttribute returns [EObject current=null] : iv_ruleMultiAttribute= ruleMultiAttribute EOF ;
    public final EObject entryRuleMultiAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiAttribute = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:613:2: (iv_ruleMultiAttribute= ruleMultiAttribute EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:614:2: iv_ruleMultiAttribute= ruleMultiAttribute EOF
            {
             newCompositeNode(grammarAccess.getMultiAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiAttribute_in_entryRuleMultiAttribute1282);
            iv_ruleMultiAttribute=ruleMultiAttribute();

            state._fsp--;

             current =iv_ruleMultiAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiAttribute1292); 

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
    // $ANTLR end "entryRuleMultiAttribute"


    // $ANTLR start "ruleMultiAttribute"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:621:1: ruleMultiAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleMultiAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:624:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:625:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:625:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:625:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:625:2: ( (lv_name_0_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:626:1: (lv_name_0_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:626:1: (lv_name_0_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:627:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiAttribute1338);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiAttribute1350); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiAttributeAccess().getColonKeyword_1());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:647:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:648:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:648:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:649:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMultiAttributeAccess().getTypeEntityCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiAttribute1373);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleMultiAttribute"


    // $ANTLR start "entryRuleOnService"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:670:1: entryRuleOnService returns [EObject current=null] : iv_ruleOnService= ruleOnService EOF ;
    public final EObject entryRuleOnService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnService = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:671:2: (iv_ruleOnService= ruleOnService EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:672:2: iv_ruleOnService= ruleOnService EOF
            {
             newCompositeNode(grammarAccess.getOnServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_entryRuleOnService1409);
            iv_ruleOnService=ruleOnService();

            state._fsp--;

             current =iv_ruleOnService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnService1419); 

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
    // $ANTLR end "entryRuleOnService"


    // $ANTLR start "ruleOnService"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:679:1: ruleOnService returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleOnService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_whenServices_2_0 = null;

        Enumerator lv_whenServices_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:682:28: ( ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:683:1: ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:683:1: ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:683:2: ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']'
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:683:2: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:684:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:684:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:685:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOnServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOnServiceAccess().getArtifactArtifactCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnService1467);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnService1479); 

                	newLeafNode(otherlv_1, grammarAccess.getOnServiceAccess().getLeftSquareBracketKeyword_1());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:702:1: ( (lv_whenServices_2_0= ruleServiceEnum ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:703:1: (lv_whenServices_2_0= ruleServiceEnum )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:703:1: (lv_whenServices_2_0= ruleServiceEnum )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:704:3: lv_whenServices_2_0= ruleServiceEnum
            {
             
            	        newCompositeNode(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleOnService1500);
            lv_whenServices_2_0=ruleServiceEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOnServiceRule());
            	        }
                   		add(
                   			current, 
                   			"whenServices",
                    		lv_whenServices_2_0, 
                    		"ServiceEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:720:2: (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:720:4: otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOnService1513); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOnServiceAccess().getCommaKeyword_3_0());
            	        
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:724:1: ( (lv_whenServices_4_0= ruleServiceEnum ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:725:1: (lv_whenServices_4_0= ruleServiceEnum )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:725:1: (lv_whenServices_4_0= ruleServiceEnum )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:726:3: lv_whenServices_4_0= ruleServiceEnum
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleOnService1534);
            	    lv_whenServices_4_0=ruleServiceEnum();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOnServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"whenServices",
            	            		lv_whenServices_4_0, 
            	            		"ServiceEnum");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOnService1548); 

                	newLeafNode(otherlv_5, grammarAccess.getOnServiceAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleOnService"


    // $ANTLR start "entryRuleSimpleService"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:754:1: entryRuleSimpleService returns [EObject current=null] : iv_ruleSimpleService= ruleSimpleService EOF ;
    public final EObject entryRuleSimpleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleService = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:755:2: (iv_ruleSimpleService= ruleSimpleService EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:756:2: iv_ruleSimpleService= ruleSimpleService EOF
            {
             newCompositeNode(grammarAccess.getSimpleServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_entryRuleSimpleService1584);
            iv_ruleSimpleService=ruleSimpleService();

            state._fsp--;

             current =iv_ruleSimpleService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleService1594); 

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
    // $ANTLR end "entryRuleSimpleService"


    // $ANTLR start "ruleSimpleService"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:763:1: ruleSimpleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}' ) ;
    public final EObject ruleSimpleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_when_12_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:766:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:767:1: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:767:1: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:767:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSimpleService1631); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleServiceAccess().getServiceKeyword_0());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:771:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:772:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:772:1: (lv_name_1_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:773:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1652);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleServiceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSimpleService1664); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:793:1: (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:793:3: otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSimpleService1677); 

                        	newLeafNode(otherlv_3, grammarAccess.getSimpleServiceAccess().getInputKeyword_3_0());
                        
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:797:1: ( ( ruleEString ) )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:798:1: ( ruleEString )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:798:1: ( ruleEString )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:799:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleServiceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1700);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:812:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:812:4: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleService1713); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSimpleServiceAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:816:1: ( ( ruleEString ) )
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:817:1: ( ruleEString )
                    	    {
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:817:1: ( ruleEString )
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:818:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSimpleServiceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1736);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:831:6: (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:831:8: otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSimpleService1753); 

                        	newLeafNode(otherlv_7, grammarAccess.getSimpleServiceAccess().getOutputKeyword_4_0());
                        
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:835:1: ( ( ruleEString ) )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:836:1: ( ruleEString )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:836:1: ( ruleEString )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:837:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleServiceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1776);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:850:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:850:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleService1789); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSimpleServiceAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:854:1: ( ( ruleEString ) )
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:855:1: ( ruleEString )
                    	    {
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:855:1: ( ruleEString )
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:856:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSimpleServiceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1812);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:869:6: (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:869:8: otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) )
            	    {
            	    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSimpleService1829); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSimpleServiceAccess().getWhenKeyword_5_0());
            	        
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:873:1: ( (lv_when_12_0= ruleOnService ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:874:1: (lv_when_12_0= ruleOnService )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:874:1: (lv_when_12_0= ruleOnService )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:875:3: lv_when_12_0= ruleOnService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOnService_in_ruleSimpleService1850);
            	    lv_when_12_0=ruleOnService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimpleServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"when",
            	            		lv_when_12_0, 
            	            		"OnService");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSimpleService1864); 

                	newLeafNode(otherlv_13, grammarAccess.getSimpleServiceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSimpleService"


    // $ANTLR start "entryRuleMultiService"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:903:1: entryRuleMultiService returns [EObject current=null] : iv_ruleMultiService= ruleMultiService EOF ;
    public final EObject entryRuleMultiService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiService = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:904:2: (iv_ruleMultiService= ruleMultiService EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:905:2: iv_ruleMultiService= ruleMultiService EOF
            {
             newCompositeNode(grammarAccess.getMultiServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_entryRuleMultiService1900);
            iv_ruleMultiService=ruleMultiService();

            state._fsp--;

             current =iv_ruleMultiService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiService1910); 

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
    // $ANTLR end "entryRuleMultiService"


    // $ANTLR start "ruleMultiService"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:912:1: ruleMultiService returns [EObject current=null] : (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' ) ;
    public final EObject ruleMultiService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_parallel_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_when_7_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:915:28: ( (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:916:1: (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:916:1: (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:916:3: otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMultiService1947); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiServiceAccess().getMultiServiceKeyword_0());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:920:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:921:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:921:1: (lv_name_1_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:922:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiServiceAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService1968);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiServiceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:938:2: (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:938:4: otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiService1981); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:942:1: ( (lv_parallel_3_0= 'parallel' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==30) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:943:1: (lv_parallel_3_0= 'parallel' )
                            {
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:943:1: (lv_parallel_3_0= 'parallel' )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:944:3: lv_parallel_3_0= 'parallel'
                            {
                            lv_parallel_3_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultiService1999); 

                                    newLeafNode(lv_parallel_3_0, grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultiServiceRule());
                            	        }
                                   		setWithLastConsumed(current, "parallel", true, "parallel");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultiService2025); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultiService2039); 

                	newLeafNode(otherlv_5, grammarAccess.getMultiServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:965:1: (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:965:3: otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultiService2052); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMultiServiceAccess().getWhenKeyword_4_0());
            	        
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:969:1: ( (lv_when_7_0= ruleOnService ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:970:1: (lv_when_7_0= ruleOnService )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:970:1: (lv_when_7_0= ruleOnService )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:971:3: lv_when_7_0= ruleOnService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiServiceAccess().getWhenOnServiceParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOnService_in_ruleMultiService2073);
            	    lv_when_7_0=ruleOnService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"when",
            	            		lv_when_7_0, 
            	            		"OnService");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiService2087); 

                	newLeafNode(otherlv_8, grammarAccess.getMultiServiceAccess().getServicesKeyword_5());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:991:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:992:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:992:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:993:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2110);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1006:2: (otherlv_10= ',' ( ( ruleEString ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1006:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiService2123); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultiServiceAccess().getCommaKeyword_7_0());
            	        
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1010:1: ( ( ruleEString ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1011:1: ( ruleEString )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1011:1: ( ruleEString )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1012:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultiServiceRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2146);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultiService2160); 

                	newLeafNode(otherlv_12, grammarAccess.getMultiServiceAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleMultiService"


    // $ANTLR start "ruleFormatEnum"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1037:1: ruleFormatEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) ) ;
    public final Enumerator ruleFormatEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1039:28: ( ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1040:1: ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1040:1: ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) )
            int alt24=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt24=1;
                }
                break;
            case 32:
                {
                alt24=2;
                }
                break;
            case 33:
                {
                alt24=3;
                }
                break;
            case 34:
                {
                alt24=4;
                }
                break;
            case 35:
                {
                alt24=5;
                }
                break;
            case 36:
                {
                alt24=6;
                }
                break;
            case 37:
                {
                alt24=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1040:2: (enumLiteral_0= 'XMI' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1040:2: (enumLiteral_0= 'XMI' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1040:4: enumLiteral_0= 'XMI'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFormatEnum2210); 

                            current = grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1046:6: (enumLiteral_1= 'BINARY' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1046:6: (enumLiteral_1= 'BINARY' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1046:8: enumLiteral_1= 'BINARY'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFormatEnum2227); 

                            current = grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1052:6: (enumLiteral_2= 'TEXT' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1052:6: (enumLiteral_2= 'TEXT' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1052:8: enumLiteral_2= 'TEXT'
                    {
                    enumLiteral_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFormatEnum2244); 

                            current = grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1058:6: (enumLiteral_3= 'XML' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1058:6: (enumLiteral_3= 'XML' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1058:8: enumLiteral_3= 'XML'
                    {
                    enumLiteral_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFormatEnum2261); 

                            current = grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1064:6: (enumLiteral_4= 'JSON' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1064:6: (enumLiteral_4= 'JSON' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1064:8: enumLiteral_4= 'JSON'
                    {
                    enumLiteral_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFormatEnum2278); 

                            current = grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1070:6: (enumLiteral_5= 'ATL' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1070:6: (enumLiteral_5= 'ATL' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1070:8: enumLiteral_5= 'ATL'
                    {
                    enumLiteral_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFormatEnum2295); 

                            current = grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1076:6: (enumLiteral_6= 'ZIP' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1076:6: (enumLiteral_6= 'ZIP' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1076:8: enumLiteral_6= 'ZIP'
                    {
                    enumLiteral_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFormatEnum2312); 

                            current = grammarAccess.getFormatEnumAccess().getZIPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getFormatEnumAccess().getZIPEnumLiteralDeclaration_6()); 
                        

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
    // $ANTLR end "ruleFormatEnum"


    // $ANTLR start "ruleServiceEnum"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1086:1: ruleServiceEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) ) ;
    public final Enumerator ruleServiceEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1088:28: ( ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1089:1: ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1089:1: ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt25=1;
                }
                break;
            case 39:
                {
                alt25=2;
                }
                break;
            case 40:
                {
                alt25=3;
                }
                break;
            case 41:
                {
                alt25=4;
                }
                break;
            case 42:
                {
                alt25=5;
                }
                break;
            case 43:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1089:2: (enumLiteral_0= 'upload' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1089:2: (enumLiteral_0= 'upload' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1089:4: enumLiteral_0= 'upload'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleServiceEnum2357); 

                            current = grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1095:6: (enumLiteral_1= 'download' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1095:6: (enumLiteral_1= 'download' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1095:8: enumLiteral_1= 'download'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleServiceEnum2374); 

                            current = grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1101:6: (enumLiteral_2= 'update' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1101:6: (enumLiteral_2= 'update' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1101:8: enumLiteral_2= 'update'
                    {
                    enumLiteral_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleServiceEnum2391); 

                            current = grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1107:6: (enumLiteral_3= 'read' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1107:6: (enumLiteral_3= 'read' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1107:8: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleServiceEnum2408); 

                            current = grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1113:6: (enumLiteral_4= 'readAll' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1113:6: (enumLiteral_4= 'readAll' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1113:8: enumLiteral_4= 'readAll'
                    {
                    enumLiteral_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleServiceEnum2425); 

                            current = grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1119:6: (enumLiteral_5= 'search' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1119:6: (enumLiteral_5= 'search' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1119:8: enumLiteral_5= 'search'
                    {
                    enumLiteral_5=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleServiceEnum2442); 

                            current = grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleServiceEnum"


    // $ANTLR start "ruleDataEnum"
    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1129:1: ruleDataEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator ruleDataEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1131:28: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1132:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1132:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt26=1;
                }
                break;
            case 45:
                {
                alt26=2;
                }
                break;
            case 46:
                {
                alt26=3;
                }
                break;
            case 47:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1132:2: (enumLiteral_0= 'Boolean' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1132:2: (enumLiteral_0= 'Boolean' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1132:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDataEnum2487); 

                            current = grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1138:6: (enumLiteral_1= 'Double' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1138:6: (enumLiteral_1= 'Double' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1138:8: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDataEnum2504); 

                            current = grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1144:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1144:6: (enumLiteral_2= 'Integer' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1144:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDataEnum2521); 

                            current = grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1150:6: (enumLiteral_3= 'String' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1150:6: (enumLiteral_3= 'String' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1150:8: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleDataEnum2538); 

                            current = grammarAccess.getDataEnumAccess().getStringEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataEnumAccess().getStringEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleDataEnum"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_ruleRoot131 = new BitSet(new long[]{0x0000000022200802L});
        public static final BitSet FOLLOW_ruleArtifact_in_ruleRoot153 = new BitSet(new long[]{0x0000000022200802L});
        public static final BitSet FOLLOW_ruleEntity_in_ruleRoot180 = new BitSet(new long[]{0x0000000022200802L});
        public static final BitSet FOLLOW_ruleService_in_ruleRoot207 = new BitSet(new long[]{0x0000000022200802L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_entryRuleService370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_ruleService427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_ruleService454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute489 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAttribute_in_ruleAttribute546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiAttribute_in_ruleAttribute573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtifact620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleArtifact657 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifact678 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_ruleArtifact691 = new BitSet(new long[]{0x000000000005A000L});
        public static final BitSet FOLLOW_13_in_ruleArtifact704 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleArtifact716 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifact737 = new BitSet(new long[]{0x0000000000058000L});
        public static final BitSet FOLLOW_15_in_ruleArtifact752 = new BitSet(new long[]{0x0000003F80000000L});
        public static final BitSet FOLLOW_ruleFormatEnum_in_ruleArtifact773 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleArtifact788 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleArtifact809 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleArtifact822 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleArtifact843 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleArtifact859 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleArtifact873 = new BitSet(new long[]{0x0000000000D00030L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleArtifact894 = new BitSet(new long[]{0x0000000000D00030L});
        public static final BitSet FOLLOW_20_in_ruleArtifact907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity943 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEntity990 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntity1011 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEntity1023 = new BitSet(new long[]{0x0000000000D00030L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity1044 = new BitSet(new long[]{0x0000000000D00030L});
        public static final BitSet FOLLOW_20_in_ruleEntity1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute1093 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute1103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleSimpleAttribute1146 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_23_in_ruleSimpleAttribute1178 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleAttribute1213 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSimpleAttribute1225 = new BitSet(new long[]{0x0000F00000000000L});
        public static final BitSet FOLLOW_ruleDataEnum_in_ruleSimpleAttribute1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiAttribute_in_entryRuleMultiAttribute1282 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiAttribute1292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiAttribute1338 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMultiAttribute1350 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiAttribute1373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_entryRuleOnService1409 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnService1419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnService1467 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnService1479 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleOnService1500 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleOnService1513 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleOnService1534 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleOnService1548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_entryRuleSimpleService1584 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleService1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleSimpleService1631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1652 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSimpleService1664 = new BitSet(new long[]{0x000000001C100000L});
        public static final BitSet FOLLOW_26_in_ruleSimpleService1677 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1700 = new BitSet(new long[]{0x0000000018120000L});
        public static final BitSet FOLLOW_17_in_ruleSimpleService1713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1736 = new BitSet(new long[]{0x0000000018120000L});
        public static final BitSet FOLLOW_27_in_ruleSimpleService1753 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1776 = new BitSet(new long[]{0x0000000010120000L});
        public static final BitSet FOLLOW_17_in_ruleSimpleService1789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1812 = new BitSet(new long[]{0x0000000010120000L});
        public static final BitSet FOLLOW_28_in_ruleSimpleService1829 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleOnService_in_ruleSimpleService1850 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_20_in_ruleSimpleService1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_entryRuleMultiService1900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiService1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleMultiService1947 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService1968 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_ruleMultiService1981 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_30_in_ruleMultiService1999 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMultiService2025 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMultiService2039 = new BitSet(new long[]{0x0000000010010000L});
        public static final BitSet FOLLOW_28_in_ruleMultiService2052 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleOnService_in_ruleMultiService2073 = new BitSet(new long[]{0x0000000010010000L});
        public static final BitSet FOLLOW_16_in_ruleMultiService2087 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2110 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMultiService2123 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2146 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleMultiService2160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleFormatEnum2210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFormatEnum2227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleFormatEnum2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleFormatEnum2261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleFormatEnum2278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleFormatEnum2295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleFormatEnum2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleServiceEnum2357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleServiceEnum2374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleServiceEnum2391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleServiceEnum2408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleServiceEnum2425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleServiceEnum2442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleDataEnum2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleDataEnum2504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleDataEnum2521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleDataEnum2538 = new BitSet(new long[]{0x0000000000000002L});
    }


}