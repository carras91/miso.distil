package miso.distil.codeGenerator.generator.basic;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.generator.generateUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write BasicXXXSpark.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateBasicSpark {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private Names names;
  
  /**
   * To write Basic<artifact.name>Spark.java
   * 
   * @author Carlos Carrascal
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
    CharSequence _basicChar = this.names.getBasicChar(artifact);
    _builder.append(_basicChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _contains = basicServices.contains(ServiceEnum.UPDATE);
      if (_contains) {
        _or_1 = true;
      } else {
        boolean _contains_1 = basicServices.contains(ServiceEnum.UPLOAD);
        _or_1 = _contains_1;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _contains_2 = basicServices.contains(ServiceEnum.DELETE);
        _or = _contains_2;
      }
      if (_or) {
        _builder.append("import static spark.Spark.post;");
        _builder.newLine();
      }
    }
    {
      boolean _or_2 = false;
      boolean _or_3 = false;
      boolean _or_4 = false;
      boolean _contains_3 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_3) {
        _or_4 = true;
      } else {
        boolean _contains_4 = basicServices.contains(ServiceEnum.READ);
        _or_4 = _contains_4;
      }
      if (_or_4) {
        _or_3 = true;
      } else {
        boolean _contains_5 = basicServices.contains(ServiceEnum.READ_ALL);
        _or_3 = _contains_5;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        boolean _contains_6 = basicServices.contains(ServiceEnum.DOWNLOAD);
        _or_2 = _contains_6;
      }
      if (_or_2) {
        _builder.append("import static spark.Spark.get;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("import ");
    CharSequence _artifactJsonFileChar = this.names.getArtifactJsonFileChar(artifact);
    _builder.append(_artifactJsonFileChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.names.MisoBasic, "");
    _builder.append(".JsonTransformer;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.names.MisoBasic, "");
    _builder.append(".BasicInterfaceSpark;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated spark server");
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
    _builder.append("public final class Basic");
    _builder.append(name, "");
    _builder.append("Spark implements BasicInterfaceSpark {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// URL\'s");
    _builder.newLine();
    {
      boolean _contains_7 = basicServices.contains(ServiceEnum.READ);
      if (_contains_7) {
        _builder.append("\t");
        _builder.append("public static String ReadJson = \"/json/");
        _builder.append(namelow, "\t");
        _builder.append("/read/\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public static String ReadIdJson = ReadJson + Basic");
        _builder.append(name, "\t");
        _builder.append("Param.IdGet;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_8 = basicServices.contains(ServiceEnum.READ_ALL);
      if (_contains_8) {
        _builder.append("\t");
        _builder.append("public static String ReadAllJson = \"/json/");
        _builder.append(namelow, "\t");
        _builder.append("/all\";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_9 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_9) {
        _builder.append("\t");
        _builder.append("public static String SearchJson = \"/json/");
        _builder.append(namelow, "\t");
        _builder.append("/search\";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_10 = basicServices.contains(ServiceEnum.UPDATE);
      if (_contains_10) {
        _builder.append("\t");
        _builder.append("public static String UpdateJson = \"/json/");
        _builder.append(namelow, "\t");
        _builder.append("/update\";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_11 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_11) {
        _builder.append("\t");
        _builder.append("public static String UploadJson = \"/json/");
        _builder.append(namelow, "\t");
        _builder.append("/upload\";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_12 = basicServices.contains(ServiceEnum.DELETE);
      if (_contains_12) {
        _builder.append("\t");
        _builder.append("public static String DeleteJson = \"/json/");
        _builder.append(namelow, "\t");
        _builder.append("/delete\";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_13 = basicServices.contains(ServiceEnum.DOWNLOAD);
      if (_contains_13) {
        _builder.append("\t");
        _builder.append("public static String DownloadZipJson = \"/json/");
        _builder.append(namelow, "\t");
        _builder.append("/download/zip/\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public static String DownloadZipIdJson = DownloadZipJson + Basic");
        _builder.append(name, "\t");
        _builder.append("Param.IdGet;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public static String DownloadFileJson = \"/json/");
        _builder.append(namelow, "\t");
        _builder.append("/download/file/\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public static String DownloadFileIdJson = DownloadFileJson + Basic");
        _builder.append(name, "\t");
        _builder.append("Param.IdGet;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated spark service. It initializes all url\'s");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @author miso.distil.codeGenerator");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void runService() {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(name, "\t\t");
    _builder.append("Json Json = new ");
    _builder.append(name, "\t\t");
    _builder.append("Json();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains_14 = basicServices.contains(ServiceEnum.READ);
      if (_contains_14) {
        _builder.append("\t\t");
        _builder.append("get(ReadIdJson, \"application/json\",");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> Json.getRead(request, response), ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new JsonTransformer());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_15 = basicServices.contains(ServiceEnum.READ_ALL);
      if (_contains_15) {
        _builder.append("\t\t");
        _builder.append("get(ReadAllJson, \"application/json\",");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> Json.getReadAll(request, response),");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new JsonTransformer());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_16 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_16) {
        _builder.append("\t\t");
        _builder.append("get(SearchJson, \"application/json\",");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> Json.getSearch(request, response), ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new JsonTransformer());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_17 = basicServices.contains(ServiceEnum.UPDATE);
      if (_contains_17) {
        _builder.append("\t\t");
        _builder.append("post(UpdateJson, \"application/json\",");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> Json.postUpdate(request, response), ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new JsonTransformer());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_18 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_18) {
        _builder.append("\t\t");
        _builder.append("post(UploadJson, \"application/json\",");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> Json.postUpload(request, response),");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new JsonTransformer());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_19 = basicServices.contains(ServiceEnum.DELETE);
      if (_contains_19) {
        _builder.append("\t\t");
        _builder.append("post(DeleteJson, \"application/json\",");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> Json.postDelete(request, response),");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new JsonTransformer());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_20 = basicServices.contains(ServiceEnum.DOWNLOAD);
      if (_contains_20) {
        _builder.append("\t\t");
        _builder.append("get(DownloadZipIdJson, \"application/json\",");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> Json.getDownloadZip(request, response),");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new JsonTransformer());");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("get(DownloadFileIdJson, \"application/json\",");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> Json.getDownloadFile(request, response),");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new JsonTransformer());");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
