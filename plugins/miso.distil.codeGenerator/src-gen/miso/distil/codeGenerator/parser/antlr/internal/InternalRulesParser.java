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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Artifact'", "'['", "'extension '", "'.'", "'format '", "'services : '", "','", "']'", "'{'", "'}'", "'Entity'", "'many'", "'required'", "':'", "'ref'", "'id'", "'Service'", "'input : '", "'output : '", "'when : '", "'MultiService'", "'parallel'", "'with'", "'='", "'XMI'", "'BINARY'", "'TEXT'", "'XML'", "'JSON'", "'ATL'", "'ZIP'", "'upload'", "'download'", "'update'", "'read'", "'readAll'", "'search'", "'delete'", "'all'", "'Boolean'", "'Double'", "'Integer'", "'String'"
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:77:1: ruleRoot returns [EObject current=null] : ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_artifacts_0_0 = null;

        EObject lv_artifacts_1_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_services_3_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:80:28: ( ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:1: ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:1: ( ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )* )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:2: ( (lv_artifacts_0_0= ruleArtifact ) ) ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )*
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:81:2: ( (lv_artifacts_0_0= ruleArtifact ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:82:1: (lv_artifacts_0_0= ruleArtifact )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:82:1: (lv_artifacts_0_0= ruleArtifact )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:83:3: lv_artifacts_0_0= ruleArtifact
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

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:99:2: ( ( (lv_artifacts_1_0= ruleArtifact ) ) | ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_services_3_0= ruleService ) ) )*
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
                case 27:
                case 31:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:99:3: ( (lv_artifacts_1_0= ruleArtifact ) )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:99:3: ( (lv_artifacts_1_0= ruleArtifact ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:100:1: (lv_artifacts_1_0= ruleArtifact )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:100:1: (lv_artifacts_1_0= ruleArtifact )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:101:3: lv_artifacts_1_0= ruleArtifact
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
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:118:6: ( (lv_entities_2_0= ruleEntity ) )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:118:6: ( (lv_entities_2_0= ruleEntity ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:119:1: (lv_entities_2_0= ruleEntity )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:119:1: (lv_entities_2_0= ruleEntity )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:120:3: lv_entities_2_0= ruleEntity
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
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:137:6: ( (lv_services_3_0= ruleService ) )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:137:6: ( (lv_services_3_0= ruleService ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:138:1: (lv_services_3_0= ruleService )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:138:1: (lv_services_3_0= ruleService )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:139:3: lv_services_3_0= ruleService
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


    // $ANTLR start "entryRuleService"
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:163:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:164:2: (iv_ruleService= ruleService EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:165:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_entryRuleService245);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService255); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:172:1: ruleService returns [EObject current=null] : (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleService_0 = null;

        EObject this_MultiService_1 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:175:28: ( (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:176:1: (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:176:1: (this_SimpleService_0= ruleSimpleService | this_MultiService_1= ruleMultiService )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==31) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:177:5: this_SimpleService_0= ruleSimpleService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getSimpleServiceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_ruleService302);
                    this_SimpleService_0=ruleSimpleService();

                    state._fsp--;

                     
                            current = this_SimpleService_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:187:5: this_MultiService_1= ruleMultiService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getMultiServiceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_ruleService329);
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:203:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:204:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:205:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute364);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute374); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:212:1: ruleAttribute returns [EObject current=null] : (this_Primitive_0= rulePrimitive | this_Reference_1= ruleReference | this_ArtifactID_2= ruleArtifactID ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Primitive_0 = null;

        EObject this_Reference_1 = null;

        EObject this_ArtifactID_2 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:215:28: ( (this_Primitive_0= rulePrimitive | this_Reference_1= ruleReference | this_ArtifactID_2= ruleArtifactID ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:216:1: (this_Primitive_0= rulePrimitive | this_Reference_1= ruleReference | this_ArtifactID_2= ruleArtifactID )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:216:1: (this_Primitive_0= rulePrimitive | this_Reference_1= ruleReference | this_ArtifactID_2= ruleArtifactID )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 22:
            case 23:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:217:5: this_Primitive_0= rulePrimitive
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getPrimitiveParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_ruleAttribute421);
                    this_Primitive_0=rulePrimitive();

                    state._fsp--;

                     
                            current = this_Primitive_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:227:5: this_Reference_1= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getReferenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReference_in_ruleAttribute448);
                    this_Reference_1=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:237:5: this_ArtifactID_2= ruleArtifactID
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getArtifactIDParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleArtifactID_in_ruleAttribute475);
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:255:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:256:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:257:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_entryRuleArtifact512);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtifact522); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:264:1: ruleArtifact returns [EObject current=null] : (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' ) ;
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
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:267:28: ( (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:268:1: (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:268:1: (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:268:3: otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )? otherlv_13= '{' ( (lv_attributes_14_0= ruleAttribute ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleArtifact559); 

                	newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:272:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:273:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:273:1: (lv_name_1_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:274:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifact580);
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

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:290:2: (otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:290:4: otherlv_2= '[' (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )? (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )? (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )? otherlv_12= ']'
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleArtifact593); 

                        	newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:294:1: (otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==13) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:294:3: otherlv_3= 'extension ' otherlv_4= '.' ( (lv_extension_5_0= ruleEString ) )
                            {
                            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleArtifact606); 

                                	newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getExtensionKeyword_2_1_0());
                                
                            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleArtifact618); 

                                	newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getFullStopKeyword_2_1_1());
                                
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:302:1: ( (lv_extension_5_0= ruleEString ) )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:303:1: (lv_extension_5_0= ruleEString )
                            {
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:303:1: (lv_extension_5_0= ruleEString )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:304:3: lv_extension_5_0= ruleEString
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_2_1_2_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifact639);
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

                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:320:4: (otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==15) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:320:6: otherlv_6= 'format ' ( (lv_format_7_0= ruleFormatEnum ) )
                            {
                            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArtifact654); 

                                	newLeafNode(otherlv_6, grammarAccess.getArtifactAccess().getFormatKeyword_2_2_0());
                                
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:324:1: ( (lv_format_7_0= ruleFormatEnum ) )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:325:1: (lv_format_7_0= ruleFormatEnum )
                            {
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:325:1: (lv_format_7_0= ruleFormatEnum )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:326:3: lv_format_7_0= ruleFormatEnum
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_2_2_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleFormatEnum_in_ruleArtifact675);
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

                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:342:4: (otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==16) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:342:6: otherlv_8= 'services : ' ( (lv_basicServices_9_0= ruleServiceEnum ) ) (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )*
                            {
                            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleArtifact690); 

                                	newLeafNode(otherlv_8, grammarAccess.getArtifactAccess().getServicesKeyword_2_3_0());
                                
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:346:1: ( (lv_basicServices_9_0= ruleServiceEnum ) )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:347:1: (lv_basicServices_9_0= ruleServiceEnum )
                            {
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:347:1: (lv_basicServices_9_0= ruleServiceEnum )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:348:3: lv_basicServices_9_0= ruleServiceEnum
                            {
                             
                            	        newCompositeNode(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleArtifact711);
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

                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:364:2: (otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==17) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:364:4: otherlv_10= ',' ( (lv_basicServices_11_0= ruleServiceEnum ) )
                            	    {
                            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleArtifact724); 

                            	        	newLeafNode(otherlv_10, grammarAccess.getArtifactAccess().getCommaKeyword_2_3_2_0());
                            	        
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:368:1: ( (lv_basicServices_11_0= ruleServiceEnum ) )
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:369:1: (lv_basicServices_11_0= ruleServiceEnum )
                            	    {
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:369:1: (lv_basicServices_11_0= ruleServiceEnum )
                            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:370:3: lv_basicServices_11_0= ruleServiceEnum
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleArtifact745);
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
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleArtifact761); 

                        	newLeafNode(otherlv_12, grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_2_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleArtifact775); 

                	newLeafNode(otherlv_13, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:394:1: ( (lv_attributes_14_0= ruleAttribute ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||(LA9_0>=22 && LA9_0<=23)||(LA9_0>=25 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:395:1: (lv_attributes_14_0= ruleAttribute )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:395:1: (lv_attributes_14_0= ruleAttribute )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:396:3: lv_attributes_14_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleArtifact796);
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
            	    break loop9;
                }
            } while (true);

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleArtifact809); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:424:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:425:2: (iv_ruleEntity= ruleEntity EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:426:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity845);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity855); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:433:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:436:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:437:1: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:437:1: (otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:437:3: otherlv_0= 'Entity' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEntity892); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:441:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:442:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:442:1: (lv_name_1_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:443:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEntity913);
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

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEntity925); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:463:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||(LA10_0>=22 && LA10_0<=23)||(LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:464:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:464:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:465:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleEntity946);
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
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEntity959); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:493:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:494:2: (iv_ruleEString= ruleEString EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:495:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString996);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1007); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:502:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:505:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:506:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:506:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:506:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1047); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:514:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1073); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:531:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:532:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:533:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_entryRulePrimitive1120);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitive1130); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:540:1: rulePrimitive returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_required_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:543:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:544:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:544:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:544:2: ( (lv_many_0_0= 'many' ) )? ( (lv_required_1_0= 'required' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataEnum ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:544:2: ( (lv_many_0_0= 'many' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:545:1: (lv_many_0_0= 'many' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:545:1: (lv_many_0_0= 'many' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:546:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitive1173); 

                            newLeafNode(lv_many_0_0, grammarAccess.getPrimitiveAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:559:3: ( (lv_required_1_0= 'required' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:560:1: (lv_required_1_0= 'required' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:560:1: (lv_required_1_0= 'required' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:561:3: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePrimitive1205); 

                            newLeafNode(lv_required_1_0, grammarAccess.getPrimitiveAccess().getRequiredRequiredKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:574:3: ( (lv_name_2_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:575:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:575:1: (lv_name_2_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:576:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePrimitive1240);
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

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePrimitive1252); 

                	newLeafNode(otherlv_3, grammarAccess.getPrimitiveAccess().getColonKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:596:1: ( (lv_type_4_0= ruleDataEnum ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:597:1: (lv_type_4_0= ruleDataEnum )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:597:1: (lv_type_4_0= ruleDataEnum )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:598:3: lv_type_4_0= ruleDataEnum
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveAccess().getTypeDataEnumEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataEnum_in_rulePrimitive1273);
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:622:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:623:2: (iv_ruleReference= ruleReference EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:624:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReference_in_entryRuleReference1309);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReference1319); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:631:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:634:28: ( (otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:635:1: (otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:635:1: (otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:635:3: otherlv_0= 'ref' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleReference1356); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:639:1: ( (lv_many_1_0= 'many' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:640:1: (lv_many_1_0= 'many' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:640:1: (lv_many_1_0= 'many' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:641:3: lv_many_1_0= 'many'
                    {
                    lv_many_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleReference1374); 

                            newLeafNode(lv_many_1_0, grammarAccess.getReferenceAccess().getManyManyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:654:3: ( (lv_name_2_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:655:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:655:1: (lv_name_2_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:656:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReference1409);
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

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleReference1421); 

                	newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getColonKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:676:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:677:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:677:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:678:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReference1444);
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:699:1: entryRuleArtifactID returns [EObject current=null] : iv_ruleArtifactID= ruleArtifactID EOF ;
    public final EObject entryRuleArtifactID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifactID = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:700:2: (iv_ruleArtifactID= ruleArtifactID EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:701:2: iv_ruleArtifactID= ruleArtifactID EOF
            {
             newCompositeNode(grammarAccess.getArtifactIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifactID_in_entryRuleArtifactID1480);
            iv_ruleArtifactID=ruleArtifactID();

            state._fsp--;

             current =iv_ruleArtifactID; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtifactID1490); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:708:1: ruleArtifactID returns [EObject current=null] : (otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleArtifactID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_many_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:711:28: ( (otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:712:1: (otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:712:1: (otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:712:3: otherlv_0= 'id' ( (lv_many_1_0= 'many' ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleArtifactID1527); 

                	newLeafNode(otherlv_0, grammarAccess.getArtifactIDAccess().getIdKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:716:1: ( (lv_many_1_0= 'many' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:717:1: (lv_many_1_0= 'many' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:717:1: (lv_many_1_0= 'many' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:718:3: lv_many_1_0= 'many'
                    {
                    lv_many_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleArtifactID1545); 

                            newLeafNode(lv_many_1_0, grammarAccess.getArtifactIDAccess().getManyManyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArtifactIDRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:731:3: ( (lv_name_2_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:732:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:732:1: (lv_name_2_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:733:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getArtifactIDAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifactID1580);
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

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleArtifactID1592); 

                	newLeafNode(otherlv_3, grammarAccess.getArtifactIDAccess().getColonKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:753:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:754:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:754:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:755:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArtifactIDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getArtifactIDAccess().getTypeArtifactCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleArtifactID1615);
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:776:1: entryRuleOnService returns [EObject current=null] : iv_ruleOnService= ruleOnService EOF ;
    public final EObject entryRuleOnService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnService = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:777:2: (iv_ruleOnService= ruleOnService EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:778:2: iv_ruleOnService= ruleOnService EOF
            {
             newCompositeNode(grammarAccess.getOnServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_entryRuleOnService1651);
            iv_ruleOnService=ruleOnService();

            state._fsp--;

             current =iv_ruleOnService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnService1661); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:785:1: ruleOnService returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleOnService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_whenServices_2_0 = null;

        Enumerator lv_whenServices_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:788:28: ( ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:789:1: ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:789:1: ( ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:789:2: ( ( ruleEString ) ) otherlv_1= '[' ( (lv_whenServices_2_0= ruleServiceEnum ) ) (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )* otherlv_5= ']'
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:789:2: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:790:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:790:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:791:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOnServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOnServiceAccess().getArtifactArtifactCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOnService1709);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOnService1721); 

                	newLeafNode(otherlv_1, grammarAccess.getOnServiceAccess().getLeftSquareBracketKeyword_1());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:808:1: ( (lv_whenServices_2_0= ruleServiceEnum ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:809:1: (lv_whenServices_2_0= ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:809:1: (lv_whenServices_2_0= ruleServiceEnum )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:810:3: lv_whenServices_2_0= ruleServiceEnum
            {
             
            	        newCompositeNode(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleOnService1742);
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

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:826:2: (otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:826:4: otherlv_3= ',' ( (lv_whenServices_4_0= ruleServiceEnum ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOnService1755); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOnServiceAccess().getCommaKeyword_3_0());
            	        
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:830:1: ( (lv_whenServices_4_0= ruleServiceEnum ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:831:1: (lv_whenServices_4_0= ruleServiceEnum )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:831:1: (lv_whenServices_4_0= ruleServiceEnum )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:832:3: lv_whenServices_4_0= ruleServiceEnum
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_ruleOnService1776);
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
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOnService1790); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:860:1: entryRuleSimpleService returns [EObject current=null] : iv_ruleSimpleService= ruleSimpleService EOF ;
    public final EObject entryRuleSimpleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleService = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:861:2: (iv_ruleSimpleService= ruleSimpleService EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:862:2: iv_ruleSimpleService= ruleSimpleService EOF
            {
             newCompositeNode(grammarAccess.getSimpleServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_entryRuleSimpleService1826);
            iv_ruleSimpleService=ruleSimpleService();

            state._fsp--;

             current =iv_ruleSimpleService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleService1836); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:869:1: ruleSimpleService returns [EObject current=null] : ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}' ) ;
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
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:872:28: ( ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:873:1: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:873:1: ( () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:873:2: () otherlv_1= 'Service' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )? (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )? (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )* otherlv_14= '}'
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:873:2: ()
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:874:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleServiceAccess().getSimpleServiceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSimpleService1882); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleServiceAccess().getServiceKeyword_1());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:883:1: ( (lv_name_2_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:884:1: (lv_name_2_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:884:1: (lv_name_2_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:885:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSimpleService1903);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSimpleService1915); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:905:1: (otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:905:3: otherlv_4= 'input : ' ( (lv_input_5_0= ruleInout ) ) (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )*
                    {
                    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSimpleService1928); 

                        	newLeafNode(otherlv_4, grammarAccess.getSimpleServiceAccess().getInputKeyword_4_0());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:909:1: ( (lv_input_5_0= ruleInout ) )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:910:1: (lv_input_5_0= ruleInout )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:910:1: (lv_input_5_0= ruleInout )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:911:3: lv_input_5_0= ruleInout
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInout_in_ruleSimpleService1949);
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

                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:927:2: (otherlv_6= ',' ( (lv_input_7_0= ruleInout ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:927:4: otherlv_6= ',' ( (lv_input_7_0= ruleInout ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleService1962); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSimpleServiceAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:931:1: ( (lv_input_7_0= ruleInout ) )
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:932:1: (lv_input_7_0= ruleInout )
                    	    {
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:932:1: (lv_input_7_0= ruleInout )
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:933:3: lv_input_7_0= ruleInout
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInout_in_ruleSimpleService1983);
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
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:949:6: (otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:949:8: otherlv_8= 'output : ' ( (lv_output_9_0= ruleInout ) ) (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )*
                    {
                    otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSimpleService2000); 

                        	newLeafNode(otherlv_8, grammarAccess.getSimpleServiceAccess().getOutputKeyword_5_0());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:953:1: ( (lv_output_9_0= ruleInout ) )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:954:1: (lv_output_9_0= ruleInout )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:954:1: (lv_output_9_0= ruleInout )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:955:3: lv_output_9_0= ruleInout
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInout_in_ruleSimpleService2021);
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

                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:971:2: (otherlv_10= ',' ( (lv_output_11_0= ruleInout ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:971:4: otherlv_10= ',' ( (lv_output_11_0= ruleInout ) )
                    	    {
                    	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSimpleService2034); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSimpleServiceAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:975:1: ( (lv_output_11_0= ruleInout ) )
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:976:1: (lv_output_11_0= ruleInout )
                    	    {
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:976:1: (lv_output_11_0= ruleInout )
                    	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:977:3: lv_output_11_0= ruleInout
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInout_in_ruleSimpleService2055);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:993:6: (otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:993:8: otherlv_12= 'when : ' ( (lv_when_13_0= ruleOnService ) )
            	    {
            	    otherlv_12=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSimpleService2072); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSimpleServiceAccess().getWhenKeyword_6_0());
            	        
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:997:1: ( (lv_when_13_0= ruleOnService ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:998:1: (lv_when_13_0= ruleOnService )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:998:1: (lv_when_13_0= ruleOnService )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:999:3: lv_when_13_0= ruleOnService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOnService_in_ruleSimpleService2093);
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
            	    break loop21;
                }
            } while (true);

            otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSimpleService2107); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1027:1: entryRuleMultiService returns [EObject current=null] : iv_ruleMultiService= ruleMultiService EOF ;
    public final EObject entryRuleMultiService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiService = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1028:2: (iv_ruleMultiService= ruleMultiService EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1029:2: iv_ruleMultiService= ruleMultiService EOF
            {
             newCompositeNode(grammarAccess.getMultiServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_entryRuleMultiService2143);
            iv_ruleMultiService=ruleMultiService();

            state._fsp--;

             current =iv_ruleMultiService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiService2153); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1036:1: ruleMultiService returns [EObject current=null] : (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' ) ;
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
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1039:28: ( (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1040:1: (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1040:1: (otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}' )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1040:3: otherlv_0= 'MultiService' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )* otherlv_8= 'services : ' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )+ otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMultiService2190); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiServiceAccess().getMultiServiceKeyword_0());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1044:1: ( (lv_name_1_0= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1045:1: (lv_name_1_0= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1045:1: (lv_name_1_0= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1046:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiServiceAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2211);
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

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1062:2: (otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1062:4: otherlv_2= '[' ( (lv_parallel_3_0= 'parallel' ) )? otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMultiService2224); 

                        	newLeafNode(otherlv_2, grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1066:1: ( (lv_parallel_3_0= 'parallel' ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==32) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1067:1: (lv_parallel_3_0= 'parallel' )
                            {
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1067:1: (lv_parallel_3_0= 'parallel' )
                            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1068:3: lv_parallel_3_0= 'parallel'
                            {
                            lv_parallel_3_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMultiService2242); 

                                    newLeafNode(lv_parallel_3_0, grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getMultiServiceRule());
                            	        }
                                   		setWithLastConsumed(current, "parallel", true, "parallel");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMultiService2268); 

                        	newLeafNode(otherlv_4, grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMultiService2282); 

                	newLeafNode(otherlv_5, grammarAccess.getMultiServiceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1089:1: (otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1089:3: otherlv_6= 'when : ' ( (lv_when_7_0= ruleOnService ) )
            	    {
            	    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultiService2295); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMultiServiceAccess().getWhenKeyword_4_0());
            	        
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1093:1: ( (lv_when_7_0= ruleOnService ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1094:1: (lv_when_7_0= ruleOnService )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1094:1: (lv_when_7_0= ruleOnService )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1095:3: lv_when_7_0= ruleOnService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiServiceAccess().getWhenOnServiceParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOnService_in_ruleMultiService2316);
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
            	    break loop24;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMultiService2330); 

                	newLeafNode(otherlv_8, grammarAccess.getMultiServiceAccess().getServicesKeyword_5());
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1115:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1116:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1116:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1117:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMultiServiceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2353);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1130:2: (otherlv_10= ',' ( ( ruleEString ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1130:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMultiService2366); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMultiServiceAccess().getCommaKeyword_7_0());
            	        
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1134:1: ( ( ruleEString ) )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1135:1: ( ruleEString )
            	    {
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1135:1: ( ruleEString )
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1136:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultiServiceRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMultiService2389);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMultiService2403); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1161:1: entryRuleInout returns [EObject current=null] : iv_ruleInout= ruleInout EOF ;
    public final EObject entryRuleInout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInout = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1162:2: (iv_ruleInout= ruleInout EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1163:2: iv_ruleInout= ruleInout EOF
            {
             newCompositeNode(grammarAccess.getInoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_entryRuleInout2439);
            iv_ruleInout=ruleInout();

            state._fsp--;

             current =iv_ruleInout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInout2449); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1170:1: ruleInout returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )? ) ;
    public final EObject ruleInout() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_compatibility_4_0 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1173:28: ( ( ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )? ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1174:1: ( ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )? )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1174:1: ( ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )? )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1174:2: ( (lv_many_0_0= 'many' ) )? ( ( ruleEString ) ) (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )?
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1174:2: ( (lv_many_0_0= 'many' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==22) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1175:1: (lv_many_0_0= 'many' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1175:1: (lv_many_0_0= 'many' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1176:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInout2492); 

                            newLeafNode(lv_many_0_0, grammarAccess.getInoutAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInoutRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1189:3: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1190:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1190:1: ( ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1191:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInoutRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInoutAccess().getTypeAbstractEntityCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInout2529);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1204:2: (otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1204:4: otherlv_2= '[' otherlv_3= 'with' ( (lv_compatibility_4_0= ruleComp ) ) otherlv_5= ']'
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInout2542); 

                        	newLeafNode(otherlv_2, grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInout2554); 

                        	newLeafNode(otherlv_3, grammarAccess.getInoutAccess().getWithKeyword_2_1());
                        
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1212:1: ( (lv_compatibility_4_0= ruleComp ) )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1213:1: (lv_compatibility_4_0= ruleComp )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1213:1: (lv_compatibility_4_0= ruleComp )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1214:3: lv_compatibility_4_0= ruleComp
                    {
                     
                    	        newCompositeNode(grammarAccess.getInoutAccess().getCompatibilityCompParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleComp_in_ruleInout2575);
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

                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInout2587); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1242:1: entryRuleComp returns [String current=null] : iv_ruleComp= ruleComp EOF ;
    public final String entryRuleComp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComp = null;


        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1243:2: (iv_ruleComp= ruleComp EOF )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1244:2: iv_ruleComp= ruleComp EOF
            {
             newCompositeNode(grammarAccess.getCompRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComp_in_entryRuleComp2626);
            iv_ruleComp=ruleComp();

            state._fsp--;

             current =iv_ruleComp.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComp2637); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1251:1: ruleComp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString ) ;
    public final AntlrDatatypeRuleToken ruleComp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_2 = null;

        AntlrDatatypeRuleToken this_EString_4 = null;


         enterRule(); 
            
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1254:28: ( (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1255:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1255:1: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1256:5: this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* kw= '=' this_EString_4= ruleEString
            {
             
                    newCompositeNode(grammarAccess.getCompAccess().getEStringParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComp2684);
            this_EString_0=ruleEString();

            state._fsp--;


            		current.merge(this_EString_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1266:1: (kw= '.' this_EString_2= ruleEString )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1267:2: kw= '.' this_EString_2= ruleEString
            	    {
            	    kw=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleComp2703); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCompAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getCompAccess().getEStringParserRuleCall_1_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComp2725);
            	    this_EString_2=ruleEString();

            	    state._fsp--;


            	    		current.merge(this_EString_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleComp2745); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCompAccess().getEqualsSignKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getCompAccess().getEStringParserRuleCall_3()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleComp2767);
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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1308:1: ruleFormatEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) ) ;
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
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1310:28: ( ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1311:1: ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1311:1: ( (enumLiteral_0= 'XMI' ) | (enumLiteral_1= 'BINARY' ) | (enumLiteral_2= 'TEXT' ) | (enumLiteral_3= 'XML' ) | (enumLiteral_4= 'JSON' ) | (enumLiteral_5= 'ATL' ) | (enumLiteral_6= 'ZIP' ) )
            int alt29=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt29=1;
                }
                break;
            case 36:
                {
                alt29=2;
                }
                break;
            case 37:
                {
                alt29=3;
                }
                break;
            case 38:
                {
                alt29=4;
                }
                break;
            case 39:
                {
                alt29=5;
                }
                break;
            case 40:
                {
                alt29=6;
                }
                break;
            case 41:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1311:2: (enumLiteral_0= 'XMI' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1311:2: (enumLiteral_0= 'XMI' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1311:4: enumLiteral_0= 'XMI'
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFormatEnum2826); 

                            current = grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1317:6: (enumLiteral_1= 'BINARY' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1317:6: (enumLiteral_1= 'BINARY' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1317:8: enumLiteral_1= 'BINARY'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleFormatEnum2843); 

                            current = grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1323:6: (enumLiteral_2= 'TEXT' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1323:6: (enumLiteral_2= 'TEXT' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1323:8: enumLiteral_2= 'TEXT'
                    {
                    enumLiteral_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleFormatEnum2860); 

                            current = grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1329:6: (enumLiteral_3= 'XML' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1329:6: (enumLiteral_3= 'XML' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1329:8: enumLiteral_3= 'XML'
                    {
                    enumLiteral_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFormatEnum2877); 

                            current = grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1335:6: (enumLiteral_4= 'JSON' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1335:6: (enumLiteral_4= 'JSON' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1335:8: enumLiteral_4= 'JSON'
                    {
                    enumLiteral_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleFormatEnum2894); 

                            current = grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1341:6: (enumLiteral_5= 'ATL' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1341:6: (enumLiteral_5= 'ATL' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1341:8: enumLiteral_5= 'ATL'
                    {
                    enumLiteral_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleFormatEnum2911); 

                            current = grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1347:6: (enumLiteral_6= 'ZIP' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1347:6: (enumLiteral_6= 'ZIP' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1347:8: enumLiteral_6= 'ZIP'
                    {
                    enumLiteral_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleFormatEnum2928); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1357:1: ruleServiceEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) | (enumLiteral_6= 'delete' ) | (enumLiteral_7= 'all' ) ) ;
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
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1359:28: ( ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) | (enumLiteral_6= 'delete' ) | (enumLiteral_7= 'all' ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1360:1: ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) | (enumLiteral_6= 'delete' ) | (enumLiteral_7= 'all' ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1360:1: ( (enumLiteral_0= 'upload' ) | (enumLiteral_1= 'download' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'read' ) | (enumLiteral_4= 'readAll' ) | (enumLiteral_5= 'search' ) | (enumLiteral_6= 'delete' ) | (enumLiteral_7= 'all' ) )
            int alt30=8;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt30=1;
                }
                break;
            case 43:
                {
                alt30=2;
                }
                break;
            case 44:
                {
                alt30=3;
                }
                break;
            case 45:
                {
                alt30=4;
                }
                break;
            case 46:
                {
                alt30=5;
                }
                break;
            case 47:
                {
                alt30=6;
                }
                break;
            case 48:
                {
                alt30=7;
                }
                break;
            case 49:
                {
                alt30=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1360:2: (enumLiteral_0= 'upload' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1360:2: (enumLiteral_0= 'upload' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1360:4: enumLiteral_0= 'upload'
                    {
                    enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleServiceEnum2973); 

                            current = grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1366:6: (enumLiteral_1= 'download' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1366:6: (enumLiteral_1= 'download' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1366:8: enumLiteral_1= 'download'
                    {
                    enumLiteral_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleServiceEnum2990); 

                            current = grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1372:6: (enumLiteral_2= 'update' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1372:6: (enumLiteral_2= 'update' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1372:8: enumLiteral_2= 'update'
                    {
                    enumLiteral_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleServiceEnum3007); 

                            current = grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1378:6: (enumLiteral_3= 'read' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1378:6: (enumLiteral_3= 'read' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1378:8: enumLiteral_3= 'read'
                    {
                    enumLiteral_3=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleServiceEnum3024); 

                            current = grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1384:6: (enumLiteral_4= 'readAll' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1384:6: (enumLiteral_4= 'readAll' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1384:8: enumLiteral_4= 'readAll'
                    {
                    enumLiteral_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleServiceEnum3041); 

                            current = grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1390:6: (enumLiteral_5= 'search' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1390:6: (enumLiteral_5= 'search' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1390:8: enumLiteral_5= 'search'
                    {
                    enumLiteral_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleServiceEnum3058); 

                            current = grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1396:6: (enumLiteral_6= 'delete' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1396:6: (enumLiteral_6= 'delete' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1396:8: enumLiteral_6= 'delete'
                    {
                    enumLiteral_6=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleServiceEnum3075); 

                            current = grammarAccess.getServiceEnumAccess().getDeleteEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getServiceEnumAccess().getDeleteEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1402:6: (enumLiteral_7= 'all' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1402:6: (enumLiteral_7= 'all' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1402:8: enumLiteral_7= 'all'
                    {
                    enumLiteral_7=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleServiceEnum3092); 

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
    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1412:1: ruleDataEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator ruleDataEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1414:28: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) ) )
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1415:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) )
            {
            // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1415:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'String' ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt31=1;
                }
                break;
            case 51:
                {
                alt31=2;
                }
                break;
            case 52:
                {
                alt31=3;
                }
                break;
            case 53:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1415:2: (enumLiteral_0= 'Boolean' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1415:2: (enumLiteral_0= 'Boolean' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1415:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleDataEnum3137); 

                            current = grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1421:6: (enumLiteral_1= 'Double' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1421:6: (enumLiteral_1= 'Double' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1421:8: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleDataEnum3154); 

                            current = grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1427:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1427:6: (enumLiteral_2= 'Integer' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1427:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleDataEnum3171); 

                            current = grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1433:6: (enumLiteral_3= 'String' )
                    {
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1433:6: (enumLiteral_3= 'String' )
                    // ../miso.distil.codeGenerator/src-gen/miso/distil/codeGenerator/parser/antlr/internal/InternalRules.g:1433:8: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleDataEnum3188); 

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
        public static final BitSet FOLLOW_ruleArtifact_in_ruleRoot131 = new BitSet(new long[]{0x0000000088200802L});
        public static final BitSet FOLLOW_ruleArtifact_in_ruleRoot153 = new BitSet(new long[]{0x0000000088200802L});
        public static final BitSet FOLLOW_ruleEntity_in_ruleRoot180 = new BitSet(new long[]{0x0000000088200802L});
        public static final BitSet FOLLOW_ruleService_in_ruleRoot207 = new BitSet(new long[]{0x0000000088200802L});
        public static final BitSet FOLLOW_ruleService_in_entryRuleService245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_ruleService302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_ruleService329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute364 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_ruleAttribute421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_ruleAttribute448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifactID_in_ruleAttribute475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact512 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtifact522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleArtifact559 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifact580 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_ruleArtifact593 = new BitSet(new long[]{0x000000000005A000L});
        public static final BitSet FOLLOW_13_in_ruleArtifact606 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleArtifact618 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifact639 = new BitSet(new long[]{0x0000000000058000L});
        public static final BitSet FOLLOW_15_in_ruleArtifact654 = new BitSet(new long[]{0x000003F800000000L});
        public static final BitSet FOLLOW_ruleFormatEnum_in_ruleArtifact675 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_16_in_ruleArtifact690 = new BitSet(new long[]{0x0003FC0000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleArtifact711 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleArtifact724 = new BitSet(new long[]{0x0003FC0000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleArtifact745 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleArtifact761 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleArtifact775 = new BitSet(new long[]{0x0000000006D00030L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleArtifact796 = new BitSet(new long[]{0x0000000006D00030L});
        public static final BitSet FOLLOW_20_in_ruleArtifact809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEntity892 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEntity913 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleEntity925 = new BitSet(new long[]{0x0000000006D00030L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity946 = new BitSet(new long[]{0x0000000006D00030L});
        public static final BitSet FOLLOW_20_in_ruleEntity959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString996 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive1120 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitive1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePrimitive1173 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_23_in_rulePrimitive1205 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePrimitive1240 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulePrimitive1252 = new BitSet(new long[]{0x003C000000000000L});
        public static final BitSet FOLLOW_ruleDataEnum_in_rulePrimitive1273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1309 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReference1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleReference1356 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_22_in_ruleReference1374 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReference1409 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleReference1421 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReference1444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifactID_in_entryRuleArtifactID1480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtifactID1490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleArtifactID1527 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_22_in_ruleArtifactID1545 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifactID1580 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleArtifactID1592 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleArtifactID1615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_entryRuleOnService1651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnService1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOnService1709 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOnService1721 = new BitSet(new long[]{0x0003FC0000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleOnService1742 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleOnService1755 = new BitSet(new long[]{0x0003FC0000000000L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_ruleOnService1776 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_18_in_ruleOnService1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_entryRuleSimpleService1826 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleService1836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleSimpleService1882 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSimpleService1903 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSimpleService1915 = new BitSet(new long[]{0x0000000070100000L});
        public static final BitSet FOLLOW_28_in_ruleSimpleService1928 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_ruleInout_in_ruleSimpleService1949 = new BitSet(new long[]{0x0000000060120000L});
        public static final BitSet FOLLOW_17_in_ruleSimpleService1962 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_ruleInout_in_ruleSimpleService1983 = new BitSet(new long[]{0x0000000060120000L});
        public static final BitSet FOLLOW_29_in_ruleSimpleService2000 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_ruleInout_in_ruleSimpleService2021 = new BitSet(new long[]{0x0000000040120000L});
        public static final BitSet FOLLOW_17_in_ruleSimpleService2034 = new BitSet(new long[]{0x0000000000400030L});
        public static final BitSet FOLLOW_ruleInout_in_ruleSimpleService2055 = new BitSet(new long[]{0x0000000040120000L});
        public static final BitSet FOLLOW_30_in_ruleSimpleService2072 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleOnService_in_ruleSimpleService2093 = new BitSet(new long[]{0x0000000040100000L});
        public static final BitSet FOLLOW_20_in_ruleSimpleService2107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_entryRuleMultiService2143 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiService2153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleMultiService2190 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2211 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_12_in_ruleMultiService2224 = new BitSet(new long[]{0x0000000100040000L});
        public static final BitSet FOLLOW_32_in_ruleMultiService2242 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMultiService2268 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMultiService2282 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_30_in_ruleMultiService2295 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleOnService_in_ruleMultiService2316 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_16_in_ruleMultiService2330 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2353 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMultiService2366 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMultiService2389 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleMultiService2403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_entryRuleInout2439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInout2449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleInout2492 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInout2529 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleInout2542 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleInout2554 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleComp_in_ruleInout2575 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleInout2587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComp_in_entryRuleComp2626 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComp2637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComp2684 = new BitSet(new long[]{0x0000000400004000L});
        public static final BitSet FOLLOW_14_in_ruleComp2703 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComp2725 = new BitSet(new long[]{0x0000000400004000L});
        public static final BitSet FOLLOW_34_in_ruleComp2745 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleComp2767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleFormatEnum2826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleFormatEnum2843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleFormatEnum2860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleFormatEnum2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleFormatEnum2894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleFormatEnum2911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleFormatEnum2928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleServiceEnum2973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleServiceEnum2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleServiceEnum3007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleServiceEnum3024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleServiceEnum3041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleServiceEnum3058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleServiceEnum3075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleServiceEnum3092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleDataEnum3137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleDataEnum3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleDataEnum3171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleDataEnum3188 = new BitSet(new long[]{0x0000000000000002L});
    }


}