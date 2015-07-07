package miso.carrascal.codeGenerator.parser.antlr.internal; 

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
import miso.carrascal.codeGenerator.services.RulesGrammarAccess;



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
    public String getGrammarFileName() { return "../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g"; }



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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:68:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:69:2: (iv_ruleRoot= ruleRoot EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:70:2: iv_ruleRoot= ruleRoot EOF
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:77:1: ruleRoot returns [EObject current=null] : ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_artifacts_0_0 = null;

        EObject lv_artifacts_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_services_3_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:80:28: ( ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:81:1: ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:81:1: ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:81:2: ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )*
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:81:2: ( (lv_artifacts_0_0= ruleArtifact ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:82:1: (lv_artifacts_0_0= ruleArtifact )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:82:1: (lv_artifacts_0_0= ruleArtifact )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:83:3: lv_artifacts_0_0= ruleArtifact
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

            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:99:2: ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )*
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
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:99:3: ( (lv_artifacts_1_0= ruleArtifact ) )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:99:3: ( (lv_artifacts_1_0= ruleArtifact ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:100:1: (lv_artifacts_1_0= ruleArtifact )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:100:1: (lv_artifacts_1_0= ruleArtifact )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:101:3: lv_artifacts_1_0= ruleArtifact
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
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:118:6: ( (lv_entities_2_0= ruleEntity ) )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:118:6: ( (lv_entities_2_0= ruleEntity ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:119:1: (lv_entities_2_0= ruleEntity )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:119:1: (lv_entities_2_0= ruleEntity )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:120:3: lv_entities_2_0= ruleEntity
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
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:137:6: ( (lv_services_3_0= ruleService ) )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:137:6: ( (lv_services_3_0= ruleService ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:138:1: (lv_services_3_0= ruleService )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:138:1: (lv_services_3_0= ruleService )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:139:3: lv_services_3_0= ruleService
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:163:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:164:2: (iv_ruleEString= ruleEString EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:165:2: iv_ruleEString= ruleEString EOF
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:172:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:175:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:176:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:176:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:176:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString297); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:184:10: this_ID_1= RULE_ID
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:201:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:202:2: (iv_ruleService= ruleService EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:203:2: iv_ruleService= ruleService EOF
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:210:1: ruleService returns [EObject current=null] : (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleService_0 = null;

        EObject this_MultiService_1 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:213:28: ( (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:214:1: (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:214:1: (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService )
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
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:215:5: this_SimpleService_0= ruleSimpleService
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
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:225:5: this_MultiService_1= ruleMultiService
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:241:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:242:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:243:2: iv_ruleAttribute= ruleAttribute EOF
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:250:1: ruleAttribute returns [EObject current=null] : (this_SimpleAttribute_0= ruleSimpleAttribute | this_MultiAttribute_1= ruleMultiAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAttribute_0 = null;

        EObject this_MultiAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:253:28: ( (this_SimpleAttribute_0= ruleSimpleAttribute | this_MultiAttribute_1= ruleMultiAttribute ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:254:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_MultiAttribute_1= ruleMultiAttribute )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:254:1: (this_SimpleAttribute_0= ruleSimpleAttribute | this_MultiAttribute_1= ruleMultiAttribute )
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

                    if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_4>=44 && LA4_4<=47)) ) {
                        alt4=1;
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

                    if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_4>=44 && LA4_4<=47)) ) {
                        alt4=1;
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
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:255:5: this_SimpleAttribute_0= ruleSimpleAttribute
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
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:265:5: this_MultiAttribute_1= ruleMultiAttribute
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:283:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:284:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:285:2: iv_ruleArtifact= ruleArtifact EOF
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:292:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '[' (otherlv_4= 'extension ' otherlv_5= '.' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'format ' ( (lv_format_8_0= ruleFormatEnum ) ) )? (otherlv_9= 'services : ' ( (lv_basicServices_10_0= ruleServiceEnum ) ) (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )* )? otherlv_13= ']' )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* otherlv_16= '}' ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_extension_6_0 = null;

        Enumerator lv_format_8_0 = null;

        Enumerator lv_basicServices_10_0 = null;

        Enumerator lv_basicServices_12_0 = null;

        EObject lv_attributes_15_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:295:28: ( ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '[' (otherlv_4= 'extension ' otherlv_5= '.' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'format ' ( (lv_format_8_0= ruleFormatEnum ) ) )? (otherlv_9= 'services : ' ( (lv_basicServices_10_0= ruleServiceEnum ) ) (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )* )? otherlv_13= ']' )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* otherlv_16= '}' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:296:1: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '[' (otherlv_4= 'extension ' otherlv_5= '.' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'format ' ( (lv_format_8_0= ruleFormatEnum ) ) )? (otherlv_9= 'services : ' ( (lv_basicServices_10_0= ruleServiceEnum ) ) (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )* )? otherlv_13= ']' )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* otherlv_16= '}' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:296:1: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '[' (otherlv_4= 'extension ' otherlv_5= '.' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'format ' ( (lv_format_8_0= ruleFormatEnum ) ) )? (otherlv_9= 'services : ' ( (lv_basicServices_10_0= ruleServiceEnum ) ) (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )* )? otherlv_13= ']' )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* otherlv_16= '}' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:296:2: () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '[' (otherlv_4= 'extension ' otherlv_5= '.' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'format ' ( (lv_format_8_0= ruleFormatEnum ) ) )? (otherlv_9= 'services : ' ( (lv_basicServices_10_0= ruleServiceEnum ) ) (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )* )? otherlv_13= ']' )? otherlv_14= '{' ( (lv_attributes_15_0= ruleAttribute ) )* otherlv_16= '}'
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:296:2: ()
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:297:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArtifactAccess().getArtifactAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleArtifact666); 

                	newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:306:1: ( (lv_name_2_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:307:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:307:1: (lv_name_2_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:308:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifact687);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArtifactRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:324:2: (otherlv_3= '[' (otherlv_4= 'extension ' otherlv_5= '.' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'format ' ( (lv_format_8_0= ruleFormatEnum ) ) )? (otherlv_9= 'services : ' ( (lv_basicServices_10_0= ruleServiceEnum ) ) (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )* )? otherlv_13= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:324:4: otherlv_3= '[' (otherlv_4= 'extension ' otherlv_5= '.' ( (lv_extension_6_0= ruleEString ) ) )? (otherlv_7= 'format ' ( (lv_format_8_0= ruleFormatEnum ) ) )? (otherlv_9= 'services : ' ( (lv_basicServices_10_0= ruleServiceEnum ) ) (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )* )? otherlv_13= ']'
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArtifact700); 

                        	newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:328:1: (otherlv_4= 'extension ' otherlv_5= '.' ( (lv_extension_6_0= ruleEString ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==13) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:328:3: otherlv_4= 'extension ' otherlv_5= '.' ( (lv_extension_6_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArtifact713); 

                                	newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getExtensionKeyword_3_1_0());
                                
                            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArtifact725); 

                                	newLeafNode(otherlv_5, grammarAccess.getArtifactAccess().getFullStopKeyword_3_1_1());
                                
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:336:1: ( (lv_extension_6_0= ruleEString ) )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:337:1: (lv_extension_6_0= ruleEString )
                            {
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:337:1: (lv_extension_6_0= ruleEString )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:338:3: lv_extension_6_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_3_1_2_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifact746);
                            lv_extension_6_0=ruleEString();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getArtifactRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"extension",
                                    		lv_extension_6_0, 
                                    		"EString");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:354:4: (otherlv_7= 'format ' ( (lv_format_8_0= ruleFormatEnum ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:354:6: otherlv_7= 'format ' ( (lv_format_8_0= ruleFormatEnum ) )
                            {
                            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArtifact761); 

                                	newLeafNode(otherlv_7, grammarAccess.getArtifactAccess().getFormatKeyword_3_2_0());
                                
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:358:1: ( (lv_format_8_0= ruleFormatEnum ) )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:359:1: (lv_format_8_0= ruleFormatEnum )
                            {
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:359:1: (lv_format_8_0= ruleFormatEnum )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:360:3: lv_format_8_0= ruleFormatEnum
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_3_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleFormatEnum_in_ruleArtifact782);
                            lv_format_8_0=ruleFormatEnum();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getArtifactRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"format",
                                    		lv_format_8_0, 
                                    		"FormatEnum");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:376:4: (otherlv_9= 'services : ' ( (lv_basicServices_10_0= ruleServiceEnum ) ) (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==16) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:376:6: otherlv_9= 'services : ' ( (lv_basicServices_10_0= ruleServiceEnum ) ) (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )*
                            {
                            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleArtifact797); 

                                	newLeafNode(otherlv_9, grammarAccess.getArtifactAccess().getServicesKeyword_3_3_0());
                                
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:380:1: ( (lv_basicServices_10_0= ruleServiceEnum ) )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:381:1: (lv_basicServices_10_0= ruleServiceEnum )
                            {
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:381:1: (lv_basicServices_10_0= ruleServiceEnum )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:382:3: lv_basicServices_10_0= ruleServiceEnum
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_3_3_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleArtifact818);
                            lv_basicServices_10_0=ruleServiceEnum();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getArtifactRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"basicServices",
                                    		lv_basicServices_10_0, 
                                    		"ServiceEnum");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:398:2: (otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==17) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:398:4: otherlv_11= ',' ( (lv_basicServices_12_0= ruleServiceEnum ) )
                            	    {
                            	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleArtifact831); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getArtifactAccess().getCommaKeyword_3_3_2_0());
                            	        
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:402:1: ( (lv_basicServices_12_0= ruleServiceEnum ) )
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:403:1: (lv_basicServices_12_0= ruleServiceEnum )
                            	    {
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:403:1: (lv_basicServices_12_0= ruleServiceEnum )
                            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:404:3: lv_basicServices_12_0= ruleServiceEnum
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_3_3_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleArtifact852);
                            	    lv_basicServices_12_0=ruleServiceEnum();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getArtifactRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"basicServices",
                            	            		lv_basicServices_12_0, 
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

                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArtifact868); 

                        	newLeafNode(otherlv_13, grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArtifact882); 

                	newLeafNode(otherlv_14, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_4());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:428:1: ( (lv_attributes_15_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||(LA10_0>=22 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:429:1: (lv_attributes_15_0= ruleAttribute )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:429:1: (lv_attributes_15_0= ruleAttribute )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:430:3: lv_attributes_15_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleArtifact903);
            	    lv_attributes_15_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArtifactRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_15_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArtifact916); 

                	newLeafNode(otherlv_16, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:458:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:459:2: (iv_ruleEntity= ruleEntity EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:460:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity952);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity962); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:467:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:470:28: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:471:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:471:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:471:2: () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= '}'
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:471:2: ()
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:472:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEntity1008); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:481:1: ( (lv_name_2_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:482:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:482:1: (lv_name_2_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:483:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntity1029);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEntity1041); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:503:1: ( (lv_attributes_4_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)||(LA11_0>=22 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:504:1: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:504:1: (lv_attributes_4_0= ruleAttribute )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:505:3: lv_attributes_4_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleEntity1062);
            	    lv_attributes_4_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_4_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEntity1075); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:533:1: entryRuleSimpleAttribute returns [EObject current=null] : iv_ruleSimpleAttribute= ruleSimpleAttribute EOF ;
    public final EObject entryRuleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAttribute = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:534:2: (iv_ruleSimpleAttribute= ruleSimpleAttribute EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:535:2: iv_ruleSimpleAttribute= ruleSimpleAttribute EOF
            {
             newCompositeNode(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute1111);
            iv_ruleSimpleAttribute=ruleSimpleAttribute();

            state._fsp--;

             current =iv_ruleSimpleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAttribute1121); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:542:1: ruleSimpleAttribute returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) ) ) ;
    public final EObject ruleSimpleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_required_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_data_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:545:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:546:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:546:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:546:2: ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_data_4_0= ruleDataEnum ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:546:2: ( (lv_many_0_0= 'many' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:547:1: (lv_many_0_0= 'many' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:547:1: (lv_many_0_0= 'many' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:548:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSimpleAttribute1164); 

                            newLeafNode(lv_many_0_0, grammarAccess.getSimpleAttributeAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:561:3: ( (lv_required_1_0= 'required' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:562:1: (lv_required_1_0= 'required' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:562:1: (lv_required_1_0= 'required' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:563:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSimpleAttribute1196); 

                            newLeafNode(lv_required_1_0, grammarAccess.getSimpleAttributeAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:576:3: ( (lv_name_2_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:577:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:577:1: (lv_name_2_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:578:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSimpleAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleAttribute1231);
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

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSimpleAttribute1243); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleAttributeAccess().getColonKeyword_3());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:598:1: ( (lv_data_4_0= ruleDataEnum ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:599:1: (lv_data_4_0= ruleDataEnum )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:599:1: (lv_data_4_0= ruleDataEnum )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:600:3: lv_data_4_0= ruleDataEnum
            {
             
            	        newCompositeNode(grammarAccess.getSimpleAttributeAccess().getDataDataEnumEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataEnum_in_ruleSimpleAttribute1264);
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:624:1: entryRuleMultiAttribute returns [EObject current=null] : iv_ruleMultiAttribute= ruleMultiAttribute EOF ;
    public final EObject entryRuleMultiAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiAttribute = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:625:2: (iv_ruleMultiAttribute= ruleMultiAttribute EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:626:2: iv_ruleMultiAttribute= ruleMultiAttribute EOF
            {
             newCompositeNode(grammarAccess.getMultiAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiAttribute_in_entryRuleMultiAttribute1300);
            iv_ruleMultiAttribute=ruleMultiAttribute();

            state._fsp--;

             current =iv_ruleMultiAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiAttribute1310); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:633:1: ruleMultiAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleMultiAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:636:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:637:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:637:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:637:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:637:2: ( (lv_name_0_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:638:1: (lv_name_0_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:638:1: (lv_name_0_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:639:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiAttribute1356);
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

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMultiAttribute1368); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiAttributeAccess().getColonKeyword_1());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:659:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:660:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:660:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:661:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMultiAttributeAccess().getTypeEntityCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiAttribute1391);
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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:682:1: entryRuleOnService returns [EObject current=null] : iv_ruleOnService= ruleOnService EOF ;
    public final EObject entryRuleOnService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnService = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:683:2: (iv_ruleOnService= ruleOnService EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:684:2: iv_ruleOnService= ruleOnService EOF
            {
             newCompositeNode(grammarAccess.getOnServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_entryRuleOnService1427);
            iv_ruleOnService=ruleOnService();

            state._fsp--;

             current =iv_ruleOnService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnService1437); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:691:1: ruleOnService returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleOnService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_whenServices_2_0 = null;

        Enumerator lv_whenServices_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:694:28: ( ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:695:1: ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:695:1: ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:695:2: ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']'
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:695:2: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:696:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:696:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:697:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOnServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOnServiceAccess().getArtifactArtifactCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnService1485);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnService1497); 

                	newLeafNode(otherlv_1, grammarAccess.getOnServiceAccess().getLeftSquareBracketKeyword_1());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:714:1: ( (lv_whenServices_2_0= ruleServiceEnum ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:715:1: (lv_whenServices_2_0= ruleServiceEnum )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:715:1: (lv_whenServices_2_0= ruleServiceEnum )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:716:3: lv_whenServices_2_0= ruleServiceEnum
            {
             
            	        newCompositeNode(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleOnService1518);
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

            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:732:2: (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:732:4: otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOnService1531); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOnServiceAccess().getCommaKeyword_3_0());
            	        
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:736:1: ( (lv_whenServices_4_0= ruleServiceEnum ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:737:1: (lv_whenServices_4_0= ruleServiceEnum )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:737:1: (lv_whenServices_4_0= ruleServiceEnum )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:738:3: lv_whenServices_4_0= ruleServiceEnum
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleOnService1552);
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOnService1566); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:766:1: entryRuleSimpleService returns [EObject current=null] : iv_ruleSimpleService= ruleSimpleService EOF ;
    public final EObject entryRuleSimpleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleService = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:767:2: (iv_ruleSimpleService= ruleSimpleService EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:768:2: iv_ruleSimpleService= ruleSimpleService EOF
            {
             newCompositeNode(grammarAccess.getSimpleServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_entryRuleSimpleService1602);
            iv_ruleSimpleService=ruleSimpleService();

            state._fsp--;

             current =iv_ruleSimpleService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleService1612); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:775:1: ruleSimpleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}' ) ;
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
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:778:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:779:1: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:779:1: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:779:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSimpleService1649); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleServiceAccess().getServiceKeyword_0());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:783:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:784:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:784:1: (lv_name_1_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:785:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1670);
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

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSimpleService1682); 

                	newLeafNode(otherlv_2, grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:805:1: (otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:805:3: otherlv_3= 'input : ' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSimpleService1695); 

                        	newLeafNode(otherlv_3, grammarAccess.getSimpleServiceAccess().getInputKeyword_3_0());
                        
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:809:1: ( ( ruleEString ) )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:810:1: ( ruleEString )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:810:1: ( ruleEString )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:811:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleServiceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1718);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:824:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:824:4: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleService1731); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSimpleServiceAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:828:1: ( ( ruleEString ) )
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:829:1: ( ruleEString )
                    	    {
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:829:1: ( ruleEString )
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:830:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSimpleServiceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1754);
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

            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:843:6: (otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:843:8: otherlv_7= 'output : ' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSimpleService1771); 

                        	newLeafNode(otherlv_7, grammarAccess.getSimpleServiceAccess().getOutputKeyword_4_0());
                        
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:847:1: ( ( ruleEString ) )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:848:1: ( ruleEString )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:848:1: ( ruleEString )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:849:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimpleServiceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1794);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:862:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:862:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleService1807); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSimpleServiceAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:866:1: ( ( ruleEString ) )
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:867:1: ( ruleEString )
                    	    {
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:867:1: ( ruleEString )
                    	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:868:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSimpleServiceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1830);
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

            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:881:6: (otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:881:8: otherlv_11= 'when : ' ( (lv_when_12_0= ruleOnService ) )
            	    {
            	    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSimpleService1847); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSimpleServiceAccess().getWhenKeyword_5_0());
            	        
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:885:1: ( (lv_when_12_0= ruleOnService ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:886:1: (lv_when_12_0= ruleOnService )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:886:1: (lv_when_12_0= ruleOnService )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:887:3: lv_when_12_0= ruleOnService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOnService_in_ruleSimpleService1868);
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

            otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSimpleService1882); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:915:1: entryRuleMultiService returns [EObject current=null] : iv_ruleMultiService= ruleMultiService EOF ;
    public final EObject entryRuleMultiService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiService = null;


        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:916:2: (iv_ruleMultiService= ruleMultiService EOF )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:917:2: iv_ruleMultiService= ruleMultiService EOF
            {
             newCompositeNode(grammarAccess.getMultiServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_entryRuleMultiService1918);
            iv_ruleMultiService=ruleMultiService();

            state._fsp--;

             current =iv_ruleMultiService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiService1928); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:924:1: ruleMultiService returns [EObject current=null] : (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' ) ;
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
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:927:28: ( (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:928:1: (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:928:1: (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:928:3: otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMultiService1965); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiServiceAccess().getMultiServiceKeyword_0());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:932:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:933:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:933:1: (lv_name_1_0= ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:934:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiServiceAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService1986);
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

            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:950:2: (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:950:4: otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiService1999); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:954:1: ( (lv_parallel_3_0= 'parallel' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==30) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:955:1: (lv_parallel_3_0= 'parallel' )
                            {
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:955:1: (lv_parallel_3_0= 'parallel' )
                            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:956:3: lv_parallel_3_0= 'parallel'
                            {
                            lv_parallel_3_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultiService2017); 

                                    newLeafNode(lv_parallel_3_0, grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultiServiceRule());
                            	        }
                                   		setWithLastConsumed(current, "parallel", true, "parallel");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultiService2043); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultiService2057); 

                	newLeafNode(otherlv_5, grammarAccess.getMultiServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:977:1: (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:977:3: otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultiService2070); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMultiServiceAccess().getWhenKeyword_4_0());
            	        
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:981:1: ( (lv_when_7_0= ruleOnService ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:982:1: (lv_when_7_0= ruleOnService )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:982:1: (lv_when_7_0= ruleOnService )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:983:3: lv_when_7_0= ruleOnService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiServiceAccess().getWhenOnServiceParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOnService_in_ruleMultiService2091);
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

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiService2105); 

                	newLeafNode(otherlv_8, grammarAccess.getMultiServiceAccess().getServicesKeyword_5());
                
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1003:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1004:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1004:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1005:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2128);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1018:2: (otherlv_10= ',' ( ( ruleEString ) ) )+
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
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1018:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiService2141); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultiServiceAccess().getCommaKeyword_7_0());
            	        
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1022:1: ( ( ruleEString ) )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1023:1: ( ruleEString )
            	    {
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1023:1: ( ruleEString )
            	    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1024:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultiServiceRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2164);
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

            otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultiService2178); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1049:1: ruleFormatEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) ) ;
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
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1051:28: ( ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1052:1: ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1052:1: ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) )
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
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1052:2: (enumLiteral_0= 'XMI' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1052:2: (enumLiteral_0= 'XMI' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1052:4: enumLiteral_0= 'XMI'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFormatEnum2228); 

                            current = grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1058:6: (enumLiteral_1= 'BINARY' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1058:6: (enumLiteral_1= 'BINARY' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1058:8: enumLiteral_1= 'BINARY'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleFormatEnum2245); 

                            current = grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1064:6: (enumLiteral_2= 'TEXT' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1064:6: (enumLiteral_2= 'TEXT' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1064:8: enumLiteral_2= 'TEXT'
                    {
                    enumLiteral_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFormatEnum2262); 

                            current = grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1070:6: (enumLiteral_3= 'XML' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1070:6: (enumLiteral_3= 'XML' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1070:8: enumLiteral_3= 'XML'
                    {
                    enumLiteral_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleFormatEnum2279); 

                            current = grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1076:6: (enumLiteral_4= 'JSON' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1076:6: (enumLiteral_4= 'JSON' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1076:8: enumLiteral_4= 'JSON'
                    {
                    enumLiteral_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFormatEnum2296); 

                            current = grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1082:6: (enumLiteral_5= 'ATL' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1082:6: (enumLiteral_5= 'ATL' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1082:8: enumLiteral_5= 'ATL'
                    {
                    enumLiteral_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFormatEnum2313); 

                            current = grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1088:6: (enumLiteral_6= 'ZIP' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1088:6: (enumLiteral_6= 'ZIP' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1088:8: enumLiteral_6= 'ZIP'
                    {
                    enumLiteral_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFormatEnum2330); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1098:1: ruleServiceEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) ) ;
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
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1100:28: ( ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1101:1: ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1101:1: ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) )
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
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1101:2: (enumLiteral_0= 'upload' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1101:2: (enumLiteral_0= 'upload' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1101:4: enumLiteral_0= 'upload'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleServiceEnum2375); 

                            current = grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1107:6: (enumLiteral_1= 'download' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1107:6: (enumLiteral_1= 'download' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1107:8: enumLiteral_1= 'download'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleServiceEnum2392); 

                            current = grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1113:6: (enumLiteral_2= 'update' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1113:6: (enumLiteral_2= 'update' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1113:8: enumLiteral_2= 'update'
                    {
                    enumLiteral_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleServiceEnum2409); 

                            current = grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1119:6: (enumLiteral_3= 'read' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1119:6: (enumLiteral_3= 'read' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1119:8: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleServiceEnum2426); 

                            current = grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1125:6: (enumLiteral_4= 'readAll' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1125:6: (enumLiteral_4= 'readAll' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1125:8: enumLiteral_4= 'readAll'
                    {
                    enumLiteral_4=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleServiceEnum2443); 

                            current = grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1131:6: (enumLiteral_5= 'search' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1131:6: (enumLiteral_5= 'search' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1131:8: enumLiteral_5= 'search'
                    {
                    enumLiteral_5=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleServiceEnum2460); 

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
    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1141:1: ruleDataEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator ruleDataEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1143:28: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) ) )
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1144:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) )
            {
            // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1144:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) )
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
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1144:2: (enumLiteral_0= 'Boolean' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1144:2: (enumLiteral_0= 'Boolean' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1144:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDataEnum2505); 

                            current = grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1150:6: (enumLiteral_1= 'Double' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1150:6: (enumLiteral_1= 'Double' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1150:8: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDataEnum2522); 

                            current = grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1156:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1156:6: (enumLiteral_2= 'Integer' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1156:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleDataEnum2539); 

                            current = grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1162:6: (enumLiteral_3= 'String' )
                    {
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1162:6: (enumLiteral_3= 'String' )
                    // ../miso.carrascal.codeGenerator/src-gen/miso/carrascal/codeGenerator/parser/antlr/internal/InternalRules.g:1162:8: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleDataEnum2556); 

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
        public static final BitSet FOLLOW_11_in_ruleArtifact666 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifact687 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_ruleArtifact700 = new BitSet(new long[]{0x000000000005A000L});
        public static final BitSet FOLLOW_13_in_ruleArtifact713 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleArtifact725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifact746 = new BitSet(new long[]{0x0000000000058000L});
        public static final BitSet FOLLOW_15_in_ruleArtifact761 = new BitSet(new long[]{0x0000003F80000000L});
        public static final BitSet FOLLOW_ruleFormatEnum_in_ruleArtifact782 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleArtifact797 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleArtifact818 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleArtifact831 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleArtifact852 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleArtifact868 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleArtifact882 = new BitSet(new long[]{0x0000000000D00030L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleArtifact903 = new BitSet(new long[]{0x0000000000D00030L});
        public static final BitSet FOLLOW_20_in_ruleArtifact916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity952 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEntity1008 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntity1029 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEntity1041 = new BitSet(new long[]{0x0000000000D00030L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity1062 = new BitSet(new long[]{0x0000000000D00030L});
        public static final BitSet FOLLOW_20_in_ruleEntity1075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute1111 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute1121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleSimpleAttribute1164 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_23_in_ruleSimpleAttribute1196 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleAttribute1231 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSimpleAttribute1243 = new BitSet(new long[]{0x0000F00000000000L});
        public static final BitSet FOLLOW_ruleDataEnum_in_ruleSimpleAttribute1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiAttribute_in_entryRuleMultiAttribute1300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiAttribute1310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiAttribute1356 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMultiAttribute1368 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiAttribute1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_entryRuleOnService1427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnService1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnService1485 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnService1497 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleOnService1518 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleOnService1531 = new BitSet(new long[]{0x00000FC000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleOnService1552 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleOnService1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_entryRuleSimpleService1602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleService1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleSimpleService1649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1670 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSimpleService1682 = new BitSet(new long[]{0x000000001C100000L});
        public static final BitSet FOLLOW_26_in_ruleSimpleService1695 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1718 = new BitSet(new long[]{0x0000000018120000L});
        public static final BitSet FOLLOW_17_in_ruleSimpleService1731 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1754 = new BitSet(new long[]{0x0000000018120000L});
        public static final BitSet FOLLOW_27_in_ruleSimpleService1771 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1794 = new BitSet(new long[]{0x0000000010120000L});
        public static final BitSet FOLLOW_17_in_ruleSimpleService1807 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1830 = new BitSet(new long[]{0x0000000010120000L});
        public static final BitSet FOLLOW_28_in_ruleSimpleService1847 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleOnService_in_ruleSimpleService1868 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_20_in_ruleSimpleService1882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_entryRuleMultiService1918 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiService1928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleMultiService1965 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService1986 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_ruleMultiService1999 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_30_in_ruleMultiService2017 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMultiService2043 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMultiService2057 = new BitSet(new long[]{0x0000000010010000L});
        public static final BitSet FOLLOW_28_in_ruleMultiService2070 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleOnService_in_ruleMultiService2091 = new BitSet(new long[]{0x0000000010010000L});
        public static final BitSet FOLLOW_16_in_ruleMultiService2105 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2128 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMultiService2141 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2164 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleMultiService2178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleFormatEnum2228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleFormatEnum2245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleFormatEnum2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleFormatEnum2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleFormatEnum2296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleFormatEnum2313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleFormatEnum2330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleServiceEnum2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleServiceEnum2392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleServiceEnum2409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleServiceEnum2426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleServiceEnum2443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleServiceEnum2460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleDataEnum2505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleDataEnum2522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleDataEnum2539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleDataEnum2556 = new BitSet(new long[]{0x0000000000000002L});
    }


}