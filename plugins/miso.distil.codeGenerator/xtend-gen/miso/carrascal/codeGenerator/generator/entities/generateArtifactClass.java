package miso.carrascal.codeGenerator.generator.entities;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.Attribute;
import com.google.inject.Inject;
import miso.carrascal.codeGenerator.generator.generateUtils;
import miso.carrascal.codeGenerator.generator.packages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class generateArtifactClass {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private packages pack;
  
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    final EList<Attribute> atts = artifact.getAttributes();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _artifactChar = this.pack.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.pack.MisoAbstract, "");
    _builder.append(".AbstractPersistentClass;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _importCompose = this.genUti.getImportCompose(atts);
    _builder.append(_importCompose, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = artifact.getName();
    _builder.append(_name, "");
    _builder.append(" extends AbstractPersistentClass {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _privateAttributes = this.genUti.getPrivateAttributes(atts);
    _builder.append(_privateAttributes, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_1 = artifact.getName();
    _builder.append(_name_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _constructorArtifact = this.getConstructorArtifact(artifact);
    _builder.append(_constructorArtifact, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _getSetAtt = this.genUti.getGetSetAtt(atts);
    _builder.append(_getSetAtt, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _toStringAtts = this.genUti.getToStringAtts(atts);
    _builder.append(_toStringAtts, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence getConstructorArtifact(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    final EList<Attribute> atts = artifact.getAttributes();
    _builder.newLineIfNotEmpty();
    _builder.append("public ");
    String _name = artifact.getName();
    _builder.append(_name, "");
    _builder.append("(String objectName, long fileSize, List<String> tags");
    {
      for(final Attribute att : atts) {
        _builder.append(", ");
        CharSequence _typeName = this.genUti.getTypeName(att);
        _builder.append(_typeName, "");
        _builder.append(" ");
        String _name_1 = att.getName();
        _builder.append(_name_1, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("super(objectName, fileSize, tags);");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Attribute att_1 : atts) {
        _builder.append("\t");
        _builder.append("this.");
        String _name_2 = att_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" = ");
        String _name_3 = att_1.getName();
        _builder.append(_name_3, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
