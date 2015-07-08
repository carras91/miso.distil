package miso.carrascal.codeGenerator.generator.custom;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import miso.carrascal.codeGenerator.generator.packages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write CustomXXXHtml.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateCustomHtml {
  @Inject
  private packages pack;
  
  /**
   * To write Custom<artifact.name>Html.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    EList<ServiceEnum> basicServices = artifact.getBasicServices();
    _builder.newLineIfNotEmpty();
    String _name = artifact.getName();
    final String namelow = _name.toLowerCase();
    _builder.newLineIfNotEmpty();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _artifactChar = this.pack.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
      if (_contains) {
        _builder.append("import spark.Request;");
        _builder.newLine();
        _builder.newLine();
      }
    }
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _contains_1 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_1) {
        _or_1 = true;
      } else {
        boolean _contains_2 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
        _or_1 = _contains_2;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _contains_3 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
        _or = _contains_3;
      }
      if (_or) {
        _builder.append("import java.util.HashMap;");
        _builder.newLine();
        _builder.append("import java.util.Map;");
        _builder.newLine();
      }
    }
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.pack.MisoHtml, "");
    _builder.append(".HtmlInterfaceView;");
    _builder.newLineIfNotEmpty();
    {
      boolean _or_2 = false;
      boolean _or_3 = false;
      boolean _contains_4 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_4) {
        _or_3 = true;
      } else {
        boolean _contains_5 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
        _or_3 = _contains_5;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        boolean _contains_6 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
        _or_2 = _contains_6;
      }
      if (_or_2) {
        _builder.append("import ");
        _builder.append(this.pack.MisoHtml, "");
        _builder.append(".HtmlFreeMarker;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    _builder.append(this.pack.MisoHtml, "");
    _builder.append(".htmlObjects.*;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.pack.MisoBasic, "");
    _builder.append(".BasicInterfaceSpark;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _or_4 = false;
      boolean _or_5 = false;
      boolean _contains_7 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_7) {
        _or_5 = true;
      } else {
        boolean _contains_8 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
        _or_5 = _contains_8;
      }
      if (_or_5) {
        _or_4 = true;
      } else {
        boolean _contains_9 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
        _or_4 = _contains_9;
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
    {
      boolean _or_6 = false;
      boolean _contains_10 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
      if (_contains_10) {
        _or_6 = true;
      } else {
        boolean _contains_11 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
        _or_6 = _contains_11;
      }
      if (_or_6) {
        _builder.append("import ");
        CharSequence _basicChar_1 = this.pack.getBasicChar(artifact);
        _builder.append(_basicChar_1, "");
        _builder.append(".Basic");
        _builder.append(name, "");
        _builder.append("Spark;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_12 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_12) {
        _builder.append("import ");
        CharSequence _htmlChar = this.pack.getHtmlChar(artifact);
        _builder.append(_htmlChar, "");
        _builder.append(".Html");
        _builder.append(name, "");
        _builder.append("Spark;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    CharSequence _artifactChar_1 = this.pack.getArtifactChar(artifact);
    _builder.append(_artifactChar_1, "");
    _builder.append(".");
    _builder.append(name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated custom html spark server");
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
    _builder.append("public class Custom");
    _builder.append(name, "");
    _builder.append("Html implements HtmlInterfaceView<");
    _builder.append(name, "");
    _builder.append(">, BasicInterfaceSpark");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated custom spark service. It overwrites some html URL\'s");
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
    {
      boolean _or_7 = false;
      boolean _or_8 = false;
      boolean _or_9 = false;
      boolean _or_10 = false;
      boolean _contains_13 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_13) {
        _or_10 = true;
      } else {
        boolean _contains_14 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
        _or_10 = _contains_14;
      }
      if (_or_10) {
        _or_9 = true;
      } else {
        boolean _contains_15 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
        _or_9 = _contains_15;
      }
      if (_or_9) {
        _or_8 = true;
      } else {
        boolean _contains_16 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
        _or_8 = _contains_16;
      }
      if (_or_8) {
        _or_7 = true;
      } else {
        boolean _contains_17 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
        _or_7 = _contains_17;
      }
      if (_or_7) {
        _builder.append("\t\t");
        _builder.append("// To overwrite the default constructions of HTML");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Be careful: you need to modify the method previously");
        _builder.newLine();
      }
    }
    {
      boolean _contains_18 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_18) {
        _builder.append("\t\t");
        _builder.append("// Html");
        _builder.append(name, "\t\t");
        _builder.append("Spark.overWriteInfoReadOne();");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_19 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_19) {
        _builder.append("\t\t");
        _builder.append("// Html");
        _builder.append(name, "\t\t");
        _builder.append("Spark.overWriteInfoReadAll();");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_20 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_20) {
        _builder.append("\t\t");
        _builder.append("// Html");
        _builder.append(name, "\t\t");
        _builder.append("Spark.overWriteSearchForm();");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_21 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
      if (_contains_21) {
        _builder.append("\t\t");
        _builder.append("// Html");
        _builder.append(name, "\t\t");
        _builder.append("Spark.overWriteUpdateForm();");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _contains_22 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
      if (_contains_22) {
        _builder.append("\t\t");
        _builder.append("// Html");
        _builder.append(name, "\t\t");
        _builder.append("Spark.overWriteUploadForm();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _contains_23 = basicServices.contains(ServiceEnum.READ_LITERAL);
      if (_contains_23) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to customice the information from an artifact");
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
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public List<HtmlEntry> constructInfoReadOne(");
        _builder.append(name, "\t");
        _builder.append(" ");
        _builder.append(namelow, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlEntry> entries = new ArrayList<HtmlEntry>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// Add the information you want, line per line");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("entries.add(new HtmlEntry(");
        _builder.append(namelow, "\t\t\t");
        _builder.append(".getObjectName(), EntrySize.H3));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return entries;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_24 = basicServices.contains(ServiceEnum.READ_ALL_LITERAL);
      if (_contains_24) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to customice the information from an artifact\'s list");
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
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public List<List<HtmlEntry>> constructInfoReadAll(List<");
        _builder.append(name, "\t");
        _builder.append("> ");
        _builder.append(namelow, "\t");
        _builder.append("s) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<List<HtmlEntry>> multientries = new ArrayList<List<HtmlEntry>>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Add the information you want, line per line, from various ");
        _builder.append(name, "\t\t");
        _builder.append("s");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for(");
        _builder.append(name, "\t\t");
        _builder.append(" ");
        _builder.append(namelow, "\t\t");
        _builder.append(" : ");
        _builder.append(namelow, "\t\t");
        _builder.append("s) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("List<HtmlEntry> entries = new ArrayList<HtmlEntry>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("entries.add(new HtmlEntry(");
        _builder.append(namelow, "\t\t\t");
        _builder.append(".getObjectName(), EntrySize.H4));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("multientries.add(entries);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return multientries;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_25 = basicServices.contains(ServiceEnum.SEARCH_LITERAL);
      if (_contains_25) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to customice the search form");
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
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public Map<String, Object> constructSearchForm() {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// You need to add first a Form");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("HtmlForm form = new HtmlForm(Html");
        _builder.append(name, "\t\t");
        _builder.append("Spark.SearchHTML, \"");
        _builder.append(namelow, "\t\t");
        _builder.append("-search-form\", HtmlFreeMarker.ENCTYPE_DEFAULT, \"Search\", \"GET\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.FORM, form);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Then, whatever you want in your Form: Text, Radio, Hidden, File");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlText> texts = new ArrayList<HtmlText>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("texts.add(new HtmlText(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Search_query, \"\", \"Search (name)\", \"search\", \"Enter where do you want to search\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("texts.add(new HtmlText(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Search_value, \"\", \"Search (value)\", \"search\", \"Enter what do you want to search\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEXTS, texts);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlRadio> radios = new ArrayList<HtmlRadio>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("radios.add(new HtmlRadio(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Synonyms_query, \"Synonyms (name)\", \"synonyms\", true));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("radios.add(new HtmlRadio(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Synonyms_value, \"Synonyms (value)\", \"synonyms\", true));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.RADIOS, radios);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return viewObjects;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_26 = basicServices.contains(ServiceEnum.UPDATE_LITERAL);
      if (_contains_26) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to customice the update form");
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
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public Map<String, Object> constructUpdateForm(");
        _builder.append(name, "\t");
        _builder.append(" ");
        _builder.append(namelow, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// You need to add first a Form");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("HtmlForm form = new HtmlForm(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Spark.UpdateJson, \"");
        _builder.append(namelow, "\t\t");
        _builder.append("-update-form\", HtmlFreeMarker.ENCTYPE_DEFAULT, \"Update\", \"POST\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.FORM, form);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Then, whatever you want in your Form: Text, Radio, Hidden, File");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlText> texts = new ArrayList<HtmlText>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("texts.add(new HtmlText(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Tags, ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getTagsString(), \"Tags (tag1,tag2,tag3,...)\", \"tags\", \"\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEXTS, texts);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// List<HtmlRadio> radios = new ArrayList<HtmlRadio>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// radios.add(new HtmlRadio(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Bool, \"Bool\", \"bool\", true));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// viewObjects.put(HtmlFreeMarker.RADIOS, radios);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("hiddens.add(new HtmlHidden(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.IdPost, ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectId()));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlFile> file = new ArrayList<HtmlFile>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("file.add(new HtmlFile(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.File, \"Choose your ");
        _builder.append(namelow, "\t\t");
        _builder.append("\", \"file\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.FILE, file);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return viewObjects;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_27 = basicServices.contains(ServiceEnum.UPLOAD_LITERAL);
      if (_contains_27) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to customice the upload form");
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
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public Map<String, Object> constructUploadForm(Request req) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, Object> viewObjects = new HashMap<String, Object>();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// You need to add first a Form");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("HtmlForm form = new HtmlForm(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Spark.UploadJson, \"");
        _builder.append(namelow, "\t\t");
        _builder.append("-upload-form\", HtmlFreeMarker.ENCTYPE_DEFAULT, \"Upload\", \"POST\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.FORM, form);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Then, whatever you want in your Form: Text, Radio, Hidden, File");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlText> texts = new ArrayList<HtmlText>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("texts.add(new HtmlText(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Tags, \"\", \"Tags (tag1,tag2,tag3,...)\", \"tags\", \"Enter new tags\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.TEXTS, texts);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// List<HtmlRadio> radios = new ArrayList<HtmlRadio>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// radios.add(new HtmlRadio(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Bool, \"Bool\", \"bool\", true));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// viewObjects.put(HtmlFreeMarker.RADIOS, radios);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlHidden> hiddens = new ArrayList<HtmlHidden>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("hiddens.add(new HtmlHidden(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.IdPost, \"This is a secret!\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlFile> file = new ArrayList<HtmlFile>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("file.add(new HtmlFile(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.File, \"Choose your ");
        _builder.append(namelow, "\t\t");
        _builder.append("\", \"file\"));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// ..");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.FILE, file);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return viewObjects;");
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
