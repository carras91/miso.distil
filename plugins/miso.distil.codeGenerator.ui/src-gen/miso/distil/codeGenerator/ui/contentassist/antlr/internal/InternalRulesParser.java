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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XMI'", "'BINARY'", "'TEXT'", "'XML'", "'JSON'", "'ATL'", "'ZIP'", "'upload'", "'download'", "'update'", "'read'", "'readAll'", "'search'", "'delete'", "'all'", "'Boolean'", "'Double'", "'Integer'", "'String'", "'Artifact'", "'{'", "'}'", "'['", "']'", "'extension '", "'.'", "'format '", "'services : '", "','", "'Entity'", "':'", "'ref'", "'id'", "'Service'", "'input : '", "'output : '", "'when : '", "'MultiService'", "'with'", "'='", "'many'", "'required'", "'parallel'"
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


    // $ANTLR start "rule__Root__Alternatives_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:513:1: rule__Root__Alternatives_1 : ( ( ( rule__Root__ArtifactsAssignment_1_0 ) ) | ( ( rule__Root__EntitiesAssignment_1_1 ) ) | ( ( rule__Root__ServicesAssignment_1_2 ) ) );
    public final void rule__Root__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:517:1: ( ( ( rule__Root__ArtifactsAssignment_1_0 ) ) | ( ( rule__Root__EntitiesAssignment_1_1 ) ) | ( ( rule__Root__ServicesAssignment_1_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 44:
            case 48:
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
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:518:1: ( ( rule__Root__ArtifactsAssignment_1_0 ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:518:1: ( ( rule__Root__ArtifactsAssignment_1_0 ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:519:1: ( rule__Root__ArtifactsAssignment_1_0 )
                    {
                     before(grammarAccess.getRootAccess().getArtifactsAssignment_1_0()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:520:1: ( rule__Root__ArtifactsAssignment_1_0 )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:520:2: rule__Root__ArtifactsAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__ArtifactsAssignment_1_0_in_rule__Root__Alternatives_11022);
                    rule__Root__ArtifactsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getArtifactsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:524:6: ( ( rule__Root__EntitiesAssignment_1_1 ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:524:6: ( ( rule__Root__EntitiesAssignment_1_1 ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:525:1: ( rule__Root__EntitiesAssignment_1_1 )
                    {
                     before(grammarAccess.getRootAccess().getEntitiesAssignment_1_1()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:526:1: ( rule__Root__EntitiesAssignment_1_1 )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:526:2: rule__Root__EntitiesAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__EntitiesAssignment_1_1_in_rule__Root__Alternatives_11040);
                    rule__Root__EntitiesAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getEntitiesAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:530:6: ( ( rule__Root__ServicesAssignment_1_2 ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:530:6: ( ( rule__Root__ServicesAssignment_1_2 ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:531:1: ( rule__Root__ServicesAssignment_1_2 )
                    {
                     before(grammarAccess.getRootAccess().getServicesAssignment_1_2()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:532:1: ( rule__Root__ServicesAssignment_1_2 )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:532:2: rule__Root__ServicesAssignment_1_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__ServicesAssignment_1_2_in_rule__Root__Alternatives_11058);
                    rule__Root__ServicesAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getServicesAssignment_1_2()); 

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
    // $ANTLR end "rule__Root__Alternatives_1"


    // $ANTLR start "rule__Service__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:541:1: rule__Service__Alternatives : ( ( ruleSimpleService ) | ( ruleMultiService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:545:1: ( ( ruleSimpleService ) | ( ruleMultiService ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==44) ) {
                alt2=1;
            }
            else if ( (LA2_0==48) ) {
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
            case 51:
            case 52:
                {
                alt3=1;
                }
                break;
            case 42:
                {
                alt3=2;
                }
                break;
            case 43:
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:792:1: rule__Root__Group__0__Impl : ( ( rule__Root__ArtifactsAssignment_0 ) ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:796:1: ( ( ( rule__Root__ArtifactsAssignment_0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:797:1: ( ( rule__Root__ArtifactsAssignment_0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:797:1: ( ( rule__Root__ArtifactsAssignment_0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:798:1: ( rule__Root__ArtifactsAssignment_0 )
            {
             before(grammarAccess.getRootAccess().getArtifactsAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:799:1: ( rule__Root__ArtifactsAssignment_0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:799:2: rule__Root__ArtifactsAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__ArtifactsAssignment_0_in_rule__Root__Group__0__Impl1729);
            rule__Root__ArtifactsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getArtifactsAssignment_0()); 

            }


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:809:1: rule__Root__Group__1 : rule__Root__Group__1__Impl ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:813:1: ( rule__Root__Group__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:814:2: rule__Root__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11759);
            rule__Root__Group__1__Impl();

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:820:1: rule__Root__Group__1__Impl : ( ( rule__Root__Alternatives_1 )* ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:824:1: ( ( ( rule__Root__Alternatives_1 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:825:1: ( ( rule__Root__Alternatives_1 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:825:1: ( ( rule__Root__Alternatives_1 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:826:1: ( rule__Root__Alternatives_1 )*
            {
             before(grammarAccess.getRootAccess().getAlternatives_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:827:1: ( rule__Root__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30||LA8_0==40||LA8_0==44||LA8_0==48) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:827:2: rule__Root__Alternatives_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__Alternatives_1_in_rule__Root__Group__1__Impl1786);
            	    rule__Root__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Artifact__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:841:1: rule__Artifact__Group__0 : rule__Artifact__Group__0__Impl rule__Artifact__Group__1 ;
    public final void rule__Artifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:845:1: ( rule__Artifact__Group__0__Impl rule__Artifact__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:846:2: rule__Artifact__Group__0__Impl rule__Artifact__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__0__Impl_in_rule__Artifact__Group__01821);
            rule__Artifact__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__1_in_rule__Artifact__Group__01824);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:853:1: rule__Artifact__Group__0__Impl : ( 'Artifact' ) ;
    public final void rule__Artifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:857:1: ( ( 'Artifact' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:858:1: ( 'Artifact' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:858:1: ( 'Artifact' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:859:1: 'Artifact'
            {
             before(grammarAccess.getArtifactAccess().getArtifactKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Artifact__Group__0__Impl1852); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:872:1: rule__Artifact__Group__1 : rule__Artifact__Group__1__Impl rule__Artifact__Group__2 ;
    public final void rule__Artifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:876:1: ( rule__Artifact__Group__1__Impl rule__Artifact__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:877:2: rule__Artifact__Group__1__Impl rule__Artifact__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__1__Impl_in_rule__Artifact__Group__11883);
            rule__Artifact__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__2_in_rule__Artifact__Group__11886);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:884:1: rule__Artifact__Group__1__Impl : ( ( rule__Artifact__NameAssignment_1 ) ) ;
    public final void rule__Artifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:888:1: ( ( ( rule__Artifact__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:889:1: ( ( rule__Artifact__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:889:1: ( ( rule__Artifact__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:890:1: ( rule__Artifact__NameAssignment_1 )
            {
             before(grammarAccess.getArtifactAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:891:1: ( rule__Artifact__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:891:2: rule__Artifact__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__NameAssignment_1_in_rule__Artifact__Group__1__Impl1913);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:901:1: rule__Artifact__Group__2 : rule__Artifact__Group__2__Impl rule__Artifact__Group__3 ;
    public final void rule__Artifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:905:1: ( rule__Artifact__Group__2__Impl rule__Artifact__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:906:2: rule__Artifact__Group__2__Impl rule__Artifact__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__2__Impl_in_rule__Artifact__Group__21943);
            rule__Artifact__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__3_in_rule__Artifact__Group__21946);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:913:1: rule__Artifact__Group__2__Impl : ( ( rule__Artifact__Group_2__0 )? ) ;
    public final void rule__Artifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:917:1: ( ( ( rule__Artifact__Group_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:918:1: ( ( rule__Artifact__Group_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:918:1: ( ( rule__Artifact__Group_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:919:1: ( rule__Artifact__Group_2__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:920:1: ( rule__Artifact__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:920:2: rule__Artifact__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__0_in_rule__Artifact__Group__2__Impl1973);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:930:1: rule__Artifact__Group__3 : rule__Artifact__Group__3__Impl rule__Artifact__Group__4 ;
    public final void rule__Artifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:934:1: ( rule__Artifact__Group__3__Impl rule__Artifact__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:935:2: rule__Artifact__Group__3__Impl rule__Artifact__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__3__Impl_in_rule__Artifact__Group__32004);
            rule__Artifact__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__4_in_rule__Artifact__Group__32007);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:942:1: rule__Artifact__Group__3__Impl : ( '{' ) ;
    public final void rule__Artifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:946:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:947:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:947:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:948:1: '{'
            {
             before(grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Artifact__Group__3__Impl2035); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:961:1: rule__Artifact__Group__4 : rule__Artifact__Group__4__Impl rule__Artifact__Group__5 ;
    public final void rule__Artifact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:965:1: ( rule__Artifact__Group__4__Impl rule__Artifact__Group__5 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:966:2: rule__Artifact__Group__4__Impl rule__Artifact__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__4__Impl_in_rule__Artifact__Group__42066);
            rule__Artifact__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__5_in_rule__Artifact__Group__42069);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:973:1: rule__Artifact__Group__4__Impl : ( ( rule__Artifact__AttributesAssignment_4 )* ) ;
    public final void rule__Artifact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:977:1: ( ( ( rule__Artifact__AttributesAssignment_4 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:978:1: ( ( rule__Artifact__AttributesAssignment_4 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:978:1: ( ( rule__Artifact__AttributesAssignment_4 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:979:1: ( rule__Artifact__AttributesAssignment_4 )*
            {
             before(grammarAccess.getArtifactAccess().getAttributesAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:980:1: ( rule__Artifact__AttributesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||(LA10_0>=42 && LA10_0<=43)||(LA10_0>=51 && LA10_0<=52)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:980:2: rule__Artifact__AttributesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Artifact__AttributesAssignment_4_in_rule__Artifact__Group__4__Impl2096);
            	    rule__Artifact__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:990:1: rule__Artifact__Group__5 : rule__Artifact__Group__5__Impl ;
    public final void rule__Artifact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:994:1: ( rule__Artifact__Group__5__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:995:2: rule__Artifact__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__5__Impl_in_rule__Artifact__Group__52127);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1001:1: rule__Artifact__Group__5__Impl : ( '}' ) ;
    public final void rule__Artifact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1005:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1006:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1006:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1007:1: '}'
            {
             before(grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Artifact__Group__5__Impl2155); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1032:1: rule__Artifact__Group_2__0 : rule__Artifact__Group_2__0__Impl rule__Artifact__Group_2__1 ;
    public final void rule__Artifact__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1036:1: ( rule__Artifact__Group_2__0__Impl rule__Artifact__Group_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1037:2: rule__Artifact__Group_2__0__Impl rule__Artifact__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__0__Impl_in_rule__Artifact__Group_2__02198);
            rule__Artifact__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__1_in_rule__Artifact__Group_2__02201);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1044:1: rule__Artifact__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Artifact__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1048:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1049:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1049:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1050:1: '['
            {
             before(grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Artifact__Group_2__0__Impl2229); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1063:1: rule__Artifact__Group_2__1 : rule__Artifact__Group_2__1__Impl rule__Artifact__Group_2__2 ;
    public final void rule__Artifact__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1067:1: ( rule__Artifact__Group_2__1__Impl rule__Artifact__Group_2__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1068:2: rule__Artifact__Group_2__1__Impl rule__Artifact__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__1__Impl_in_rule__Artifact__Group_2__12260);
            rule__Artifact__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__2_in_rule__Artifact__Group_2__12263);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1075:1: rule__Artifact__Group_2__1__Impl : ( ( rule__Artifact__Group_2_1__0 )? ) ;
    public final void rule__Artifact__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1079:1: ( ( ( rule__Artifact__Group_2_1__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1080:1: ( ( rule__Artifact__Group_2_1__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1080:1: ( ( rule__Artifact__Group_2_1__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1081:1: ( rule__Artifact__Group_2_1__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1082:1: ( rule__Artifact__Group_2_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1082:2: rule__Artifact__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__0_in_rule__Artifact__Group_2__1__Impl2290);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1092:1: rule__Artifact__Group_2__2 : rule__Artifact__Group_2__2__Impl rule__Artifact__Group_2__3 ;
    public final void rule__Artifact__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1096:1: ( rule__Artifact__Group_2__2__Impl rule__Artifact__Group_2__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1097:2: rule__Artifact__Group_2__2__Impl rule__Artifact__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__2__Impl_in_rule__Artifact__Group_2__22321);
            rule__Artifact__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__3_in_rule__Artifact__Group_2__22324);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1104:1: rule__Artifact__Group_2__2__Impl : ( ( rule__Artifact__Group_2_2__0 )? ) ;
    public final void rule__Artifact__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1108:1: ( ( ( rule__Artifact__Group_2_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1109:1: ( ( rule__Artifact__Group_2_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1109:1: ( ( rule__Artifact__Group_2_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1110:1: ( rule__Artifact__Group_2_2__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1111:1: ( rule__Artifact__Group_2_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1111:2: rule__Artifact__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__0_in_rule__Artifact__Group_2__2__Impl2351);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1121:1: rule__Artifact__Group_2__3 : rule__Artifact__Group_2__3__Impl rule__Artifact__Group_2__4 ;
    public final void rule__Artifact__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1125:1: ( rule__Artifact__Group_2__3__Impl rule__Artifact__Group_2__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1126:2: rule__Artifact__Group_2__3__Impl rule__Artifact__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__3__Impl_in_rule__Artifact__Group_2__32382);
            rule__Artifact__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__4_in_rule__Artifact__Group_2__32385);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1133:1: rule__Artifact__Group_2__3__Impl : ( ( rule__Artifact__Group_2_3__0 )? ) ;
    public final void rule__Artifact__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1137:1: ( ( ( rule__Artifact__Group_2_3__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1138:1: ( ( rule__Artifact__Group_2_3__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1138:1: ( ( rule__Artifact__Group_2_3__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1139:1: ( rule__Artifact__Group_2_3__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1140:1: ( rule__Artifact__Group_2_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1140:2: rule__Artifact__Group_2_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__0_in_rule__Artifact__Group_2__3__Impl2412);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1150:1: rule__Artifact__Group_2__4 : rule__Artifact__Group_2__4__Impl ;
    public final void rule__Artifact__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1154:1: ( rule__Artifact__Group_2__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1155:2: rule__Artifact__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__4__Impl_in_rule__Artifact__Group_2__42443);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1161:1: rule__Artifact__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Artifact__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1165:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1166:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1166:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1167:1: ']'
            {
             before(grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Artifact__Group_2__4__Impl2471); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1190:1: rule__Artifact__Group_2_1__0 : rule__Artifact__Group_2_1__0__Impl rule__Artifact__Group_2_1__1 ;
    public final void rule__Artifact__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1194:1: ( rule__Artifact__Group_2_1__0__Impl rule__Artifact__Group_2_1__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1195:2: rule__Artifact__Group_2_1__0__Impl rule__Artifact__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__0__Impl_in_rule__Artifact__Group_2_1__02512);
            rule__Artifact__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__1_in_rule__Artifact__Group_2_1__02515);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1202:1: rule__Artifact__Group_2_1__0__Impl : ( 'extension ' ) ;
    public final void rule__Artifact__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1206:1: ( ( 'extension ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1207:1: ( 'extension ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1207:1: ( 'extension ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1208:1: 'extension '
            {
             before(grammarAccess.getArtifactAccess().getExtensionKeyword_2_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Artifact__Group_2_1__0__Impl2543); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1221:1: rule__Artifact__Group_2_1__1 : rule__Artifact__Group_2_1__1__Impl rule__Artifact__Group_2_1__2 ;
    public final void rule__Artifact__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1225:1: ( rule__Artifact__Group_2_1__1__Impl rule__Artifact__Group_2_1__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1226:2: rule__Artifact__Group_2_1__1__Impl rule__Artifact__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__1__Impl_in_rule__Artifact__Group_2_1__12574);
            rule__Artifact__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__2_in_rule__Artifact__Group_2_1__12577);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1233:1: rule__Artifact__Group_2_1__1__Impl : ( '.' ) ;
    public final void rule__Artifact__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1237:1: ( ( '.' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1238:1: ( '.' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1238:1: ( '.' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1239:1: '.'
            {
             before(grammarAccess.getArtifactAccess().getFullStopKeyword_2_1_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Artifact__Group_2_1__1__Impl2605); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1252:1: rule__Artifact__Group_2_1__2 : rule__Artifact__Group_2_1__2__Impl ;
    public final void rule__Artifact__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1256:1: ( rule__Artifact__Group_2_1__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1257:2: rule__Artifact__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__2__Impl_in_rule__Artifact__Group_2_1__22636);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1263:1: rule__Artifact__Group_2_1__2__Impl : ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) ) ;
    public final void rule__Artifact__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1267:1: ( ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1268:1: ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1268:1: ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1269:1: ( rule__Artifact__ExtensionAssignment_2_1_2 )
            {
             before(grammarAccess.getArtifactAccess().getExtensionAssignment_2_1_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1270:1: ( rule__Artifact__ExtensionAssignment_2_1_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1270:2: rule__Artifact__ExtensionAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__ExtensionAssignment_2_1_2_in_rule__Artifact__Group_2_1__2__Impl2663);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1286:1: rule__Artifact__Group_2_2__0 : rule__Artifact__Group_2_2__0__Impl rule__Artifact__Group_2_2__1 ;
    public final void rule__Artifact__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1290:1: ( rule__Artifact__Group_2_2__0__Impl rule__Artifact__Group_2_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1291:2: rule__Artifact__Group_2_2__0__Impl rule__Artifact__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__0__Impl_in_rule__Artifact__Group_2_2__02699);
            rule__Artifact__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__1_in_rule__Artifact__Group_2_2__02702);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1298:1: rule__Artifact__Group_2_2__0__Impl : ( 'format ' ) ;
    public final void rule__Artifact__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1302:1: ( ( 'format ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1303:1: ( 'format ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1303:1: ( 'format ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1304:1: 'format '
            {
             before(grammarAccess.getArtifactAccess().getFormatKeyword_2_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Artifact__Group_2_2__0__Impl2730); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1317:1: rule__Artifact__Group_2_2__1 : rule__Artifact__Group_2_2__1__Impl ;
    public final void rule__Artifact__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1321:1: ( rule__Artifact__Group_2_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1322:2: rule__Artifact__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__1__Impl_in_rule__Artifact__Group_2_2__12761);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1328:1: rule__Artifact__Group_2_2__1__Impl : ( ( rule__Artifact__FormatAssignment_2_2_1 ) ) ;
    public final void rule__Artifact__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1332:1: ( ( ( rule__Artifact__FormatAssignment_2_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1333:1: ( ( rule__Artifact__FormatAssignment_2_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1333:1: ( ( rule__Artifact__FormatAssignment_2_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1334:1: ( rule__Artifact__FormatAssignment_2_2_1 )
            {
             before(grammarAccess.getArtifactAccess().getFormatAssignment_2_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1335:1: ( rule__Artifact__FormatAssignment_2_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1335:2: rule__Artifact__FormatAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__FormatAssignment_2_2_1_in_rule__Artifact__Group_2_2__1__Impl2788);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1349:1: rule__Artifact__Group_2_3__0 : rule__Artifact__Group_2_3__0__Impl rule__Artifact__Group_2_3__1 ;
    public final void rule__Artifact__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1353:1: ( rule__Artifact__Group_2_3__0__Impl rule__Artifact__Group_2_3__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1354:2: rule__Artifact__Group_2_3__0__Impl rule__Artifact__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__0__Impl_in_rule__Artifact__Group_2_3__02822);
            rule__Artifact__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__1_in_rule__Artifact__Group_2_3__02825);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1361:1: rule__Artifact__Group_2_3__0__Impl : ( 'services : ' ) ;
    public final void rule__Artifact__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1365:1: ( ( 'services : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1366:1: ( 'services : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1366:1: ( 'services : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1367:1: 'services : '
            {
             before(grammarAccess.getArtifactAccess().getServicesKeyword_2_3_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Artifact__Group_2_3__0__Impl2853); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1380:1: rule__Artifact__Group_2_3__1 : rule__Artifact__Group_2_3__1__Impl rule__Artifact__Group_2_3__2 ;
    public final void rule__Artifact__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1384:1: ( rule__Artifact__Group_2_3__1__Impl rule__Artifact__Group_2_3__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1385:2: rule__Artifact__Group_2_3__1__Impl rule__Artifact__Group_2_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__1__Impl_in_rule__Artifact__Group_2_3__12884);
            rule__Artifact__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__2_in_rule__Artifact__Group_2_3__12887);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1392:1: rule__Artifact__Group_2_3__1__Impl : ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) ) ;
    public final void rule__Artifact__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1396:1: ( ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1397:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1397:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1398:1: ( rule__Artifact__BasicServicesAssignment_2_3_1 )
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesAssignment_2_3_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1399:1: ( rule__Artifact__BasicServicesAssignment_2_3_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1399:2: rule__Artifact__BasicServicesAssignment_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_1_in_rule__Artifact__Group_2_3__1__Impl2914);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1409:1: rule__Artifact__Group_2_3__2 : rule__Artifact__Group_2_3__2__Impl ;
    public final void rule__Artifact__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1413:1: ( rule__Artifact__Group_2_3__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1414:2: rule__Artifact__Group_2_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__2__Impl_in_rule__Artifact__Group_2_3__22944);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1420:1: rule__Artifact__Group_2_3__2__Impl : ( ( rule__Artifact__Group_2_3_2__0 )* ) ;
    public final void rule__Artifact__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1424:1: ( ( ( rule__Artifact__Group_2_3_2__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1425:1: ( ( rule__Artifact__Group_2_3_2__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1425:1: ( ( rule__Artifact__Group_2_3_2__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1426:1: ( rule__Artifact__Group_2_3_2__0 )*
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_3_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1427:1: ( rule__Artifact__Group_2_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1427:2: rule__Artifact__Group_2_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__0_in_rule__Artifact__Group_2_3__2__Impl2971);
            	    rule__Artifact__Group_2_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1443:1: rule__Artifact__Group_2_3_2__0 : rule__Artifact__Group_2_3_2__0__Impl rule__Artifact__Group_2_3_2__1 ;
    public final void rule__Artifact__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1447:1: ( rule__Artifact__Group_2_3_2__0__Impl rule__Artifact__Group_2_3_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1448:2: rule__Artifact__Group_2_3_2__0__Impl rule__Artifact__Group_2_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__0__Impl_in_rule__Artifact__Group_2_3_2__03008);
            rule__Artifact__Group_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__1_in_rule__Artifact__Group_2_3_2__03011);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1455:1: rule__Artifact__Group_2_3_2__0__Impl : ( ',' ) ;
    public final void rule__Artifact__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1459:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1460:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1460:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1461:1: ','
            {
             before(grammarAccess.getArtifactAccess().getCommaKeyword_2_3_2_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Artifact__Group_2_3_2__0__Impl3039); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1474:1: rule__Artifact__Group_2_3_2__1 : rule__Artifact__Group_2_3_2__1__Impl ;
    public final void rule__Artifact__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1478:1: ( rule__Artifact__Group_2_3_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1479:2: rule__Artifact__Group_2_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__1__Impl_in_rule__Artifact__Group_2_3_2__13070);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1485:1: rule__Artifact__Group_2_3_2__1__Impl : ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) ) ;
    public final void rule__Artifact__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1489:1: ( ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1490:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1490:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1491:1: ( rule__Artifact__BasicServicesAssignment_2_3_2_1 )
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesAssignment_2_3_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1492:1: ( rule__Artifact__BasicServicesAssignment_2_3_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1492:2: rule__Artifact__BasicServicesAssignment_2_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_2_1_in_rule__Artifact__Group_2_3_2__1__Impl3097);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1506:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1510:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1511:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03131);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03134);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1518:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1522:1: ( ( 'Entity' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1523:1: ( 'Entity' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1523:1: ( 'Entity' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1524:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Entity__Group__0__Impl3162); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1537:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1541:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1542:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13193);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13196);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1549:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1553:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1554:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1554:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1555:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1556:1: ( rule__Entity__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1556:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3223);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1566:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1570:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1571:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23253);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23256);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1578:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1582:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1583:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1583:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1584:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Entity__Group__2__Impl3284); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1597:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1601:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1602:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33315);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33318);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1609:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1613:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1614:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1614:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1615:1: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1616:1: ( rule__Entity__AttributesAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||(LA15_0>=42 && LA15_0<=43)||(LA15_0>=51 && LA15_0<=52)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1616:2: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl3345);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1626:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1630:1: ( rule__Entity__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1631:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43376);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1637:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1641:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1642:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1642:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1643:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Entity__Group__4__Impl3404); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1666:1: rule__Primitive__Group__0 : rule__Primitive__Group__0__Impl rule__Primitive__Group__1 ;
    public final void rule__Primitive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1670:1: ( rule__Primitive__Group__0__Impl rule__Primitive__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1671:2: rule__Primitive__Group__0__Impl rule__Primitive__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03445);
            rule__Primitive__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03448);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1678:1: rule__Primitive__Group__0__Impl : ( ( rule__Primitive__ManyAssignment_0 )? ) ;
    public final void rule__Primitive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1682:1: ( ( ( rule__Primitive__ManyAssignment_0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1683:1: ( ( rule__Primitive__ManyAssignment_0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1683:1: ( ( rule__Primitive__ManyAssignment_0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1684:1: ( rule__Primitive__ManyAssignment_0 )?
            {
             before(grammarAccess.getPrimitiveAccess().getManyAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1685:1: ( rule__Primitive__ManyAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1685:2: rule__Primitive__ManyAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Primitive__ManyAssignment_0_in_rule__Primitive__Group__0__Impl3475);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1695:1: rule__Primitive__Group__1 : rule__Primitive__Group__1__Impl rule__Primitive__Group__2 ;
    public final void rule__Primitive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1699:1: ( rule__Primitive__Group__1__Impl rule__Primitive__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1700:2: rule__Primitive__Group__1__Impl rule__Primitive__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13506);
            rule__Primitive__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__13509);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1707:1: rule__Primitive__Group__1__Impl : ( ( rule__Primitive__RequiredAssignment_1 )? ) ;
    public final void rule__Primitive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1711:1: ( ( ( rule__Primitive__RequiredAssignment_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1712:1: ( ( rule__Primitive__RequiredAssignment_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1712:1: ( ( rule__Primitive__RequiredAssignment_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1713:1: ( rule__Primitive__RequiredAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveAccess().getRequiredAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1714:1: ( rule__Primitive__RequiredAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1714:2: rule__Primitive__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Primitive__RequiredAssignment_1_in_rule__Primitive__Group__1__Impl3536);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1724:1: rule__Primitive__Group__2 : rule__Primitive__Group__2__Impl rule__Primitive__Group__3 ;
    public final void rule__Primitive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1728:1: ( rule__Primitive__Group__2__Impl rule__Primitive__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1729:2: rule__Primitive__Group__2__Impl rule__Primitive__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__23567);
            rule__Primitive__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__3_in_rule__Primitive__Group__23570);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1736:1: rule__Primitive__Group__2__Impl : ( ( rule__Primitive__NameAssignment_2 ) ) ;
    public final void rule__Primitive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1740:1: ( ( ( rule__Primitive__NameAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1741:1: ( ( rule__Primitive__NameAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1741:1: ( ( rule__Primitive__NameAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1742:1: ( rule__Primitive__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitiveAccess().getNameAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1743:1: ( rule__Primitive__NameAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1743:2: rule__Primitive__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__NameAssignment_2_in_rule__Primitive__Group__2__Impl3597);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1753:1: rule__Primitive__Group__3 : rule__Primitive__Group__3__Impl rule__Primitive__Group__4 ;
    public final void rule__Primitive__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1757:1: ( rule__Primitive__Group__3__Impl rule__Primitive__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1758:2: rule__Primitive__Group__3__Impl rule__Primitive__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__3__Impl_in_rule__Primitive__Group__33627);
            rule__Primitive__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__4_in_rule__Primitive__Group__33630);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1765:1: rule__Primitive__Group__3__Impl : ( ':' ) ;
    public final void rule__Primitive__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1769:1: ( ( ':' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1770:1: ( ':' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1770:1: ( ':' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1771:1: ':'
            {
             before(grammarAccess.getPrimitiveAccess().getColonKeyword_3()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Primitive__Group__3__Impl3658); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1784:1: rule__Primitive__Group__4 : rule__Primitive__Group__4__Impl ;
    public final void rule__Primitive__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1788:1: ( rule__Primitive__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1789:2: rule__Primitive__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__Group__4__Impl_in_rule__Primitive__Group__43689);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1795:1: rule__Primitive__Group__4__Impl : ( ( rule__Primitive__TypeAssignment_4 ) ) ;
    public final void rule__Primitive__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1799:1: ( ( ( rule__Primitive__TypeAssignment_4 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1800:1: ( ( rule__Primitive__TypeAssignment_4 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1800:1: ( ( rule__Primitive__TypeAssignment_4 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1801:1: ( rule__Primitive__TypeAssignment_4 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1802:1: ( rule__Primitive__TypeAssignment_4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1802:2: rule__Primitive__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Primitive__TypeAssignment_4_in_rule__Primitive__Group__4__Impl3716);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1822:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1826:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1827:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__03756);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__03759);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1834:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1838:1: ( ( 'ref' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1839:1: ( 'ref' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1839:1: ( 'ref' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1840:1: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Reference__Group__0__Impl3787); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1853:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1857:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1858:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__13818);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__13821);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1865:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ManyAssignment_1 )? ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1869:1: ( ( ( rule__Reference__ManyAssignment_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1870:1: ( ( rule__Reference__ManyAssignment_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1870:1: ( ( rule__Reference__ManyAssignment_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1871:1: ( rule__Reference__ManyAssignment_1 )?
            {
             before(grammarAccess.getReferenceAccess().getManyAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1872:1: ( rule__Reference__ManyAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==51) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1872:2: rule__Reference__ManyAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Reference__ManyAssignment_1_in_rule__Reference__Group__1__Impl3848);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1882:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1886:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1887:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__23879);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__23882);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1894:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__NameAssignment_2 ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1898:1: ( ( ( rule__Reference__NameAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1899:1: ( ( rule__Reference__NameAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1899:1: ( ( rule__Reference__NameAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1900:1: ( rule__Reference__NameAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1901:1: ( rule__Reference__NameAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1901:2: rule__Reference__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl3909);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1911:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1915:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1916:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__33939);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__33942);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1923:1: rule__Reference__Group__3__Impl : ( ':' ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1927:1: ( ( ':' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1928:1: ( ':' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1928:1: ( ':' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1929:1: ':'
            {
             before(grammarAccess.getReferenceAccess().getColonKeyword_3()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Reference__Group__3__Impl3970); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1942:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1946:1: ( rule__Reference__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1947:2: rule__Reference__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44001);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1953:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__TypeAssignment_4 ) ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1957:1: ( ( ( rule__Reference__TypeAssignment_4 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1958:1: ( ( rule__Reference__TypeAssignment_4 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1958:1: ( ( rule__Reference__TypeAssignment_4 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1959:1: ( rule__Reference__TypeAssignment_4 )
            {
             before(grammarAccess.getReferenceAccess().getTypeAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1960:1: ( rule__Reference__TypeAssignment_4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1960:2: rule__Reference__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reference__TypeAssignment_4_in_rule__Reference__Group__4__Impl4028);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1980:1: rule__ArtifactID__Group__0 : rule__ArtifactID__Group__0__Impl rule__ArtifactID__Group__1 ;
    public final void rule__ArtifactID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1984:1: ( rule__ArtifactID__Group__0__Impl rule__ArtifactID__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1985:2: rule__ArtifactID__Group__0__Impl rule__ArtifactID__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__0__Impl_in_rule__ArtifactID__Group__04068);
            rule__ArtifactID__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__1_in_rule__ArtifactID__Group__04071);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1992:1: rule__ArtifactID__Group__0__Impl : ( 'id' ) ;
    public final void rule__ArtifactID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1996:1: ( ( 'id' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1997:1: ( 'id' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1997:1: ( 'id' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1998:1: 'id'
            {
             before(grammarAccess.getArtifactIDAccess().getIdKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__ArtifactID__Group__0__Impl4099); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2011:1: rule__ArtifactID__Group__1 : rule__ArtifactID__Group__1__Impl rule__ArtifactID__Group__2 ;
    public final void rule__ArtifactID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2015:1: ( rule__ArtifactID__Group__1__Impl rule__ArtifactID__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2016:2: rule__ArtifactID__Group__1__Impl rule__ArtifactID__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__1__Impl_in_rule__ArtifactID__Group__14130);
            rule__ArtifactID__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__2_in_rule__ArtifactID__Group__14133);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2023:1: rule__ArtifactID__Group__1__Impl : ( ( rule__ArtifactID__ManyAssignment_1 )? ) ;
    public final void rule__ArtifactID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2027:1: ( ( ( rule__ArtifactID__ManyAssignment_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2028:1: ( ( rule__ArtifactID__ManyAssignment_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2028:1: ( ( rule__ArtifactID__ManyAssignment_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2029:1: ( rule__ArtifactID__ManyAssignment_1 )?
            {
             before(grammarAccess.getArtifactIDAccess().getManyAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2030:1: ( rule__ArtifactID__ManyAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==51) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2030:2: rule__ArtifactID__ManyAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__ManyAssignment_1_in_rule__ArtifactID__Group__1__Impl4160);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2040:1: rule__ArtifactID__Group__2 : rule__ArtifactID__Group__2__Impl rule__ArtifactID__Group__3 ;
    public final void rule__ArtifactID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2044:1: ( rule__ArtifactID__Group__2__Impl rule__ArtifactID__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2045:2: rule__ArtifactID__Group__2__Impl rule__ArtifactID__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__2__Impl_in_rule__ArtifactID__Group__24191);
            rule__ArtifactID__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__3_in_rule__ArtifactID__Group__24194);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2052:1: rule__ArtifactID__Group__2__Impl : ( ( rule__ArtifactID__NameAssignment_2 ) ) ;
    public final void rule__ArtifactID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2056:1: ( ( ( rule__ArtifactID__NameAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2057:1: ( ( rule__ArtifactID__NameAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2057:1: ( ( rule__ArtifactID__NameAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2058:1: ( rule__ArtifactID__NameAssignment_2 )
            {
             before(grammarAccess.getArtifactIDAccess().getNameAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2059:1: ( rule__ArtifactID__NameAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2059:2: rule__ArtifactID__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__NameAssignment_2_in_rule__ArtifactID__Group__2__Impl4221);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2069:1: rule__ArtifactID__Group__3 : rule__ArtifactID__Group__3__Impl rule__ArtifactID__Group__4 ;
    public final void rule__ArtifactID__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2073:1: ( rule__ArtifactID__Group__3__Impl rule__ArtifactID__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2074:2: rule__ArtifactID__Group__3__Impl rule__ArtifactID__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__3__Impl_in_rule__ArtifactID__Group__34251);
            rule__ArtifactID__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__4_in_rule__ArtifactID__Group__34254);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2081:1: rule__ArtifactID__Group__3__Impl : ( ':' ) ;
    public final void rule__ArtifactID__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2085:1: ( ( ':' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2086:1: ( ':' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2086:1: ( ':' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2087:1: ':'
            {
             before(grammarAccess.getArtifactIDAccess().getColonKeyword_3()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__ArtifactID__Group__3__Impl4282); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2100:1: rule__ArtifactID__Group__4 : rule__ArtifactID__Group__4__Impl ;
    public final void rule__ArtifactID__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2104:1: ( rule__ArtifactID__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2105:2: rule__ArtifactID__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__Group__4__Impl_in_rule__ArtifactID__Group__44313);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2111:1: rule__ArtifactID__Group__4__Impl : ( ( rule__ArtifactID__TypeAssignment_4 ) ) ;
    public final void rule__ArtifactID__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2115:1: ( ( ( rule__ArtifactID__TypeAssignment_4 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2116:1: ( ( rule__ArtifactID__TypeAssignment_4 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2116:1: ( ( rule__ArtifactID__TypeAssignment_4 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2117:1: ( rule__ArtifactID__TypeAssignment_4 )
            {
             before(grammarAccess.getArtifactIDAccess().getTypeAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2118:1: ( rule__ArtifactID__TypeAssignment_4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2118:2: rule__ArtifactID__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArtifactID__TypeAssignment_4_in_rule__ArtifactID__Group__4__Impl4340);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2138:1: rule__OnService__Group__0 : rule__OnService__Group__0__Impl rule__OnService__Group__1 ;
    public final void rule__OnService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2142:1: ( rule__OnService__Group__0__Impl rule__OnService__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2143:2: rule__OnService__Group__0__Impl rule__OnService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__0__Impl_in_rule__OnService__Group__04380);
            rule__OnService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__1_in_rule__OnService__Group__04383);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2150:1: rule__OnService__Group__0__Impl : ( ( rule__OnService__ArtifactAssignment_0 ) ) ;
    public final void rule__OnService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2154:1: ( ( ( rule__OnService__ArtifactAssignment_0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2155:1: ( ( rule__OnService__ArtifactAssignment_0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2155:1: ( ( rule__OnService__ArtifactAssignment_0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2156:1: ( rule__OnService__ArtifactAssignment_0 )
            {
             before(grammarAccess.getOnServiceAccess().getArtifactAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2157:1: ( rule__OnService__ArtifactAssignment_0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2157:2: rule__OnService__ArtifactAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__ArtifactAssignment_0_in_rule__OnService__Group__0__Impl4410);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2167:1: rule__OnService__Group__1 : rule__OnService__Group__1__Impl rule__OnService__Group__2 ;
    public final void rule__OnService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2171:1: ( rule__OnService__Group__1__Impl rule__OnService__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2172:2: rule__OnService__Group__1__Impl rule__OnService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__1__Impl_in_rule__OnService__Group__14440);
            rule__OnService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__2_in_rule__OnService__Group__14443);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2179:1: rule__OnService__Group__1__Impl : ( '[' ) ;
    public final void rule__OnService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2183:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2184:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2184:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2185:1: '['
            {
             before(grammarAccess.getOnServiceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__OnService__Group__1__Impl4471); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2198:1: rule__OnService__Group__2 : rule__OnService__Group__2__Impl rule__OnService__Group__3 ;
    public final void rule__OnService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2202:1: ( rule__OnService__Group__2__Impl rule__OnService__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2203:2: rule__OnService__Group__2__Impl rule__OnService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__2__Impl_in_rule__OnService__Group__24502);
            rule__OnService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__3_in_rule__OnService__Group__24505);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2210:1: rule__OnService__Group__2__Impl : ( ( rule__OnService__WhenServicesAssignment_2 ) ) ;
    public final void rule__OnService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2214:1: ( ( ( rule__OnService__WhenServicesAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2215:1: ( ( rule__OnService__WhenServicesAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2215:1: ( ( rule__OnService__WhenServicesAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2216:1: ( rule__OnService__WhenServicesAssignment_2 )
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2217:1: ( rule__OnService__WhenServicesAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2217:2: rule__OnService__WhenServicesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__WhenServicesAssignment_2_in_rule__OnService__Group__2__Impl4532);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2227:1: rule__OnService__Group__3 : rule__OnService__Group__3__Impl rule__OnService__Group__4 ;
    public final void rule__OnService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2231:1: ( rule__OnService__Group__3__Impl rule__OnService__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2232:2: rule__OnService__Group__3__Impl rule__OnService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__3__Impl_in_rule__OnService__Group__34562);
            rule__OnService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__4_in_rule__OnService__Group__34565);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2239:1: rule__OnService__Group__3__Impl : ( ( rule__OnService__Group_3__0 )* ) ;
    public final void rule__OnService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2243:1: ( ( ( rule__OnService__Group_3__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2244:1: ( ( rule__OnService__Group_3__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2244:1: ( ( rule__OnService__Group_3__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2245:1: ( rule__OnService__Group_3__0 )*
            {
             before(grammarAccess.getOnServiceAccess().getGroup_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2246:1: ( rule__OnService__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2246:2: rule__OnService__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__0_in_rule__OnService__Group__3__Impl4592);
            	    rule__OnService__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2256:1: rule__OnService__Group__4 : rule__OnService__Group__4__Impl ;
    public final void rule__OnService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2260:1: ( rule__OnService__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2261:2: rule__OnService__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__4__Impl_in_rule__OnService__Group__44623);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2267:1: rule__OnService__Group__4__Impl : ( ']' ) ;
    public final void rule__OnService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2271:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2272:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2272:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2273:1: ']'
            {
             before(grammarAccess.getOnServiceAccess().getRightSquareBracketKeyword_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__OnService__Group__4__Impl4651); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2296:1: rule__OnService__Group_3__0 : rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1 ;
    public final void rule__OnService__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2300:1: ( rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2301:2: rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__0__Impl_in_rule__OnService__Group_3__04692);
            rule__OnService__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__1_in_rule__OnService__Group_3__04695);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2308:1: rule__OnService__Group_3__0__Impl : ( ',' ) ;
    public final void rule__OnService__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2312:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2313:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2313:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2314:1: ','
            {
             before(grammarAccess.getOnServiceAccess().getCommaKeyword_3_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__OnService__Group_3__0__Impl4723); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2327:1: rule__OnService__Group_3__1 : rule__OnService__Group_3__1__Impl ;
    public final void rule__OnService__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2331:1: ( rule__OnService__Group_3__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2332:2: rule__OnService__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__1__Impl_in_rule__OnService__Group_3__14754);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2338:1: rule__OnService__Group_3__1__Impl : ( ( rule__OnService__WhenServicesAssignment_3_1 ) ) ;
    public final void rule__OnService__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2342:1: ( ( ( rule__OnService__WhenServicesAssignment_3_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2343:1: ( ( rule__OnService__WhenServicesAssignment_3_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2343:1: ( ( rule__OnService__WhenServicesAssignment_3_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2344:1: ( rule__OnService__WhenServicesAssignment_3_1 )
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_3_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2345:1: ( rule__OnService__WhenServicesAssignment_3_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2345:2: rule__OnService__WhenServicesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__WhenServicesAssignment_3_1_in_rule__OnService__Group_3__1__Impl4781);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2359:1: rule__SimpleService__Group__0 : rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1 ;
    public final void rule__SimpleService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2363:1: ( rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2364:2: rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__0__Impl_in_rule__SimpleService__Group__04815);
            rule__SimpleService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__1_in_rule__SimpleService__Group__04818);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2371:1: rule__SimpleService__Group__0__Impl : ( () ) ;
    public final void rule__SimpleService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2375:1: ( ( () ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2376:1: ( () )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2376:1: ( () )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2377:1: ()
            {
             before(grammarAccess.getSimpleServiceAccess().getSimpleServiceAction_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2378:1: ()
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2380:1: 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2390:1: rule__SimpleService__Group__1 : rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2 ;
    public final void rule__SimpleService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2394:1: ( rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2395:2: rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__1__Impl_in_rule__SimpleService__Group__14876);
            rule__SimpleService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__2_in_rule__SimpleService__Group__14879);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2402:1: rule__SimpleService__Group__1__Impl : ( 'Service' ) ;
    public final void rule__SimpleService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2406:1: ( ( 'Service' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2407:1: ( 'Service' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2407:1: ( 'Service' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2408:1: 'Service'
            {
             before(grammarAccess.getSimpleServiceAccess().getServiceKeyword_1()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__SimpleService__Group__1__Impl4907); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2421:1: rule__SimpleService__Group__2 : rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3 ;
    public final void rule__SimpleService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2425:1: ( rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2426:2: rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__2__Impl_in_rule__SimpleService__Group__24938);
            rule__SimpleService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__3_in_rule__SimpleService__Group__24941);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2433:1: rule__SimpleService__Group__2__Impl : ( ( rule__SimpleService__NameAssignment_2 ) ) ;
    public final void rule__SimpleService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2437:1: ( ( ( rule__SimpleService__NameAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2438:1: ( ( rule__SimpleService__NameAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2438:1: ( ( rule__SimpleService__NameAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2439:1: ( rule__SimpleService__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleServiceAccess().getNameAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2440:1: ( rule__SimpleService__NameAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2440:2: rule__SimpleService__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__NameAssignment_2_in_rule__SimpleService__Group__2__Impl4968);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2450:1: rule__SimpleService__Group__3 : rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4 ;
    public final void rule__SimpleService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2454:1: ( rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2455:2: rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__3__Impl_in_rule__SimpleService__Group__34998);
            rule__SimpleService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__4_in_rule__SimpleService__Group__35001);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2462:1: rule__SimpleService__Group__3__Impl : ( '{' ) ;
    public final void rule__SimpleService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2466:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2467:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2467:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2468:1: '{'
            {
             before(grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SimpleService__Group__3__Impl5029); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2481:1: rule__SimpleService__Group__4 : rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5 ;
    public final void rule__SimpleService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2485:1: ( rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2486:2: rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__4__Impl_in_rule__SimpleService__Group__45060);
            rule__SimpleService__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__5_in_rule__SimpleService__Group__45063);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2493:1: rule__SimpleService__Group__4__Impl : ( ( rule__SimpleService__Group_4__0 )? ) ;
    public final void rule__SimpleService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2497:1: ( ( ( rule__SimpleService__Group_4__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2498:1: ( ( rule__SimpleService__Group_4__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2498:1: ( ( rule__SimpleService__Group_4__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2499:1: ( rule__SimpleService__Group_4__0 )?
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2500:1: ( rule__SimpleService__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2500:2: rule__SimpleService__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__0_in_rule__SimpleService__Group__4__Impl5090);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2510:1: rule__SimpleService__Group__5 : rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6 ;
    public final void rule__SimpleService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2514:1: ( rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2515:2: rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__5__Impl_in_rule__SimpleService__Group__55121);
            rule__SimpleService__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__6_in_rule__SimpleService__Group__55124);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2522:1: rule__SimpleService__Group__5__Impl : ( ( rule__SimpleService__Group_5__0 )? ) ;
    public final void rule__SimpleService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2526:1: ( ( ( rule__SimpleService__Group_5__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2527:1: ( ( rule__SimpleService__Group_5__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2527:1: ( ( rule__SimpleService__Group_5__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2528:1: ( rule__SimpleService__Group_5__0 )?
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_5()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2529:1: ( rule__SimpleService__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2529:2: rule__SimpleService__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__0_in_rule__SimpleService__Group__5__Impl5151);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2539:1: rule__SimpleService__Group__6 : rule__SimpleService__Group__6__Impl rule__SimpleService__Group__7 ;
    public final void rule__SimpleService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2543:1: ( rule__SimpleService__Group__6__Impl rule__SimpleService__Group__7 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2544:2: rule__SimpleService__Group__6__Impl rule__SimpleService__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__6__Impl_in_rule__SimpleService__Group__65182);
            rule__SimpleService__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__7_in_rule__SimpleService__Group__65185);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2551:1: rule__SimpleService__Group__6__Impl : ( ( rule__SimpleService__Group_6__0 )* ) ;
    public final void rule__SimpleService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2555:1: ( ( ( rule__SimpleService__Group_6__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2556:1: ( ( rule__SimpleService__Group_6__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2556:1: ( ( rule__SimpleService__Group_6__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2557:1: ( rule__SimpleService__Group_6__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_6()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2558:1: ( rule__SimpleService__Group_6__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2558:2: rule__SimpleService__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_6__0_in_rule__SimpleService__Group__6__Impl5212);
            	    rule__SimpleService__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2568:1: rule__SimpleService__Group__7 : rule__SimpleService__Group__7__Impl ;
    public final void rule__SimpleService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2572:1: ( rule__SimpleService__Group__7__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2573:2: rule__SimpleService__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__7__Impl_in_rule__SimpleService__Group__75243);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2579:1: rule__SimpleService__Group__7__Impl : ( '}' ) ;
    public final void rule__SimpleService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2583:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2584:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2584:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2585:1: '}'
            {
             before(grammarAccess.getSimpleServiceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SimpleService__Group__7__Impl5271); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2614:1: rule__SimpleService__Group_4__0 : rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1 ;
    public final void rule__SimpleService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2618:1: ( rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2619:2: rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__0__Impl_in_rule__SimpleService__Group_4__05318);
            rule__SimpleService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__1_in_rule__SimpleService__Group_4__05321);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2626:1: rule__SimpleService__Group_4__0__Impl : ( 'input : ' ) ;
    public final void rule__SimpleService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2630:1: ( ( 'input : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2631:1: ( 'input : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2631:1: ( 'input : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2632:1: 'input : '
            {
             before(grammarAccess.getSimpleServiceAccess().getInputKeyword_4_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__SimpleService__Group_4__0__Impl5349); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2645:1: rule__SimpleService__Group_4__1 : rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2 ;
    public final void rule__SimpleService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2649:1: ( rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2650:2: rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__1__Impl_in_rule__SimpleService__Group_4__15380);
            rule__SimpleService__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__2_in_rule__SimpleService__Group_4__15383);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2657:1: rule__SimpleService__Group_4__1__Impl : ( ( rule__SimpleService__InputAssignment_4_1 ) ) ;
    public final void rule__SimpleService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2661:1: ( ( ( rule__SimpleService__InputAssignment_4_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2662:1: ( ( rule__SimpleService__InputAssignment_4_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2662:1: ( ( rule__SimpleService__InputAssignment_4_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2663:1: ( rule__SimpleService__InputAssignment_4_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAssignment_4_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2664:1: ( rule__SimpleService__InputAssignment_4_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2664:2: rule__SimpleService__InputAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__InputAssignment_4_1_in_rule__SimpleService__Group_4__1__Impl5410);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2674:1: rule__SimpleService__Group_4__2 : rule__SimpleService__Group_4__2__Impl ;
    public final void rule__SimpleService__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2678:1: ( rule__SimpleService__Group_4__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2679:2: rule__SimpleService__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__2__Impl_in_rule__SimpleService__Group_4__25440);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2685:1: rule__SimpleService__Group_4__2__Impl : ( ( rule__SimpleService__Group_4_2__0 )* ) ;
    public final void rule__SimpleService__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2689:1: ( ( ( rule__SimpleService__Group_4_2__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2690:1: ( ( rule__SimpleService__Group_4_2__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2690:1: ( ( rule__SimpleService__Group_4_2__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2691:1: ( rule__SimpleService__Group_4_2__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_4_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2692:1: ( rule__SimpleService__Group_4_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2692:2: rule__SimpleService__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__0_in_rule__SimpleService__Group_4__2__Impl5467);
            	    rule__SimpleService__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2708:1: rule__SimpleService__Group_4_2__0 : rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1 ;
    public final void rule__SimpleService__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2712:1: ( rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2713:2: rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__0__Impl_in_rule__SimpleService__Group_4_2__05504);
            rule__SimpleService__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__1_in_rule__SimpleService__Group_4_2__05507);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2720:1: rule__SimpleService__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleService__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2724:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2725:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2725:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2726:1: ','
            {
             before(grammarAccess.getSimpleServiceAccess().getCommaKeyword_4_2_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__SimpleService__Group_4_2__0__Impl5535); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2739:1: rule__SimpleService__Group_4_2__1 : rule__SimpleService__Group_4_2__1__Impl ;
    public final void rule__SimpleService__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2743:1: ( rule__SimpleService__Group_4_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2744:2: rule__SimpleService__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__1__Impl_in_rule__SimpleService__Group_4_2__15566);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2750:1: rule__SimpleService__Group_4_2__1__Impl : ( ( rule__SimpleService__InputAssignment_4_2_1 ) ) ;
    public final void rule__SimpleService__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2754:1: ( ( ( rule__SimpleService__InputAssignment_4_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2755:1: ( ( rule__SimpleService__InputAssignment_4_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2755:1: ( ( rule__SimpleService__InputAssignment_4_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2756:1: ( rule__SimpleService__InputAssignment_4_2_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAssignment_4_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2757:1: ( rule__SimpleService__InputAssignment_4_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2757:2: rule__SimpleService__InputAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__InputAssignment_4_2_1_in_rule__SimpleService__Group_4_2__1__Impl5593);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2771:1: rule__SimpleService__Group_5__0 : rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1 ;
    public final void rule__SimpleService__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2775:1: ( rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2776:2: rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__0__Impl_in_rule__SimpleService__Group_5__05627);
            rule__SimpleService__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__1_in_rule__SimpleService__Group_5__05630);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2783:1: rule__SimpleService__Group_5__0__Impl : ( 'output : ' ) ;
    public final void rule__SimpleService__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2787:1: ( ( 'output : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2788:1: ( 'output : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2788:1: ( 'output : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2789:1: 'output : '
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputKeyword_5_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__SimpleService__Group_5__0__Impl5658); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2802:1: rule__SimpleService__Group_5__1 : rule__SimpleService__Group_5__1__Impl rule__SimpleService__Group_5__2 ;
    public final void rule__SimpleService__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2806:1: ( rule__SimpleService__Group_5__1__Impl rule__SimpleService__Group_5__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2807:2: rule__SimpleService__Group_5__1__Impl rule__SimpleService__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__1__Impl_in_rule__SimpleService__Group_5__15689);
            rule__SimpleService__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__2_in_rule__SimpleService__Group_5__15692);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2814:1: rule__SimpleService__Group_5__1__Impl : ( ( rule__SimpleService__OutputAssignment_5_1 ) ) ;
    public final void rule__SimpleService__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2818:1: ( ( ( rule__SimpleService__OutputAssignment_5_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2819:1: ( ( rule__SimpleService__OutputAssignment_5_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2819:1: ( ( rule__SimpleService__OutputAssignment_5_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2820:1: ( rule__SimpleService__OutputAssignment_5_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAssignment_5_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2821:1: ( rule__SimpleService__OutputAssignment_5_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2821:2: rule__SimpleService__OutputAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__OutputAssignment_5_1_in_rule__SimpleService__Group_5__1__Impl5719);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2831:1: rule__SimpleService__Group_5__2 : rule__SimpleService__Group_5__2__Impl ;
    public final void rule__SimpleService__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2835:1: ( rule__SimpleService__Group_5__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2836:2: rule__SimpleService__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__2__Impl_in_rule__SimpleService__Group_5__25749);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2842:1: rule__SimpleService__Group_5__2__Impl : ( ( rule__SimpleService__Group_5_2__0 )* ) ;
    public final void rule__SimpleService__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2846:1: ( ( ( rule__SimpleService__Group_5_2__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2847:1: ( ( rule__SimpleService__Group_5_2__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2847:1: ( ( rule__SimpleService__Group_5_2__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2848:1: ( rule__SimpleService__Group_5_2__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_5_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2849:1: ( rule__SimpleService__Group_5_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2849:2: rule__SimpleService__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5_2__0_in_rule__SimpleService__Group_5__2__Impl5776);
            	    rule__SimpleService__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2865:1: rule__SimpleService__Group_5_2__0 : rule__SimpleService__Group_5_2__0__Impl rule__SimpleService__Group_5_2__1 ;
    public final void rule__SimpleService__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2869:1: ( rule__SimpleService__Group_5_2__0__Impl rule__SimpleService__Group_5_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2870:2: rule__SimpleService__Group_5_2__0__Impl rule__SimpleService__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5_2__0__Impl_in_rule__SimpleService__Group_5_2__05813);
            rule__SimpleService__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5_2__1_in_rule__SimpleService__Group_5_2__05816);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2877:1: rule__SimpleService__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleService__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2881:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2882:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2882:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2883:1: ','
            {
             before(grammarAccess.getSimpleServiceAccess().getCommaKeyword_5_2_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__SimpleService__Group_5_2__0__Impl5844); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2896:1: rule__SimpleService__Group_5_2__1 : rule__SimpleService__Group_5_2__1__Impl ;
    public final void rule__SimpleService__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2900:1: ( rule__SimpleService__Group_5_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2901:2: rule__SimpleService__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5_2__1__Impl_in_rule__SimpleService__Group_5_2__15875);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2907:1: rule__SimpleService__Group_5_2__1__Impl : ( ( rule__SimpleService__OutputAssignment_5_2_1 ) ) ;
    public final void rule__SimpleService__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2911:1: ( ( ( rule__SimpleService__OutputAssignment_5_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2912:1: ( ( rule__SimpleService__OutputAssignment_5_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2912:1: ( ( rule__SimpleService__OutputAssignment_5_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2913:1: ( rule__SimpleService__OutputAssignment_5_2_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAssignment_5_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2914:1: ( rule__SimpleService__OutputAssignment_5_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2914:2: rule__SimpleService__OutputAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__OutputAssignment_5_2_1_in_rule__SimpleService__Group_5_2__1__Impl5902);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2928:1: rule__SimpleService__Group_6__0 : rule__SimpleService__Group_6__0__Impl rule__SimpleService__Group_6__1 ;
    public final void rule__SimpleService__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2932:1: ( rule__SimpleService__Group_6__0__Impl rule__SimpleService__Group_6__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2933:2: rule__SimpleService__Group_6__0__Impl rule__SimpleService__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_6__0__Impl_in_rule__SimpleService__Group_6__05936);
            rule__SimpleService__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_6__1_in_rule__SimpleService__Group_6__05939);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2940:1: rule__SimpleService__Group_6__0__Impl : ( 'when : ' ) ;
    public final void rule__SimpleService__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2944:1: ( ( 'when : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2945:1: ( 'when : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2945:1: ( 'when : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2946:1: 'when : '
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenKeyword_6_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__SimpleService__Group_6__0__Impl5967); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2959:1: rule__SimpleService__Group_6__1 : rule__SimpleService__Group_6__1__Impl ;
    public final void rule__SimpleService__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2963:1: ( rule__SimpleService__Group_6__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2964:2: rule__SimpleService__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_6__1__Impl_in_rule__SimpleService__Group_6__15998);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2970:1: rule__SimpleService__Group_6__1__Impl : ( ( rule__SimpleService__WhenAssignment_6_1 ) ) ;
    public final void rule__SimpleService__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2974:1: ( ( ( rule__SimpleService__WhenAssignment_6_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2975:1: ( ( rule__SimpleService__WhenAssignment_6_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2975:1: ( ( rule__SimpleService__WhenAssignment_6_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2976:1: ( rule__SimpleService__WhenAssignment_6_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenAssignment_6_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2977:1: ( rule__SimpleService__WhenAssignment_6_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2977:2: rule__SimpleService__WhenAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__WhenAssignment_6_1_in_rule__SimpleService__Group_6__1__Impl6025);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2991:1: rule__MultiService__Group__0 : rule__MultiService__Group__0__Impl rule__MultiService__Group__1 ;
    public final void rule__MultiService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2995:1: ( rule__MultiService__Group__0__Impl rule__MultiService__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2996:2: rule__MultiService__Group__0__Impl rule__MultiService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__0__Impl_in_rule__MultiService__Group__06059);
            rule__MultiService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__1_in_rule__MultiService__Group__06062);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3003:1: rule__MultiService__Group__0__Impl : ( 'MultiService' ) ;
    public final void rule__MultiService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3007:1: ( ( 'MultiService' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3008:1: ( 'MultiService' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3008:1: ( 'MultiService' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3009:1: 'MultiService'
            {
             before(grammarAccess.getMultiServiceAccess().getMultiServiceKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__MultiService__Group__0__Impl6090); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3022:1: rule__MultiService__Group__1 : rule__MultiService__Group__1__Impl rule__MultiService__Group__2 ;
    public final void rule__MultiService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3026:1: ( rule__MultiService__Group__1__Impl rule__MultiService__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3027:2: rule__MultiService__Group__1__Impl rule__MultiService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__1__Impl_in_rule__MultiService__Group__16121);
            rule__MultiService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__2_in_rule__MultiService__Group__16124);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3034:1: rule__MultiService__Group__1__Impl : ( ( rule__MultiService__NameAssignment_1 ) ) ;
    public final void rule__MultiService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3038:1: ( ( ( rule__MultiService__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3039:1: ( ( rule__MultiService__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3039:1: ( ( rule__MultiService__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3040:1: ( rule__MultiService__NameAssignment_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3041:1: ( rule__MultiService__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3041:2: rule__MultiService__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__NameAssignment_1_in_rule__MultiService__Group__1__Impl6151);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3051:1: rule__MultiService__Group__2 : rule__MultiService__Group__2__Impl rule__MultiService__Group__3 ;
    public final void rule__MultiService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3055:1: ( rule__MultiService__Group__2__Impl rule__MultiService__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3056:2: rule__MultiService__Group__2__Impl rule__MultiService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__2__Impl_in_rule__MultiService__Group__26181);
            rule__MultiService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__3_in_rule__MultiService__Group__26184);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3063:1: rule__MultiService__Group__2__Impl : ( ( rule__MultiService__Group_2__0 )? ) ;
    public final void rule__MultiService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3067:1: ( ( ( rule__MultiService__Group_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3068:1: ( ( rule__MultiService__Group_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3068:1: ( ( rule__MultiService__Group_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3069:1: ( rule__MultiService__Group_2__0 )?
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3070:1: ( rule__MultiService__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3070:2: rule__MultiService__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__0_in_rule__MultiService__Group__2__Impl6211);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3080:1: rule__MultiService__Group__3 : rule__MultiService__Group__3__Impl rule__MultiService__Group__4 ;
    public final void rule__MultiService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3084:1: ( rule__MultiService__Group__3__Impl rule__MultiService__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3085:2: rule__MultiService__Group__3__Impl rule__MultiService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__3__Impl_in_rule__MultiService__Group__36242);
            rule__MultiService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__4_in_rule__MultiService__Group__36245);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3092:1: rule__MultiService__Group__3__Impl : ( '{' ) ;
    public final void rule__MultiService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3096:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3097:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3097:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3098:1: '{'
            {
             before(grammarAccess.getMultiServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MultiService__Group__3__Impl6273); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3111:1: rule__MultiService__Group__4 : rule__MultiService__Group__4__Impl rule__MultiService__Group__5 ;
    public final void rule__MultiService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3115:1: ( rule__MultiService__Group__4__Impl rule__MultiService__Group__5 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3116:2: rule__MultiService__Group__4__Impl rule__MultiService__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__4__Impl_in_rule__MultiService__Group__46304);
            rule__MultiService__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__5_in_rule__MultiService__Group__46307);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3123:1: rule__MultiService__Group__4__Impl : ( ( rule__MultiService__Group_4__0 )* ) ;
    public final void rule__MultiService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3127:1: ( ( ( rule__MultiService__Group_4__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3128:1: ( ( rule__MultiService__Group_4__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3128:1: ( ( rule__MultiService__Group_4__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3129:1: ( rule__MultiService__Group_4__0 )*
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3130:1: ( rule__MultiService__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==47) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3130:2: rule__MultiService__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__0_in_rule__MultiService__Group__4__Impl6334);
            	    rule__MultiService__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3140:1: rule__MultiService__Group__5 : rule__MultiService__Group__5__Impl rule__MultiService__Group__6 ;
    public final void rule__MultiService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3144:1: ( rule__MultiService__Group__5__Impl rule__MultiService__Group__6 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3145:2: rule__MultiService__Group__5__Impl rule__MultiService__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__5__Impl_in_rule__MultiService__Group__56365);
            rule__MultiService__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__6_in_rule__MultiService__Group__56368);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3152:1: rule__MultiService__Group__5__Impl : ( 'services : ' ) ;
    public final void rule__MultiService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3156:1: ( ( 'services : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3157:1: ( 'services : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3157:1: ( 'services : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3158:1: 'services : '
            {
             before(grammarAccess.getMultiServiceAccess().getServicesKeyword_5()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__MultiService__Group__5__Impl6396); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3171:1: rule__MultiService__Group__6 : rule__MultiService__Group__6__Impl rule__MultiService__Group__7 ;
    public final void rule__MultiService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3175:1: ( rule__MultiService__Group__6__Impl rule__MultiService__Group__7 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3176:2: rule__MultiService__Group__6__Impl rule__MultiService__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__6__Impl_in_rule__MultiService__Group__66427);
            rule__MultiService__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__7_in_rule__MultiService__Group__66430);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3183:1: rule__MultiService__Group__6__Impl : ( ( rule__MultiService__ServicesAssignment_6 ) ) ;
    public final void rule__MultiService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3187:1: ( ( ( rule__MultiService__ServicesAssignment_6 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3188:1: ( ( rule__MultiService__ServicesAssignment_6 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3188:1: ( ( rule__MultiService__ServicesAssignment_6 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3189:1: ( rule__MultiService__ServicesAssignment_6 )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesAssignment_6()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3190:1: ( rule__MultiService__ServicesAssignment_6 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3190:2: rule__MultiService__ServicesAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__ServicesAssignment_6_in_rule__MultiService__Group__6__Impl6457);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3200:1: rule__MultiService__Group__7 : rule__MultiService__Group__7__Impl rule__MultiService__Group__8 ;
    public final void rule__MultiService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3204:1: ( rule__MultiService__Group__7__Impl rule__MultiService__Group__8 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3205:2: rule__MultiService__Group__7__Impl rule__MultiService__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__7__Impl_in_rule__MultiService__Group__76487);
            rule__MultiService__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__8_in_rule__MultiService__Group__76490);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3212:1: rule__MultiService__Group__7__Impl : ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) ) ;
    public final void rule__MultiService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3216:1: ( ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3217:1: ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3217:1: ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3218:1: ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3218:1: ( ( rule__MultiService__Group_7__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3219:1: ( rule__MultiService__Group_7__0 )
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_7()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3220:1: ( rule__MultiService__Group_7__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3220:2: rule__MultiService__Group_7__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl6519);
            rule__MultiService__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiServiceAccess().getGroup_7()); 

            }

            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3223:1: ( ( rule__MultiService__Group_7__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3224:1: ( rule__MultiService__Group_7__0 )*
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_7()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3225:1: ( rule__MultiService__Group_7__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3225:2: rule__MultiService__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl6531);
            	    rule__MultiService__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3236:1: rule__MultiService__Group__8 : rule__MultiService__Group__8__Impl ;
    public final void rule__MultiService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3240:1: ( rule__MultiService__Group__8__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3241:2: rule__MultiService__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__8__Impl_in_rule__MultiService__Group__86564);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3247:1: rule__MultiService__Group__8__Impl : ( '}' ) ;
    public final void rule__MultiService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3251:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3252:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3252:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3253:1: '}'
            {
             before(grammarAccess.getMultiServiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MultiService__Group__8__Impl6592); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3284:1: rule__MultiService__Group_2__0 : rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1 ;
    public final void rule__MultiService__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3288:1: ( rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3289:2: rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__0__Impl_in_rule__MultiService__Group_2__06641);
            rule__MultiService__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__1_in_rule__MultiService__Group_2__06644);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3296:1: rule__MultiService__Group_2__0__Impl : ( '[' ) ;
    public final void rule__MultiService__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3300:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3301:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3301:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3302:1: '['
            {
             before(grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__MultiService__Group_2__0__Impl6672); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3315:1: rule__MultiService__Group_2__1 : rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2 ;
    public final void rule__MultiService__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3319:1: ( rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3320:2: rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__1__Impl_in_rule__MultiService__Group_2__16703);
            rule__MultiService__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__2_in_rule__MultiService__Group_2__16706);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3327:1: rule__MultiService__Group_2__1__Impl : ( ( rule__MultiService__ParallelAssignment_2_1 )? ) ;
    public final void rule__MultiService__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3331:1: ( ( ( rule__MultiService__ParallelAssignment_2_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3332:1: ( ( rule__MultiService__ParallelAssignment_2_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3332:1: ( ( rule__MultiService__ParallelAssignment_2_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3333:1: ( rule__MultiService__ParallelAssignment_2_1 )?
            {
             before(grammarAccess.getMultiServiceAccess().getParallelAssignment_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3334:1: ( rule__MultiService__ParallelAssignment_2_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3334:2: rule__MultiService__ParallelAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiService__ParallelAssignment_2_1_in_rule__MultiService__Group_2__1__Impl6733);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3344:1: rule__MultiService__Group_2__2 : rule__MultiService__Group_2__2__Impl ;
    public final void rule__MultiService__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3348:1: ( rule__MultiService__Group_2__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3349:2: rule__MultiService__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__2__Impl_in_rule__MultiService__Group_2__26764);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3355:1: rule__MultiService__Group_2__2__Impl : ( ']' ) ;
    public final void rule__MultiService__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3359:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3360:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3360:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3361:1: ']'
            {
             before(grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MultiService__Group_2__2__Impl6792); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3380:1: rule__MultiService__Group_4__0 : rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1 ;
    public final void rule__MultiService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3384:1: ( rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3385:2: rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__0__Impl_in_rule__MultiService__Group_4__06829);
            rule__MultiService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__1_in_rule__MultiService__Group_4__06832);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3392:1: rule__MultiService__Group_4__0__Impl : ( 'when : ' ) ;
    public final void rule__MultiService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3396:1: ( ( 'when : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3397:1: ( 'when : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3397:1: ( 'when : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3398:1: 'when : '
            {
             before(grammarAccess.getMultiServiceAccess().getWhenKeyword_4_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__MultiService__Group_4__0__Impl6860); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3411:1: rule__MultiService__Group_4__1 : rule__MultiService__Group_4__1__Impl ;
    public final void rule__MultiService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3415:1: ( rule__MultiService__Group_4__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3416:2: rule__MultiService__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__1__Impl_in_rule__MultiService__Group_4__16891);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3422:1: rule__MultiService__Group_4__1__Impl : ( ( rule__MultiService__WhenAssignment_4_1 ) ) ;
    public final void rule__MultiService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3426:1: ( ( ( rule__MultiService__WhenAssignment_4_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3427:1: ( ( rule__MultiService__WhenAssignment_4_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3427:1: ( ( rule__MultiService__WhenAssignment_4_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3428:1: ( rule__MultiService__WhenAssignment_4_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getWhenAssignment_4_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3429:1: ( rule__MultiService__WhenAssignment_4_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3429:2: rule__MultiService__WhenAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__WhenAssignment_4_1_in_rule__MultiService__Group_4__1__Impl6918);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3443:1: rule__MultiService__Group_7__0 : rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1 ;
    public final void rule__MultiService__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3447:1: ( rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3448:2: rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0__Impl_in_rule__MultiService__Group_7__06952);
            rule__MultiService__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__1_in_rule__MultiService__Group_7__06955);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3455:1: rule__MultiService__Group_7__0__Impl : ( ',' ) ;
    public final void rule__MultiService__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3459:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3460:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3460:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3461:1: ','
            {
             before(grammarAccess.getMultiServiceAccess().getCommaKeyword_7_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__MultiService__Group_7__0__Impl6983); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3474:1: rule__MultiService__Group_7__1 : rule__MultiService__Group_7__1__Impl ;
    public final void rule__MultiService__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3478:1: ( rule__MultiService__Group_7__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3479:2: rule__MultiService__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__1__Impl_in_rule__MultiService__Group_7__17014);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3485:1: rule__MultiService__Group_7__1__Impl : ( ( rule__MultiService__ServicesAssignment_7_1 ) ) ;
    public final void rule__MultiService__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3489:1: ( ( ( rule__MultiService__ServicesAssignment_7_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3490:1: ( ( rule__MultiService__ServicesAssignment_7_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3490:1: ( ( rule__MultiService__ServicesAssignment_7_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3491:1: ( rule__MultiService__ServicesAssignment_7_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesAssignment_7_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3492:1: ( rule__MultiService__ServicesAssignment_7_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3492:2: rule__MultiService__ServicesAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__ServicesAssignment_7_1_in_rule__MultiService__Group_7__1__Impl7041);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3506:1: rule__Inout__Group__0 : rule__Inout__Group__0__Impl rule__Inout__Group__1 ;
    public final void rule__Inout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3510:1: ( rule__Inout__Group__0__Impl rule__Inout__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3511:2: rule__Inout__Group__0__Impl rule__Inout__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__0__Impl_in_rule__Inout__Group__07075);
            rule__Inout__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__1_in_rule__Inout__Group__07078);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3518:1: rule__Inout__Group__0__Impl : ( ( rule__Inout__ManyAssignment_0 )? ) ;
    public final void rule__Inout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3522:1: ( ( ( rule__Inout__ManyAssignment_0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3523:1: ( ( rule__Inout__ManyAssignment_0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3523:1: ( ( rule__Inout__ManyAssignment_0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3524:1: ( rule__Inout__ManyAssignment_0 )?
            {
             before(grammarAccess.getInoutAccess().getManyAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3525:1: ( rule__Inout__ManyAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3525:2: rule__Inout__ManyAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inout__ManyAssignment_0_in_rule__Inout__Group__0__Impl7105);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3535:1: rule__Inout__Group__1 : rule__Inout__Group__1__Impl rule__Inout__Group__2 ;
    public final void rule__Inout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3539:1: ( rule__Inout__Group__1__Impl rule__Inout__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3540:2: rule__Inout__Group__1__Impl rule__Inout__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__1__Impl_in_rule__Inout__Group__17136);
            rule__Inout__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__2_in_rule__Inout__Group__17139);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3547:1: rule__Inout__Group__1__Impl : ( ( rule__Inout__TypeAssignment_1 ) ) ;
    public final void rule__Inout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3551:1: ( ( ( rule__Inout__TypeAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3552:1: ( ( rule__Inout__TypeAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3552:1: ( ( rule__Inout__TypeAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3553:1: ( rule__Inout__TypeAssignment_1 )
            {
             before(grammarAccess.getInoutAccess().getTypeAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3554:1: ( rule__Inout__TypeAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3554:2: rule__Inout__TypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__TypeAssignment_1_in_rule__Inout__Group__1__Impl7166);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3564:1: rule__Inout__Group__2 : rule__Inout__Group__2__Impl ;
    public final void rule__Inout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3568:1: ( rule__Inout__Group__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3569:2: rule__Inout__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group__2__Impl_in_rule__Inout__Group__27196);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3575:1: rule__Inout__Group__2__Impl : ( ( rule__Inout__Group_2__0 )? ) ;
    public final void rule__Inout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3579:1: ( ( ( rule__Inout__Group_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3580:1: ( ( rule__Inout__Group_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3580:1: ( ( rule__Inout__Group_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3581:1: ( rule__Inout__Group_2__0 )?
            {
             before(grammarAccess.getInoutAccess().getGroup_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3582:1: ( rule__Inout__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3582:2: rule__Inout__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__0_in_rule__Inout__Group__2__Impl7223);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3598:1: rule__Inout__Group_2__0 : rule__Inout__Group_2__0__Impl rule__Inout__Group_2__1 ;
    public final void rule__Inout__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3602:1: ( rule__Inout__Group_2__0__Impl rule__Inout__Group_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3603:2: rule__Inout__Group_2__0__Impl rule__Inout__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__0__Impl_in_rule__Inout__Group_2__07260);
            rule__Inout__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__1_in_rule__Inout__Group_2__07263);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3610:1: rule__Inout__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Inout__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3614:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3615:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3615:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3616:1: '['
            {
             before(grammarAccess.getInoutAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Inout__Group_2__0__Impl7291); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3629:1: rule__Inout__Group_2__1 : rule__Inout__Group_2__1__Impl rule__Inout__Group_2__2 ;
    public final void rule__Inout__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3633:1: ( rule__Inout__Group_2__1__Impl rule__Inout__Group_2__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3634:2: rule__Inout__Group_2__1__Impl rule__Inout__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__1__Impl_in_rule__Inout__Group_2__17322);
            rule__Inout__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__2_in_rule__Inout__Group_2__17325);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3641:1: rule__Inout__Group_2__1__Impl : ( 'with' ) ;
    public final void rule__Inout__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3645:1: ( ( 'with' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3646:1: ( 'with' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3646:1: ( 'with' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3647:1: 'with'
            {
             before(grammarAccess.getInoutAccess().getWithKeyword_2_1()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Inout__Group_2__1__Impl7353); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3660:1: rule__Inout__Group_2__2 : rule__Inout__Group_2__2__Impl rule__Inout__Group_2__3 ;
    public final void rule__Inout__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3664:1: ( rule__Inout__Group_2__2__Impl rule__Inout__Group_2__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3665:2: rule__Inout__Group_2__2__Impl rule__Inout__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__2__Impl_in_rule__Inout__Group_2__27384);
            rule__Inout__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__3_in_rule__Inout__Group_2__27387);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3672:1: rule__Inout__Group_2__2__Impl : ( ( rule__Inout__CompatibilityAssignment_2_2 ) ) ;
    public final void rule__Inout__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3676:1: ( ( ( rule__Inout__CompatibilityAssignment_2_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3677:1: ( ( rule__Inout__CompatibilityAssignment_2_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3677:1: ( ( rule__Inout__CompatibilityAssignment_2_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3678:1: ( rule__Inout__CompatibilityAssignment_2_2 )
            {
             before(grammarAccess.getInoutAccess().getCompatibilityAssignment_2_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3679:1: ( rule__Inout__CompatibilityAssignment_2_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3679:2: rule__Inout__CompatibilityAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__CompatibilityAssignment_2_2_in_rule__Inout__Group_2__2__Impl7414);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3689:1: rule__Inout__Group_2__3 : rule__Inout__Group_2__3__Impl ;
    public final void rule__Inout__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3693:1: ( rule__Inout__Group_2__3__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3694:2: rule__Inout__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Inout__Group_2__3__Impl_in_rule__Inout__Group_2__37444);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3700:1: rule__Inout__Group_2__3__Impl : ( ']' ) ;
    public final void rule__Inout__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3704:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3705:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3705:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3706:1: ']'
            {
             before(grammarAccess.getInoutAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Inout__Group_2__3__Impl7472); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3727:1: rule__Comp__Group__0 : rule__Comp__Group__0__Impl rule__Comp__Group__1 ;
    public final void rule__Comp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3731:1: ( rule__Comp__Group__0__Impl rule__Comp__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3732:2: rule__Comp__Group__0__Impl rule__Comp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__0__Impl_in_rule__Comp__Group__07511);
            rule__Comp__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__1_in_rule__Comp__Group__07514);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3739:1: rule__Comp__Group__0__Impl : ( ruleEString ) ;
    public final void rule__Comp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3743:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3744:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3744:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3745:1: ruleEString
            {
             before(grammarAccess.getCompAccess().getEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Comp__Group__0__Impl7541);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3756:1: rule__Comp__Group__1 : rule__Comp__Group__1__Impl rule__Comp__Group__2 ;
    public final void rule__Comp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3760:1: ( rule__Comp__Group__1__Impl rule__Comp__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3761:2: rule__Comp__Group__1__Impl rule__Comp__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__1__Impl_in_rule__Comp__Group__17570);
            rule__Comp__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__2_in_rule__Comp__Group__17573);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3768:1: rule__Comp__Group__1__Impl : ( ( rule__Comp__Group_1__0 )* ) ;
    public final void rule__Comp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3772:1: ( ( ( rule__Comp__Group_1__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3773:1: ( ( rule__Comp__Group_1__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3773:1: ( ( rule__Comp__Group_1__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3774:1: ( rule__Comp__Group_1__0 )*
            {
             before(grammarAccess.getCompAccess().getGroup_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3775:1: ( rule__Comp__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3775:2: rule__Comp__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Comp__Group_1__0_in_rule__Comp__Group__1__Impl7600);
            	    rule__Comp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3785:1: rule__Comp__Group__2 : rule__Comp__Group__2__Impl rule__Comp__Group__3 ;
    public final void rule__Comp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3789:1: ( rule__Comp__Group__2__Impl rule__Comp__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3790:2: rule__Comp__Group__2__Impl rule__Comp__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__2__Impl_in_rule__Comp__Group__27631);
            rule__Comp__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__3_in_rule__Comp__Group__27634);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3797:1: rule__Comp__Group__2__Impl : ( '=' ) ;
    public final void rule__Comp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3801:1: ( ( '=' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3802:1: ( '=' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3802:1: ( '=' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3803:1: '='
            {
             before(grammarAccess.getCompAccess().getEqualsSignKeyword_2()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Comp__Group__2__Impl7662); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3816:1: rule__Comp__Group__3 : rule__Comp__Group__3__Impl ;
    public final void rule__Comp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3820:1: ( rule__Comp__Group__3__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3821:2: rule__Comp__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group__3__Impl_in_rule__Comp__Group__37693);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3827:1: rule__Comp__Group__3__Impl : ( ruleEString ) ;
    public final void rule__Comp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3831:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3832:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3832:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3833:1: ruleEString
            {
             before(grammarAccess.getCompAccess().getEStringParserRuleCall_3()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Comp__Group__3__Impl7720);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3852:1: rule__Comp__Group_1__0 : rule__Comp__Group_1__0__Impl rule__Comp__Group_1__1 ;
    public final void rule__Comp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3856:1: ( rule__Comp__Group_1__0__Impl rule__Comp__Group_1__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3857:2: rule__Comp__Group_1__0__Impl rule__Comp__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group_1__0__Impl_in_rule__Comp__Group_1__07757);
            rule__Comp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group_1__1_in_rule__Comp__Group_1__07760);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3864:1: rule__Comp__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Comp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3868:1: ( ( '.' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3869:1: ( '.' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3869:1: ( '.' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3870:1: '.'
            {
             before(grammarAccess.getCompAccess().getFullStopKeyword_1_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Comp__Group_1__0__Impl7788); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3883:1: rule__Comp__Group_1__1 : rule__Comp__Group_1__1__Impl ;
    public final void rule__Comp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3887:1: ( rule__Comp__Group_1__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3888:2: rule__Comp__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Comp__Group_1__1__Impl_in_rule__Comp__Group_1__17819);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3894:1: rule__Comp__Group_1__1__Impl : ( ruleEString ) ;
    public final void rule__Comp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3898:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3899:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3899:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3900:1: ruleEString
            {
             before(grammarAccess.getCompAccess().getEStringParserRuleCall_1_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Comp__Group_1__1__Impl7846);
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


    // $ANTLR start "rule__Root__ArtifactsAssignment_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3916:1: rule__Root__ArtifactsAssignment_0 : ( ruleArtifact ) ;
    public final void rule__Root__ArtifactsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3920:1: ( ( ruleArtifact ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3921:1: ( ruleArtifact )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3921:1: ( ruleArtifact )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3922:1: ruleArtifact
            {
             before(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_07884);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ArtifactsAssignment_0"


    // $ANTLR start "rule__Root__ArtifactsAssignment_1_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3931:1: rule__Root__ArtifactsAssignment_1_0 : ( ruleArtifact ) ;
    public final void rule__Root__ArtifactsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3935:1: ( ( ruleArtifact ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3936:1: ( ruleArtifact )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3936:1: ( ruleArtifact )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3937:1: ruleArtifact
            {
             before(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_1_07915);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ArtifactsAssignment_1_0"


    // $ANTLR start "rule__Root__EntitiesAssignment_1_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3946:1: rule__Root__EntitiesAssignment_1_1 : ( ruleEntity ) ;
    public final void rule__Root__EntitiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3950:1: ( ( ruleEntity ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3951:1: ( ruleEntity )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3951:1: ( ruleEntity )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3952:1: ruleEntity
            {
             before(grammarAccess.getRootAccess().getEntitiesEntityParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Root__EntitiesAssignment_1_17946);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getRootAccess().getEntitiesEntityParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__EntitiesAssignment_1_1"


    // $ANTLR start "rule__Root__ServicesAssignment_1_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3961:1: rule__Root__ServicesAssignment_1_2 : ( ruleService ) ;
    public final void rule__Root__ServicesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3965:1: ( ( ruleService ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3966:1: ( ruleService )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3966:1: ( ruleService )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3967:1: ruleService
            {
             before(grammarAccess.getRootAccess().getServicesServiceParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_rule__Root__ServicesAssignment_1_27977);
            ruleService();

            state._fsp--;

             after(grammarAccess.getRootAccess().getServicesServiceParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__ServicesAssignment_1_2"


    // $ANTLR start "rule__Artifact__NameAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3976:1: rule__Artifact__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Artifact__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3980:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3981:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3981:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3982:1: ruleEString
            {
             before(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Artifact__NameAssignment_18008);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3991:1: rule__Artifact__ExtensionAssignment_2_1_2 : ( ruleEString ) ;
    public final void rule__Artifact__ExtensionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3995:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3996:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3996:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3997:1: ruleEString
            {
             before(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Artifact__ExtensionAssignment_2_1_28039);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4006:1: rule__Artifact__FormatAssignment_2_2_1 : ( ruleFormatEnum ) ;
    public final void rule__Artifact__FormatAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4010:1: ( ( ruleFormatEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4011:1: ( ruleFormatEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4011:1: ( ruleFormatEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4012:1: ruleFormatEnum
            {
             before(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFormatEnum_in_rule__Artifact__FormatAssignment_2_2_18070);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4021:1: rule__Artifact__BasicServicesAssignment_2_3_1 : ( ruleServiceEnum ) ;
    public final void rule__Artifact__BasicServicesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4025:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4026:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4026:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4027:1: ruleServiceEnum
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_18101);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4036:1: rule__Artifact__BasicServicesAssignment_2_3_2_1 : ( ruleServiceEnum ) ;
    public final void rule__Artifact__BasicServicesAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4040:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4041:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4041:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4042:1: ruleServiceEnum
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_2_18132);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4051:1: rule__Artifact__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Artifact__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4055:1: ( ( ruleAttribute ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4056:1: ( ruleAttribute )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4056:1: ( ruleAttribute )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4057:1: ruleAttribute
            {
             before(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Artifact__AttributesAssignment_48163);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4066:1: rule__Entity__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4070:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4071:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4071:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4072:1: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Entity__NameAssignment_18194);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4081:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4085:1: ( ( ruleAttribute ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4086:1: ( ruleAttribute )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4086:1: ( ruleAttribute )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4087:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_38225);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4096:1: rule__Primitive__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Primitive__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4100:1: ( ( ( 'many' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4101:1: ( ( 'many' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4101:1: ( ( 'many' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4102:1: ( 'many' )
            {
             before(grammarAccess.getPrimitiveAccess().getManyManyKeyword_0_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4103:1: ( 'many' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4104:1: 'many'
            {
             before(grammarAccess.getPrimitiveAccess().getManyManyKeyword_0_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Primitive__ManyAssignment_08261); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4119:1: rule__Primitive__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__Primitive__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4123:1: ( ( ( 'required' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4124:1: ( ( 'required' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4124:1: ( ( 'required' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4125:1: ( 'required' )
            {
             before(grammarAccess.getPrimitiveAccess().getRequiredRequiredKeyword_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4126:1: ( 'required' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4127:1: 'required'
            {
             before(grammarAccess.getPrimitiveAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Primitive__RequiredAssignment_18305); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4142:1: rule__Primitive__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Primitive__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4146:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4147:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4147:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4148:1: ruleEString
            {
             before(grammarAccess.getPrimitiveAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Primitive__NameAssignment_28344);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4157:1: rule__Primitive__TypeAssignment_4 : ( ruleDataEnum ) ;
    public final void rule__Primitive__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4161:1: ( ( ruleDataEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4162:1: ( ruleDataEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4162:1: ( ruleDataEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4163:1: ruleDataEnum
            {
             before(grammarAccess.getPrimitiveAccess().getTypeDataEnumEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataEnum_in_rule__Primitive__TypeAssignment_48375);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4172:1: rule__Reference__ManyAssignment_1 : ( ( 'many' ) ) ;
    public final void rule__Reference__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4176:1: ( ( ( 'many' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4177:1: ( ( 'many' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4177:1: ( ( 'many' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4178:1: ( 'many' )
            {
             before(grammarAccess.getReferenceAccess().getManyManyKeyword_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4179:1: ( 'many' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4180:1: 'many'
            {
             before(grammarAccess.getReferenceAccess().getManyManyKeyword_1_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Reference__ManyAssignment_18411); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4195:1: rule__Reference__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4199:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4200:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4200:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4201:1: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Reference__NameAssignment_28450);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4210:1: rule__Reference__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Reference__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4214:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4215:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4215:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4216:1: ( ruleEString )
            {
             before(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_4_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4217:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4218:1: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getTypeEntityEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Reference__TypeAssignment_48485);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4229:1: rule__ArtifactID__ManyAssignment_1 : ( ( 'many' ) ) ;
    public final void rule__ArtifactID__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4233:1: ( ( ( 'many' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4234:1: ( ( 'many' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4234:1: ( ( 'many' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4235:1: ( 'many' )
            {
             before(grammarAccess.getArtifactIDAccess().getManyManyKeyword_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4236:1: ( 'many' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4237:1: 'many'
            {
             before(grammarAccess.getArtifactIDAccess().getManyManyKeyword_1_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__ArtifactID__ManyAssignment_18525); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4252:1: rule__ArtifactID__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ArtifactID__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4256:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4257:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4257:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4258:1: ruleEString
            {
             before(grammarAccess.getArtifactIDAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ArtifactID__NameAssignment_28564);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4267:1: rule__ArtifactID__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ArtifactID__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4271:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4272:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4272:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4273:1: ( ruleEString )
            {
             before(grammarAccess.getArtifactIDAccess().getTypeArtifactCrossReference_4_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4274:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4275:1: ruleEString
            {
             before(grammarAccess.getArtifactIDAccess().getTypeArtifactEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ArtifactID__TypeAssignment_48599);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4286:1: rule__OnService__ArtifactAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__OnService__ArtifactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4290:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4291:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4291:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4292:1: ( ruleEString )
            {
             before(grammarAccess.getOnServiceAccess().getArtifactArtifactCrossReference_0_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4293:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4294:1: ruleEString
            {
             before(grammarAccess.getOnServiceAccess().getArtifactArtifactEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnService__ArtifactAssignment_08638);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4305:1: rule__OnService__WhenServicesAssignment_2 : ( ruleServiceEnum ) ;
    public final void rule__OnService__WhenServicesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4309:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4310:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4310:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4311:1: ruleServiceEnum
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_28673);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4320:1: rule__OnService__WhenServicesAssignment_3_1 : ( ruleServiceEnum ) ;
    public final void rule__OnService__WhenServicesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4324:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4325:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4325:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4326:1: ruleServiceEnum
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_3_18704);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4335:1: rule__SimpleService__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimpleService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4339:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4340:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4340:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4341:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__NameAssignment_28735);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4350:1: rule__SimpleService__InputAssignment_4_1 : ( ruleInout ) ;
    public final void rule__SimpleService__InputAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4354:1: ( ( ruleInout ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4355:1: ( ruleInout )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4355:1: ( ruleInout )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4356:1: ruleInout
            {
             before(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_rule__SimpleService__InputAssignment_4_18766);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4365:1: rule__SimpleService__InputAssignment_4_2_1 : ( ruleInout ) ;
    public final void rule__SimpleService__InputAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4369:1: ( ( ruleInout ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4370:1: ( ruleInout )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4370:1: ( ruleInout )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4371:1: ruleInout
            {
             before(grammarAccess.getSimpleServiceAccess().getInputInoutParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_rule__SimpleService__InputAssignment_4_2_18797);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4380:1: rule__SimpleService__OutputAssignment_5_1 : ( ruleInout ) ;
    public final void rule__SimpleService__OutputAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4384:1: ( ( ruleInout ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4385:1: ( ruleInout )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4385:1: ( ruleInout )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4386:1: ruleInout
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_rule__SimpleService__OutputAssignment_5_18828);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4395:1: rule__SimpleService__OutputAssignment_5_2_1 : ( ruleInout ) ;
    public final void rule__SimpleService__OutputAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4399:1: ( ( ruleInout ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4400:1: ( ruleInout )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4400:1: ( ruleInout )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4401:1: ruleInout
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputInoutParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInout_in_rule__SimpleService__OutputAssignment_5_2_18859);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4410:1: rule__SimpleService__WhenAssignment_6_1 : ( ruleOnService ) ;
    public final void rule__SimpleService__WhenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4414:1: ( ( ruleOnService ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4415:1: ( ruleOnService )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4415:1: ( ruleOnService )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4416:1: ruleOnService
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_rule__SimpleService__WhenAssignment_6_18890);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4425:1: rule__MultiService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MultiService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4429:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4430:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4430:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4431:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__NameAssignment_18921);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4440:1: rule__MultiService__ParallelAssignment_2_1 : ( ( 'parallel' ) ) ;
    public final void rule__MultiService__ParallelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4444:1: ( ( ( 'parallel' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4445:1: ( ( 'parallel' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4445:1: ( ( 'parallel' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4446:1: ( 'parallel' )
            {
             before(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4447:1: ( 'parallel' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4448:1: 'parallel'
            {
             before(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__MultiService__ParallelAssignment_2_18957); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4463:1: rule__MultiService__WhenAssignment_4_1 : ( ruleOnService ) ;
    public final void rule__MultiService__WhenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4467:1: ( ( ruleOnService ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4468:1: ( ruleOnService )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4468:1: ( ruleOnService )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4469:1: ruleOnService
            {
             before(grammarAccess.getMultiServiceAccess().getWhenOnServiceParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_rule__MultiService__WhenAssignment_4_18996);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4478:1: rule__MultiService__ServicesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__MultiService__ServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4482:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4483:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4483:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4484:1: ( ruleEString )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_6_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4485:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4486:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_69031);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4497:1: rule__MultiService__ServicesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__MultiService__ServicesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4501:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4502:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4502:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4503:1: ( ruleEString )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_7_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4504:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4505:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_7_19070);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4516:1: rule__Inout__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Inout__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4520:1: ( ( ( 'many' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4521:1: ( ( 'many' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4521:1: ( ( 'many' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4522:1: ( 'many' )
            {
             before(grammarAccess.getInoutAccess().getManyManyKeyword_0_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4523:1: ( 'many' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4524:1: 'many'
            {
             before(grammarAccess.getInoutAccess().getManyManyKeyword_0_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Inout__ManyAssignment_09110); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4539:1: rule__Inout__TypeAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Inout__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4543:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4544:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4544:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4545:1: ( ruleEString )
            {
             before(grammarAccess.getInoutAccess().getTypeAbstractEntityCrossReference_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4546:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4547:1: ruleEString
            {
             before(grammarAccess.getInoutAccess().getTypeAbstractEntityEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Inout__TypeAssignment_19153);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4558:1: rule__Inout__CompatibilityAssignment_2_2 : ( ruleComp ) ;
    public final void rule__Inout__CompatibilityAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4562:1: ( ( ruleComp ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4563:1: ( ruleComp )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4563:1: ( ruleComp )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:4564:1: ruleComp
            {
             before(grammarAccess.getInoutAccess().getCompatibilityCompParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComp_in_rule__Inout__CompatibilityAssignment_2_29188);
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
        public static final BitSet FOLLOW_rule__Root__ArtifactsAssignment_1_0_in_rule__Root__Alternatives_11022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__EntitiesAssignment_1_1_in_rule__Root__Alternatives_11040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ServicesAssignment_1_2_in_rule__Root__Alternatives_11058 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01699 = new BitSet(new long[]{0x0001110040000000L});
        public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ArtifactsAssignment_0_in_rule__Root__Group__0__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Alternatives_1_in_rule__Root__Group__1__Impl1786 = new BitSet(new long[]{0x0001110040000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__0__Impl_in_rule__Artifact__Group__01821 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__1_in_rule__Artifact__Group__01824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Artifact__Group__0__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__1__Impl_in_rule__Artifact__Group__11883 = new BitSet(new long[]{0x0000000280000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group__2_in_rule__Artifact__Group__11886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__NameAssignment_1_in_rule__Artifact__Group__1__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__2__Impl_in_rule__Artifact__Group__21943 = new BitSet(new long[]{0x0000000280000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group__3_in_rule__Artifact__Group__21946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__0_in_rule__Artifact__Group__2__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__3__Impl_in_rule__Artifact__Group__32004 = new BitSet(new long[]{0x00180C0100000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__4_in_rule__Artifact__Group__32007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Artifact__Group__3__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__4__Impl_in_rule__Artifact__Group__42066 = new BitSet(new long[]{0x00180C0100000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__5_in_rule__Artifact__Group__42069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__AttributesAssignment_4_in_rule__Artifact__Group__4__Impl2096 = new BitSet(new long[]{0x00180C0000000032L});
        public static final BitSet FOLLOW_rule__Artifact__Group__5__Impl_in_rule__Artifact__Group__52127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Artifact__Group__5__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__0__Impl_in_rule__Artifact__Group_2__02198 = new BitSet(new long[]{0x0000006C00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__1_in_rule__Artifact__Group_2__02201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Artifact__Group_2__0__Impl2229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__1__Impl_in_rule__Artifact__Group_2__12260 = new BitSet(new long[]{0x0000006C00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__2_in_rule__Artifact__Group_2__12263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__0_in_rule__Artifact__Group_2__1__Impl2290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__2__Impl_in_rule__Artifact__Group_2__22321 = new BitSet(new long[]{0x0000006C00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__3_in_rule__Artifact__Group_2__22324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__0_in_rule__Artifact__Group_2__2__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__3__Impl_in_rule__Artifact__Group_2__32382 = new BitSet(new long[]{0x0000006C00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__4_in_rule__Artifact__Group_2__32385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__0_in_rule__Artifact__Group_2__3__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__4__Impl_in_rule__Artifact__Group_2__42443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Artifact__Group_2__4__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__0__Impl_in_rule__Artifact__Group_2_1__02512 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__1_in_rule__Artifact__Group_2_1__02515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Artifact__Group_2_1__0__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__1__Impl_in_rule__Artifact__Group_2_1__12574 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__2_in_rule__Artifact__Group_2_1__12577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Artifact__Group_2_1__1__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__2__Impl_in_rule__Artifact__Group_2_1__22636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__ExtensionAssignment_2_1_2_in_rule__Artifact__Group_2_1__2__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__0__Impl_in_rule__Artifact__Group_2_2__02699 = new BitSet(new long[]{0x000000000003F800L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__1_in_rule__Artifact__Group_2_2__02702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Artifact__Group_2_2__0__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__1__Impl_in_rule__Artifact__Group_2_2__12761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__FormatAssignment_2_2_1_in_rule__Artifact__Group_2_2__1__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__0__Impl_in_rule__Artifact__Group_2_3__02822 = new BitSet(new long[]{0x0000000003FC0000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__1_in_rule__Artifact__Group_2_3__02825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Artifact__Group_2_3__0__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__1__Impl_in_rule__Artifact__Group_2_3__12884 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__2_in_rule__Artifact__Group_2_3__12887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_1_in_rule__Artifact__Group_2_3__1__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__2__Impl_in_rule__Artifact__Group_2_3__22944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__0_in_rule__Artifact__Group_2_3__2__Impl2971 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__0__Impl_in_rule__Artifact__Group_2_3_2__03008 = new BitSet(new long[]{0x0000000003FC0000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__1_in_rule__Artifact__Group_2_3_2__03011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Artifact__Group_2_3_2__0__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__1__Impl_in_rule__Artifact__Group_2_3_2__13070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_2_1_in_rule__Artifact__Group_2_3_2__1__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__03131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__03134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Entity__Group__0__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13193 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23253 = new BitSet(new long[]{0x00180C0100000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Entity__Group__2__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33315 = new BitSet(new long[]{0x00180C0100000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl3345 = new BitSet(new long[]{0x00180C0000000032L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Entity__Group__4__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__0__Impl_in_rule__Primitive__Group__03445 = new BitSet(new long[]{0x0018000000000030L});
        public static final BitSet FOLLOW_rule__Primitive__Group__1_in_rule__Primitive__Group__03448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__ManyAssignment_0_in_rule__Primitive__Group__0__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__1__Impl_in_rule__Primitive__Group__13506 = new BitSet(new long[]{0x0018000000000030L});
        public static final BitSet FOLLOW_rule__Primitive__Group__2_in_rule__Primitive__Group__13509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__RequiredAssignment_1_in_rule__Primitive__Group__1__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__2__Impl_in_rule__Primitive__Group__23567 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Primitive__Group__3_in_rule__Primitive__Group__23570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__NameAssignment_2_in_rule__Primitive__Group__2__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__3__Impl_in_rule__Primitive__Group__33627 = new BitSet(new long[]{0x000000003C000000L});
        public static final BitSet FOLLOW_rule__Primitive__Group__4_in_rule__Primitive__Group__33630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Primitive__Group__3__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__Group__4__Impl_in_rule__Primitive__Group__43689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Primitive__TypeAssignment_4_in_rule__Primitive__Group__4__Impl3716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__03756 = new BitSet(new long[]{0x0008000000000030L});
        public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__03759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Reference__Group__0__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__13818 = new BitSet(new long[]{0x0008000000000030L});
        public static final BitSet FOLLOW_rule__Reference__Group__2_in_rule__Reference__Group__13821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__ManyAssignment_1_in_rule__Reference__Group__1__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__2__Impl_in_rule__Reference__Group__23879 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__Reference__Group__3_in_rule__Reference__Group__23882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__NameAssignment_2_in_rule__Reference__Group__2__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__3__Impl_in_rule__Reference__Group__33939 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Reference__Group__4_in_rule__Reference__Group__33942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Reference__Group__3__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__Group__4__Impl_in_rule__Reference__Group__44001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reference__TypeAssignment_4_in_rule__Reference__Group__4__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__0__Impl_in_rule__ArtifactID__Group__04068 = new BitSet(new long[]{0x0008000000000030L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__1_in_rule__ArtifactID__Group__04071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__ArtifactID__Group__0__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__1__Impl_in_rule__ArtifactID__Group__14130 = new BitSet(new long[]{0x0008000000000030L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__2_in_rule__ArtifactID__Group__14133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__ManyAssignment_1_in_rule__ArtifactID__Group__1__Impl4160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__2__Impl_in_rule__ArtifactID__Group__24191 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__3_in_rule__ArtifactID__Group__24194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__NameAssignment_2_in_rule__ArtifactID__Group__2__Impl4221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__3__Impl_in_rule__ArtifactID__Group__34251 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__4_in_rule__ArtifactID__Group__34254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__ArtifactID__Group__3__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__Group__4__Impl_in_rule__ArtifactID__Group__44313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArtifactID__TypeAssignment_4_in_rule__ArtifactID__Group__4__Impl4340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__0__Impl_in_rule__OnService__Group__04380 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__1_in_rule__OnService__Group__04383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__ArtifactAssignment_0_in_rule__OnService__Group__0__Impl4410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__1__Impl_in_rule__OnService__Group__14440 = new BitSet(new long[]{0x0000000003FC0000L});
        public static final BitSet FOLLOW_rule__OnService__Group__2_in_rule__OnService__Group__14443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__OnService__Group__1__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__2__Impl_in_rule__OnService__Group__24502 = new BitSet(new long[]{0x0000008400000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__3_in_rule__OnService__Group__24505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__WhenServicesAssignment_2_in_rule__OnService__Group__2__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__3__Impl_in_rule__OnService__Group__34562 = new BitSet(new long[]{0x0000008400000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__4_in_rule__OnService__Group__34565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__0_in_rule__OnService__Group__3__Impl4592 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__4__Impl_in_rule__OnService__Group__44623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__OnService__Group__4__Impl4651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__0__Impl_in_rule__OnService__Group_3__04692 = new BitSet(new long[]{0x0000000003FC0000L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__1_in_rule__OnService__Group_3__04695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__OnService__Group_3__0__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__1__Impl_in_rule__OnService__Group_3__14754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__WhenServicesAssignment_3_1_in_rule__OnService__Group_3__1__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__0__Impl_in_rule__SimpleService__Group__04815 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__1_in_rule__SimpleService__Group__04818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__1__Impl_in_rule__SimpleService__Group__14876 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__2_in_rule__SimpleService__Group__14879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__SimpleService__Group__1__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__2__Impl_in_rule__SimpleService__Group__24938 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__3_in_rule__SimpleService__Group__24941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__NameAssignment_2_in_rule__SimpleService__Group__2__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__3__Impl_in_rule__SimpleService__Group__34998 = new BitSet(new long[]{0x0000E00100000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__4_in_rule__SimpleService__Group__35001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SimpleService__Group__3__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__4__Impl_in_rule__SimpleService__Group__45060 = new BitSet(new long[]{0x0000E00100000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__5_in_rule__SimpleService__Group__45063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__0_in_rule__SimpleService__Group__4__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__5__Impl_in_rule__SimpleService__Group__55121 = new BitSet(new long[]{0x0000E00100000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__6_in_rule__SimpleService__Group__55124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__0_in_rule__SimpleService__Group__5__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__6__Impl_in_rule__SimpleService__Group__65182 = new BitSet(new long[]{0x0000E00100000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__7_in_rule__SimpleService__Group__65185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_6__0_in_rule__SimpleService__Group__6__Impl5212 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__7__Impl_in_rule__SimpleService__Group__75243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SimpleService__Group__7__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__0__Impl_in_rule__SimpleService__Group_4__05318 = new BitSet(new long[]{0x0008000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__1_in_rule__SimpleService__Group_4__05321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__SimpleService__Group_4__0__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__1__Impl_in_rule__SimpleService__Group_4__15380 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__2_in_rule__SimpleService__Group_4__15383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__InputAssignment_4_1_in_rule__SimpleService__Group_4__1__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__2__Impl_in_rule__SimpleService__Group_4__25440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__0_in_rule__SimpleService__Group_4__2__Impl5467 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__0__Impl_in_rule__SimpleService__Group_4_2__05504 = new BitSet(new long[]{0x0008000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__1_in_rule__SimpleService__Group_4_2__05507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__SimpleService__Group_4_2__0__Impl5535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__1__Impl_in_rule__SimpleService__Group_4_2__15566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__InputAssignment_4_2_1_in_rule__SimpleService__Group_4_2__1__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__0__Impl_in_rule__SimpleService__Group_5__05627 = new BitSet(new long[]{0x0008000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__1_in_rule__SimpleService__Group_5__05630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__SimpleService__Group_5__0__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__1__Impl_in_rule__SimpleService__Group_5__15689 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__2_in_rule__SimpleService__Group_5__15692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__OutputAssignment_5_1_in_rule__SimpleService__Group_5__1__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__2__Impl_in_rule__SimpleService__Group_5__25749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5_2__0_in_rule__SimpleService__Group_5__2__Impl5776 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5_2__0__Impl_in_rule__SimpleService__Group_5_2__05813 = new BitSet(new long[]{0x0008000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5_2__1_in_rule__SimpleService__Group_5_2__05816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__SimpleService__Group_5_2__0__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5_2__1__Impl_in_rule__SimpleService__Group_5_2__15875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__OutputAssignment_5_2_1_in_rule__SimpleService__Group_5_2__1__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_6__0__Impl_in_rule__SimpleService__Group_6__05936 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_6__1_in_rule__SimpleService__Group_6__05939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__SimpleService__Group_6__0__Impl5967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_6__1__Impl_in_rule__SimpleService__Group_6__15998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__WhenAssignment_6_1_in_rule__SimpleService__Group_6__1__Impl6025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__0__Impl_in_rule__MultiService__Group__06059 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group__1_in_rule__MultiService__Group__06062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__MultiService__Group__0__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__1__Impl_in_rule__MultiService__Group__16121 = new BitSet(new long[]{0x0000000280000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__2_in_rule__MultiService__Group__16124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__NameAssignment_1_in_rule__MultiService__Group__1__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__2__Impl_in_rule__MultiService__Group__26181 = new BitSet(new long[]{0x0000000280000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__3_in_rule__MultiService__Group__26184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__0_in_rule__MultiService__Group__2__Impl6211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__3__Impl_in_rule__MultiService__Group__36242 = new BitSet(new long[]{0x0000804000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__4_in_rule__MultiService__Group__36245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MultiService__Group__3__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__4__Impl_in_rule__MultiService__Group__46304 = new BitSet(new long[]{0x0000804000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__5_in_rule__MultiService__Group__46307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__0_in_rule__MultiService__Group__4__Impl6334 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__5__Impl_in_rule__MultiService__Group__56365 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group__6_in_rule__MultiService__Group__56368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__MultiService__Group__5__Impl6396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__6__Impl_in_rule__MultiService__Group__66427 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__7_in_rule__MultiService__Group__66430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ServicesAssignment_6_in_rule__MultiService__Group__6__Impl6457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__7__Impl_in_rule__MultiService__Group__76487 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__8_in_rule__MultiService__Group__76490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl6519 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl6531 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__8__Impl_in_rule__MultiService__Group__86564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MultiService__Group__8__Impl6592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__0__Impl_in_rule__MultiService__Group_2__06641 = new BitSet(new long[]{0x0020000400000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__1_in_rule__MultiService__Group_2__06644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__MultiService__Group_2__0__Impl6672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__1__Impl_in_rule__MultiService__Group_2__16703 = new BitSet(new long[]{0x0020000400000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__2_in_rule__MultiService__Group_2__16706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ParallelAssignment_2_1_in_rule__MultiService__Group_2__1__Impl6733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__2__Impl_in_rule__MultiService__Group_2__26764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MultiService__Group_2__2__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__0__Impl_in_rule__MultiService__Group_4__06829 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__1_in_rule__MultiService__Group_4__06832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__MultiService__Group_4__0__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__1__Impl_in_rule__MultiService__Group_4__16891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__WhenAssignment_4_1_in_rule__MultiService__Group_4__1__Impl6918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0__Impl_in_rule__MultiService__Group_7__06952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__1_in_rule__MultiService__Group_7__06955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__MultiService__Group_7__0__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__1__Impl_in_rule__MultiService__Group_7__17014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ServicesAssignment_7_1_in_rule__MultiService__Group_7__1__Impl7041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group__0__Impl_in_rule__Inout__Group__07075 = new BitSet(new long[]{0x0008000000000030L});
        public static final BitSet FOLLOW_rule__Inout__Group__1_in_rule__Inout__Group__07078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__ManyAssignment_0_in_rule__Inout__Group__0__Impl7105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group__1__Impl_in_rule__Inout__Group__17136 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Inout__Group__2_in_rule__Inout__Group__17139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__TypeAssignment_1_in_rule__Inout__Group__1__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group__2__Impl_in_rule__Inout__Group__27196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__0_in_rule__Inout__Group__2__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__0__Impl_in_rule__Inout__Group_2__07260 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__1_in_rule__Inout__Group_2__07263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Inout__Group_2__0__Impl7291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__1__Impl_in_rule__Inout__Group_2__17322 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__2_in_rule__Inout__Group_2__17325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Inout__Group_2__1__Impl7353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__2__Impl_in_rule__Inout__Group_2__27384 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__3_in_rule__Inout__Group_2__27387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__CompatibilityAssignment_2_2_in_rule__Inout__Group_2__2__Impl7414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Inout__Group_2__3__Impl_in_rule__Inout__Group_2__37444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Inout__Group_2__3__Impl7472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group__0__Impl_in_rule__Comp__Group__07511 = new BitSet(new long[]{0x0004001000000000L});
        public static final BitSet FOLLOW_rule__Comp__Group__1_in_rule__Comp__Group__07514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Comp__Group__0__Impl7541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group__1__Impl_in_rule__Comp__Group__17570 = new BitSet(new long[]{0x0004001000000000L});
        public static final BitSet FOLLOW_rule__Comp__Group__2_in_rule__Comp__Group__17573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group_1__0_in_rule__Comp__Group__1__Impl7600 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group__2__Impl_in_rule__Comp__Group__27631 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Comp__Group__3_in_rule__Comp__Group__27634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Comp__Group__2__Impl7662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group__3__Impl_in_rule__Comp__Group__37693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Comp__Group__3__Impl7720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group_1__0__Impl_in_rule__Comp__Group_1__07757 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Comp__Group_1__1_in_rule__Comp__Group_1__07760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Comp__Group_1__0__Impl7788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Comp__Group_1__1__Impl_in_rule__Comp__Group_1__17819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Comp__Group_1__1__Impl7846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_07884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_1_07915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Root__EntitiesAssignment_1_17946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_rule__Root__ServicesAssignment_1_27977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Artifact__NameAssignment_18008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Artifact__ExtensionAssignment_2_1_28039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormatEnum_in_rule__Artifact__FormatAssignment_2_2_18070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_18101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_2_18132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Artifact__AttributesAssignment_48163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Entity__NameAssignment_18194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_38225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Primitive__ManyAssignment_08261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Primitive__RequiredAssignment_18305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Primitive__NameAssignment_28344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataEnum_in_rule__Primitive__TypeAssignment_48375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Reference__ManyAssignment_18411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Reference__NameAssignment_28450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Reference__TypeAssignment_48485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__ArtifactID__ManyAssignment_18525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ArtifactID__NameAssignment_28564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ArtifactID__TypeAssignment_48599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnService__ArtifactAssignment_08638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_28673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_3_18704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__NameAssignment_28735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_rule__SimpleService__InputAssignment_4_18766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_rule__SimpleService__InputAssignment_4_2_18797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_rule__SimpleService__OutputAssignment_5_18828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInout_in_rule__SimpleService__OutputAssignment_5_2_18859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_rule__SimpleService__WhenAssignment_6_18890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__NameAssignment_18921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__MultiService__ParallelAssignment_2_18957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_rule__MultiService__WhenAssignment_4_18996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_69031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_7_19070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Inout__ManyAssignment_09110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Inout__TypeAssignment_19153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComp_in_rule__Inout__CompatibilityAssignment_2_29188 = new BitSet(new long[]{0x0000000000000002L});
    }


}