package miso.distil.codeGenerator.generator;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.Entity;
import codeGeneratorModel.Service;
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
  
  public String getArtifactStri(final Artifact artifact) {
    String _name = artifact.getName();
    String _lowerCase = _name.toLowerCase();
    String _plus = ((this.RootStri + "/") + _lowerCase);
    return (_plus + "Services");
  }
  
  public CharSequence getArtifactChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.RootChar, "");
    _builder.append(".");
    String _name = artifact.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "");
    _builder.append("Services");
    return _builder;
  }
  
  public String getBasicStri(final Artifact artifact) {
    String _artifactStri = this.getArtifactStri(artifact);
    return (_artifactStri + "/basic");
  }
  
  public CharSequence getBasicChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _artifactChar = this.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(".basic");
    return _builder;
  }
  
  public String getHtmlStri(final Artifact artifact) {
    String _artifactStri = this.getArtifactStri(artifact);
    return (_artifactStri + "/htmlCover");
  }
  
  public CharSequence getHtmlChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _artifactChar = this.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(".htmlCover");
    return _builder;
  }
  
  private String getBCodes(final Artifact artifact) {
    String _name = artifact.getName();
    String _plus = ("Basic" + _name);
    return (_plus + "Codes");
  }
  
  public String getBCodesFileStri(final Artifact artifact) {
    String _basicStri = this.getBasicStri(artifact);
    String _plus = (_basicStri + "/");
    String _bCodes = this.getBCodes(artifact);
    return (_plus + _bCodes);
  }
  
  public CharSequence getBCodesFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicChar = this.getBasicChar(artifact);
    _builder.append(_basicChar, "");
    _builder.append(".");
    String _bCodes = this.getBCodes(artifact);
    _builder.append(_bCodes, "");
    return _builder;
  }
  
  private String getBParam(final Artifact artifact) {
    String _name = artifact.getName();
    String _plus = ("Basic" + _name);
    return (_plus + "Param");
  }
  
  public String getBParamFileStri(final Artifact artifact) {
    String _basicStri = this.getBasicStri(artifact);
    String _plus = (_basicStri + "/");
    String _bParam = this.getBParam(artifact);
    return (_plus + _bParam);
  }
  
  public CharSequence getBParamFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicChar = this.getBasicChar(artifact);
    _builder.append(_basicChar, "");
    _builder.append(".");
    String _bParam = this.getBParam(artifact);
    _builder.append(_bParam, "");
    return _builder;
  }
  
  private String getBSpark(final Artifact artifact) {
    String _name = artifact.getName();
    String _plus = ("Basic" + _name);
    return (_plus + "Spark");
  }
  
  public String getBSparkFileStri(final Artifact artifact) {
    String _basicStri = this.getBasicStri(artifact);
    String _plus = (_basicStri + "/");
    String _bSpark = this.getBSpark(artifact);
    return (_plus + _bSpark);
  }
  
  public CharSequence getBSparkFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _basicChar = this.getBasicChar(artifact);
    _builder.append(_basicChar, "");
    _builder.append(".");
    String _bSpark = this.getBSpark(artifact);
    _builder.append(_bSpark, "");
    return _builder;
  }
  
  private String getHJson(final Artifact artifact) {
    String _name = artifact.getName();
    String _plus = ("Html" + _name);
    return (_plus + "Json");
  }
  
  public String getHJsonFileStri(final Artifact artifact) {
    String _htmlStri = this.getHtmlStri(artifact);
    String _plus = (_htmlStri + "/");
    String _hJson = this.getHJson(artifact);
    return (_plus + _hJson);
  }
  
  public CharSequence getHJsonFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _htmlChar = this.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(".");
    String _hJson = this.getHJson(artifact);
    _builder.append(_hJson, "");
    return _builder;
  }
  
  private String getHLinks(final Artifact artifact) {
    String _name = artifact.getName();
    String _plus = ("Html" + _name);
    return (_plus + "Links");
  }
  
  public String getHLinksFileStri(final Artifact artifact) {
    String _htmlStri = this.getHtmlStri(artifact);
    String _plus = (_htmlStri + "/");
    String _hLinks = this.getHLinks(artifact);
    return (_plus + _hLinks);
  }
  
  public CharSequence getHLinksFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _htmlChar = this.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(".");
    String _hLinks = this.getHLinks(artifact);
    _builder.append(_hLinks, "");
    return _builder;
  }
  
  private String getHSpark(final Artifact artifact) {
    String _name = artifact.getName();
    String _plus = ("Html" + _name);
    return (_plus + "Spark");
  }
  
  public String getHSparkFileStri(final Artifact artifact) {
    String _htmlStri = this.getHtmlStri(artifact);
    String _plus = (_htmlStri + "/");
    String _hSpark = this.getHSpark(artifact);
    return (_plus + _hSpark);
  }
  
  public CharSequence getHSparkFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _htmlChar = this.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(".");
    String _hSpark = this.getHSpark(artifact);
    _builder.append(_hSpark, "");
    return _builder;
  }
  
  private String getHView(final Artifact artifact) {
    String _name = artifact.getName();
    String _plus = ("Html" + _name);
    return (_plus + "View");
  }
  
  public String getHViewFileStri(final Artifact artifact) {
    String _htmlStri = this.getHtmlStri(artifact);
    String _plus = (_htmlStri + "/");
    String _hView = this.getHView(artifact);
    return (_plus + _hView);
  }
  
  public CharSequence getHViewFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _htmlChar = this.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(".");
    String _hView = this.getHView(artifact);
    _builder.append(_hView, "");
    return _builder;
  }
  
  private String getArtifact(final Artifact artifact) {
    return artifact.getName();
  }
  
  public String getArtifactFileStri(final Artifact artifact) {
    String _artifactStri = this.getArtifactStri(artifact);
    String _plus = (_artifactStri + "/");
    String _artifact = this.getArtifact(artifact);
    return (_plus + _artifact);
  }
  
  public CharSequence getArtifactFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _artifactChar = this.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(".");
    String _artifact = this.getArtifact(artifact);
    _builder.append(_artifact, "");
    return _builder;
  }
  
  private String getArtifactJson(final Artifact artifact) {
    String _name = artifact.getName();
    return (_name + "Json");
  }
  
  public String getArtifactJsonFileStri(final Artifact artifact) {
    String _artifactStri = this.getArtifactStri(artifact);
    String _plus = (_artifactStri + "/");
    String _artifactJson = this.getArtifactJson(artifact);
    return (_plus + _artifactJson);
  }
  
  public String getArtifactJsonFileStri2(final Artifact artifact) {
    String _artifactJsonFileStri = this.getArtifactJsonFileStri(artifact);
    return _artifactJsonFileStri.replace("/", "\\");
  }
  
  public CharSequence getArtifactJsonFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _artifactChar = this.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(".");
    String _artifactJson = this.getArtifactJson(artifact);
    _builder.append(_artifactJson, "");
    return _builder;
  }
  
  private String getArtifactCustom(final Artifact artifact) {
    String _name = artifact.getName();
    String _plus = ("Custom" + _name);
    return (_plus + "Html");
  }
  
  public String getArtifactCustomFileStri(final Artifact artifact) {
    String _artifactStri = this.getArtifactStri(artifact);
    String _plus = (_artifactStri + "/");
    String _artifactCustom = this.getArtifactCustom(artifact);
    return (_plus + _artifactCustom);
  }
  
  public CharSequence getArtifactCustomFileChar(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _artifactChar = this.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(".");
    String _artifactCustom = this.getArtifactCustom(artifact);
    _builder.append(_artifactCustom, "");
    return _builder;
  }
  
  private String getEntity(final Entity entity) {
    return entity.getName();
  }
  
  public String getEntityFileStri(final Entity entity) {
    String _entity = this.getEntity(entity);
    return ((this.EntitiesStr + "/") + _entity);
  }
  
  public CharSequence getEntityFileChar(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.EntitiesCha, "");
    _builder.append(".");
    String _entity = this.getEntity(entity);
    _builder.append(_entity, "");
    return _builder;
  }
  
  private String getService(final Service service) {
    String _name = service.getName();
    return ("Service" + _name);
  }
  
  public String getServiceFileStri(final Service service) {
    String _service = this.getService(service);
    return ((this.ServicesStr + "/") + _service);
  }
  
  public CharSequence getServiceFileChar(final Service service) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.ServicesCha, "");
    _builder.append(".");
    String _service = this.getService(service);
    _builder.append(_service, "");
    return _builder;
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
    return "CustomDB";
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
