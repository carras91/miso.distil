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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MongoURI'", "':'", "'Artifact'", "'['", "'extension '", "'.'", "'format '", "'services : '", "','", "']'", "'{'", "'}'", "'Entity'", "'many'", "'required'", "'ref'", "'id'", "'Service'", "'input : '", "'output : '", "'when : '", "'MultiService'", "'parallel'", "'with'", "'='", "'XMI'", "'BINARY'", "'TEXT'", "'XML'", "'JSON'", "'ATL'", "'ZIP'", "'upload'", "'download'", "'update'", "'read'", "'readAll'", "'search'", "'delete'", "'all'", "'Boolean'", "'Double'", "'Integer'", "'String'"
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


        public InternalRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesParser.tokenNames; }
    public String getGrammarFileName() { return "../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g"; }



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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:68:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:69:2: (iv_ruleRoot= ruleRoot EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:70:2: iv_ruleRoot= ruleRoot EOF
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:77:1: ruleRoot returns [EObject current=null] : ( (otherlv_0= 'MongoURI' otherlv_1= ':' ( (lv_mongoURIs_2_0= ruleEString ) ) )* ( (lv_artifacts_3_0= ruleArtifact ) ) ( ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_entities_5_0= ruleEntity ) ) | ( (lv_services_6_0= ruleService ) ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_mongoURIs_2_0 = null;

        EObject lv_artifacts_3_0 = null;

        EObject lv_artifacts_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_services_6_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:80:28: ( ( (otherlv_0= 'MongoURI' otherlv_1= ':' ( (lv_mongoURIs_2_0= ruleEString ) ) )* ( (lv_artifacts_3_0= ruleArtifact ) ) ( ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_entities_5_0= ruleEntity ) ) | ( (lv_services_6_0= ruleService ) ) )* ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:1: ( (otherlv_0= 'MongoURI' otherlv_1= ':' ( (lv_mongoURIs_2_0= ruleEString ) ) )* ( (lv_artifacts_3_0= ruleArtifact ) ) ( ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_entities_5_0= ruleEntity ) ) | ( (lv_services_6_0= ruleService ) ) )* )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:1: ( (otherlv_0= 'MongoURI' otherlv_1= ':' ( (lv_mongoURIs_2_0= ruleEString ) ) )* ( (lv_artifacts_3_0= ruleArtifact ) ) ( ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_entities_5_0= ruleEntity ) ) | ( (lv_services_6_0= ruleService ) ) )* )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:2: (otherlv_0= 'MongoURI' otherlv_1= ':' ( (lv_mongoURIs_2_0= ruleEString ) ) )* ( (lv_artifacts_3_0= ruleArtifact ) ) ( ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_entities_5_0= ruleEntity ) ) | ( (lv_services_6_0= ruleService ) ) )*
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:2: (otherlv_0= 'MongoURI' otherlv_1= ':' ( (lv_mongoURIs_2_0= ruleEString ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:4: otherlv_0= 'MongoURI' otherlv_1= ':' ( (lv_mongoURIs_2_0= ruleEString ) )
            	    {
            	    otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRoot123); 

            	        	newLeafNode(otherlv_0, grammarAccess.getRootAccess().getMongoURIKeyword_0_0());
            	        
            	    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRoot135); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRootAccess().getColonKeyword_0_1());
            	        
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:89:1: ( (lv_mongoURIs_2_0= ruleEString ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:90:1: (lv_mongoURIs_2_0= ruleEString )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:90:1: (lv_mongoURIs_2_0= ruleEString )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:91:3: lv_mongoURIs_2_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getMongoURIsEStringParserRuleCall_0_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRoot156);
            	    lv_mongoURIs_2_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mongoURIs",
            	            		lv_mongoURIs_2_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:107:4: ( (lv_artifacts_3_0= ruleArtifact ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:108:1: (lv_artifacts_3_0= ruleArtifact )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:108:1: (lv_artifacts_3_0= ruleArtifact )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:109:3: lv_artifacts_3_0= ruleArtifact
            {
             
            	        newCompositeNode(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_ruleRoot179);
            lv_artifacts_3_0=ruleArtifact();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootRule());
            	        }
                   		add(
                   			current, 
                   			"artifacts",
                    		lv_artifacts_3_0, 
                    		"Artifact");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:125:2: ( ( (lv_artifacts_4_0= ruleArtifact ) ) | ( (lv_entities_5_0= ruleEntity ) ) | ( (lv_services_6_0= ruleService ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt2=1;
                    }
                    break;
                case 23:
                    {
                    alt2=2;
                    }
                    break;
                case 28:
                case 32:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:125:3: ( (lv_artifacts_4_0= ruleArtifact ) )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:125:3: ( (lv_artifacts_4_0= ruleArtifact ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:126:1: (lv_artifacts_4_0= ruleArtifact )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:126:1: (lv_artifacts_4_0= ruleArtifact )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:127:3: lv_artifacts_4_0= ruleArtifact
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_ruleRoot201);
            	    lv_artifacts_4_0=ruleArtifact();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"artifacts",
            	            		lv_artifacts_4_0, 
            	            		"Artifact");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:144:6: ( (lv_entities_5_0= ruleEntity ) )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:144:6: ( (lv_entities_5_0= ruleEntity ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:145:1: (lv_entities_5_0= ruleEntity )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:145:1: (lv_entities_5_0= ruleEntity )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:146:3: lv_entities_5_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getEntitiesEntityParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_ruleRoot228);
            	    lv_entities_5_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_5_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:163:6: ( (lv_services_6_0= ruleService ) )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:163:6: ( (lv_services_6_0= ruleService ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:164:1: (lv_services_6_0= ruleService )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:164:1: (lv_services_6_0= ruleService )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:165:3: lv_services_6_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootAccess().getServicesServiceParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleService_in_ruleRoot255);
            	    lv_services_6_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_6_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleService"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:189:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:190:2: (iv_ruleService= ruleService EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:191:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_entryRuleService293);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService303); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:198:1: ruleService returns [EObject current=null] : (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleService_0 = null;

        EObject this_MultiService_1 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:201:28: ( (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:202:1: (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:202:1: (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:203:5: this_SimpleService_0= ruleSimpleService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getSimpleServiceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_ruleService350);
                    this_SimpleService_0=ruleSimpleService();

                    state._fsp--;

                     
                            current = this_SimpleService_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:213:5: this_MultiService_1= ruleMultiService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getMultiServiceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_ruleService377);
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:229:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:230:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:231:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute412);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute422); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:238:1: ruleAttribute returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Reference_1= ruleReference | this_ArtifactID_2= ruleArtifactID ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_Reference_1 = null;

        EObject this_ArtifactID_2 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:241:28: ( (this_Primitive_0= rulePrimitive | this_Reference_1= ruleReference | this_ArtifactID_2= ruleArtifactID ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:242:1: (this_Primitive_0= rulePrimitive | this_Reference_1= ruleReference | this_ArtifactID_2= ruleArtifactID )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:242:1: (this_Primitive_0= rulePrimitive | this_Reference_1= ruleReference | this_ArtifactID_2= ruleArtifactID )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 24:
            case 25:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:243:5: this_Primitive_0= rulePrimitive
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getPrimitiveParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_ruleAttribute469);
                    this_Primitive_0=rulePrimitive();

                    state._fsp--;

                     
                            current = this_Primitive_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:253:5: this_Reference_1= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getReferenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReference_in_ruleAttribute496);
                    this_Reference_1=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:263:5: this_ArtifactID_2= ruleArtifactID
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getArtifactIDParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArtifactID_in_ruleAttribute523);
                    this_ArtifactID_2=ruleArtifactID();

                    state._fsp--;

                     
                            current = this_ArtifactID_2; 
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:281:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:282:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:283:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_entryRuleArtifact560);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtifact570); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:290:1: ruleArtifact returns [EObject current=null] : (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' ) ;
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
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:293:28: ( (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:294:1: (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:294:1: (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:294:3: otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArtifact607); 

                	newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:298:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:299:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:299:1: (lv_name_1_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:300:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifact628);
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

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:316:2: (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:316:4: otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArtifact641); 

                        	newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:320:1: (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==15) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:320:3: otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) )
                            {
                            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArtifact654); 

                                	newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getExtensionKeyword_2_1_0());
                                
                            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleArtifact666); 

                                	newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getFullStopKeyword_2_1_1());
                                
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:328:1: ( (lv_extension_5_0= ruleEString ) )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:329:1: (lv_extension_5_0= ruleEString )
                            {
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:329:1: (lv_extension_5_0= ruleEString )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:330:3: lv_extension_5_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_2_1_2_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifact687);
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

                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:346:4: (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:346:6: otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) )
                            {
                            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleArtifact702); 

                                	newLeafNode(otherlv_6, grammarAccess.getArtifactAccess().getFormatKeyword_2_2_0());
                                
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:350:1: ( (lv_format_7_0= ruleFormatEnum ) )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:351:1: (lv_format_7_0= ruleFormatEnum )
                            {
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:351:1: (lv_format_7_0= ruleFormatEnum )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:352:3: lv_format_7_0= ruleFormatEnum
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_2_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleFormatEnum_in_ruleArtifact723);
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

                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:368:4: (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==18) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:368:6: otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )*
                            {
                            otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArtifact738); 

                                	newLeafNode(otherlv_8, grammarAccess.getArtifactAccess().getServicesKeyword_2_3_0());
                                
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:372:1: ( (lv_basicServices_9_0= ruleServiceEnum ) )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:373:1: (lv_basicServices_9_0= ruleServiceEnum )
                            {
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:373:1: (lv_basicServices_9_0= ruleServiceEnum )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:374:3: lv_basicServices_9_0= ruleServiceEnum
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleArtifact759);
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

                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:390:2: (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==19) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:390:4: otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) )
                            	    {
                            	    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArtifact772); 

                            	        	newLeafNode(otherlv_10, grammarAccess.getArtifactAccess().getCommaKeyword_2_3_2_0());
                            	        
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:394:1: ( (lv_basicServices_11_0= ruleServiceEnum ) )
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:395:1: (lv_basicServices_11_0= ruleServiceEnum )
                            	    {
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:395:1: (lv_basicServices_11_0= ruleServiceEnum )
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:396:3: lv_basicServices_11_0= ruleServiceEnum
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleArtifact793);
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

                    otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArtifact809); 

                        	newLeafNode(otherlv_12, grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_2_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleArtifact823); 

                	newLeafNode(otherlv_13, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:420:1: ( (lv_attributes_14_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||(LA10_0>=24 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:421:1: (lv_attributes_14_0= ruleAttribute )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:421:1: (lv_attributes_14_0= ruleAttribute )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:422:3: lv_attributes_14_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleArtifact844);
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

            otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleArtifact857); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:450:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:451:2: (iv_ruleEntity= ruleEntity EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:452:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity893);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity903); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:459:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:462:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:463:1: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:463:1: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:463:3: otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEntity940); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:467:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:468:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:468:1: (lv_name_1_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:469:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntity961);
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

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEntity973); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:489:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)||(LA11_0>=24 && LA11_0<=27)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:490:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:490:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:491:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleEntity994);
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

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEntity1007); 

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


    // $ANTLR start "entryRuleEString"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:519:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:520:2: (iv_ruleEString= ruleEString EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:521:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1044);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1055); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:528:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:531:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:532:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:532:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:532:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1095); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:540:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1121); 

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


    // $ANTLR start "entryRulePrimitive"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:557:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:558:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:559:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_entryRulePrimitive1168);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitive1178); 

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:566:1: rulePrimitive returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_required_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:569:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:570:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:570:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:570:2: ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:570:2: ( (lv_many_0_0= 'many' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:571:1: (lv_many_0_0= 'many' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:571:1: (lv_many_0_0= 'many' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:572:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePrimitive1221); 

                            newLeafNode(lv_many_0_0, grammarAccess.getPrimitiveAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:585:3: ( (lv_required_1_0= 'required' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:586:1: (lv_required_1_0= 'required' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:586:1: (lv_required_1_0= 'required' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:587:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePrimitive1253); 

                            newLeafNode(lv_required_1_0, grammarAccess.getPrimitiveAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:600:3: ( (lv_name_2_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:601:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:601:1: (lv_name_2_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:602:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimitive1288);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePrimitive1300); 

                	newLeafNode(otherlv_3, grammarAccess.getPrimitiveAccess().getColonKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:622:1: ( (lv_type_4_0= ruleDataEnum ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:623:1: (lv_type_4_0= ruleDataEnum )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:623:1: (lv_type_4_0= ruleDataEnum )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:624:3: lv_type_4_0= ruleDataEnum
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveAccess().getTypeDataEnumEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataEnum_in_rulePrimitive1321);
            lv_type_4_0=ruleDataEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleReference"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:648:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:649:2: (iv_ruleReference= ruleReference EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:650:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReference_in_entryRuleReference1357);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReference1367); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:657:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:660:28: ( (otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:661:1: (otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:661:1: (otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:661:3: otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleReference1404); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:665:1: ( (lv_many_1_0= 'many' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:666:1: (lv_many_1_0= 'many' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:666:1: (lv_many_1_0= 'many' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:667:3: lv_many_1_0= 'many'
                    {
                    lv_many_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleReference1422); 

                            newLeafNode(lv_many_1_0, grammarAccess.getReferenceAccess().getManyManyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:680:3: ( (lv_name_2_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:681:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:681:1: (lv_name_2_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:682:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReference1457);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReference1469); 

                	newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getColonKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:702:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:703:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:703:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:704:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReference1492);
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleArtifactID"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:725:1: entryRuleArtifactID returns [EObject current=null] : iv_ruleArtifactID= ruleArtifactID EOF ;
    public final EObject entryRuleArtifactID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifactID = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:726:2: (iv_ruleArtifactID= ruleArtifactID EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:727:2: iv_ruleArtifactID= ruleArtifactID EOF
            {
             newCompositeNode(grammarAccess.getArtifactIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifactID_in_entryRuleArtifactID1528);
            iv_ruleArtifactID=ruleArtifactID();

            state._fsp--;

             current =iv_ruleArtifactID; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtifactID1538); 

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
    // $ANTLR end "entryRuleArtifactID"


    // $ANTLR start "ruleArtifactID"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:734:1: ruleArtifactID returns [EObject current=null] : (otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleArtifactID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:737:28: ( (otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:738:1: (otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:738:1: (otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:738:3: otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleArtifactID1575); 

                	newLeafNode(otherlv_0, grammarAccess.getArtifactIDAccess().getIdKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:742:1: ( (lv_many_1_0= 'many' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:743:1: (lv_many_1_0= 'many' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:743:1: (lv_many_1_0= 'many' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:744:3: lv_many_1_0= 'many'
                    {
                    lv_many_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleArtifactID1593); 

                            newLeafNode(lv_many_1_0, grammarAccess.getArtifactIDAccess().getManyManyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArtifactIDRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:757:3: ( (lv_name_2_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:758:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:758:1: (lv_name_2_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:759:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArtifactIDAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifactID1628);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArtifactIDRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArtifactID1640); 

                	newLeafNode(otherlv_3, grammarAccess.getArtifactIDAccess().getColonKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:779:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:780:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:780:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:781:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArtifactIDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getArtifactIDAccess().getTypeArtifactCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifactID1663);
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
    // $ANTLR end "ruleArtifactID"


    // $ANTLR start "entryRuleOnService"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:802:1: entryRuleOnService returns [EObject current=null] : iv_ruleOnService= ruleOnService EOF ;
    public final EObject entryRuleOnService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnService = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:803:2: (iv_ruleOnService= ruleOnService EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:804:2: iv_ruleOnService= ruleOnService EOF
            {
             newCompositeNode(grammarAccess.getOnServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_entryRuleOnService1699);
            iv_ruleOnService=ruleOnService();

            state._fsp--;

             current =iv_ruleOnService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnService1709); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:811:1: ruleOnService returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleOnService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_whenServices_2_0 = null;

        Enumerator lv_whenServices_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:814:28: ( ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:815:1: ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:815:1: ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:815:2: ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']'
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:815:2: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:816:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:816:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:817:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOnServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOnServiceAccess().getArtifactArtifactCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnService1757);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOnService1769); 

                	newLeafNode(otherlv_1, grammarAccess.getOnServiceAccess().getLeftSquareBracketKeyword_1());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:834:1: ( (lv_whenServices_2_0= ruleServiceEnum ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:835:1: (lv_whenServices_2_0= ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:835:1: (lv_whenServices_2_0= ruleServiceEnum )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:836:3: lv_whenServices_2_0= ruleServiceEnum
            {
             
            	        newCompositeNode(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleOnService1790);
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

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:852:2: (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:852:4: otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOnService1803); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOnServiceAccess().getCommaKeyword_3_0());
            	        
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:856:1: ( (lv_whenServices_4_0= ruleServiceEnum ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:857:1: (lv_whenServices_4_0= ruleServiceEnum )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:857:1: (lv_whenServices_4_0= ruleServiceEnum )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:858:3: lv_whenServices_4_0= ruleServiceEnum
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleOnService1824);
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
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOnService1838); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:886:1: entryRuleSimpleService returns [EObject current=null] : iv_ruleSimpleService= ruleSimpleService EOF ;
    public final EObject entryRuleSimpleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleService = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:887:2: (iv_ruleSimpleService= ruleSimpleService EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:888:2: iv_ruleSimpleService= ruleSimpleService EOF
            {
             newCompositeNode(grammarAccess.getSimpleServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_entryRuleSimpleService1874);
            iv_ruleSimpleService=ruleSimpleService();

            state._fsp--;

             current =iv_ruleSimpleService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleService1884); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:895:1: ruleSimpleService returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}' ) ;
    public final EObject ruleSimpleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_input_5_0 = null;

        EObject lv_input_7_0 = null;

        EObject lv_output_9_0 = null;

        EObject lv_output_11_0 = null;

        EObject lv_when_13_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:898:28: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:899:1: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:899:1: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:899:2: () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}'
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:899:2: ()
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:900:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleServiceAccess().getSimpleServiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSimpleService1930); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleServiceAccess().getServiceKeyword_1());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:909:1: ( (lv_name_2_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:910:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:910:1: (lv_name_2_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:911:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1951);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleServiceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSimpleService1963); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:931:1: (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:931:3: otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )*
                    {
                    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSimpleService1976); 

                        	newLeafNode(otherlv_4, grammarAccess.getSimpleServiceAccess().getInputKeyword_4_0());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:935:1: ( (lv_input_5_0= ruleInout ) )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:936:1: (lv_input_5_0= ruleInout )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:936:1: (lv_input_5_0= ruleInout )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:937:3: lv_input_5_0= ruleInout
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInout_in_ruleSimpleService1997);
                    lv_input_5_0=ruleInout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleServiceRule());
                    	        }
                           		add(
                           			current, 
                           			"input",
                            		lv_input_5_0, 
                            		"Inout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:953:2: (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==19) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:953:4: otherlv_6= ',' ( (lv_input_7_0= ruleInout ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSimpleService2010); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSimpleServiceAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:957:1: ( (lv_input_7_0= ruleInout ) )
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:958:1: (lv_input_7_0= ruleInout )
                    	    {
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:958:1: (lv_input_7_0= ruleInout )
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:959:3: lv_input_7_0= ruleInout
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInout_in_ruleSimpleService2031);
                    	    lv_input_7_0=ruleInout();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"input",
                    	            		lv_input_7_0, 
                    	            		"Inout");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:975:6: (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:975:8: otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )*
                    {
                    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSimpleService2048); 

                        	newLeafNode(otherlv_8, grammarAccess.getSimpleServiceAccess().getOutputKeyword_5_0());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:979:1: ( (lv_output_9_0= ruleInout ) )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:980:1: (lv_output_9_0= ruleInout )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:980:1: (lv_output_9_0= ruleInout )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:981:3: lv_output_9_0= ruleInout
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInout_in_ruleSimpleService2069);
                    lv_output_9_0=ruleInout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleServiceRule());
                    	        }
                           		add(
                           			current, 
                           			"output",
                            		lv_output_9_0, 
                            		"Inout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:997:2: (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==19) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:997:4: otherlv_10= ',' ( (lv_output_11_0= ruleInout ) )
                    	    {
                    	    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSimpleService2082); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSimpleServiceAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1001:1: ( (lv_output_11_0= ruleInout ) )
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1002:1: (lv_output_11_0= ruleInout )
                    	    {
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1002:1: (lv_output_11_0= ruleInout )
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1003:3: lv_output_11_0= ruleInout
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInout_in_ruleSimpleService2103);
                    	    lv_output_11_0=ruleInout();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleServiceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"output",
                    	            		lv_output_11_0, 
                    	            		"Inout");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1019:6: (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1019:8: otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) )
            	    {
            	    otherlv_12=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSimpleService2120); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSimpleServiceAccess().getWhenKeyword_6_0());
            	        
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1023:1: ( (lv_when_13_0= ruleOnService ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1024:1: (lv_when_13_0= ruleOnService )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1024:1: (lv_when_13_0= ruleOnService )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1025:3: lv_when_13_0= ruleOnService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOnService_in_ruleSimpleService2141);
            	    lv_when_13_0=ruleOnService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimpleServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"when",
            	            		lv_when_13_0, 
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

            otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSimpleService2155); 

                	newLeafNode(otherlv_14, grammarAccess.getSimpleServiceAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1053:1: entryRuleMultiService returns [EObject current=null] : iv_ruleMultiService= ruleMultiService EOF ;
    public final EObject entryRuleMultiService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiService = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1054:2: (iv_ruleMultiService= ruleMultiService EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1055:2: iv_ruleMultiService= ruleMultiService EOF
            {
             newCompositeNode(grammarAccess.getMultiServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_entryRuleMultiService2191);
            iv_ruleMultiService=ruleMultiService();

            state._fsp--;

             current =iv_ruleMultiService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiService2201); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1062:1: ruleMultiService returns [EObject current=null] : (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' ) ;
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
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1065:28: ( (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1066:1: (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1066:1: (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1066:3: otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMultiService2238); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiServiceAccess().getMultiServiceKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1070:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1071:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1071:1: (lv_name_1_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1072:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiServiceAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2259);
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

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1088:2: (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==14) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1088:4: otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiService2272); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1092:1: ( (lv_parallel_3_0= 'parallel' ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==33) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1093:1: (lv_parallel_3_0= 'parallel' )
                            {
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1093:1: (lv_parallel_3_0= 'parallel' )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1094:3: lv_parallel_3_0= 'parallel'
                            {
                            lv_parallel_3_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleMultiService2290); 

                                    newLeafNode(lv_parallel_3_0, grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultiServiceRule());
                            	        }
                                   		setWithLastConsumed(current, "parallel", true, "parallel");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultiService2316); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMultiService2330); 

                	newLeafNode(otherlv_5, grammarAccess.getMultiServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1115:1: (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1115:3: otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) )
            	    {
            	    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMultiService2343); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMultiServiceAccess().getWhenKeyword_4_0());
            	        
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1119:1: ( (lv_when_7_0= ruleOnService ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1120:1: (lv_when_7_0= ruleOnService )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1120:1: (lv_when_7_0= ruleOnService )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1121:3: lv_when_7_0= ruleOnService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiServiceAccess().getWhenOnServiceParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOnService_in_ruleMultiService2364);
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
            	    break loop25;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultiService2378); 

                	newLeafNode(otherlv_8, grammarAccess.getMultiServiceAccess().getServicesKeyword_5());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1141:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1142:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1142:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1143:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2401);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1156:2: (otherlv_10= ',' ( ( ruleEString ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==19) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1156:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultiService2414); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultiServiceAccess().getCommaKeyword_7_0());
            	        
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1160:1: ( ( ruleEString ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1161:1: ( ruleEString )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1161:1: ( ruleEString )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1162:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultiServiceRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2437);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_12=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMultiService2451); 

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


    // $ANTLR start "entryRuleInout"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1187:1: entryRuleInout returns [EObject current=null] : iv_ruleInout= ruleInout EOF ;
    public final EObject entryRuleInout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInout = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1188:2: (iv_ruleInout= ruleInout EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1189:2: iv_ruleInout= ruleInout EOF
            {
             newCompositeNode(grammarAccess.getInoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_entryRuleInout2487);
            iv_ruleInout=ruleInout();

            state._fsp--;

             current =iv_ruleInout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInout2497); 

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
    // $ANTLR end "entryRuleInout"


    // $ANTLR start "ruleInout"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1196:1: ruleInout returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )? ) ;
    public final EObject ruleInout() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_compatibility_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1199:28: ( ( ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )? ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1200:1: ( ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )? )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1200:1: ( ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )? )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1200:2: ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )?
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1200:2: ( (lv_many_0_0= 'many' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1201:1: (lv_many_0_0= 'many' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1201:1: (lv_many_0_0= 'many' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1202:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInout2540); 

                            newLeafNode(lv_many_0_0, grammarAccess.getInoutAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInoutRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1215:3: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1216:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1216:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1217:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInoutRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInoutAccess().getTypeAbstractEntityCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInout2577);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1230:2: (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1230:4: otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInout2590); 

                        	newLeafNode(otherlv_2, grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInout2602); 

                        	newLeafNode(otherlv_3, grammarAccess.getInoutAccess().getWithKeyword_2_1());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1238:1: ( (lv_compatibility_4_0= ruleComp ) )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1239:1: (lv_compatibility_4_0= ruleComp )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1239:1: (lv_compatibility_4_0= ruleComp )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1240:3: lv_compatibility_4_0= ruleComp
                    {
                     
                    	        newCompositeNode(grammarAccess.getInoutAccess().getCompatibilityCompParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComp_in_ruleInout2623);
                    lv_compatibility_4_0=ruleComp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInoutRule());
                    	        }
                           		set(
                           			current, 
                           			"compatibility",
                            		lv_compatibility_4_0, 
                            		"Comp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInout2635); 

                        	newLeafNode(otherlv_5, grammarAccess.getInoutAccess().getRightSquareBracketKeyword_2_3());
                        

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
    // $ANTLR end "ruleInout"


    // $ANTLR start "entryRuleComp"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1268:1: entryRuleComp returns [String current=null] : iv_ruleComp= ruleComp EOF ;
    public final String entryRuleComp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComp = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1269:2: (iv_ruleComp= ruleComp EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1270:2: iv_ruleComp= ruleComp EOF
            {
             newCompositeNode(grammarAccess.getCompRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComp_in_entryRuleComp2674);
            iv_ruleComp=ruleComp();

            state._fsp--;

             current =iv_ruleComp.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComp2685); 

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
    // $ANTLR end "entryRuleComp"


    // $ANTLR start "ruleComp"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1277:1: ruleComp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString ) ;
    public final AntlrDatatypeRuleToken ruleComp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_2 = null;

        AntlrDatatypeRuleToken this_EString_4 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1280:28: ( (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1281:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1281:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1282:5: this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString
            {
             
                    newCompositeNode(grammarAccess.getCompAccess().getEStringParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComp2732);
            this_EString_0=ruleEString();

            state._fsp--;


            		current.merge(this_EString_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1292:1: (kw= '.' this_EString_2= ruleEString )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1293:2: kw= '.' this_EString_2= ruleEString
            	    {
            	    kw=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleComp2751); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCompAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCompAccess().getEStringParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComp2773);
            	    this_EString_2=ruleEString();

            	    state._fsp--;


            	    		current.merge(this_EString_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleComp2793); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCompAccess().getEqualsSignKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getCompAccess().getEStringParserRuleCall_3()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComp2815);
            this_EString_4=ruleEString();

            state._fsp--;


            		current.merge(this_EString_4);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleComp"


    // $ANTLR start "ruleFormatEnum"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1334:1: ruleFormatEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) ) ;
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
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1336:28: ( ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1337:1: ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1337:1: ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) )
            int alt30=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt30=1;
                }
                break;
            case 37:
                {
                alt30=2;
                }
                break;
            case 38:
                {
                alt30=3;
                }
                break;
            case 39:
                {
                alt30=4;
                }
                break;
            case 40:
                {
                alt30=5;
                }
                break;
            case 41:
                {
                alt30=6;
                }
                break;
            case 42:
                {
                alt30=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1337:2: (enumLiteral_0= 'XMI' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1337:2: (enumLiteral_0= 'XMI' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1337:4: enumLiteral_0= 'XMI'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFormatEnum2874); 

                            current = grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1343:6: (enumLiteral_1= 'BINARY' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1343:6: (enumLiteral_1= 'BINARY' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1343:8: enumLiteral_1= 'BINARY'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFormatEnum2891); 

                            current = grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1349:6: (enumLiteral_2= 'TEXT' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1349:6: (enumLiteral_2= 'TEXT' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1349:8: enumLiteral_2= 'TEXT'
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFormatEnum2908); 

                            current = grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1355:6: (enumLiteral_3= 'XML' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1355:6: (enumLiteral_3= 'XML' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1355:8: enumLiteral_3= 'XML'
                    {
                    enumLiteral_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleFormatEnum2925); 

                            current = grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1361:6: (enumLiteral_4= 'JSON' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1361:6: (enumLiteral_4= 'JSON' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1361:8: enumLiteral_4= 'JSON'
                    {
                    enumLiteral_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleFormatEnum2942); 

                            current = grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1367:6: (enumLiteral_5= 'ATL' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1367:6: (enumLiteral_5= 'ATL' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1367:8: enumLiteral_5= 'ATL'
                    {
                    enumLiteral_5=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleFormatEnum2959); 

                            current = grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1373:6: (enumLiteral_6= 'ZIP' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1373:6: (enumLiteral_6= 'ZIP' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1373:8: enumLiteral_6= 'ZIP'
                    {
                    enumLiteral_6=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleFormatEnum2976); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1383:1: ruleServiceEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) | (enumLiteral_6= 'delete' ) | (enumLiteral_7= 'all' ) ) ;
    public final Enumerator ruleServiceEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1385:28: ( ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) | (enumLiteral_6= 'delete' ) | (enumLiteral_7= 'all' ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1386:1: ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) | (enumLiteral_6= 'delete' ) | (enumLiteral_7= 'all' ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1386:1: ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) | (enumLiteral_6= 'delete' ) | (enumLiteral_7= 'all' ) )
            int alt31=8;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt31=1;
                }
                break;
            case 44:
                {
                alt31=2;
                }
                break;
            case 45:
                {
                alt31=3;
                }
                break;
            case 46:
                {
                alt31=4;
                }
                break;
            case 47:
                {
                alt31=5;
                }
                break;
            case 48:
                {
                alt31=6;
                }
                break;
            case 49:
                {
                alt31=7;
                }
                break;
            case 50:
                {
                alt31=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1386:2: (enumLiteral_0= 'upload' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1386:2: (enumLiteral_0= 'upload' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1386:4: enumLiteral_0= 'upload'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleServiceEnum3021); 

                            current = grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1392:6: (enumLiteral_1= 'download' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1392:6: (enumLiteral_1= 'download' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1392:8: enumLiteral_1= 'download'
                    {
                    enumLiteral_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleServiceEnum3038); 

                            current = grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1398:6: (enumLiteral_2= 'update' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1398:6: (enumLiteral_2= 'update' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1398:8: enumLiteral_2= 'update'
                    {
                    enumLiteral_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleServiceEnum3055); 

                            current = grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1404:6: (enumLiteral_3= 'read' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1404:6: (enumLiteral_3= 'read' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1404:8: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleServiceEnum3072); 

                            current = grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1410:6: (enumLiteral_4= 'readAll' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1410:6: (enumLiteral_4= 'readAll' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1410:8: enumLiteral_4= 'readAll'
                    {
                    enumLiteral_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleServiceEnum3089); 

                            current = grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1416:6: (enumLiteral_5= 'search' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1416:6: (enumLiteral_5= 'search' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1416:8: enumLiteral_5= 'search'
                    {
                    enumLiteral_5=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleServiceEnum3106); 

                            current = grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1422:6: (enumLiteral_6= 'delete' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1422:6: (enumLiteral_6= 'delete' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1422:8: enumLiteral_6= 'delete'
                    {
                    enumLiteral_6=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleServiceEnum3123); 

                            current = grammarAccess.getServiceEnumAccess().getDeleteEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getServiceEnumAccess().getDeleteEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1428:6: (enumLiteral_7= 'all' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1428:6: (enumLiteral_7= 'all' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1428:8: enumLiteral_7= 'all'
                    {
                    enumLiteral_7=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleServiceEnum3140); 

                            current = grammarAccess.getServiceEnumAccess().getAllEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getServiceEnumAccess().getAllEnumLiteralDeclaration_7()); 
                        

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1438:1: ruleDataEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator ruleDataEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1440:28: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1441:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1441:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt32=1;
                }
                break;
            case 52:
                {
                alt32=2;
                }
                break;
            case 53:
                {
                alt32=3;
                }
                break;
            case 54:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1441:2: (enumLiteral_0= 'Boolean' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1441:2: (enumLiteral_0= 'Boolean' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1441:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleDataEnum3185); 

                            current = grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1447:6: (enumLiteral_1= 'Double' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1447:6: (enumLiteral_1= 'Double' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1447:8: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleDataEnum3202); 

                            current = grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1453:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1453:6: (enumLiteral_2= 'Integer' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1453:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleDataEnum3219); 

                            current = grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1459:6: (enumLiteral_3= 'String' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1459:6: (enumLiteral_3= 'String' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1459:8: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleDataEnum3236); 

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
        public static final BitSet FOLLOW_11_in_ruleRoot123 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRoot135 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRoot156 = new BitSet(new long[]{0x0000000000002800L});
        public static final BitSet FOLLOW_ruleArtifact_in_ruleRoot179 = new BitSet(new long[]{0x0000000110802002L});
        public static final BitSet FOLLOW_ruleArtifact_in_ruleRoot201 = new BitSet(new long[]{0x0000000110802002L});
        public static final BitSet FOLLOW_ruleEntity_in_ruleRoot228 = new BitSet(new long[]{0x0000000110802002L});
        public static final BitSet FOLLOW_ruleService_in_ruleRoot255 = new BitSet(new long[]{0x0000000110802002L});
        public static final BitSet FOLLOW_ruleService_in_entryRuleService293 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_ruleService350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_ruleService377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute412 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_ruleAttribute469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_ruleAttribute496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifactID_in_ruleAttribute523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtifact570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleArtifact607 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifact628 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_14_in_ruleArtifact641 = new BitSet(new long[]{0x0000000000168000L});
        public static final BitSet FOLLOW_15_in_ruleArtifact654 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleArtifact666 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifact687 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_17_in_ruleArtifact702 = new BitSet(new long[]{0x000007F000000000L});
        public static final BitSet FOLLOW_ruleFormatEnum_in_ruleArtifact723 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_18_in_ruleArtifact738 = new BitSet(new long[]{0x0007F80000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleArtifact759 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleArtifact772 = new BitSet(new long[]{0x0007F80000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleArtifact793 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleArtifact809 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleArtifact823 = new BitSet(new long[]{0x000000000F400030L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleArtifact844 = new BitSet(new long[]{0x000000000F400030L});
        public static final BitSet FOLLOW_22_in_ruleArtifact857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity893 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleEntity940 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntity961 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEntity973 = new BitSet(new long[]{0x000000000F400030L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity994 = new BitSet(new long[]{0x000000000F400030L});
        public static final BitSet FOLLOW_22_in_ruleEntity1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1044 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive1168 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitive1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rulePrimitive1221 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_rulePrimitive1253 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimitive1288 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePrimitive1300 = new BitSet(new long[]{0x0078000000000000L});
        public static final BitSet FOLLOW_ruleDataEnum_in_rulePrimitive1321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReference1367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleReference1404 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_24_in_ruleReference1422 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReference1457 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReference1469 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReference1492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifactID_in_entryRuleArtifactID1528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtifactID1538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleArtifactID1575 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_24_in_ruleArtifactID1593 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifactID1628 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleArtifactID1640 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifactID1663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_entryRuleOnService1699 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnService1709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnService1757 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleOnService1769 = new BitSet(new long[]{0x0007F80000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleOnService1790 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleOnService1803 = new BitSet(new long[]{0x0007F80000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleOnService1824 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleOnService1838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_entryRuleSimpleService1874 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleService1884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleSimpleService1930 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1951 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleSimpleService1963 = new BitSet(new long[]{0x00000000E0400000L});
        public static final BitSet FOLLOW_29_in_ruleSimpleService1976 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_ruleInout_in_ruleSimpleService1997 = new BitSet(new long[]{0x00000000C0480000L});
        public static final BitSet FOLLOW_19_in_ruleSimpleService2010 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_ruleInout_in_ruleSimpleService2031 = new BitSet(new long[]{0x00000000C0480000L});
        public static final BitSet FOLLOW_30_in_ruleSimpleService2048 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_ruleInout_in_ruleSimpleService2069 = new BitSet(new long[]{0x0000000080480000L});
        public static final BitSet FOLLOW_19_in_ruleSimpleService2082 = new BitSet(new long[]{0x0000000001000030L});
        public static final BitSet FOLLOW_ruleInout_in_ruleSimpleService2103 = new BitSet(new long[]{0x0000000080480000L});
        public static final BitSet FOLLOW_31_in_ruleSimpleService2120 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleOnService_in_ruleSimpleService2141 = new BitSet(new long[]{0x0000000080400000L});
        public static final BitSet FOLLOW_22_in_ruleSimpleService2155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_entryRuleMultiService2191 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiService2201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleMultiService2238 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2259 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_14_in_ruleMultiService2272 = new BitSet(new long[]{0x0000000200100000L});
        public static final BitSet FOLLOW_33_in_ruleMultiService2290 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMultiService2316 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleMultiService2330 = new BitSet(new long[]{0x0000000080040000L});
        public static final BitSet FOLLOW_31_in_ruleMultiService2343 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleOnService_in_ruleMultiService2364 = new BitSet(new long[]{0x0000000080040000L});
        public static final BitSet FOLLOW_18_in_ruleMultiService2378 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2401 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMultiService2414 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2437 = new BitSet(new long[]{0x0000000000480000L});
        public static final BitSet FOLLOW_22_in_ruleMultiService2451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_entryRuleInout2487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInout2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleInout2540 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInout2577 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleInout2590 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInout2602 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleComp_in_ruleInout2623 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInout2635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComp_in_entryRuleComp2674 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComp2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComp2732 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_16_in_ruleComp2751 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComp2773 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_35_in_ruleComp2793 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComp2815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleFormatEnum2874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleFormatEnum2891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleFormatEnum2908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleFormatEnum2925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleFormatEnum2942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleFormatEnum2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleFormatEnum2976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleServiceEnum3021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleServiceEnum3038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleServiceEnum3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleServiceEnum3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleServiceEnum3089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleServiceEnum3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleServiceEnum3123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleServiceEnum3140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleDataEnum3185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleDataEnum3202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleDataEnum3219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleDataEnum3236 = new BitSet(new long[]{0x0000000000000002L});
    }


}