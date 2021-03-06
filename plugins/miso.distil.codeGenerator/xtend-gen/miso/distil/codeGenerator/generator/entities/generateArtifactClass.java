package miso.distil.codeGenerator.generator.entities;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.Attribute;
import codeGeneratorModel.DataEnum;
import codeGeneratorModel.Primitive;
import codeGeneratorModel.Reference;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.generator.generateUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write "artifact.name".java.
 * 
 * @author Carlos Carrascal.
 */
@SuppressWarnings("all")
public class generateArtifactClass {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private Names names;
  
  /**
   * To write "artifact.name".java.
   * 
   * @param artifact the artifact.
   */
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    final EList<Attribute> atts = artifact.getAttributes();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _artifactChar = this.names.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.names.MisoAbstract, "");
    _builder.append(".Persistent;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _importCompose = this.genUti.getImportCompose(atts);
    _builder.append(_importCompose, "");
    _builder.newLineIfNotEmpty();
    CharSequence _importList = this.genUti.getImportList(atts);
    _builder.append(_importList, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated artifact class.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @author miso.distil.codeGenerator.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _name = artifact.getName();
    _builder.append(_name, "");
    _builder.append(" extends Persistent {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Attributes");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _privateAttributes = this.genUti.getPrivateAttributes(atts);
    _builder.append(_privateAttributes, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Empty constructor.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
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
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// To string method");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _toStringAtts = this.genUti.getToStringAtts(atts);
    _builder.append(_toStringAtts, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * To write the full constructor of artifact.
   * 
   * @param artifact the artifact.
   */
  private CharSequence getConstructorArtifact(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    final EList<Attribute> atts = artifact.getAttributes();
    _builder.newLineIfNotEmpty();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Full constructor.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param filename Name file. ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param filesize File size.");
    _builder.newLine();
    {
      for(final Attribute att : atts) {
        _builder.append("* @param ");
        String _name = att.getName();
        _builder.append(_name, "");
        _builder.append(" Attribute ");
        String _name_1 = att.getName();
        _builder.append(_name_1, "");
        _builder.append(".");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public ");
    String _name_2 = artifact.getName();
    _builder.append(_name_2, "");
    _builder.append("(String filename, long filesize");
    {
      for(final Attribute att_1 : atts) {
        _builder.append(", ");
        CharSequence _typeName = this.genUti.getTypeName(att_1);
        _builder.append(_typeName, "");
        _builder.append(" ");
        String _name_3 = att_1.getName();
        _builder.append(_name_3, "");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("super(filename, filesize);");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Attribute att_2 : atts) {
        {
          if ((att_2 instanceof Primitive)) {
            {
              DataEnum _type = ((Primitive)att_2).getType();
              boolean _equals = _type.equals(DataEnum.STRING);
              if (_equals) {
                {
                  boolean _isMany = ((Primitive)att_2).isMany();
                  if (_isMany) {
                    _builder.append("\t");
                    _builder.append("this.");
                    String _name_4 = ((Primitive)att_2).getName();
                    _builder.append(_name_4, "\t");
                    _builder.append(" = ");
                    String _name_5 = ((Primitive)att_2).getName();
                    _builder.append(_name_5, "\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("for(int i=0; i < this.");
                    String _name_6 = ((Primitive)att_2).getName();
                    _builder.append(_name_6, "\t");
                    _builder.append(".size(); i++) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("this.");
                    String _name_7 = ((Primitive)att_2).getName();
                    _builder.append(_name_7, "\t\t");
                    _builder.append(".set(i, this.");
                    String _name_8 = ((Primitive)att_2).getName();
                    _builder.append(_name_8, "\t\t");
                    _builder.append(".get(i).toLowerCase());");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    _builder.append("\t");
                    _builder.append("this.");
                    String _name_9 = ((Primitive)att_2).getName();
                    _builder.append(_name_9, "\t");
                    _builder.append(" = ");
                    String _name_10 = ((Primitive)att_2).getName();
                    _builder.append(_name_10, "\t");
                    _builder.append(".toLowerCase();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                _builder.append("\t");
                _builder.append("this.");
                String _name_11 = ((Primitive)att_2).getName();
                _builder.append(_name_11, "\t");
                _builder.append(" = ");
                String _name_12 = ((Primitive)att_2).getName();
                _builder.append(_name_12, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            if ((att_2 instanceof Reference)) {
              _builder.append("\t");
              _builder.append("this.");
              String _name_13 = att_2.getName();
              _builder.append(_name_13, "\t");
              _builder.append(" = ");
              String _name_14 = att_2.getName();
              _builder.append(_name_14, "\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            } else {
              {
                boolean _isMany_1 = att_2.isMany();
                if (_isMany_1) {
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_15 = att_2.getName();
                  _builder.append(_name_15, "\t");
                  _builder.append(" = ");
                  String _name_16 = att_2.getName();
                  _builder.append(_name_16, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("for(int i=0; i < this.");
                  String _name_17 = att_2.getName();
                  _builder.append(_name_17, "\t");
                  _builder.append(".size(); i++) {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_18 = att_2.getName();
                  _builder.append(_name_18, "\t\t");
                  _builder.append(".set(i, this.");
                  String _name_19 = att_2.getName();
                  _builder.append(_name_19, "\t\t");
                  _builder.append(".get(i).toLowerCase());");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_20 = att_2.getName();
                  _builder.append(_name_20, "\t");
                  _builder.append(" = ");
                  String _name_21 = att_2.getName();
                  _builder.append(_name_21, "\t");
                  _builder.append(".toLowerCase();");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
