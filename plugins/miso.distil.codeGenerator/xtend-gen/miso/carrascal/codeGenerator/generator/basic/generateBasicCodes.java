package miso.carrascal.codeGenerator.generator.basic;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.Attribute;
import com.google.inject.Inject;
import miso.carrascal.codeGenerator.generator.generateUtils;
import miso.carrascal.codeGenerator.generator.packages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class generateBasicCodes {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private packages pack;
  
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    EList _attributes = artifact.getAttributes();
    final EList<Attribute> allAtts = this.genUti.getAllNestedAttributes(_attributes);
    _builder.newLineIfNotEmpty();
    int pos = (-1);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _basicChar = this.pack.getBasicChar(artifact);
    _builder.append(_basicChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.pack.MisoBasic, "");
    _builder.append(".BasicAbstractCodes;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class Basic");
    _builder.append(name, "");
    _builder.append("Codes extends BasicAbstractCodes {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String Param_error = \"ParameterError : Parameter is incorrect\";");
    _builder.newLine();
    _builder.append("\t");
    Object _xblockexpression = null;
    {
      pos = (-1);
      _xblockexpression = null;
    }
    _builder.append(_xblockexpression, "\t");
    _builder.newLineIfNotEmpty();
    {
      for(final Attribute att : allAtts) {
        _builder.append("\t");
        Object _xblockexpression_1 = null;
        {
          pos++;
          _xblockexpression_1 = null;
        }
        _builder.append(_xblockexpression_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public static String Param_");
        String _newAttName = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
        _builder.append(_newAttName, "\t");
        _builder.append(" = \"ParameterError : ");
        String _newAttName_1 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
        _builder.append(_newAttName_1, "\t");
        _builder.append(" is incorrect\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("public static String Param_emptyfilename = \"ParameterError : Filename is empty\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String Param_emptyfile = \"ParameterError : File or filename not found\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String Param_filenotfound = \"ParameterError : File not found\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String Param_corruptfile = \"ParameterError : Corrupt file\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String DB_notupdated = \"DataBaseError : ");
    _builder.append(name, "\t");
    _builder.append(" not updated\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static String DB_notuploaded = \"DataBaseError : ");
    _builder.append(name, "\t");
    _builder.append(" not uploaded\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String Search_empty = \"Your search has no results. Try again\";");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static String ");
    _builder.append(name, "\t");
    _builder.append("_notfound = \"");
    _builder.append(name, "\t");
    _builder.append(" not found. Try again later\";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
