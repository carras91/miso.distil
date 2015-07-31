package miso.distil.codeGenerator.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

/**
 * Packages to generate and from cloudModelServices
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class Names {
  public final String RootMisoStri = "miso/carrascal";
  
  public final String RootMisoChar = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("miso.carrascal");
      return _builder.toString();
    }
  }.apply();
  
  public final String Miso = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(Names.this.RootMisoChar, "");
      _builder.append(".cloudModelServices");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoUtils = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(Names.this.Miso, "");
      _builder.append(".utils");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoAbstract = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(Names.this.Miso, "");
      _builder.append(".abstractServices");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoBasic = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(Names.this.MisoAbstract, "");
      _builder.append(".basic");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoHtml = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(Names.this.MisoAbstract, "");
      _builder.append(".htmlCover");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoServices = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(Names.this.MisoAbstract, "");
      _builder.append(".services");
      return _builder.toString();
    }
  }.apply();
  
  public final String RootStri = "miso/distil";
  
  public final String RootChar = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("miso.distil");
      return _builder.toString();
    }
  }.apply();
  
  public final String EntitiesStr = (this.RootStri + "/entities");
  
  public final String EntitiesCha = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(Names.this.RootChar, "");
      _builder.append(".entities");
      return _builder.toString();
    }
  }.apply();
  
  public final String ServicesStr = (this.RootStri + "/services");
  
  public final String ServicesCha = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(Names.this.RootChar, "");
      _builder.append(".services");
      return _builder.toString();
    }
  }.apply();
  
  public String getArtifactStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\ntoLowerCase cannot be resolved");
  }
  
  public CharSequence getArtifactChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\ntoLowerCase cannot be resolved");
  }
  
  public Object getBasicStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetArtifactStri cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public CharSequence getBasicChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetArtifactChar cannot be resolved");
  }
  
  public Object getHtmlStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetArtifactStri cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public CharSequence getHtmlChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetArtifactChar cannot be resolved");
  }
  
  private String getBParam(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public Object getBParamFileStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nbasicStri cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nBParam cannot be resolved");
  }
  
  public CharSequence getBParamFileChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nbasicChar cannot be resolved"
      + "\nBParam cannot be resolved");
  }
  
  private String getBSpark(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public Object getBSparkFileStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nbasicStri cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nBSpark cannot be resolved");
  }
  
  public CharSequence getBSparkFileChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nbasicChar cannot be resolved"
      + "\nBSpark cannot be resolved");
  }
  
  private String getHJson(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public Object getHJsonFileStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nhtmlStri cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nHJson cannot be resolved");
  }
  
  public CharSequence getHJsonFileChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nhtmlChar cannot be resolved"
      + "\nHJson cannot be resolved");
  }
  
  private String getHLinks(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public Object getHLinksFileStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nhtmlStri cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nHLinks cannot be resolved");
  }
  
  public CharSequence getHLinksFileChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nhtmlChar cannot be resolved"
      + "\nHLinks cannot be resolved");
  }
  
  private String getHSpark(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public Object getHSparkFileStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nhtmlStri cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nHSpark cannot be resolved");
  }
  
  public CharSequence getHSparkFileChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nhtmlChar cannot be resolved"
      + "\nHSpark cannot be resolved");
  }
  
  private String getHView(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public Object getHViewFileStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nhtmlStri cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nHView cannot be resolved");
  }
  
  public CharSequence getHViewFileChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nhtmlChar cannot be resolved"
      + "\nHView cannot be resolved");
  }
  
  private Object getArtifact(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public Object getArtifactFileStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nartifactStri cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nartifact cannot be resolved");
  }
  
  public CharSequence getArtifactFileChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nartifactChar cannot be resolved"
      + "\nartifact cannot be resolved");
  }
  
  private Object getArtifactJson(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public Object getArtifactJsonFileStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nartifactStri cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nartifactJson cannot be resolved");
  }
  
  public Object getArtifactJsonFileStri2(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nreplace cannot be resolved");
  }
  
  public CharSequence getArtifactJsonFileChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nartifactChar cannot be resolved"
      + "\nartifactJson cannot be resolved");
  }
  
  private String getArtifactCustom(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public Object getArtifactCustomFileStri(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nartifactStri cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nartifactCustom cannot be resolved");
  }
  
  public CharSequence getArtifactCustomFileChar(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nartifactChar cannot be resolved"
      + "\nartifactCustom cannot be resolved");
  }
  
  private Object getEntity(final /* Entity */Object entity) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public String getEntityFileStri(final /* Entity */Object entity) {
    throw new Error("Unresolved compilation problems:"
      + "\nentity cannot be resolved");
  }
  
  public CharSequence getEntityFileChar(final /* Entity */Object entity) {
    throw new Error("Unresolved compilation problems:"
      + "\nentity cannot be resolved");
  }
  
  private String getService(final /* Service */Object service) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved");
  }
  
  public String getServiceFileStri(final /* Service */Object service) {
    throw new Error("Unresolved compilation problems:"
      + "\nservice cannot be resolved");
  }
  
  public CharSequence getServiceFileChar(final /* Service */Object service) {
    throw new Error("Unresolved compilation problems:"
      + "\nservice cannot be resolved");
  }
  
  private String getServicesSpark() {
    return "ServicesSpark";
  }
  
  public String getServicesSparkFileStri() {
    String _servicesSpark = this.getServicesSpark();
    return ((this.ServicesStr + "/") + _servicesSpark);
  }
  
  public CharSequence getServicesSparkFileChar() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.ServicesCha, "");
    _builder.append(".");
    String _servicesSpark = this.getServicesSpark();
    _builder.append(_servicesSpark, "");
    return _builder;
  }
  
  private String getMain() {
    return "Main";
  }
  
  public String getMainFileStri() {
    String _main = this.getMain();
    return ((this.RootStri + "/") + _main);
  }
  
  public CharSequence getMainFileChar() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.RootChar, "");
    _builder.append(".");
    String _main = this.getMain();
    _builder.append(_main, "");
    return _builder;
  }
  
  private String getDB() {
    return "MongoDataBase";
  }
  
  public String getDBFileStri() {
    String _dB = this.getDB();
    return ((this.RootStri + "/") + _dB);
  }
  
  public CharSequence getDBFileChar() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.RootChar, "");
    _builder.append(".");
    String _dB = this.getDB();
    _builder.append(_dB, "");
    return _builder;
  }
}
