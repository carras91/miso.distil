package miso.distil.codeGenerator.generator.html;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.generator.generateUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write HtmlXXXJson.java.
 * 
 * @author Carlos Carrascal.
 */
@SuppressWarnings("all")
public class generateHtmlJson {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private Names names;
  
  /**
   * To write Html"artifact.name"Json.java.
   * 
   * @param artifact the artifact.
   */
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    EList<ServiceEnum> _basicServices = artifact.getBasicServices();
    EList<ServiceEnum> basicServices = this.genUti.processBasicServices(_basicServices);
    _builder.newLineIfNotEmpty();
    String _name = artifact.getName();
    final String namelow = _name.toLowerCase();
    _builder.newLineIfNotEmpty();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _htmlChar = this.names.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import spark.ModelAndView;");
    _builder.newLine();
    _builder.append("import spark.Request;");
    _builder.newLine();
    _builder.append("import spark.Response;");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _or = false;
      boolean _contains = basicServices.contains(ServiceEnum.READ_ALL);
      if (_contains) {
        _or = true;
      } else {
        boolean _contains_1 = basicServices.contains(ServiceEnum.SEARCH);
        _or = _contains_1;
      }
      if (_or) {
        _builder.append("import java.util.ArrayList;");
        _builder.newLine();
      }
    }
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.names.MisoHtml, "");
    _builder.append(".HtmlInterfaceJson;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.names.MisoHtml, "");
    _builder.append(".HtmlFreeMarker;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.names.MisoHtml, "");
    _builder.append(".HtmlInterfaceView;");
    _builder.newLineIfNotEmpty();
    {
      boolean _contains_2 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_2) {
        _builder.append("import ");
        _builder.append(this.names.MisoUtils, "");
        _builder.append(".Utils;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      boolean _or_1 = false;
      boolean _or_2 = false;
      boolean _or_3 = false;
      boolean _contains_3 = basicServices.contains(ServiceEnum.READ);
      if (_contains_3) {
        _or_3 = true;
      } else {
        boolean _contains_4 = basicServices.contains(ServiceEnum.READ_ALL);
        _or_3 = _contains_4;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        boolean _contains_5 = basicServices.contains(ServiceEnum.UPDATE);
        _or_2 = _contains_5;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        boolean _contains_6 = basicServices.contains(ServiceEnum.SEARCH);
        _or_1 = _contains_6;
      }
      if (_or_1) {
        _builder.append("import ");
        CharSequence _artifactJsonFileChar = this.names.getArtifactJsonFileChar(artifact);
        _builder.append(_artifactJsonFileChar, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    CharSequence _artifactCustomFileChar = this.names.getArtifactCustomFileChar(artifact);
    _builder.append(_artifactCustomFileChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    CharSequence _artifactFileChar = this.names.getArtifactFileChar(artifact);
    _builder.append(_artifactFileChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated html methods.");
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
    _builder.append("Json implements HtmlInterfaceJson {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _or_4 = false;
      boolean _or_5 = false;
      boolean _or_6 = false;
      boolean _contains_7 = basicServices.contains(ServiceEnum.READ);
      if (_contains_7) {
        _or_6 = true;
      } else {
        boolean _contains_8 = basicServices.contains(ServiceEnum.READ_ALL);
        _or_6 = _contains_8;
      }
      if (_or_6) {
        _or_5 = true;
      } else {
        boolean _contains_9 = basicServices.contains(ServiceEnum.UPDATE);
        _or_5 = _contains_9;
      }
      if (_or_5) {
        _or_4 = true;
      } else {
        boolean _contains_10 = basicServices.contains(ServiceEnum.SEARCH);
        _or_4 = _contains_10;
      }
      if (_or_4) {
        _builder.append("\t");
        _builder.append("private ");
        _builder.append(name, "\t");
        _builder.append("Json Json = new ");
        _builder.append(name, "\t");
        _builder.append("Json();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("private Html");
    _builder.append(name, "\t");
    _builder.append("View View = new Html");
    _builder.append(name, "\t");
    _builder.append("View();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private HtmlInterfaceView<");
    _builder.append(name, "\t");
    _builder.append("> customView;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated empty constructor. To use auto-generated Html");
    _builder.append(name, "\t ");
    _builder.append("View.");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Html");
    _builder.append(name, "\t");
    _builder.append("Json() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("customView = View;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated constructor with a custom view.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param View Custom View.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Html");
    _builder.append(name, "\t");
    _builder.append("Json(Custom");
    _builder.append(name, "\t");
    _builder.append("Html View) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("customView = View;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _contains_11 = basicServices.contains(ServiceEnum.READ);
      if (_contains_11) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to read the information from an artifact.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param req Spark request.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param res Spark response.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return special structure for SPARK.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getRead(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(name, "\t\t");
        _builder.append(" ");
        _builder.append(namelow, "\t\t");
        _builder.append(" = (");
        _builder.append(name, "\t\t");
        _builder.append(") Json.getRead(req, res);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if(");
        _builder.append(namelow, "\t\t");
        _builder.append(" == null) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.ERROR, \"");
        _builder.append(name, "\t\t\t");
        _builder.append(" not found in data base\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.ENTRIES, customView.constructInfoReadOne(");
        _builder.append(namelow, "\t\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.READ_HTML);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_12 = basicServices.contains(ServiceEnum.READ_ALL);
      if (_contains_12) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to read the information from an artifact\'s list.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param req Spark request.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param res Spark response.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return special structure for SPARK.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getReadAll(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("ArrayList<");
        _builder.append(name, "\t\t");
        _builder.append("> ");
        _builder.append(namelow, "\t\t");
        _builder.append("s = new ArrayList<");
        _builder.append(name, "\t\t");
        _builder.append(">();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(namelow, "\t\t");
        _builder.append("s.addAll(Json.getReadAll(req, res));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(");
        _builder.append(namelow, "\t\t");
        _builder.append("s));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.COUNT, ");
        _builder.append(namelow, "\t\t");
        _builder.append("s.size());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_13 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_13) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to construct the search form.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return special structure for SPARK.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getSearchForm() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects = View.constructSearchForm();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); ");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_14 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_14) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to read the information from the result list of a search.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param req Spark request.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param res Spark response.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return special structure for SPARK.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getSearch(Request req, Response res) {\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("ArrayList<");
        _builder.append(name, "\t\t");
        _builder.append("> ");
        _builder.append(namelow, "\t\t");
        _builder.append("s = new ArrayList<");
        _builder.append(name, "\t\t");
        _builder.append(">();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(namelow, "\t\t");
        _builder.append("s.addAll(Json.getSearch(req, res));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if(");
        _builder.append(namelow, "\t\t");
        _builder.append("s.isEmpty()) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects = View.constructSearchForm();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.EMPTY, \"");
        _builder.append(name, "\t\t\t");
        _builder.append(" not found in data base\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} else {\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.MULTI_ENTRIES, customView.constructInfoReadAll(");
        _builder.append(namelow, "\t\t\t");
        _builder.append("s));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.COUNT, ");
        _builder.append(namelow, "\t\t\t");
        _builder.append("s.size());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.SYNONYMS_VALUES, Utils.listToString(Json.getSynonymsValue(req, res)));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.LIST_HTML);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_15 = basicServices.contains(ServiceEnum.UPDATE);
      if (_contains_15) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to construct the update form.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param req Spark request.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param res Spark response.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return special structure for SPARK.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getUpdateForm(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(name, "\t\t");
        _builder.append(" ");
        _builder.append(namelow, "\t\t");
        _builder.append(" = (");
        _builder.append(name, "\t\t");
        _builder.append(") Json.getRead(req, res);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if(");
        _builder.append(namelow, "\t\t");
        _builder.append(" == null) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.ERROR, \"");
        _builder.append(name, "\t\t\t");
        _builder.append(" not found in data base\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("viewObjects = customView.constructUpdateForm(");
        _builder.append(namelow, "\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_16 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_16) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to construct the upload form.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param req Spark request.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @param res Spark response.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* @return special structure for SPARK.");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ModelAndView getUploadForm(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects = customView.constructUploadForm();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEMPLATE, HtmlFreeMarker.FORM_HTML); ");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return HtmlFreeMarker.closeHtml(viewObjects);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
