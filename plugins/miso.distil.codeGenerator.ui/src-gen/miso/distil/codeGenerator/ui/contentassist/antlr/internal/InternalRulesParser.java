package miso.distil.codeGenerator.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import miso.distil.codeGenerator.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XMI'", "'BINARY'", "'TEXT'", "'XML'", "'JSON'", "'ATL'", "'ZIP'", "'upload'", "'download'", "'update'", "'read'", "'readAll'", "'search'", "'delete'", "'all'", "'Boolean'", "'Double'", "'Integer'", "'String'", "'MongoURI'", "':'", "'Artifact'", "'{'", "'}'", "'['", "']'", "'extension '", "'.'", "'format '", "'services : '", "','", "'Entity'", "'ref'", "'id'", "'Service'", "'input : '", "'output : '", "'when : '", "'MultiService'", "'with'", "'='", "'many'", "'required'", "'parallel'"
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
    public String getGrammarFileName() { return "../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g"; }


     
     	private RulesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RulesGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleRoot"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:61:1: ( ruleRoot EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:62:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot61);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot68); 

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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:69:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:73:2: ( ( ( rule__Root__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:74:1: ( ( rule__Root__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:74:1: ( ( rule__Root__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:75:1: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:76:1: ( rule__Root__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:76:2: rule__Root__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0_in_ruleRoot94);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:88:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:89:1: ( ruleService EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:90:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_entryRuleService121);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService128); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:97:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:101:2: ( ( ( rule__Service__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:102:1: ( ( rule__Service__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:102:1: ( ( rule__Service__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:103:1: ( rule__Service__Alternatives )
            {
             before(grammarAccess.getServiceAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:104:1: ( rule__Service__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:104:2: rule__Service__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Alternatives_in_ruleService154);
            rule__Service__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleAttribute"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:116:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:117:1: ( ruleAttribute EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:118:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute181);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute188); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:125:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:129:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:130:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:130:1: ( ( rule__Attribute__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:131:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:132:1: ( rule__Attribute__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:132:2: rule__Attribute__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute214);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleArtifact"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:146:1: entryRuleArtifact : ruleArtifact EOF ;
    public final void entryRuleArtifact() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:147:1: ( ruleArtifact EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:148:1: ruleArtifact EOF
            {
             before(grammarAccess.getArtifactRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_entryRuleArtifact243);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getArtifactRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtifact250); 

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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:155:1: ruleArtifact : ( ( rule__Artifact__Group__0 ) ) ;
    public final void ruleArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:159:2: ( ( ( rule__Artifact__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:160:1: ( ( rule__Artifact__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:160:1: ( ( rule__Artifact__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:161:1: ( rule__Artifact__Group__0 )
            {
             before(grammarAccess.getArtifactAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:162:1: ( rule__Artifact__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:162:2: rule__Artifact__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__0_in_ruleArtifact276);
            rule__Artifact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getGroup()); 

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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleEntity"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:174:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:175:1: ( ruleEntity EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:176:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity303);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity310); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:183:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:187:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:188:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:188:1: ( ( rule__Entity__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:189:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:190:1: ( rule__Entity__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:190:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0_in_ruleEntity336);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEString"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:202:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:203:1: ( ruleEString EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:204:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString363);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString370); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:211:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:215:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:216:1: ( ( rule__EString__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:216:1: ( ( rule__EString__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:217:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:218:1: ( rule__EString__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:218:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString396);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePrimitive"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:232:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:233:1: ( rulePrimitive EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:234:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_entryRulePrimitive425);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitive432); 

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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:241:1: rulePrimitive : ( ( rule__Primitive__Group__0 ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:245:2: ( ( ( rule__Primitive__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:246:1: ( ( rule__Primitive__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:246:1: ( ( rule__Primitive__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:247:1: ( rule__Primitive__Group__0 )
            {
             before(grammarAccess.getPrimitiveAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:248:1: ( rule__Primitive__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:248:2: rule__Primitive__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__0_in_rulePrimitive458);
            rule__Primitive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleReference"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:260:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:261:1: ( ruleReference EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:262:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReference_in_entryRuleReference485);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReference492); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:269:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:273:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:274:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:274:1: ( ( rule__Reference__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:275:1: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:276:1: ( rule__Reference__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:276:2: rule__Reference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__0_in_ruleReference518);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleArtifactID"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:288:1: entryRuleArtifactID : ruleArtifactID EOF ;
    public final void entryRuleArtifactID() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:289:1: ( ruleArtifactID EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:290:1: ruleArtifactID EOF
            {
             before(grammarAccess.getArtifactIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifactID_in_entryRuleArtifactID545);
            ruleArtifactID();

            state._fsp--;

             after(grammarAccess.getArtifactIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtifactID552); 

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
    // $ANTLR end "entryRuleArtifactID"


    // $ANTLR start "ruleArtifactID"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:297:1: ruleArtifactID : ( ( rule__ArtifactID__Group__0 ) ) ;
    public final void ruleArtifactID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:301:2: ( ( ( rule__ArtifactID__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:302:1: ( ( rule__ArtifactID__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:302:1: ( ( rule__ArtifactID__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:303:1: ( rule__ArtifactID__Group__0 )
            {
             before(grammarAccess.getArtifactIDAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:304:1: ( rule__ArtifactID__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:304:2: rule__ArtifactID__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__0_in_ruleArtifactID578);
            rule__ArtifactID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtifactIDAccess().getGroup()); 

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
    // $ANTLR end "ruleArtifactID"


    // $ANTLR start "entryRuleOnService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:316:1: entryRuleOnService : ruleOnService EOF ;
    public final void entryRuleOnService() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:317:1: ( ruleOnService EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:318:1: ruleOnService EOF
            {
             before(grammarAccess.getOnServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_entryRuleOnService605);
            ruleOnService();

            state._fsp--;

             after(grammarAccess.getOnServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnService612); 

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
    // $ANTLR end "entryRuleOnService"


    // $ANTLR start "ruleOnService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:325:1: ruleOnService : ( ( rule__OnService__Group__0 ) ) ;
    public final void ruleOnService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:329:2: ( ( ( rule__OnService__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:330:1: ( ( rule__OnService__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:330:1: ( ( rule__OnService__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:331:1: ( rule__OnService__Group__0 )
            {
             before(grammarAccess.getOnServiceAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:332:1: ( rule__OnService__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:332:2: rule__OnService__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__0_in_ruleOnService638);
            rule__OnService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleOnService"


    // $ANTLR start "entryRuleSimpleService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:344:1: entryRuleSimpleService : ruleSimpleService EOF ;
    public final void entryRuleSimpleService() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:345:1: ( ruleSimpleService EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:346:1: ruleSimpleService EOF
            {
             before(grammarAccess.getSimpleServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_entryRuleSimpleService665);
            ruleSimpleService();

            state._fsp--;

             after(grammarAccess.getSimpleServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleService672); 

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
    // $ANTLR end "entryRuleSimpleService"


    // $ANTLR start "ruleSimpleService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:353:1: ruleSimpleService : ( ( rule__SimpleService__Group__0 ) ) ;
    public final void ruleSimpleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:357:2: ( ( ( rule__SimpleService__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:358:1: ( ( rule__SimpleService__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:358:1: ( ( rule__SimpleService__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:359:1: ( rule__SimpleService__Group__0 )
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:360:1: ( rule__SimpleService__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:360:2: rule__SimpleService__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__0_in_ruleSimpleService698);
            rule__SimpleService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleService"


    // $ANTLR start "entryRuleMultiService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:372:1: entryRuleMultiService : ruleMultiService EOF ;
    public final void entryRuleMultiService() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:373:1: ( ruleMultiService EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:374:1: ruleMultiService EOF
            {
             before(grammarAccess.getMultiServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_entryRuleMultiService725);
            ruleMultiService();

            state._fsp--;

             after(grammarAccess.getMultiServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiService732); 

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
    // $ANTLR end "entryRuleMultiService"


    // $ANTLR start "ruleMultiService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:381:1: ruleMultiService : ( ( rule__MultiService__Group__0 ) ) ;
    public final void ruleMultiService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:385:2: ( ( ( rule__MultiService__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:386:1: ( ( rule__MultiService__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:386:1: ( ( rule__MultiService__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:387:1: ( rule__MultiService__Group__0 )
            {
             before(grammarAccess.getMultiServiceAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:388:1: ( rule__MultiService__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:388:2: rule__MultiService__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__0_in_ruleMultiService758);
            rule__MultiService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiService"


    // $ANTLR start "entryRuleInout"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:400:1: entryRuleInout : ruleInout EOF ;
    public final void entryRuleInout() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:401:1: ( ruleInout EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:402:1: ruleInout EOF
            {
             before(grammarAccess.getInoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_entryRuleInout785);
            ruleInout();

            state._fsp--;

             after(grammarAccess.getInoutRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInout792); 

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
    // $ANTLR end "entryRuleInout"


    // $ANTLR start "ruleInout"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:409:1: ruleInout : ( ( rule__Inout__Group__0 ) ) ;
    public final void ruleInout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:413:2: ( ( ( rule__Inout__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:414:1: ( ( rule__Inout__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:414:1: ( ( rule__Inout__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:415:1: ( rule__Inout__Group__0 )
            {
             before(grammarAccess.getInoutAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:416:1: ( rule__Inout__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:416:2: rule__Inout__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__0_in_ruleInout818);
            rule__Inout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInoutAccess().getGroup()); 

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
    // $ANTLR end "ruleInout"


    // $ANTLR start "entryRuleComp"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:428:1: entryRuleComp : ruleComp EOF ;
    public final void entryRuleComp() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:429:1: ( ruleComp EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:430:1: ruleComp EOF
            {
             before(grammarAccess.getCompRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComp_in_entryRuleComp845);
            ruleComp();

            state._fsp--;

             after(grammarAccess.getCompRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComp852); 

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
    // $ANTLR end "entryRuleComp"


    // $ANTLR start "ruleComp"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:437:1: ruleComp : ( ( rule__Comp__Group__0 ) ) ;
    public final void ruleComp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:441:2: ( ( ( rule__Comp__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:442:1: ( ( rule__Comp__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:442:1: ( ( rule__Comp__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:443:1: ( rule__Comp__Group__0 )
            {
             before(grammarAccess.getCompAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:444:1: ( rule__Comp__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:444:2: rule__Comp__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__0_in_ruleComp878);
            rule__Comp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompAccess().getGroup()); 

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
    // $ANTLR end "ruleComp"


    // $ANTLR start "ruleFormatEnum"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:457:1: ruleFormatEnum : ( ( rule__FormatEnum__Alternatives ) ) ;
    public final void ruleFormatEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:461:1: ( ( ( rule__FormatEnum__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:462:1: ( ( rule__FormatEnum__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:462:1: ( ( rule__FormatEnum__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:463:1: ( rule__FormatEnum__Alternatives )
            {
             before(grammarAccess.getFormatEnumAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:464:1: ( rule__FormatEnum__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:464:2: rule__FormatEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FormatEnum__Alternatives_in_ruleFormatEnum915);
            rule__FormatEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormatEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFormatEnum"


    // $ANTLR start "ruleServiceEnum"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:476:1: ruleServiceEnum : ( ( rule__ServiceEnum__Alternatives ) ) ;
    public final void ruleServiceEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:480:1: ( ( ( rule__ServiceEnum__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:481:1: ( ( rule__ServiceEnum__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:481:1: ( ( rule__ServiceEnum__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:482:1: ( rule__ServiceEnum__Alternatives )
            {
             before(grammarAccess.getServiceEnumAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:483:1: ( rule__ServiceEnum__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:483:2: rule__ServiceEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceEnum__Alternatives_in_ruleServiceEnum951);
            rule__ServiceEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleServiceEnum"


    // $ANTLR start "ruleDataEnum"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:495:1: ruleDataEnum : ( ( rule__DataEnum__Alternatives ) ) ;
    public final void ruleDataEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:499:1: ( ( ( rule__DataEnum__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:500:1: ( ( rule__DataEnum__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:500:1: ( ( rule__DataEnum__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:501:1: ( rule__DataEnum__Alternatives )
            {
             before(grammarAccess.getDataEnumAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:502:1: ( rule__DataEnum__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:502:2: rule__DataEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataEnum__Alternatives_in_ruleDataEnum987);
            rule__DataEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataEnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataEnum"


    // $ANTLR start "rule__Root__Alternatives_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:513:1: rule__Root__Alternatives_2 : ( ( ( rule__Root__ArtifactsAssignment_2_0 ) ) | ( ( rule__Root__EntitiesAssignment_2_1 ) ) | ( ( rule__Root__ServicesAssignment_2_2 ) ) );
    public final void rule__Root__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:517:1: ( ( ( rule__Root__ArtifactsAssignment_2_0 ) ) | ( ( rule__Root__EntitiesAssignment_2_1 ) ) | ( ( rule__Root__ServicesAssignment_2_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 42:
                {
                alt1=2;
                }
                break;
            case 45:
            case 49:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:518:1: ( ( rule__Root__ArtifactsAssignment_2_0 ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:518:1: ( ( rule__Root__ArtifactsAssignment_2_0 ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:519:1: ( rule__Root__ArtifactsAssignment_2_0 )
                    {
                     before(grammarAccess.getRootAccess().getArtifactsAssignment_2_0()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:520:1: ( rule__Root__ArtifactsAssignment_2_0 )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:520:2: rule__Root__ArtifactsAssignment_2_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__ArtifactsAssignment_2_0_in_rule__Root__Alternatives_21022);
                    rule__Root__ArtifactsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getArtifactsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:524:6: ( ( rule__Root__EntitiesAssignment_2_1 ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:524:6: ( ( rule__Root__EntitiesAssignment_2_1 ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:525:1: ( rule__Root__EntitiesAssignment_2_1 )
                    {
                     before(grammarAccess.getRootAccess().getEntitiesAssignment_2_1()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:526:1: ( rule__Root__EntitiesAssignment_2_1 )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:526:2: rule__Root__EntitiesAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__EntitiesAssignment_2_1_in_rule__Root__Alternatives_21040);
                    rule__Root__EntitiesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getEntitiesAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:530:6: ( ( rule__Root__ServicesAssignment_2_2 ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:530:6: ( ( rule__Root__ServicesAssignment_2_2 ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:531:1: ( rule__Root__ServicesAssignment_2_2 )
                    {
                     before(grammarAccess.getRootAccess().getServicesAssignment_2_2()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:532:1: ( rule__Root__ServicesAssignment_2_2 )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:532:2: rule__Root__ServicesAssignment_2_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__ServicesAssignment_2_2_in_rule__Root__Alternatives_21058);
                    rule__Root__ServicesAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getServicesAssignment_2_2()); 

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
    // $ANTLR end "rule__Root__Alternatives_2"


    // $ANTLR start "rule__Service__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:541:1: rule__Service__Alternatives : ( ( ruleSimpleService ) | ( ruleMultiService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:545:1: ( ( ruleSimpleService ) | ( ruleMultiService ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==45) ) {
                alt2=1;
            }
            else if ( (LA2_0==49) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:546:1: ( ruleSimpleService )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:546:1: ( ruleSimpleService )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:547:1: ruleSimpleService
                    {
                     before(grammarAccess.getServiceAccess().getSimpleServiceParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_rule__Service__Alternatives1091);
                    ruleSimpleService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getSimpleServiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:552:6: ( ruleMultiService )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:552:6: ( ruleMultiService )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:553:1: ruleMultiService
                    {
                     before(grammarAccess.getServiceAccess().getMultiServiceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_rule__Service__Alternatives1108);
                    ruleMultiService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getMultiServiceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Service__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:563:1: rule__Attribute__Alternatives : ( ( rulePrimitive ) | ( ruleReference ) | ( ruleArtifactID ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:567:1: ( ( rulePrimitive ) | ( ruleReference ) | ( ruleArtifactID ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 52:
            case 53:
                {
                alt3=1;
                }
                break;
            case 43:
                {
                alt3=2;
                }
                break;
            case 44:
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
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:568:1: ( rulePrimitive )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:568:1: ( rulePrimitive )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:569:1: rulePrimitive
                    {
                     before(grammarAccess.getAttributeAccess().getPrimitiveParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_rulePrimitive_in_rule__Attribute__Alternatives1140);
                    rulePrimitive();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getPrimitiveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:574:6: ( ruleReference )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:574:6: ( ruleReference )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:575:1: ruleReference
                    {
                     before(grammarAccess.getAttributeAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleReference_in_rule__Attribute__Alternatives1157);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:580:6: ( ruleArtifactID )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:580:6: ( ruleArtifactID )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:581:1: ruleArtifactID
                    {
                     before(grammarAccess.getAttributeAccess().getArtifactIDParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleArtifactID_in_rule__Attribute__Alternatives1174);
                    ruleArtifactID();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getArtifactIDParserRuleCall_2()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:592:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:596:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:597:1: ( RULE_STRING )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:597:1: ( RULE_STRING )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:598:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1207); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:603:6: ( RULE_ID )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:603:6: ( RULE_ID )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:604:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1224); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__FormatEnum__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:615:1: rule__FormatEnum__Alternatives : ( ( ( 'XMI' ) ) | ( ( 'BINARY' ) ) | ( ( 'TEXT' ) ) | ( ( 'XML' ) ) | ( ( 'JSON' ) ) | ( ( 'ATL' ) ) | ( ( 'ZIP' ) ) );
    public final void rule__FormatEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:619:1: ( ( ( 'XMI' ) ) | ( ( 'BINARY' ) ) | ( ( 'TEXT' ) ) | ( ( 'XML' ) ) | ( ( 'JSON' ) ) | ( ( 'ATL' ) ) | ( ( 'ZIP' ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:620:1: ( ( 'XMI' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:620:1: ( ( 'XMI' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:621:1: ( 'XMI' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:622:1: ( 'XMI' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:622:3: 'XMI'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__FormatEnum__Alternatives1258); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:627:6: ( ( 'BINARY' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:627:6: ( ( 'BINARY' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:628:1: ( 'BINARY' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:629:1: ( 'BINARY' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:629:3: 'BINARY'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FormatEnum__Alternatives1279); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:634:6: ( ( 'TEXT' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:634:6: ( ( 'TEXT' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:635:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:636:1: ( 'TEXT' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:636:3: 'TEXT'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FormatEnum__Alternatives1300); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:641:6: ( ( 'XML' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:641:6: ( ( 'XML' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:642:1: ( 'XML' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:643:1: ( 'XML' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:643:3: 'XML'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__FormatEnum__Alternatives1321); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:648:6: ( ( 'JSON' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:648:6: ( ( 'JSON' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:649:1: ( 'JSON' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:650:1: ( 'JSON' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:650:3: 'JSON'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__FormatEnum__Alternatives1342); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:655:6: ( ( 'ATL' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:655:6: ( ( 'ATL' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:656:1: ( 'ATL' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:657:1: ( 'ATL' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:657:3: 'ATL'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__FormatEnum__Alternatives1363); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:662:6: ( ( 'ZIP' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:662:6: ( ( 'ZIP' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:663:1: ( 'ZIP' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getZIPEnumLiteralDeclaration_6()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:664:1: ( 'ZIP' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:664:3: 'ZIP'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__FormatEnum__Alternatives1384); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getZIPEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__FormatEnum__Alternatives"


    // $ANTLR start "rule__ServiceEnum__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:674:1: rule__ServiceEnum__Alternatives : ( ( ( 'upload' ) ) | ( ( 'download' ) ) | ( ( 'update' ) ) | ( ( 'read' ) ) | ( ( 'readAll' ) ) | ( ( 'search' ) ) | ( ( 'delete' ) ) | ( ( 'all' ) ) );
    public final void rule__ServiceEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:678:1: ( ( ( 'upload' ) ) | ( ( 'download' ) ) | ( ( 'update' ) ) | ( ( 'read' ) ) | ( ( 'readAll' ) ) | ( ( 'search' ) ) | ( ( 'delete' ) ) | ( ( 'all' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            case 24:
                {
                alt6=7;
                }
                break;
            case 25:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:679:1: ( ( 'upload' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:679:1: ( ( 'upload' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:680:1: ( 'upload' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:681:1: ( 'upload' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:681:3: 'upload'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ServiceEnum__Alternatives1420); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:686:6: ( ( 'download' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:686:6: ( ( 'download' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:687:1: ( 'download' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:688:1: ( 'download' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:688:3: 'download'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ServiceEnum__Alternatives1441); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:693:6: ( ( 'update' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:693:6: ( ( 'update' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:694:1: ( 'update' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:695:1: ( 'update' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:695:3: 'update'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ServiceEnum__Alternatives1462); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:700:6: ( ( 'read' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:700:6: ( ( 'read' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:701:1: ( 'read' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:702:1: ( 'read' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:702:3: 'read'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ServiceEnum__Alternatives1483); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:707:6: ( ( 'readAll' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:707:6: ( ( 'readAll' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:708:1: ( 'readAll' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:709:1: ( 'readAll' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:709:3: 'readAll'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__ServiceEnum__Alternatives1504); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:714:6: ( ( 'search' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:714:6: ( ( 'search' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:715:1: ( 'search' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:716:1: ( 'search' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:716:3: 'search'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__ServiceEnum__Alternatives1525); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:721:6: ( ( 'delete' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:721:6: ( ( 'delete' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:722:1: ( 'delete' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getDeleteEnumLiteralDeclaration_6()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:723:1: ( 'delete' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:723:3: 'delete'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__ServiceEnum__Alternatives1546); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getDeleteEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:728:6: ( ( 'all' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:728:6: ( ( 'all' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:729:1: ( 'all' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getAllEnumLiteralDeclaration_7()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:730:1: ( 'all' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:730:3: 'all'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__ServiceEnum__Alternatives1567); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getAllEnumLiteralDeclaration_7()); 

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
    // $ANTLR end "rule__ServiceEnum__Alternatives"


    // $ANTLR start "rule__DataEnum__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:740:1: rule__DataEnum__Alternatives : ( ( ( 'Boolean' ) ) | ( ( 'Double' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) );
    public final void rule__DataEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:744:1: ( ( ( 'Boolean' ) ) | ( ( 'Double' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:745:1: ( ( 'Boolean' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:745:1: ( ( 'Boolean' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:746:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:747:1: ( 'Boolean' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:747:3: 'Boolean'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__DataEnum__Alternatives1603); 

                    }

                     after(grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:752:6: ( ( 'Double' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:752:6: ( ( 'Double' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:753:1: ( 'Double' )
                    {
                     before(grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:754:1: ( 'Double' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:754:3: 'Double'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__DataEnum__Alternatives1624); 

                    }

                     after(grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:759:6: ( ( 'Integer' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:759:6: ( ( 'Integer' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:760:1: ( 'Integer' )
                    {
                     before(grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:761:1: ( 'Integer' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:761:3: 'Integer'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__DataEnum__Alternatives1645); 

                    }

                     after(grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:766:6: ( ( 'String' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:766:6: ( ( 'String' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:767:1: ( 'String' )
                    {
                     before(grammarAccess.getDataEnumAccess().getStringEnumLiteralDeclaration_3()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:768:1: ( 'String' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:768:3: 'String'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__DataEnum__Alternatives1666); 

                    }

                     after(grammarAccess.getDataEnumAccess().getStringEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__DataEnum__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:780:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:784:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:785:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01699);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01702);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:792:1: rule__Root__Group__0__Impl : ( ( rule__Root__Group_0__0 )* ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:796:1: ( ( ( rule__Root__Group_0__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:797:1: ( ( rule__Root__Group_0__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:797:1: ( ( rule__Root__Group_0__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:798:1: ( rule__Root__Group_0__0 )*
            {
             before(grammarAccess.getRootAccess().getGroup_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:799:1: ( rule__Root__Group_0__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:799:2: rule__Root__Group_0__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__Group_0__0_in_rule__Root__Group__0__Impl1729);
            	    rule__Root__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:809:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:813:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:814:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11760);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11763);
            rule__Root__Group__2();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:821:1: rule__Root__Group__1__Impl : ( ( rule__Root__ArtifactsAssignment_1 ) ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:825:1: ( ( ( rule__Root__ArtifactsAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:826:1: ( ( rule__Root__ArtifactsAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:826:1: ( ( rule__Root__ArtifactsAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:827:1: ( rule__Root__ArtifactsAssignment_1 )
            {
             before(grammarAccess.getRootAccess().getArtifactsAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:828:1: ( rule__Root__ArtifactsAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:828:2: rule__Root__ArtifactsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__ArtifactsAssignment_1_in_rule__Root__Group__1__Impl1790);
            rule__Root__ArtifactsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getArtifactsAssignment_1()); 

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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:838:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:842:1: ( rule__Root__Group__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:843:2: rule__Root__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21820);
            rule__Root__Group__2__Impl();

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
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:849:1: rule__Root__Group__2__Impl : ( ( rule__Root__Alternatives_2 )* ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:853:1: ( ( ( rule__Root__Alternatives_2 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:854:1: ( ( rule__Root__Alternatives_2 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:854:1: ( ( rule__Root__Alternatives_2 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:855:1: ( rule__Root__Alternatives_2 )*
            {
             before(grammarAccess.getRootAccess().getAlternatives_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:856:1: ( rule__Root__Alternatives_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32||LA9_0==42||LA9_0==45||LA9_0==49) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:856:2: rule__Root__Alternatives_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__Alternatives_2_in_rule__Root__Group__2__Impl1847);
            	    rule__Root__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group_0__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:872:1: rule__Root__Group_0__0 : rule__Root__Group_0__0__Impl rule__Root__Group_0__1 ;
    public final void rule__Root__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:876:1: ( rule__Root__Group_0__0__Impl rule__Root__Group_0__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:877:2: rule__Root__Group_0__0__Impl rule__Root__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_0__0__Impl_in_rule__Root__Group_0__01884);
            rule__Root__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_0__1_in_rule__Root__Group_0__01887);
            rule__Root__Group_0__1();

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
    // $ANTLR end "rule__Root__Group_0__0"


    // $ANTLR start "rule__Root__Group_0__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:884:1: rule__Root__Group_0__0__Impl : ( 'MongoURI' ) ;
    public final void rule__Root__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:888:1: ( ( 'MongoURI' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:889:1: ( 'MongoURI' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:889:1: ( 'MongoURI' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:890:1: 'MongoURI'
            {
             before(grammarAccess.getRootAccess().getMongoURIKeyword_0_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Root__Group_0__0__Impl1915); 
             after(grammarAccess.getRootAccess().getMongoURIKeyword_0_0()); 

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
    // $ANTLR end "rule__Root__Group_0__0__Impl"


    // $ANTLR start "rule__Root__Group_0__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:903:1: rule__Root__Group_0__1 : rule__Root__Group_0__1__Impl rule__Root__Group_0__2 ;
    public final void rule__Root__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:907:1: ( rule__Root__Group_0__1__Impl rule__Root__Group_0__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:908:2: rule__Root__Group_0__1__Impl rule__Root__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_0__1__Impl_in_rule__Root__Group_0__11946);
            rule__Root__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_0__2_in_rule__Root__Group_0__11949);
            rule__Root__Group_0__2();

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
    // $ANTLR end "rule__Root__Group_0__1"


    // $ANTLR start "rule__Root__Group_0__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:915:1: rule__Root__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Root__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:919:1: ( ( ':' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:920:1: ( ':' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:920:1: ( ':' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:921:1: ':'
            {
             before(grammarAccess.getRootAccess().getColonKeyword_0_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Root__Group_0__1__Impl1977); 
             after(grammarAccess.getRootAccess().getColonKeyword_0_1()); 

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
    // $ANTLR end "rule__Root__Group_0__1__Impl"


    // $ANTLR start "rule__Root__Group_0__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:934:1: rule__Root__Group_0__2 : rule__Root__Group_0__2__Impl ;
    public final void rule__Root__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:938:1: ( rule__Root__Group_0__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:939:2: rule__Root__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group_0__2__Impl_in_rule__Root__Group_0__22008);
            rule__Root__Group_0__2__Impl();

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
    // $ANTLR end "rule__Root__Group_0__2"


    // $ANTLR start "rule__Root__Group_0__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:945:1: rule__Root__Group_0__2__Impl : ( ( rule__Root__MongoURIsAssignment_0_2 ) ) ;
    public final void rule__Root__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:949:1: ( ( ( rule__Root__MongoURIsAssignment_0_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:950:1: ( ( rule__Root__MongoURIsAssignment_0_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:950:1: ( ( rule__Root__MongoURIsAssignment_0_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:951:1: ( rule__Root__MongoURIsAssignment_0_2 )
            {
             before(grammarAccess.getRootAccess().getMongoURIsAssignment_0_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:952:1: ( rule__Root__MongoURIsAssignment_0_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:952:2: rule__Root__MongoURIsAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__MongoURIsAssignment_0_2_in_rule__Root__Group_0__2__Impl2035);
            rule__Root__MongoURIsAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getMongoURIsAssignment_0_2()); 

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
    // $ANTLR end "rule__Root__Group_0__2__Impl"


    // $ANTLR start "rule__Artifact__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:968:1: rule__Artifact__Group__0 : rule__Artifact__Group__0__Impl rule__Artifact__Group__1 ;
    public final void rule__Artifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:972:1: ( rule__Artifact__Group__0__Impl rule__Artifact__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:973:2: rule__Artifact__Group__0__Impl rule__Artifact__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__0__Impl_in_rule__Artifact__Group__02071);
            rule__Artifact__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__1_in_rule__Artifact__Group__02074);
            rule__Artifact__Group__1();

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
    // $ANTLR end "rule__Artifact__Group__0"


    // $ANTLR start "rule__Artifact__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:980:1: rule__Artifact__Group__0__Impl : ( 'Artifact' ) ;
    public final void rule__Artifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:984:1: ( ( 'Artifact' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:985:1: ( 'Artifact' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:985:1: ( 'Artifact' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:986:1: 'Artifact'
            {
             before(grammarAccess.getArtifactAccess().getArtifactKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Artifact__Group__0__Impl2102); 
             after(grammarAccess.getArtifactAccess().getArtifactKeyword_0()); 

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
    // $ANTLR end "rule__Artifact__Group__0__Impl"


    // $ANTLR start "rule__Artifact__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:999:1: rule__Artifact__Group__1 : rule__Artifact__Group__1__Impl rule__Artifact__Group__2 ;
    public final void rule__Artifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1003:1: ( rule__Artifact__Group__1__Impl rule__Artifact__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1004:2: rule__Artifact__Group__1__Impl rule__Artifact__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__1__Impl_in_rule__Artifact__Group__12133);
            rule__Artifact__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__2_in_rule__Artifact__Group__12136);
            rule__Artifact__Group__2();

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
    // $ANTLR end "rule__Artifact__Group__1"


    // $ANTLR start "rule__Artifact__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1011:1: rule__Artifact__Group__1__Impl : ( ( rule__Artifact__NameAssignment_1 ) ) ;
    public final void rule__Artifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1015:1: ( ( ( rule__Artifact__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1016:1: ( ( rule__Artifact__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1016:1: ( ( rule__Artifact__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1017:1: ( rule__Artifact__NameAssignment_1 )
            {
             before(grammarAccess.getArtifactAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1018:1: ( rule__Artifact__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1018:2: rule__Artifact__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__NameAssignment_1_in_rule__Artifact__Group__1__Impl2163);
            rule__Artifact__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Artifact__Group__1__Impl"


    // $ANTLR start "rule__Artifact__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1028:1: rule__Artifact__Group__2 : rule__Artifact__Group__2__Impl rule__Artifact__Group__3 ;
    public final void rule__Artifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1032:1: ( rule__Artifact__Group__2__Impl rule__Artifact__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1033:2: rule__Artifact__Group__2__Impl rule__Artifact__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__2__Impl_in_rule__Artifact__Group__22193);
            rule__Artifact__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__3_in_rule__Artifact__Group__22196);
            rule__Artifact__Group__3();

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
    // $ANTLR end "rule__Artifact__Group__2"


    // $ANTLR start "rule__Artifact__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1040:1: rule__Artifact__Group__2__Impl : ( ( rule__Artifact__Group_2__0 )? ) ;
    public final void rule__Artifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1044:1: ( ( ( rule__Artifact__Group_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1045:1: ( ( rule__Artifact__Group_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1045:1: ( ( rule__Artifact__Group_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1046:1: ( rule__Artifact__Group_2__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1047:1: ( rule__Artifact__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1047:2: rule__Artifact__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__0_in_rule__Artifact__Group__2__Impl2223);
                    rule__Artifact__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Artifact__Group__2__Impl"


    // $ANTLR start "rule__Artifact__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1057:1: rule__Artifact__Group__3 : rule__Artifact__Group__3__Impl rule__Artifact__Group__4 ;
    public final void rule__Artifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1061:1: ( rule__Artifact__Group__3__Impl rule__Artifact__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1062:2: rule__Artifact__Group__3__Impl rule__Artifact__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__3__Impl_in_rule__Artifact__Group__32254);
            rule__Artifact__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__4_in_rule__Artifact__Group__32257);
            rule__Artifact__Group__4();

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
    // $ANTLR end "rule__Artifact__Group__3"


    // $ANTLR start "rule__Artifact__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1069:1: rule__Artifact__Group__3__Impl : ( '{' ) ;
    public final void rule__Artifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1073:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1074:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1074:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1075:1: '{'
            {
             before(grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Artifact__Group__3__Impl2285); 
             after(grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Artifact__Group__3__Impl"


    // $ANTLR start "rule__Artifact__Group__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1088:1: rule__Artifact__Group__4 : rule__Artifact__Group__4__Impl rule__Artifact__Group__5 ;
    public final void rule__Artifact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1092:1: ( rule__Artifact__Group__4__Impl rule__Artifact__Group__5 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1093:2: rule__Artifact__Group__4__Impl rule__Artifact__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__4__Impl_in_rule__Artifact__Group__42316);
            rule__Artifact__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__5_in_rule__Artifact__Group__42319);
            rule__Artifact__Group__5();

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
    // $ANTLR end "rule__Artifact__Group__4"


    // $ANTLR start "rule__Artifact__Group__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1100:1: rule__Artifact__Group__4__Impl : ( ( rule__Artifact__AttributesAssignment_4 )* ) ;
    public final void rule__Artifact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1104:1: ( ( ( rule__Artifact__AttributesAssignment_4 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1105:1: ( ( rule__Artifact__AttributesAssignment_4 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1105:1: ( ( rule__Artifact__AttributesAssignment_4 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1106:1: ( rule__Artifact__AttributesAssignment_4 )*
            {
             before(grammarAccess.getArtifactAccess().getAttributesAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1107:1: ( rule__Artifact__AttributesAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)||(LA11_0>=43 && LA11_0<=44)||(LA11_0>=52 && LA11_0<=53)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1107:2: rule__Artifact__AttributesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Artifact__AttributesAssignment_4_in_rule__Artifact__Group__4__Impl2346);
            	    rule__Artifact__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getArtifactAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__Artifact__Group__4__Impl"


    // $ANTLR start "rule__Artifact__Group__5"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1117:1: rule__Artifact__Group__5 : rule__Artifact__Group__5__Impl ;
    public final void rule__Artifact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1121:1: ( rule__Artifact__Group__5__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1122:2: rule__Artifact__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__5__Impl_in_rule__Artifact__Group__52377);
            rule__Artifact__Group__5__Impl();

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
    // $ANTLR end "rule__Artifact__Group__5"


    // $ANTLR start "rule__Artifact__Group__5__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1128:1: rule__Artifact__Group__5__Impl : ( '}' ) ;
    public final void rule__Artifact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1132:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1133:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1133:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1134:1: '}'
            {
             before(grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Artifact__Group__5__Impl2405); 
             after(grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Artifact__Group__5__Impl"


    // $ANTLR start "rule__Artifact__Group_2__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1159:1: rule__Artifact__Group_2__0 : rule__Artifact__Group_2__0__Impl rule__Artifact__Group_2__1 ;
    public final void rule__Artifact__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1163:1: ( rule__Artifact__Group_2__0__Impl rule__Artifact__Group_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1164:2: rule__Artifact__Group_2__0__Impl rule__Artifact__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__0__Impl_in_rule__Artifact__Group_2__02448);
            rule__Artifact__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__1_in_rule__Artifact__Group_2__02451);
            rule__Artifact__Group_2__1();

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
    // $ANTLR end "rule__Artifact__Group_2__0"


    // $ANTLR start "rule__Artifact__Group_2__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1171:1: rule__Artifact__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Artifact__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1175:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1176:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1176:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1177:1: '['
            {
             before(grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Artifact__Group_2__0__Impl2479); 
             after(grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__Artifact__Group_2__0__Impl"


    // $ANTLR start "rule__Artifact__Group_2__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1190:1: rule__Artifact__Group_2__1 : rule__Artifact__Group_2__1__Impl rule__Artifact__Group_2__2 ;
    public final void rule__Artifact__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1194:1: ( rule__Artifact__Group_2__1__Impl rule__Artifact__Group_2__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1195:2: rule__Artifact__Group_2__1__Impl rule__Artifact__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__1__Impl_in_rule__Artifact__Group_2__12510);
            rule__Artifact__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__2_in_rule__Artifact__Group_2__12513);
            rule__Artifact__Group_2__2();

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
    // $ANTLR end "rule__Artifact__Group_2__1"


    // $ANTLR start "rule__Artifact__Group_2__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1202:1: rule__Artifact__Group_2__1__Impl : ( ( rule__Artifact__Group_2_1__0 )? ) ;
    public final void rule__Artifact__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1206:1: ( ( ( rule__Artifact__Group_2_1__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1207:1: ( ( rule__Artifact__Group_2_1__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1207:1: ( ( rule__Artifact__Group_2_1__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1208:1: ( rule__Artifact__Group_2_1__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1209:1: ( rule__Artifact__Group_2_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1209:2: rule__Artifact__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__0_in_rule__Artifact__Group_2__1__Impl2540);
                    rule__Artifact__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Artifact__Group_2__1__Impl"


    // $ANTLR start "rule__Artifact__Group_2__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1219:1: rule__Artifact__Group_2__2 : rule__Artifact__Group_2__2__Impl rule__Artifact__Group_2__3 ;
    public final void rule__Artifact__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1223:1: ( rule__Artifact__Group_2__2__Impl rule__Artifact__Group_2__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1224:2: rule__Artifact__Group_2__2__Impl rule__Artifact__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__2__Impl_in_rule__Artifact__Group_2__22571);
            rule__Artifact__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__3_in_rule__Artifact__Group_2__22574);
            rule__Artifact__Group_2__3();

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
    // $ANTLR end "rule__Artifact__Group_2__2"


    // $ANTLR start "rule__Artifact__Group_2__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1231:1: rule__Artifact__Group_2__2__Impl : ( ( rule__Artifact__Group_2_2__0 )? ) ;
    public final void rule__Artifact__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1235:1: ( ( ( rule__Artifact__Group_2_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1236:1: ( ( rule__Artifact__Group_2_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1236:1: ( ( rule__Artifact__Group_2_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1237:1: ( rule__Artifact__Group_2_2__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1238:1: ( rule__Artifact__Group_2_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1238:2: rule__Artifact__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__0_in_rule__Artifact__Group_2__2__Impl2601);
                    rule__Artifact__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Artifact__Group_2__2__Impl"


    // $ANTLR start "rule__Artifact__Group_2__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1248:1: rule__Artifact__Group_2__3 : rule__Artifact__Group_2__3__Impl rule__Artifact__Group_2__4 ;
    public final void rule__Artifact__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1252:1: ( rule__Artifact__Group_2__3__Impl rule__Artifact__Group_2__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1253:2: rule__Artifact__Group_2__3__Impl rule__Artifact__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__3__Impl_in_rule__Artifact__Group_2__32632);
            rule__Artifact__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__4_in_rule__Artifact__Group_2__32635);
            rule__Artifact__Group_2__4();

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
    // $ANTLR end "rule__Artifact__Group_2__3"


    // $ANTLR start "rule__Artifact__Group_2__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1260:1: rule__Artifact__Group_2__3__Impl : ( ( rule__Artifact__Group_2_3__0 )? ) ;
    public final void rule__Artifact__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1264:1: ( ( ( rule__Artifact__Group_2_3__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1265:1: ( ( rule__Artifact__Group_2_3__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1265:1: ( ( rule__Artifact__Group_2_3__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1266:1: ( rule__Artifact__Group_2_3__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1267:1: ( rule__Artifact__Group_2_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1267:2: rule__Artifact__Group_2_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__0_in_rule__Artifact__Group_2__3__Impl2662);
                    rule__Artifact__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Artifact__Group_2__3__Impl"


    // $ANTLR start "rule__Artifact__Group_2__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1277:1: rule__Artifact__Group_2__4 : rule__Artifact__Group_2__4__Impl ;
    public final void rule__Artifact__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1281:1: ( rule__Artifact__Group_2__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1282:2: rule__Artifact__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__4__Impl_in_rule__Artifact__Group_2__42693);
            rule__Artifact__Group_2__4__Impl();

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
    // $ANTLR end "rule__Artifact__Group_2__4"


    // $ANTLR start "rule__Artifact__Group_2__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1288:1: rule__Artifact__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Artifact__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1292:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1293:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1293:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1294:1: ']'
            {
             before(grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Artifact__Group_2__4__Impl2721); 
             after(grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_2_4()); 

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
    // $ANTLR end "rule__Artifact__Group_2__4__Impl"


    // $ANTLR start "rule__Artifact__Group_2_1__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1317:1: rule__Artifact__Group_2_1__0 : rule__Artifact__Group_2_1__0__Impl rule__Artifact__Group_2_1__1 ;
    public final void rule__Artifact__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1321:1: ( rule__Artifact__Group_2_1__0__Impl rule__Artifact__Group_2_1__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1322:2: rule__Artifact__Group_2_1__0__Impl rule__Artifact__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__0__Impl_in_rule__Artifact__Group_2_1__02762);
            rule__Artifact__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__1_in_rule__Artifact__Group_2_1__02765);
            rule__Artifact__Group_2_1__1();

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
    // $ANTLR end "rule__Artifact__Group_2_1__0"


    // $ANTLR start "rule__Artifact__Group_2_1__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1329:1: rule__Artifact__Group_2_1__0__Impl : ( 'extension ' ) ;
    public final void rule__Artifact__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1333:1: ( ( 'extension ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1334:1: ( 'extension ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1334:1: ( 'extension ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1335:1: 'extension '
            {
             before(grammarAccess.getArtifactAccess().getExtensionKeyword_2_1_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Artifact__Group_2_1__0__Impl2793); 
             after(grammarAccess.getArtifactAccess().getExtensionKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Artifact__Group_2_1__0__Impl"


    // $ANTLR start "rule__Artifact__Group_2_1__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1348:1: rule__Artifact__Group_2_1__1 : rule__Artifact__Group_2_1__1__Impl rule__Artifact__Group_2_1__2 ;
    public final void rule__Artifact__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1352:1: ( rule__Artifact__Group_2_1__1__Impl rule__Artifact__Group_2_1__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1353:2: rule__Artifact__Group_2_1__1__Impl rule__Artifact__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__1__Impl_in_rule__Artifact__Group_2_1__12824);
            rule__Artifact__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__2_in_rule__Artifact__Group_2_1__12827);
            rule__Artifact__Group_2_1__2();

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
    // $ANTLR end "rule__Artifact__Group_2_1__1"


    // $ANTLR start "rule__Artifact__Group_2_1__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1360:1: rule__Artifact__Group_2_1__1__Impl : ( '.' ) ;
    public final void rule__Artifact__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1364:1: ( ( '.' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1365:1: ( '.' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1365:1: ( '.' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1366:1: '.'
            {
             before(grammarAccess.getArtifactAccess().getFullStopKeyword_2_1_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Artifact__Group_2_1__1__Impl2855); 
             after(grammarAccess.getArtifactAccess().getFullStopKeyword_2_1_1()); 

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
    // $ANTLR end "rule__Artifact__Group_2_1__1__Impl"


    // $ANTLR start "rule__Artifact__Group_2_1__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1379:1: rule__Artifact__Group_2_1__2 : rule__Artifact__Group_2_1__2__Impl ;
    public final void rule__Artifact__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1383:1: ( rule__Artifact__Group_2_1__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1384:2: rule__Artifact__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__2__Impl_in_rule__Artifact__Group_2_1__22886);
            rule__Artifact__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Artifact__Group_2_1__2"


    // $ANTLR start "rule__Artifact__Group_2_1__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1390:1: rule__Artifact__Group_2_1__2__Impl : ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) ) ;
    public final void rule__Artifact__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1394:1: ( ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1395:1: ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1395:1: ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1396:1: ( rule__Artifact__ExtensionAssignment_2_1_2 )
            {
             before(grammarAccess.getArtifactAccess().getExtensionAssignment_2_1_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1397:1: ( rule__Artifact__ExtensionAssignment_2_1_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1397:2: rule__Artifact__ExtensionAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__ExtensionAssignment_2_1_2_in_rule__Artifact__Group_2_1__2__Impl2913);
            rule__Artifact__ExtensionAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getExtensionAssignment_2_1_2()); 

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
    // $ANTLR end "rule__Artifact__Group_2_1__2__Impl"


    // $ANTLR start "rule__Artifact__Group_2_2__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1413:1: rule__Artifact__Group_2_2__0 : rule__Artifact__Group_2_2__0__Impl rule__Artifact__Group_2_2__1 ;
    public final void rule__Artifact__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1417:1: ( rule__Artifact__Group_2_2__0__Impl rule__Artifact__Group_2_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1418:2: rule__Artifact__Group_2_2__0__Impl rule__Artifact__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__0__Impl_in_rule__Artifact__Group_2_2__02949);
            rule__Artifact__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__1_in_rule__Artifact__Group_2_2__02952);
            rule__Artifact__Group_2_2__1();

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
    // $ANTLR end "rule__Artifact__Group_2_2__0"


    // $ANTLR start "rule__Artifact__Group_2_2__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1425:1: rule__Artifact__Group_2_2__0__Impl : ( 'format ' ) ;
    public final void rule__Artifact__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1429:1: ( ( 'format ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1430:1: ( 'format ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1430:1: ( 'format ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1431:1: 'format '
            {
             before(grammarAccess.getArtifactAccess().getFormatKeyword_2_2_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Artifact__Group_2_2__0__Impl2980); 
             after(grammarAccess.getArtifactAccess().getFormatKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Artifact__Group_2_2__0__Impl"


    // $ANTLR start "rule__Artifact__Group_2_2__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1444:1: rule__Artifact__Group_2_2__1 : rule__Artifact__Group_2_2__1__Impl ;
    public final void rule__Artifact__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1448:1: ( rule__Artifact__Group_2_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1449:2: rule__Artifact__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__1__Impl_in_rule__Artifact__Group_2_2__13011);
            rule__Artifact__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Artifact__Group_2_2__1"


    // $ANTLR start "rule__Artifact__Group_2_2__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1455:1: rule__Artifact__Group_2_2__1__Impl : ( ( rule__Artifact__FormatAssignment_2_2_1 ) ) ;
    public final void rule__Artifact__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1459:1: ( ( ( rule__Artifact__FormatAssignment_2_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1460:1: ( ( rule__Artifact__FormatAssignment_2_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1460:1: ( ( rule__Artifact__FormatAssignment_2_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1461:1: ( rule__Artifact__FormatAssignment_2_2_1 )
            {
             before(grammarAccess.getArtifactAccess().getFormatAssignment_2_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1462:1: ( rule__Artifact__FormatAssignment_2_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1462:2: rule__Artifact__FormatAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__FormatAssignment_2_2_1_in_rule__Artifact__Group_2_2__1__Impl3038);
            rule__Artifact__FormatAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getFormatAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Artifact__Group_2_2__1__Impl"


    // $ANTLR start "rule__Artifact__Group_2_3__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1476:1: rule__Artifact__Group_2_3__0 : rule__Artifact__Group_2_3__0__Impl rule__Artifact__Group_2_3__1 ;
    public final void rule__Artifact__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1480:1: ( rule__Artifact__Group_2_3__0__Impl rule__Artifact__Group_2_3__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1481:2: rule__Artifact__Group_2_3__0__Impl rule__Artifact__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__0__Impl_in_rule__Artifact__Group_2_3__03072);
            rule__Artifact__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__1_in_rule__Artifact__Group_2_3__03075);
            rule__Artifact__Group_2_3__1();

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
    // $ANTLR end "rule__Artifact__Group_2_3__0"


    // $ANTLR start "rule__Artifact__Group_2_3__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1488:1: rule__Artifact__Group_2_3__0__Impl : ( 'services : ' ) ;
    public final void rule__Artifact__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1492:1: ( ( 'services : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1493:1: ( 'services : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1493:1: ( 'services : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1494:1: 'services : '
            {
             before(grammarAccess.getArtifactAccess().getServicesKeyword_2_3_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Artifact__Group_2_3__0__Impl3103); 
             after(grammarAccess.getArtifactAccess().getServicesKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Artifact__Group_2_3__0__Impl"


    // $ANTLR start "rule__Artifact__Group_2_3__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1507:1: rule__Artifact__Group_2_3__1 : rule__Artifact__Group_2_3__1__Impl rule__Artifact__Group_2_3__2 ;
    public final void rule__Artifact__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1511:1: ( rule__Artifact__Group_2_3__1__Impl rule__Artifact__Group_2_3__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1512:2: rule__Artifact__Group_2_3__1__Impl rule__Artifact__Group_2_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__1__Impl_in_rule__Artifact__Group_2_3__13134);
            rule__Artifact__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__2_in_rule__Artifact__Group_2_3__13137);
            rule__Artifact__Group_2_3__2();

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
    // $ANTLR end "rule__Artifact__Group_2_3__1"


    // $ANTLR start "rule__Artifact__Group_2_3__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1519:1: rule__Artifact__Group_2_3__1__Impl : ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) ) ;
    public final void rule__Artifact__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1523:1: ( ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1524:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1524:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1525:1: ( rule__Artifact__BasicServicesAssignment_2_3_1 )
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesAssignment_2_3_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1526:1: ( rule__Artifact__BasicServicesAssignment_2_3_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1526:2: rule__Artifact__BasicServicesAssignment_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_1_in_rule__Artifact__Group_2_3__1__Impl3164);
            rule__Artifact__BasicServicesAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getBasicServicesAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Artifact__Group_2_3__1__Impl"


    // $ANTLR start "rule__Artifact__Group_2_3__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1536:1: rule__Artifact__Group_2_3__2 : rule__Artifact__Group_2_3__2__Impl ;
    public final void rule__Artifact__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1540:1: ( rule__Artifact__Group_2_3__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1541:2: rule__Artifact__Group_2_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__2__Impl_in_rule__Artifact__Group_2_3__23194);
            rule__Artifact__Group_2_3__2__Impl();

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
    // $ANTLR end "rule__Artifact__Group_2_3__2"


    // $ANTLR start "rule__Artifact__Group_2_3__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1547:1: rule__Artifact__Group_2_3__2__Impl : ( ( rule__Artifact__Group_2_3_2__0 )* ) ;
    public final void rule__Artifact__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1551:1: ( ( ( rule__Artifact__Group_2_3_2__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1552:1: ( ( rule__Artifact__Group_2_3_2__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1552:1: ( ( rule__Artifact__Group_2_3_2__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1553:1: ( rule__Artifact__Group_2_3_2__0 )*
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_3_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1554:1: ( rule__Artifact__Group_2_3_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1554:2: rule__Artifact__Group_2_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__0_in_rule__Artifact__Group_2_3__2__Impl3221);
            	    rule__Artifact__Group_2_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getArtifactAccess().getGroup_2_3_2()); 

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
    // $ANTLR end "rule__Artifact__Group_2_3__2__Impl"


    // $ANTLR start "rule__Artifact__Group_2_3_2__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1570:1: rule__Artifact__Group_2_3_2__0 : rule__Artifact__Group_2_3_2__0__Impl rule__Artifact__Group_2_3_2__1 ;
    public final void rule__Artifact__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1574:1: ( rule__Artifact__Group_2_3_2__0__Impl rule__Artifact__Group_2_3_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1575:2: rule__Artifact__Group_2_3_2__0__Impl rule__Artifact__Group_2_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__0__Impl_in_rule__Artifact__Group_2_3_2__03258);
            rule__Artifact__Group_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__1_in_rule__Artifact__Group_2_3_2__03261);
            rule__Artifact__Group_2_3_2__1();

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
    // $ANTLR end "rule__Artifact__Group_2_3_2__0"


    // $ANTLR start "rule__Artifact__Group_2_3_2__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1582:1: rule__Artifact__Group_2_3_2__0__Impl : ( ',' ) ;
    public final void rule__Artifact__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1586:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1587:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1587:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1588:1: ','
            {
             before(grammarAccess.getArtifactAccess().getCommaKeyword_2_3_2_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Artifact__Group_2_3_2__0__Impl3289); 
             after(grammarAccess.getArtifactAccess().getCommaKeyword_2_3_2_0()); 

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
    // $ANTLR end "rule__Artifact__Group_2_3_2__0__Impl"


    // $ANTLR start "rule__Artifact__Group_2_3_2__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1601:1: rule__Artifact__Group_2_3_2__1 : rule__Artifact__Group_2_3_2__1__Impl ;
    public final void rule__Artifact__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1605:1: ( rule__Artifact__Group_2_3_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1606:2: rule__Artifact__Group_2_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__1__Impl_in_rule__Artifact__Group_2_3_2__13320);
            rule__Artifact__Group_2_3_2__1__Impl();

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
    // $ANTLR end "rule__Artifact__Group_2_3_2__1"


    // $ANTLR start "rule__Artifact__Group_2_3_2__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1612:1: rule__Artifact__Group_2_3_2__1__Impl : ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) ) ;
    public final void rule__Artifact__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1616:1: ( ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1617:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1617:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1618:1: ( rule__Artifact__BasicServicesAssignment_2_3_2_1 )
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesAssignment_2_3_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1619:1: ( rule__Artifact__BasicServicesAssignment_2_3_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1619:2: rule__Artifact__BasicServicesAssignment_2_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_2_1_in_rule__Artifact__Group_2_3_2__1__Impl3347);
            rule__Artifact__BasicServicesAssignment_2_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getBasicServicesAssignment_2_3_2_1()); 

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
    // $ANTLR end "rule__Artifact__Group_2_3_2__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1633:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1637:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1638:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03381);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03384);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1645:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1649:1: ( ( 'Entity' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1650:1: ( 'Entity' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1650:1: ( 'Entity' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1651:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Entity__Group__0__Impl3412); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1664:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1668:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1669:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13443);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13446);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1676:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1680:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1681:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1681:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1682:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1683:1: ( rule__Entity__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1683:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3473);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1693:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1697:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1698:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23503);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23506);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1705:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1709:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1710:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1710:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1711:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Entity__Group__2__Impl3534); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1724:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1728:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1729:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33565);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33568);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1736:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1740:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1741:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1741:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1742:1: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1743:1: ( rule__Entity__AttributesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)||(LA16_0>=43 && LA16_0<=44)||(LA16_0>=52 && LA16_0<=53)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1743:2: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl3595);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1753:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1757:1: ( rule__Entity__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1758:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43626);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1764:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1768:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1769:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1769:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1770:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Entity__Group__4__Impl3654); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Primitive__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1793:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1797:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1798:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03695);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03698);
            rule__Primitive__Group__1();

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
    // $ANTLR end "rule__Primitive__Group__0"


    // $ANTLR start "rule__Primitive__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1805:1: rule__Primitive__Group__0__Impl : ( ( rule__Primitive__ManyAssignment_0 )? ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1809:1: ( ( ( rule__Primitive__ManyAssignment_0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1810:1: ( ( rule__Primitive__ManyAssignment_0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1810:1: ( ( rule__Primitive__ManyAssignment_0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1811:1: ( rule__Primitive__ManyAssignment_0 )?
            {
             before(grammarAccess.getPrimitiveAccess().getManyAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1812:1: ( rule__Primitive__ManyAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1812:2: rule__Primitive__ManyAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Primitive__ManyAssignment_0_in_rule__Primitive__Group__0__Impl3725);
                    rule__Primitive__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveAccess().getManyAssignment_0()); 

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
    // $ANTLR end "rule__Primitive__Group__0__Impl"


    // $ANTLR start "rule__Primitive__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1822:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl rule__Primitive__Group__2 ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1826:1: ( rule__Primitive__Group__1__Impl rule__Primitive__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1827:2: rule__Primitive__Group__1__Impl rule__Primitive__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13756);
            rule__Primitive__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__13759);
            rule__Primitive__Group__2();

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
    // $ANTLR end "rule__Primitive__Group__1"


    // $ANTLR start "rule__Primitive__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1834:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__RequiredAssignment_1 )? ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1838:1: ( ( ( rule__Primitive__RequiredAssignment_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1839:1: ( ( rule__Primitive__RequiredAssignment_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1839:1: ( ( rule__Primitive__RequiredAssignment_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1840:1: ( rule__Primitive__RequiredAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveAccess().getRequiredAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1841:1: ( rule__Primitive__RequiredAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1841:2: rule__Primitive__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Primitive__RequiredAssignment_1_in_rule__Primitive__Group__1__Impl3786);
                    rule__Primitive__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveAccess().getRequiredAssignment_1()); 

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
    // $ANTLR end "rule__Primitive__Group__1__Impl"


    // $ANTLR start "rule__Primitive__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1851:1: rule__Primitive__Group__2 : rule__Primitive__Group__2__Impl rule__Primitive__Group__3 ;
    public final void rule__Primitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1855:1: ( rule__Primitive__Group__2__Impl rule__Primitive__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1856:2: rule__Primitive__Group__2__Impl rule__Primitive__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__23817);
            rule__Primitive__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__3_in_rule__Primitive__Group__23820);
            rule__Primitive__Group__3();

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
    // $ANTLR end "rule__Primitive__Group__2"


    // $ANTLR start "rule__Primitive__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1863:1: rule__Primitive__Group__2__Impl : ( ( rule__Primitive__NameAssignment_2 ) ) ;
    public final void rule__Primitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1867:1: ( ( ( rule__Primitive__NameAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1868:1: ( ( rule__Primitive__NameAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1868:1: ( ( rule__Primitive__NameAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1869:1: ( rule__Primitive__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1870:1: ( rule__Primitive__NameAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1870:2: rule__Primitive__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__NameAssignment_2_in_rule__Primitive__Group__2__Impl3847);
            rule__Primitive__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Primitive__Group__2__Impl"


    // $ANTLR start "rule__Primitive__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1880:1: rule__Primitive__Group__3 : rule__Primitive__Group__3__Impl rule__Primitive__Group__4 ;
    public final void rule__Primitive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1884:1: ( rule__Primitive__Group__3__Impl rule__Primitive__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1885:2: rule__Primitive__Group__3__Impl rule__Primitive__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__3__Impl_in_rule__Primitive__Group__33877);
            rule__Primitive__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__4_in_rule__Primitive__Group__33880);
            rule__Primitive__Group__4();

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
    // $ANTLR end "rule__Primitive__Group__3"


    // $ANTLR start "rule__Primitive__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1892:1: rule__Primitive__Group__3__Impl : ( ':' ) ;
    public final void rule__Primitive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1896:1: ( ( ':' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1897:1: ( ':' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1897:1: ( ':' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1898:1: ':'
            {
             before(grammarAccess.getPrimitiveAccess().getColonKeyword_3()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Primitive__Group__3__Impl3908); 
             after(grammarAccess.getPrimitiveAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Primitive__Group__3__Impl"


    // $ANTLR start "rule__Primitive__Group__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1911:1: rule__Primitive__Group__4 : rule__Primitive__Group__4__Impl ;
    public final void rule__Primitive__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1915:1: ( rule__Primitive__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1916:2: rule__Primitive__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__4__Impl_in_rule__Primitive__Group__43939);
            rule__Primitive__Group__4__Impl();

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
    // $ANTLR end "rule__Primitive__Group__4"


    // $ANTLR start "rule__Primitive__Group__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1922:1: rule__Primitive__Group__4__Impl : ( ( rule__Primitive__TypeAssignment_4 ) ) ;
    public final void rule__Primitive__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1926:1: ( ( ( rule__Primitive__TypeAssignment_4 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1927:1: ( ( rule__Primitive__TypeAssignment_4 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1927:1: ( ( rule__Primitive__TypeAssignment_4 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1928:1: ( rule__Primitive__TypeAssignment_4 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1929:1: ( rule__Primitive__TypeAssignment_4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1929:2: rule__Primitive__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__TypeAssignment_4_in_rule__Primitive__Group__4__Impl3966);
            rule__Primitive__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Primitive__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1949:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1953:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1954:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04006);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04009);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1961:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1965:1: ( ( 'ref' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1966:1: ( 'ref' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1966:1: ( 'ref' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1967:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Reference__Group__0__Impl4037); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1980:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1984:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1985:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14068);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14071);
            rule__Reference__Group__2();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1992:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ManyAssignment_1 )? ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1996:1: ( ( ( rule__Reference__ManyAssignment_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1997:1: ( ( rule__Reference__ManyAssignment_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1997:1: ( ( rule__Reference__ManyAssignment_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1998:1: ( rule__Reference__ManyAssignment_1 )?
            {
             before(grammarAccess.getReferenceAccess().getManyAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1999:1: ( rule__Reference__ManyAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1999:2: rule__Reference__ManyAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Reference__ManyAssignment_1_in_rule__Reference__Group__1__Impl4098);
                    rule__Reference__ManyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getManyAssignment_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2009:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2013:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2014:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24129);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24132);
            rule__Reference__Group__3();

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2021:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__NameAssignment_2 ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2025:1: ( ( ( rule__Reference__NameAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2026:1: ( ( rule__Reference__NameAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2026:1: ( ( rule__Reference__NameAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2027:1: ( rule__Reference__NameAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2028:1: ( rule__Reference__NameAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2028:2: rule__Reference__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl4159);
            rule__Reference__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2038:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2042:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2043:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34189);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34192);
            rule__Reference__Group__4();

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2050:1: rule__Reference__Group__3__Impl : ( ':' ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2054:1: ( ( ':' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2055:1: ( ':' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2055:1: ( ':' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2056:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_3()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Reference__Group__3__Impl4220); 
             after(grammarAccess.getReferenceAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2069:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2073:1: ( rule__Reference__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2074:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44251);
            rule__Reference__Group__4__Impl();

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
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2080:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__TypeAssignment_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2084:1: ( ( ( rule__Reference__TypeAssignment_4 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2085:1: ( ( rule__Reference__TypeAssignment_4 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2085:1: ( ( rule__Reference__TypeAssignment_4 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2086:1: ( rule__Reference__TypeAssignment_4 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2087:1: ( rule__Reference__TypeAssignment_4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2087:2: rule__Reference__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__TypeAssignment_4_in_rule__Reference__Group__4__Impl4278);
            rule__Reference__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__ArtifactID__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2107:1: rule__ArtifactID__Group__0 : rule__ArtifactID__Group__0__Impl rule__ArtifactID__Group__1 ;
    public final void rule__ArtifactID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2111:1: ( rule__ArtifactID__Group__0__Impl rule__ArtifactID__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2112:2: rule__ArtifactID__Group__0__Impl rule__ArtifactID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__0__Impl_in_rule__ArtifactID__Group__04318);
            rule__ArtifactID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__1_in_rule__ArtifactID__Group__04321);
            rule__ArtifactID__Group__1();

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
    // $ANTLR end "rule__ArtifactID__Group__0"


    // $ANTLR start "rule__ArtifactID__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2119:1: rule__ArtifactID__Group__0__Impl : ( 'id' ) ;
    public final void rule__ArtifactID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2123:1: ( ( 'id' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2124:1: ( 'id' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2124:1: ( 'id' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2125:1: 'id'
            {
             before(grammarAccess.getArtifactIDAccess().getIdKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__ArtifactID__Group__0__Impl4349); 
             after(grammarAccess.getArtifactIDAccess().getIdKeyword_0()); 

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
    // $ANTLR end "rule__ArtifactID__Group__0__Impl"


    // $ANTLR start "rule__ArtifactID__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2138:1: rule__ArtifactID__Group__1 : rule__ArtifactID__Group__1__Impl rule__ArtifactID__Group__2 ;
    public final void rule__ArtifactID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2142:1: ( rule__ArtifactID__Group__1__Impl rule__ArtifactID__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2143:2: rule__ArtifactID__Group__1__Impl rule__ArtifactID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__1__Impl_in_rule__ArtifactID__Group__14380);
            rule__ArtifactID__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__2_in_rule__ArtifactID__Group__14383);
            rule__ArtifactID__Group__2();

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
    // $ANTLR end "rule__ArtifactID__Group__1"


    // $ANTLR start "rule__ArtifactID__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2150:1: rule__ArtifactID__Group__1__Impl : ( ( rule__ArtifactID__ManyAssignment_1 )? ) ;
    public final void rule__ArtifactID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2154:1: ( ( ( rule__ArtifactID__ManyAssignment_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2155:1: ( ( rule__ArtifactID__ManyAssignment_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2155:1: ( ( rule__ArtifactID__ManyAssignment_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2156:1: ( rule__ArtifactID__ManyAssignment_1 )?
            {
             before(grammarAccess.getArtifactIDAccess().getManyAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2157:1: ( rule__ArtifactID__ManyAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2157:2: rule__ArtifactID__ManyAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__ManyAssignment_1_in_rule__ArtifactID__Group__1__Impl4410);
                    rule__ArtifactID__ManyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactIDAccess().getManyAssignment_1()); 

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
    // $ANTLR end "rule__ArtifactID__Group__1__Impl"


    // $ANTLR start "rule__ArtifactID__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2167:1: rule__ArtifactID__Group__2 : rule__ArtifactID__Group__2__Impl rule__ArtifactID__Group__3 ;
    public final void rule__ArtifactID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2171:1: ( rule__ArtifactID__Group__2__Impl rule__ArtifactID__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2172:2: rule__ArtifactID__Group__2__Impl rule__ArtifactID__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__2__Impl_in_rule__ArtifactID__Group__24441);
            rule__ArtifactID__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__3_in_rule__ArtifactID__Group__24444);
            rule__ArtifactID__Group__3();

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
    // $ANTLR end "rule__ArtifactID__Group__2"


    // $ANTLR start "rule__ArtifactID__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2179:1: rule__ArtifactID__Group__2__Impl : ( ( rule__ArtifactID__NameAssignment_2 ) ) ;
    public final void rule__ArtifactID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2183:1: ( ( ( rule__ArtifactID__NameAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2184:1: ( ( rule__ArtifactID__NameAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2184:1: ( ( rule__ArtifactID__NameAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2185:1: ( rule__ArtifactID__NameAssignment_2 )
            {
             before(grammarAccess.getArtifactIDAccess().getNameAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2186:1: ( rule__ArtifactID__NameAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2186:2: rule__ArtifactID__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__NameAssignment_2_in_rule__ArtifactID__Group__2__Impl4471);
            rule__ArtifactID__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArtifactIDAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ArtifactID__Group__2__Impl"


    // $ANTLR start "rule__ArtifactID__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2196:1: rule__ArtifactID__Group__3 : rule__ArtifactID__Group__3__Impl rule__ArtifactID__Group__4 ;
    public final void rule__ArtifactID__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2200:1: ( rule__ArtifactID__Group__3__Impl rule__ArtifactID__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2201:2: rule__ArtifactID__Group__3__Impl rule__ArtifactID__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__3__Impl_in_rule__ArtifactID__Group__34501);
            rule__ArtifactID__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__4_in_rule__ArtifactID__Group__34504);
            rule__ArtifactID__Group__4();

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
    // $ANTLR end "rule__ArtifactID__Group__3"


    // $ANTLR start "rule__ArtifactID__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2208:1: rule__ArtifactID__Group__3__Impl : ( ':' ) ;
    public final void rule__ArtifactID__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2212:1: ( ( ':' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2213:1: ( ':' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2213:1: ( ':' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2214:1: ':'
            {
             before(grammarAccess.getArtifactIDAccess().getColonKeyword_3()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ArtifactID__Group__3__Impl4532); 
             after(grammarAccess.getArtifactIDAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__ArtifactID__Group__3__Impl"


    // $ANTLR start "rule__ArtifactID__Group__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2227:1: rule__ArtifactID__Group__4 : rule__ArtifactID__Group__4__Impl ;
    public final void rule__ArtifactID__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2231:1: ( rule__ArtifactID__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2232:2: rule__ArtifactID__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__4__Impl_in_rule__ArtifactID__Group__44563);
            rule__ArtifactID__Group__4__Impl();

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
    // $ANTLR end "rule__ArtifactID__Group__4"


    // $ANTLR start "rule__ArtifactID__Group__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2238:1: rule__ArtifactID__Group__4__Impl : ( ( rule__ArtifactID__TypeAssignment_4 ) ) ;
    public final void rule__ArtifactID__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2242:1: ( ( ( rule__ArtifactID__TypeAssignment_4 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2243:1: ( ( rule__ArtifactID__TypeAssignment_4 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2243:1: ( ( rule__ArtifactID__TypeAssignment_4 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2244:1: ( rule__ArtifactID__TypeAssignment_4 )
            {
             before(grammarAccess.getArtifactIDAccess().getTypeAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2245:1: ( rule__ArtifactID__TypeAssignment_4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2245:2: rule__ArtifactID__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__TypeAssignment_4_in_rule__ArtifactID__Group__4__Impl4590);
            rule__ArtifactID__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArtifactIDAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__ArtifactID__Group__4__Impl"


    // $ANTLR start "rule__OnService__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2265:1: rule__OnService__Group__0 : rule__OnService__Group__0__Impl rule__OnService__Group__1 ;
    public final void rule__OnService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2269:1: ( rule__OnService__Group__0__Impl rule__OnService__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2270:2: rule__OnService__Group__0__Impl rule__OnService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__0__Impl_in_rule__OnService__Group__04630);
            rule__OnService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__1_in_rule__OnService__Group__04633);
            rule__OnService__Group__1();

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
    // $ANTLR end "rule__OnService__Group__0"


    // $ANTLR start "rule__OnService__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2277:1: rule__OnService__Group__0__Impl : ( ( rule__OnService__ArtifactAssignment_0 ) ) ;
    public final void rule__OnService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2281:1: ( ( ( rule__OnService__ArtifactAssignment_0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2282:1: ( ( rule__OnService__ArtifactAssignment_0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2282:1: ( ( rule__OnService__ArtifactAssignment_0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2283:1: ( rule__OnService__ArtifactAssignment_0 )
            {
             before(grammarAccess.getOnServiceAccess().getArtifactAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2284:1: ( rule__OnService__ArtifactAssignment_0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2284:2: rule__OnService__ArtifactAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__ArtifactAssignment_0_in_rule__OnService__Group__0__Impl4660);
            rule__OnService__ArtifactAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOnServiceAccess().getArtifactAssignment_0()); 

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
    // $ANTLR end "rule__OnService__Group__0__Impl"


    // $ANTLR start "rule__OnService__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2294:1: rule__OnService__Group__1 : rule__OnService__Group__1__Impl rule__OnService__Group__2 ;
    public final void rule__OnService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2298:1: ( rule__OnService__Group__1__Impl rule__OnService__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2299:2: rule__OnService__Group__1__Impl rule__OnService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__1__Impl_in_rule__OnService__Group__14690);
            rule__OnService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__2_in_rule__OnService__Group__14693);
            rule__OnService__Group__2();

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
    // $ANTLR end "rule__OnService__Group__1"


    // $ANTLR start "rule__OnService__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2306:1: rule__OnService__Group__1__Impl : ( '[' ) ;
    public final void rule__OnService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2310:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2311:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2311:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2312:1: '['
            {
             before(grammarAccess.getOnServiceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__OnService__Group__1__Impl4721); 
             after(grammarAccess.getOnServiceAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__OnService__Group__1__Impl"


    // $ANTLR start "rule__OnService__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2325:1: rule__OnService__Group__2 : rule__OnService__Group__2__Impl rule__OnService__Group__3 ;
    public final void rule__OnService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2329:1: ( rule__OnService__Group__2__Impl rule__OnService__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2330:2: rule__OnService__Group__2__Impl rule__OnService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__2__Impl_in_rule__OnService__Group__24752);
            rule__OnService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__3_in_rule__OnService__Group__24755);
            rule__OnService__Group__3();

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
    // $ANTLR end "rule__OnService__Group__2"


    // $ANTLR start "rule__OnService__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2337:1: rule__OnService__Group__2__Impl : ( ( rule__OnService__WhenServicesAssignment_2 ) ) ;
    public final void rule__OnService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2341:1: ( ( ( rule__OnService__WhenServicesAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2342:1: ( ( rule__OnService__WhenServicesAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2342:1: ( ( rule__OnService__WhenServicesAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2343:1: ( rule__OnService__WhenServicesAssignment_2 )
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2344:1: ( rule__OnService__WhenServicesAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2344:2: rule__OnService__WhenServicesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__WhenServicesAssignment_2_in_rule__OnService__Group__2__Impl4782);
            rule__OnService__WhenServicesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_2()); 

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
    // $ANTLR end "rule__OnService__Group__2__Impl"


    // $ANTLR start "rule__OnService__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2354:1: rule__OnService__Group__3 : rule__OnService__Group__3__Impl rule__OnService__Group__4 ;
    public final void rule__OnService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2358:1: ( rule__OnService__Group__3__Impl rule__OnService__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2359:2: rule__OnService__Group__3__Impl rule__OnService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__3__Impl_in_rule__OnService__Group__34812);
            rule__OnService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__4_in_rule__OnService__Group__34815);
            rule__OnService__Group__4();

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
    // $ANTLR end "rule__OnService__Group__3"


    // $ANTLR start "rule__OnService__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2366:1: rule__OnService__Group__3__Impl : ( ( rule__OnService__Group_3__0 )* ) ;
    public final void rule__OnService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2370:1: ( ( ( rule__OnService__Group_3__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2371:1: ( ( rule__OnService__Group_3__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2371:1: ( ( rule__OnService__Group_3__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2372:1: ( rule__OnService__Group_3__0 )*
            {
             before(grammarAccess.getOnServiceAccess().getGroup_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2373:1: ( rule__OnService__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2373:2: rule__OnService__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__0_in_rule__OnService__Group__3__Impl4842);
            	    rule__OnService__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getOnServiceAccess().getGroup_3()); 

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
    // $ANTLR end "rule__OnService__Group__3__Impl"


    // $ANTLR start "rule__OnService__Group__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2383:1: rule__OnService__Group__4 : rule__OnService__Group__4__Impl ;
    public final void rule__OnService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2387:1: ( rule__OnService__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2388:2: rule__OnService__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__4__Impl_in_rule__OnService__Group__44873);
            rule__OnService__Group__4__Impl();

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
    // $ANTLR end "rule__OnService__Group__4"


    // $ANTLR start "rule__OnService__Group__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2394:1: rule__OnService__Group__4__Impl : ( ']' ) ;
    public final void rule__OnService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2398:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2399:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2399:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2400:1: ']'
            {
             before(grammarAccess.getOnServiceAccess().getRightSquareBracketKeyword_4()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__OnService__Group__4__Impl4901); 
             after(grammarAccess.getOnServiceAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__OnService__Group__4__Impl"


    // $ANTLR start "rule__OnService__Group_3__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2423:1: rule__OnService__Group_3__0 : rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1 ;
    public final void rule__OnService__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2427:1: ( rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2428:2: rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__0__Impl_in_rule__OnService__Group_3__04942);
            rule__OnService__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__1_in_rule__OnService__Group_3__04945);
            rule__OnService__Group_3__1();

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
    // $ANTLR end "rule__OnService__Group_3__0"


    // $ANTLR start "rule__OnService__Group_3__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2435:1: rule__OnService__Group_3__0__Impl : ( ',' ) ;
    public final void rule__OnService__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2439:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2440:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2440:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2441:1: ','
            {
             before(grammarAccess.getOnServiceAccess().getCommaKeyword_3_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__OnService__Group_3__0__Impl4973); 
             after(grammarAccess.getOnServiceAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__OnService__Group_3__0__Impl"


    // $ANTLR start "rule__OnService__Group_3__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2454:1: rule__OnService__Group_3__1 : rule__OnService__Group_3__1__Impl ;
    public final void rule__OnService__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2458:1: ( rule__OnService__Group_3__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2459:2: rule__OnService__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__1__Impl_in_rule__OnService__Group_3__15004);
            rule__OnService__Group_3__1__Impl();

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
    // $ANTLR end "rule__OnService__Group_3__1"


    // $ANTLR start "rule__OnService__Group_3__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2465:1: rule__OnService__Group_3__1__Impl : ( ( rule__OnService__WhenServicesAssignment_3_1 ) ) ;
    public final void rule__OnService__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2469:1: ( ( ( rule__OnService__WhenServicesAssignment_3_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2470:1: ( ( rule__OnService__WhenServicesAssignment_3_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2470:1: ( ( rule__OnService__WhenServicesAssignment_3_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2471:1: ( rule__OnService__WhenServicesAssignment_3_1 )
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_3_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2472:1: ( rule__OnService__WhenServicesAssignment_3_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2472:2: rule__OnService__WhenServicesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__WhenServicesAssignment_3_1_in_rule__OnService__Group_3__1__Impl5031);
            rule__OnService__WhenServicesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_3_1()); 

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
    // $ANTLR end "rule__OnService__Group_3__1__Impl"


    // $ANTLR start "rule__SimpleService__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2486:1: rule__SimpleService__Group__0 : rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1 ;
    public final void rule__SimpleService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2490:1: ( rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2491:2: rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__0__Impl_in_rule__SimpleService__Group__05065);
            rule__SimpleService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__1_in_rule__SimpleService__Group__05068);
            rule__SimpleService__Group__1();

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
    // $ANTLR end "rule__SimpleService__Group__0"


    // $ANTLR start "rule__SimpleService__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2498:1: rule__SimpleService__Group__0__Impl : ( () ) ;
    public final void rule__SimpleService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2502:1: ( ( () ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2503:1: ( () )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2503:1: ( () )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2504:1: ()
            {
             before(grammarAccess.getSimpleServiceAccess().getSimpleServiceAction_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2505:1: ()
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2507:1: 
            {
            }

             after(grammarAccess.getSimpleServiceAccess().getSimpleServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group__0__Impl"


    // $ANTLR start "rule__SimpleService__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2517:1: rule__SimpleService__Group__1 : rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2 ;
    public final void rule__SimpleService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2521:1: ( rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2522:2: rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__1__Impl_in_rule__SimpleService__Group__15126);
            rule__SimpleService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__2_in_rule__SimpleService__Group__15129);
            rule__SimpleService__Group__2();

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
    // $ANTLR end "rule__SimpleService__Group__1"


    // $ANTLR start "rule__SimpleService__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2529:1: rule__SimpleService__Group__1__Impl : ( 'Service' ) ;
    public final void rule__SimpleService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2533:1: ( ( 'Service' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2534:1: ( 'Service' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2534:1: ( 'Service' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2535:1: 'Service'
            {
             before(grammarAccess.getSimpleServiceAccess().getServiceKeyword_1()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__SimpleService__Group__1__Impl5157); 
             after(grammarAccess.getSimpleServiceAccess().getServiceKeyword_1()); 

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
    // $ANTLR end "rule__SimpleService__Group__1__Impl"


    // $ANTLR start "rule__SimpleService__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2548:1: rule__SimpleService__Group__2 : rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3 ;
    public final void rule__SimpleService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2552:1: ( rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2553:2: rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__2__Impl_in_rule__SimpleService__Group__25188);
            rule__SimpleService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__3_in_rule__SimpleService__Group__25191);
            rule__SimpleService__Group__3();

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
    // $ANTLR end "rule__SimpleService__Group__2"


    // $ANTLR start "rule__SimpleService__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2560:1: rule__SimpleService__Group__2__Impl : ( ( rule__SimpleService__NameAssignment_2 ) ) ;
    public final void rule__SimpleService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2564:1: ( ( ( rule__SimpleService__NameAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2565:1: ( ( rule__SimpleService__NameAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2565:1: ( ( rule__SimpleService__NameAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2566:1: ( rule__SimpleService__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleServiceAccess().getNameAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2567:1: ( rule__SimpleService__NameAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2567:2: rule__SimpleService__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__NameAssignment_2_in_rule__SimpleService__Group__2__Impl5218);
            rule__SimpleService__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SimpleService__Group__2__Impl"


    // $ANTLR start "rule__SimpleService__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2577:1: rule__SimpleService__Group__3 : rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4 ;
    public final void rule__SimpleService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2581:1: ( rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2582:2: rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__3__Impl_in_rule__SimpleService__Group__35248);
            rule__SimpleService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__4_in_rule__SimpleService__Group__35251);
            rule__SimpleService__Group__4();

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
    // $ANTLR end "rule__SimpleService__Group__3"


    // $ANTLR start "rule__SimpleService__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2589:1: rule__SimpleService__Group__3__Impl : ( '{' ) ;
    public final void rule__SimpleService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2593:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2594:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2594:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2595:1: '{'
            {
             before(grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SimpleService__Group__3__Impl5279); 
             after(grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SimpleService__Group__3__Impl"


    // $ANTLR start "rule__SimpleService__Group__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2608:1: rule__SimpleService__Group__4 : rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5 ;
    public final void rule__SimpleService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2612:1: ( rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2613:2: rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__4__Impl_in_rule__SimpleService__Group__45310);
            rule__SimpleService__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__5_in_rule__SimpleService__Group__45313);
            rule__SimpleService__Group__5();

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
    // $ANTLR end "rule__SimpleService__Group__4"


    // $ANTLR start "rule__SimpleService__Group__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2620:1: rule__SimpleService__Group__4__Impl : ( ( rule__SimpleService__Group_4__0 )? ) ;
    public final void rule__SimpleService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2624:1: ( ( ( rule__SimpleService__Group_4__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2625:1: ( ( rule__SimpleService__Group_4__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2625:1: ( ( rule__SimpleService__Group_4__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2626:1: ( rule__SimpleService__Group_4__0 )?
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2627:1: ( rule__SimpleService__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2627:2: rule__SimpleService__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__0_in_rule__SimpleService__Group__4__Impl5340);
                    rule__SimpleService__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleServiceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SimpleService__Group__4__Impl"


    // $ANTLR start "rule__SimpleService__Group__5"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2637:1: rule__SimpleService__Group__5 : rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6 ;
    public final void rule__SimpleService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2641:1: ( rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2642:2: rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__5__Impl_in_rule__SimpleService__Group__55371);
            rule__SimpleService__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__6_in_rule__SimpleService__Group__55374);
            rule__SimpleService__Group__6();

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
    // $ANTLR end "rule__SimpleService__Group__5"


    // $ANTLR start "rule__SimpleService__Group__5__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2649:1: rule__SimpleService__Group__5__Impl : ( ( rule__SimpleService__Group_5__0 )? ) ;
    public final void rule__SimpleService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2653:1: ( ( ( rule__SimpleService__Group_5__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2654:1: ( ( rule__SimpleService__Group_5__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2654:1: ( ( rule__SimpleService__Group_5__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2655:1: ( rule__SimpleService__Group_5__0 )?
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_5()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2656:1: ( rule__SimpleService__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2656:2: rule__SimpleService__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__0_in_rule__SimpleService__Group__5__Impl5401);
                    rule__SimpleService__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleServiceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SimpleService__Group__5__Impl"


    // $ANTLR start "rule__SimpleService__Group__6"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2666:1: rule__SimpleService__Group__6 : rule__SimpleService__Group__6__Impl rule__SimpleService__Group__7 ;
    public final void rule__SimpleService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2670:1: ( rule__SimpleService__Group__6__Impl rule__SimpleService__Group__7 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2671:2: rule__SimpleService__Group__6__Impl rule__SimpleService__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__6__Impl_in_rule__SimpleService__Group__65432);
            rule__SimpleService__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__7_in_rule__SimpleService__Group__65435);
            rule__SimpleService__Group__7();

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
    // $ANTLR end "rule__SimpleService__Group__6"


    // $ANTLR start "rule__SimpleService__Group__6__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2678:1: rule__SimpleService__Group__6__Impl : ( ( rule__SimpleService__Group_6__0 )* ) ;
    public final void rule__SimpleService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2682:1: ( ( ( rule__SimpleService__Group_6__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2683:1: ( ( rule__SimpleService__Group_6__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2683:1: ( ( rule__SimpleService__Group_6__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2684:1: ( rule__SimpleService__Group_6__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_6()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2685:1: ( rule__SimpleService__Group_6__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2685:2: rule__SimpleService__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_6__0_in_rule__SimpleService__Group__6__Impl5462);
            	    rule__SimpleService__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSimpleServiceAccess().getGroup_6()); 

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
    // $ANTLR end "rule__SimpleService__Group__6__Impl"


    // $ANTLR start "rule__SimpleService__Group__7"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2695:1: rule__SimpleService__Group__7 : rule__SimpleService__Group__7__Impl ;
    public final void rule__SimpleService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2699:1: ( rule__SimpleService__Group__7__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2700:2: rule__SimpleService__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__7__Impl_in_rule__SimpleService__Group__75493);
            rule__SimpleService__Group__7__Impl();

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
    // $ANTLR end "rule__SimpleService__Group__7"


    // $ANTLR start "rule__SimpleService__Group__7__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2706:1: rule__SimpleService__Group__7__Impl : ( '}' ) ;
    public final void rule__SimpleService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2710:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2711:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2711:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2712:1: '}'
            {
             before(grammarAccess.getSimpleServiceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__SimpleService__Group__7__Impl5521); 
             after(grammarAccess.getSimpleServiceAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__SimpleService__Group__7__Impl"


    // $ANTLR start "rule__SimpleService__Group_4__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2741:1: rule__SimpleService__Group_4__0 : rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1 ;
    public final void rule__SimpleService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2745:1: ( rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2746:2: rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__0__Impl_in_rule__SimpleService__Group_4__05568);
            rule__SimpleService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__1_in_rule__SimpleService__Group_4__05571);
            rule__SimpleService__Group_4__1();

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
    // $ANTLR end "rule__SimpleService__Group_4__0"


    // $ANTLR start "rule__SimpleService__Group_4__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2753:1: rule__SimpleService__Group_4__0__Impl : ( 'input : ' ) ;
    public final void rule__SimpleService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2757:1: ( ( 'input : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2758:1: ( 'input : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2758:1: ( 'input : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2759:1: 'input : '
            {
             before(grammarAccess.getSimpleServiceAccess().getInputKeyword_4_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__SimpleService__Group_4__0__Impl5599); 
             after(grammarAccess.getSimpleServiceAccess().getInputKeyword_4_0()); 

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
    // $ANTLR end "rule__SimpleService__Group_4__0__Impl"


    // $ANTLR start "rule__SimpleService__Group_4__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2772:1: rule__SimpleService__Group_4__1 : rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2 ;
    public final void rule__SimpleService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2776:1: ( rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2777:2: rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__1__Impl_in_rule__SimpleService__Group_4__15630);
            rule__SimpleService__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__2_in_rule__SimpleService__Group_4__15633);
            rule__SimpleService__Group_4__2();

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
    // $ANTLR end "rule__SimpleService__Group_4__1"


    // $ANTLR start "rule__SimpleService__Group_4__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2784:1: rule__SimpleService__Group_4__1__Impl : ( ( rule__SimpleService__InputAssignment_4_1 ) ) ;
    public final void rule__SimpleService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2788:1: ( ( ( rule__SimpleService__InputAssignment_4_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2789:1: ( ( rule__SimpleService__InputAssignment_4_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2789:1: ( ( rule__SimpleService__InputAssignment_4_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2790:1: ( rule__SimpleService__InputAssignment_4_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAssignment_4_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2791:1: ( rule__SimpleService__InputAssignment_4_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2791:2: rule__SimpleService__InputAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__InputAssignment_4_1_in_rule__SimpleService__Group_4__1__Impl5660);
            rule__SimpleService__InputAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getInputAssignment_4_1()); 

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
    // $ANTLR end "rule__SimpleService__Group_4__1__Impl"


    // $ANTLR start "rule__SimpleService__Group_4__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2801:1: rule__SimpleService__Group_4__2 : rule__SimpleService__Group_4__2__Impl ;
    public final void rule__SimpleService__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2805:1: ( rule__SimpleService__Group_4__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2806:2: rule__SimpleService__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__2__Impl_in_rule__SimpleService__Group_4__25690);
            rule__SimpleService__Group_4__2__Impl();

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
    // $ANTLR end "rule__SimpleService__Group_4__2"


    // $ANTLR start "rule__SimpleService__Group_4__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2812:1: rule__SimpleService__Group_4__2__Impl : ( ( rule__SimpleService__Group_4_2__0 )* ) ;
    public final void rule__SimpleService__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2816:1: ( ( ( rule__SimpleService__Group_4_2__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2817:1: ( ( rule__SimpleService__Group_4_2__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2817:1: ( ( rule__SimpleService__Group_4_2__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2818:1: ( rule__SimpleService__Group_4_2__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_4_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2819:1: ( rule__SimpleService__Group_4_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2819:2: rule__SimpleService__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__0_in_rule__SimpleService__Group_4__2__Impl5717);
            	    rule__SimpleService__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getSimpleServiceAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__SimpleService__Group_4__2__Impl"


    // $ANTLR start "rule__SimpleService__Group_4_2__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2835:1: rule__SimpleService__Group_4_2__0 : rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1 ;
    public final void rule__SimpleService__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2839:1: ( rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2840:2: rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__0__Impl_in_rule__SimpleService__Group_4_2__05754);
            rule__SimpleService__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__1_in_rule__SimpleService__Group_4_2__05757);
            rule__SimpleService__Group_4_2__1();

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
    // $ANTLR end "rule__SimpleService__Group_4_2__0"


    // $ANTLR start "rule__SimpleService__Group_4_2__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2847:1: rule__SimpleService__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleService__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2851:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2852:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2852:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2853:1: ','
            {
             before(grammarAccess.getSimpleServiceAccess().getCommaKeyword_4_2_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__SimpleService__Group_4_2__0__Impl5785); 
             after(grammarAccess.getSimpleServiceAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__SimpleService__Group_4_2__0__Impl"


    // $ANTLR start "rule__SimpleService__Group_4_2__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2866:1: rule__SimpleService__Group_4_2__1 : rule__SimpleService__Group_4_2__1__Impl ;
    public final void rule__SimpleService__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2870:1: ( rule__SimpleService__Group_4_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2871:2: rule__SimpleService__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__1__Impl_in_rule__SimpleService__Group_4_2__15816);
            rule__SimpleService__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__SimpleService__Group_4_2__1"


    // $ANTLR start "rule__SimpleService__Group_4_2__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2877:1: rule__SimpleService__Group_4_2__1__Impl : ( ( rule__SimpleService__InputAssignment_4_2_1 ) ) ;
    public final void rule__SimpleService__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2881:1: ( ( ( rule__SimpleService__InputAssignment_4_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2882:1: ( ( rule__SimpleService__InputAssignment_4_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2882:1: ( ( rule__SimpleService__InputAssignment_4_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2883:1: ( rule__SimpleService__InputAssignment_4_2_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAssignment_4_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2884:1: ( rule__SimpleService__InputAssignment_4_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2884:2: rule__SimpleService__InputAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__InputAssignment_4_2_1_in_rule__SimpleService__Group_4_2__1__Impl5843);
            rule__SimpleService__InputAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getInputAssignment_4_2_1()); 

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
    // $ANTLR end "rule__SimpleService__Group_4_2__1__Impl"


    // $ANTLR start "rule__SimpleService__Group_5__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2898:1: rule__SimpleService__Group_5__0 : rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1 ;
    public final void rule__SimpleService__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2902:1: ( rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2903:2: rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__0__Impl_in_rule__SimpleService__Group_5__05877);
            rule__SimpleService__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__1_in_rule__SimpleService__Group_5__05880);
            rule__SimpleService__Group_5__1();

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
    // $ANTLR end "rule__SimpleService__Group_5__0"


    // $ANTLR start "rule__SimpleService__Group_5__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2910:1: rule__SimpleService__Group_5__0__Impl : ( 'output : ' ) ;
    public final void rule__SimpleService__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2914:1: ( ( 'output : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2915:1: ( 'output : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2915:1: ( 'output : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2916:1: 'output : '
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputKeyword_5_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__SimpleService__Group_5__0__Impl5908); 
             after(grammarAccess.getSimpleServiceAccess().getOutputKeyword_5_0()); 

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
    // $ANTLR end "rule__SimpleService__Group_5__0__Impl"


    // $ANTLR start "rule__SimpleService__Group_5__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2929:1: rule__SimpleService__Group_5__1 : rule__SimpleService__Group_5__1__Impl rule__SimpleService__Group_5__2 ;
    public final void rule__SimpleService__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2933:1: ( rule__SimpleService__Group_5__1__Impl rule__SimpleService__Group_5__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2934:2: rule__SimpleService__Group_5__1__Impl rule__SimpleService__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__1__Impl_in_rule__SimpleService__Group_5__15939);
            rule__SimpleService__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__2_in_rule__SimpleService__Group_5__15942);
            rule__SimpleService__Group_5__2();

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
    // $ANTLR end "rule__SimpleService__Group_5__1"


    // $ANTLR start "rule__SimpleService__Group_5__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2941:1: rule__SimpleService__Group_5__1__Impl : ( ( rule__SimpleService__OutputAssignment_5_1 ) ) ;
    public final void rule__SimpleService__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2945:1: ( ( ( rule__SimpleService__OutputAssignment_5_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2946:1: ( ( rule__SimpleService__OutputAssignment_5_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2946:1: ( ( rule__SimpleService__OutputAssignment_5_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2947:1: ( rule__SimpleService__OutputAssignment_5_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAssignment_5_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2948:1: ( rule__SimpleService__OutputAssignment_5_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2948:2: rule__SimpleService__OutputAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__OutputAssignment_5_1_in_rule__SimpleService__Group_5__1__Impl5969);
            rule__SimpleService__OutputAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getOutputAssignment_5_1()); 

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
    // $ANTLR end "rule__SimpleService__Group_5__1__Impl"


    // $ANTLR start "rule__SimpleService__Group_5__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2958:1: rule__SimpleService__Group_5__2 : rule__SimpleService__Group_5__2__Impl ;
    public final void rule__SimpleService__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2962:1: ( rule__SimpleService__Group_5__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2963:2: rule__SimpleService__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__2__Impl_in_rule__SimpleService__Group_5__25999);
            rule__SimpleService__Group_5__2__Impl();

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
    // $ANTLR end "rule__SimpleService__Group_5__2"


    // $ANTLR start "rule__SimpleService__Group_5__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2969:1: rule__SimpleService__Group_5__2__Impl : ( ( rule__SimpleService__Group_5_2__0 )* ) ;
    public final void rule__SimpleService__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2973:1: ( ( ( rule__SimpleService__Group_5_2__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2974:1: ( ( rule__SimpleService__Group_5_2__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2974:1: ( ( rule__SimpleService__Group_5_2__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2975:1: ( rule__SimpleService__Group_5_2__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_5_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2976:1: ( rule__SimpleService__Group_5_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2976:2: rule__SimpleService__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5_2__0_in_rule__SimpleService__Group_5__2__Impl6026);
            	    rule__SimpleService__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSimpleServiceAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__SimpleService__Group_5__2__Impl"


    // $ANTLR start "rule__SimpleService__Group_5_2__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2992:1: rule__SimpleService__Group_5_2__0 : rule__SimpleService__Group_5_2__0__Impl rule__SimpleService__Group_5_2__1 ;
    public final void rule__SimpleService__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2996:1: ( rule__SimpleService__Group_5_2__0__Impl rule__SimpleService__Group_5_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2997:2: rule__SimpleService__Group_5_2__0__Impl rule__SimpleService__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5_2__0__Impl_in_rule__SimpleService__Group_5_2__06063);
            rule__SimpleService__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5_2__1_in_rule__SimpleService__Group_5_2__06066);
            rule__SimpleService__Group_5_2__1();

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
    // $ANTLR end "rule__SimpleService__Group_5_2__0"


    // $ANTLR start "rule__SimpleService__Group_5_2__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3004:1: rule__SimpleService__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleService__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3008:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3009:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3009:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3010:1: ','
            {
             before(grammarAccess.getSimpleServiceAccess().getCommaKeyword_5_2_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__SimpleService__Group_5_2__0__Impl6094); 
             after(grammarAccess.getSimpleServiceAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__SimpleService__Group_5_2__0__Impl"


    // $ANTLR start "rule__SimpleService__Group_5_2__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3023:1: rule__SimpleService__Group_5_2__1 : rule__SimpleService__Group_5_2__1__Impl ;
    public final void rule__SimpleService__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3027:1: ( rule__SimpleService__Group_5_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3028:2: rule__SimpleService__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5_2__1__Impl_in_rule__SimpleService__Group_5_2__16125);
            rule__SimpleService__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__SimpleService__Group_5_2__1"


    // $ANTLR start "rule__SimpleService__Group_5_2__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3034:1: rule__SimpleService__Group_5_2__1__Impl : ( ( rule__SimpleService__OutputAssignment_5_2_1 ) ) ;
    public final void rule__SimpleService__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3038:1: ( ( ( rule__SimpleService__OutputAssignment_5_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3039:1: ( ( rule__SimpleService__OutputAssignment_5_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3039:1: ( ( rule__SimpleService__OutputAssignment_5_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3040:1: ( rule__SimpleService__OutputAssignment_5_2_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAssignment_5_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3041:1: ( rule__SimpleService__OutputAssignment_5_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3041:2: rule__SimpleService__OutputAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__OutputAssignment_5_2_1_in_rule__SimpleService__Group_5_2__1__Impl6152);
            rule__SimpleService__OutputAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getOutputAssignment_5_2_1()); 

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
    // $ANTLR end "rule__SimpleService__Group_5_2__1__Impl"


    // $ANTLR start "rule__SimpleService__Group_6__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3055:1: rule__SimpleService__Group_6__0 : rule__SimpleService__Group_6__0__Impl rule__SimpleService__Group_6__1 ;
    public final void rule__SimpleService__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3059:1: ( rule__SimpleService__Group_6__0__Impl rule__SimpleService__Group_6__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3060:2: rule__SimpleService__Group_6__0__Impl rule__SimpleService__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_6__0__Impl_in_rule__SimpleService__Group_6__06186);
            rule__SimpleService__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_6__1_in_rule__SimpleService__Group_6__06189);
            rule__SimpleService__Group_6__1();

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
    // $ANTLR end "rule__SimpleService__Group_6__0"


    // $ANTLR start "rule__SimpleService__Group_6__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3067:1: rule__SimpleService__Group_6__0__Impl : ( 'when : ' ) ;
    public final void rule__SimpleService__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3071:1: ( ( 'when : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3072:1: ( 'when : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3072:1: ( 'when : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3073:1: 'when : '
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenKeyword_6_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__SimpleService__Group_6__0__Impl6217); 
             after(grammarAccess.getSimpleServiceAccess().getWhenKeyword_6_0()); 

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
    // $ANTLR end "rule__SimpleService__Group_6__0__Impl"


    // $ANTLR start "rule__SimpleService__Group_6__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3086:1: rule__SimpleService__Group_6__1 : rule__SimpleService__Group_6__1__Impl ;
    public final void rule__SimpleService__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3090:1: ( rule__SimpleService__Group_6__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3091:2: rule__SimpleService__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_6__1__Impl_in_rule__SimpleService__Group_6__16248);
            rule__SimpleService__Group_6__1__Impl();

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
    // $ANTLR end "rule__SimpleService__Group_6__1"


    // $ANTLR start "rule__SimpleService__Group_6__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3097:1: rule__SimpleService__Group_6__1__Impl : ( ( rule__SimpleService__WhenAssignment_6_1 ) ) ;
    public final void rule__SimpleService__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3101:1: ( ( ( rule__SimpleService__WhenAssignment_6_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3102:1: ( ( rule__SimpleService__WhenAssignment_6_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3102:1: ( ( rule__SimpleService__WhenAssignment_6_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3103:1: ( rule__SimpleService__WhenAssignment_6_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenAssignment_6_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3104:1: ( rule__SimpleService__WhenAssignment_6_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3104:2: rule__SimpleService__WhenAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__WhenAssignment_6_1_in_rule__SimpleService__Group_6__1__Impl6275);
            rule__SimpleService__WhenAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getWhenAssignment_6_1()); 

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
    // $ANTLR end "rule__SimpleService__Group_6__1__Impl"


    // $ANTLR start "rule__MultiService__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3118:1: rule__MultiService__Group__0 : rule__MultiService__Group__0__Impl rule__MultiService__Group__1 ;
    public final void rule__MultiService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3122:1: ( rule__MultiService__Group__0__Impl rule__MultiService__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3123:2: rule__MultiService__Group__0__Impl rule__MultiService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__0__Impl_in_rule__MultiService__Group__06309);
            rule__MultiService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__1_in_rule__MultiService__Group__06312);
            rule__MultiService__Group__1();

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
    // $ANTLR end "rule__MultiService__Group__0"


    // $ANTLR start "rule__MultiService__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3130:1: rule__MultiService__Group__0__Impl : ( 'MultiService' ) ;
    public final void rule__MultiService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3134:1: ( ( 'MultiService' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3135:1: ( 'MultiService' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3135:1: ( 'MultiService' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3136:1: 'MultiService'
            {
             before(grammarAccess.getMultiServiceAccess().getMultiServiceKeyword_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__MultiService__Group__0__Impl6340); 
             after(grammarAccess.getMultiServiceAccess().getMultiServiceKeyword_0()); 

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
    // $ANTLR end "rule__MultiService__Group__0__Impl"


    // $ANTLR start "rule__MultiService__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3149:1: rule__MultiService__Group__1 : rule__MultiService__Group__1__Impl rule__MultiService__Group__2 ;
    public final void rule__MultiService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3153:1: ( rule__MultiService__Group__1__Impl rule__MultiService__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3154:2: rule__MultiService__Group__1__Impl rule__MultiService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__1__Impl_in_rule__MultiService__Group__16371);
            rule__MultiService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__2_in_rule__MultiService__Group__16374);
            rule__MultiService__Group__2();

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
    // $ANTLR end "rule__MultiService__Group__1"


    // $ANTLR start "rule__MultiService__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3161:1: rule__MultiService__Group__1__Impl : ( ( rule__MultiService__NameAssignment_1 ) ) ;
    public final void rule__MultiService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3165:1: ( ( ( rule__MultiService__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3166:1: ( ( rule__MultiService__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3166:1: ( ( rule__MultiService__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3167:1: ( rule__MultiService__NameAssignment_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3168:1: ( rule__MultiService__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3168:2: rule__MultiService__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__NameAssignment_1_in_rule__MultiService__Group__1__Impl6401);
            rule__MultiService__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiServiceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MultiService__Group__1__Impl"


    // $ANTLR start "rule__MultiService__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3178:1: rule__MultiService__Group__2 : rule__MultiService__Group__2__Impl rule__MultiService__Group__3 ;
    public final void rule__MultiService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3182:1: ( rule__MultiService__Group__2__Impl rule__MultiService__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3183:2: rule__MultiService__Group__2__Impl rule__MultiService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__2__Impl_in_rule__MultiService__Group__26431);
            rule__MultiService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__3_in_rule__MultiService__Group__26434);
            rule__MultiService__Group__3();

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
    // $ANTLR end "rule__MultiService__Group__2"


    // $ANTLR start "rule__MultiService__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3190:1: rule__MultiService__Group__2__Impl : ( ( rule__MultiService__Group_2__0 )? ) ;
    public final void rule__MultiService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3194:1: ( ( ( rule__MultiService__Group_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3195:1: ( ( rule__MultiService__Group_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3195:1: ( ( rule__MultiService__Group_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3196:1: ( rule__MultiService__Group_2__0 )?
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3197:1: ( rule__MultiService__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3197:2: rule__MultiService__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__0_in_rule__MultiService__Group__2__Impl6461);
                    rule__MultiService__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiServiceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__MultiService__Group__2__Impl"


    // $ANTLR start "rule__MultiService__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3207:1: rule__MultiService__Group__3 : rule__MultiService__Group__3__Impl rule__MultiService__Group__4 ;
    public final void rule__MultiService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3211:1: ( rule__MultiService__Group__3__Impl rule__MultiService__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3212:2: rule__MultiService__Group__3__Impl rule__MultiService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__3__Impl_in_rule__MultiService__Group__36492);
            rule__MultiService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__4_in_rule__MultiService__Group__36495);
            rule__MultiService__Group__4();

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
    // $ANTLR end "rule__MultiService__Group__3"


    // $ANTLR start "rule__MultiService__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3219:1: rule__MultiService__Group__3__Impl : ( '{' ) ;
    public final void rule__MultiService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3223:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3224:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3224:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3225:1: '{'
            {
             before(grammarAccess.getMultiServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MultiService__Group__3__Impl6523); 
             after(grammarAccess.getMultiServiceAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__MultiService__Group__3__Impl"


    // $ANTLR start "rule__MultiService__Group__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3238:1: rule__MultiService__Group__4 : rule__MultiService__Group__4__Impl rule__MultiService__Group__5 ;
    public final void rule__MultiService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3242:1: ( rule__MultiService__Group__4__Impl rule__MultiService__Group__5 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3243:2: rule__MultiService__Group__4__Impl rule__MultiService__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__4__Impl_in_rule__MultiService__Group__46554);
            rule__MultiService__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__5_in_rule__MultiService__Group__46557);
            rule__MultiService__Group__5();

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
    // $ANTLR end "rule__MultiService__Group__4"


    // $ANTLR start "rule__MultiService__Group__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3250:1: rule__MultiService__Group__4__Impl : ( ( rule__MultiService__Group_4__0 )* ) ;
    public final void rule__MultiService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3254:1: ( ( ( rule__MultiService__Group_4__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3255:1: ( ( rule__MultiService__Group_4__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3255:1: ( ( rule__MultiService__Group_4__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3256:1: ( rule__MultiService__Group_4__0 )*
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3257:1: ( rule__MultiService__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3257:2: rule__MultiService__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__0_in_rule__MultiService__Group__4__Impl6584);
            	    rule__MultiService__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMultiServiceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__MultiService__Group__4__Impl"


    // $ANTLR start "rule__MultiService__Group__5"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3267:1: rule__MultiService__Group__5 : rule__MultiService__Group__5__Impl rule__MultiService__Group__6 ;
    public final void rule__MultiService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3271:1: ( rule__MultiService__Group__5__Impl rule__MultiService__Group__6 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3272:2: rule__MultiService__Group__5__Impl rule__MultiService__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__5__Impl_in_rule__MultiService__Group__56615);
            rule__MultiService__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__6_in_rule__MultiService__Group__56618);
            rule__MultiService__Group__6();

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
    // $ANTLR end "rule__MultiService__Group__5"


    // $ANTLR start "rule__MultiService__Group__5__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3279:1: rule__MultiService__Group__5__Impl : ( 'services : ' ) ;
    public final void rule__MultiService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3283:1: ( ( 'services : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3284:1: ( 'services : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3284:1: ( 'services : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3285:1: 'services : '
            {
             before(grammarAccess.getMultiServiceAccess().getServicesKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__MultiService__Group__5__Impl6646); 
             after(grammarAccess.getMultiServiceAccess().getServicesKeyword_5()); 

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
    // $ANTLR end "rule__MultiService__Group__5__Impl"


    // $ANTLR start "rule__MultiService__Group__6"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3298:1: rule__MultiService__Group__6 : rule__MultiService__Group__6__Impl rule__MultiService__Group__7 ;
    public final void rule__MultiService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3302:1: ( rule__MultiService__Group__6__Impl rule__MultiService__Group__7 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3303:2: rule__MultiService__Group__6__Impl rule__MultiService__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__6__Impl_in_rule__MultiService__Group__66677);
            rule__MultiService__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__7_in_rule__MultiService__Group__66680);
            rule__MultiService__Group__7();

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
    // $ANTLR end "rule__MultiService__Group__6"


    // $ANTLR start "rule__MultiService__Group__6__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3310:1: rule__MultiService__Group__6__Impl : ( ( rule__MultiService__ServicesAssignment_6 ) ) ;
    public final void rule__MultiService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3314:1: ( ( ( rule__MultiService__ServicesAssignment_6 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3315:1: ( ( rule__MultiService__ServicesAssignment_6 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3315:1: ( ( rule__MultiService__ServicesAssignment_6 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3316:1: ( rule__MultiService__ServicesAssignment_6 )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesAssignment_6()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3317:1: ( rule__MultiService__ServicesAssignment_6 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3317:2: rule__MultiService__ServicesAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__ServicesAssignment_6_in_rule__MultiService__Group__6__Impl6707);
            rule__MultiService__ServicesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMultiServiceAccess().getServicesAssignment_6()); 

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
    // $ANTLR end "rule__MultiService__Group__6__Impl"


    // $ANTLR start "rule__MultiService__Group__7"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3327:1: rule__MultiService__Group__7 : rule__MultiService__Group__7__Impl rule__MultiService__Group__8 ;
    public final void rule__MultiService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3331:1: ( rule__MultiService__Group__7__Impl rule__MultiService__Group__8 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3332:2: rule__MultiService__Group__7__Impl rule__MultiService__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__7__Impl_in_rule__MultiService__Group__76737);
            rule__MultiService__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__8_in_rule__MultiService__Group__76740);
            rule__MultiService__Group__8();

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
    // $ANTLR end "rule__MultiService__Group__7"


    // $ANTLR start "rule__MultiService__Group__7__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3339:1: rule__MultiService__Group__7__Impl : ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) ) ;
    public final void rule__MultiService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3343:1: ( ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3344:1: ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3344:1: ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3345:1: ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3345:1: ( ( rule__MultiService__Group_7__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3346:1: ( rule__MultiService__Group_7__0 )
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_7()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3347:1: ( rule__MultiService__Group_7__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3347:2: rule__MultiService__Group_7__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl6769);
            rule__MultiService__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiServiceAccess().getGroup_7()); 

            }

            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3350:1: ( ( rule__MultiService__Group_7__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3351:1: ( rule__MultiService__Group_7__0 )*
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_7()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3352:1: ( rule__MultiService__Group_7__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3352:2: rule__MultiService__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl6781);
            	    rule__MultiService__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMultiServiceAccess().getGroup_7()); 

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
    // $ANTLR end "rule__MultiService__Group__7__Impl"


    // $ANTLR start "rule__MultiService__Group__8"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3363:1: rule__MultiService__Group__8 : rule__MultiService__Group__8__Impl ;
    public final void rule__MultiService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3367:1: ( rule__MultiService__Group__8__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3368:2: rule__MultiService__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__8__Impl_in_rule__MultiService__Group__86814);
            rule__MultiService__Group__8__Impl();

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
    // $ANTLR end "rule__MultiService__Group__8"


    // $ANTLR start "rule__MultiService__Group__8__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3374:1: rule__MultiService__Group__8__Impl : ( '}' ) ;
    public final void rule__MultiService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3378:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3379:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3379:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3380:1: '}'
            {
             before(grammarAccess.getMultiServiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MultiService__Group__8__Impl6842); 
             after(grammarAccess.getMultiServiceAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__MultiService__Group__8__Impl"


    // $ANTLR start "rule__MultiService__Group_2__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3411:1: rule__MultiService__Group_2__0 : rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1 ;
    public final void rule__MultiService__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3415:1: ( rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3416:2: rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__0__Impl_in_rule__MultiService__Group_2__06891);
            rule__MultiService__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__1_in_rule__MultiService__Group_2__06894);
            rule__MultiService__Group_2__1();

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
    // $ANTLR end "rule__MultiService__Group_2__0"


    // $ANTLR start "rule__MultiService__Group_2__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3423:1: rule__MultiService__Group_2__0__Impl : ( '[' ) ;
    public final void rule__MultiService__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3427:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3428:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3428:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3429:1: '['
            {
             before(grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MultiService__Group_2__0__Impl6922); 
             after(grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__MultiService__Group_2__0__Impl"


    // $ANTLR start "rule__MultiService__Group_2__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3442:1: rule__MultiService__Group_2__1 : rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2 ;
    public final void rule__MultiService__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3446:1: ( rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3447:2: rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__1__Impl_in_rule__MultiService__Group_2__16953);
            rule__MultiService__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__2_in_rule__MultiService__Group_2__16956);
            rule__MultiService__Group_2__2();

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
    // $ANTLR end "rule__MultiService__Group_2__1"


    // $ANTLR start "rule__MultiService__Group_2__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3454:1: rule__MultiService__Group_2__1__Impl : ( ( rule__MultiService__ParallelAssignment_2_1 )? ) ;
    public final void rule__MultiService__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3458:1: ( ( ( rule__MultiService__ParallelAssignment_2_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3459:1: ( ( rule__MultiService__ParallelAssignment_2_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3459:1: ( ( rule__MultiService__ParallelAssignment_2_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3460:1: ( rule__MultiService__ParallelAssignment_2_1 )?
            {
             before(grammarAccess.getMultiServiceAccess().getParallelAssignment_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3461:1: ( rule__MultiService__ParallelAssignment_2_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3461:2: rule__MultiService__ParallelAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiService__ParallelAssignment_2_1_in_rule__MultiService__Group_2__1__Impl6983);
                    rule__MultiService__ParallelAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiServiceAccess().getParallelAssignment_2_1()); 

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
    // $ANTLR end "rule__MultiService__Group_2__1__Impl"


    // $ANTLR start "rule__MultiService__Group_2__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3471:1: rule__MultiService__Group_2__2 : rule__MultiService__Group_2__2__Impl ;
    public final void rule__MultiService__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3475:1: ( rule__MultiService__Group_2__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3476:2: rule__MultiService__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__2__Impl_in_rule__MultiService__Group_2__27014);
            rule__MultiService__Group_2__2__Impl();

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
    // $ANTLR end "rule__MultiService__Group_2__2"


    // $ANTLR start "rule__MultiService__Group_2__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3482:1: rule__MultiService__Group_2__2__Impl : ( ']' ) ;
    public final void rule__MultiService__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3486:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3487:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3487:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3488:1: ']'
            {
             before(grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MultiService__Group_2__2__Impl7042); 
             after(grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__MultiService__Group_2__2__Impl"


    // $ANTLR start "rule__MultiService__Group_4__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3507:1: rule__MultiService__Group_4__0 : rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1 ;
    public final void rule__MultiService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3511:1: ( rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3512:2: rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__0__Impl_in_rule__MultiService__Group_4__07079);
            rule__MultiService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__1_in_rule__MultiService__Group_4__07082);
            rule__MultiService__Group_4__1();

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
    // $ANTLR end "rule__MultiService__Group_4__0"


    // $ANTLR start "rule__MultiService__Group_4__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3519:1: rule__MultiService__Group_4__0__Impl : ( 'when : ' ) ;
    public final void rule__MultiService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3523:1: ( ( 'when : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3524:1: ( 'when : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3524:1: ( 'when : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3525:1: 'when : '
            {
             before(grammarAccess.getMultiServiceAccess().getWhenKeyword_4_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__MultiService__Group_4__0__Impl7110); 
             after(grammarAccess.getMultiServiceAccess().getWhenKeyword_4_0()); 

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
    // $ANTLR end "rule__MultiService__Group_4__0__Impl"


    // $ANTLR start "rule__MultiService__Group_4__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3538:1: rule__MultiService__Group_4__1 : rule__MultiService__Group_4__1__Impl ;
    public final void rule__MultiService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3542:1: ( rule__MultiService__Group_4__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3543:2: rule__MultiService__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__1__Impl_in_rule__MultiService__Group_4__17141);
            rule__MultiService__Group_4__1__Impl();

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
    // $ANTLR end "rule__MultiService__Group_4__1"


    // $ANTLR start "rule__MultiService__Group_4__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3549:1: rule__MultiService__Group_4__1__Impl : ( ( rule__MultiService__WhenAssignment_4_1 ) ) ;
    public final void rule__MultiService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3553:1: ( ( ( rule__MultiService__WhenAssignment_4_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3554:1: ( ( rule__MultiService__WhenAssignment_4_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3554:1: ( ( rule__MultiService__WhenAssignment_4_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3555:1: ( rule__MultiService__WhenAssignment_4_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getWhenAssignment_4_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3556:1: ( rule__MultiService__WhenAssignment_4_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3556:2: rule__MultiService__WhenAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__WhenAssignment_4_1_in_rule__MultiService__Group_4__1__Impl7168);
            rule__MultiService__WhenAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiServiceAccess().getWhenAssignment_4_1()); 

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
    // $ANTLR end "rule__MultiService__Group_4__1__Impl"


    // $ANTLR start "rule__MultiService__Group_7__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3570:1: rule__MultiService__Group_7__0 : rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1 ;
    public final void rule__MultiService__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3574:1: ( rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3575:2: rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0__Impl_in_rule__MultiService__Group_7__07202);
            rule__MultiService__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__1_in_rule__MultiService__Group_7__07205);
            rule__MultiService__Group_7__1();

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
    // $ANTLR end "rule__MultiService__Group_7__0"


    // $ANTLR start "rule__MultiService__Group_7__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3582:1: rule__MultiService__Group_7__0__Impl : ( ',' ) ;
    public final void rule__MultiService__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3586:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3587:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3587:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3588:1: ','
            {
             before(grammarAccess.getMultiServiceAccess().getCommaKeyword_7_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MultiService__Group_7__0__Impl7233); 
             after(grammarAccess.getMultiServiceAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__MultiService__Group_7__0__Impl"


    // $ANTLR start "rule__MultiService__Group_7__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3601:1: rule__MultiService__Group_7__1 : rule__MultiService__Group_7__1__Impl ;
    public final void rule__MultiService__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3605:1: ( rule__MultiService__Group_7__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3606:2: rule__MultiService__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__1__Impl_in_rule__MultiService__Group_7__17264);
            rule__MultiService__Group_7__1__Impl();

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
    // $ANTLR end "rule__MultiService__Group_7__1"


    // $ANTLR start "rule__MultiService__Group_7__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3612:1: rule__MultiService__Group_7__1__Impl : ( ( rule__MultiService__ServicesAssignment_7_1 ) ) ;
    public final void rule__MultiService__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3616:1: ( ( ( rule__MultiService__ServicesAssignment_7_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3617:1: ( ( rule__MultiService__ServicesAssignment_7_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3617:1: ( ( rule__MultiService__ServicesAssignment_7_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3618:1: ( rule__MultiService__ServicesAssignment_7_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesAssignment_7_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3619:1: ( rule__MultiService__ServicesAssignment_7_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3619:2: rule__MultiService__ServicesAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__ServicesAssignment_7_1_in_rule__MultiService__Group_7__1__Impl7291);
            rule__MultiService__ServicesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiServiceAccess().getServicesAssignment_7_1()); 

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
    // $ANTLR end "rule__MultiService__Group_7__1__Impl"


    // $ANTLR start "rule__Inout__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3633:1: rule__Inout__Group__0 : rule__Inout__Group__0__Impl rule__Inout__Group__1 ;
    public final void rule__Inout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3637:1: ( rule__Inout__Group__0__Impl rule__Inout__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3638:2: rule__Inout__Group__0__Impl rule__Inout__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__0__Impl_in_rule__Inout__Group__07325);
            rule__Inout__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__1_in_rule__Inout__Group__07328);
            rule__Inout__Group__1();

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
    // $ANTLR end "rule__Inout__Group__0"


    // $ANTLR start "rule__Inout__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3645:1: rule__Inout__Group__0__Impl : ( ( rule__Inout__ManyAssignment_0 )? ) ;
    public final void rule__Inout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3649:1: ( ( ( rule__Inout__ManyAssignment_0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3650:1: ( ( rule__Inout__ManyAssignment_0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3650:1: ( ( rule__Inout__ManyAssignment_0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3651:1: ( rule__Inout__ManyAssignment_0 )?
            {
             before(grammarAccess.getInoutAccess().getManyAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3652:1: ( rule__Inout__ManyAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3652:2: rule__Inout__ManyAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inout__ManyAssignment_0_in_rule__Inout__Group__0__Impl7355);
                    rule__Inout__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInoutAccess().getManyAssignment_0()); 

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
    // $ANTLR end "rule__Inout__Group__0__Impl"


    // $ANTLR start "rule__Inout__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3662:1: rule__Inout__Group__1 : rule__Inout__Group__1__Impl rule__Inout__Group__2 ;
    public final void rule__Inout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3666:1: ( rule__Inout__Group__1__Impl rule__Inout__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3667:2: rule__Inout__Group__1__Impl rule__Inout__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__1__Impl_in_rule__Inout__Group__17386);
            rule__Inout__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__2_in_rule__Inout__Group__17389);
            rule__Inout__Group__2();

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
    // $ANTLR end "rule__Inout__Group__1"


    // $ANTLR start "rule__Inout__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3674:1: rule__Inout__Group__1__Impl : ( ( rule__Inout__TypeAssignment_1 ) ) ;
    public final void rule__Inout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3678:1: ( ( ( rule__Inout__TypeAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3679:1: ( ( rule__Inout__TypeAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3679:1: ( ( rule__Inout__TypeAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3680:1: ( rule__Inout__TypeAssignment_1 )
            {
             before(grammarAccess.getInoutAccess().getTypeAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3681:1: ( rule__Inout__TypeAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3681:2: rule__Inout__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__TypeAssignment_1_in_rule__Inout__Group__1__Impl7416);
            rule__Inout__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInoutAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Inout__Group__1__Impl"


    // $ANTLR start "rule__Inout__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3691:1: rule__Inout__Group__2 : rule__Inout__Group__2__Impl ;
    public final void rule__Inout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3695:1: ( rule__Inout__Group__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3696:2: rule__Inout__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__2__Impl_in_rule__Inout__Group__27446);
            rule__Inout__Group__2__Impl();

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
    // $ANTLR end "rule__Inout__Group__2"


    // $ANTLR start "rule__Inout__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3702:1: rule__Inout__Group__2__Impl : ( ( rule__Inout__Group_2__0 )? ) ;
    public final void rule__Inout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3706:1: ( ( ( rule__Inout__Group_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3707:1: ( ( rule__Inout__Group_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3707:1: ( ( rule__Inout__Group_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3708:1: ( rule__Inout__Group_2__0 )?
            {
             before(grammarAccess.getInoutAccess().getGroup_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3709:1: ( rule__Inout__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3709:2: rule__Inout__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__0_in_rule__Inout__Group__2__Impl7473);
                    rule__Inout__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInoutAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Inout__Group__2__Impl"


    // $ANTLR start "rule__Inout__Group_2__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3725:1: rule__Inout__Group_2__0 : rule__Inout__Group_2__0__Impl rule__Inout__Group_2__1 ;
    public final void rule__Inout__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3729:1: ( rule__Inout__Group_2__0__Impl rule__Inout__Group_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3730:2: rule__Inout__Group_2__0__Impl rule__Inout__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__0__Impl_in_rule__Inout__Group_2__07510);
            rule__Inout__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__1_in_rule__Inout__Group_2__07513);
            rule__Inout__Group_2__1();

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
    // $ANTLR end "rule__Inout__Group_2__0"


    // $ANTLR start "rule__Inout__Group_2__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3737:1: rule__Inout__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Inout__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3741:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3742:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3742:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3743:1: '['
            {
             before(grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Inout__Group_2__0__Impl7541); 
             after(grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__Inout__Group_2__0__Impl"


    // $ANTLR start "rule__Inout__Group_2__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3756:1: rule__Inout__Group_2__1 : rule__Inout__Group_2__1__Impl rule__Inout__Group_2__2 ;
    public final void rule__Inout__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3760:1: ( rule__Inout__Group_2__1__Impl rule__Inout__Group_2__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3761:2: rule__Inout__Group_2__1__Impl rule__Inout__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__1__Impl_in_rule__Inout__Group_2__17572);
            rule__Inout__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__2_in_rule__Inout__Group_2__17575);
            rule__Inout__Group_2__2();

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
    // $ANTLR end "rule__Inout__Group_2__1"


    // $ANTLR start "rule__Inout__Group_2__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3768:1: rule__Inout__Group_2__1__Impl : ( 'with' ) ;
    public final void rule__Inout__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3772:1: ( ( 'with' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3773:1: ( 'with' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3773:1: ( 'with' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3774:1: 'with'
            {
             before(grammarAccess.getInoutAccess().getWithKeyword_2_1()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Inout__Group_2__1__Impl7603); 
             after(grammarAccess.getInoutAccess().getWithKeyword_2_1()); 

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
    // $ANTLR end "rule__Inout__Group_2__1__Impl"


    // $ANTLR start "rule__Inout__Group_2__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3787:1: rule__Inout__Group_2__2 : rule__Inout__Group_2__2__Impl rule__Inout__Group_2__3 ;
    public final void rule__Inout__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3791:1: ( rule__Inout__Group_2__2__Impl rule__Inout__Group_2__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3792:2: rule__Inout__Group_2__2__Impl rule__Inout__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__2__Impl_in_rule__Inout__Group_2__27634);
            rule__Inout__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__3_in_rule__Inout__Group_2__27637);
            rule__Inout__Group_2__3();

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
    // $ANTLR end "rule__Inout__Group_2__2"


    // $ANTLR start "rule__Inout__Group_2__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3799:1: rule__Inout__Group_2__2__Impl : ( ( rule__Inout__CompatibilityAssignment_2_2 ) ) ;
    public final void rule__Inout__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3803:1: ( ( ( rule__Inout__CompatibilityAssignment_2_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3804:1: ( ( rule__Inout__CompatibilityAssignment_2_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3804:1: ( ( rule__Inout__CompatibilityAssignment_2_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3805:1: ( rule__Inout__CompatibilityAssignment_2_2 )
            {
             before(grammarAccess.getInoutAccess().getCompatibilityAssignment_2_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3806:1: ( rule__Inout__CompatibilityAssignment_2_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3806:2: rule__Inout__CompatibilityAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__CompatibilityAssignment_2_2_in_rule__Inout__Group_2__2__Impl7664);
            rule__Inout__CompatibilityAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getInoutAccess().getCompatibilityAssignment_2_2()); 

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
    // $ANTLR end "rule__Inout__Group_2__2__Impl"


    // $ANTLR start "rule__Inout__Group_2__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3816:1: rule__Inout__Group_2__3 : rule__Inout__Group_2__3__Impl ;
    public final void rule__Inout__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3820:1: ( rule__Inout__Group_2__3__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3821:2: rule__Inout__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__3__Impl_in_rule__Inout__Group_2__37694);
            rule__Inout__Group_2__3__Impl();

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
    // $ANTLR end "rule__Inout__Group_2__3"


    // $ANTLR start "rule__Inout__Group_2__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3827:1: rule__Inout__Group_2__3__Impl : ( ']' ) ;
    public final void rule__Inout__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3831:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3832:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3832:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3833:1: ']'
            {
             before(grammarAccess.getInoutAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Inout__Group_2__3__Impl7722); 
             after(grammarAccess.getInoutAccess().getRightSquareBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__Inout__Group_2__3__Impl"


    // $ANTLR start "rule__Comp__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3854:1: rule__Comp__Group__0 : rule__Comp__Group__0__Impl rule__Comp__Group__1 ;
    public final void rule__Comp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3858:1: ( rule__Comp__Group__0__Impl rule__Comp__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3859:2: rule__Comp__Group__0__Impl rule__Comp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__0__Impl_in_rule__Comp__Group__07761);
            rule__Comp__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__1_in_rule__Comp__Group__07764);
            rule__Comp__Group__1();

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
    // $ANTLR end "rule__Comp__Group__0"


    // $ANTLR start "rule__Comp__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3866:1: rule__Comp__Group__0__Impl : ( ruleEString ) ;
    public final void rule__Comp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3870:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3871:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3871:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3872:1: ruleEString
            {
             before(grammarAccess.getCompAccess().getEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Comp__Group__0__Impl7791);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompAccess().getEStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__Comp__Group__0__Impl"


    // $ANTLR start "rule__Comp__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3883:1: rule__Comp__Group__1 : rule__Comp__Group__1__Impl rule__Comp__Group__2 ;
    public final void rule__Comp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3887:1: ( rule__Comp__Group__1__Impl rule__Comp__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3888:2: rule__Comp__Group__1__Impl rule__Comp__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__1__Impl_in_rule__Comp__Group__17820);
            rule__Comp__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__2_in_rule__Comp__Group__17823);
            rule__Comp__Group__2();

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
    // $ANTLR end "rule__Comp__Group__1"


    // $ANTLR start "rule__Comp__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3895:1: rule__Comp__Group__1__Impl : ( ( rule__Comp__Group_1__0 )* ) ;
    public final void rule__Comp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3899:1: ( ( ( rule__Comp__Group_1__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3900:1: ( ( rule__Comp__Group_1__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3900:1: ( ( rule__Comp__Group_1__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3901:1: ( rule__Comp__Group_1__0 )*
            {
             before(grammarAccess.getCompAccess().getGroup_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3902:1: ( rule__Comp__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==38) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3902:2: rule__Comp__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Comp__Group_1__0_in_rule__Comp__Group__1__Impl7850);
            	    rule__Comp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getCompAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Comp__Group__1__Impl"


    // $ANTLR start "rule__Comp__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3912:1: rule__Comp__Group__2 : rule__Comp__Group__2__Impl rule__Comp__Group__3 ;
    public final void rule__Comp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3916:1: ( rule__Comp__Group__2__Impl rule__Comp__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3917:2: rule__Comp__Group__2__Impl rule__Comp__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__2__Impl_in_rule__Comp__Group__27881);
            rule__Comp__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__3_in_rule__Comp__Group__27884);
            rule__Comp__Group__3();

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
    // $ANTLR end "rule__Comp__Group__2"


    // $ANTLR start "rule__Comp__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3924:1: rule__Comp__Group__2__Impl : ( '=' ) ;
    public final void rule__Comp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3928:1: ( ( '=' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3929:1: ( '=' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3929:1: ( '=' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3930:1: '='
            {
             before(grammarAccess.getCompAccess().getEqualsSignKeyword_2()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Comp__Group__2__Impl7912); 
             after(grammarAccess.getCompAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Comp__Group__2__Impl"


    // $ANTLR start "rule__Comp__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3943:1: rule__Comp__Group__3 : rule__Comp__Group__3__Impl ;
    public final void rule__Comp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3947:1: ( rule__Comp__Group__3__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3948:2: rule__Comp__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__3__Impl_in_rule__Comp__Group__37943);
            rule__Comp__Group__3__Impl();

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
    // $ANTLR end "rule__Comp__Group__3"


    // $ANTLR start "rule__Comp__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3954:1: rule__Comp__Group__3__Impl : ( ruleEString ) ;
    public final void rule__Comp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3958:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3959:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3959:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3960:1: ruleEString
            {
             before(grammarAccess.getCompAccess().getEStringParserRuleCall_3()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Comp__Group__3__Impl7970);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompAccess().getEStringParserRuleCall_3()); 

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
    // $ANTLR end "rule__Comp__Group__3__Impl"


    // $ANTLR start "rule__Comp__Group_1__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3979:1: rule__Comp__Group_1__0 : rule__Comp__Group_1__0__Impl rule__Comp__Group_1__1 ;
    public final void rule__Comp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3983:1: ( rule__Comp__Group_1__0__Impl rule__Comp__Group_1__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3984:2: rule__Comp__Group_1__0__Impl rule__Comp__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group_1__0__Impl_in_rule__Comp__Group_1__08007);
            rule__Comp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group_1__1_in_rule__Comp__Group_1__08010);
            rule__Comp__Group_1__1();

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
    // $ANTLR end "rule__Comp__Group_1__0"


    // $ANTLR start "rule__Comp__Group_1__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3991:1: rule__Comp__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Comp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3995:1: ( ( '.' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3996:1: ( '.' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3996:1: ( '.' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3997:1: '.'
            {
             before(grammarAccess.getCompAccess().getFullStopKeyword_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Comp__Group_1__0__Impl8038); 
             after(grammarAccess.getCompAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Comp__Group_1__0__Impl"


    // $ANTLR start "rule__Comp__Group_1__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4010:1: rule__Comp__Group_1__1 : rule__Comp__Group_1__1__Impl ;
    public final void rule__Comp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4014:1: ( rule__Comp__Group_1__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4015:2: rule__Comp__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group_1__1__Impl_in_rule__Comp__Group_1__18069);
            rule__Comp__Group_1__1__Impl();

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
    // $ANTLR end "rule__Comp__Group_1__1"


    // $ANTLR start "rule__Comp__Group_1__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4021:1: rule__Comp__Group_1__1__Impl : ( ruleEString ) ;
    public final void rule__Comp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4025:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4026:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4026:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4027:1: ruleEString
            {
             before(grammarAccess.getCompAccess().getEStringParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Comp__Group_1__1__Impl8096);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompAccess().getEStringParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Comp__Group_1__1__Impl"


    // $ANTLR start "rule__Root__MongoURIsAssignment_0_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4043:1: rule__Root__MongoURIsAssignment_0_2 : ( ruleEString ) ;
    public final void rule__Root__MongoURIsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4047:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4048:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4048:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4049:1: ruleEString
            {
             before(grammarAccess.getRootAccess().getMongoURIsEStringParserRuleCall_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Root__MongoURIsAssignment_0_28134);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRootAccess().getMongoURIsEStringParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Root__MongoURIsAssignment_0_2"


    // $ANTLR start "rule__Root__ArtifactsAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4058:1: rule__Root__ArtifactsAssignment_1 : ( ruleArtifact ) ;
    public final void rule__Root__ArtifactsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4062:1: ( ( ruleArtifact ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4063:1: ( ruleArtifact )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4063:1: ( ruleArtifact )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4064:1: ruleArtifact
            {
             before(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_18165);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Root__ArtifactsAssignment_1"


    // $ANTLR start "rule__Root__ArtifactsAssignment_2_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4073:1: rule__Root__ArtifactsAssignment_2_0 : ( ruleArtifact ) ;
    public final void rule__Root__ArtifactsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4077:1: ( ( ruleArtifact ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4078:1: ( ruleArtifact )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4078:1: ( ruleArtifact )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4079:1: ruleArtifact
            {
             before(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_2_08196);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Root__ArtifactsAssignment_2_0"


    // $ANTLR start "rule__Root__EntitiesAssignment_2_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4088:1: rule__Root__EntitiesAssignment_2_1 : ( ruleEntity ) ;
    public final void rule__Root__EntitiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4092:1: ( ( ruleEntity ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4093:1: ( ruleEntity )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4093:1: ( ruleEntity )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4094:1: ruleEntity
            {
             before(grammarAccess.getRootAccess().getEntitiesEntityParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Root__EntitiesAssignment_2_18227);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getRootAccess().getEntitiesEntityParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Root__EntitiesAssignment_2_1"


    // $ANTLR start "rule__Root__ServicesAssignment_2_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4103:1: rule__Root__ServicesAssignment_2_2 : ( ruleService ) ;
    public final void rule__Root__ServicesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4107:1: ( ( ruleService ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4108:1: ( ruleService )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4108:1: ( ruleService )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4109:1: ruleService
            {
             before(grammarAccess.getRootAccess().getServicesServiceParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_rule__Root__ServicesAssignment_2_28258);
            ruleService();

            state._fsp--;

             after(grammarAccess.getRootAccess().getServicesServiceParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Root__ServicesAssignment_2_2"


    // $ANTLR start "rule__Artifact__NameAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4118:1: rule__Artifact__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Artifact__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4122:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4123:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4123:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4124:1: ruleEString
            {
             before(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Artifact__NameAssignment_18289);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Artifact__NameAssignment_1"


    // $ANTLR start "rule__Artifact__ExtensionAssignment_2_1_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4133:1: rule__Artifact__ExtensionAssignment_2_1_2 : ( ruleEString ) ;
    public final void rule__Artifact__ExtensionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4137:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4138:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4138:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4139:1: ruleEString
            {
             before(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Artifact__ExtensionAssignment_2_1_28320);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__Artifact__ExtensionAssignment_2_1_2"


    // $ANTLR start "rule__Artifact__FormatAssignment_2_2_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4148:1: rule__Artifact__FormatAssignment_2_2_1 : ( ruleFormatEnum ) ;
    public final void rule__Artifact__FormatAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4152:1: ( ( ruleFormatEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4153:1: ( ruleFormatEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4153:1: ( ruleFormatEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4154:1: ruleFormatEnum
            {
             before(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFormatEnum_in_rule__Artifact__FormatAssignment_2_2_18351);
            ruleFormatEnum();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Artifact__FormatAssignment_2_2_1"


    // $ANTLR start "rule__Artifact__BasicServicesAssignment_2_3_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4163:1: rule__Artifact__BasicServicesAssignment_2_3_1 : ( ruleServiceEnum ) ;
    public final void rule__Artifact__BasicServicesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4167:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4168:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4168:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4169:1: ruleServiceEnum
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_18382);
            ruleServiceEnum();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__Artifact__BasicServicesAssignment_2_3_1"


    // $ANTLR start "rule__Artifact__BasicServicesAssignment_2_3_2_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4178:1: rule__Artifact__BasicServicesAssignment_2_3_2_1 : ( ruleServiceEnum ) ;
    public final void rule__Artifact__BasicServicesAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4182:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4183:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4183:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4184:1: ruleServiceEnum
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_2_18413);
            ruleServiceEnum();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_2_1_0()); 

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
    // $ANTLR end "rule__Artifact__BasicServicesAssignment_2_3_2_1"


    // $ANTLR start "rule__Artifact__AttributesAssignment_4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4193:1: rule__Artifact__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Artifact__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4197:1: ( ( ruleAttribute ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4198:1: ( ruleAttribute )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4198:1: ( ruleAttribute )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4199:1: ruleAttribute
            {
             before(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Artifact__AttributesAssignment_48444);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Artifact__AttributesAssignment_4"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4208:1: rule__Entity__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4212:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4213:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4213:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4214:1: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Entity__NameAssignment_18475);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4223:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4227:1: ( ( ruleAttribute ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4228:1: ( ruleAttribute )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4228:1: ( ruleAttribute )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4229:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_38506);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


    // $ANTLR start "rule__Primitive__ManyAssignment_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4238:1: rule__Primitive__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Primitive__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4242:1: ( ( ( 'many' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4243:1: ( ( 'many' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4243:1: ( ( 'many' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4244:1: ( 'many' )
            {
             before(grammarAccess.getPrimitiveAccess().getManyManyKeyword_0_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4245:1: ( 'many' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4246:1: 'many'
            {
             before(grammarAccess.getPrimitiveAccess().getManyManyKeyword_0_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Primitive__ManyAssignment_08542); 
             after(grammarAccess.getPrimitiveAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getPrimitiveAccess().getManyManyKeyword_0_0()); 

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
    // $ANTLR end "rule__Primitive__ManyAssignment_0"


    // $ANTLR start "rule__Primitive__RequiredAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4261:1: rule__Primitive__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__Primitive__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4265:1: ( ( ( 'required' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4266:1: ( ( 'required' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4266:1: ( ( 'required' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4267:1: ( 'required' )
            {
             before(grammarAccess.getPrimitiveAccess().getRequiredRequiredKeyword_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4268:1: ( 'required' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4269:1: 'required'
            {
             before(grammarAccess.getPrimitiveAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Primitive__RequiredAssignment_18586); 
             after(grammarAccess.getPrimitiveAccess().getRequiredRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getPrimitiveAccess().getRequiredRequiredKeyword_1_0()); 

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
    // $ANTLR end "rule__Primitive__RequiredAssignment_1"


    // $ANTLR start "rule__Primitive__NameAssignment_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4284:1: rule__Primitive__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Primitive__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4288:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4289:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4289:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4290:1: ruleEString
            {
             before(grammarAccess.getPrimitiveAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Primitive__NameAssignment_28625);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Primitive__NameAssignment_2"


    // $ANTLR start "rule__Primitive__TypeAssignment_4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4299:1: rule__Primitive__TypeAssignment_4 : ( ruleDataEnum ) ;
    public final void rule__Primitive__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4303:1: ( ( ruleDataEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4304:1: ( ruleDataEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4304:1: ( ruleDataEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4305:1: ruleDataEnum
            {
             before(grammarAccess.getPrimitiveAccess().getTypeDataEnumEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataEnum_in_rule__Primitive__TypeAssignment_48656);
            ruleDataEnum();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getTypeDataEnumEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Primitive__TypeAssignment_4"


    // $ANTLR start "rule__Reference__ManyAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4314:1: rule__Reference__ManyAssignment_1 : ( ( 'many' ) ) ;
    public final void rule__Reference__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4318:1: ( ( ( 'many' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4319:1: ( ( 'many' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4319:1: ( ( 'many' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4320:1: ( 'many' )
            {
             before(grammarAccess.getReferenceAccess().getManyManyKeyword_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4321:1: ( 'many' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4322:1: 'many'
            {
             before(grammarAccess.getReferenceAccess().getManyManyKeyword_1_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Reference__ManyAssignment_18692); 
             after(grammarAccess.getReferenceAccess().getManyManyKeyword_1_0()); 

            }

             after(grammarAccess.getReferenceAccess().getManyManyKeyword_1_0()); 

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
    // $ANTLR end "rule__Reference__ManyAssignment_1"


    // $ANTLR start "rule__Reference__NameAssignment_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4337:1: rule__Reference__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4341:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4342:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4342:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4343:1: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Reference__NameAssignment_28731);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Reference__NameAssignment_2"


    // $ANTLR start "rule__Reference__TypeAssignment_4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4352:1: rule__Reference__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Reference__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4356:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4357:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4357:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4358:1: ( ruleEString )
            {
             before(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_4_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4359:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4360:1: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getTypeEntityEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Reference__TypeAssignment_48766);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getTypeEntityEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_4_0()); 

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
    // $ANTLR end "rule__Reference__TypeAssignment_4"


    // $ANTLR start "rule__ArtifactID__ManyAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4371:1: rule__ArtifactID__ManyAssignment_1 : ( ( 'many' ) ) ;
    public final void rule__ArtifactID__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4375:1: ( ( ( 'many' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4376:1: ( ( 'many' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4376:1: ( ( 'many' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4377:1: ( 'many' )
            {
             before(grammarAccess.getArtifactIDAccess().getManyManyKeyword_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4378:1: ( 'many' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4379:1: 'many'
            {
             before(grammarAccess.getArtifactIDAccess().getManyManyKeyword_1_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__ArtifactID__ManyAssignment_18806); 
             after(grammarAccess.getArtifactIDAccess().getManyManyKeyword_1_0()); 

            }

             after(grammarAccess.getArtifactIDAccess().getManyManyKeyword_1_0()); 

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
    // $ANTLR end "rule__ArtifactID__ManyAssignment_1"


    // $ANTLR start "rule__ArtifactID__NameAssignment_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4394:1: rule__ArtifactID__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ArtifactID__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4398:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4399:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4399:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4400:1: ruleEString
            {
             before(grammarAccess.getArtifactIDAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ArtifactID__NameAssignment_28845);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArtifactIDAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ArtifactID__NameAssignment_2"


    // $ANTLR start "rule__ArtifactID__TypeAssignment_4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4409:1: rule__ArtifactID__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ArtifactID__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4413:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4414:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4414:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4415:1: ( ruleEString )
            {
             before(grammarAccess.getArtifactIDAccess().getTypeArtifactCrossReference_4_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4416:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4417:1: ruleEString
            {
             before(grammarAccess.getArtifactIDAccess().getTypeArtifactEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ArtifactID__TypeAssignment_48880);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArtifactIDAccess().getTypeArtifactEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getArtifactIDAccess().getTypeArtifactCrossReference_4_0()); 

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
    // $ANTLR end "rule__ArtifactID__TypeAssignment_4"


    // $ANTLR start "rule__OnService__ArtifactAssignment_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4428:1: rule__OnService__ArtifactAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__OnService__ArtifactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4432:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4433:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4433:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4434:1: ( ruleEString )
            {
             before(grammarAccess.getOnServiceAccess().getArtifactArtifactCrossReference_0_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4435:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4436:1: ruleEString
            {
             before(grammarAccess.getOnServiceAccess().getArtifactArtifactEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnService__ArtifactAssignment_08919);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOnServiceAccess().getArtifactArtifactEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOnServiceAccess().getArtifactArtifactCrossReference_0_0()); 

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
    // $ANTLR end "rule__OnService__ArtifactAssignment_0"


    // $ANTLR start "rule__OnService__WhenServicesAssignment_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4447:1: rule__OnService__WhenServicesAssignment_2 : ( ruleServiceEnum ) ;
    public final void rule__OnService__WhenServicesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4451:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4452:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4452:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4453:1: ruleServiceEnum
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_28954);
            ruleServiceEnum();

            state._fsp--;

             after(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__OnService__WhenServicesAssignment_2"


    // $ANTLR start "rule__OnService__WhenServicesAssignment_3_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4462:1: rule__OnService__WhenServicesAssignment_3_1 : ( ruleServiceEnum ) ;
    public final void rule__OnService__WhenServicesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4466:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4467:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4467:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4468:1: ruleServiceEnum
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_3_18985);
            ruleServiceEnum();

            state._fsp--;

             after(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__OnService__WhenServicesAssignment_3_1"


    // $ANTLR start "rule__SimpleService__NameAssignment_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4477:1: rule__SimpleService__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimpleService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4481:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4482:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4482:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4483:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__NameAssignment_29016);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimpleService__NameAssignment_2"


    // $ANTLR start "rule__SimpleService__InputAssignment_4_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4492:1: rule__SimpleService__InputAssignment_4_1 : ( ruleInout ) ;
    public final void rule__SimpleService__InputAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4496:1: ( ( ruleInout ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4497:1: ( ruleInout )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4497:1: ( ruleInout )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4498:1: ruleInout
            {
             before(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_rule__SimpleService__InputAssignment_4_19047);
            ruleInout();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SimpleService__InputAssignment_4_1"


    // $ANTLR start "rule__SimpleService__InputAssignment_4_2_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4507:1: rule__SimpleService__InputAssignment_4_2_1 : ( ruleInout ) ;
    public final void rule__SimpleService__InputAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4511:1: ( ( ruleInout ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4512:1: ( ruleInout )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4512:1: ( ruleInout )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4513:1: ruleInout
            {
             before(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_rule__SimpleService__InputAssignment_4_2_19078);
            ruleInout();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__SimpleService__InputAssignment_4_2_1"


    // $ANTLR start "rule__SimpleService__OutputAssignment_5_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4522:1: rule__SimpleService__OutputAssignment_5_1 : ( ruleInout ) ;
    public final void rule__SimpleService__OutputAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4526:1: ( ( ruleInout ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4527:1: ( ruleInout )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4527:1: ( ruleInout )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4528:1: ruleInout
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_rule__SimpleService__OutputAssignment_5_19109);
            ruleInout();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__SimpleService__OutputAssignment_5_1"


    // $ANTLR start "rule__SimpleService__OutputAssignment_5_2_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4537:1: rule__SimpleService__OutputAssignment_5_2_1 : ( ruleInout ) ;
    public final void rule__SimpleService__OutputAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4541:1: ( ( ruleInout ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4542:1: ( ruleInout )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4542:1: ( ruleInout )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4543:1: ruleInout
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_rule__SimpleService__OutputAssignment_5_2_19140);
            ruleInout();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_2_1_0()); 

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
    // $ANTLR end "rule__SimpleService__OutputAssignment_5_2_1"


    // $ANTLR start "rule__SimpleService__WhenAssignment_6_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4552:1: rule__SimpleService__WhenAssignment_6_1 : ( ruleOnService ) ;
    public final void rule__SimpleService__WhenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4556:1: ( ( ruleOnService ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4557:1: ( ruleOnService )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4557:1: ( ruleOnService )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4558:1: ruleOnService
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_rule__SimpleService__WhenAssignment_6_19171);
            ruleOnService();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__SimpleService__WhenAssignment_6_1"


    // $ANTLR start "rule__MultiService__NameAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4567:1: rule__MultiService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MultiService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4571:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4572:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4572:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4573:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__NameAssignment_19202);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiServiceAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MultiService__NameAssignment_1"


    // $ANTLR start "rule__MultiService__ParallelAssignment_2_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4582:1: rule__MultiService__ParallelAssignment_2_1 : ( ( 'parallel' ) ) ;
    public final void rule__MultiService__ParallelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4586:1: ( ( ( 'parallel' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4587:1: ( ( 'parallel' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4587:1: ( ( 'parallel' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4588:1: ( 'parallel' )
            {
             before(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4589:1: ( 'parallel' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4590:1: 'parallel'
            {
             before(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__MultiService__ParallelAssignment_2_19238); 
             after(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 

            }

             after(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 

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
    // $ANTLR end "rule__MultiService__ParallelAssignment_2_1"


    // $ANTLR start "rule__MultiService__WhenAssignment_4_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4605:1: rule__MultiService__WhenAssignment_4_1 : ( ruleOnService ) ;
    public final void rule__MultiService__WhenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4609:1: ( ( ruleOnService ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4610:1: ( ruleOnService )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4610:1: ( ruleOnService )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4611:1: ruleOnService
            {
             before(grammarAccess.getMultiServiceAccess().getWhenOnServiceParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_rule__MultiService__WhenAssignment_4_19277);
            ruleOnService();

            state._fsp--;

             after(grammarAccess.getMultiServiceAccess().getWhenOnServiceParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__MultiService__WhenAssignment_4_1"


    // $ANTLR start "rule__MultiService__ServicesAssignment_6"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4620:1: rule__MultiService__ServicesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__MultiService__ServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4624:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4625:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4625:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4626:1: ( ruleEString )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_6_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4627:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4628:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_69312);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_6_0()); 

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
    // $ANTLR end "rule__MultiService__ServicesAssignment_6"


    // $ANTLR start "rule__MultiService__ServicesAssignment_7_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4639:1: rule__MultiService__ServicesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__MultiService__ServicesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4643:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4644:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4644:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4645:1: ( ruleEString )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_7_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4646:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4647:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_7_19351);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__MultiService__ServicesAssignment_7_1"


    // $ANTLR start "rule__Inout__ManyAssignment_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4658:1: rule__Inout__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Inout__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4662:1: ( ( ( 'many' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4663:1: ( ( 'many' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4663:1: ( ( 'many' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4664:1: ( 'many' )
            {
             before(grammarAccess.getInoutAccess().getManyManyKeyword_0_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4665:1: ( 'many' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4666:1: 'many'
            {
             before(grammarAccess.getInoutAccess().getManyManyKeyword_0_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Inout__ManyAssignment_09391); 
             after(grammarAccess.getInoutAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getInoutAccess().getManyManyKeyword_0_0()); 

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
    // $ANTLR end "rule__Inout__ManyAssignment_0"


    // $ANTLR start "rule__Inout__TypeAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4681:1: rule__Inout__TypeAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Inout__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4685:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4686:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4686:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4687:1: ( ruleEString )
            {
             before(grammarAccess.getInoutAccess().getTypeAbstractEntityCrossReference_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4688:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4689:1: ruleEString
            {
             before(grammarAccess.getInoutAccess().getTypeAbstractEntityEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Inout__TypeAssignment_19434);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInoutAccess().getTypeAbstractEntityEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInoutAccess().getTypeAbstractEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__Inout__TypeAssignment_1"


    // $ANTLR start "rule__Inout__CompatibilityAssignment_2_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4700:1: rule__Inout__CompatibilityAssignment_2_2 : ( ruleComp ) ;
    public final void rule__Inout__CompatibilityAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4704:1: ( ( ruleComp ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4705:1: ( ruleComp )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4705:1: ( ruleComp )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4706:1: ruleComp
            {
             before(grammarAccess.getInoutAccess().getCompatibilityCompParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComp_in_rule__Inout__CompatibilityAssignment_2_29469);
            ruleComp();

            state._fsp--;

             after(grammarAccess.getInoutAccess().getCompatibilityCompParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Inout__CompatibilityAssignment_2_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0_in_ruleRoot94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_entryRuleService121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Alternatives_in_ruleService154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtifact250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__0_in_ruleArtifact276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitive432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__0_in_rulePrimitive458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_entryRuleReference485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReference492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifactID_in_entryRuleArtifactID545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtifactID552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__0_in_ruleArtifactID578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_entryRuleOnService605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnService612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__0_in_ruleOnService638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_entryRuleSimpleService665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleService672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__0_in_ruleSimpleService698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_entryRuleMultiService725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiService732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__0_in_ruleMultiService758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_entryRuleInout785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInout792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group__0_in_ruleInout818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComp_in_entryRuleComp845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComp852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group__0_in_ruleComp878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FormatEnum__Alternatives_in_ruleFormatEnum915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceEnum__Alternatives_in_ruleServiceEnum951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataEnum__Alternatives_in_ruleDataEnum987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ArtifactsAssignment_2_0_in_rule__Root__Alternatives_21022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__EntitiesAssignment_2_1_in_rule__Root__Alternatives_21040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ServicesAssignment_2_2_in_rule__Root__Alternatives_21058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_rule__Service__Alternatives1091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_rule__Service__Alternatives1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitive_in_rule__Attribute__Alternatives1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_rule__Attribute__Alternatives1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifactID_in_rule__Attribute__Alternatives1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__FormatEnum__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FormatEnum__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FormatEnum__Alternatives1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FormatEnum__Alternatives1321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FormatEnum__Alternatives1342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__FormatEnum__Alternatives1363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__FormatEnum__Alternatives1384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ServiceEnum__Alternatives1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ServiceEnum__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ServiceEnum__Alternatives1462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ServiceEnum__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ServiceEnum__Alternatives1504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ServiceEnum__Alternatives1525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ServiceEnum__Alternatives1546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ServiceEnum__Alternatives1567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__DataEnum__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__DataEnum__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__DataEnum__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__DataEnum__Alternatives1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01699 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_0__0_in_rule__Root__Group__0__Impl1729 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11760 = new BitSet(new long[]{0x0002240100000000L});
        public static final BitSet FOLLOW_rule__Root__Group__2_in_rule__Root__Group__11763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ArtifactsAssignment_1_in_rule__Root__Group__1__Impl1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__2__Impl_in_rule__Root__Group__21820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Alternatives_2_in_rule__Root__Group__2__Impl1847 = new BitSet(new long[]{0x0002240100000002L});
        public static final BitSet FOLLOW_rule__Root__Group_0__0__Impl_in_rule__Root__Group_0__01884 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Root__Group_0__1_in_rule__Root__Group_0__01887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Root__Group_0__0__Impl1915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_0__1__Impl_in_rule__Root__Group_0__11946 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Root__Group_0__2_in_rule__Root__Group_0__11949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Root__Group_0__1__Impl1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group_0__2__Impl_in_rule__Root__Group_0__22008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__MongoURIsAssignment_0_2_in_rule__Root__Group_0__2__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__0__Impl_in_rule__Artifact__Group__02071 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__1_in_rule__Artifact__Group__02074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Artifact__Group__0__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__1__Impl_in_rule__Artifact__Group__12133 = new BitSet(new long[]{0x0000000A00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group__2_in_rule__Artifact__Group__12136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__NameAssignment_1_in_rule__Artifact__Group__1__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__2__Impl_in_rule__Artifact__Group__22193 = new BitSet(new long[]{0x0000000A00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group__3_in_rule__Artifact__Group__22196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__0_in_rule__Artifact__Group__2__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__3__Impl_in_rule__Artifact__Group__32254 = new BitSet(new long[]{0x0030180400000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__4_in_rule__Artifact__Group__32257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Artifact__Group__3__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__4__Impl_in_rule__Artifact__Group__42316 = new BitSet(new long[]{0x0030180400000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__5_in_rule__Artifact__Group__42319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__AttributesAssignment_4_in_rule__Artifact__Group__4__Impl2346 = new BitSet(new long[]{0x0030180000000032L});
        public static final BitSet FOLLOW_rule__Artifact__Group__5__Impl_in_rule__Artifact__Group__52377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Artifact__Group__5__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__0__Impl_in_rule__Artifact__Group_2__02448 = new BitSet(new long[]{0x000001B000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__1_in_rule__Artifact__Group_2__02451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Artifact__Group_2__0__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__1__Impl_in_rule__Artifact__Group_2__12510 = new BitSet(new long[]{0x000001B000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__2_in_rule__Artifact__Group_2__12513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__0_in_rule__Artifact__Group_2__1__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__2__Impl_in_rule__Artifact__Group_2__22571 = new BitSet(new long[]{0x000001B000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__3_in_rule__Artifact__Group_2__22574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__0_in_rule__Artifact__Group_2__2__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__3__Impl_in_rule__Artifact__Group_2__32632 = new BitSet(new long[]{0x000001B000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__4_in_rule__Artifact__Group_2__32635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__0_in_rule__Artifact__Group_2__3__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__4__Impl_in_rule__Artifact__Group_2__42693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Artifact__Group_2__4__Impl2721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__0__Impl_in_rule__Artifact__Group_2_1__02762 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__1_in_rule__Artifact__Group_2_1__02765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Artifact__Group_2_1__0__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__1__Impl_in_rule__Artifact__Group_2_1__12824 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__2_in_rule__Artifact__Group_2_1__12827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Artifact__Group_2_1__1__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__2__Impl_in_rule__Artifact__Group_2_1__22886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__ExtensionAssignment_2_1_2_in_rule__Artifact__Group_2_1__2__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__0__Impl_in_rule__Artifact__Group_2_2__02949 = new BitSet(new long[]{0x000000000003F800L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__1_in_rule__Artifact__Group_2_2__02952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Artifact__Group_2_2__0__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__1__Impl_in_rule__Artifact__Group_2_2__13011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__FormatAssignment_2_2_1_in_rule__Artifact__Group_2_2__1__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__0__Impl_in_rule__Artifact__Group_2_3__03072 = new BitSet(new long[]{0x0000000003FC0000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__1_in_rule__Artifact__Group_2_3__03075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Artifact__Group_2_3__0__Impl3103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__1__Impl_in_rule__Artifact__Group_2_3__13134 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__2_in_rule__Artifact__Group_2_3__13137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_1_in_rule__Artifact__Group_2_3__1__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__2__Impl_in_rule__Artifact__Group_2_3__23194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__0_in_rule__Artifact__Group_2_3__2__Impl3221 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__0__Impl_in_rule__Artifact__Group_2_3_2__03258 = new BitSet(new long[]{0x0000000003FC0000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__1_in_rule__Artifact__Group_2_3_2__03261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Artifact__Group_2_3_2__0__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__1__Impl_in_rule__Artifact__Group_2_3_2__13320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_2_1_in_rule__Artifact__Group_2_3_2__1__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03381 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Entity__Group__0__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13443 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23503 = new BitSet(new long[]{0x0030180400000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Entity__Group__2__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33565 = new BitSet(new long[]{0x0030180400000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl3595 = new BitSet(new long[]{0x0030180000000032L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Entity__Group__4__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03695 = new BitSet(new long[]{0x0030000000000030L});
        public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__ManyAssignment_0_in_rule__Primitive__Group__0__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13756 = new BitSet(new long[]{0x0030000000000030L});
        public static final BitSet FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__13759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__RequiredAssignment_1_in_rule__Primitive__Group__1__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__23817 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Primitive__Group__3_in_rule__Primitive__Group__23820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__NameAssignment_2_in_rule__Primitive__Group__2__Impl3847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__3__Impl_in_rule__Primitive__Group__33877 = new BitSet(new long[]{0x000000003C000000L});
        public static final BitSet FOLLOW_rule__Primitive__Group__4_in_rule__Primitive__Group__33880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Primitive__Group__3__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__4__Impl_in_rule__Primitive__Group__43939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__TypeAssignment_4_in_rule__Primitive__Group__4__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__04006 = new BitSet(new long[]{0x0010000000000030L});
        public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__04009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Reference__Group__0__Impl4037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__14068 = new BitSet(new long[]{0x0010000000000030L});
        public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__14071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__ManyAssignment_1_in_rule__Reference__Group__1__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__24129 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__24132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__34189 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__34192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Reference__Group__3__Impl4220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__TypeAssignment_4_in_rule__Reference__Group__4__Impl4278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__0__Impl_in_rule__ArtifactID__Group__04318 = new BitSet(new long[]{0x0010000000000030L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__1_in_rule__ArtifactID__Group__04321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__ArtifactID__Group__0__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__1__Impl_in_rule__ArtifactID__Group__14380 = new BitSet(new long[]{0x0010000000000030L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__2_in_rule__ArtifactID__Group__14383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__ManyAssignment_1_in_rule__ArtifactID__Group__1__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__2__Impl_in_rule__ArtifactID__Group__24441 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__3_in_rule__ArtifactID__Group__24444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__NameAssignment_2_in_rule__ArtifactID__Group__2__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__3__Impl_in_rule__ArtifactID__Group__34501 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__4_in_rule__ArtifactID__Group__34504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ArtifactID__Group__3__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__4__Impl_in_rule__ArtifactID__Group__44563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__TypeAssignment_4_in_rule__ArtifactID__Group__4__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__0__Impl_in_rule__OnService__Group__04630 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__1_in_rule__OnService__Group__04633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__ArtifactAssignment_0_in_rule__OnService__Group__0__Impl4660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__1__Impl_in_rule__OnService__Group__14690 = new BitSet(new long[]{0x0000000003FC0000L});
        public static final BitSet FOLLOW_rule__OnService__Group__2_in_rule__OnService__Group__14693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__OnService__Group__1__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__2__Impl_in_rule__OnService__Group__24752 = new BitSet(new long[]{0x0000021000000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__3_in_rule__OnService__Group__24755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__WhenServicesAssignment_2_in_rule__OnService__Group__2__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__3__Impl_in_rule__OnService__Group__34812 = new BitSet(new long[]{0x0000021000000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__4_in_rule__OnService__Group__34815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__0_in_rule__OnService__Group__3__Impl4842 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__4__Impl_in_rule__OnService__Group__44873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__OnService__Group__4__Impl4901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__0__Impl_in_rule__OnService__Group_3__04942 = new BitSet(new long[]{0x0000000003FC0000L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__1_in_rule__OnService__Group_3__04945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__OnService__Group_3__0__Impl4973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__1__Impl_in_rule__OnService__Group_3__15004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__WhenServicesAssignment_3_1_in_rule__OnService__Group_3__1__Impl5031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__0__Impl_in_rule__SimpleService__Group__05065 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__1_in_rule__SimpleService__Group__05068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__1__Impl_in_rule__SimpleService__Group__15126 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__2_in_rule__SimpleService__Group__15129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__SimpleService__Group__1__Impl5157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__2__Impl_in_rule__SimpleService__Group__25188 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__3_in_rule__SimpleService__Group__25191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__NameAssignment_2_in_rule__SimpleService__Group__2__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__3__Impl_in_rule__SimpleService__Group__35248 = new BitSet(new long[]{0x0001C00400000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__4_in_rule__SimpleService__Group__35251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SimpleService__Group__3__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__4__Impl_in_rule__SimpleService__Group__45310 = new BitSet(new long[]{0x0001C00400000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__5_in_rule__SimpleService__Group__45313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__0_in_rule__SimpleService__Group__4__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__5__Impl_in_rule__SimpleService__Group__55371 = new BitSet(new long[]{0x0001C00400000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__6_in_rule__SimpleService__Group__55374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__0_in_rule__SimpleService__Group__5__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__6__Impl_in_rule__SimpleService__Group__65432 = new BitSet(new long[]{0x0001C00400000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__7_in_rule__SimpleService__Group__65435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_6__0_in_rule__SimpleService__Group__6__Impl5462 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__7__Impl_in_rule__SimpleService__Group__75493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__SimpleService__Group__7__Impl5521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__0__Impl_in_rule__SimpleService__Group_4__05568 = new BitSet(new long[]{0x0010000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__1_in_rule__SimpleService__Group_4__05571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__SimpleService__Group_4__0__Impl5599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__1__Impl_in_rule__SimpleService__Group_4__15630 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__2_in_rule__SimpleService__Group_4__15633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__InputAssignment_4_1_in_rule__SimpleService__Group_4__1__Impl5660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__2__Impl_in_rule__SimpleService__Group_4__25690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__0_in_rule__SimpleService__Group_4__2__Impl5717 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__0__Impl_in_rule__SimpleService__Group_4_2__05754 = new BitSet(new long[]{0x0010000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__1_in_rule__SimpleService__Group_4_2__05757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__SimpleService__Group_4_2__0__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__1__Impl_in_rule__SimpleService__Group_4_2__15816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__InputAssignment_4_2_1_in_rule__SimpleService__Group_4_2__1__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__0__Impl_in_rule__SimpleService__Group_5__05877 = new BitSet(new long[]{0x0010000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__1_in_rule__SimpleService__Group_5__05880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__SimpleService__Group_5__0__Impl5908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__1__Impl_in_rule__SimpleService__Group_5__15939 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__2_in_rule__SimpleService__Group_5__15942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__OutputAssignment_5_1_in_rule__SimpleService__Group_5__1__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__2__Impl_in_rule__SimpleService__Group_5__25999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5_2__0_in_rule__SimpleService__Group_5__2__Impl6026 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5_2__0__Impl_in_rule__SimpleService__Group_5_2__06063 = new BitSet(new long[]{0x0010000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5_2__1_in_rule__SimpleService__Group_5_2__06066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__SimpleService__Group_5_2__0__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5_2__1__Impl_in_rule__SimpleService__Group_5_2__16125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__OutputAssignment_5_2_1_in_rule__SimpleService__Group_5_2__1__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_6__0__Impl_in_rule__SimpleService__Group_6__06186 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_6__1_in_rule__SimpleService__Group_6__06189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__SimpleService__Group_6__0__Impl6217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_6__1__Impl_in_rule__SimpleService__Group_6__16248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__WhenAssignment_6_1_in_rule__SimpleService__Group_6__1__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__0__Impl_in_rule__MultiService__Group__06309 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group__1_in_rule__MultiService__Group__06312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__MultiService__Group__0__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__1__Impl_in_rule__MultiService__Group__16371 = new BitSet(new long[]{0x0000000A00000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__2_in_rule__MultiService__Group__16374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__NameAssignment_1_in_rule__MultiService__Group__1__Impl6401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__2__Impl_in_rule__MultiService__Group__26431 = new BitSet(new long[]{0x0000000A00000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__3_in_rule__MultiService__Group__26434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__0_in_rule__MultiService__Group__2__Impl6461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__3__Impl_in_rule__MultiService__Group__36492 = new BitSet(new long[]{0x0001010000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__4_in_rule__MultiService__Group__36495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MultiService__Group__3__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__4__Impl_in_rule__MultiService__Group__46554 = new BitSet(new long[]{0x0001010000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__5_in_rule__MultiService__Group__46557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__0_in_rule__MultiService__Group__4__Impl6584 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__5__Impl_in_rule__MultiService__Group__56615 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group__6_in_rule__MultiService__Group__56618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__MultiService__Group__5__Impl6646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__6__Impl_in_rule__MultiService__Group__66677 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__7_in_rule__MultiService__Group__66680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ServicesAssignment_6_in_rule__MultiService__Group__6__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__7__Impl_in_rule__MultiService__Group__76737 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__8_in_rule__MultiService__Group__76740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl6769 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl6781 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__8__Impl_in_rule__MultiService__Group__86814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MultiService__Group__8__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__0__Impl_in_rule__MultiService__Group_2__06891 = new BitSet(new long[]{0x0040001000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__1_in_rule__MultiService__Group_2__06894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MultiService__Group_2__0__Impl6922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__1__Impl_in_rule__MultiService__Group_2__16953 = new BitSet(new long[]{0x0040001000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__2_in_rule__MultiService__Group_2__16956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ParallelAssignment_2_1_in_rule__MultiService__Group_2__1__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__2__Impl_in_rule__MultiService__Group_2__27014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MultiService__Group_2__2__Impl7042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__0__Impl_in_rule__MultiService__Group_4__07079 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__1_in_rule__MultiService__Group_4__07082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__MultiService__Group_4__0__Impl7110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__1__Impl_in_rule__MultiService__Group_4__17141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__WhenAssignment_4_1_in_rule__MultiService__Group_4__1__Impl7168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0__Impl_in_rule__MultiService__Group_7__07202 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__1_in_rule__MultiService__Group_7__07205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MultiService__Group_7__0__Impl7233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__1__Impl_in_rule__MultiService__Group_7__17264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ServicesAssignment_7_1_in_rule__MultiService__Group_7__1__Impl7291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group__0__Impl_in_rule__Inout__Group__07325 = new BitSet(new long[]{0x0010000000000030L});
        public static final BitSet FOLLOW_rule__Inout__Group__1_in_rule__Inout__Group__07328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__ManyAssignment_0_in_rule__Inout__Group__0__Impl7355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group__1__Impl_in_rule__Inout__Group__17386 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Inout__Group__2_in_rule__Inout__Group__17389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__TypeAssignment_1_in_rule__Inout__Group__1__Impl7416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group__2__Impl_in_rule__Inout__Group__27446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__0_in_rule__Inout__Group__2__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__0__Impl_in_rule__Inout__Group_2__07510 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__1_in_rule__Inout__Group_2__07513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Inout__Group_2__0__Impl7541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__1__Impl_in_rule__Inout__Group_2__17572 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__2_in_rule__Inout__Group_2__17575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Inout__Group_2__1__Impl7603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__2__Impl_in_rule__Inout__Group_2__27634 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__3_in_rule__Inout__Group_2__27637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__CompatibilityAssignment_2_2_in_rule__Inout__Group_2__2__Impl7664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__3__Impl_in_rule__Inout__Group_2__37694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Inout__Group_2__3__Impl7722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group__0__Impl_in_rule__Comp__Group__07761 = new BitSet(new long[]{0x0008004000000000L});
        public static final BitSet FOLLOW_rule__Comp__Group__1_in_rule__Comp__Group__07764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Comp__Group__0__Impl7791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group__1__Impl_in_rule__Comp__Group__17820 = new BitSet(new long[]{0x0008004000000000L});
        public static final BitSet FOLLOW_rule__Comp__Group__2_in_rule__Comp__Group__17823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group_1__0_in_rule__Comp__Group__1__Impl7850 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group__2__Impl_in_rule__Comp__Group__27881 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Comp__Group__3_in_rule__Comp__Group__27884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Comp__Group__2__Impl7912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group__3__Impl_in_rule__Comp__Group__37943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Comp__Group__3__Impl7970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group_1__0__Impl_in_rule__Comp__Group_1__08007 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Comp__Group_1__1_in_rule__Comp__Group_1__08010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Comp__Group_1__0__Impl8038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group_1__1__Impl_in_rule__Comp__Group_1__18069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Comp__Group_1__1__Impl8096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Root__MongoURIsAssignment_0_28134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_18165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_2_08196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Root__EntitiesAssignment_2_18227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_rule__Root__ServicesAssignment_2_28258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Artifact__NameAssignment_18289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Artifact__ExtensionAssignment_2_1_28320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormatEnum_in_rule__Artifact__FormatAssignment_2_2_18351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_18382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_2_18413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Artifact__AttributesAssignment_48444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Entity__NameAssignment_18475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_38506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Primitive__ManyAssignment_08542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Primitive__RequiredAssignment_18586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Primitive__NameAssignment_28625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataEnum_in_rule__Primitive__TypeAssignment_48656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Reference__ManyAssignment_18692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Reference__NameAssignment_28731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Reference__TypeAssignment_48766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__ArtifactID__ManyAssignment_18806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ArtifactID__NameAssignment_28845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ArtifactID__TypeAssignment_48880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnService__ArtifactAssignment_08919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_28954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_3_18985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__NameAssignment_29016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_rule__SimpleService__InputAssignment_4_19047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_rule__SimpleService__InputAssignment_4_2_19078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_rule__SimpleService__OutputAssignment_5_19109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_rule__SimpleService__OutputAssignment_5_2_19140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_rule__SimpleService__WhenAssignment_6_19171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__NameAssignment_19202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__MultiService__ParallelAssignment_2_19238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_rule__MultiService__WhenAssignment_4_19277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_69312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_7_19351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Inout__ManyAssignment_09391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Inout__TypeAssignment_19434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComp_in_rule__Inout__CompatibilityAssignment_2_29469 = new BitSet(new long[]{0x0000000000000002L});
    }


}