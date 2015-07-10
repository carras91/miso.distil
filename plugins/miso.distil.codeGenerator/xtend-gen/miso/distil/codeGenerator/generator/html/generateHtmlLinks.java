package miso.distil.codeGenerator.generator.html;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.packages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write HtmlXXXLinks.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateHtmlLinks {
  @Inject
  private packages pack;
  
  /**
   * To write Html<artifact.name>Links.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    EList<ServiceEnum> basicServices = artifact.getBasicServices();
    _builder.newLineIfNotEmpty();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    String _name = artifact.getName();
    final String namelow = _name.toLowerCase();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _htmlChar = this.pack.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains) {
        _builder.append("import ");
        CharSequence _basicChar = this.pack.getBasicChar(artifact);
        _builder.append(_basicChar, "");
        _builder.append(".Basic");
        _builder.append(name, "");
        _builder.append("Param;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _contains_1 = basicServices.contains(ServiceEnum.READ);
      if (_contains_1) {
        _or_1 = true;
      } else {
        boolean _contains_2 = basicServices.contains(ServiceEnum.DOWNLOAD);
        _or_1 = _contains_2;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _contains_3 = basicServices.contains(ServiceEnum.UPLOAD);
        _or = _contains_3;
      }
      if (_or) {
        _builder.append("import ");
        CharSequence _basicChar_1 = this.pack.getBasicChar(artifact);
        _builder.append(_basicChar_1, "");
        _builder.append(".Basic");
        _builder.append(name, "");
        _builder.append("Spark;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    CharSequence _artifactChar = this.pack.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(".");
    _builder.append(name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated html links");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @author miso.distil.codeGenerator");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class Html");
    _builder.append(name, "");
    _builder.append("Links {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains_4 = basicServices.contains(ServiceEnum.READ);
      if (_contains_4) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated link to the service read one json");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @author miso.distil.codeGenerator");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static String getReadJsonLink(");
        _builder.append(name, "\t");
        _builder.append(" ");
        _builder.append(namelow, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return \"<a href=\" + Basic");
        _builder.append(name, "\t\t");
        _builder.append("Spark.ReadJson + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectId() + \">View as Json</a>\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated link to the service read one html");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @author miso.distil.codeGenerator");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static String getReadHtmlLink(");
        _builder.append(name, "\t");
        _builder.append(" ");
        _builder.append(namelow, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return \"<a href=\" + Html");
        _builder.append(name, "\t\t");
        _builder.append("Spark.ReadHTML + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectId() + \">\" + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectName() + \"</a>\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_5 = basicServices.contains(ServiceEnum.DOWNLOAD);
      if (_contains_5) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated link to the service download zip");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @author miso.distil.codeGenerator");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static String getDownloadZipJsonLink(");
        _builder.append(name, "\t");
        _builder.append(" ");
        _builder.append(namelow, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return \"<a href=\" + Basic");
        _builder.append(name, "\t\t");
        _builder.append("Spark.DownloadZipJson + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectId() + \">Download zip</a>\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated link to the service download file");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @author miso.distil.codeGenerator");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static String getDownloadFileJsonLink(");
        _builder.append(name, "\t");
        _builder.append(" ");
        _builder.append(namelow, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return \"<a href=\" + Basic");
        _builder.append(name, "\t\t");
        _builder.append("Spark.DownloadFileJson + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectId() + \">Download ");
        _builder.append(namelow, "\t\t");
        _builder.append("</a>\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_6 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_6) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated link to the service delete");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @author miso.distil.codeGenerator");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static String getDeleteFormJsonLink(");
        _builder.append(name, "\t");
        _builder.append(" ");
        _builder.append(namelow, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("String form = \"\";");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("form = \"<form id=\\\"delete\" + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectId() + \"\\\"action=\\\"\" + Basic");
        _builder.append(name, "\t\t");
        _builder.append("Spark.DeleteJson + \"\\\" method=\\\"POST\\\">\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("form += \"<input type=\'hidden\' name=\'\" + Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.IdPost + \"\' value=\\\"\" + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectId() + \"\\\"/>\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("form += \"<a href=\\\"javascript:{}\\\" onclick=\\\"document.getElementById(\'delete\" + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectId() + \"\').submit(); return false;\\\">Delete</a>\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("form += \"</form>\";");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("    ");
        _builder.append("return form;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_7 = basicServices.contains(ServiceEnum.UPDATE);
      if (_contains_7) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated link to the service update form html");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @author miso.distil.codeGenerator");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static String getUpdateHtmlLink(");
        _builder.append(name, "\t");
        _builder.append(" ");
        _builder.append(namelow, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return \"<a href=\" + Html");
        _builder.append(name, "\t\t");
        _builder.append("Spark.UpdateFormHTML + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectId() + \">Update</a>\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
