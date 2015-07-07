package miso.carrascal.codeGenerator.ui.contentassist.antlr.internal; 

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
import miso.carrascal.codeGenerator.services.RulesGrammarAccess;



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
    public String getGrammarFileName() { return "../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g"; }


     
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:61:1: ( ruleRoot EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:62:1: ruleRoot EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:69:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:73:2: ( ( ( rule__Root__Group__0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:74:1: ( ( rule__Root__Group__0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:74:1: ( ( rule__Root__Group__0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:75:1: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:76:1: ( rule__Root__Group__0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:76:2: rule__Root__Group__0
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:89:1: ( ruleEString EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:90:1: ruleEString EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:104:1: ( rule__EString__Alternatives )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:104:2: rule__EString__Alternatives
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:118:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:119:1: ( ruleService EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:120:1: ruleService EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:127:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:131:2: ( ( ( rule__Service__Alternatives ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:132:1: ( ( rule__Service__Alternatives ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:132:1: ( ( rule__Service__Alternatives ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:133:1: ( rule__Service__Alternatives )
            {
             before(grammarAccess.getServiceAccess().getAlternatives()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:134:1: ( rule__Service__Alternatives )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:134:2: rule__Service__Alternatives
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:146:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:147:1: ( ruleAttribute EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:148:1: ruleAttribute EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:155:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:159:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:160:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:160:1: ( ( rule__Attribute__Alternatives ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:161:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:162:1: ( rule__Attribute__Alternatives )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:162:2: rule__Attribute__Alternatives
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:176:1: entryRuleArtifact : ruleArtifact EOF ;
    public final void entryRuleArtifact() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:177:1: ( ruleArtifact EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:178:1: ruleArtifact EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:185:1: ruleArtifact : ( ( rule__Artifact__Group__0 ) ) ;
    public final void ruleArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:189:2: ( ( ( rule__Artifact__Group__0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:190:1: ( ( rule__Artifact__Group__0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:190:1: ( ( rule__Artifact__Group__0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:191:1: ( rule__Artifact__Group__0 )
            {
             before(grammarAccess.getArtifactAccess().getGroup()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:192:1: ( rule__Artifact__Group__0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:192:2: rule__Artifact__Group__0
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:204:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:205:1: ( ruleEntity EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:206:1: ruleEntity EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:213:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:217:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:218:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:218:1: ( ( rule__Entity__Group__0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:219:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:220:1: ( rule__Entity__Group__0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:220:2: rule__Entity__Group__0
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:232:1: entryRuleSimpleAttribute : ruleSimpleAttribute EOF ;
    public final void entryRuleSimpleAttribute() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:233:1: ( ruleSimpleAttribute EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:234:1: ruleSimpleAttribute EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:241:1: ruleSimpleAttribute : ( ( rule__SimpleAttribute__Group__0 ) ) ;
    public final void ruleSimpleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:245:2: ( ( ( rule__SimpleAttribute__Group__0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:246:1: ( ( rule__SimpleAttribute__Group__0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:246:1: ( ( rule__SimpleAttribute__Group__0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:247:1: ( rule__SimpleAttribute__Group__0 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getGroup()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:248:1: ( rule__SimpleAttribute__Group__0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:248:2: rule__SimpleAttribute__Group__0
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:260:1: entryRuleMultiAttribute : ruleMultiAttribute EOF ;
    public final void entryRuleMultiAttribute() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:261:1: ( ruleMultiAttribute EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:262:1: ruleMultiAttribute EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:269:1: ruleMultiAttribute : ( ( rule__MultiAttribute__Group__0 ) ) ;
    public final void ruleMultiAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:273:2: ( ( ( rule__MultiAttribute__Group__0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:274:1: ( ( rule__MultiAttribute__Group__0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:274:1: ( ( rule__MultiAttribute__Group__0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:275:1: ( rule__MultiAttribute__Group__0 )
            {
             before(grammarAccess.getMultiAttributeAccess().getGroup()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:276:1: ( rule__MultiAttribute__Group__0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:276:2: rule__MultiAttribute__Group__0
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:288:1: entryRuleOnService : ruleOnService EOF ;
    public final void entryRuleOnService() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:289:1: ( ruleOnService EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:290:1: ruleOnService EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:297:1: ruleOnService : ( ( rule__OnService__Group__0 ) ) ;
    public final void ruleOnService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:301:2: ( ( ( rule__OnService__Group__0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:302:1: ( ( rule__OnService__Group__0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:302:1: ( ( rule__OnService__Group__0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:303:1: ( rule__OnService__Group__0 )
            {
             before(grammarAccess.getOnServiceAccess().getGroup()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:304:1: ( rule__OnService__Group__0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:304:2: rule__OnService__Group__0
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:316:1: entryRuleSimpleService : ruleSimpleService EOF ;
    public final void entryRuleSimpleService() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:317:1: ( ruleSimpleService EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:318:1: ruleSimpleService EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:325:1: ruleSimpleService : ( ( rule__SimpleService__Group__0 ) ) ;
    public final void ruleSimpleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:329:2: ( ( ( rule__SimpleService__Group__0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:330:1: ( ( rule__SimpleService__Group__0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:330:1: ( ( rule__SimpleService__Group__0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:331:1: ( rule__SimpleService__Group__0 )
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:332:1: ( rule__SimpleService__Group__0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:332:2: rule__SimpleService__Group__0
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:344:1: entryRuleMultiService : ruleMultiService EOF ;
    public final void entryRuleMultiService() throws RecognitionException {
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:345:1: ( ruleMultiService EOF )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:346:1: ruleMultiService EOF
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:353:1: ruleMultiService : ( ( rule__MultiService__Group__0 ) ) ;
    public final void ruleMultiService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:357:2: ( ( ( rule__MultiService__Group__0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:358:1: ( ( rule__MultiService__Group__0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:358:1: ( ( rule__MultiService__Group__0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:359:1: ( rule__MultiService__Group__0 )
            {
             before(grammarAccess.getMultiServiceAccess().getGroup()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:360:1: ( rule__MultiService__Group__0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:360:2: rule__MultiService__Group__0
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:373:1: ruleFormatEnum : ( ( rule__FormatEnum__Alternatives ) ) ;
    public final void ruleFormatEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:377:1: ( ( ( rule__FormatEnum__Alternatives ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:378:1: ( ( rule__FormatEnum__Alternatives ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:378:1: ( ( rule__FormatEnum__Alternatives ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:379:1: ( rule__FormatEnum__Alternatives )
            {
             before(grammarAccess.getFormatEnumAccess().getAlternatives()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:380:1: ( rule__FormatEnum__Alternatives )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:380:2: rule__FormatEnum__Alternatives
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:392:1: ruleServiceEnum : ( ( rule__ServiceEnum__Alternatives ) ) ;
    public final void ruleServiceEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:396:1: ( ( ( rule__ServiceEnum__Alternatives ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:397:1: ( ( rule__ServiceEnum__Alternatives ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:397:1: ( ( rule__ServiceEnum__Alternatives ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:398:1: ( rule__ServiceEnum__Alternatives )
            {
             before(grammarAccess.getServiceEnumAccess().getAlternatives()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:399:1: ( rule__ServiceEnum__Alternatives )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:399:2: rule__ServiceEnum__Alternatives
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:411:1: ruleDataEnum : ( ( rule__DataEnum__Alternatives ) ) ;
    public final void ruleDataEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:415:1: ( ( ( rule__DataEnum__Alternatives ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:416:1: ( ( rule__DataEnum__Alternatives ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:416:1: ( ( rule__DataEnum__Alternatives ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:417:1: ( rule__DataEnum__Alternatives )
            {
             before(grammarAccess.getDataEnumAccess().getAlternatives()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:418:1: ( rule__DataEnum__Alternatives )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:418:2: rule__DataEnum__Alternatives
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:429:1: rule__Root__Alternatives_1 : ( ( ( rule__Root__ArtifactsAssignment_1_0 ) ) | ( ( rule__Root__EntitiesAssignment_1_1 ) ) | ( ( rule__Root__ServicesAssignment_1_2 ) ) );
    public final void rule__Root__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:433:1: ( ( ( rule__Root__ArtifactsAssignment_1_0 ) ) | ( ( rule__Root__EntitiesAssignment_1_1 ) ) | ( ( rule__Root__ServicesAssignment_1_2 ) ) )
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:434:1: ( ( rule__Root__ArtifactsAssignment_1_0 ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:434:1: ( ( rule__Root__ArtifactsAssignment_1_0 ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:435:1: ( rule__Root__ArtifactsAssignment_1_0 )
                    {
                     before(grammarAccess.getRootAccess().getArtifactsAssignment_1_0()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:436:1: ( rule__Root__ArtifactsAssignment_1_0 )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:436:2: rule__Root__ArtifactsAssignment_1_0
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:440:6: ( ( rule__Root__EntitiesAssignment_1_1 ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:440:6: ( ( rule__Root__EntitiesAssignment_1_1 ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:441:1: ( rule__Root__EntitiesAssignment_1_1 )
                    {
                     before(grammarAccess.getRootAccess().getEntitiesAssignment_1_1()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:442:1: ( rule__Root__EntitiesAssignment_1_1 )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:442:2: rule__Root__EntitiesAssignment_1_1
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:446:6: ( ( rule__Root__ServicesAssignment_1_2 ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:446:6: ( ( rule__Root__ServicesAssignment_1_2 ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:447:1: ( rule__Root__ServicesAssignment_1_2 )
                    {
                     before(grammarAccess.getRootAccess().getServicesAssignment_1_2()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:448:1: ( rule__Root__ServicesAssignment_1_2 )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:448:2: rule__Root__ServicesAssignment_1_2
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:457:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:461:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:462:1: ( RULE_STRING )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:462:1: ( RULE_STRING )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:463:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives911); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:468:6: ( RULE_ID )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:468:6: ( RULE_ID )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:469:1: RULE_ID
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:480:1: rule__Service__Alternatives : ( ( ruleSimpleService ) | ( ruleMultiService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:484:1: ( ( ruleSimpleService ) | ( ruleMultiService ) )
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:485:1: ( ruleSimpleService )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:485:1: ( ruleSimpleService )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:486:1: ruleSimpleService
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:491:6: ( ruleMultiService )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:491:6: ( ruleMultiService )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:492:1: ruleMultiService
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:502:1: rule__Attribute__Alternatives : ( ( ruleSimpleAttribute ) | ( ruleMultiAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:506:1: ( ( ruleSimpleAttribute ) | ( ruleMultiAttribute ) )
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

                    if ( ((LA4_4>=24 && LA4_4<=27)) ) {
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

                if ( (LA4_3==39) ) {
                    int LA4_4 = input.LA(3);

                    if ( ((LA4_4>=24 && LA4_4<=27)) ) {
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:507:1: ( ruleSimpleAttribute )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:507:1: ( ruleSimpleAttribute )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:508:1: ruleSimpleAttribute
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:513:6: ( ruleMultiAttribute )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:513:6: ( ruleMultiAttribute )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:514:1: ruleMultiAttribute
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:525:1: rule__FormatEnum__Alternatives : ( ( ( 'XMI' ) ) | ( ( 'BINARY' ) ) | ( ( 'TEXT' ) ) | ( ( 'XML' ) ) | ( ( 'JSON' ) ) | ( ( 'ATL' ) ) | ( ( 'ZIP' ) ) );
    public final void rule__FormatEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:529:1: ( ( ( 'XMI' ) ) | ( ( 'BINARY' ) ) | ( ( 'TEXT' ) ) | ( ( 'XML' ) ) | ( ( 'JSON' ) ) | ( ( 'ATL' ) ) | ( ( 'ZIP' ) ) )
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:530:1: ( ( 'XMI' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:530:1: ( ( 'XMI' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:531:1: ( 'XMI' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:532:1: ( 'XMI' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:532:3: 'XMI'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__FormatEnum__Alternatives1061); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getXMIEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:537:6: ( ( 'BINARY' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:537:6: ( ( 'BINARY' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:538:1: ( 'BINARY' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:539:1: ( 'BINARY' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:539:3: 'BINARY'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FormatEnum__Alternatives1082); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getBINARYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:544:6: ( ( 'TEXT' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:544:6: ( ( 'TEXT' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:545:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:546:1: ( 'TEXT' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:546:3: 'TEXT'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FormatEnum__Alternatives1103); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getTEXTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:551:6: ( ( 'XML' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:551:6: ( ( 'XML' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:552:1: ( 'XML' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:553:1: ( 'XML' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:553:3: 'XML'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__FormatEnum__Alternatives1124); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getXMLEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:558:6: ( ( 'JSON' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:558:6: ( ( 'JSON' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:559:1: ( 'JSON' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:560:1: ( 'JSON' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:560:3: 'JSON'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__FormatEnum__Alternatives1145); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getJSONEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:565:6: ( ( 'ATL' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:565:6: ( ( 'ATL' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:566:1: ( 'ATL' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:567:1: ( 'ATL' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:567:3: 'ATL'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__FormatEnum__Alternatives1166); 

                    }

                     after(grammarAccess.getFormatEnumAccess().getATLEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:572:6: ( ( 'ZIP' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:572:6: ( ( 'ZIP' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:573:1: ( 'ZIP' )
                    {
                     before(grammarAccess.getFormatEnumAccess().getZIPEnumLiteralDeclaration_6()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:574:1: ( 'ZIP' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:574:3: 'ZIP'
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:584:1: rule__ServiceEnum__Alternatives : ( ( ( 'upload' ) ) | ( ( 'download' ) ) | ( ( 'update' ) ) | ( ( 'read' ) ) | ( ( 'readAll' ) ) | ( ( 'search' ) ) );
    public final void rule__ServiceEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:588:1: ( ( ( 'upload' ) ) | ( ( 'download' ) ) | ( ( 'update' ) ) | ( ( 'read' ) ) | ( ( 'readAll' ) ) | ( ( 'search' ) ) )
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:589:1: ( ( 'upload' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:589:1: ( ( 'upload' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:590:1: ( 'upload' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:591:1: ( 'upload' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:591:3: 'upload'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ServiceEnum__Alternatives1223); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getUploadEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:596:6: ( ( 'download' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:596:6: ( ( 'download' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:597:1: ( 'download' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:598:1: ( 'download' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:598:3: 'download'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ServiceEnum__Alternatives1244); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getDownloadEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:603:6: ( ( 'update' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:603:6: ( ( 'update' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:604:1: ( 'update' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:605:1: ( 'update' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:605:3: 'update'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ServiceEnum__Alternatives1265); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:610:6: ( ( 'read' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:610:6: ( ( 'read' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:611:1: ( 'read' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:612:1: ( 'read' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:612:3: 'read'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ServiceEnum__Alternatives1286); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getReadEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:617:6: ( ( 'readAll' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:617:6: ( ( 'readAll' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:618:1: ( 'readAll' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:619:1: ( 'readAll' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:619:3: 'readAll'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__ServiceEnum__Alternatives1307); 

                    }

                     after(grammarAccess.getServiceEnumAccess().getReadAllEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:624:6: ( ( 'search' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:624:6: ( ( 'search' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:625:1: ( 'search' )
                    {
                     before(grammarAccess.getServiceEnumAccess().getSearchEnumLiteralDeclaration_5()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:626:1: ( 'search' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:626:3: 'search'
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:636:1: rule__DataEnum__Alternatives : ( ( ( 'Boolean' ) ) | ( ( 'Double' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) );
    public final void rule__DataEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:640:1: ( ( ( 'Boolean' ) ) | ( ( 'Double' ) ) | ( ( 'Integer' ) ) | ( ( 'String' ) ) )
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
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:641:1: ( ( 'Boolean' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:641:1: ( ( 'Boolean' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:642:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:643:1: ( 'Boolean' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:643:3: 'Boolean'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__DataEnum__Alternatives1364); 

                    }

                     after(grammarAccess.getDataEnumAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:648:6: ( ( 'Double' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:648:6: ( ( 'Double' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:649:1: ( 'Double' )
                    {
                     before(grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:650:1: ( 'Double' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:650:3: 'Double'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__DataEnum__Alternatives1385); 

                    }

                     after(grammarAccess.getDataEnumAccess().getDoubleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:655:6: ( ( 'Integer' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:655:6: ( ( 'Integer' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:656:1: ( 'Integer' )
                    {
                     before(grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:657:1: ( 'Integer' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:657:3: 'Integer'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__DataEnum__Alternatives1406); 

                    }

                     after(grammarAccess.getDataEnumAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:662:6: ( ( 'String' ) )
                    {
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:662:6: ( ( 'String' ) )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:663:1: ( 'String' )
                    {
                     before(grammarAccess.getDataEnumAccess().getStringEnumLiteralDeclaration_3()); 
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:664:1: ( 'String' )
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:664:3: 'String'
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:676:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:680:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:681:2: rule__Root__Group__0__Impl rule__Root__Group__1
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:688:1: rule__Root__Group__0__Impl : ( ( rule__Root__ArtifactsAssignment_0 ) ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:692:1: ( ( ( rule__Root__ArtifactsAssignment_0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:693:1: ( ( rule__Root__ArtifactsAssignment_0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:693:1: ( ( rule__Root__ArtifactsAssignment_0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:694:1: ( rule__Root__ArtifactsAssignment_0 )
            {
             before(grammarAccess.getRootAccess().getArtifactsAssignment_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:695:1: ( rule__Root__ArtifactsAssignment_0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:695:2: rule__Root__ArtifactsAssignment_0
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:705:1: rule__Root__Group__1 : rule__Root__Group__1__Impl ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:709:1: ( rule__Root__Group__1__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:710:2: rule__Root__Group__1__Impl
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:716:1: rule__Root__Group__1__Impl : ( ( rule__Root__Alternatives_1 )* ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:720:1: ( ( ( rule__Root__Alternatives_1 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:721:1: ( ( rule__Root__Alternatives_1 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:721:1: ( ( rule__Root__Alternatives_1 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:722:1: ( rule__Root__Alternatives_1 )*
            {
             before(grammarAccess.getRootAccess().getAlternatives_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:723:1: ( rule__Root__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28||LA8_0==38||LA8_0==40||LA8_0==44) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:723:2: rule__Root__Alternatives_1
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:737:1: rule__Artifact__Group__0 : rule__Artifact__Group__0__Impl rule__Artifact__Group__1 ;
    public final void rule__Artifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:741:1: ( rule__Artifact__Group__0__Impl rule__Artifact__Group__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:742:2: rule__Artifact__Group__0__Impl rule__Artifact__Group__1
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:749:1: rule__Artifact__Group__0__Impl : ( () ) ;
    public final void rule__Artifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:753:1: ( ( () ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:754:1: ( () )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:754:1: ( () )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:755:1: ()
            {
             before(grammarAccess.getArtifactAccess().getArtifactAction_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:756:1: ()
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:758:1: 
            {
            }

             after(grammarAccess.getArtifactAccess().getArtifactAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__0__Impl"


    // $ANTLR start "rule__Artifact__Group__1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:768:1: rule__Artifact__Group__1 : rule__Artifact__Group__1__Impl rule__Artifact__Group__2 ;
    public final void rule__Artifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:772:1: ( rule__Artifact__Group__1__Impl rule__Artifact__Group__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:773:2: rule__Artifact__Group__1__Impl rule__Artifact__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__1__Impl_in_rule__Artifact__Group__11643);
            rule__Artifact__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__2_in_rule__Artifact__Group__11646);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:780:1: rule__Artifact__Group__1__Impl : ( 'Artifact' ) ;
    public final void rule__Artifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:784:1: ( ( 'Artifact' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:785:1: ( 'Artifact' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:785:1: ( 'Artifact' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:786:1: 'Artifact'
            {
             before(grammarAccess.getArtifactAccess().getArtifactKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Artifact__Group__1__Impl1674); 
             after(grammarAccess.getArtifactAccess().getArtifactKeyword_1()); 

            }


            }

        }
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:799:1: rule__Artifact__Group__2 : rule__Artifact__Group__2__Impl rule__Artifact__Group__3 ;
    public final void rule__Artifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:803:1: ( rule__Artifact__Group__2__Impl rule__Artifact__Group__3 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:804:2: rule__Artifact__Group__2__Impl rule__Artifact__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__2__Impl_in_rule__Artifact__Group__21705);
            rule__Artifact__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__3_in_rule__Artifact__Group__21708);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:811:1: rule__Artifact__Group__2__Impl : ( ( rule__Artifact__NameAssignment_2 ) ) ;
    public final void rule__Artifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:815:1: ( ( ( rule__Artifact__NameAssignment_2 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:816:1: ( ( rule__Artifact__NameAssignment_2 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:816:1: ( ( rule__Artifact__NameAssignment_2 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:817:1: ( rule__Artifact__NameAssignment_2 )
            {
             before(grammarAccess.getArtifactAccess().getNameAssignment_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:818:1: ( rule__Artifact__NameAssignment_2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:818:2: rule__Artifact__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__NameAssignment_2_in_rule__Artifact__Group__2__Impl1735);
            rule__Artifact__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:828:1: rule__Artifact__Group__3 : rule__Artifact__Group__3__Impl rule__Artifact__Group__4 ;
    public final void rule__Artifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:832:1: ( rule__Artifact__Group__3__Impl rule__Artifact__Group__4 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:833:2: rule__Artifact__Group__3__Impl rule__Artifact__Group__4
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:840:1: rule__Artifact__Group__3__Impl : ( ( rule__Artifact__Group_3__0 )? ) ;
    public final void rule__Artifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:844:1: ( ( ( rule__Artifact__Group_3__0 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:845:1: ( ( rule__Artifact__Group_3__0 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:845:1: ( ( rule__Artifact__Group_3__0 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:846:1: ( rule__Artifact__Group_3__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_3()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:847:1: ( rule__Artifact__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:847:2: rule__Artifact__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__0_in_rule__Artifact__Group__3__Impl1795);
                    rule__Artifact__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactAccess().getGroup_3()); 

            }


            }

        }
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:857:1: rule__Artifact__Group__4 : rule__Artifact__Group__4__Impl rule__Artifact__Group__5 ;
    public final void rule__Artifact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:861:1: ( rule__Artifact__Group__4__Impl rule__Artifact__Group__5 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:862:2: rule__Artifact__Group__4__Impl rule__Artifact__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__4__Impl_in_rule__Artifact__Group__41826);
            rule__Artifact__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__5_in_rule__Artifact__Group__41829);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:869:1: rule__Artifact__Group__4__Impl : ( '{' ) ;
    public final void rule__Artifact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:873:1: ( ( '{' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:874:1: ( '{' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:874:1: ( '{' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:875:1: '{'
            {
             before(grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Artifact__Group__4__Impl1857); 
             after(grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:888:1: rule__Artifact__Group__5 : rule__Artifact__Group__5__Impl rule__Artifact__Group__6 ;
    public final void rule__Artifact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:892:1: ( rule__Artifact__Group__5__Impl rule__Artifact__Group__6 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:893:2: rule__Artifact__Group__5__Impl rule__Artifact__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__5__Impl_in_rule__Artifact__Group__51888);
            rule__Artifact__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__6_in_rule__Artifact__Group__51891);
            rule__Artifact__Group__6();

            state._fsp--;


            }

        }
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:900:1: rule__Artifact__Group__5__Impl : ( ( rule__Artifact__AttributesAssignment_5 )* ) ;
    public final void rule__Artifact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:904:1: ( ( ( rule__Artifact__AttributesAssignment_5 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:905:1: ( ( rule__Artifact__AttributesAssignment_5 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:905:1: ( ( rule__Artifact__AttributesAssignment_5 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:906:1: ( rule__Artifact__AttributesAssignment_5 )*
            {
             before(grammarAccess.getArtifactAccess().getAttributesAssignment_5()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:907:1: ( rule__Artifact__AttributesAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||(LA10_0>=45 && LA10_0<=46)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:907:2: rule__Artifact__AttributesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Artifact__AttributesAssignment_5_in_rule__Artifact__Group__5__Impl1918);
            	    rule__Artifact__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getArtifactAccess().getAttributesAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Artifact__Group__6"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:917:1: rule__Artifact__Group__6 : rule__Artifact__Group__6__Impl ;
    public final void rule__Artifact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:921:1: ( rule__Artifact__Group__6__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:922:2: rule__Artifact__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group__6__Impl_in_rule__Artifact__Group__61949);
            rule__Artifact__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__6"


    // $ANTLR start "rule__Artifact__Group__6__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:928:1: rule__Artifact__Group__6__Impl : ( '}' ) ;
    public final void rule__Artifact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:932:1: ( ( '}' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:933:1: ( '}' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:933:1: ( '}' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:934:1: '}'
            {
             before(grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Artifact__Group__6__Impl1977); 
             after(grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__6__Impl"


    // $ANTLR start "rule__Artifact__Group_3__0"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:961:1: rule__Artifact__Group_3__0 : rule__Artifact__Group_3__0__Impl rule__Artifact__Group_3__1 ;
    public final void rule__Artifact__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:965:1: ( rule__Artifact__Group_3__0__Impl rule__Artifact__Group_3__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:966:2: rule__Artifact__Group_3__0__Impl rule__Artifact__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__0__Impl_in_rule__Artifact__Group_3__02022);
            rule__Artifact__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__1_in_rule__Artifact__Group_3__02025);
            rule__Artifact__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__0"


    // $ANTLR start "rule__Artifact__Group_3__0__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:973:1: rule__Artifact__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Artifact__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:977:1: ( ( '[' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:978:1: ( '[' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:978:1: ( '[' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:979:1: '['
            {
             before(grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Artifact__Group_3__0__Impl2053); 
             after(grammarAccess.getArtifactAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__0__Impl"


    // $ANTLR start "rule__Artifact__Group_3__1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:992:1: rule__Artifact__Group_3__1 : rule__Artifact__Group_3__1__Impl rule__Artifact__Group_3__2 ;
    public final void rule__Artifact__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:996:1: ( rule__Artifact__Group_3__1__Impl rule__Artifact__Group_3__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:997:2: rule__Artifact__Group_3__1__Impl rule__Artifact__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__1__Impl_in_rule__Artifact__Group_3__12084);
            rule__Artifact__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__2_in_rule__Artifact__Group_3__12087);
            rule__Artifact__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__1"


    // $ANTLR start "rule__Artifact__Group_3__1__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1004:1: rule__Artifact__Group_3__1__Impl : ( ( rule__Artifact__Group_3_1__0 )? ) ;
    public final void rule__Artifact__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1008:1: ( ( ( rule__Artifact__Group_3_1__0 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1009:1: ( ( rule__Artifact__Group_3_1__0 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1009:1: ( ( rule__Artifact__Group_3_1__0 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1010:1: ( rule__Artifact__Group_3_1__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_3_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1011:1: ( rule__Artifact__Group_3_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1011:2: rule__Artifact__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_1__0_in_rule__Artifact__Group_3__1__Impl2114);
                    rule__Artifact__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__1__Impl"


    // $ANTLR start "rule__Artifact__Group_3__2"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1021:1: rule__Artifact__Group_3__2 : rule__Artifact__Group_3__2__Impl rule__Artifact__Group_3__3 ;
    public final void rule__Artifact__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1025:1: ( rule__Artifact__Group_3__2__Impl rule__Artifact__Group_3__3 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1026:2: rule__Artifact__Group_3__2__Impl rule__Artifact__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__2__Impl_in_rule__Artifact__Group_3__22145);
            rule__Artifact__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__3_in_rule__Artifact__Group_3__22148);
            rule__Artifact__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__2"


    // $ANTLR start "rule__Artifact__Group_3__2__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1033:1: rule__Artifact__Group_3__2__Impl : ( ( rule__Artifact__Group_3_2__0 )? ) ;
    public final void rule__Artifact__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1037:1: ( ( ( rule__Artifact__Group_3_2__0 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1038:1: ( ( rule__Artifact__Group_3_2__0 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1038:1: ( ( rule__Artifact__Group_3_2__0 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1039:1: ( rule__Artifact__Group_3_2__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_3_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1040:1: ( rule__Artifact__Group_3_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1040:2: rule__Artifact__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_2__0_in_rule__Artifact__Group_3__2__Impl2175);
                    rule__Artifact__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__2__Impl"


    // $ANTLR start "rule__Artifact__Group_3__3"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1050:1: rule__Artifact__Group_3__3 : rule__Artifact__Group_3__3__Impl rule__Artifact__Group_3__4 ;
    public final void rule__Artifact__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1054:1: ( rule__Artifact__Group_3__3__Impl rule__Artifact__Group_3__4 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1055:2: rule__Artifact__Group_3__3__Impl rule__Artifact__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__3__Impl_in_rule__Artifact__Group_3__32206);
            rule__Artifact__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__4_in_rule__Artifact__Group_3__32209);
            rule__Artifact__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__3"


    // $ANTLR start "rule__Artifact__Group_3__3__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1062:1: rule__Artifact__Group_3__3__Impl : ( ( rule__Artifact__Group_3_3__0 )? ) ;
    public final void rule__Artifact__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1066:1: ( ( ( rule__Artifact__Group_3_3__0 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1067:1: ( ( rule__Artifact__Group_3_3__0 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1067:1: ( ( rule__Artifact__Group_3_3__0 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1068:1: ( rule__Artifact__Group_3_3__0 )?
            {
             before(grammarAccess.getArtifactAccess().getGroup_3_3()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1069:1: ( rule__Artifact__Group_3_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1069:2: rule__Artifact__Group_3_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3__0_in_rule__Artifact__Group_3__3__Impl2236);
                    rule__Artifact__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__3__Impl"


    // $ANTLR start "rule__Artifact__Group_3__4"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1079:1: rule__Artifact__Group_3__4 : rule__Artifact__Group_3__4__Impl ;
    public final void rule__Artifact__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1083:1: ( rule__Artifact__Group_3__4__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1084:2: rule__Artifact__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3__4__Impl_in_rule__Artifact__Group_3__42267);
            rule__Artifact__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__4"


    // $ANTLR start "rule__Artifact__Group_3__4__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1090:1: rule__Artifact__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Artifact__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1094:1: ( ( ']' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1095:1: ( ']' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1095:1: ( ']' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1096:1: ']'
            {
             before(grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Artifact__Group_3__4__Impl2295); 
             after(grammarAccess.getArtifactAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3__4__Impl"


    // $ANTLR start "rule__Artifact__Group_3_1__0"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1119:1: rule__Artifact__Group_3_1__0 : rule__Artifact__Group_3_1__0__Impl rule__Artifact__Group_3_1__1 ;
    public final void rule__Artifact__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1123:1: ( rule__Artifact__Group_3_1__0__Impl rule__Artifact__Group_3_1__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1124:2: rule__Artifact__Group_3_1__0__Impl rule__Artifact__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_1__0__Impl_in_rule__Artifact__Group_3_1__02336);
            rule__Artifact__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_1__1_in_rule__Artifact__Group_3_1__02339);
            rule__Artifact__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_1__0"


    // $ANTLR start "rule__Artifact__Group_3_1__0__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1131:1: rule__Artifact__Group_3_1__0__Impl : ( 'extension ' ) ;
    public final void rule__Artifact__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1135:1: ( ( 'extension ' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1136:1: ( 'extension ' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1136:1: ( 'extension ' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1137:1: 'extension '
            {
             before(grammarAccess.getArtifactAccess().getExtensionKeyword_3_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Artifact__Group_3_1__0__Impl2367); 
             after(grammarAccess.getArtifactAccess().getExtensionKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_1__0__Impl"


    // $ANTLR start "rule__Artifact__Group_3_1__1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1150:1: rule__Artifact__Group_3_1__1 : rule__Artifact__Group_3_1__1__Impl rule__Artifact__Group_3_1__2 ;
    public final void rule__Artifact__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1154:1: ( rule__Artifact__Group_3_1__1__Impl rule__Artifact__Group_3_1__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1155:2: rule__Artifact__Group_3_1__1__Impl rule__Artifact__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_1__1__Impl_in_rule__Artifact__Group_3_1__12398);
            rule__Artifact__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_1__2_in_rule__Artifact__Group_3_1__12401);
            rule__Artifact__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_1__1"


    // $ANTLR start "rule__Artifact__Group_3_1__1__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1162:1: rule__Artifact__Group_3_1__1__Impl : ( '.' ) ;
    public final void rule__Artifact__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1166:1: ( ( '.' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1167:1: ( '.' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1167:1: ( '.' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1168:1: '.'
            {
             before(grammarAccess.getArtifactAccess().getFullStopKeyword_3_1_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Artifact__Group_3_1__1__Impl2429); 
             after(grammarAccess.getArtifactAccess().getFullStopKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_1__1__Impl"


    // $ANTLR start "rule__Artifact__Group_3_1__2"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1181:1: rule__Artifact__Group_3_1__2 : rule__Artifact__Group_3_1__2__Impl ;
    public final void rule__Artifact__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1185:1: ( rule__Artifact__Group_3_1__2__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1186:2: rule__Artifact__Group_3_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_1__2__Impl_in_rule__Artifact__Group_3_1__22460);
            rule__Artifact__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_1__2"


    // $ANTLR start "rule__Artifact__Group_3_1__2__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1192:1: rule__Artifact__Group_3_1__2__Impl : ( ( rule__Artifact__ExtensionAssignment_3_1_2 ) ) ;
    public final void rule__Artifact__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1196:1: ( ( ( rule__Artifact__ExtensionAssignment_3_1_2 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1197:1: ( ( rule__Artifact__ExtensionAssignment_3_1_2 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1197:1: ( ( rule__Artifact__ExtensionAssignment_3_1_2 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1198:1: ( rule__Artifact__ExtensionAssignment_3_1_2 )
            {
             before(grammarAccess.getArtifactAccess().getExtensionAssignment_3_1_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1199:1: ( rule__Artifact__ExtensionAssignment_3_1_2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1199:2: rule__Artifact__ExtensionAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__ExtensionAssignment_3_1_2_in_rule__Artifact__Group_3_1__2__Impl2487);
            rule__Artifact__ExtensionAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getExtensionAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_1__2__Impl"


    // $ANTLR start "rule__Artifact__Group_3_2__0"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1215:1: rule__Artifact__Group_3_2__0 : rule__Artifact__Group_3_2__0__Impl rule__Artifact__Group_3_2__1 ;
    public final void rule__Artifact__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1219:1: ( rule__Artifact__Group_3_2__0__Impl rule__Artifact__Group_3_2__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1220:2: rule__Artifact__Group_3_2__0__Impl rule__Artifact__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_2__0__Impl_in_rule__Artifact__Group_3_2__02523);
            rule__Artifact__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_2__1_in_rule__Artifact__Group_3_2__02526);
            rule__Artifact__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_2__0"


    // $ANTLR start "rule__Artifact__Group_3_2__0__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1227:1: rule__Artifact__Group_3_2__0__Impl : ( 'format ' ) ;
    public final void rule__Artifact__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1231:1: ( ( 'format ' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1232:1: ( 'format ' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1232:1: ( 'format ' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1233:1: 'format '
            {
             before(grammarAccess.getArtifactAccess().getFormatKeyword_3_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Artifact__Group_3_2__0__Impl2554); 
             after(grammarAccess.getArtifactAccess().getFormatKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_2__0__Impl"


    // $ANTLR start "rule__Artifact__Group_3_2__1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1246:1: rule__Artifact__Group_3_2__1 : rule__Artifact__Group_3_2__1__Impl ;
    public final void rule__Artifact__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1250:1: ( rule__Artifact__Group_3_2__1__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1251:2: rule__Artifact__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_2__1__Impl_in_rule__Artifact__Group_3_2__12585);
            rule__Artifact__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_2__1"


    // $ANTLR start "rule__Artifact__Group_3_2__1__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1257:1: rule__Artifact__Group_3_2__1__Impl : ( ( rule__Artifact__FormatAssignment_3_2_1 ) ) ;
    public final void rule__Artifact__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1261:1: ( ( ( rule__Artifact__FormatAssignment_3_2_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1262:1: ( ( rule__Artifact__FormatAssignment_3_2_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1262:1: ( ( rule__Artifact__FormatAssignment_3_2_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1263:1: ( rule__Artifact__FormatAssignment_3_2_1 )
            {
             before(grammarAccess.getArtifactAccess().getFormatAssignment_3_2_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1264:1: ( rule__Artifact__FormatAssignment_3_2_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1264:2: rule__Artifact__FormatAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__FormatAssignment_3_2_1_in_rule__Artifact__Group_3_2__1__Impl2612);
            rule__Artifact__FormatAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getFormatAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_2__1__Impl"


    // $ANTLR start "rule__Artifact__Group_3_3__0"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1278:1: rule__Artifact__Group_3_3__0 : rule__Artifact__Group_3_3__0__Impl rule__Artifact__Group_3_3__1 ;
    public final void rule__Artifact__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1282:1: ( rule__Artifact__Group_3_3__0__Impl rule__Artifact__Group_3_3__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1283:2: rule__Artifact__Group_3_3__0__Impl rule__Artifact__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3__0__Impl_in_rule__Artifact__Group_3_3__02646);
            rule__Artifact__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3__1_in_rule__Artifact__Group_3_3__02649);
            rule__Artifact__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3__0"


    // $ANTLR start "rule__Artifact__Group_3_3__0__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1290:1: rule__Artifact__Group_3_3__0__Impl : ( 'services : ' ) ;
    public final void rule__Artifact__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1294:1: ( ( 'services : ' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1295:1: ( 'services : ' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1295:1: ( 'services : ' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1296:1: 'services : '
            {
             before(grammarAccess.getArtifactAccess().getServicesKeyword_3_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Artifact__Group_3_3__0__Impl2677); 
             after(grammarAccess.getArtifactAccess().getServicesKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3__0__Impl"


    // $ANTLR start "rule__Artifact__Group_3_3__1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1309:1: rule__Artifact__Group_3_3__1 : rule__Artifact__Group_3_3__1__Impl rule__Artifact__Group_3_3__2 ;
    public final void rule__Artifact__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1313:1: ( rule__Artifact__Group_3_3__1__Impl rule__Artifact__Group_3_3__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1314:2: rule__Artifact__Group_3_3__1__Impl rule__Artifact__Group_3_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3__1__Impl_in_rule__Artifact__Group_3_3__12708);
            rule__Artifact__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3__2_in_rule__Artifact__Group_3_3__12711);
            rule__Artifact__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3__1"


    // $ANTLR start "rule__Artifact__Group_3_3__1__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1321:1: rule__Artifact__Group_3_3__1__Impl : ( ( rule__Artifact__BasicServicesAssignment_3_3_1 ) ) ;
    public final void rule__Artifact__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1325:1: ( ( ( rule__Artifact__BasicServicesAssignment_3_3_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1326:1: ( ( rule__Artifact__BasicServicesAssignment_3_3_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1326:1: ( ( rule__Artifact__BasicServicesAssignment_3_3_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1327:1: ( rule__Artifact__BasicServicesAssignment_3_3_1 )
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesAssignment_3_3_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1328:1: ( rule__Artifact__BasicServicesAssignment_3_3_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1328:2: rule__Artifact__BasicServicesAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__BasicServicesAssignment_3_3_1_in_rule__Artifact__Group_3_3__1__Impl2738);
            rule__Artifact__BasicServicesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getBasicServicesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3__1__Impl"


    // $ANTLR start "rule__Artifact__Group_3_3__2"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1338:1: rule__Artifact__Group_3_3__2 : rule__Artifact__Group_3_3__2__Impl ;
    public final void rule__Artifact__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1342:1: ( rule__Artifact__Group_3_3__2__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1343:2: rule__Artifact__Group_3_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3__2__Impl_in_rule__Artifact__Group_3_3__22768);
            rule__Artifact__Group_3_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3__2"


    // $ANTLR start "rule__Artifact__Group_3_3__2__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1349:1: rule__Artifact__Group_3_3__2__Impl : ( ( rule__Artifact__Group_3_3_2__0 )* ) ;
    public final void rule__Artifact__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1353:1: ( ( ( rule__Artifact__Group_3_3_2__0 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1354:1: ( ( rule__Artifact__Group_3_3_2__0 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1354:1: ( ( rule__Artifact__Group_3_3_2__0 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1355:1: ( rule__Artifact__Group_3_3_2__0 )*
            {
             before(grammarAccess.getArtifactAccess().getGroup_3_3_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1356:1: ( rule__Artifact__Group_3_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1356:2: rule__Artifact__Group_3_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3_2__0_in_rule__Artifact__Group_3_3__2__Impl2795);
            	    rule__Artifact__Group_3_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getArtifactAccess().getGroup_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3__2__Impl"


    // $ANTLR start "rule__Artifact__Group_3_3_2__0"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1372:1: rule__Artifact__Group_3_3_2__0 : rule__Artifact__Group_3_3_2__0__Impl rule__Artifact__Group_3_3_2__1 ;
    public final void rule__Artifact__Group_3_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1376:1: ( rule__Artifact__Group_3_3_2__0__Impl rule__Artifact__Group_3_3_2__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1377:2: rule__Artifact__Group_3_3_2__0__Impl rule__Artifact__Group_3_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3_2__0__Impl_in_rule__Artifact__Group_3_3_2__02832);
            rule__Artifact__Group_3_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3_2__1_in_rule__Artifact__Group_3_3_2__02835);
            rule__Artifact__Group_3_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3_2__0"


    // $ANTLR start "rule__Artifact__Group_3_3_2__0__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1384:1: rule__Artifact__Group_3_3_2__0__Impl : ( ',' ) ;
    public final void rule__Artifact__Group_3_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1388:1: ( ( ',' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1389:1: ( ',' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1389:1: ( ',' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1390:1: ','
            {
             before(grammarAccess.getArtifactAccess().getCommaKeyword_3_3_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Artifact__Group_3_3_2__0__Impl2863); 
             after(grammarAccess.getArtifactAccess().getCommaKeyword_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3_2__0__Impl"


    // $ANTLR start "rule__Artifact__Group_3_3_2__1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1403:1: rule__Artifact__Group_3_3_2__1 : rule__Artifact__Group_3_3_2__1__Impl ;
    public final void rule__Artifact__Group_3_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1407:1: ( rule__Artifact__Group_3_3_2__1__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1408:2: rule__Artifact__Group_3_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__Group_3_3_2__1__Impl_in_rule__Artifact__Group_3_3_2__12894);
            rule__Artifact__Group_3_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3_2__1"


    // $ANTLR start "rule__Artifact__Group_3_3_2__1__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1414:1: rule__Artifact__Group_3_3_2__1__Impl : ( ( rule__Artifact__BasicServicesAssignment_3_3_2_1 ) ) ;
    public final void rule__Artifact__Group_3_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1418:1: ( ( ( rule__Artifact__BasicServicesAssignment_3_3_2_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1419:1: ( ( rule__Artifact__BasicServicesAssignment_3_3_2_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1419:1: ( ( rule__Artifact__BasicServicesAssignment_3_3_2_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1420:1: ( rule__Artifact__BasicServicesAssignment_3_3_2_1 )
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesAssignment_3_3_2_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1421:1: ( rule__Artifact__BasicServicesAssignment_3_3_2_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1421:2: rule__Artifact__BasicServicesAssignment_3_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Artifact__BasicServicesAssignment_3_3_2_1_in_rule__Artifact__Group_3_3_2__1__Impl2921);
            rule__Artifact__BasicServicesAssignment_3_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getBasicServicesAssignment_3_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group_3_3_2__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1435:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1439:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1440:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02955);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02958);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1447:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1451:1: ( ( () ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1452:1: ( () )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1452:1: ( () )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1453:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1454:1: ()
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1456:1: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1466:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1470:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1471:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13016);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13019);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1478:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1482:1: ( ( 'Entity' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1483:1: ( 'Entity' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1483:1: ( 'Entity' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1484:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Entity__Group__1__Impl3047); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1497:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1501:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1502:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23078);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23081);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1509:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1513:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1514:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1514:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1515:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1516:1: ( rule__Entity__NameAssignment_2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1516:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3108);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1526:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1530:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1531:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33138);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33141);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1538:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1542:1: ( ( '{' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1543:1: ( '{' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1543:1: ( '{' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1544:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Entity__Group__3__Impl3169); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1557:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1561:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1562:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43200);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43203);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1569:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__AttributesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1573:1: ( ( ( rule__Entity__AttributesAssignment_4 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1574:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1574:1: ( ( rule__Entity__AttributesAssignment_4 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1575:1: ( rule__Entity__AttributesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1576:1: ( rule__Entity__AttributesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||(LA15_0>=45 && LA15_0<=46)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1576:2: rule__Entity__AttributesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4__Impl3230);
            	    rule__Entity__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__Group__5"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1586:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1590:1: ( rule__Entity__Group__5__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1591:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53261);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1597:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1601:1: ( ( '}' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1602:1: ( '}' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1602:1: ( '}' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1603:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Entity__Group__5__Impl3289); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__SimpleAttribute__Group__0"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1628:1: rule__SimpleAttribute__Group__0 : rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 ;
    public final void rule__SimpleAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1632:1: ( rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1633:2: rule__SimpleAttribute__Group__0__Impl rule__SimpleAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__03332);
            rule__SimpleAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__03335);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1640:1: rule__SimpleAttribute__Group__0__Impl : ( ( rule__SimpleAttribute__ManyAssignment_0 )? ) ;
    public final void rule__SimpleAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1644:1: ( ( ( rule__SimpleAttribute__ManyAssignment_0 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1645:1: ( ( rule__SimpleAttribute__ManyAssignment_0 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1645:1: ( ( rule__SimpleAttribute__ManyAssignment_0 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1646:1: ( rule__SimpleAttribute__ManyAssignment_0 )?
            {
             before(grammarAccess.getSimpleAttributeAccess().getManyAssignment_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1647:1: ( rule__SimpleAttribute__ManyAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1647:2: rule__SimpleAttribute__ManyAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__ManyAssignment_0_in_rule__SimpleAttribute__Group__0__Impl3362);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1657:1: rule__SimpleAttribute__Group__1 : rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2 ;
    public final void rule__SimpleAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1661:1: ( rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1662:2: rule__SimpleAttribute__Group__1__Impl rule__SimpleAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__13393);
            rule__SimpleAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__2_in_rule__SimpleAttribute__Group__13396);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1669:1: rule__SimpleAttribute__Group__1__Impl : ( ( rule__SimpleAttribute__RequiredAssignment_1 )? ) ;
    public final void rule__SimpleAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1673:1: ( ( ( rule__SimpleAttribute__RequiredAssignment_1 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1674:1: ( ( rule__SimpleAttribute__RequiredAssignment_1 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1674:1: ( ( rule__SimpleAttribute__RequiredAssignment_1 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1675:1: ( rule__SimpleAttribute__RequiredAssignment_1 )?
            {
             before(grammarAccess.getSimpleAttributeAccess().getRequiredAssignment_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1676:1: ( rule__SimpleAttribute__RequiredAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1676:2: rule__SimpleAttribute__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__RequiredAssignment_1_in_rule__SimpleAttribute__Group__1__Impl3423);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1686:1: rule__SimpleAttribute__Group__2 : rule__SimpleAttribute__Group__2__Impl rule__SimpleAttribute__Group__3 ;
    public final void rule__SimpleAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1690:1: ( rule__SimpleAttribute__Group__2__Impl rule__SimpleAttribute__Group__3 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1691:2: rule__SimpleAttribute__Group__2__Impl rule__SimpleAttribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__2__Impl_in_rule__SimpleAttribute__Group__23454);
            rule__SimpleAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__3_in_rule__SimpleAttribute__Group__23457);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1698:1: rule__SimpleAttribute__Group__2__Impl : ( ( rule__SimpleAttribute__NameAssignment_2 ) ) ;
    public final void rule__SimpleAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1702:1: ( ( ( rule__SimpleAttribute__NameAssignment_2 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1703:1: ( ( rule__SimpleAttribute__NameAssignment_2 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1703:1: ( ( rule__SimpleAttribute__NameAssignment_2 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1704:1: ( rule__SimpleAttribute__NameAssignment_2 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameAssignment_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1705:1: ( rule__SimpleAttribute__NameAssignment_2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1705:2: rule__SimpleAttribute__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__NameAssignment_2_in_rule__SimpleAttribute__Group__2__Impl3484);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1715:1: rule__SimpleAttribute__Group__3 : rule__SimpleAttribute__Group__3__Impl rule__SimpleAttribute__Group__4 ;
    public final void rule__SimpleAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1719:1: ( rule__SimpleAttribute__Group__3__Impl rule__SimpleAttribute__Group__4 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1720:2: rule__SimpleAttribute__Group__3__Impl rule__SimpleAttribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__3__Impl_in_rule__SimpleAttribute__Group__33514);
            rule__SimpleAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__4_in_rule__SimpleAttribute__Group__33517);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1727:1: rule__SimpleAttribute__Group__3__Impl : ( ':' ) ;
    public final void rule__SimpleAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1731:1: ( ( ':' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1732:1: ( ':' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1732:1: ( ':' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1733:1: ':'
            {
             before(grammarAccess.getSimpleAttributeAccess().getColonKeyword_3()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__SimpleAttribute__Group__3__Impl3545); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1746:1: rule__SimpleAttribute__Group__4 : rule__SimpleAttribute__Group__4__Impl ;
    public final void rule__SimpleAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1750:1: ( rule__SimpleAttribute__Group__4__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1751:2: rule__SimpleAttribute__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__Group__4__Impl_in_rule__SimpleAttribute__Group__43576);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1757:1: rule__SimpleAttribute__Group__4__Impl : ( ( rule__SimpleAttribute__DataAssignment_4 ) ) ;
    public final void rule__SimpleAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1761:1: ( ( ( rule__SimpleAttribute__DataAssignment_4 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1762:1: ( ( rule__SimpleAttribute__DataAssignment_4 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1762:1: ( ( rule__SimpleAttribute__DataAssignment_4 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1763:1: ( rule__SimpleAttribute__DataAssignment_4 )
            {
             before(grammarAccess.getSimpleAttributeAccess().getDataAssignment_4()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1764:1: ( rule__SimpleAttribute__DataAssignment_4 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1764:2: rule__SimpleAttribute__DataAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleAttribute__DataAssignment_4_in_rule__SimpleAttribute__Group__4__Impl3603);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1784:1: rule__MultiAttribute__Group__0 : rule__MultiAttribute__Group__0__Impl rule__MultiAttribute__Group__1 ;
    public final void rule__MultiAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1788:1: ( rule__MultiAttribute__Group__0__Impl rule__MultiAttribute__Group__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1789:2: rule__MultiAttribute__Group__0__Impl rule__MultiAttribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__0__Impl_in_rule__MultiAttribute__Group__03643);
            rule__MultiAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__1_in_rule__MultiAttribute__Group__03646);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1796:1: rule__MultiAttribute__Group__0__Impl : ( ( rule__MultiAttribute__NameAssignment_0 ) ) ;
    public final void rule__MultiAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1800:1: ( ( ( rule__MultiAttribute__NameAssignment_0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1801:1: ( ( rule__MultiAttribute__NameAssignment_0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1801:1: ( ( rule__MultiAttribute__NameAssignment_0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1802:1: ( rule__MultiAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getMultiAttributeAccess().getNameAssignment_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1803:1: ( rule__MultiAttribute__NameAssignment_0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1803:2: rule__MultiAttribute__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__NameAssignment_0_in_rule__MultiAttribute__Group__0__Impl3673);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1813:1: rule__MultiAttribute__Group__1 : rule__MultiAttribute__Group__1__Impl rule__MultiAttribute__Group__2 ;
    public final void rule__MultiAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1817:1: ( rule__MultiAttribute__Group__1__Impl rule__MultiAttribute__Group__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1818:2: rule__MultiAttribute__Group__1__Impl rule__MultiAttribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__1__Impl_in_rule__MultiAttribute__Group__13703);
            rule__MultiAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__2_in_rule__MultiAttribute__Group__13706);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1825:1: rule__MultiAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__MultiAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1829:1: ( ( ':' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1830:1: ( ':' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1830:1: ( ':' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1831:1: ':'
            {
             before(grammarAccess.getMultiAttributeAccess().getColonKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__MultiAttribute__Group__1__Impl3734); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1844:1: rule__MultiAttribute__Group__2 : rule__MultiAttribute__Group__2__Impl ;
    public final void rule__MultiAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1848:1: ( rule__MultiAttribute__Group__2__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1849:2: rule__MultiAttribute__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__Group__2__Impl_in_rule__MultiAttribute__Group__23765);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1855:1: rule__MultiAttribute__Group__2__Impl : ( ( rule__MultiAttribute__TypeAssignment_2 ) ) ;
    public final void rule__MultiAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1859:1: ( ( ( rule__MultiAttribute__TypeAssignment_2 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1860:1: ( ( rule__MultiAttribute__TypeAssignment_2 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1860:1: ( ( rule__MultiAttribute__TypeAssignment_2 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1861:1: ( rule__MultiAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getMultiAttributeAccess().getTypeAssignment_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1862:1: ( rule__MultiAttribute__TypeAssignment_2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1862:2: rule__MultiAttribute__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiAttribute__TypeAssignment_2_in_rule__MultiAttribute__Group__2__Impl3792);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1878:1: rule__OnService__Group__0 : rule__OnService__Group__0__Impl rule__OnService__Group__1 ;
    public final void rule__OnService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1882:1: ( rule__OnService__Group__0__Impl rule__OnService__Group__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1883:2: rule__OnService__Group__0__Impl rule__OnService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__0__Impl_in_rule__OnService__Group__03828);
            rule__OnService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__1_in_rule__OnService__Group__03831);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1890:1: rule__OnService__Group__0__Impl : ( ( rule__OnService__ArtifactAssignment_0 ) ) ;
    public final void rule__OnService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1894:1: ( ( ( rule__OnService__ArtifactAssignment_0 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1895:1: ( ( rule__OnService__ArtifactAssignment_0 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1895:1: ( ( rule__OnService__ArtifactAssignment_0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1896:1: ( rule__OnService__ArtifactAssignment_0 )
            {
             before(grammarAccess.getOnServiceAccess().getArtifactAssignment_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1897:1: ( rule__OnService__ArtifactAssignment_0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1897:2: rule__OnService__ArtifactAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__ArtifactAssignment_0_in_rule__OnService__Group__0__Impl3858);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1907:1: rule__OnService__Group__1 : rule__OnService__Group__1__Impl rule__OnService__Group__2 ;
    public final void rule__OnService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1911:1: ( rule__OnService__Group__1__Impl rule__OnService__Group__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1912:2: rule__OnService__Group__1__Impl rule__OnService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__1__Impl_in_rule__OnService__Group__13888);
            rule__OnService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__2_in_rule__OnService__Group__13891);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1919:1: rule__OnService__Group__1__Impl : ( '[' ) ;
    public final void rule__OnService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1923:1: ( ( '[' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1924:1: ( '[' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1924:1: ( '[' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1925:1: '['
            {
             before(grammarAccess.getOnServiceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__OnService__Group__1__Impl3919); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1938:1: rule__OnService__Group__2 : rule__OnService__Group__2__Impl rule__OnService__Group__3 ;
    public final void rule__OnService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1942:1: ( rule__OnService__Group__2__Impl rule__OnService__Group__3 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1943:2: rule__OnService__Group__2__Impl rule__OnService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__2__Impl_in_rule__OnService__Group__23950);
            rule__OnService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__3_in_rule__OnService__Group__23953);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1950:1: rule__OnService__Group__2__Impl : ( ( rule__OnService__WhenServicesAssignment_2 ) ) ;
    public final void rule__OnService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1954:1: ( ( ( rule__OnService__WhenServicesAssignment_2 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1955:1: ( ( rule__OnService__WhenServicesAssignment_2 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1955:1: ( ( rule__OnService__WhenServicesAssignment_2 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1956:1: ( rule__OnService__WhenServicesAssignment_2 )
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1957:1: ( rule__OnService__WhenServicesAssignment_2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1957:2: rule__OnService__WhenServicesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__WhenServicesAssignment_2_in_rule__OnService__Group__2__Impl3980);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1967:1: rule__OnService__Group__3 : rule__OnService__Group__3__Impl rule__OnService__Group__4 ;
    public final void rule__OnService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1971:1: ( rule__OnService__Group__3__Impl rule__OnService__Group__4 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1972:2: rule__OnService__Group__3__Impl rule__OnService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__3__Impl_in_rule__OnService__Group__34010);
            rule__OnService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__4_in_rule__OnService__Group__34013);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1979:1: rule__OnService__Group__3__Impl : ( ( rule__OnService__Group_3__0 )* ) ;
    public final void rule__OnService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1983:1: ( ( ( rule__OnService__Group_3__0 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1984:1: ( ( rule__OnService__Group_3__0 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1984:1: ( ( rule__OnService__Group_3__0 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1985:1: ( rule__OnService__Group_3__0 )*
            {
             before(grammarAccess.getOnServiceAccess().getGroup_3()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1986:1: ( rule__OnService__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1986:2: rule__OnService__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__0_in_rule__OnService__Group__3__Impl4040);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:1996:1: rule__OnService__Group__4 : rule__OnService__Group__4__Impl ;
    public final void rule__OnService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2000:1: ( rule__OnService__Group__4__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2001:2: rule__OnService__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group__4__Impl_in_rule__OnService__Group__44071);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2007:1: rule__OnService__Group__4__Impl : ( ']' ) ;
    public final void rule__OnService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2011:1: ( ( ']' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2012:1: ( ']' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2012:1: ( ']' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2013:1: ']'
            {
             before(grammarAccess.getOnServiceAccess().getRightSquareBracketKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__OnService__Group__4__Impl4099); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2036:1: rule__OnService__Group_3__0 : rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1 ;
    public final void rule__OnService__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2040:1: ( rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2041:2: rule__OnService__Group_3__0__Impl rule__OnService__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__0__Impl_in_rule__OnService__Group_3__04140);
            rule__OnService__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__1_in_rule__OnService__Group_3__04143);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2048:1: rule__OnService__Group_3__0__Impl : ( ',' ) ;
    public final void rule__OnService__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2052:1: ( ( ',' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2053:1: ( ',' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2053:1: ( ',' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2054:1: ','
            {
             before(grammarAccess.getOnServiceAccess().getCommaKeyword_3_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__OnService__Group_3__0__Impl4171); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2067:1: rule__OnService__Group_3__1 : rule__OnService__Group_3__1__Impl ;
    public final void rule__OnService__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2071:1: ( rule__OnService__Group_3__1__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2072:2: rule__OnService__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__Group_3__1__Impl_in_rule__OnService__Group_3__14202);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2078:1: rule__OnService__Group_3__1__Impl : ( ( rule__OnService__WhenServicesAssignment_3_1 ) ) ;
    public final void rule__OnService__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2082:1: ( ( ( rule__OnService__WhenServicesAssignment_3_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2083:1: ( ( rule__OnService__WhenServicesAssignment_3_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2083:1: ( ( rule__OnService__WhenServicesAssignment_3_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2084:1: ( rule__OnService__WhenServicesAssignment_3_1 )
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesAssignment_3_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2085:1: ( rule__OnService__WhenServicesAssignment_3_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2085:2: rule__OnService__WhenServicesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OnService__WhenServicesAssignment_3_1_in_rule__OnService__Group_3__1__Impl4229);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2099:1: rule__SimpleService__Group__0 : rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1 ;
    public final void rule__SimpleService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2103:1: ( rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2104:2: rule__SimpleService__Group__0__Impl rule__SimpleService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__0__Impl_in_rule__SimpleService__Group__04263);
            rule__SimpleService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__1_in_rule__SimpleService__Group__04266);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2111:1: rule__SimpleService__Group__0__Impl : ( 'Service' ) ;
    public final void rule__SimpleService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2115:1: ( ( 'Service' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2116:1: ( 'Service' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2116:1: ( 'Service' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2117:1: 'Service'
            {
             before(grammarAccess.getSimpleServiceAccess().getServiceKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__SimpleService__Group__0__Impl4294); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2130:1: rule__SimpleService__Group__1 : rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2 ;
    public final void rule__SimpleService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2134:1: ( rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2135:2: rule__SimpleService__Group__1__Impl rule__SimpleService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__1__Impl_in_rule__SimpleService__Group__14325);
            rule__SimpleService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__2_in_rule__SimpleService__Group__14328);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2142:1: rule__SimpleService__Group__1__Impl : ( ( rule__SimpleService__NameAssignment_1 ) ) ;
    public final void rule__SimpleService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2146:1: ( ( ( rule__SimpleService__NameAssignment_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2147:1: ( ( rule__SimpleService__NameAssignment_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2147:1: ( ( rule__SimpleService__NameAssignment_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2148:1: ( rule__SimpleService__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getNameAssignment_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2149:1: ( rule__SimpleService__NameAssignment_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2149:2: rule__SimpleService__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__NameAssignment_1_in_rule__SimpleService__Group__1__Impl4355);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2159:1: rule__SimpleService__Group__2 : rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3 ;
    public final void rule__SimpleService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2163:1: ( rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2164:2: rule__SimpleService__Group__2__Impl rule__SimpleService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__2__Impl_in_rule__SimpleService__Group__24385);
            rule__SimpleService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__3_in_rule__SimpleService__Group__24388);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2171:1: rule__SimpleService__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2175:1: ( ( '{' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2176:1: ( '{' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2176:1: ( '{' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2177:1: '{'
            {
             before(grammarAccess.getSimpleServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__SimpleService__Group__2__Impl4416); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2190:1: rule__SimpleService__Group__3 : rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4 ;
    public final void rule__SimpleService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2194:1: ( rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2195:2: rule__SimpleService__Group__3__Impl rule__SimpleService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__3__Impl_in_rule__SimpleService__Group__34447);
            rule__SimpleService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__4_in_rule__SimpleService__Group__34450);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2202:1: rule__SimpleService__Group__3__Impl : ( ( rule__SimpleService__Group_3__0 )? ) ;
    public final void rule__SimpleService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2206:1: ( ( ( rule__SimpleService__Group_3__0 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2207:1: ( ( rule__SimpleService__Group_3__0 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2207:1: ( ( rule__SimpleService__Group_3__0 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2208:1: ( rule__SimpleService__Group_3__0 )?
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_3()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2209:1: ( rule__SimpleService__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2209:2: rule__SimpleService__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__0_in_rule__SimpleService__Group__3__Impl4477);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2219:1: rule__SimpleService__Group__4 : rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5 ;
    public final void rule__SimpleService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2223:1: ( rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2224:2: rule__SimpleService__Group__4__Impl rule__SimpleService__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__4__Impl_in_rule__SimpleService__Group__44508);
            rule__SimpleService__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__5_in_rule__SimpleService__Group__44511);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2231:1: rule__SimpleService__Group__4__Impl : ( ( rule__SimpleService__Group_4__0 )? ) ;
    public final void rule__SimpleService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2235:1: ( ( ( rule__SimpleService__Group_4__0 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2236:1: ( ( rule__SimpleService__Group_4__0 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2236:1: ( ( rule__SimpleService__Group_4__0 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2237:1: ( rule__SimpleService__Group_4__0 )?
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_4()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2238:1: ( rule__SimpleService__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2238:2: rule__SimpleService__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__0_in_rule__SimpleService__Group__4__Impl4538);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2248:1: rule__SimpleService__Group__5 : rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6 ;
    public final void rule__SimpleService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2252:1: ( rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2253:2: rule__SimpleService__Group__5__Impl rule__SimpleService__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__5__Impl_in_rule__SimpleService__Group__54569);
            rule__SimpleService__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__6_in_rule__SimpleService__Group__54572);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2260:1: rule__SimpleService__Group__5__Impl : ( ( rule__SimpleService__Group_5__0 )* ) ;
    public final void rule__SimpleService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2264:1: ( ( ( rule__SimpleService__Group_5__0 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2265:1: ( ( rule__SimpleService__Group_5__0 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2265:1: ( ( rule__SimpleService__Group_5__0 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2266:1: ( rule__SimpleService__Group_5__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_5()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2267:1: ( rule__SimpleService__Group_5__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==43) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2267:2: rule__SimpleService__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__0_in_rule__SimpleService__Group__5__Impl4599);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2277:1: rule__SimpleService__Group__6 : rule__SimpleService__Group__6__Impl ;
    public final void rule__SimpleService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2281:1: ( rule__SimpleService__Group__6__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2282:2: rule__SimpleService__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group__6__Impl_in_rule__SimpleService__Group__64630);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2288:1: rule__SimpleService__Group__6__Impl : ( '}' ) ;
    public final void rule__SimpleService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2292:1: ( ( '}' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2293:1: ( '}' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2293:1: ( '}' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2294:1: '}'
            {
             before(grammarAccess.getSimpleServiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SimpleService__Group__6__Impl4658); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2321:1: rule__SimpleService__Group_3__0 : rule__SimpleService__Group_3__0__Impl rule__SimpleService__Group_3__1 ;
    public final void rule__SimpleService__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2325:1: ( rule__SimpleService__Group_3__0__Impl rule__SimpleService__Group_3__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2326:2: rule__SimpleService__Group_3__0__Impl rule__SimpleService__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__0__Impl_in_rule__SimpleService__Group_3__04703);
            rule__SimpleService__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__1_in_rule__SimpleService__Group_3__04706);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2333:1: rule__SimpleService__Group_3__0__Impl : ( 'input : ' ) ;
    public final void rule__SimpleService__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2337:1: ( ( 'input : ' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2338:1: ( 'input : ' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2338:1: ( 'input : ' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2339:1: 'input : '
            {
             before(grammarAccess.getSimpleServiceAccess().getInputKeyword_3_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__SimpleService__Group_3__0__Impl4734); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2352:1: rule__SimpleService__Group_3__1 : rule__SimpleService__Group_3__1__Impl rule__SimpleService__Group_3__2 ;
    public final void rule__SimpleService__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2356:1: ( rule__SimpleService__Group_3__1__Impl rule__SimpleService__Group_3__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2357:2: rule__SimpleService__Group_3__1__Impl rule__SimpleService__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__1__Impl_in_rule__SimpleService__Group_3__14765);
            rule__SimpleService__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__2_in_rule__SimpleService__Group_3__14768);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2364:1: rule__SimpleService__Group_3__1__Impl : ( ( rule__SimpleService__InputAssignment_3_1 ) ) ;
    public final void rule__SimpleService__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2368:1: ( ( ( rule__SimpleService__InputAssignment_3_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2369:1: ( ( rule__SimpleService__InputAssignment_3_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2369:1: ( ( rule__SimpleService__InputAssignment_3_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2370:1: ( rule__SimpleService__InputAssignment_3_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAssignment_3_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2371:1: ( rule__SimpleService__InputAssignment_3_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2371:2: rule__SimpleService__InputAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__InputAssignment_3_1_in_rule__SimpleService__Group_3__1__Impl4795);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2381:1: rule__SimpleService__Group_3__2 : rule__SimpleService__Group_3__2__Impl ;
    public final void rule__SimpleService__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2385:1: ( rule__SimpleService__Group_3__2__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2386:2: rule__SimpleService__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3__2__Impl_in_rule__SimpleService__Group_3__24825);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2392:1: rule__SimpleService__Group_3__2__Impl : ( ( rule__SimpleService__Group_3_2__0 )* ) ;
    public final void rule__SimpleService__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2396:1: ( ( ( rule__SimpleService__Group_3_2__0 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2397:1: ( ( rule__SimpleService__Group_3_2__0 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2397:1: ( ( rule__SimpleService__Group_3_2__0 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2398:1: ( rule__SimpleService__Group_3_2__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_3_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2399:1: ( rule__SimpleService__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2399:2: rule__SimpleService__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3_2__0_in_rule__SimpleService__Group_3__2__Impl4852);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2415:1: rule__SimpleService__Group_3_2__0 : rule__SimpleService__Group_3_2__0__Impl rule__SimpleService__Group_3_2__1 ;
    public final void rule__SimpleService__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2419:1: ( rule__SimpleService__Group_3_2__0__Impl rule__SimpleService__Group_3_2__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2420:2: rule__SimpleService__Group_3_2__0__Impl rule__SimpleService__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3_2__0__Impl_in_rule__SimpleService__Group_3_2__04889);
            rule__SimpleService__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3_2__1_in_rule__SimpleService__Group_3_2__04892);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2427:1: rule__SimpleService__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleService__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2431:1: ( ( ',' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2432:1: ( ',' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2432:1: ( ',' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2433:1: ','
            {
             before(grammarAccess.getSimpleServiceAccess().getCommaKeyword_3_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SimpleService__Group_3_2__0__Impl4920); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2446:1: rule__SimpleService__Group_3_2__1 : rule__SimpleService__Group_3_2__1__Impl ;
    public final void rule__SimpleService__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2450:1: ( rule__SimpleService__Group_3_2__1__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2451:2: rule__SimpleService__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_3_2__1__Impl_in_rule__SimpleService__Group_3_2__14951);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2457:1: rule__SimpleService__Group_3_2__1__Impl : ( ( rule__SimpleService__InputAssignment_3_2_1 ) ) ;
    public final void rule__SimpleService__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2461:1: ( ( ( rule__SimpleService__InputAssignment_3_2_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2462:1: ( ( rule__SimpleService__InputAssignment_3_2_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2462:1: ( ( rule__SimpleService__InputAssignment_3_2_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2463:1: ( rule__SimpleService__InputAssignment_3_2_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAssignment_3_2_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2464:1: ( rule__SimpleService__InputAssignment_3_2_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2464:2: rule__SimpleService__InputAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__InputAssignment_3_2_1_in_rule__SimpleService__Group_3_2__1__Impl4978);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2478:1: rule__SimpleService__Group_4__0 : rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1 ;
    public final void rule__SimpleService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2482:1: ( rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2483:2: rule__SimpleService__Group_4__0__Impl rule__SimpleService__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__0__Impl_in_rule__SimpleService__Group_4__05012);
            rule__SimpleService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__1_in_rule__SimpleService__Group_4__05015);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2490:1: rule__SimpleService__Group_4__0__Impl : ( 'output : ' ) ;
    public final void rule__SimpleService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2494:1: ( ( 'output : ' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2495:1: ( 'output : ' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2495:1: ( 'output : ' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2496:1: 'output : '
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputKeyword_4_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__SimpleService__Group_4__0__Impl5043); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2509:1: rule__SimpleService__Group_4__1 : rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2 ;
    public final void rule__SimpleService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2513:1: ( rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2514:2: rule__SimpleService__Group_4__1__Impl rule__SimpleService__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__1__Impl_in_rule__SimpleService__Group_4__15074);
            rule__SimpleService__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__2_in_rule__SimpleService__Group_4__15077);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2521:1: rule__SimpleService__Group_4__1__Impl : ( ( rule__SimpleService__OutputAssignment_4_1 ) ) ;
    public final void rule__SimpleService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2525:1: ( ( ( rule__SimpleService__OutputAssignment_4_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2526:1: ( ( rule__SimpleService__OutputAssignment_4_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2526:1: ( ( rule__SimpleService__OutputAssignment_4_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2527:1: ( rule__SimpleService__OutputAssignment_4_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAssignment_4_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2528:1: ( rule__SimpleService__OutputAssignment_4_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2528:2: rule__SimpleService__OutputAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__OutputAssignment_4_1_in_rule__SimpleService__Group_4__1__Impl5104);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2538:1: rule__SimpleService__Group_4__2 : rule__SimpleService__Group_4__2__Impl ;
    public final void rule__SimpleService__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2542:1: ( rule__SimpleService__Group_4__2__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2543:2: rule__SimpleService__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4__2__Impl_in_rule__SimpleService__Group_4__25134);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2549:1: rule__SimpleService__Group_4__2__Impl : ( ( rule__SimpleService__Group_4_2__0 )* ) ;
    public final void rule__SimpleService__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2553:1: ( ( ( rule__SimpleService__Group_4_2__0 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2554:1: ( ( rule__SimpleService__Group_4_2__0 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2554:1: ( ( rule__SimpleService__Group_4_2__0 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2555:1: ( rule__SimpleService__Group_4_2__0 )*
            {
             before(grammarAccess.getSimpleServiceAccess().getGroup_4_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2556:1: ( rule__SimpleService__Group_4_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2556:2: rule__SimpleService__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__0_in_rule__SimpleService__Group_4__2__Impl5161);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2572:1: rule__SimpleService__Group_4_2__0 : rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1 ;
    public final void rule__SimpleService__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2576:1: ( rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2577:2: rule__SimpleService__Group_4_2__0__Impl rule__SimpleService__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__0__Impl_in_rule__SimpleService__Group_4_2__05198);
            rule__SimpleService__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__1_in_rule__SimpleService__Group_4_2__05201);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2584:1: rule__SimpleService__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleService__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2588:1: ( ( ',' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2589:1: ( ',' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2589:1: ( ',' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2590:1: ','
            {
             before(grammarAccess.getSimpleServiceAccess().getCommaKeyword_4_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SimpleService__Group_4_2__0__Impl5229); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2603:1: rule__SimpleService__Group_4_2__1 : rule__SimpleService__Group_4_2__1__Impl ;
    public final void rule__SimpleService__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2607:1: ( rule__SimpleService__Group_4_2__1__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2608:2: rule__SimpleService__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_4_2__1__Impl_in_rule__SimpleService__Group_4_2__15260);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2614:1: rule__SimpleService__Group_4_2__1__Impl : ( ( rule__SimpleService__OutputAssignment_4_2_1 ) ) ;
    public final void rule__SimpleService__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2618:1: ( ( ( rule__SimpleService__OutputAssignment_4_2_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2619:1: ( ( rule__SimpleService__OutputAssignment_4_2_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2619:1: ( ( rule__SimpleService__OutputAssignment_4_2_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2620:1: ( rule__SimpleService__OutputAssignment_4_2_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAssignment_4_2_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2621:1: ( rule__SimpleService__OutputAssignment_4_2_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2621:2: rule__SimpleService__OutputAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__OutputAssignment_4_2_1_in_rule__SimpleService__Group_4_2__1__Impl5287);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2635:1: rule__SimpleService__Group_5__0 : rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1 ;
    public final void rule__SimpleService__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2639:1: ( rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2640:2: rule__SimpleService__Group_5__0__Impl rule__SimpleService__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__0__Impl_in_rule__SimpleService__Group_5__05321);
            rule__SimpleService__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__1_in_rule__SimpleService__Group_5__05324);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2647:1: rule__SimpleService__Group_5__0__Impl : ( 'when : ' ) ;
    public final void rule__SimpleService__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2651:1: ( ( 'when : ' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2652:1: ( 'when : ' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2652:1: ( 'when : ' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2653:1: 'when : '
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenKeyword_5_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__SimpleService__Group_5__0__Impl5352); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2666:1: rule__SimpleService__Group_5__1 : rule__SimpleService__Group_5__1__Impl ;
    public final void rule__SimpleService__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2670:1: ( rule__SimpleService__Group_5__1__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2671:2: rule__SimpleService__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__Group_5__1__Impl_in_rule__SimpleService__Group_5__15383);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2677:1: rule__SimpleService__Group_5__1__Impl : ( ( rule__SimpleService__WhenAssignment_5_1 ) ) ;
    public final void rule__SimpleService__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2681:1: ( ( ( rule__SimpleService__WhenAssignment_5_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2682:1: ( ( rule__SimpleService__WhenAssignment_5_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2682:1: ( ( rule__SimpleService__WhenAssignment_5_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2683:1: ( rule__SimpleService__WhenAssignment_5_1 )
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenAssignment_5_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2684:1: ( rule__SimpleService__WhenAssignment_5_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2684:2: rule__SimpleService__WhenAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleService__WhenAssignment_5_1_in_rule__SimpleService__Group_5__1__Impl5410);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2698:1: rule__MultiService__Group__0 : rule__MultiService__Group__0__Impl rule__MultiService__Group__1 ;
    public final void rule__MultiService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2702:1: ( rule__MultiService__Group__0__Impl rule__MultiService__Group__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2703:2: rule__MultiService__Group__0__Impl rule__MultiService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__0__Impl_in_rule__MultiService__Group__05444);
            rule__MultiService__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__1_in_rule__MultiService__Group__05447);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2710:1: rule__MultiService__Group__0__Impl : ( 'MultiService' ) ;
    public final void rule__MultiService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2714:1: ( ( 'MultiService' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2715:1: ( 'MultiService' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2715:1: ( 'MultiService' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2716:1: 'MultiService'
            {
             before(grammarAccess.getMultiServiceAccess().getMultiServiceKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__MultiService__Group__0__Impl5475); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2729:1: rule__MultiService__Group__1 : rule__MultiService__Group__1__Impl rule__MultiService__Group__2 ;
    public final void rule__MultiService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2733:1: ( rule__MultiService__Group__1__Impl rule__MultiService__Group__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2734:2: rule__MultiService__Group__1__Impl rule__MultiService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__1__Impl_in_rule__MultiService__Group__15506);
            rule__MultiService__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__2_in_rule__MultiService__Group__15509);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2741:1: rule__MultiService__Group__1__Impl : ( ( rule__MultiService__NameAssignment_1 ) ) ;
    public final void rule__MultiService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2745:1: ( ( ( rule__MultiService__NameAssignment_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2746:1: ( ( rule__MultiService__NameAssignment_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2746:1: ( ( rule__MultiService__NameAssignment_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2747:1: ( rule__MultiService__NameAssignment_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getNameAssignment_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2748:1: ( rule__MultiService__NameAssignment_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2748:2: rule__MultiService__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__NameAssignment_1_in_rule__MultiService__Group__1__Impl5536);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2758:1: rule__MultiService__Group__2 : rule__MultiService__Group__2__Impl rule__MultiService__Group__3 ;
    public final void rule__MultiService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2762:1: ( rule__MultiService__Group__2__Impl rule__MultiService__Group__3 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2763:2: rule__MultiService__Group__2__Impl rule__MultiService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__2__Impl_in_rule__MultiService__Group__25566);
            rule__MultiService__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__3_in_rule__MultiService__Group__25569);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2770:1: rule__MultiService__Group__2__Impl : ( ( rule__MultiService__Group_2__0 )? ) ;
    public final void rule__MultiService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2774:1: ( ( ( rule__MultiService__Group_2__0 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2775:1: ( ( rule__MultiService__Group_2__0 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2775:1: ( ( rule__MultiService__Group_2__0 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2776:1: ( rule__MultiService__Group_2__0 )?
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_2()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2777:1: ( rule__MultiService__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2777:2: rule__MultiService__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__0_in_rule__MultiService__Group__2__Impl5596);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2787:1: rule__MultiService__Group__3 : rule__MultiService__Group__3__Impl rule__MultiService__Group__4 ;
    public final void rule__MultiService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2791:1: ( rule__MultiService__Group__3__Impl rule__MultiService__Group__4 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2792:2: rule__MultiService__Group__3__Impl rule__MultiService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__3__Impl_in_rule__MultiService__Group__35627);
            rule__MultiService__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__4_in_rule__MultiService__Group__35630);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2799:1: rule__MultiService__Group__3__Impl : ( '{' ) ;
    public final void rule__MultiService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2803:1: ( ( '{' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2804:1: ( '{' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2804:1: ( '{' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2805:1: '{'
            {
             before(grammarAccess.getMultiServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__MultiService__Group__3__Impl5658); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2818:1: rule__MultiService__Group__4 : rule__MultiService__Group__4__Impl rule__MultiService__Group__5 ;
    public final void rule__MultiService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2822:1: ( rule__MultiService__Group__4__Impl rule__MultiService__Group__5 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2823:2: rule__MultiService__Group__4__Impl rule__MultiService__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__4__Impl_in_rule__MultiService__Group__45689);
            rule__MultiService__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__5_in_rule__MultiService__Group__45692);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2830:1: rule__MultiService__Group__4__Impl : ( ( rule__MultiService__Group_4__0 )* ) ;
    public final void rule__MultiService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2834:1: ( ( ( rule__MultiService__Group_4__0 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2835:1: ( ( rule__MultiService__Group_4__0 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2835:1: ( ( rule__MultiService__Group_4__0 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2836:1: ( rule__MultiService__Group_4__0 )*
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_4()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2837:1: ( rule__MultiService__Group_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==43) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2837:2: rule__MultiService__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__0_in_rule__MultiService__Group__4__Impl5719);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2847:1: rule__MultiService__Group__5 : rule__MultiService__Group__5__Impl rule__MultiService__Group__6 ;
    public final void rule__MultiService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2851:1: ( rule__MultiService__Group__5__Impl rule__MultiService__Group__6 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2852:2: rule__MultiService__Group__5__Impl rule__MultiService__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__5__Impl_in_rule__MultiService__Group__55750);
            rule__MultiService__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__6_in_rule__MultiService__Group__55753);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2859:1: rule__MultiService__Group__5__Impl : ( 'services : ' ) ;
    public final void rule__MultiService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2863:1: ( ( 'services : ' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2864:1: ( 'services : ' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2864:1: ( 'services : ' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2865:1: 'services : '
            {
             before(grammarAccess.getMultiServiceAccess().getServicesKeyword_5()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MultiService__Group__5__Impl5781); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2878:1: rule__MultiService__Group__6 : rule__MultiService__Group__6__Impl rule__MultiService__Group__7 ;
    public final void rule__MultiService__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2882:1: ( rule__MultiService__Group__6__Impl rule__MultiService__Group__7 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2883:2: rule__MultiService__Group__6__Impl rule__MultiService__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__6__Impl_in_rule__MultiService__Group__65812);
            rule__MultiService__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__7_in_rule__MultiService__Group__65815);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2890:1: rule__MultiService__Group__6__Impl : ( ( rule__MultiService__ServicesAssignment_6 ) ) ;
    public final void rule__MultiService__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2894:1: ( ( ( rule__MultiService__ServicesAssignment_6 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2895:1: ( ( rule__MultiService__ServicesAssignment_6 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2895:1: ( ( rule__MultiService__ServicesAssignment_6 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2896:1: ( rule__MultiService__ServicesAssignment_6 )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesAssignment_6()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2897:1: ( rule__MultiService__ServicesAssignment_6 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2897:2: rule__MultiService__ServicesAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__ServicesAssignment_6_in_rule__MultiService__Group__6__Impl5842);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2907:1: rule__MultiService__Group__7 : rule__MultiService__Group__7__Impl rule__MultiService__Group__8 ;
    public final void rule__MultiService__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2911:1: ( rule__MultiService__Group__7__Impl rule__MultiService__Group__8 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2912:2: rule__MultiService__Group__7__Impl rule__MultiService__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__7__Impl_in_rule__MultiService__Group__75872);
            rule__MultiService__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__8_in_rule__MultiService__Group__75875);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2919:1: rule__MultiService__Group__7__Impl : ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) ) ;
    public final void rule__MultiService__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2923:1: ( ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2924:1: ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2924:1: ( ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2925:1: ( ( rule__MultiService__Group_7__0 ) ) ( ( rule__MultiService__Group_7__0 )* )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2925:1: ( ( rule__MultiService__Group_7__0 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2926:1: ( rule__MultiService__Group_7__0 )
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_7()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2927:1: ( rule__MultiService__Group_7__0 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2927:2: rule__MultiService__Group_7__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl5904);
            rule__MultiService__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiServiceAccess().getGroup_7()); 

            }

            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2930:1: ( ( rule__MultiService__Group_7__0 )* )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2931:1: ( rule__MultiService__Group_7__0 )*
            {
             before(grammarAccess.getMultiServiceAccess().getGroup_7()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2932:1: ( rule__MultiService__Group_7__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2932:2: rule__MultiService__Group_7__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl5916);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2943:1: rule__MultiService__Group__8 : rule__MultiService__Group__8__Impl ;
    public final void rule__MultiService__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2947:1: ( rule__MultiService__Group__8__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2948:2: rule__MultiService__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group__8__Impl_in_rule__MultiService__Group__85949);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2954:1: rule__MultiService__Group__8__Impl : ( '}' ) ;
    public final void rule__MultiService__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2958:1: ( ( '}' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2959:1: ( '}' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2959:1: ( '}' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2960:1: '}'
            {
             before(grammarAccess.getMultiServiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__MultiService__Group__8__Impl5977); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2991:1: rule__MultiService__Group_2__0 : rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1 ;
    public final void rule__MultiService__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2995:1: ( rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:2996:2: rule__MultiService__Group_2__0__Impl rule__MultiService__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__0__Impl_in_rule__MultiService__Group_2__06026);
            rule__MultiService__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__1_in_rule__MultiService__Group_2__06029);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3003:1: rule__MultiService__Group_2__0__Impl : ( '[' ) ;
    public final void rule__MultiService__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3007:1: ( ( '[' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3008:1: ( '[' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3008:1: ( '[' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3009:1: '['
            {
             before(grammarAccess.getMultiServiceAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__MultiService__Group_2__0__Impl6057); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3022:1: rule__MultiService__Group_2__1 : rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2 ;
    public final void rule__MultiService__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3026:1: ( rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3027:2: rule__MultiService__Group_2__1__Impl rule__MultiService__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__1__Impl_in_rule__MultiService__Group_2__16088);
            rule__MultiService__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__2_in_rule__MultiService__Group_2__16091);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3034:1: rule__MultiService__Group_2__1__Impl : ( ( rule__MultiService__ParallelAssignment_2_1 )? ) ;
    public final void rule__MultiService__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3038:1: ( ( ( rule__MultiService__ParallelAssignment_2_1 )? ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3039:1: ( ( rule__MultiService__ParallelAssignment_2_1 )? )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3039:1: ( ( rule__MultiService__ParallelAssignment_2_1 )? )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3040:1: ( rule__MultiService__ParallelAssignment_2_1 )?
            {
             before(grammarAccess.getMultiServiceAccess().getParallelAssignment_2_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3041:1: ( rule__MultiService__ParallelAssignment_2_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3041:2: rule__MultiService__ParallelAssignment_2_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiService__ParallelAssignment_2_1_in_rule__MultiService__Group_2__1__Impl6118);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3051:1: rule__MultiService__Group_2__2 : rule__MultiService__Group_2__2__Impl ;
    public final void rule__MultiService__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3055:1: ( rule__MultiService__Group_2__2__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3056:2: rule__MultiService__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_2__2__Impl_in_rule__MultiService__Group_2__26149);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3062:1: rule__MultiService__Group_2__2__Impl : ( ']' ) ;
    public final void rule__MultiService__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3066:1: ( ( ']' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3067:1: ( ']' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3067:1: ( ']' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3068:1: ']'
            {
             before(grammarAccess.getMultiServiceAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__MultiService__Group_2__2__Impl6177); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3087:1: rule__MultiService__Group_4__0 : rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1 ;
    public final void rule__MultiService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3091:1: ( rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3092:2: rule__MultiService__Group_4__0__Impl rule__MultiService__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__0__Impl_in_rule__MultiService__Group_4__06214);
            rule__MultiService__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__1_in_rule__MultiService__Group_4__06217);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3099:1: rule__MultiService__Group_4__0__Impl : ( 'when : ' ) ;
    public final void rule__MultiService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3103:1: ( ( 'when : ' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3104:1: ( 'when : ' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3104:1: ( 'when : ' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3105:1: 'when : '
            {
             before(grammarAccess.getMultiServiceAccess().getWhenKeyword_4_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__MultiService__Group_4__0__Impl6245); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3118:1: rule__MultiService__Group_4__1 : rule__MultiService__Group_4__1__Impl ;
    public final void rule__MultiService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3122:1: ( rule__MultiService__Group_4__1__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3123:2: rule__MultiService__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_4__1__Impl_in_rule__MultiService__Group_4__16276);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3129:1: rule__MultiService__Group_4__1__Impl : ( ( rule__MultiService__WhenAssignment_4_1 ) ) ;
    public final void rule__MultiService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3133:1: ( ( ( rule__MultiService__WhenAssignment_4_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3134:1: ( ( rule__MultiService__WhenAssignment_4_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3134:1: ( ( rule__MultiService__WhenAssignment_4_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3135:1: ( rule__MultiService__WhenAssignment_4_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getWhenAssignment_4_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3136:1: ( rule__MultiService__WhenAssignment_4_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3136:2: rule__MultiService__WhenAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__WhenAssignment_4_1_in_rule__MultiService__Group_4__1__Impl6303);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3150:1: rule__MultiService__Group_7__0 : rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1 ;
    public final void rule__MultiService__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3154:1: ( rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3155:2: rule__MultiService__Group_7__0__Impl rule__MultiService__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__0__Impl_in_rule__MultiService__Group_7__06337);
            rule__MultiService__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__1_in_rule__MultiService__Group_7__06340);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3162:1: rule__MultiService__Group_7__0__Impl : ( ',' ) ;
    public final void rule__MultiService__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3166:1: ( ( ',' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3167:1: ( ',' )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3167:1: ( ',' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3168:1: ','
            {
             before(grammarAccess.getMultiServiceAccess().getCommaKeyword_7_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MultiService__Group_7__0__Impl6368); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3181:1: rule__MultiService__Group_7__1 : rule__MultiService__Group_7__1__Impl ;
    public final void rule__MultiService__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3185:1: ( rule__MultiService__Group_7__1__Impl )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3186:2: rule__MultiService__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__Group_7__1__Impl_in_rule__MultiService__Group_7__16399);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3192:1: rule__MultiService__Group_7__1__Impl : ( ( rule__MultiService__ServicesAssignment_7_1 ) ) ;
    public final void rule__MultiService__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3196:1: ( ( ( rule__MultiService__ServicesAssignment_7_1 ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3197:1: ( ( rule__MultiService__ServicesAssignment_7_1 ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3197:1: ( ( rule__MultiService__ServicesAssignment_7_1 ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3198:1: ( rule__MultiService__ServicesAssignment_7_1 )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesAssignment_7_1()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3199:1: ( rule__MultiService__ServicesAssignment_7_1 )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3199:2: rule__MultiService__ServicesAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiService__ServicesAssignment_7_1_in_rule__MultiService__Group_7__1__Impl6426);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3214:1: rule__Root__ArtifactsAssignment_0 : ( ruleArtifact ) ;
    public final void rule__Root__ArtifactsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3218:1: ( ( ruleArtifact ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3219:1: ( ruleArtifact )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3219:1: ( ruleArtifact )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3220:1: ruleArtifact
            {
             before(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_06465);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3229:1: rule__Root__ArtifactsAssignment_1_0 : ( ruleArtifact ) ;
    public final void rule__Root__ArtifactsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3233:1: ( ( ruleArtifact ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3234:1: ( ruleArtifact )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3234:1: ( ruleArtifact )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3235:1: ruleArtifact
            {
             before(grammarAccess.getRootAccess().getArtifactsArtifactParserRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_1_06496);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3244:1: rule__Root__EntitiesAssignment_1_1 : ( ruleEntity ) ;
    public final void rule__Root__EntitiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3248:1: ( ( ruleEntity ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3249:1: ( ruleEntity )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3249:1: ( ruleEntity )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3250:1: ruleEntity
            {
             before(grammarAccess.getRootAccess().getEntitiesEntityParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Root__EntitiesAssignment_1_16527);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3259:1: rule__Root__ServicesAssignment_1_2 : ( ruleService ) ;
    public final void rule__Root__ServicesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3263:1: ( ( ruleService ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3264:1: ( ruleService )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3264:1: ( ruleService )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3265:1: ruleService
            {
             before(grammarAccess.getRootAccess().getServicesServiceParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleService_in_rule__Root__ServicesAssignment_1_26558);
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


    // $ANTLR start "rule__Artifact__NameAssignment_2"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3274:1: rule__Artifact__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Artifact__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3278:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3279:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3279:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3280:1: ruleEString
            {
             before(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Artifact__NameAssignment_26589);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__NameAssignment_2"


    // $ANTLR start "rule__Artifact__ExtensionAssignment_3_1_2"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3289:1: rule__Artifact__ExtensionAssignment_3_1_2 : ( ruleEString ) ;
    public final void rule__Artifact__ExtensionAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3293:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3294:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3294:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3295:1: ruleEString
            {
             before(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_3_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Artifact__ExtensionAssignment_3_1_26620);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getExtensionEStringParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__ExtensionAssignment_3_1_2"


    // $ANTLR start "rule__Artifact__FormatAssignment_3_2_1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3304:1: rule__Artifact__FormatAssignment_3_2_1 : ( ruleFormatEnum ) ;
    public final void rule__Artifact__FormatAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3308:1: ( ( ruleFormatEnum ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3309:1: ( ruleFormatEnum )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3309:1: ( ruleFormatEnum )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3310:1: ruleFormatEnum
            {
             before(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFormatEnum_in_rule__Artifact__FormatAssignment_3_2_16651);
            ruleFormatEnum();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getFormatFormatEnumEnumRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__FormatAssignment_3_2_1"


    // $ANTLR start "rule__Artifact__BasicServicesAssignment_3_3_1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3319:1: rule__Artifact__BasicServicesAssignment_3_3_1 : ( ruleServiceEnum ) ;
    public final void rule__Artifact__BasicServicesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3323:1: ( ( ruleServiceEnum ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3324:1: ( ruleServiceEnum )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3324:1: ( ruleServiceEnum )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3325:1: ruleServiceEnum
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_3_3_16682);
            ruleServiceEnum();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__BasicServicesAssignment_3_3_1"


    // $ANTLR start "rule__Artifact__BasicServicesAssignment_3_3_2_1"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3334:1: rule__Artifact__BasicServicesAssignment_3_3_2_1 : ( ruleServiceEnum ) ;
    public final void rule__Artifact__BasicServicesAssignment_3_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3338:1: ( ( ruleServiceEnum ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3339:1: ( ruleServiceEnum )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3339:1: ( ruleServiceEnum )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3340:1: ruleServiceEnum
            {
             before(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_3_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_3_3_2_16713);
            ruleServiceEnum();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getBasicServicesServiceEnumEnumRuleCall_3_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__BasicServicesAssignment_3_3_2_1"


    // $ANTLR start "rule__Artifact__AttributesAssignment_5"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3349:1: rule__Artifact__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Artifact__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3353:1: ( ( ruleAttribute ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3354:1: ( ruleAttribute )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3354:1: ( ruleAttribute )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3355:1: ruleAttribute
            {
             before(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Artifact__AttributesAssignment_56744);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getAttributesAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__AttributesAssignment_5"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3364:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3368:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3369:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3369:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3370:1: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Entity__NameAssignment_26775);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__AttributesAssignment_4"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3379:1: rule__Entity__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3383:1: ( ( ruleAttribute ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3384:1: ( ruleAttribute )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3384:1: ( ruleAttribute )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3385:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_46806);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_4"


    // $ANTLR start "rule__SimpleAttribute__ManyAssignment_0"
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3394:1: rule__SimpleAttribute__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__SimpleAttribute__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3398:1: ( ( ( 'many' ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3399:1: ( ( 'many' ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3399:1: ( ( 'many' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3400:1: ( 'many' )
            {
             before(grammarAccess.getSimpleAttributeAccess().getManyManyKeyword_0_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3401:1: ( 'many' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3402:1: 'many'
            {
             before(grammarAccess.getSimpleAttributeAccess().getManyManyKeyword_0_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__SimpleAttribute__ManyAssignment_06842); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3417:1: rule__SimpleAttribute__RequiredAssignment_1 : ( ( 'required' ) ) ;
    public final void rule__SimpleAttribute__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3421:1: ( ( ( 'required' ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3422:1: ( ( 'required' ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3422:1: ( ( 'required' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3423:1: ( 'required' )
            {
             before(grammarAccess.getSimpleAttributeAccess().getRequiredRequiredKeyword_1_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3424:1: ( 'required' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3425:1: 'required'
            {
             before(grammarAccess.getSimpleAttributeAccess().getRequiredRequiredKeyword_1_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__SimpleAttribute__RequiredAssignment_16886); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3440:1: rule__SimpleAttribute__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SimpleAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3444:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3445:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3445:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3446:1: ruleEString
            {
             before(grammarAccess.getSimpleAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleAttribute__NameAssignment_26925);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3455:1: rule__SimpleAttribute__DataAssignment_4 : ( ruleDataEnum ) ;
    public final void rule__SimpleAttribute__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3459:1: ( ( ruleDataEnum ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3460:1: ( ruleDataEnum )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3460:1: ( ruleDataEnum )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3461:1: ruleDataEnum
            {
             before(grammarAccess.getSimpleAttributeAccess().getDataDataEnumEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataEnum_in_rule__SimpleAttribute__DataAssignment_46956);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3470:1: rule__MultiAttribute__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__MultiAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3474:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3475:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3475:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3476:1: ruleEString
            {
             before(grammarAccess.getMultiAttributeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiAttribute__NameAssignment_06987);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3485:1: rule__MultiAttribute__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__MultiAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3489:1: ( ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3490:1: ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3490:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3491:1: ( ruleEString )
            {
             before(grammarAccess.getMultiAttributeAccess().getTypeEntityCrossReference_2_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3492:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3493:1: ruleEString
            {
             before(grammarAccess.getMultiAttributeAccess().getTypeEntityEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiAttribute__TypeAssignment_27022);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3504:1: rule__OnService__ArtifactAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__OnService__ArtifactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3508:1: ( ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3509:1: ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3509:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3510:1: ( ruleEString )
            {
             before(grammarAccess.getOnServiceAccess().getArtifactArtifactCrossReference_0_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3511:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3512:1: ruleEString
            {
             before(grammarAccess.getOnServiceAccess().getArtifactArtifactEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__OnService__ArtifactAssignment_07061);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3523:1: rule__OnService__WhenServicesAssignment_2 : ( ruleServiceEnum ) ;
    public final void rule__OnService__WhenServicesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3527:1: ( ( ruleServiceEnum ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3528:1: ( ruleServiceEnum )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3528:1: ( ruleServiceEnum )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3529:1: ruleServiceEnum
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_27096);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3538:1: rule__OnService__WhenServicesAssignment_3_1 : ( ruleServiceEnum ) ;
    public final void rule__OnService__WhenServicesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3542:1: ( ( ruleServiceEnum ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3543:1: ( ruleServiceEnum )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3543:1: ( ruleServiceEnum )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3544:1: ruleServiceEnum
            {
             before(grammarAccess.getOnServiceAccess().getWhenServicesServiceEnumEnumRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_3_17127);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3553:1: rule__SimpleService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SimpleService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3557:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3558:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3558:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3559:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__NameAssignment_17158);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3568:1: rule__SimpleService__InputAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SimpleService__InputAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3572:1: ( ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3573:1: ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3573:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3574:1: ( ruleEString )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_1_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3575:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3576:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__InputAssignment_3_17193);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3587:1: rule__SimpleService__InputAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__SimpleService__InputAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3591:1: ( ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3592:1: ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3592:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3593:1: ( ruleEString )
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityCrossReference_3_2_1_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3594:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3595:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getInputAbstractEntityEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__InputAssignment_3_2_17232);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3606:1: rule__SimpleService__OutputAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__SimpleService__OutputAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3610:1: ( ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3611:1: ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3611:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3612:1: ( ruleEString )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_1_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3613:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3614:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__OutputAssignment_4_17271);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3625:1: rule__SimpleService__OutputAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__SimpleService__OutputAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3629:1: ( ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3630:1: ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3630:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3631:1: ( ruleEString )
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityCrossReference_4_2_1_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3632:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3633:1: ruleEString
            {
             before(grammarAccess.getSimpleServiceAccess().getOutputAbstractEntityEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SimpleService__OutputAssignment_4_2_17310);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3644:1: rule__SimpleService__WhenAssignment_5_1 : ( ruleOnService ) ;
    public final void rule__SimpleService__WhenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3648:1: ( ( ruleOnService ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3649:1: ( ruleOnService )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3649:1: ( ruleOnService )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3650:1: ruleOnService
            {
             before(grammarAccess.getSimpleServiceAccess().getWhenOnServiceParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_rule__SimpleService__WhenAssignment_5_17345);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3659:1: rule__MultiService__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MultiService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3663:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3664:1: ( ruleEString )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3664:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3665:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__NameAssignment_17376);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3674:1: rule__MultiService__ParallelAssignment_2_1 : ( ( 'parallel' ) ) ;
    public final void rule__MultiService__ParallelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3678:1: ( ( ( 'parallel' ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3679:1: ( ( 'parallel' ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3679:1: ( ( 'parallel' ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3680:1: ( 'parallel' )
            {
             before(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3681:1: ( 'parallel' )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3682:1: 'parallel'
            {
             before(grammarAccess.getMultiServiceAccess().getParallelParallelKeyword_2_1_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__MultiService__ParallelAssignment_2_17412); 
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3697:1: rule__MultiService__WhenAssignment_4_1 : ( ruleOnService ) ;
    public final void rule__MultiService__WhenAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3701:1: ( ( ruleOnService ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3702:1: ( ruleOnService )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3702:1: ( ruleOnService )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3703:1: ruleOnService
            {
             before(grammarAccess.getMultiServiceAccess().getWhenOnServiceParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOnService_in_rule__MultiService__WhenAssignment_4_17451);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3712:1: rule__MultiService__ServicesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__MultiService__ServicesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3716:1: ( ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3717:1: ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3717:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3718:1: ( ruleEString )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_6_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3719:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3720:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_6_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_67486);
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
    // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3731:1: rule__MultiService__ServicesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__MultiService__ServicesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3735:1: ( ( ( ruleEString ) ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3736:1: ( ( ruleEString ) )
            {
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3736:1: ( ( ruleEString ) )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3737:1: ( ruleEString )
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceCrossReference_7_1_0()); 
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3738:1: ( ruleEString )
            // ../miso.carrascal.codeGenerator.ui/src-gen/miso/carrascal/codeGenerator/ui/contentassist/antlr/internal/InternalRules.g:3739:1: ruleEString
            {
             before(grammarAccess.getMultiServiceAccess().getServicesServiceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_7_17525);
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
        public static final BitSet FOLLOW_rule__Artifact__Group__0__Impl_in_rule__Artifact__Group__01582 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group__1_in_rule__Artifact__Group__01585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__1__Impl_in_rule__Artifact__Group__11643 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__2_in_rule__Artifact__Group__11646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Artifact__Group__1__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__2__Impl_in_rule__Artifact__Group__21705 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group__3_in_rule__Artifact__Group__21708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__NameAssignment_2_in_rule__Artifact__Group__2__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__3__Impl_in_rule__Artifact__Group__31765 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group__4_in_rule__Artifact__Group__31768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__0_in_rule__Artifact__Group__3__Impl1795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__4__Impl_in_rule__Artifact__Group__41826 = new BitSet(new long[]{0x0000600040000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__5_in_rule__Artifact__Group__41829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Artifact__Group__4__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group__5__Impl_in_rule__Artifact__Group__51888 = new BitSet(new long[]{0x0000600040000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group__6_in_rule__Artifact__Group__51891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__AttributesAssignment_5_in_rule__Artifact__Group__5__Impl1918 = new BitSet(new long[]{0x0000600000000032L});
        public static final BitSet FOLLOW_rule__Artifact__Group__6__Impl_in_rule__Artifact__Group__61949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Artifact__Group__6__Impl1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__0__Impl_in_rule__Artifact__Group_3__02022 = new BitSet(new long[]{0x0000001B00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__1_in_rule__Artifact__Group_3__02025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Artifact__Group_3__0__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__1__Impl_in_rule__Artifact__Group_3__12084 = new BitSet(new long[]{0x0000001B00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__2_in_rule__Artifact__Group_3__12087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_1__0_in_rule__Artifact__Group_3__1__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__2__Impl_in_rule__Artifact__Group_3__22145 = new BitSet(new long[]{0x0000001B00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__3_in_rule__Artifact__Group_3__22148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_2__0_in_rule__Artifact__Group_3__2__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__3__Impl_in_rule__Artifact__Group_3__32206 = new BitSet(new long[]{0x0000001B00000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__4_in_rule__Artifact__Group_3__32209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3__0_in_rule__Artifact__Group_3__3__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3__4__Impl_in_rule__Artifact__Group_3__42267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Artifact__Group_3__4__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_1__0__Impl_in_rule__Artifact__Group_3_1__02336 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_1__1_in_rule__Artifact__Group_3_1__02339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Artifact__Group_3_1__0__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_1__1__Impl_in_rule__Artifact__Group_3_1__12398 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_1__2_in_rule__Artifact__Group_3_1__12401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Artifact__Group_3_1__1__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_1__2__Impl_in_rule__Artifact__Group_3_1__22460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__ExtensionAssignment_3_1_2_in_rule__Artifact__Group_3_1__2__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_2__0__Impl_in_rule__Artifact__Group_3_2__02523 = new BitSet(new long[]{0x000000000003F800L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_2__1_in_rule__Artifact__Group_3_2__02526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Artifact__Group_3_2__0__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_2__1__Impl_in_rule__Artifact__Group_3_2__12585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__FormatAssignment_3_2_1_in_rule__Artifact__Group_3_2__1__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3__0__Impl_in_rule__Artifact__Group_3_3__02646 = new BitSet(new long[]{0x0000000000FC0000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3__1_in_rule__Artifact__Group_3_3__02649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Artifact__Group_3_3__0__Impl2677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3__1__Impl_in_rule__Artifact__Group_3_3__12708 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3__2_in_rule__Artifact__Group_3_3__12711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__BasicServicesAssignment_3_3_1_in_rule__Artifact__Group_3_3__1__Impl2738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3__2__Impl_in_rule__Artifact__Group_3_3__22768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3_2__0_in_rule__Artifact__Group_3_3__2__Impl2795 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3_2__0__Impl_in_rule__Artifact__Group_3_3_2__02832 = new BitSet(new long[]{0x0000000000FC0000L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3_2__1_in_rule__Artifact__Group_3_3_2__02835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Artifact__Group_3_3_2__0__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__Group_3_3_2__1__Impl_in_rule__Artifact__Group_3_3_2__12894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Artifact__BasicServicesAssignment_3_3_2_1_in_rule__Artifact__Group_3_3_2__1__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02955 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__13016 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__13019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Entity__Group__1__Impl3047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__23078 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__23081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__33138 = new BitSet(new long[]{0x0000600040000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__33141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Entity__Group__3__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__43200 = new BitSet(new long[]{0x0000600040000030L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__43203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_4_in_rule__Entity__Group__4__Impl3230 = new BitSet(new long[]{0x0000600000000032L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__53261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Entity__Group__5__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__0__Impl_in_rule__SimpleAttribute__Group__03332 = new BitSet(new long[]{0x0000600000000030L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1_in_rule__SimpleAttribute__Group__03335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__ManyAssignment_0_in_rule__SimpleAttribute__Group__0__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__1__Impl_in_rule__SimpleAttribute__Group__13393 = new BitSet(new long[]{0x0000600000000030L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__2_in_rule__SimpleAttribute__Group__13396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__RequiredAssignment_1_in_rule__SimpleAttribute__Group__1__Impl3423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__2__Impl_in_rule__SimpleAttribute__Group__23454 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__3_in_rule__SimpleAttribute__Group__23457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__NameAssignment_2_in_rule__SimpleAttribute__Group__2__Impl3484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__3__Impl_in_rule__SimpleAttribute__Group__33514 = new BitSet(new long[]{0x000000000F000000L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__4_in_rule__SimpleAttribute__Group__33517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__SimpleAttribute__Group__3__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__Group__4__Impl_in_rule__SimpleAttribute__Group__43576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleAttribute__DataAssignment_4_in_rule__SimpleAttribute__Group__4__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__0__Impl_in_rule__MultiAttribute__Group__03643 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__1_in_rule__MultiAttribute__Group__03646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__NameAssignment_0_in_rule__MultiAttribute__Group__0__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__1__Impl_in_rule__MultiAttribute__Group__13703 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__2_in_rule__MultiAttribute__Group__13706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__MultiAttribute__Group__1__Impl3734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__Group__2__Impl_in_rule__MultiAttribute__Group__23765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiAttribute__TypeAssignment_2_in_rule__MultiAttribute__Group__2__Impl3792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__0__Impl_in_rule__OnService__Group__03828 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__1_in_rule__OnService__Group__03831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__ArtifactAssignment_0_in_rule__OnService__Group__0__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__1__Impl_in_rule__OnService__Group__13888 = new BitSet(new long[]{0x0000000000FC0000L});
        public static final BitSet FOLLOW_rule__OnService__Group__2_in_rule__OnService__Group__13891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__OnService__Group__1__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__2__Impl_in_rule__OnService__Group__23950 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__3_in_rule__OnService__Group__23953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__WhenServicesAssignment_2_in_rule__OnService__Group__2__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__3__Impl_in_rule__OnService__Group__34010 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_rule__OnService__Group__4_in_rule__OnService__Group__34013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__0_in_rule__OnService__Group__3__Impl4040 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group__4__Impl_in_rule__OnService__Group__44071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__OnService__Group__4__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__0__Impl_in_rule__OnService__Group_3__04140 = new BitSet(new long[]{0x0000000000FC0000L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__1_in_rule__OnService__Group_3__04143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__OnService__Group_3__0__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__Group_3__1__Impl_in_rule__OnService__Group_3__14202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OnService__WhenServicesAssignment_3_1_in_rule__OnService__Group_3__1__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__0__Impl_in_rule__SimpleService__Group__04263 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__1_in_rule__SimpleService__Group__04266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__SimpleService__Group__0__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__1__Impl_in_rule__SimpleService__Group__14325 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__2_in_rule__SimpleService__Group__14328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__NameAssignment_1_in_rule__SimpleService__Group__1__Impl4355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__2__Impl_in_rule__SimpleService__Group__24385 = new BitSet(new long[]{0x00000E0040000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__3_in_rule__SimpleService__Group__24388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SimpleService__Group__2__Impl4416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__3__Impl_in_rule__SimpleService__Group__34447 = new BitSet(new long[]{0x00000E0040000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__4_in_rule__SimpleService__Group__34450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__0_in_rule__SimpleService__Group__3__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__4__Impl_in_rule__SimpleService__Group__44508 = new BitSet(new long[]{0x00000E0040000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__5_in_rule__SimpleService__Group__44511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__0_in_rule__SimpleService__Group__4__Impl4538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__5__Impl_in_rule__SimpleService__Group__54569 = new BitSet(new long[]{0x00000E0040000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__6_in_rule__SimpleService__Group__54572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__0_in_rule__SimpleService__Group__5__Impl4599 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group__6__Impl_in_rule__SimpleService__Group__64630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SimpleService__Group__6__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__0__Impl_in_rule__SimpleService__Group_3__04703 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__1_in_rule__SimpleService__Group_3__04706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__SimpleService__Group_3__0__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__1__Impl_in_rule__SimpleService__Group_3__14765 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__2_in_rule__SimpleService__Group_3__14768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__InputAssignment_3_1_in_rule__SimpleService__Group_3__1__Impl4795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3__2__Impl_in_rule__SimpleService__Group_3__24825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3_2__0_in_rule__SimpleService__Group_3__2__Impl4852 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3_2__0__Impl_in_rule__SimpleService__Group_3_2__04889 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3_2__1_in_rule__SimpleService__Group_3_2__04892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SimpleService__Group_3_2__0__Impl4920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_3_2__1__Impl_in_rule__SimpleService__Group_3_2__14951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__InputAssignment_3_2_1_in_rule__SimpleService__Group_3_2__1__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__0__Impl_in_rule__SimpleService__Group_4__05012 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__1_in_rule__SimpleService__Group_4__05015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__SimpleService__Group_4__0__Impl5043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__1__Impl_in_rule__SimpleService__Group_4__15074 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__2_in_rule__SimpleService__Group_4__15077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__OutputAssignment_4_1_in_rule__SimpleService__Group_4__1__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4__2__Impl_in_rule__SimpleService__Group_4__25134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__0_in_rule__SimpleService__Group_4__2__Impl5161 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__0__Impl_in_rule__SimpleService__Group_4_2__05198 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__1_in_rule__SimpleService__Group_4_2__05201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SimpleService__Group_4_2__0__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_4_2__1__Impl_in_rule__SimpleService__Group_4_2__15260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__OutputAssignment_4_2_1_in_rule__SimpleService__Group_4_2__1__Impl5287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__0__Impl_in_rule__SimpleService__Group_5__05321 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__1_in_rule__SimpleService__Group_5__05324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__SimpleService__Group_5__0__Impl5352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__Group_5__1__Impl_in_rule__SimpleService__Group_5__15383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleService__WhenAssignment_5_1_in_rule__SimpleService__Group_5__1__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__0__Impl_in_rule__MultiService__Group__05444 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group__1_in_rule__MultiService__Group__05447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__MultiService__Group__0__Impl5475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__1__Impl_in_rule__MultiService__Group__15506 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__2_in_rule__MultiService__Group__15509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__NameAssignment_1_in_rule__MultiService__Group__1__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__2__Impl_in_rule__MultiService__Group__25566 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__3_in_rule__MultiService__Group__25569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__0_in_rule__MultiService__Group__2__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__3__Impl_in_rule__MultiService__Group__35627 = new BitSet(new long[]{0x0000081000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__4_in_rule__MultiService__Group__35630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__MultiService__Group__3__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__4__Impl_in_rule__MultiService__Group__45689 = new BitSet(new long[]{0x0000081000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__5_in_rule__MultiService__Group__45692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__0_in_rule__MultiService__Group__4__Impl5719 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__5__Impl_in_rule__MultiService__Group__55750 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group__6_in_rule__MultiService__Group__55753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MultiService__Group__5__Impl5781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__6__Impl_in_rule__MultiService__Group__65812 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__7_in_rule__MultiService__Group__65815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ServicesAssignment_6_in_rule__MultiService__Group__6__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__7__Impl_in_rule__MultiService__Group__75872 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group__8_in_rule__MultiService__Group__75875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl5904 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0_in_rule__MultiService__Group__7__Impl5916 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group__8__Impl_in_rule__MultiService__Group__85949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__MultiService__Group__8__Impl5977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__0__Impl_in_rule__MultiService__Group_2__06026 = new BitSet(new long[]{0x0000800100000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__1_in_rule__MultiService__Group_2__06029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__MultiService__Group_2__0__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__1__Impl_in_rule__MultiService__Group_2__16088 = new BitSet(new long[]{0x0000800100000000L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__2_in_rule__MultiService__Group_2__16091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ParallelAssignment_2_1_in_rule__MultiService__Group_2__1__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_2__2__Impl_in_rule__MultiService__Group_2__26149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__MultiService__Group_2__2__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__0__Impl_in_rule__MultiService__Group_4__06214 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__1_in_rule__MultiService__Group_4__06217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__MultiService__Group_4__0__Impl6245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_4__1__Impl_in_rule__MultiService__Group_4__16276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__WhenAssignment_4_1_in_rule__MultiService__Group_4__1__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__0__Impl_in_rule__MultiService__Group_7__06337 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__1_in_rule__MultiService__Group_7__06340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MultiService__Group_7__0__Impl6368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__Group_7__1__Impl_in_rule__MultiService__Group_7__16399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiService__ServicesAssignment_7_1_in_rule__MultiService__Group_7__1__Impl6426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_06465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArtifact_in_rule__Root__ArtifactsAssignment_1_06496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Root__EntitiesAssignment_1_16527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleService_in_rule__Root__ServicesAssignment_1_26558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Artifact__NameAssignment_26589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Artifact__ExtensionAssignment_3_1_26620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFormatEnum_in_rule__Artifact__FormatAssignment_3_2_16651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_3_3_16682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__Artifact__BasicServicesAssignment_3_3_2_16713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Artifact__AttributesAssignment_56744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Entity__NameAssignment_26775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_46806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__SimpleAttribute__ManyAssignment_06842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__SimpleAttribute__RequiredAssignment_16886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleAttribute__NameAssignment_26925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataEnum_in_rule__SimpleAttribute__DataAssignment_46956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiAttribute__NameAssignment_06987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiAttribute__TypeAssignment_27022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__OnService__ArtifactAssignment_07061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_27096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceEnum_in_rule__OnService__WhenServicesAssignment_3_17127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__NameAssignment_17158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__InputAssignment_3_17193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__InputAssignment_3_2_17232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__OutputAssignment_4_17271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SimpleService__OutputAssignment_4_2_17310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_rule__SimpleService__WhenAssignment_5_17345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__NameAssignment_17376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__MultiService__ParallelAssignment_2_17412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOnService_in_rule__MultiService__WhenAssignment_4_17451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_67486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiService__ServicesAssignment_7_17525 = new BitSet(new long[]{0x0000000000000002L});
    }


}