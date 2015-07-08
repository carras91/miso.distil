package miso.carrascal.codeGenerator.generator.html;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import miso.carrascal.codeGenerator.generator.packages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write HtmlXXXSpark.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateHtmlSpark {
  @Inject
  private packages pack;
  
  /**
   * To write Html<artifact.name>Spark.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    EList<ServiceEnum> basicServices = artifact.getBasicServices();
    _builder.newLineIfNotEmpty();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    final String namelow = name.toLowerCase();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _htmlChar = this.pack.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import static spark.Spark.get;");
    _builder.newLine();
    _builder.append("import spark.template.freemarker.FreeMarkerEngine;");
    _builder.newLine();
    {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _contains = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains) {
        _or_1 = true;
      } else {
        boolean _contains_1 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
        _or_1 = _contains_1;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _contains_2 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or = _contains_2;
      }
      if (_or) {
        _builder.newLine();
        _builder.append("import java.util.ArrayList;");
        _builder.newLine();
        _builder.append("import java.util.List;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.pack.MisoBasic, "");
    _builder.append(".BasicInterfaceSpark;");
    _builder.newLineIfNotEmpty();
    {
      boolean _or_2 = false;
      boolean _or_3 = false;
      boolean _contains_3 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_3) {
        _or_3 = true;
      } else {
        boolean _contains_4 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
        _or_3 = _contains_4;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        boolean _contains_5 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or_2 = _contains_5;
      }
      if (_or_2) {
        _builder.append("import ");
        _builder.append(this.pack.MisoHtml, "");
        _builder.append(".HtmlFreeMarker;");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        _builder.append(this.pack.MisoHtml, "");
        _builder.append(".htmlObjects.HtmlLayout;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    {
      boolean _or_4 = false;
      boolean _contains_6 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
      if (_contains_6) {
        _or_4 = true;
      } else {
        boolean _contains_7 = basicServices.contains(ServiceEnum.READ_LITERAL);
        _or_4 = _contains_7;
      }
      if (_or_4) {
        _builder.append("import ");
        CharSequence _basicChar = this.pack.getBasicChar(artifact);
        _builder.append(_basicChar, "");
        _builder.append(".Basic");
        _builder.append(name, "");
        _builder.append("Param;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    CharSequence _artifactChar = this.pack.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(".Custom");
    _builder.append(name, "");
    _builder.append("Html;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    CharSequence _htmlChar_1 = this.pack.getHtmlChar(artifact);
    _builder.append(_htmlChar_1, "");
    _builder.append(".Html");
    _builder.append(name, "");
    _builder.append("Json;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated html spark server");
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
    _builder.append("public final class Html");
    _builder.append(name, "");
    _builder.append("Spark implements BasicInterfaceSpark {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// URL\'s");
    _builder.newLine();
    {
      boolean _contains_8 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_8) {
        _builder.append("\t");
        _builder.append("public static String ReadHTML = \"/html/");
        _builder.append(namelow, "\t");
        _builder.append("/read/\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public static String ReadIdHTML = ReadHTML + Basic");
        _builder.append(name, "\t");
        _builder.append("Param.IdGet;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_9 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_9) {
        _builder.append("\t");
        _builder.append("public static String ReadAllHTML = \"/html/");
        _builder.append(namelow, "\t");
        _builder.append("/all\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public static String SearchHTML = \"/html/");
        _builder.append(namelow, "\t");
        _builder.append("/search\";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_10 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_10) {
        _builder.append("\t");
        _builder.append("public static String SearchFormHTML = \"/html/");
        _builder.append(namelow, "\t");
        _builder.append("/search/form\";");
        _builder.newLineIfNotEmpty();
        {
          boolean _contains_11 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
          boolean _not = (!_contains_11);
          if (_not) {
            _builder.append("\t");
            _builder.append("public static String SearchHTML = \"/html/");
            _builder.append(namelow, "\t");
            _builder.append("/search\";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _contains_12 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
      if (_contains_12) {
        _builder.append("\t");
        _builder.append("public static String UpdateFormHTML = \"/html/");
        _builder.append(namelow, "\t");
        _builder.append("/update/\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public static String UpdateFormIdHTML = UpdateFormHTML + Basic");
        _builder.append(name, "\t");
        _builder.append("Param.IdGet;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_13 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
      if (_contains_13) {
        _builder.append("\t");
        _builder.append("public static String UploadFormHTML = \"/html/");
        _builder.append(namelow, "\t");
        _builder.append("/upload\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated html spark service. It initializes all html url\'s");
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
    _builder.append("Html");
    _builder.append(name, "\t\t");
    _builder.append("Json HTML = new Html");
    _builder.append(name, "\t\t");
    _builder.append("Json();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains_14 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_14) {
        _builder.append("\t\t");
        _builder.append("get(ReadIdHTML,");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> HTML.getRead(request, response), ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_15 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_15) {
        _builder.append("\t\t");
        _builder.append("get(ReadAllHTML,");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> HTML.getReadAll(request, response),");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_16 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_16) {
        _builder.append("\t\t");
        _builder.append("get(SearchFormHTML,");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> HTML.getSearchForm(), ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("get(SearchHTML,");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> HTML.getSearch(request, response), ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_17 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
      if (_contains_17) {
        _builder.append("\t\t");
        _builder.append("get(UpdateFormIdHTML,");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> HTML.getUpdateForm(request, response), ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_18 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
      if (_contains_18) {
        _builder.append("\t\t");
        _builder.append("get(UploadFormHTML,");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> HTML.getUploadForm(request, response),");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      boolean _or_5 = false;
      boolean _or_6 = false;
      boolean _contains_19 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_19) {
        _or_6 = true;
      } else {
        boolean _contains_20 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
        _or_6 = _contains_20;
      }
      if (_or_6) {
        _or_5 = true;
      } else {
        boolean _contains_21 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or_5 = _contains_21;
      }
      if (_or_5) {
        _builder.append("\t\t");
        _builder.append("this.addLayout();");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      boolean _or_7 = false;
      boolean _or_8 = false;
      boolean _contains_22 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_22) {
        _or_8 = true;
      } else {
        boolean _contains_23 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
        _or_8 = _contains_23;
      }
      if (_or_8) {
        _or_7 = true;
      } else {
        boolean _contains_24 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or_7 = _contains_24;
      }
      if (_or_7) {
        _builder.newLine();
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated layout service. It add\'s to the html layout some permanents links");
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
        _builder.append("private void addLayout() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlLayout> layouts = new ArrayList<HtmlLayout>();");
        _builder.newLine();
        {
          boolean _contains_25 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
          if (_contains_25) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("layouts.add(new HtmlLayout(\"Read all ");
            _builder.append(namelow, "\t\t");
            _builder.append("s\" , ReadAllHTML));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _contains_26 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
          if (_contains_26) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("layouts.add(new HtmlLayout(\"Upload ");
            _builder.append(namelow, "\t\t");
            _builder.append("\" , UploadFormHTML));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _contains_27 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
          if (_contains_27) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("layouts.add(new HtmlLayout(\"Search ");
            _builder.append(namelow, "\t\t");
            _builder.append("\" , SearchFormHTML));");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("HtmlFreeMarker.addLayout(\"");
        _builder.append(name, "\t\t");
        _builder.append("\", layouts);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static Html");
    _builder.append(name, "\t");
    _builder.append("Json HTML = new Html");
    _builder.append(name, "\t");
    _builder.append("Json(new Custom");
    _builder.append(name, "\t");
    _builder.append("Html());");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains_28 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_28) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to overwrite the information from an artifact");
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
        _builder.append("public static void overWriteInfoReadOne() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("get(ReadIdHTML,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("(request, response) -> HTML.getRead(request, response), ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_29 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_29) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to overwrite the information from an artifact\'s list");
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
        _builder.append("public static void overWriteInfoReadAll() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("get(ReadAllHTML,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("(request, response) -> HTML.getReadAll(request, response), ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("get(SearchHTML,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("(request, response) -> HTML.getSearch(request, response), ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_30 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_30) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to overwrite the search form");
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
        _builder.append("public static void overWriteSearchForm() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("get(SearchFormHTML,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("(request, response) -> HTML.getSearchForm(), ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_31 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
      if (_contains_31) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to overwrite the update form");
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
        _builder.append("public static void overWriteUpdateForm() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("get(UpdateFormIdHTML,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("(request, response) -> HTML.getUpdateForm(request, response), ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_32 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
      if (_contains_32) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to overwrite the upload form");
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
        _builder.append("public static void overWriteUploadForm() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("get(UploadFormHTML,");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("(request, response) -> HTML.getUploadForm(request, response), ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("new FreeMarkerEngine());");
        _builder.newLine();
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
