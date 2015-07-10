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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XMI'", "'BINARY'", "'TEXT'", "'XML'", "'JSON'", "'ATL'", "'ZIP'", "'upload'", "'download'", "'update'", "'read'", "'readAll'", "'search'", "'Boolean'", "'Double'", "'Integer'", "'String'", "'Artifact'", "'{'", "'}'", "'['", "']'", "'extension '", "'.'", "'format '", "'services : '", "','", "'Entity'", "':'", "'Service'", "'input : '", "'output : '", "'when : '", "'MultiService'", "'many'", "'required'", "'parallel'"
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


    // $ANTLR start "entryRuleEString"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:89:1: ( ruleEString EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:104:1: ( rule__EString__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
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


    // $ANTLR start "entryRuleService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:118:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:119:1: ( ruleService EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:120:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_entryRuleService183);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleService190); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:127:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:131:2: ( ( ( rule__Service__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:132:1: ( ( rule__Service__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:132:1: ( ( rule__Service__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:133:1: ( rule__Service__Alternatives )
            {
             before(grammarAccess.getServiceAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:134:1: ( rule__Service__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:134:2: rule__Service__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Service__Alternatives_in_ruleService216);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:146:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:147:1: ( ruleAttribute EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:148:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute243);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute250); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:155:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:159:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:160:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:160:1: ( ( rule__Attribute__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:161:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:162:1: ( rule__Attribute__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:162:2: rule__Attribute__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute276);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:176:1: entryRuleArtifact : ruleArtifact EOF ;
    public final void entryRuleArtifact() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:177:1: ( ruleArtifact EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:178:1: ruleArtifact EOF
            {
             before(grammarAccess.getArtifactRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_entryRuleArtifact305);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getArtifactRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArtifact312); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:185:1: ruleArtifact : ( ( rule__Artifact__Group__0 ) ) ;
    public final void ruleArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:189:2: ( ( ( rule__Artifact__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:190:1: ( ( rule__Artifact__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:190:1: ( ( rule__Artifact__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:191:1: ( rule__Artifact__Group__0 )
            {
             before(grammarAccess.getArtifactAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:192:1: ( rule__Artifact__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:192:2: rule__Artifact__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__0_in_ruleArtifact338);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:204:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:205:1: ( ruleEntity EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:206:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity365);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity372); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:213:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:217:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:218:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:218:1: ( ( rule__Entity__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:219:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:220:1: ( rule__Entity__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:220:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0_in_ruleEntity398);
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


    // $ANTLR start "entryRuleSimpleAttribute"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:232:1: entryRuleSimpleAttribute : ruleSimpleAttribute EOF ;
    public final void entryRuleSimpleAttribute() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:233:1: ( ruleSimpleAttribute EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:234:1: ruleSimpleAttribute EOF
            {
             before(grammarAccess.getSimpleAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute425);
            ruleSimpleAttribute();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleAttribute432); 

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
    // $ANTLR end "entryRuleSimpleAttribute"


    // $ANTLR start "ruleSimpleAttribute"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:241:1: ruleSimpleAttribute : ( ( rule__SimpleAttribute__Group__0 ) ) ;
    public final void ruleSimpleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:245:2: ( ( ( rule__SimpleAttribute__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:246:1: ( ( rule__SimpleAttribute__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:246:1: ( ( rule__SimpleAttribute__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:247:1: ( rule__SimpleAttribute__Group__0 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:248:1: ( rule__SimpleAttribute__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:248:2: rule__SimpleAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__0_in_ruleSimpleAttribute458);
            rule__SimpleAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleAttribute"


    // $ANTLR start "entryRuleMultiAttribute"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:260:1: entryRuleMultiAttribute : ruleMultiAttribute EOF ;
    public final void entryRuleMultiAttribute() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:261:1: ( ruleMultiAttribute EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:262:1: ruleMultiAttribute EOF
            {
             before(grammarAccess.getMultiAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiAttribute_in_entryRuleMultiAttribute485);
            ruleMultiAttribute();

            state._fsp--;

             after(grammarAccess.getMultiAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiAttribute492); 

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
    // $ANTLR end "entryRuleMultiAttribute"


    // $ANTLR start "ruleMultiAttribute"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:269:1: ruleMultiAttribute : ( ( rule__MultiAttribute__Group__0 ) ) ;
    public final void ruleMultiAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:273:2: ( ( ( rule__MultiAttribute__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:274:1: ( ( rule__MultiAttribute__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:274:1: ( ( rule__MultiAttribute__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:275:1: ( rule__MultiAttribute__Group__0 )
            {
             before(grammarAccess.getMultiAttributeAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:276:1: ( rule__MultiAttribute__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:276:2: rule__MultiAttribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__0_in_ruleMultiAttribute518);
            rule__MultiAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiAttribute"


    // $ANTLR start "entryRuleOnService"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:288:1: entryRuleOnService : ruleOnService EOF ;
    public final void entryRuleOnService() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:289:1: ( ruleOnService EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:290:1: ruleOnService EOF
            {
             before(grammarAccess.getOnServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_entryRuleOnService545);
            ruleOnService();

            state._fsp--;

             after(grammarAccess.getOnServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOnService552); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:297:1: ruleOnService : ( ( rule__OnService__Group__0 ) ) ;
    public final void ruleOnService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:301:2: ( ( ( rule__OnService__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:302:1: ( ( rule__OnService__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:302:1: ( ( rule__OnService__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:303:1: ( rule__OnService__Group__0 )
            {
             before(grammarAccess.getOnServiceAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:304:1: ( rule__OnService__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:304:2: rule__OnService__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__0_in_ruleOnService578);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:316:1: entryRuleSimpleService : ruleSimpleService EOF ;
    public final void entryRuleSimpleService() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:317:1: ( ruleSimpleService EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:318:1: ruleSimpleService EOF
            {
             before(grammarAccess.getSimpleServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_entryRuleSimpleService605);
            ruleSimpleService();

            state._fsp--;

             after(grammarAccess.getSimpleServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleService612); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:325:1: ruleSimpleService : ( ( rule__SimpleService__Group__0 ) ) ;
    public final void ruleSimpleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:329:2: ( ( ( rule__SimpleService__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:330:1: ( ( rule__SimpleService__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:330:1: ( ( rule__SimpleService__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:331:1: ( rule__SimpleService__Group__0 )
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:332:1: ( rule__SimpleService__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:332:2: rule__SimpleService__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__0_in_ruleSimpleService638);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:344:1: entryRuleMultiService : ruleMultiService EOF ;
    public final void entryRuleMultiService() throws RecognitionException {
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:345:1: ( ruleMultiService EOF )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:346:1: ruleMultiService EOF
            {
             before(grammarAccess.getMultiServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_entryRuleMultiService665);
            ruleMultiService();

            state._fsp--;

             after(grammarAccess.getMultiServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiService672); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:353:1: ruleMultiService : ( ( rule__MultiService__Group__0 ) ) ;
    public final void ruleMultiService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:357:2: ( ( ( rule__MultiService__Group__0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:358:1: ( ( rule__MultiService__Group__0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:358:1: ( ( rule__MultiService__Group__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:359:1: ( rule__MultiService__Group__0 )
            {
             before(grammarAccess.getMultiServiceAccess().getGroup()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:360:1: ( rule__MultiService__Group__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:360:2: rule__MultiService__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__0_in_ruleMultiService698);
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


    // $ANTLR start "ruleFormatEnum"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:373:1: ruleFormatEnum : ( ( rule__FormatEnum__Alternatives ) ) ;
    public final void ruleFormatEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:377:1: ( ( ( rule__FormatEnum__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:378:1: ( ( rule__FormatEnum__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:378:1: ( ( rule__FormatEnum__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:379:1: ( rule__FormatEnum__Alternatives )
            {
             before(grammarAccess.getFormatEnumAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:380:1: ( rule__FormatEnum__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:380:2: rule__FormatEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FormatEnum__Alternatives_in_ruleFormatEnum735);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:392:1: ruleServiceEnum : ( ( rule__ServiceEnum__Alternatives ) ) ;
    public final void ruleServiceEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:396:1: ( ( ( rule__ServiceEnum__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:397:1: ( ( rule__ServiceEnum__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:397:1: ( ( rule__ServiceEnum__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:398:1: ( rule__ServiceEnum__Alternatives )
            {
             before(grammarAccess.getServiceEnumAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:399:1: ( rule__ServiceEnum__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:399:2: rule__ServiceEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceEnum__Alternatives_in_ruleServiceEnum771);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:411:1: ruleDataEnum : ( ( rule__DataEnum__Alternatives ) ) ;
    public final void ruleDataEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:415:1: ( ( ( rule__DataEnum__Alternatives ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:416:1: ( ( rule__DataEnum__Alternatives ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:416:1: ( ( rule__DataEnum__Alternatives ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:417:1: ( rule__DataEnum__Alternatives )
            {
             before(grammarAccess.getDataEnumAccess().getAlternatives()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:418:1: ( rule__DataEnum__Alternatives )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:418:2: rule__DataEnum__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataEnum__Alternatives_in_ruleDataEnum807);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:429:1: rule__Root__Alternatives_1 : ( ( ( rule__Root__ArtifactsAssignment_1_0 ) ) | ( ( rule__Root__EntitiesAssignment_1_1 ) ) | ( ( rule__Root__ServicesAssignment_1_2 ) ) );
    public final void rule__Root__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:433:1: ( ( ( rule__Root__ArtifactsAssignment_1_0 ) ) | ( ( rule__Root__EntitiesAssignment_1_1 ) ) | ( ( rule__Root__ServicesAssignment_1_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 38:
                {
                alt1=2;
                }
                break;
            case 40:
            case 44:
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
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:434:1: ( ( rule__Root__ArtifactsAssignment_1_0 ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:434:1: ( ( rule__Root__ArtifactsAssignment_1_0 ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:435:1: ( rule__Root__ArtifactsAssignment_1_0 )
                    {
                     before(grammarAccess.getRootAccess().getArtifactsAssignment_1_0()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:436:1: ( rule__Root__ArtifactsAssignment_1_0 )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:436:2: rule__Root__ArtifactsAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__ArtifactsAssignment_1_0_in_rule__Root__Alternatives_1842);
                    rule__Root__ArtifactsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getArtifactsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:440:6: ( ( rule__Root__EntitiesAssignment_1_1 ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:440:6: ( ( rule__Root__EntitiesAssignment_1_1 ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:441:1: ( rule__Root__EntitiesAssignment_1_1 )
                    {
                     before(grammarAccess.getRootAccess().getEntitiesAssignment_1_1()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:442:1: ( rule__Root__EntitiesAssignment_1_1 )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:442:2: rule__Root__EntitiesAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__EntitiesAssignment_1_1_in_rule__Root__Alternatives_1860);
                    rule__Root__EntitiesAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRootAccess().getEntitiesAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:446:6: ( ( rule__Root__ServicesAssignment_1_2 ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:446:6: ( ( rule__Root__ServicesAssignment_1_2 ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:447:1: ( rule__Root__ServicesAssignment_1_2 )
                    {
                     before(grammarAccess.getRootAccess().getServicesAssignment_1_2()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:448:1: ( rule__Root__ServicesAssignment_1_2 )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:448:2: rule__Root__ServicesAssignment_1_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Root__ServicesAssignment_1_2_in_rule__Root__Alternatives_1878);
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:457:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:461:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:462:1: ( RULE_STRING )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:462:1: ( RULE_STRING )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:463:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives911); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:468:6: ( RULE_ID )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:468:6: ( RULE_ID )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:469:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives928); 
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


    // $ANTLR start "rule__Service__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:480:1: rule__Service__Alternatives : ( ( ruleSimpleService ) | ( ruleMultiService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:484:1: ( ( ruleSimpleService ) | ( ruleMultiService ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40) ) {
                alt3=1;
            }
            else if ( (LA3_0==44) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:485:1: ( ruleSimpleService )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:485:1: ( ruleSimpleService )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:486:1: ruleSimpleService
                    {
                     before(grammarAccess.getServiceAccess().getSimpleServiceParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleService_in_rule__Service__Alternatives961);
                    ruleSimpleService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getSimpleServiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:491:6: ( ruleMultiService )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:491:6: ( ruleMultiService )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:492:1: ruleMultiService
                    {
                     before(grammarAccess.getServiceAccess().getMultiServiceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultiService_in_rule__Service__Alternatives978);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:502:1: rule__Attribute__Alternatives : ( ( ruleSimpleAttribute ) | ( ruleMultiAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:506:1: ( ( ruleSimpleAttribute ) | ( ruleMultiAttribute ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==39) ) {
                    int LA4_4 = input.LA(3);

                    if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_4>=24 && LA4_4<=27)) ) {
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

                if ( (LA4_3==39) ) {
                    int LA4_4 = input.LA(3);

                    if ( ((LA4_4>=RULE_STRING && LA4_4<=RULE_ID)) ) {
                        alt4=2;
                    }
                    else if ( ((LA4_4>=24 && LA4_4<=27)) ) {
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
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:507:1: ( ruleSimpleAttribute )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:507:1: ( ruleSimpleAttribute )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:508:1: ruleSimpleAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives1010);
                    ruleSimpleAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getSimpleAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:513:6: ( ruleMultiAttribute )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:513:6: ( ruleMultiAttribute )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:514:1: ruleMultiAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getMultiAttributeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultiAttribute_in_rule__Attribute__Alternatives1027);
                    ruleMultiAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getMultiAttributeParserRuleCall_1()); 

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


    // $ANTLR start "rule__FormatEnum__Alternatives"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:525:1: rule__FormatEnum__Alternatives : ( ( ( 'XMI' ) ) | ( ( 'BINARY' ) ) | ( ( 'TEXT' ) ) | ( ( 'XML' ) ) | ( ( 'JSON' ) ) | ( ( 'ATL' ) ) | ( ( 'ZIP' ) ) );
    public final void rule__FormatEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:529:1: ( ( ( 'XMI' ) ) | ( ( 'BINARY' ) ) | ( ( 'TEXT' ) ) | ( ( 'XML' ) ) | ( ( 'JSON' ) ) | ( ( 'ATL' ) ) | ( ( 'ZIP' ) ) )
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
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:530:1: ( ( 'XMI' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:530:1: ( ( 'XMI' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:531:1: ( 'XMI' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:532:1: ( 'XMI' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:532:3: 'XMI'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__FormatEnum__Alternatives1061); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:537:6: ( ( 'BINARY' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:537:6: ( ( 'BINARY' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:538:1: ( 'BINARY' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:539:1: ( 'BINARY' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:539:3: 'BINARY'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FormatEnum__Alternatives1082); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:544:6: ( ( 'TEXT' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:544:6: ( ( 'TEXT' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:545:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:546:1: ( 'TEXT' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:546:3: 'TEXT'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FormatEnum__Alternatives1103); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:551:6: ( ( 'XML' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:551:6: ( ( 'XML' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:552:1: ( 'XML' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:553:1: ( 'XML' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:553:3: 'XML'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__FormatEnum__Alternatives1124); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:558:6: ( ( 'JSON' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:558:6: ( ( 'JSON' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:559:1: ( 'JSON' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:560:1: ( 'JSON' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:560:3: 'JSON'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__FormatEnum__Alternatives1145); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:565:6: ( ( 'ATL' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:565:6: ( ( 'ATL' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:566:1: ( 'ATL' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:567:1: ( 'ATL' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:567:3: 'ATL'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__FormatEnum__Alternatives1166); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:572:6: ( ( 'ZIP' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:572:6: ( ( 'ZIP' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:573:1: ( 'ZIP' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getZIPEnumLiteralDeclaration_6()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:574:1: ( 'ZIP' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:574:3: 'ZIP'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__FormatEnum__Alternatives1187); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:584:1: rule__ServiceEnum__Alternatives : ( ( ( 'upload' ) ) | ( ( 'download' ) ) | ( ( 'update' ) ) | ( ( 'read' ) ) | ( ( 'readAll' ) ) | ( ( 'search' ) ) );
    public final void rule__ServiceEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:588:1: ( ( ( 'upload' ) ) | ( ( 'download' ) ) | ( ( 'update' ) ) | ( ( 'read' ) ) | ( ( 'readAll' ) ) | ( ( 'search' ) ) )
            int alt6=6;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:589:1: ( ( 'upload' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:589:1: ( ( 'upload' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:590:1: ( 'upload' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:591:1: ( 'upload' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:591:3: 'upload'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ServiceEnum__Alternatives1223); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:596:6: ( ( 'download' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:596:6: ( ( 'download' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:597:1: ( 'download' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:598:1: ( 'download' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:598:3: 'download'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ServiceEnum__Alternatives1244); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:603:6: ( ( 'update' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:603:6: ( ( 'update' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:604:1: ( 'update' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:605:1: ( 'update' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:605:3: 'update'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ServiceEnum__Alternatives1265); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:610:6: ( ( 'read' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:610:6: ( ( 'read' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:611:1: ( 'read' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:612:1: ( 'read' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:612:3: 'read'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ServiceEnum__Alternatives1286); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:617:6: ( ( 'readAll' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:617:6: ( ( 'readAll' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:618:1: ( 'readAll' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:619:1: ( 'readAll' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:619:3: 'readAll'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__ServiceEnum__Alternatives1307); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:624:6: ( ( 'search' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:624:6: ( ( 'search' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:625:1: ( 'search' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:626:1: ( 'search' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:626:3: 'search'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__ServiceEnum__Alternatives1328); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5()); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:636:1: rule__DataEnum__Alternatives : ( ( ( 'Boolean' ) ) | ( ( 'Double' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) );
    public final void rule__DataEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:640:1: ( ( ( 'Boolean' ) ) | ( ( 'Double' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
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
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:641:1: ( ( 'Boolean' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:641:1: ( ( 'Boolean' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:642:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:643:1: ( 'Boolean' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:643:3: 'Boolean'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__DataEnum__Alternatives1364); 

                    }

                     after(grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:648:6: ( ( 'Double' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:648:6: ( ( 'Double' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:649:1: ( 'Double' )
                    {
                     before(grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:650:1: ( 'Double' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:650:3: 'Double'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__DataEnum__Alternatives1385); 

                    }

                     after(grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:655:6: ( ( 'Integer' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:655:6: ( ( 'Integer' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:656:1: ( 'Integer' )
                    {
                     before(grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:657:1: ( 'Integer' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:657:3: 'Integer'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__DataEnum__Alternatives1406); 

                    }

                     after(grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:662:6: ( ( 'String' ) )
                    {
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:662:6: ( ( 'String' ) )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:663:1: ( 'String' )
                    {
                     before(grammarAccess.getDataEnumAccess().getStringEnumLiteralDeclaration_3()); 
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:664:1: ( 'String' )
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:664:3: 'String'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__DataEnum__Alternatives1427); 

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:676:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:680:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:681:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01460);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01463);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:688:1: rule__Root__Group__0__Impl : ( ( rule__Root__ArtifactsAssignment_0 ) ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:692:1: ( ( ( rule__Root__ArtifactsAssignment_0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:693:1: ( ( rule__Root__ArtifactsAssignment_0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:693:1: ( ( rule__Root__ArtifactsAssignment_0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:694:1: ( rule__Root__ArtifactsAssignment_0 )
            {
             before(grammarAccess.getRootAccess().getArtifactsAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:695:1: ( rule__Root__ArtifactsAssignment_0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:695:2: rule__Root__ArtifactsAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__ArtifactsAssignment_0_in_rule__Root__Group__0__Impl1490);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:705:1: rule__Root__Group__1 : rule__Root__Group__1__Impl ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:709:1: ( rule__Root__Group__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:710:2: rule__Root__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11520);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:716:1: rule__Root__Group__1__Impl : ( ( rule__Root__Alternatives_1 )* ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:720:1: ( ( ( rule__Root__Alternatives_1 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:721:1: ( ( rule__Root__Alternatives_1 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:721:1: ( ( rule__Root__Alternatives_1 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:722:1: ( rule__Root__Alternatives_1 )*
            {
             before(grammarAccess.getRootAccess().getAlternatives_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:723:1: ( rule__Root__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28||LA8_0==38||LA8_0==40||LA8_0==44) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:723:2: rule__Root__Alternatives_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Root__Alternatives_1_in_rule__Root__Group__1__Impl1547);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:737:1: rule__Artifact__Group__0 : rule__Artifact__Group__0__Impl rule__Artifact__Group__1 ;
    public final void rule__Artifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:741:1: ( rule__Artifact__Group__0__Impl rule__Artifact__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:742:2: rule__Artifact__Group__0__Impl rule__Artifact__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__0__Impl_in_rule__Artifact__Group__01582);
            rule__Artifact__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__1_in_rule__Artifact__Group__01585);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:749:1: rule__Artifact__Group__0__Impl : ( 'Artifact' ) ;
    public final void rule__Artifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:753:1: ( ( 'Artifact' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:754:1: ( 'Artifact' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:754:1: ( 'Artifact' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:755:1: 'Artifact'
            {
             before(grammarAccess.getArtifactAccess().getArtifactKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Artifact__Group__0__Impl1613); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:768:1: rule__Artifact__Group__1 : rule__Artifact__Group__1__Impl rule__Artifact__Group__2 ;
    public final void rule__Artifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:772:1: ( rule__Artifact__Group__1__Impl rule__Artifact__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:773:2: rule__Artifact__Group__1__Impl rule__Artifact__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__1__Impl_in_rule__Artifact__Group__11644);
            rule__Artifact__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__2_in_rule__Artifact__Group__11647);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:780:1: rule__Artifact__Group__1__Impl : ( ( rule__Artifact__NameAssignment_1 ) ) ;
    public final void rule__Artifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:784:1: ( ( ( rule__Artifact__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:785:1: ( ( rule__Artifact__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:785:1: ( ( rule__Artifact__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:786:1: ( rule__Artifact__NameAssignment_1 )
            {
             before(grammarAccess.getArtifactAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:787:1: ( rule__Artifact__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:787:2: rule__Artifact__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__NameAssignment_1_in_rule__Artifact__Group__1__Impl1674);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:797:1: rule__Artifact__Group__2 : rule__Artifact__Group__2__Impl rule__Artifact__Group__3 ;
    public final void rule__Artifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:801:1: ( rule__Artifact__Group__2__Impl rule__Artifact__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:802:2: rule__Artifact__Group__2__Impl rule__Artifact__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__2__Impl_in_rule__Artifact__Group__21704);
            rule__Artifact__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__3_in_rule__Artifact__Group__21707);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:809:1: rule__Artifact__Group__2__Impl : ( ( rule__Artifact__Group_2__0 )? ) ;
    public final void rule__Artifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:813:1: ( ( ( rule__Artifact__Group_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:814:1: ( ( rule__Artifact__Group_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:814:1: ( ( rule__Artifact__Group_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:815:1: ( rule__Artifact__Group_2__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:816:1: ( rule__Artifact__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:816:2: rule__Artifact__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__0_in_rule__Artifact__Group__2__Impl1734);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:826:1: rule__Artifact__Group__3 : rule__Artifact__Group__3__Impl rule__Artifact__Group__4 ;
    public final void rule__Artifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:830:1: ( rule__Artifact__Group__3__Impl rule__Artifact__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:831:2: rule__Artifact__Group__3__Impl rule__Artifact__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__3__Impl_in_rule__Artifact__Group__31765);
            rule__Artifact__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__4_in_rule__Artifact__Group__31768);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:838:1: rule__Artifact__Group__3__Impl : ( '{' ) ;
    public final void rule__Artifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:842:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:843:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:843:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:844:1: '{'
            {
             before(grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Artifact__Group__3__Impl1796); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:857:1: rule__Artifact__Group__4 : rule__Artifact__Group__4__Impl rule__Artifact__Group__5 ;
    public final void rule__Artifact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:861:1: ( rule__Artifact__Group__4__Impl rule__Artifact__Group__5 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:862:2: rule__Artifact__Group__4__Impl rule__Artifact__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__4__Impl_in_rule__Artifact__Group__41827);
            rule__Artifact__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__5_in_rule__Artifact__Group__41830);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:869:1: rule__Artifact__Group__4__Impl : ( ( rule__Artifact__AttributesAssignment_4 )* ) ;
    public final void rule__Artifact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:873:1: ( ( ( rule__Artifact__AttributesAssignment_4 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:874:1: ( ( rule__Artifact__AttributesAssignment_4 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:874:1: ( ( rule__Artifact__AttributesAssignment_4 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:875:1: ( rule__Artifact__AttributesAssignment_4 )*
            {
             before(grammarAccess.getArtifactAccess().getAttributesAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:876:1: ( rule__Artifact__AttributesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||(LA10_0>=45 && LA10_0<=46)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:876:2: rule__Artifact__AttributesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Artifact__AttributesAssignment_4_in_rule__Artifact__Group__4__Impl1857);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:886:1: rule__Artifact__Group__5 : rule__Artifact__Group__5__Impl ;
    public final void rule__Artifact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:890:1: ( rule__Artifact__Group__5__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:891:2: rule__Artifact__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__5__Impl_in_rule__Artifact__Group__51888);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:897:1: rule__Artifact__Group__5__Impl : ( '}' ) ;
    public final void rule__Artifact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:901:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:902:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:902:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:903:1: '}'
            {
             before(grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Artifact__Group__5__Impl1916); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:928:1: rule__Artifact__Group_2__0 : rule__Artifact__Group_2__0__Impl rule__Artifact__Group_2__1 ;
    public final void rule__Artifact__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:932:1: ( rule__Artifact__Group_2__0__Impl rule__Artifact__Group_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:933:2: rule__Artifact__Group_2__0__Impl rule__Artifact__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__0__Impl_in_rule__Artifact__Group_2__01959);
            rule__Artifact__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__1_in_rule__Artifact__Group_2__01962);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:940:1: rule__Artifact__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Artifact__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:944:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:945:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:945:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:946:1: '['
            {
             before(grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Artifact__Group_2__0__Impl1990); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:959:1: rule__Artifact__Group_2__1 : rule__Artifact__Group_2__1__Impl rule__Artifact__Group_2__2 ;
    public final void rule__Artifact__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:963:1: ( rule__Artifact__Group_2__1__Impl rule__Artifact__Group_2__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:964:2: rule__Artifact__Group_2__1__Impl rule__Artifact__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__1__Impl_in_rule__Artifact__Group_2__12021);
            rule__Artifact__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__2_in_rule__Artifact__Group_2__12024);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:971:1: rule__Artifact__Group_2__1__Impl : ( ( rule__Artifact__Group_2_1__0 )? ) ;
    public final void rule__Artifact__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:975:1: ( ( ( rule__Artifact__Group_2_1__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:976:1: ( ( rule__Artifact__Group_2_1__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:976:1: ( ( rule__Artifact__Group_2_1__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:977:1: ( rule__Artifact__Group_2_1__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:978:1: ( rule__Artifact__Group_2_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:978:2: rule__Artifact__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__0_in_rule__Artifact__Group_2__1__Impl2051);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:988:1: rule__Artifact__Group_2__2 : rule__Artifact__Group_2__2__Impl rule__Artifact__Group_2__3 ;
    public final void rule__Artifact__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:992:1: ( rule__Artifact__Group_2__2__Impl rule__Artifact__Group_2__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:993:2: rule__Artifact__Group_2__2__Impl rule__Artifact__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__2__Impl_in_rule__Artifact__Group_2__22082);
            rule__Artifact__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__3_in_rule__Artifact__Group_2__22085);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1000:1: rule__Artifact__Group_2__2__Impl : ( ( rule__Artifact__Group_2_2__0 )? ) ;
    public final void rule__Artifact__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1004:1: ( ( ( rule__Artifact__Group_2_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1005:1: ( ( rule__Artifact__Group_2_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1005:1: ( ( rule__Artifact__Group_2_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1006:1: ( rule__Artifact__Group_2_2__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1007:1: ( rule__Artifact__Group_2_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1007:2: rule__Artifact__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__0_in_rule__Artifact__Group_2__2__Impl2112);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1017:1: rule__Artifact__Group_2__3 : rule__Artifact__Group_2__3__Impl rule__Artifact__Group_2__4 ;
    public final void rule__Artifact__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1021:1: ( rule__Artifact__Group_2__3__Impl rule__Artifact__Group_2__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1022:2: rule__Artifact__Group_2__3__Impl rule__Artifact__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__3__Impl_in_rule__Artifact__Group_2__32143);
            rule__Artifact__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__4_in_rule__Artifact__Group_2__32146);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1029:1: rule__Artifact__Group_2__3__Impl : ( ( rule__Artifact__Group_2_3__0 )? ) ;
    public final void rule__Artifact__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1033:1: ( ( ( rule__Artifact__Group_2_3__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1034:1: ( ( rule__Artifact__Group_2_3__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1034:1: ( ( rule__Artifact__Group_2_3__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1035:1: ( rule__Artifact__Group_2_3__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1036:1: ( rule__Artifact__Group_2_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1036:2: rule__Artifact__Group_2_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__0_in_rule__Artifact__Group_2__3__Impl2173);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1046:1: rule__Artifact__Group_2__4 : rule__Artifact__Group_2__4__Impl ;
    public final void rule__Artifact__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1050:1: ( rule__Artifact__Group_2__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1051:2: rule__Artifact__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2__4__Impl_in_rule__Artifact__Group_2__42204);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1057:1: rule__Artifact__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Artifact__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1061:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1062:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1062:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1063:1: ']'
            {
             before(grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Artifact__Group_2__4__Impl2232); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1086:1: rule__Artifact__Group_2_1__0 : rule__Artifact__Group_2_1__0__Impl rule__Artifact__Group_2_1__1 ;
    public final void rule__Artifact__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1090:1: ( rule__Artifact__Group_2_1__0__Impl rule__Artifact__Group_2_1__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1091:2: rule__Artifact__Group_2_1__0__Impl rule__Artifact__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__0__Impl_in_rule__Artifact__Group_2_1__02273);
            rule__Artifact__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__1_in_rule__Artifact__Group_2_1__02276);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1098:1: rule__Artifact__Group_2_1__0__Impl : ( 'extension ' ) ;
    public final void rule__Artifact__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1102:1: ( ( 'extension ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1103:1: ( 'extension ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1103:1: ( 'extension ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1104:1: 'extension '
            {
             before(grammarAccess.getArtifactAccess().getExtensionKeyword_2_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Artifact__Group_2_1__0__Impl2304); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1117:1: rule__Artifact__Group_2_1__1 : rule__Artifact__Group_2_1__1__Impl rule__Artifact__Group_2_1__2 ;
    public final void rule__Artifact__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1121:1: ( rule__Artifact__Group_2_1__1__Impl rule__Artifact__Group_2_1__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1122:2: rule__Artifact__Group_2_1__1__Impl rule__Artifact__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__1__Impl_in_rule__Artifact__Group_2_1__12335);
            rule__Artifact__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__2_in_rule__Artifact__Group_2_1__12338);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1129:1: rule__Artifact__Group_2_1__1__Impl : ( '.' ) ;
    public final void rule__Artifact__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1133:1: ( ( '.' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1134:1: ( '.' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1134:1: ( '.' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1135:1: '.'
            {
             before(grammarAccess.getArtifactAccess().getFullStopKeyword_2_1_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Artifact__Group_2_1__1__Impl2366); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1148:1: rule__Artifact__Group_2_1__2 : rule__Artifact__Group_2_1__2__Impl ;
    public final void rule__Artifact__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1152:1: ( rule__Artifact__Group_2_1__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1153:2: rule__Artifact__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_1__2__Impl_in_rule__Artifact__Group_2_1__22397);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1159:1: rule__Artifact__Group_2_1__2__Impl : ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) ) ;
    public final void rule__Artifact__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1163:1: ( ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1164:1: ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1164:1: ( ( rule__Artifact__ExtensionAssignment_2_1_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1165:1: ( rule__Artifact__ExtensionAssignment_2_1_2 )
            {
             before(grammarAccess.getArtifactAccess().getExtensionAssignment_2_1_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1166:1: ( rule__Artifact__ExtensionAssignment_2_1_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1166:2: rule__Artifact__ExtensionAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__ExtensionAssignment_2_1_2_in_rule__Artifact__Group_2_1__2__Impl2424);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1182:1: rule__Artifact__Group_2_2__0 : rule__Artifact__Group_2_2__0__Impl rule__Artifact__Group_2_2__1 ;
    public final void rule__Artifact__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1186:1: ( rule__Artifact__Group_2_2__0__Impl rule__Artifact__Group_2_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1187:2: rule__Artifact__Group_2_2__0__Impl rule__Artifact__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__0__Impl_in_rule__Artifact__Group_2_2__02460);
            rule__Artifact__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__1_in_rule__Artifact__Group_2_2__02463);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1194:1: rule__Artifact__Group_2_2__0__Impl : ( 'format ' ) ;
    public final void rule__Artifact__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1198:1: ( ( 'format ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1199:1: ( 'format ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1199:1: ( 'format ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1200:1: 'format '
            {
             before(grammarAccess.getArtifactAccess().getFormatKeyword_2_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Artifact__Group_2_2__0__Impl2491); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1213:1: rule__Artifact__Group_2_2__1 : rule__Artifact__Group_2_2__1__Impl ;
    public final void rule__Artifact__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1217:1: ( rule__Artifact__Group_2_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1218:2: rule__Artifact__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_2__1__Impl_in_rule__Artifact__Group_2_2__12522);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1224:1: rule__Artifact__Group_2_2__1__Impl : ( ( rule__Artifact__FormatAssignment_2_2_1 ) ) ;
    public final void rule__Artifact__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1228:1: ( ( ( rule__Artifact__FormatAssignment_2_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1229:1: ( ( rule__Artifact__FormatAssignment_2_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1229:1: ( ( rule__Artifact__FormatAssignment_2_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1230:1: ( rule__Artifact__FormatAssignment_2_2_1 )
            {
             before(grammarAccess.getArtifactAccess().getFormatAssignment_2_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1231:1: ( rule__Artifact__FormatAssignment_2_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1231:2: rule__Artifact__FormatAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__FormatAssignment_2_2_1_in_rule__Artifact__Group_2_2__1__Impl2549);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1245:1: rule__Artifact__Group_2_3__0 : rule__Artifact__Group_2_3__0__Impl rule__Artifact__Group_2_3__1 ;
    public final void rule__Artifact__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1249:1: ( rule__Artifact__Group_2_3__0__Impl rule__Artifact__Group_2_3__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1250:2: rule__Artifact__Group_2_3__0__Impl rule__Artifact__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__0__Impl_in_rule__Artifact__Group_2_3__02583);
            rule__Artifact__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__1_in_rule__Artifact__Group_2_3__02586);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1257:1: rule__Artifact__Group_2_3__0__Impl : ( 'services : ' ) ;
    public final void rule__Artifact__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1261:1: ( ( 'services : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1262:1: ( 'services : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1262:1: ( 'services : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1263:1: 'services : '
            {
             before(grammarAccess.getArtifactAccess().getServicesKeyword_2_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Artifact__Group_2_3__0__Impl2614); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1276:1: rule__Artifact__Group_2_3__1 : rule__Artifact__Group_2_3__1__Impl rule__Artifact__Group_2_3__2 ;
    public final void rule__Artifact__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1280:1: ( rule__Artifact__Group_2_3__1__Impl rule__Artifact__Group_2_3__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1281:2: rule__Artifact__Group_2_3__1__Impl rule__Artifact__Group_2_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__1__Impl_in_rule__Artifact__Group_2_3__12645);
            rule__Artifact__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__2_in_rule__Artifact__Group_2_3__12648);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1288:1: rule__Artifact__Group_2_3__1__Impl : ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) ) ;
    public final void rule__Artifact__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1292:1: ( ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1293:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1293:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1294:1: ( rule__Artifact__BasicServicesAssignment_2_3_1 )
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesAssignment_2_3_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1295:1: ( rule__Artifact__BasicServicesAssignment_2_3_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1295:2: rule__Artifact__BasicServicesAssignment_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_1_in_rule__Artifact__Group_2_3__1__Impl2675);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1305:1: rule__Artifact__Group_2_3__2 : rule__Artifact__Group_2_3__2__Impl ;
    public final void rule__Artifact__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1309:1: ( rule__Artifact__Group_2_3__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1310:2: rule__Artifact__Group_2_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3__2__Impl_in_rule__Artifact__Group_2_3__22705);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1316:1: rule__Artifact__Group_2_3__2__Impl : ( ( rule__Artifact__Group_2_3_2__0 )* ) ;
    public final void rule__Artifact__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1320:1: ( ( ( rule__Artifact__Group_2_3_2__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1321:1: ( ( rule__Artifact__Group_2_3_2__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1321:1: ( ( rule__Artifact__Group_2_3_2__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1322:1: ( rule__Artifact__Group_2_3_2__0 )*
            {
             before(grammarAccess.getArtifactAccess().getGroup_2_3_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1323:1: ( rule__Artifact__Group_2_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1323:2: rule__Artifact__Group_2_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__0_in_rule__Artifact__Group_2_3__2__Impl2732);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1339:1: rule__Artifact__Group_2_3_2__0 : rule__Artifact__Group_2_3_2__0__Impl rule__Artifact__Group_2_3_2__1 ;
    public final void rule__Artifact__Group_2_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1343:1: ( rule__Artifact__Group_2_3_2__0__Impl rule__Artifact__Group_2_3_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1344:2: rule__Artifact__Group_2_3_2__0__Impl rule__Artifact__Group_2_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__0__Impl_in_rule__Artifact__Group_2_3_2__02769);
            rule__Artifact__Group_2_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__1_in_rule__Artifact__Group_2_3_2__02772);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1351:1: rule__Artifact__Group_2_3_2__0__Impl : ( ',' ) ;
    public final void rule__Artifact__Group_2_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1355:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1356:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1356:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1357:1: ','
            {
             before(grammarAccess.getArtifactAccess().getCommaKeyword_2_3_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Artifact__Group_2_3_2__0__Impl2800); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1370:1: rule__Artifact__Group_2_3_2__1 : rule__Artifact__Group_2_3_2__1__Impl ;
    public final void rule__Artifact__Group_2_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1374:1: ( rule__Artifact__Group_2_3_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1375:2: rule__Artifact__Group_2_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_2_3_2__1__Impl_in_rule__Artifact__Group_2_3_2__12831);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1381:1: rule__Artifact__Group_2_3_2__1__Impl : ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) ) ;
    public final void rule__Artifact__Group_2_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1385:1: ( ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1386:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1386:1: ( ( rule__Artifact__BasicServicesAssignment_2_3_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1387:1: ( rule__Artifact__BasicServicesAssignment_2_3_2_1 )
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesAssignment_2_3_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1388:1: ( rule__Artifact__BasicServicesAssignment_2_3_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1388:2: rule__Artifact__BasicServicesAssignment_2_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_2_1_in_rule__Artifact__Group_2_3_2__1__Impl2858);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1402:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1406:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1407:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02892);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02895);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1414:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1418:1: ( ( 'Entity' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1419:1: ( 'Entity' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1419:1: ( 'Entity' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1420:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Entity__Group__0__Impl2923); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1433:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1437:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1438:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12954);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12957);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1445:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1449:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1450:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1450:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1451:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1452:1: ( rule__Entity__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1452:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2984);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1462:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1466:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1467:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23014);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23017);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1474:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1478:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1479:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1479:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1480:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Entity__Group__2__Impl3045); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1493:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1497:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1498:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33076);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33079);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1505:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1509:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1510:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1510:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1511:1: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1512:1: ( rule__Entity__AttributesAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||(LA15_0>=45 && LA15_0<=46)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1512:2: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl3106);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1522:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1526:1: ( rule__Entity__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1527:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43137);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1533:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1537:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1538:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1538:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1539:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Entity__Group__4__Impl3165); 
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


    // $ANTLR start "rule__SimpleAttribute__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1562:1: rule__SimpleAttribute__Group__0 : rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 ;
    public final void rule__SimpleAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1566:1: ( rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1567:2: rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__03206);
            rule__SimpleAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__03209);
            rule__SimpleAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__0"


    // $ANTLR start "rule__SimpleAttribute__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1574:1: rule__SimpleAttribute__Group__0__Impl : ( ( rule__SimpleAttribute__ManyAssignment_0 )? ) ;
    public final void rule__SimpleAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1578:1: ( ( ( rule__SimpleAttribute__ManyAssignment_0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1579:1: ( ( rule__SimpleAttribute__ManyAssignment_0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1579:1: ( ( rule__SimpleAttribute__ManyAssignment_0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1580:1: ( rule__SimpleAttribute__ManyAssignment_0 )?
            {
             before(grammarAccess.getSimpleAttributeAccess().getManyAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1581:1: ( rule__SimpleAttribute__ManyAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1581:2: rule__SimpleAttribute__ManyAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__ManyAssignment_0_in_rule__SimpleAttribute__Group__0__Impl3236);
                    rule__SimpleAttribute__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleAttributeAccess().getManyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__0__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1591:1: rule__SimpleAttribute__Group__1 : rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2 ;
    public final void rule__SimpleAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1595:1: ( rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1596:2: rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__13267);
            rule__SimpleAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__2_in_rule__SimpleAttribute__Group__13270);
            rule__SimpleAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__1"


    // $ANTLR start "rule__SimpleAttribute__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1603:1: rule__SimpleAttribute__Group__1__Impl : ( ( rule__SimpleAttribute__RequiredAssignment_1 )? ) ;
    public final void rule__SimpleAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1607:1: ( ( ( rule__SimpleAttribute__RequiredAssignment_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1608:1: ( ( rule__SimpleAttribute__RequiredAssignment_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1608:1: ( ( rule__SimpleAttribute__RequiredAssignment_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1609:1: ( rule__SimpleAttribute__RequiredAssignment_1 )?
            {
             before(grammarAccess.getSimpleAttributeAccess().getRequiredAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1610:1: ( rule__SimpleAttribute__RequiredAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1610:2: rule__SimpleAttribute__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__RequiredAssignment_1_in_rule__SimpleAttribute__Group__1__Impl3297);
                    rule__SimpleAttribute__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleAttributeAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__1__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1620:1: rule__SimpleAttribute__Group__2 : rule__SimpleAttribute__Group__2__Impl rule__SimpleAttribute__Group__3 ;
    public final void rule__SimpleAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1624:1: ( rule__SimpleAttribute__Group__2__Impl rule__SimpleAttribute__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1625:2: rule__SimpleAttribute__Group__2__Impl rule__SimpleAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__2__Impl_in_rule__SimpleAttribute__Group__23328);
            rule__SimpleAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__3_in_rule__SimpleAttribute__Group__23331);
            rule__SimpleAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__2"


    // $ANTLR start "rule__SimpleAttribute__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1632:1: rule__SimpleAttribute__Group__2__Impl : ( ( rule__SimpleAttribute__NameAssignment_2 ) ) ;
    public final void rule__SimpleAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1636:1: ( ( ( rule__SimpleAttribute__NameAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1637:1: ( ( rule__SimpleAttribute__NameAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1637:1: ( ( rule__SimpleAttribute__NameAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1638:1: ( rule__SimpleAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1639:1: ( rule__SimpleAttribute__NameAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1639:2: rule__SimpleAttribute__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__NameAssignment_2_in_rule__SimpleAttribute__Group__2__Impl3358);
            rule__SimpleAttribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__2__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__3"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1649:1: rule__SimpleAttribute__Group__3 : rule__SimpleAttribute__Group__3__Impl rule__SimpleAttribute__Group__4 ;
    public final void rule__SimpleAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1653:1: ( rule__SimpleAttribute__Group__3__Impl rule__SimpleAttribute__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1654:2: rule__SimpleAttribute__Group__3__Impl rule__SimpleAttribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__3__Impl_in_rule__SimpleAttribute__Group__33388);
            rule__SimpleAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__4_in_rule__SimpleAttribute__Group__33391);
            rule__SimpleAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__3"


    // $ANTLR start "rule__SimpleAttribute__Group__3__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1661:1: rule__SimpleAttribute__Group__3__Impl : ( ':' ) ;
    public final void rule__SimpleAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1665:1: ( ( ':' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1666:1: ( ':' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1666:1: ( ':' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1667:1: ':'
            {
             before(grammarAccess.getSimpleAttributeAccess().getColonKeyword_3()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__SimpleAttribute__Group__3__Impl3419); 
             after(grammarAccess.getSimpleAttributeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__3__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1680:1: rule__SimpleAttribute__Group__4 : rule__SimpleAttribute__Group__4__Impl ;
    public final void rule__SimpleAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1684:1: ( rule__SimpleAttribute__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1685:2: rule__SimpleAttribute__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__4__Impl_in_rule__SimpleAttribute__Group__43450);
            rule__SimpleAttribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__4"


    // $ANTLR start "rule__SimpleAttribute__Group__4__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1691:1: rule__SimpleAttribute__Group__4__Impl : ( ( rule__SimpleAttribute__DataAssignment_4 ) ) ;
    public final void rule__SimpleAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1695:1: ( ( ( rule__SimpleAttribute__DataAssignment_4 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1696:1: ( ( rule__SimpleAttribute__DataAssignment_4 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1696:1: ( ( rule__SimpleAttribute__DataAssignment_4 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1697:1: ( rule__SimpleAttribute__DataAssignment_4 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getDataAssignment_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1698:1: ( rule__SimpleAttribute__DataAssignment_4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1698:2: rule__SimpleAttribute__DataAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__DataAssignment_4_in_rule__SimpleAttribute__Group__4__Impl3477);
            rule__SimpleAttribute__DataAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimpleAttributeAccess().getDataAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__Group__4__Impl"


    // $ANTLR start "rule__MultiAttribute__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1718:1: rule__MultiAttribute__Group__0 : rule__MultiAttribute__Group__0__Impl rule__MultiAttribute__Group__1 ;
    public final void rule__MultiAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1722:1: ( rule__MultiAttribute__Group__0__Impl rule__MultiAttribute__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1723:2: rule__MultiAttribute__Group__0__Impl rule__MultiAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__0__Impl_in_rule__MultiAttribute__Group__03517);
            rule__MultiAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__1_in_rule__MultiAttribute__Group__03520);
            rule__MultiAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAttribute__Group__0"


    // $ANTLR start "rule__MultiAttribute__Group__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1730:1: rule__MultiAttribute__Group__0__Impl : ( ( rule__MultiAttribute__NameAssignment_0 ) ) ;
    public final void rule__MultiAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1734:1: ( ( ( rule__MultiAttribute__NameAssignment_0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1735:1: ( ( rule__MultiAttribute__NameAssignment_0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1735:1: ( ( rule__MultiAttribute__NameAssignment_0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1736:1: ( rule__MultiAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getMultiAttributeAccess().getNameAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1737:1: ( rule__MultiAttribute__NameAssignment_0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1737:2: rule__MultiAttribute__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__NameAssignment_0_in_rule__MultiAttribute__Group__0__Impl3547);
            rule__MultiAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAttribute__Group__0__Impl"


    // $ANTLR start "rule__MultiAttribute__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1747:1: rule__MultiAttribute__Group__1 : rule__MultiAttribute__Group__1__Impl rule__MultiAttribute__Group__2 ;
    public final void rule__MultiAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1751:1: ( rule__MultiAttribute__Group__1__Impl rule__MultiAttribute__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1752:2: rule__MultiAttribute__Group__1__Impl rule__MultiAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__1__Impl_in_rule__MultiAttribute__Group__13577);
            rule__MultiAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__2_in_rule__MultiAttribute__Group__13580);
            rule__MultiAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAttribute__Group__1"


    // $ANTLR start "rule__MultiAttribute__Group__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1759:1: rule__MultiAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__MultiAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1763:1: ( ( ':' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1764:1: ( ':' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1764:1: ( ':' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1765:1: ':'
            {
             before(grammarAccess.getMultiAttributeAccess().getColonKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__MultiAttribute__Group__1__Impl3608); 
             after(grammarAccess.getMultiAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAttribute__Group__1__Impl"


    // $ANTLR start "rule__MultiAttribute__Group__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1778:1: rule__MultiAttribute__Group__2 : rule__MultiAttribute__Group__2__Impl ;
    public final void rule__MultiAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1782:1: ( rule__MultiAttribute__Group__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1783:2: rule__MultiAttribute__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__2__Impl_in_rule__MultiAttribute__Group__23639);
            rule__MultiAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAttribute__Group__2"


    // $ANTLR start "rule__MultiAttribute__Group__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1789:1: rule__MultiAttribute__Group__2__Impl : ( ( rule__MultiAttribute__TypeAssignment_2 ) ) ;
    public final void rule__MultiAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1793:1: ( ( ( rule__MultiAttribute__TypeAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1794:1: ( ( rule__MultiAttribute__TypeAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1794:1: ( ( rule__MultiAttribute__TypeAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1795:1: ( rule__MultiAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getMultiAttributeAccess().getTypeAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1796:1: ( rule__MultiAttribute__TypeAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1796:2: rule__MultiAttribute__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__TypeAssignment_2_in_rule__MultiAttribute__Group__2__Impl3666);
            rule__MultiAttribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAttribute__Group__2__Impl"


    // $ANTLR start "rule__OnService__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1812:1: rule__OnService__Group__0 : rule__OnService__Group__0__Impl rule__OnService__Group__1 ;
    public final void rule__OnService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1816:1: ( rule__OnService__Group__0__Impl rule__OnService__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1817:2: rule__OnService__Group__0__Impl rule__OnService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__0__Impl_in_rule__OnService__Group__03702);
            rule__OnService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__1_in_rule__OnService__Group__03705);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1824:1: rule__OnService__Group__0__Impl : ( ( rule__OnService__ArtifactAssignment_0 ) ) ;
    public final void rule__OnService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1828:1: ( ( ( rule__OnService__ArtifactAssignment_0 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1829:1: ( ( rule__OnService__ArtifactAssignment_0 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1829:1: ( ( rule__OnService__ArtifactAssignment_0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1830:1: ( rule__OnService__ArtifactAssignment_0 )
            {
             before(grammarAccess.getOnServiceAccess().getArtifactAssignment_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1831:1: ( rule__OnService__ArtifactAssignment_0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1831:2: rule__OnService__ArtifactAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__ArtifactAssignment_0_in_rule__OnService__Group__0__Impl3732);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1841:1: rule__OnService__Group__1 : rule__OnService__Group__1__Impl rule__OnService__Group__2 ;
    public final void rule__OnService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1845:1: ( rule__OnService__Group__1__Impl rule__OnService__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1846:2: rule__OnService__Group__1__Impl rule__OnService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__1__Impl_in_rule__OnService__Group__13762);
            rule__OnService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__2_in_rule__OnService__Group__13765);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1853:1: rule__OnService__Group__1__Impl : ( '[' ) ;
    public final void rule__OnService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1857:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1858:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1858:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1859:1: '['
            {
             before(grammarAccess.getOnServiceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__OnService__Group__1__Impl3793); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1872:1: rule__OnService__Group__2 : rule__OnService__Group__2__Impl rule__OnService__Group__3 ;
    public final void rule__OnService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1876:1: ( rule__OnService__Group__2__Impl rule__OnService__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1877:2: rule__OnService__Group__2__Impl rule__OnService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__2__Impl_in_rule__OnService__Group__23824);
            rule__OnService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__3_in_rule__OnService__Group__23827);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1884:1: rule__OnService__Group__2__Impl : ( ( rule__OnService__WhenServicesAssignment_2 ) ) ;
    public final void rule__OnService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1888:1: ( ( ( rule__OnService__WhenServicesAssignment_2 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1889:1: ( ( rule__OnService__WhenServicesAssignment_2 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1889:1: ( ( rule__OnService__WhenServicesAssignment_2 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1890:1: ( rule__OnService__WhenServicesAssignment_2 )
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1891:1: ( rule__OnService__WhenServicesAssignment_2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1891:2: rule__OnService__WhenServicesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__WhenServicesAssignment_2_in_rule__OnService__Group__2__Impl3854);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1901:1: rule__OnService__Group__3 : rule__OnService__Group__3__Impl rule__OnService__Group__4 ;
    public final void rule__OnService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1905:1: ( rule__OnService__Group__3__Impl rule__OnService__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1906:2: rule__OnService__Group__3__Impl rule__OnService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__3__Impl_in_rule__OnService__Group__33884);
            rule__OnService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__4_in_rule__OnService__Group__33887);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1913:1: rule__OnService__Group__3__Impl : ( ( rule__OnService__Group_3__0 )* ) ;
    public final void rule__OnService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1917:1: ( ( ( rule__OnService__Group_3__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1918:1: ( ( rule__OnService__Group_3__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1918:1: ( ( rule__OnService__Group_3__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1919:1: ( rule__OnService__Group_3__0 )*
            {
             before(grammarAccess.getOnServiceAccess().getGroup_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1920:1: ( rule__OnService__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1920:2: rule__OnService__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__0_in_rule__OnService__Group__3__Impl3914);
            	    rule__OnService__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1930:1: rule__OnService__Group__4 : rule__OnService__Group__4__Impl ;
    public final void rule__OnService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1934:1: ( rule__OnService__Group__4__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1935:2: rule__OnService__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__4__Impl_in_rule__OnService__Group__43945);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1941:1: rule__OnService__Group__4__Impl : ( ']' ) ;
    public final void rule__OnService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1945:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1946:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1946:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1947:1: ']'
            {
             before(grammarAccess.getOnServiceAccess().getRightSquareBracketKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__OnService__Group__4__Impl3973); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1970:1: rule__OnService__Group_3__0 : rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1 ;
    public final void rule__OnService__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1974:1: ( rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1975:2: rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__0__Impl_in_rule__OnService__Group_3__04014);
            rule__OnService__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__1_in_rule__OnService__Group_3__04017);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1982:1: rule__OnService__Group_3__0__Impl : ( ',' ) ;
    public final void rule__OnService__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1986:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1987:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1987:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1988:1: ','
            {
             before(grammarAccess.getOnServiceAccess().getCommaKeyword_3_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__OnService__Group_3__0__Impl4045); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2001:1: rule__OnService__Group_3__1 : rule__OnService__Group_3__1__Impl ;
    public final void rule__OnService__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2005:1: ( rule__OnService__Group_3__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2006:2: rule__OnService__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__1__Impl_in_rule__OnService__Group_3__14076);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2012:1: rule__OnService__Group_3__1__Impl : ( ( rule__OnService__WhenServicesAssignment_3_1 ) ) ;
    public final void rule__OnService__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2016:1: ( ( ( rule__OnService__WhenServicesAssignment_3_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2017:1: ( ( rule__OnService__WhenServicesAssignment_3_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2017:1: ( ( rule__OnService__WhenServicesAssignment_3_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2018:1: ( rule__OnService__WhenServicesAssignment_3_1 )
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_3_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2019:1: ( rule__OnService__WhenServicesAssignment_3_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2019:2: rule__OnService__WhenServicesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__WhenServicesAssignment_3_1_in_rule__OnService__Group_3__1__Impl4103);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2033:1: rule__SimpleService__Group__0 : rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1 ;
    public final void rule__SimpleService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2037:1: ( rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2038:2: rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__0__Impl_in_rule__SimpleService__Group__04137);
            rule__SimpleService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__1_in_rule__SimpleService__Group__04140);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2045:1: rule__SimpleService__Group__0__Impl : ( 'Service' ) ;
    public final void rule__SimpleService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2049:1: ( ( 'Service' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2050:1: ( 'Service' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2050:1: ( 'Service' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2051:1: 'Service'
            {
             before(grammarAccess.getSimpleServiceAccess().getServiceKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__SimpleService__Group__0__Impl4168); 
             after(grammarAccess.getSimpleServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group__0__Impl"


    // $ANTLR start "rule__SimpleService__Group__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2064:1: rule__SimpleService__Group__1 : rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2 ;
    public final void rule__SimpleService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2068:1: ( rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2069:2: rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__1__Impl_in_rule__SimpleService__Group__14199);
            rule__SimpleService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__2_in_rule__SimpleService__Group__14202);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2076:1: rule__SimpleService__Group__1__Impl : ( ( rule__SimpleService__NameAssignment_1 ) ) ;
    public final void rule__SimpleService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2080:1: ( ( ( rule__SimpleService__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2081:1: ( ( rule__SimpleService__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2081:1: ( ( rule__SimpleService__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2082:1: ( rule__SimpleService__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2083:1: ( rule__SimpleService__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2083:2: rule__SimpleService__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__NameAssignment_1_in_rule__SimpleService__Group__1__Impl4229);
            rule__SimpleService__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2093:1: rule__SimpleService__Group__2 : rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3 ;
    public final void rule__SimpleService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2097:1: ( rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2098:2: rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__2__Impl_in_rule__SimpleService__Group__24259);
            rule__SimpleService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__3_in_rule__SimpleService__Group__24262);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2105:1: rule__SimpleService__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2109:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2110:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2110:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2111:1: '{'
            {
             before(grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__SimpleService__Group__2__Impl4290); 
             after(grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2124:1: rule__SimpleService__Group__3 : rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4 ;
    public final void rule__SimpleService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2128:1: ( rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2129:2: rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__3__Impl_in_rule__SimpleService__Group__34321);
            rule__SimpleService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__4_in_rule__SimpleService__Group__34324);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2136:1: rule__SimpleService__Group__3__Impl : ( ( rule__SimpleService__Group_3__0 )? ) ;
    public final void rule__SimpleService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2140:1: ( ( ( rule__SimpleService__Group_3__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2141:1: ( ( rule__SimpleService__Group_3__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2141:1: ( ( rule__SimpleService__Group_3__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2142:1: ( rule__SimpleService__Group_3__0 )?
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_3()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2143:1: ( rule__SimpleService__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2143:2: rule__SimpleService__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__0_in_rule__SimpleService__Group__3__Impl4351);
                    rule__SimpleService__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleServiceAccess().getGroup_3()); 

            }


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2153:1: rule__SimpleService__Group__4 : rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5 ;
    public final void rule__SimpleService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2157:1: ( rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2158:2: rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__4__Impl_in_rule__SimpleService__Group__44382);
            rule__SimpleService__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__5_in_rule__SimpleService__Group__44385);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2165:1: rule__SimpleService__Group__4__Impl : ( ( rule__SimpleService__Group_4__0 )? ) ;
    public final void rule__SimpleService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2169:1: ( ( ( rule__SimpleService__Group_4__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2170:1: ( ( rule__SimpleService__Group_4__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2170:1: ( ( rule__SimpleService__Group_4__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2171:1: ( rule__SimpleService__Group_4__0 )?
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2172:1: ( rule__SimpleService__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2172:2: rule__SimpleService__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__0_in_rule__SimpleService__Group__4__Impl4412);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2182:1: rule__SimpleService__Group__5 : rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6 ;
    public final void rule__SimpleService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2186:1: ( rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2187:2: rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__5__Impl_in_rule__SimpleService__Group__54443);
            rule__SimpleService__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__6_in_rule__SimpleService__Group__54446);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2194:1: rule__SimpleService__Group__5__Impl : ( ( rule__SimpleService__Group_5__0 )* ) ;
    public final void rule__SimpleService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2198:1: ( ( ( rule__SimpleService__Group_5__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2199:1: ( ( rule__SimpleService__Group_5__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2199:1: ( ( rule__SimpleService__Group_5__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2200:1: ( rule__SimpleService__Group_5__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_5()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2201:1: ( rule__SimpleService__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==43) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2201:2: rule__SimpleService__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__0_in_rule__SimpleService__Group__5__Impl4473);
            	    rule__SimpleService__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2211:1: rule__SimpleService__Group__6 : rule__SimpleService__Group__6__Impl ;
    public final void rule__SimpleService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2215:1: ( rule__SimpleService__Group__6__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2216:2: rule__SimpleService__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__6__Impl_in_rule__SimpleService__Group__64504);
            rule__SimpleService__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2222:1: rule__SimpleService__Group__6__Impl : ( '}' ) ;
    public final void rule__SimpleService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2226:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2227:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2227:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2228:1: '}'
            {
             before(grammarAccess.getSimpleServiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SimpleService__Group__6__Impl4532); 
             after(grammarAccess.getSimpleServiceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__SimpleService__Group_3__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2255:1: rule__SimpleService__Group_3__0 : rule__SimpleService__Group_3__0__Impl rule__SimpleService__Group_3__1 ;
    public final void rule__SimpleService__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2259:1: ( rule__SimpleService__Group_3__0__Impl rule__SimpleService__Group_3__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2260:2: rule__SimpleService__Group_3__0__Impl rule__SimpleService__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__0__Impl_in_rule__SimpleService__Group_3__04577);
            rule__SimpleService__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__1_in_rule__SimpleService__Group_3__04580);
            rule__SimpleService__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3__0"


    // $ANTLR start "rule__SimpleService__Group_3__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2267:1: rule__SimpleService__Group_3__0__Impl : ( 'input : ' ) ;
    public final void rule__SimpleService__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2271:1: ( ( 'input : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2272:1: ( 'input : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2272:1: ( 'input : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2273:1: 'input : '
            {
             before(grammarAccess.getSimpleServiceAccess().getInputKeyword_3_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__SimpleService__Group_3__0__Impl4608); 
             after(grammarAccess.getSimpleServiceAccess().getInputKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3__0__Impl"


    // $ANTLR start "rule__SimpleService__Group_3__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2286:1: rule__SimpleService__Group_3__1 : rule__SimpleService__Group_3__1__Impl rule__SimpleService__Group_3__2 ;
    public final void rule__SimpleService__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2290:1: ( rule__SimpleService__Group_3__1__Impl rule__SimpleService__Group_3__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2291:2: rule__SimpleService__Group_3__1__Impl rule__SimpleService__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__1__Impl_in_rule__SimpleService__Group_3__14639);
            rule__SimpleService__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__2_in_rule__SimpleService__Group_3__14642);
            rule__SimpleService__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3__1"


    // $ANTLR start "rule__SimpleService__Group_3__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2298:1: rule__SimpleService__Group_3__1__Impl : ( ( rule__SimpleService__InputAssignment_3_1 ) ) ;
    public final void rule__SimpleService__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2302:1: ( ( ( rule__SimpleService__InputAssignment_3_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2303:1: ( ( rule__SimpleService__InputAssignment_3_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2303:1: ( ( rule__SimpleService__InputAssignment_3_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2304:1: ( rule__SimpleService__InputAssignment_3_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAssignment_3_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2305:1: ( rule__SimpleService__InputAssignment_3_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2305:2: rule__SimpleService__InputAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__InputAssignment_3_1_in_rule__SimpleService__Group_3__1__Impl4669);
            rule__SimpleService__InputAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getInputAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3__1__Impl"


    // $ANTLR start "rule__SimpleService__Group_3__2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2315:1: rule__SimpleService__Group_3__2 : rule__SimpleService__Group_3__2__Impl ;
    public final void rule__SimpleService__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2319:1: ( rule__SimpleService__Group_3__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2320:2: rule__SimpleService__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__2__Impl_in_rule__SimpleService__Group_3__24699);
            rule__SimpleService__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3__2"


    // $ANTLR start "rule__SimpleService__Group_3__2__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2326:1: rule__SimpleService__Group_3__2__Impl : ( ( rule__SimpleService__Group_3_2__0 )* ) ;
    public final void rule__SimpleService__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2330:1: ( ( ( rule__SimpleService__Group_3_2__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2331:1: ( ( rule__SimpleService__Group_3_2__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2331:1: ( ( rule__SimpleService__Group_3_2__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2332:1: ( rule__SimpleService__Group_3_2__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_3_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2333:1: ( rule__SimpleService__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2333:2: rule__SimpleService__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3_2__0_in_rule__SimpleService__Group_3__2__Impl4726);
            	    rule__SimpleService__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSimpleServiceAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3__2__Impl"


    // $ANTLR start "rule__SimpleService__Group_3_2__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2349:1: rule__SimpleService__Group_3_2__0 : rule__SimpleService__Group_3_2__0__Impl rule__SimpleService__Group_3_2__1 ;
    public final void rule__SimpleService__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2353:1: ( rule__SimpleService__Group_3_2__0__Impl rule__SimpleService__Group_3_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2354:2: rule__SimpleService__Group_3_2__0__Impl rule__SimpleService__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3_2__0__Impl_in_rule__SimpleService__Group_3_2__04763);
            rule__SimpleService__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3_2__1_in_rule__SimpleService__Group_3_2__04766);
            rule__SimpleService__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3_2__0"


    // $ANTLR start "rule__SimpleService__Group_3_2__0__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2361:1: rule__SimpleService__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleService__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2365:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2366:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2366:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2367:1: ','
            {
             before(grammarAccess.getSimpleServiceAccess().getCommaKeyword_3_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SimpleService__Group_3_2__0__Impl4794); 
             after(grammarAccess.getSimpleServiceAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3_2__0__Impl"


    // $ANTLR start "rule__SimpleService__Group_3_2__1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2380:1: rule__SimpleService__Group_3_2__1 : rule__SimpleService__Group_3_2__1__Impl ;
    public final void rule__SimpleService__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2384:1: ( rule__SimpleService__Group_3_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2385:2: rule__SimpleService__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3_2__1__Impl_in_rule__SimpleService__Group_3_2__14825);
            rule__SimpleService__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3_2__1"


    // $ANTLR start "rule__SimpleService__Group_3_2__1__Impl"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2391:1: rule__SimpleService__Group_3_2__1__Impl : ( ( rule__SimpleService__InputAssignment_3_2_1 ) ) ;
    public final void rule__SimpleService__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2395:1: ( ( ( rule__SimpleService__InputAssignment_3_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2396:1: ( ( rule__SimpleService__InputAssignment_3_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2396:1: ( ( rule__SimpleService__InputAssignment_3_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2397:1: ( rule__SimpleService__InputAssignment_3_2_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAssignment_3_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2398:1: ( rule__SimpleService__InputAssignment_3_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2398:2: rule__SimpleService__InputAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__InputAssignment_3_2_1_in_rule__SimpleService__Group_3_2__1__Impl4852);
            rule__SimpleService__InputAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getInputAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__Group_3_2__1__Impl"


    // $ANTLR start "rule__SimpleService__Group_4__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2412:1: rule__SimpleService__Group_4__0 : rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1 ;
    public final void rule__SimpleService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2416:1: ( rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2417:2: rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__0__Impl_in_rule__SimpleService__Group_4__04886);
            rule__SimpleService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__1_in_rule__SimpleService__Group_4__04889);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2424:1: rule__SimpleService__Group_4__0__Impl : ( 'output : ' ) ;
    public final void rule__SimpleService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2428:1: ( ( 'output : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2429:1: ( 'output : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2429:1: ( 'output : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2430:1: 'output : '
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputKeyword_4_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__SimpleService__Group_4__0__Impl4917); 
             after(grammarAccess.getSimpleServiceAccess().getOutputKeyword_4_0()); 

            }


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2443:1: rule__SimpleService__Group_4__1 : rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2 ;
    public final void rule__SimpleService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2447:1: ( rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2448:2: rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__1__Impl_in_rule__SimpleService__Group_4__14948);
            rule__SimpleService__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__2_in_rule__SimpleService__Group_4__14951);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2455:1: rule__SimpleService__Group_4__1__Impl : ( ( rule__SimpleService__OutputAssignment_4_1 ) ) ;
    public final void rule__SimpleService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2459:1: ( ( ( rule__SimpleService__OutputAssignment_4_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2460:1: ( ( rule__SimpleService__OutputAssignment_4_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2460:1: ( ( rule__SimpleService__OutputAssignment_4_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2461:1: ( rule__SimpleService__OutputAssignment_4_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAssignment_4_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2462:1: ( rule__SimpleService__OutputAssignment_4_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2462:2: rule__SimpleService__OutputAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__OutputAssignment_4_1_in_rule__SimpleService__Group_4__1__Impl4978);
            rule__SimpleService__OutputAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getOutputAssignment_4_1()); 

            }


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2472:1: rule__SimpleService__Group_4__2 : rule__SimpleService__Group_4__2__Impl ;
    public final void rule__SimpleService__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2476:1: ( rule__SimpleService__Group_4__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2477:2: rule__SimpleService__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__2__Impl_in_rule__SimpleService__Group_4__25008);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2483:1: rule__SimpleService__Group_4__2__Impl : ( ( rule__SimpleService__Group_4_2__0 )* ) ;
    public final void rule__SimpleService__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2487:1: ( ( ( rule__SimpleService__Group_4_2__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2488:1: ( ( rule__SimpleService__Group_4_2__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2488:1: ( ( rule__SimpleService__Group_4_2__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2489:1: ( rule__SimpleService__Group_4_2__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_4_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2490:1: ( rule__SimpleService__Group_4_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2490:2: rule__SimpleService__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__0_in_rule__SimpleService__Group_4__2__Impl5035);
            	    rule__SimpleService__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2506:1: rule__SimpleService__Group_4_2__0 : rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1 ;
    public final void rule__SimpleService__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2510:1: ( rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2511:2: rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__0__Impl_in_rule__SimpleService__Group_4_2__05072);
            rule__SimpleService__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__1_in_rule__SimpleService__Group_4_2__05075);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2518:1: rule__SimpleService__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleService__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2522:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2523:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2523:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2524:1: ','
            {
             before(grammarAccess.getSimpleServiceAccess().getCommaKeyword_4_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SimpleService__Group_4_2__0__Impl5103); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2537:1: rule__SimpleService__Group_4_2__1 : rule__SimpleService__Group_4_2__1__Impl ;
    public final void rule__SimpleService__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2541:1: ( rule__SimpleService__Group_4_2__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2542:2: rule__SimpleService__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__1__Impl_in_rule__SimpleService__Group_4_2__15134);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2548:1: rule__SimpleService__Group_4_2__1__Impl : ( ( rule__SimpleService__OutputAssignment_4_2_1 ) ) ;
    public final void rule__SimpleService__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2552:1: ( ( ( rule__SimpleService__OutputAssignment_4_2_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2553:1: ( ( rule__SimpleService__OutputAssignment_4_2_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2553:1: ( ( rule__SimpleService__OutputAssignment_4_2_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2554:1: ( rule__SimpleService__OutputAssignment_4_2_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAssignment_4_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2555:1: ( rule__SimpleService__OutputAssignment_4_2_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2555:2: rule__SimpleService__OutputAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__OutputAssignment_4_2_1_in_rule__SimpleService__Group_4_2__1__Impl5161);
            rule__SimpleService__OutputAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getOutputAssignment_4_2_1()); 

            }


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2569:1: rule__SimpleService__Group_5__0 : rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1 ;
    public final void rule__SimpleService__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2573:1: ( rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2574:2: rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__0__Impl_in_rule__SimpleService__Group_5__05195);
            rule__SimpleService__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__1_in_rule__SimpleService__Group_5__05198);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2581:1: rule__SimpleService__Group_5__0__Impl : ( 'when : ' ) ;
    public final void rule__SimpleService__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2585:1: ( ( 'when : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2586:1: ( 'when : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2586:1: ( 'when : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2587:1: 'when : '
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenKeyword_5_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__SimpleService__Group_5__0__Impl5226); 
             after(grammarAccess.getSimpleServiceAccess().getWhenKeyword_5_0()); 

            }


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2600:1: rule__SimpleService__Group_5__1 : rule__SimpleService__Group_5__1__Impl ;
    public final void rule__SimpleService__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2604:1: ( rule__SimpleService__Group_5__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2605:2: rule__SimpleService__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__1__Impl_in_rule__SimpleService__Group_5__15257);
            rule__SimpleService__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2611:1: rule__SimpleService__Group_5__1__Impl : ( ( rule__SimpleService__WhenAssignment_5_1 ) ) ;
    public final void rule__SimpleService__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2615:1: ( ( ( rule__SimpleService__WhenAssignment_5_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2616:1: ( ( rule__SimpleService__WhenAssignment_5_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2616:1: ( ( rule__SimpleService__WhenAssignment_5_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2617:1: ( rule__SimpleService__WhenAssignment_5_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenAssignment_5_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2618:1: ( rule__SimpleService__WhenAssignment_5_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2618:2: rule__SimpleService__WhenAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__WhenAssignment_5_1_in_rule__SimpleService__Group_5__1__Impl5284);
            rule__SimpleService__WhenAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleServiceAccess().getWhenAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MultiService__Group__0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2632:1: rule__MultiService__Group__0 : rule__MultiService__Group__0__Impl rule__MultiService__Group__1 ;
    public final void rule__MultiService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2636:1: ( rule__MultiService__Group__0__Impl rule__MultiService__Group__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2637:2: rule__MultiService__Group__0__Impl rule__MultiService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__0__Impl_in_rule__MultiService__Group__05318);
            rule__MultiService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__1_in_rule__MultiService__Group__05321);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2644:1: rule__MultiService__Group__0__Impl : ( 'MultiService' ) ;
    public final void rule__MultiService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2648:1: ( ( 'MultiService' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2649:1: ( 'MultiService' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2649:1: ( 'MultiService' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2650:1: 'MultiService'
            {
             before(grammarAccess.getMultiServiceAccess().getMultiServiceKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__MultiService__Group__0__Impl5349); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2663:1: rule__MultiService__Group__1 : rule__MultiService__Group__1__Impl rule__MultiService__Group__2 ;
    public final void rule__MultiService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2667:1: ( rule__MultiService__Group__1__Impl rule__MultiService__Group__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2668:2: rule__MultiService__Group__1__Impl rule__MultiService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__1__Impl_in_rule__MultiService__Group__15380);
            rule__MultiService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__2_in_rule__MultiService__Group__15383);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2675:1: rule__MultiService__Group__1__Impl : ( ( rule__MultiService__NameAssignment_1 ) ) ;
    public final void rule__MultiService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2679:1: ( ( ( rule__MultiService__NameAssignment_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2680:1: ( ( rule__MultiService__NameAssignment_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2680:1: ( ( rule__MultiService__NameAssignment_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2681:1: ( rule__MultiService__NameAssignment_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getNameAssignment_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2682:1: ( rule__MultiService__NameAssignment_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2682:2: rule__MultiService__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__NameAssignment_1_in_rule__MultiService__Group__1__Impl5410);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2692:1: rule__MultiService__Group__2 : rule__MultiService__Group__2__Impl rule__MultiService__Group__3 ;
    public final void rule__MultiService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2696:1: ( rule__MultiService__Group__2__Impl rule__MultiService__Group__3 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2697:2: rule__MultiService__Group__2__Impl rule__MultiService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__2__Impl_in_rule__MultiService__Group__25440);
            rule__MultiService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__3_in_rule__MultiService__Group__25443);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2704:1: rule__MultiService__Group__2__Impl : ( ( rule__MultiService__Group_2__0 )? ) ;
    public final void rule__MultiService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2708:1: ( ( ( rule__MultiService__Group_2__0 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2709:1: ( ( rule__MultiService__Group_2__0 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2709:1: ( ( rule__MultiService__Group_2__0 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2710:1: ( rule__MultiService__Group_2__0 )?
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_2()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2711:1: ( rule__MultiService__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2711:2: rule__MultiService__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__0_in_rule__MultiService__Group__2__Impl5470);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2721:1: rule__MultiService__Group__3 : rule__MultiService__Group__3__Impl rule__MultiService__Group__4 ;
    public final void rule__MultiService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2725:1: ( rule__MultiService__Group__3__Impl rule__MultiService__Group__4 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2726:2: rule__MultiService__Group__3__Impl rule__MultiService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__3__Impl_in_rule__MultiService__Group__35501);
            rule__MultiService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__4_in_rule__MultiService__Group__35504);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2733:1: rule__MultiService__Group__3__Impl : ( '{' ) ;
    public final void rule__MultiService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2737:1: ( ( '{' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2738:1: ( '{' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2738:1: ( '{' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2739:1: '{'
            {
             before(grammarAccess.getMultiServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MultiService__Group__3__Impl5532); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2752:1: rule__MultiService__Group__4 : rule__MultiService__Group__4__Impl rule__MultiService__Group__5 ;
    public final void rule__MultiService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2756:1: ( rule__MultiService__Group__4__Impl rule__MultiService__Group__5 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2757:2: rule__MultiService__Group__4__Impl rule__MultiService__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__4__Impl_in_rule__MultiService__Group__45563);
            rule__MultiService__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__5_in_rule__MultiService__Group__45566);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2764:1: rule__MultiService__Group__4__Impl : ( ( rule__MultiService__Group_4__0 )* ) ;
    public final void rule__MultiService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2768:1: ( ( ( rule__MultiService__Group_4__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2769:1: ( ( rule__MultiService__Group_4__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2769:1: ( ( rule__MultiService__Group_4__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2770:1: ( rule__MultiService__Group_4__0 )*
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_4()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2771:1: ( rule__MultiService__Group_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==43) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2771:2: rule__MultiService__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__0_in_rule__MultiService__Group__4__Impl5593);
            	    rule__MultiService__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2781:1: rule__MultiService__Group__5 : rule__MultiService__Group__5__Impl rule__MultiService__Group__6 ;
    public final void rule__MultiService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2785:1: ( rule__MultiService__Group__5__Impl rule__MultiService__Group__6 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2786:2: rule__MultiService__Group__5__Impl rule__MultiService__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__5__Impl_in_rule__MultiService__Group__55624);
            rule__MultiService__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__6_in_rule__MultiService__Group__55627);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2793:1: rule__MultiService__Group__5__Impl : ( 'services : ' ) ;
    public final void rule__MultiService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2797:1: ( ( 'services : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2798:1: ( 'services : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2798:1: ( 'services : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2799:1: 'services : '
            {
             before(grammarAccess.getMultiServiceAccess().getServicesKeyword_5()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MultiService__Group__5__Impl5655); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2812:1: rule__MultiService__Group__6 : rule__MultiService__Group__6__Impl rule__MultiService__Group__7 ;
    public final void rule__MultiService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2816:1: ( rule__MultiService__Group__6__Impl rule__MultiService__Group__7 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2817:2: rule__MultiService__Group__6__Impl rule__MultiService__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__6__Impl_in_rule__MultiService__Group__65686);
            rule__MultiService__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__7_in_rule__MultiService__Group__65689);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2824:1: rule__MultiService__Group__6__Impl : ( ( rule__MultiService__ServicesAssignment_6 ) ) ;
    public final void rule__MultiService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2828:1: ( ( ( rule__MultiService__ServicesAssignment_6 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2829:1: ( ( rule__MultiService__ServicesAssignment_6 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2829:1: ( ( rule__MultiService__ServicesAssignment_6 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2830:1: ( rule__MultiService__ServicesAssignment_6 )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesAssignment_6()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2831:1: ( rule__MultiService__ServicesAssignment_6 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2831:2: rule__MultiService__ServicesAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__ServicesAssignment_6_in_rule__MultiService__Group__6__Impl5716);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2841:1: rule__MultiService__Group__7 : rule__MultiService__Group__7__Impl rule__MultiService__Group__8 ;
    public final void rule__MultiService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2845:1: ( rule__MultiService__Group__7__Impl rule__MultiService__Group__8 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2846:2: rule__MultiService__Group__7__Impl rule__MultiService__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__7__Impl_in_rule__MultiService__Group__75746);
            rule__MultiService__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__8_in_rule__MultiService__Group__75749);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2853:1: rule__MultiService__Group__7__Impl : ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) ) ;
    public final void rule__MultiService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2857:1: ( ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2858:1: ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2858:1: ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2859:1: ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2859:1: ( ( rule__MultiService__Group_7__0 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2860:1: ( rule__MultiService__Group_7__0 )
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_7()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2861:1: ( rule__MultiService__Group_7__0 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2861:2: rule__MultiService__Group_7__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl5778);
            rule__MultiService__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiServiceAccess().getGroup_7()); 

            }

            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2864:1: ( ( rule__MultiService__Group_7__0 )* )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2865:1: ( rule__MultiService__Group_7__0 )*
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_7()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2866:1: ( rule__MultiService__Group_7__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2866:2: rule__MultiService__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl5790);
            	    rule__MultiService__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2877:1: rule__MultiService__Group__8 : rule__MultiService__Group__8__Impl ;
    public final void rule__MultiService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2881:1: ( rule__MultiService__Group__8__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2882:2: rule__MultiService__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__8__Impl_in_rule__MultiService__Group__85823);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2888:1: rule__MultiService__Group__8__Impl : ( '}' ) ;
    public final void rule__MultiService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2892:1: ( ( '}' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2893:1: ( '}' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2893:1: ( '}' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2894:1: '}'
            {
             before(grammarAccess.getMultiServiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MultiService__Group__8__Impl5851); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2925:1: rule__MultiService__Group_2__0 : rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1 ;
    public final void rule__MultiService__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2929:1: ( rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2930:2: rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__0__Impl_in_rule__MultiService__Group_2__05900);
            rule__MultiService__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__1_in_rule__MultiService__Group_2__05903);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2937:1: rule__MultiService__Group_2__0__Impl : ( '[' ) ;
    public final void rule__MultiService__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2941:1: ( ( '[' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2942:1: ( '[' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2942:1: ( '[' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2943:1: '['
            {
             before(grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MultiService__Group_2__0__Impl5931); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2956:1: rule__MultiService__Group_2__1 : rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2 ;
    public final void rule__MultiService__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2960:1: ( rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2961:2: rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__1__Impl_in_rule__MultiService__Group_2__15962);
            rule__MultiService__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__2_in_rule__MultiService__Group_2__15965);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2968:1: rule__MultiService__Group_2__1__Impl : ( ( rule__MultiService__ParallelAssignment_2_1 )? ) ;
    public final void rule__MultiService__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2972:1: ( ( ( rule__MultiService__ParallelAssignment_2_1 )? ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2973:1: ( ( rule__MultiService__ParallelAssignment_2_1 )? )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2973:1: ( ( rule__MultiService__ParallelAssignment_2_1 )? )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2974:1: ( rule__MultiService__ParallelAssignment_2_1 )?
            {
             before(grammarAccess.getMultiServiceAccess().getParallelAssignment_2_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2975:1: ( rule__MultiService__ParallelAssignment_2_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2975:2: rule__MultiService__ParallelAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiService__ParallelAssignment_2_1_in_rule__MultiService__Group_2__1__Impl5992);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2985:1: rule__MultiService__Group_2__2 : rule__MultiService__Group_2__2__Impl ;
    public final void rule__MultiService__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2989:1: ( rule__MultiService__Group_2__2__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2990:2: rule__MultiService__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__2__Impl_in_rule__MultiService__Group_2__26023);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2996:1: rule__MultiService__Group_2__2__Impl : ( ']' ) ;
    public final void rule__MultiService__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3000:1: ( ( ']' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3001:1: ( ']' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3001:1: ( ']' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3002:1: ']'
            {
             before(grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MultiService__Group_2__2__Impl6051); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3021:1: rule__MultiService__Group_4__0 : rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1 ;
    public final void rule__MultiService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3025:1: ( rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3026:2: rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__0__Impl_in_rule__MultiService__Group_4__06088);
            rule__MultiService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__1_in_rule__MultiService__Group_4__06091);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3033:1: rule__MultiService__Group_4__0__Impl : ( 'when : ' ) ;
    public final void rule__MultiService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3037:1: ( ( 'when : ' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3038:1: ( 'when : ' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3038:1: ( 'when : ' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3039:1: 'when : '
            {
             before(grammarAccess.getMultiServiceAccess().getWhenKeyword_4_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__MultiService__Group_4__0__Impl6119); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3052:1: rule__MultiService__Group_4__1 : rule__MultiService__Group_4__1__Impl ;
    public final void rule__MultiService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3056:1: ( rule__MultiService__Group_4__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3057:2: rule__MultiService__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__1__Impl_in_rule__MultiService__Group_4__16150);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3063:1: rule__MultiService__Group_4__1__Impl : ( ( rule__MultiService__WhenAssignment_4_1 ) ) ;
    public final void rule__MultiService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3067:1: ( ( ( rule__MultiService__WhenAssignment_4_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3068:1: ( ( rule__MultiService__WhenAssignment_4_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3068:1: ( ( rule__MultiService__WhenAssignment_4_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3069:1: ( rule__MultiService__WhenAssignment_4_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getWhenAssignment_4_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3070:1: ( rule__MultiService__WhenAssignment_4_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3070:2: rule__MultiService__WhenAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__WhenAssignment_4_1_in_rule__MultiService__Group_4__1__Impl6177);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3084:1: rule__MultiService__Group_7__0 : rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1 ;
    public final void rule__MultiService__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3088:1: ( rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3089:2: rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0__Impl_in_rule__MultiService__Group_7__06211);
            rule__MultiService__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__1_in_rule__MultiService__Group_7__06214);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3096:1: rule__MultiService__Group_7__0__Impl : ( ',' ) ;
    public final void rule__MultiService__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3100:1: ( ( ',' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3101:1: ( ',' )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3101:1: ( ',' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3102:1: ','
            {
             before(grammarAccess.getMultiServiceAccess().getCommaKeyword_7_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MultiService__Group_7__0__Impl6242); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3115:1: rule__MultiService__Group_7__1 : rule__MultiService__Group_7__1__Impl ;
    public final void rule__MultiService__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3119:1: ( rule__MultiService__Group_7__1__Impl )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3120:2: rule__MultiService__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__1__Impl_in_rule__MultiService__Group_7__16273);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3126:1: rule__MultiService__Group_7__1__Impl : ( ( rule__MultiService__ServicesAssignment_7_1 ) ) ;
    public final void rule__MultiService__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3130:1: ( ( ( rule__MultiService__ServicesAssignment_7_1 ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3131:1: ( ( rule__MultiService__ServicesAssignment_7_1 ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3131:1: ( ( rule__MultiService__ServicesAssignment_7_1 ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3132:1: ( rule__MultiService__ServicesAssignment_7_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesAssignment_7_1()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3133:1: ( rule__MultiService__ServicesAssignment_7_1 )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3133:2: rule__MultiService__ServicesAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__ServicesAssignment_7_1_in_rule__MultiService__Group_7__1__Impl6300);
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


    // $ANTLR start "rule__Root__ArtifactsAssignment_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3148:1: rule__Root__ArtifactsAssignment_0 : ( ruleArtifact ) ;
    public final void rule__Root__ArtifactsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3152:1: ( ( ruleArtifact ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3153:1: ( ruleArtifact )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3153:1: ( ruleArtifact )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3154:1: ruleArtifact
            {
             before(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_06339);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3163:1: rule__Root__ArtifactsAssignment_1_0 : ( ruleArtifact ) ;
    public final void rule__Root__ArtifactsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3167:1: ( ( ruleArtifact ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3168:1: ( ruleArtifact )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3168:1: ( ruleArtifact )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3169:1: ruleArtifact
            {
             before(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_1_06370);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3178:1: rule__Root__EntitiesAssignment_1_1 : ( ruleEntity ) ;
    public final void rule__Root__EntitiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3182:1: ( ( ruleEntity ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3183:1: ( ruleEntity )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3183:1: ( ruleEntity )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3184:1: ruleEntity
            {
             before(grammarAccess.getRootAccess().getEntitiesEntityParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Root__EntitiesAssignment_1_16401);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3193:1: rule__Root__ServicesAssignment_1_2 : ( ruleService ) ;
    public final void rule__Root__ServicesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3197:1: ( ( ruleService ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3198:1: ( ruleService )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3198:1: ( ruleService )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3199:1: ruleService
            {
             before(grammarAccess.getRootAccess().getServicesServiceParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_rule__Root__ServicesAssignment_1_26432);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3208:1: rule__Artifact__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Artifact__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3212:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3213:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3213:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3214:1: ruleEString
            {
             before(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Artifact__NameAssignment_16463);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3223:1: rule__Artifact__ExtensionAssignment_2_1_2 : ( ruleEString ) ;
    public final void rule__Artifact__ExtensionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3227:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3228:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3228:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3229:1: ruleEString
            {
             before(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Artifact__ExtensionAssignment_2_1_26494);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3238:1: rule__Artifact__FormatAssignment_2_2_1 : ( ruleFormatEnum ) ;
    public final void rule__Artifact__FormatAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3242:1: ( ( ruleFormatEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3243:1: ( ruleFormatEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3243:1: ( ruleFormatEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3244:1: ruleFormatEnum
            {
             before(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_2_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFormatEnum_in_rule__Artifact__FormatAssignment_2_2_16525);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3253:1: rule__Artifact__BasicServicesAssignment_2_3_1 : ( ruleServiceEnum ) ;
    public final void rule__Artifact__BasicServicesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3257:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3258:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3258:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3259:1: ruleServiceEnum
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_16556);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3268:1: rule__Artifact__BasicServicesAssignment_2_3_2_1 : ( ruleServiceEnum ) ;
    public final void rule__Artifact__BasicServicesAssignment_2_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3272:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3273:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3273:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3274:1: ruleServiceEnum
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_2_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_2_16587);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3283:1: rule__Artifact__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Artifact__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3287:1: ( ( ruleAttribute ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3288:1: ( ruleAttribute )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3288:1: ( ruleAttribute )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3289:1: ruleAttribute
            {
             before(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Artifact__AttributesAssignment_46618);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3298:1: rule__Entity__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3302:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3303:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3303:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3304:1: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Entity__NameAssignment_16649);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3313:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3317:1: ( ( ruleAttribute ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3318:1: ( ruleAttribute )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3318:1: ( ruleAttribute )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3319:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_36680);
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


    // $ANTLR start "rule__SimpleAttribute__ManyAssignment_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3328:1: rule__SimpleAttribute__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__SimpleAttribute__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3332:1: ( ( ( 'many' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3333:1: ( ( 'many' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3333:1: ( ( 'many' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3334:1: ( 'many' )
            {
             before(grammarAccess.getSimpleAttributeAccess().getManyManyKeyword_0_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3335:1: ( 'many' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3336:1: 'many'
            {
             before(grammarAccess.getSimpleAttributeAccess().getManyManyKeyword_0_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__SimpleAttribute__ManyAssignment_06716); 
             after(grammarAccess.getSimpleAttributeAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getSimpleAttributeAccess().getManyManyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__ManyAssignment_0"


    // $ANTLR start "rule__SimpleAttribute__RequiredAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3351:1: rule__SimpleAttribute__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__SimpleAttribute__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3355:1: ( ( ( 'required' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3356:1: ( ( 'required' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3356:1: ( ( 'required' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3357:1: ( 'required' )
            {
             before(grammarAccess.getSimpleAttributeAccess().getRequiredRequiredKeyword_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3358:1: ( 'required' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3359:1: 'required'
            {
             before(grammarAccess.getSimpleAttributeAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__SimpleAttribute__RequiredAssignment_16760); 
             after(grammarAccess.getSimpleAttributeAccess().getRequiredRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getSimpleAttributeAccess().getRequiredRequiredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__RequiredAssignment_1"


    // $ANTLR start "rule__SimpleAttribute__NameAssignment_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3374:1: rule__SimpleAttribute__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimpleAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3378:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3379:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3379:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3380:1: ruleEString
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleAttribute__NameAssignment_26799);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__NameAssignment_2"


    // $ANTLR start "rule__SimpleAttribute__DataAssignment_4"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3389:1: rule__SimpleAttribute__DataAssignment_4 : ( ruleDataEnum ) ;
    public final void rule__SimpleAttribute__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3393:1: ( ( ruleDataEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3394:1: ( ruleDataEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3394:1: ( ruleDataEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3395:1: ruleDataEnum
            {
             before(grammarAccess.getSimpleAttributeAccess().getDataDataEnumEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataEnum_in_rule__SimpleAttribute__DataAssignment_46830);
            ruleDataEnum();

            state._fsp--;

             after(grammarAccess.getSimpleAttributeAccess().getDataDataEnumEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAttribute__DataAssignment_4"


    // $ANTLR start "rule__MultiAttribute__NameAssignment_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3404:1: rule__MultiAttribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__MultiAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3408:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3409:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3409:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3410:1: ruleEString
            {
             before(grammarAccess.getMultiAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiAttribute__NameAssignment_06861);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiAttributeAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAttribute__NameAssignment_0"


    // $ANTLR start "rule__MultiAttribute__TypeAssignment_2"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3419:1: rule__MultiAttribute__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__MultiAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3423:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3424:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3424:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3425:1: ( ruleEString )
            {
             before(grammarAccess.getMultiAttributeAccess().getTypeEntityCrossReference_2_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3426:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3427:1: ruleEString
            {
             before(grammarAccess.getMultiAttributeAccess().getTypeEntityEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiAttribute__TypeAssignment_26896);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiAttributeAccess().getTypeEntityEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMultiAttributeAccess().getTypeEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiAttribute__TypeAssignment_2"


    // $ANTLR start "rule__OnService__ArtifactAssignment_0"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3438:1: rule__OnService__ArtifactAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__OnService__ArtifactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3442:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3443:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3443:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3444:1: ( ruleEString )
            {
             before(grammarAccess.getOnServiceAccess().getArtifactArtifactCrossReference_0_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3445:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3446:1: ruleEString
            {
             before(grammarAccess.getOnServiceAccess().getArtifactArtifactEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnService__ArtifactAssignment_06935);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3457:1: rule__OnService__WhenServicesAssignment_2 : ( ruleServiceEnum ) ;
    public final void rule__OnService__WhenServicesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3461:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3462:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3462:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3463:1: ruleServiceEnum
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_26970);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3472:1: rule__OnService__WhenServicesAssignment_3_1 : ( ruleServiceEnum ) ;
    public final void rule__OnService__WhenServicesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3476:1: ( ( ruleServiceEnum ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3477:1: ( ruleServiceEnum )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3477:1: ( ruleServiceEnum )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3478:1: ruleServiceEnum
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_3_17001);
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


    // $ANTLR start "rule__SimpleService__NameAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3487:1: rule__SimpleService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3491:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3492:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3492:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3493:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__NameAssignment_17032);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__NameAssignment_1"


    // $ANTLR start "rule__SimpleService__InputAssignment_3_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3502:1: rule__SimpleService__InputAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SimpleService__InputAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3506:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3507:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3507:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3508:1: ( ruleEString )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3509:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3510:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__InputAssignment_3_17067);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__InputAssignment_3_1"


    // $ANTLR start "rule__SimpleService__InputAssignment_3_2_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3521:1: rule__SimpleService__InputAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__SimpleService__InputAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3525:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3526:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3526:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3527:1: ( ruleEString )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_2_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3528:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3529:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__InputAssignment_3_2_17106);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__InputAssignment_3_2_1"


    // $ANTLR start "rule__SimpleService__OutputAssignment_4_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3540:1: rule__SimpleService__OutputAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__SimpleService__OutputAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3544:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3545:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3545:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3546:1: ( ruleEString )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3547:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3548:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__OutputAssignment_4_17145);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__OutputAssignment_4_1"


    // $ANTLR start "rule__SimpleService__OutputAssignment_4_2_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3559:1: rule__SimpleService__OutputAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__SimpleService__OutputAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3563:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3564:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3564:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3565:1: ( ruleEString )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_2_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3566:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3567:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__OutputAssignment_4_2_17184);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__OutputAssignment_4_2_1"


    // $ANTLR start "rule__SimpleService__WhenAssignment_5_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3578:1: rule__SimpleService__WhenAssignment_5_1 : ( ruleOnService ) ;
    public final void rule__SimpleService__WhenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3582:1: ( ( ruleOnService ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3583:1: ( ruleOnService )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3583:1: ( ruleOnService )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3584:1: ruleOnService
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_rule__SimpleService__WhenAssignment_5_17219);
            ruleOnService();

            state._fsp--;

             after(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleService__WhenAssignment_5_1"


    // $ANTLR start "rule__MultiService__NameAssignment_1"
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3593:1: rule__MultiService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MultiService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3597:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3598:1: ( ruleEString )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3598:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3599:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__NameAssignment_17250);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3608:1: rule__MultiService__ParallelAssignment_2_1 : ( ( 'parallel' ) ) ;
    public final void rule__MultiService__ParallelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3612:1: ( ( ( 'parallel' ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3613:1: ( ( 'parallel' ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3613:1: ( ( 'parallel' ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3614:1: ( 'parallel' )
            {
             before(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3615:1: ( 'parallel' )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3616:1: 'parallel'
            {
             before(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__MultiService__ParallelAssignment_2_17286); 
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3631:1: rule__MultiService__WhenAssignment_4_1 : ( ruleOnService ) ;
    public final void rule__MultiService__WhenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3635:1: ( ( ruleOnService ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3636:1: ( ruleOnService )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3636:1: ( ruleOnService )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3637:1: ruleOnService
            {
             before(grammarAccess.getMultiServiceAccess().getWhenOnServiceParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_rule__MultiService__WhenAssignment_4_17325);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3646:1: rule__MultiService__ServicesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__MultiService__ServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3650:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3651:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3651:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3652:1: ( ruleEString )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_6_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3653:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3654:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_67360);
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
    // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3665:1: rule__MultiService__ServicesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__MultiService__ServicesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3669:1: ( ( ( ruleEString ) ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3670:1: ( ( ruleEString ) )
            {
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3670:1: ( ( ruleEString ) )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3671:1: ( ruleEString )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_7_1_0()); 
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3672:1: ( ruleEString )
            // ../miso.distil.codeGenerator.ui/src-gen/miso/distil/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3673:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_7_17399);
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0_in_ruleRoot94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_entryRuleService183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleService190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Service__Alternatives_in_ruleService216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArtifact312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__0_in_ruleArtifact338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity365 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAttribute_in_entryRuleSimpleAttribute425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleAttribute432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__0_in_ruleSimpleAttribute458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiAttribute_in_entryRuleMultiAttribute485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiAttribute492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__0_in_ruleMultiAttribute518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_entryRuleOnService545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOnService552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__0_in_ruleOnService578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_entryRuleSimpleService605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleService612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__0_in_ruleSimpleService638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_entryRuleMultiService665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiService672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__0_in_ruleMultiService698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FormatEnum__Alternatives_in_ruleFormatEnum735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceEnum__Alternatives_in_ruleServiceEnum771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataEnum__Alternatives_in_ruleDataEnum807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ArtifactsAssignment_1_0_in_rule__Root__Alternatives_1842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__EntitiesAssignment_1_1_in_rule__Root__Alternatives_1860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ServicesAssignment_1_2_in_rule__Root__Alternatives_1878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleService_in_rule__Service__Alternatives961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiService_in_rule__Service__Alternatives978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleAttribute_in_rule__Attribute__Alternatives1010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiAttribute_in_rule__Attribute__Alternatives1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__FormatEnum__Alternatives1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FormatEnum__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FormatEnum__Alternatives1103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FormatEnum__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FormatEnum__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__FormatEnum__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__FormatEnum__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ServiceEnum__Alternatives1223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ServiceEnum__Alternatives1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ServiceEnum__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ServiceEnum__Alternatives1286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ServiceEnum__Alternatives1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ServiceEnum__Alternatives1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__DataEnum__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__DataEnum__Alternatives1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__DataEnum__Alternatives1406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__DataEnum__Alternatives1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__0__Impl_in_rule__Root__Group__01460 = new BitSet(new long[]{0x0000114010000000L});
        public static final BitSet FOLLOW_rule__Root__Group__1_in_rule__Root__Group__01463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__ArtifactsAssignment_0_in_rule__Root__Group__0__Impl1490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Group__1__Impl_in_rule__Root__Group__11520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Root__Alternatives_1_in_rule__Root__Group__1__Impl1547 = new BitSet(new long[]{0x0000114010000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__0__Impl_in_rule__Artifact__Group__01582 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__1_in_rule__Artifact__Group__01585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Artifact__Group__0__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__1__Impl_in_rule__Artifact__Group__11644 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group__2_in_rule__Artifact__Group__11647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__NameAssignment_1_in_rule__Artifact__Group__1__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__2__Impl_in_rule__Artifact__Group__21704 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group__3_in_rule__Artifact__Group__21707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__0_in_rule__Artifact__Group__2__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__3__Impl_in_rule__Artifact__Group__31765 = new BitSet(new long[]{0x0000600040000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__4_in_rule__Artifact__Group__31768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Artifact__Group__3__Impl1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__4__Impl_in_rule__Artifact__Group__41827 = new BitSet(new long[]{0x0000600040000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__5_in_rule__Artifact__Group__41830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__AttributesAssignment_4_in_rule__Artifact__Group__4__Impl1857 = new BitSet(new long[]{0x0000600000000032L});
        public static final BitSet FOLLOW_rule__Artifact__Group__5__Impl_in_rule__Artifact__Group__51888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Artifact__Group__5__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__0__Impl_in_rule__Artifact__Group_2__01959 = new BitSet(new long[]{0x0000001B00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__1_in_rule__Artifact__Group_2__01962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Artifact__Group_2__0__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__1__Impl_in_rule__Artifact__Group_2__12021 = new BitSet(new long[]{0x0000001B00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__2_in_rule__Artifact__Group_2__12024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__0_in_rule__Artifact__Group_2__1__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__2__Impl_in_rule__Artifact__Group_2__22082 = new BitSet(new long[]{0x0000001B00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__3_in_rule__Artifact__Group_2__22085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__0_in_rule__Artifact__Group_2__2__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__3__Impl_in_rule__Artifact__Group_2__32143 = new BitSet(new long[]{0x0000001B00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__4_in_rule__Artifact__Group_2__32146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__0_in_rule__Artifact__Group_2__3__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2__4__Impl_in_rule__Artifact__Group_2__42204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Artifact__Group_2__4__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__0__Impl_in_rule__Artifact__Group_2_1__02273 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__1_in_rule__Artifact__Group_2_1__02276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Artifact__Group_2_1__0__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__1__Impl_in_rule__Artifact__Group_2_1__12335 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__2_in_rule__Artifact__Group_2_1__12338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Artifact__Group_2_1__1__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_1__2__Impl_in_rule__Artifact__Group_2_1__22397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__ExtensionAssignment_2_1_2_in_rule__Artifact__Group_2_1__2__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__0__Impl_in_rule__Artifact__Group_2_2__02460 = new BitSet(new long[]{0x000000000003F800L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__1_in_rule__Artifact__Group_2_2__02463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Artifact__Group_2_2__0__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_2__1__Impl_in_rule__Artifact__Group_2_2__12522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__FormatAssignment_2_2_1_in_rule__Artifact__Group_2_2__1__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__0__Impl_in_rule__Artifact__Group_2_3__02583 = new BitSet(new long[]{0x0000000000FC0000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__1_in_rule__Artifact__Group_2_3__02586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Artifact__Group_2_3__0__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__1__Impl_in_rule__Artifact__Group_2_3__12645 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__2_in_rule__Artifact__Group_2_3__12648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_1_in_rule__Artifact__Group_2_3__1__Impl2675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3__2__Impl_in_rule__Artifact__Group_2_3__22705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__0_in_rule__Artifact__Group_2_3__2__Impl2732 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__0__Impl_in_rule__Artifact__Group_2_3_2__02769 = new BitSet(new long[]{0x0000000000FC0000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__1_in_rule__Artifact__Group_2_3_2__02772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Artifact__Group_2_3_2__0__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_2_3_2__1__Impl_in_rule__Artifact__Group_2_3_2__12831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__BasicServicesAssignment_2_3_2_1_in_rule__Artifact__Group_2_3_2__1__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02892 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Entity__Group__0__Impl2923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12954 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23014 = new BitSet(new long[]{0x0000600040000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Entity__Group__2__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33076 = new BitSet(new long[]{0x0000600040000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl3106 = new BitSet(new long[]{0x0000600000000032L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Entity__Group__4__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__03206 = new BitSet(new long[]{0x0000600000000030L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__03209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__ManyAssignment_0_in_rule__SimpleAttribute__Group__0__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__13267 = new BitSet(new long[]{0x0000600000000030L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__2_in_rule__SimpleAttribute__Group__13270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__RequiredAssignment_1_in_rule__SimpleAttribute__Group__1__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__2__Impl_in_rule__SimpleAttribute__Group__23328 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__3_in_rule__SimpleAttribute__Group__23331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__NameAssignment_2_in_rule__SimpleAttribute__Group__2__Impl3358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__3__Impl_in_rule__SimpleAttribute__Group__33388 = new BitSet(new long[]{0x000000000F000000L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__4_in_rule__SimpleAttribute__Group__33391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__SimpleAttribute__Group__3__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__4__Impl_in_rule__SimpleAttribute__Group__43450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__DataAssignment_4_in_rule__SimpleAttribute__Group__4__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__0__Impl_in_rule__MultiAttribute__Group__03517 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__1_in_rule__MultiAttribute__Group__03520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__NameAssignment_0_in_rule__MultiAttribute__Group__0__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__1__Impl_in_rule__MultiAttribute__Group__13577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__2_in_rule__MultiAttribute__Group__13580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__MultiAttribute__Group__1__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__2__Impl_in_rule__MultiAttribute__Group__23639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__TypeAssignment_2_in_rule__MultiAttribute__Group__2__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__0__Impl_in_rule__OnService__Group__03702 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__1_in_rule__OnService__Group__03705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__ArtifactAssignment_0_in_rule__OnService__Group__0__Impl3732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__1__Impl_in_rule__OnService__Group__13762 = new BitSet(new long[]{0x0000000000FC0000L});
        public static final BitSet FOLLOW_rule__OnService__Group__2_in_rule__OnService__Group__13765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__OnService__Group__1__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__2__Impl_in_rule__OnService__Group__23824 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__3_in_rule__OnService__Group__23827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__WhenServicesAssignment_2_in_rule__OnService__Group__2__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__3__Impl_in_rule__OnService__Group__33884 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__4_in_rule__OnService__Group__33887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__0_in_rule__OnService__Group__3__Impl3914 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__4__Impl_in_rule__OnService__Group__43945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__OnService__Group__4__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__0__Impl_in_rule__OnService__Group_3__04014 = new BitSet(new long[]{0x0000000000FC0000L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__1_in_rule__OnService__Group_3__04017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__OnService__Group_3__0__Impl4045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__1__Impl_in_rule__OnService__Group_3__14076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__WhenServicesAssignment_3_1_in_rule__OnService__Group_3__1__Impl4103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__0__Impl_in_rule__SimpleService__Group__04137 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__1_in_rule__SimpleService__Group__04140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__SimpleService__Group__0__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__1__Impl_in_rule__SimpleService__Group__14199 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__2_in_rule__SimpleService__Group__14202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__NameAssignment_1_in_rule__SimpleService__Group__1__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__2__Impl_in_rule__SimpleService__Group__24259 = new BitSet(new long[]{0x00000E0040000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__3_in_rule__SimpleService__Group__24262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SimpleService__Group__2__Impl4290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__3__Impl_in_rule__SimpleService__Group__34321 = new BitSet(new long[]{0x00000E0040000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__4_in_rule__SimpleService__Group__34324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__0_in_rule__SimpleService__Group__3__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__4__Impl_in_rule__SimpleService__Group__44382 = new BitSet(new long[]{0x00000E0040000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__5_in_rule__SimpleService__Group__44385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__0_in_rule__SimpleService__Group__4__Impl4412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__5__Impl_in_rule__SimpleService__Group__54443 = new BitSet(new long[]{0x00000E0040000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__6_in_rule__SimpleService__Group__54446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__0_in_rule__SimpleService__Group__5__Impl4473 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__6__Impl_in_rule__SimpleService__Group__64504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SimpleService__Group__6__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__0__Impl_in_rule__SimpleService__Group_3__04577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__1_in_rule__SimpleService__Group_3__04580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__SimpleService__Group_3__0__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__1__Impl_in_rule__SimpleService__Group_3__14639 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__2_in_rule__SimpleService__Group_3__14642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__InputAssignment_3_1_in_rule__SimpleService__Group_3__1__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__2__Impl_in_rule__SimpleService__Group_3__24699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3_2__0_in_rule__SimpleService__Group_3__2__Impl4726 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3_2__0__Impl_in_rule__SimpleService__Group_3_2__04763 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3_2__1_in_rule__SimpleService__Group_3_2__04766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SimpleService__Group_3_2__0__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3_2__1__Impl_in_rule__SimpleService__Group_3_2__14825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__InputAssignment_3_2_1_in_rule__SimpleService__Group_3_2__1__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__0__Impl_in_rule__SimpleService__Group_4__04886 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__1_in_rule__SimpleService__Group_4__04889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__SimpleService__Group_4__0__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__1__Impl_in_rule__SimpleService__Group_4__14948 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__2_in_rule__SimpleService__Group_4__14951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__OutputAssignment_4_1_in_rule__SimpleService__Group_4__1__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__2__Impl_in_rule__SimpleService__Group_4__25008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__0_in_rule__SimpleService__Group_4__2__Impl5035 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__0__Impl_in_rule__SimpleService__Group_4_2__05072 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__1_in_rule__SimpleService__Group_4_2__05075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SimpleService__Group_4_2__0__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__1__Impl_in_rule__SimpleService__Group_4_2__15134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__OutputAssignment_4_2_1_in_rule__SimpleService__Group_4_2__1__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__0__Impl_in_rule__SimpleService__Group_5__05195 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__1_in_rule__SimpleService__Group_5__05198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__SimpleService__Group_5__0__Impl5226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__1__Impl_in_rule__SimpleService__Group_5__15257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__WhenAssignment_5_1_in_rule__SimpleService__Group_5__1__Impl5284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__0__Impl_in_rule__MultiService__Group__05318 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group__1_in_rule__MultiService__Group__05321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__MultiService__Group__0__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__1__Impl_in_rule__MultiService__Group__15380 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__2_in_rule__MultiService__Group__15383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__NameAssignment_1_in_rule__MultiService__Group__1__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__2__Impl_in_rule__MultiService__Group__25440 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__3_in_rule__MultiService__Group__25443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__0_in_rule__MultiService__Group__2__Impl5470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__3__Impl_in_rule__MultiService__Group__35501 = new BitSet(new long[]{0x0000081000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__4_in_rule__MultiService__Group__35504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MultiService__Group__3__Impl5532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__4__Impl_in_rule__MultiService__Group__45563 = new BitSet(new long[]{0x0000081000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__5_in_rule__MultiService__Group__45566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__0_in_rule__MultiService__Group__4__Impl5593 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__5__Impl_in_rule__MultiService__Group__55624 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group__6_in_rule__MultiService__Group__55627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MultiService__Group__5__Impl5655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__6__Impl_in_rule__MultiService__Group__65686 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__7_in_rule__MultiService__Group__65689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ServicesAssignment_6_in_rule__MultiService__Group__6__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__7__Impl_in_rule__MultiService__Group__75746 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__8_in_rule__MultiService__Group__75749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl5778 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl5790 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__8__Impl_in_rule__MultiService__Group__85823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MultiService__Group__8__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__0__Impl_in_rule__MultiService__Group_2__05900 = new BitSet(new long[]{0x0000800100000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__1_in_rule__MultiService__Group_2__05903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MultiService__Group_2__0__Impl5931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__1__Impl_in_rule__MultiService__Group_2__15962 = new BitSet(new long[]{0x0000800100000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__2_in_rule__MultiService__Group_2__15965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ParallelAssignment_2_1_in_rule__MultiService__Group_2__1__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__2__Impl_in_rule__MultiService__Group_2__26023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MultiService__Group_2__2__Impl6051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__0__Impl_in_rule__MultiService__Group_4__06088 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__1_in_rule__MultiService__Group_4__06091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__MultiService__Group_4__0__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__1__Impl_in_rule__MultiService__Group_4__16150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__WhenAssignment_4_1_in_rule__MultiService__Group_4__1__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0__Impl_in_rule__MultiService__Group_7__06211 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__1_in_rule__MultiService__Group_7__06214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MultiService__Group_7__0__Impl6242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__1__Impl_in_rule__MultiService__Group_7__16273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ServicesAssignment_7_1_in_rule__MultiService__Group_7__1__Impl6300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_06339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_1_06370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Root__EntitiesAssignment_1_16401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_rule__Root__ServicesAssignment_1_26432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Artifact__NameAssignment_16463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Artifact__ExtensionAssignment_2_1_26494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormatEnum_in_rule__Artifact__FormatAssignment_2_2_16525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_16556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_2_3_2_16587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Artifact__AttributesAssignment_46618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Entity__NameAssignment_16649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_36680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__SimpleAttribute__ManyAssignment_06716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__SimpleAttribute__RequiredAssignment_16760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleAttribute__NameAssignment_26799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataEnum_in_rule__SimpleAttribute__DataAssignment_46830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiAttribute__NameAssignment_06861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiAttribute__TypeAssignment_26896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnService__ArtifactAssignment_06935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_26970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_3_17001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__NameAssignment_17032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__InputAssignment_3_17067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__InputAssignment_3_2_17106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__OutputAssignment_4_17145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__OutputAssignment_4_2_17184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_rule__SimpleService__WhenAssignment_5_17219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__NameAssignment_17250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__MultiService__ParallelAssignment_2_17286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_rule__MultiService__WhenAssignment_4_17325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_67360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_7_17399 = new BitSet(new long[]{0x0000000000000002L});
    }


}