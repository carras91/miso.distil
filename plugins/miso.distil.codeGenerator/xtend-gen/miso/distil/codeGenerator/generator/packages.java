package miso.distil.codeGenerator.generator;

import codeGeneratorModel.Artifact;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

/**
 * Packages to generate and from cloudModelServices
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class packages {
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
      _builder.append(packages.this.RootMisoChar, "");
      _builder.append(".cloudModelServices");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoUtils = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(packages.this.Miso, "");
      _builder.append(".utils");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoAbstract = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(packages.this.Miso, "");
      _builder.append(".abstractServices");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoBasic = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(packages.this.MisoAbstract, "");
      _builder.append(".basic");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoHtml = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(packages.this.MisoAbstract, "");
      _builder.append(".htmlCover");
      return _builder.toString();
    }
  }.apply();
  
  public final String MisoServices = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(packages.this.MisoAbstract, "");
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
      _builder.append(packages.this.RootChar, "");
      _builder.append(".entities");
      return _builder.toString();
    }
  }.apply();
  
  public final String ServicesStr = (this.RootStri + "/services");
  
  public final String ServicesCha = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(packages.this.RootChar, "");
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
}
