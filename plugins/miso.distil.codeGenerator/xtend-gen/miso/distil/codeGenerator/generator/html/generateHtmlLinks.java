package miso.distil.codeGenerator.generator.html;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.generator.generateUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write HtmlXXXLinks.java.
 * 
 * @author Carlos Carrascal.
 */
@SuppressWarnings("all")
public class generateHtmlLinks {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private Names names;
  
  /**
   * To write Html"artifact.name"Links.java.
   * 
   * @param artifact the artifact.
   */
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    EList<ServiceEnum> _basicServices = artifact.getBasicServices();
    EList<ServiceEnum> basicServices = this.genUti.processBasicServices(_basicServices);
    _builder.newLineIfNotEmpty();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    String _name = artifact.getName();
    final String namelow = _name.toLowerCase();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _htmlChar = this.names.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains = basicServices.contains(ServiceEnum.DELETE);
      if (_contains) {
        _builder.append("import ");
        CharSequence _bParamFileChar = this.names.getBParamFileChar(artifact);
        _builder.append(_bParamFileChar, "");
        _builder.append(";");
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
        boolean _contains_3 = basicServices.contains(ServiceEnum.DELETE);
        _or = _contains_3;
      }
      if (_or) {
        _builder.append("import ");
        CharSequence _bSparkFileChar = this.names.getBSparkFileChar(artifact);
        _builder.append(_bSparkFileChar, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    CharSequence _artifactFileChar = this.names.getArtifactFileChar(artifact);
    _builder.append(_artifactFileChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated html links.");
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
        _builder.append("* Auto-generated link to the service read one json.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param ");
        _builder.append(namelow, "\t ");
        _builder.append(" ");
        _builder.append(name, "\t ");
        _builder.append(" to create the link.");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return the link.");
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
        _builder.append(".getObjectid() + \">View as Json</a>\";");
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
        _builder.append("* Auto-generated link to the service read one html.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param ");
        _builder.append(namelow, "\t ");
        _builder.append(" ");
        _builder.append(name, "\t ");
        _builder.append(" to create the link.");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return the link.");
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
        _builder.append(".getObjectid() + \">\" + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getFilename() + \"</a>\";");
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
        _builder.append("* Auto-generated link to the service download.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param ");
        _builder.append(namelow, "\t ");
        _builder.append(" ");
        _builder.append(name, "\t ");
        _builder.append(" to create the link.");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return the link.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public static String getDownloadJsonLink(");
        _builder.append(name, "\t");
        _builder.append(" ");
        _builder.append(namelow, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return \"<a href=\" + Basic");
        _builder.append(name, "\t\t");
        _builder.append("Spark.DownloadJson + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectid() + \">Download</a>\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_6 = basicServices.contains(ServiceEnum.DELETE);
      if (_contains_6) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated link to the service delete.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param ");
        _builder.append(namelow, "\t ");
        _builder.append(" ");
        _builder.append(name, "\t ");
        _builder.append(" to create the link.");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return the link (form type post link).");
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
        _builder.append(".getObjectid() + \"\\\"action=\\\"\" + Basic");
        _builder.append(name, "\t\t");
        _builder.append("Spark.DeleteJson + \"\\\" method=\\\"POST\\\">\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("form += \"<input type=\'hidden\' name=\'\" + Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.IdPost + \"\' value=\\\"\" + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectid() + \"\\\"/>\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("form += \"<a href=\\\"javascript:{}\\\" onclick=\\\"document.getElementById(\'delete\" + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectid() + \"\').submit(); return false;\\\">Delete</a>\";");
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
        _builder.append("* Auto-generated link to the service update form html.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param ");
        _builder.append(namelow, "\t ");
        _builder.append(" ");
        _builder.append(name, "\t ");
        _builder.append(" to create the link.");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return the link.");
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
        _builder.append(".getObjectid() + \">Update</a>\";");
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
