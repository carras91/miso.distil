package miso.distil.codeGenerator.generator.html;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ArtifactID;
import codeGeneratorModel.Attribute;
import codeGeneratorModel.DataEnum;
import codeGeneratorModel.Primitive;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.generator.generateUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * To write HtmlXXXView.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateHtmlView {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private Names names;
  
  /**
   * To write Html<artifact.name>View.java
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
    EList<Attribute> _attributes = artifact.getAttributes();
    final EList<Attribute> allAtts = this.genUti.getAllNestedAttributes(_attributes);
    _builder.newLineIfNotEmpty();
    int pos = (-1);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _htmlChar = this.names.getHtmlChar(artifact);
    _builder.append(_htmlChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains = basicServices.contains(ServiceEnum.UPLOAD);
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
      boolean _contains_1 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_1) {
        _or_1 = true;
      } else {
        boolean _contains_2 = basicServices.contains(ServiceEnum.UPDATE);
        _or_1 = _contains_2;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _contains_3 = basicServices.contains(ServiceEnum.UPLOAD);
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
    _builder.append(this.names.MisoHtml, "");
    _builder.append(".HtmlInterfaceView;");
    _builder.newLineIfNotEmpty();
    {
      boolean _or_2 = false;
      boolean _or_3 = false;
      boolean _contains_4 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_4) {
        _or_3 = true;
      } else {
        boolean _contains_5 = basicServices.contains(ServiceEnum.UPDATE);
        _or_3 = _contains_5;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        boolean _contains_6 = basicServices.contains(ServiceEnum.UPLOAD);
        _or_2 = _contains_6;
      }
      if (_or_2) {
        _builder.append("import ");
        _builder.append(this.names.MisoHtml, "");
        _builder.append(".HtmlFreeMarker;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    _builder.append(this.names.MisoHtml, "");
    _builder.append(".htmlObjects.*;");
    _builder.newLineIfNotEmpty();
    {
      boolean _or_4 = false;
      boolean _contains_7 = basicServices.contains(ServiceEnum.READ);
      if (_contains_7) {
        _or_4 = true;
      } else {
        boolean _contains_8 = basicServices.contains(ServiceEnum.UPDATE);
        _or_4 = _contains_8;
      }
      if (_or_4) {
        boolean util = false;
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att : allAtts) {
            {
              boolean _and = false;
              boolean _and_1 = false;
              if (!((att instanceof Primitive) || (att instanceof ArtifactID))) {
                _and_1 = false;
              } else {
                boolean _isMany = att.isMany();
                _and_1 = _isMany;
              }
              if (!_and_1) {
                _and = false;
              } else {
                _and = (!util);
              }
              if (_and) {
                Object _xblockexpression = null;
                {
                  util = true;
                  _xblockexpression = null;
                }
                _builder.append(_xblockexpression, "");
                _builder.newLineIfNotEmpty();
                _builder.append("import ");
                _builder.append(this.names.MisoUtils, "");
                _builder.append(".Utils;");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    {
      boolean _or_5 = false;
      boolean _or_6 = false;
      boolean _contains_9 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_9) {
        _or_6 = true;
      } else {
        boolean _contains_10 = basicServices.contains(ServiceEnum.UPLOAD);
        _or_6 = _contains_10;
      }
      if (_or_6) {
        _or_5 = true;
      } else {
        boolean _contains_11 = basicServices.contains(ServiceEnum.UPDATE);
        _or_5 = _contains_11;
      }
      if (_or_5) {
        _builder.append("import ");
        CharSequence _bParamFileChar = this.names.getBParamFileChar(artifact);
        _builder.append(_bParamFileChar, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _or_7 = false;
      boolean _contains_12 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_12) {
        _or_7 = true;
      } else {
        boolean _contains_13 = basicServices.contains(ServiceEnum.UPDATE);
        _or_7 = _contains_13;
      }
      if (_or_7) {
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
    _builder.append("public class Html");
    _builder.append(name, "");
    _builder.append("View implements HtmlInterfaceView<");
    _builder.append(name, "");
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains_14 = basicServices.contains(ServiceEnum.READ);
      if (_contains_14) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to construct the information from an artifact");
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
        _builder.append("\t");
        _builder.append("entries.add(new HtmlEntry(");
        _builder.append(namelow, "\t\t");
        _builder.append(".getFilename(), EntrySize.H3));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("entries.add(new HtmlEntry(");
        _builder.append(namelow, "\t\t");
        _builder.append(".getCreatedatString(), EntrySize.H4));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("entries.add(new HtmlEntry(\"FileSize (bytes): \" + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getFilesize().toString(), EntrySize.H4));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("entries.add(new HtmlEntry(\"ObjectId : \" + ");
        _builder.append(namelow, "\t\t");
        _builder.append(".getObjectid().toString(), EntrySize.H4));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        Object _xblockexpression_1 = null;
        {
          pos = (-1);
          _xblockexpression_1 = null;
        }
        _builder.append(_xblockexpression_1, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_1 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_2 = null;
            {
              pos++;
              _xblockexpression_2 = null;
            }
            _builder.append(_xblockexpression_2, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_1 instanceof Primitive)) {
                _builder.append("\t");
                _builder.append("\t");
                final String newName = this.genUti.getNewAttNameByPoint(Integer.valueOf(pos), artifact);
                _builder.newLineIfNotEmpty();
                {
                  boolean _and_2 = false;
                  DataEnum _type = ((Primitive)att_1).getType();
                  boolean _equals = _type.equals(DataEnum.STRING);
                  if (!_equals) {
                    _and_2 = false;
                  } else {
                    boolean _isMany_1 = ((Primitive)att_1).isMany();
                    boolean _not = (!_isMany_1);
                    _and_2 = _not;
                  }
                  if (_and_2) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("entries.add(new HtmlEntry(\"");
                    _builder.append(newName, "\t\t");
                    _builder.append(" : \" + ");
                    String _nestedGets = this.genUti.getNestedGets(Integer.valueOf(pos), artifact);
                    _builder.append(_nestedGets, "\t\t");
                    _builder.append(", EntrySize.H5));");
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _and_3 = false;
                    boolean _or_8 = false;
                    boolean _or_9 = false;
                    DataEnum _type_1 = ((Primitive)att_1).getType();
                    boolean _equals_1 = _type_1.equals(DataEnum.DOUBLE);
                    if (_equals_1) {
                      _or_9 = true;
                    } else {
                      DataEnum _type_2 = ((Primitive)att_1).getType();
                      boolean _equals_2 = _type_2.equals(DataEnum.DOUBLE);
                      _or_9 = _equals_2;
                    }
                    if (_or_9) {
                      _or_8 = true;
                    } else {
                      DataEnum _type_3 = ((Primitive)att_1).getType();
                      boolean _equals_3 = _type_3.equals(DataEnum.INTEGER);
                      _or_8 = _equals_3;
                    }
                    if (!_or_8) {
                      _and_3 = false;
                    } else {
                      boolean _isMany_2 = ((Primitive)att_1).isMany();
                      boolean _not_1 = (!_isMany_2);
                      _and_3 = _not_1;
                    }
                    if (_and_3) {
                      _builder.append("\t");
                      _builder.append("\t");
                      _builder.append("entries.add(new HtmlEntry(\"");
                      _builder.append(newName, "\t\t");
                      _builder.append(" : \" + ");
                      String _nestedGets_1 = this.genUti.getNestedGets(Integer.valueOf(pos), artifact);
                      _builder.append(_nestedGets_1, "\t\t");
                      _builder.append(".toString(), EntrySize.H5));");
                      _builder.newLineIfNotEmpty();
                    } else {
                      boolean _isMany_3 = ((Primitive)att_1).isMany();
                      if (_isMany_3) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("entries.add(new HtmlEntry(\"");
                        _builder.append(newName, "\t\t");
                        _builder.append(" : \" + Utils.listToString(");
                        String _nestedGets_2 = this.genUti.getNestedGets(Integer.valueOf(pos), artifact);
                        _builder.append(_nestedGets_2, "\t\t");
                        _builder.append("), EntrySize.H5));\t\t\t\t");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
            {
              if ((att_1 instanceof ArtifactID)) {
                _builder.append("\t");
                _builder.append("\t");
                final String newName_1 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                _builder.newLineIfNotEmpty();
                {
                  boolean _isMany_4 = ((ArtifactID)att_1).isMany();
                  boolean _not_2 = (!_isMany_4);
                  if (_not_2) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("entries.add(new HtmlEntry(\"");
                    _builder.append(newName_1, "\t\t");
                    _builder.append(" : \" + ");
                    String _nestedGets_3 = this.genUti.getNestedGets(Integer.valueOf(pos), artifact);
                    _builder.append(_nestedGets_3, "\t\t");
                    _builder.append(", EntrySize.H5));");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("entries.add(new HtmlEntry(\"");
                    _builder.append(newName_1, "\t\t");
                    _builder.append(" : \" + Utils.listToString(");
                    String _nestedGets_4 = this.genUti.getNestedGets(Integer.valueOf(pos), artifact);
                    _builder.append(_nestedGets_4, "\t\t");
                    _builder.append("), EntrySize.H5));\t\t\t\t");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        {
          boolean _contains_15 = basicServices.contains(ServiceEnum.DOWNLOAD);
          if (_contains_15) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("entries.add(new HtmlEntry(Html");
            _builder.append(name, "\t\t");
            _builder.append("Links.getDownloadJsonLink(");
            _builder.append(namelow, "\t\t");
            _builder.append("), EntrySize.H5));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _contains_16 = basicServices.contains(ServiceEnum.UPDATE);
          if (_contains_16) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("entries.add(new HtmlEntry(Html");
            _builder.append(name, "\t\t");
            _builder.append("Links.getUpdateHtmlLink(");
            _builder.append(namelow, "\t\t");
            _builder.append("), EntrySize.H5));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _contains_17 = basicServices.contains(ServiceEnum.DELETE);
          if (_contains_17) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("entries.add(new HtmlEntry(Html");
            _builder.append(name, "\t\t");
            _builder.append("Links.getDeleteFormJsonLink(");
            _builder.append(namelow, "\t\t");
            _builder.append("), EntrySize.H5));");
            _builder.newLineIfNotEmpty();
          }
        }
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
      boolean _contains_18 = basicServices.contains(ServiceEnum.READ_ALL);
      if (_contains_18) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to construct the information from an artifact\'s list");
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
        _builder.append("\t\t");
        _builder.append("for(");
        _builder.append(name, "\t\t\t");
        _builder.append(" ");
        _builder.append(namelow, "\t\t\t");
        _builder.append(" : ");
        _builder.append(namelow, "\t\t\t");
        _builder.append("s) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("List<HtmlEntry> entries = new ArrayList<HtmlEntry>();");
        _builder.newLine();
        {
          boolean _contains_19 = basicServices.contains(ServiceEnum.READ);
          if (_contains_19) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("entries.add(new HtmlEntry(Html");
            _builder.append(name, "\t\t\t\t");
            _builder.append("Links.getReadHtmlLink(");
            _builder.append(namelow, "\t\t\t\t");
            _builder.append("), EntrySize.H3));");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("entries.add(new HtmlEntry(");
        _builder.append(namelow, "\t\t\t\t");
        _builder.append(".getCreatedatString(), EntrySize.H4));");
        _builder.newLineIfNotEmpty();
        {
          boolean _contains_20 = basicServices.contains(ServiceEnum.READ);
          if (_contains_20) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("entries.add(new HtmlEntry(Html");
            _builder.append(name, "\t\t\t\t");
            _builder.append("Links.getReadJsonLink(");
            _builder.append(namelow, "\t\t\t\t");
            _builder.append("), EntrySize.H5));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _contains_21 = basicServices.contains(ServiceEnum.UPDATE);
          if (_contains_21) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("entries.add(new HtmlEntry(Html");
            _builder.append(name, "\t\t\t\t");
            _builder.append("Links.getUpdateHtmlLink(");
            _builder.append(namelow, "\t\t\t\t");
            _builder.append("), EntrySize.H5));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _contains_22 = basicServices.contains(ServiceEnum.DELETE);
          if (_contains_22) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("entries.add(new HtmlEntry(Html");
            _builder.append(name, "\t\t\t\t");
            _builder.append("Links.getDeleteFormJsonLink(");
            _builder.append(namelow, "\t\t\t\t");
            _builder.append("), EntrySize.H5));");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("multientries.add(entries);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
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
      boolean _contains_23 = basicServices.contains(ServiceEnum.SEARCH);
      if (_contains_23) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to construct the search form");
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
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, List<HtmlSelectBox>> selectbox = new HashMap<String, List<HtmlSelectBox>>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlSelectBox> boxes = new ArrayList<HtmlSelectBox>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Object _xblockexpression_3 = null;
        {
          pos = (-1);
          _xblockexpression_3 = null;
        }
        _builder.append(_xblockexpression_3, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_2 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_4 = null;
            {
              pos++;
              _xblockexpression_4 = null;
            }
            _builder.append(_xblockexpression_4, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              boolean _or_10 = false;
              if ((att_2 instanceof Primitive)) {
                _or_10 = true;
              } else {
                _or_10 = (att_2 instanceof ArtifactID);
              }
              if (_or_10) {
                _builder.append("\t");
                _builder.append("\t");
                final String newName_2 = this.genUti.getNewAttNameByPoint(Integer.valueOf(pos), artifact);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("boxes.add(new HtmlSelectBox(\"");
                _builder.append(newName_2, "\t\t");
                _builder.append("\", \"");
                _builder.append(newName_2, "\t\t");
                _builder.append("\"));");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("selectbox.put(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Search_query, boxes);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.SELECTBOX, selectbox);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlText> texts = new ArrayList<HtmlText>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("texts.add(new HtmlText(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Search_value, \"\", \"Value\", \"search\", \"Enter what do you want to search\"));");
        _builder.newLineIfNotEmpty();
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
        _builder.append("Param.Search_synonyms, \"Synonyms\", \"synonyms\", true));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.RADIOS, radios);");
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
      boolean _contains_24 = basicServices.contains(ServiceEnum.UPDATE);
      if (_contains_24) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to construct the update form");
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
        _builder.append("List<HtmlText> texts = new ArrayList<HtmlText>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Object _xblockexpression_5 = null;
        {
          pos = (-1);
          _xblockexpression_5 = null;
        }
        _builder.append(_xblockexpression_5, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_3 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_6 = null;
            {
              pos++;
              _xblockexpression_6 = null;
            }
            _builder.append(_xblockexpression_6, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_3 instanceof Primitive)) {
                {
                  boolean _isRequired = ((Primitive)att_3).isRequired();
                  if (_isRequired) {
                    _builder.append("\t");
                    _builder.append("\t");
                    final String newName_3 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    final String newPointName = this.genUti.getNewAttNameByPoint(Integer.valueOf(pos), artifact);
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_4 = false;
                      DataEnum _type_4 = ((Primitive)att_3).getType();
                      boolean _equals_4 = _type_4.equals(DataEnum.STRING);
                      if (!_equals_4) {
                        _and_4 = false;
                      } else {
                        boolean _isMany_5 = ((Primitive)att_3).isMany();
                        boolean _not_3 = (!_isMany_5);
                        _and_4 = _not_3;
                      }
                      if (_and_4) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("texts.add(new HtmlText(Basic");
                        _builder.append(name, "\t\t");
                        _builder.append("Param.");
                        String _firstUpper = StringExtensions.toFirstUpper(newName_3);
                        _builder.append(_firstUpper, "\t\t");
                        _builder.append(", ");
                        String _nestedGets_5 = this.genUti.getNestedGets(Integer.valueOf(pos), artifact);
                        _builder.append(_nestedGets_5, "\t\t");
                        _builder.append(", \"");
                        String _lowerCase = newPointName.toLowerCase();
                        _builder.append(_lowerCase, "\t\t");
                        _builder.append("\", \"");
                        String _name_1 = ((Primitive)att_3).getName();
                        _builder.append(_name_1, "\t\t");
                        _builder.append("\", \"\"));");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _and_5 = false;
                        boolean _or_11 = false;
                        DataEnum _type_5 = ((Primitive)att_3).getType();
                        boolean _equals_5 = _type_5.equals(DataEnum.DOUBLE);
                        if (_equals_5) {
                          _or_11 = true;
                        } else {
                          DataEnum _type_6 = ((Primitive)att_3).getType();
                          boolean _equals_6 = _type_6.equals(DataEnum.INTEGER);
                          _or_11 = _equals_6;
                        }
                        if (!_or_11) {
                          _and_5 = false;
                        } else {
                          boolean _isMany_6 = ((Primitive)att_3).isMany();
                          boolean _not_4 = (!_isMany_6);
                          _and_5 = _not_4;
                        }
                        if (_and_5) {
                          _builder.append("\t");
                          _builder.append("\t");
                          _builder.append("texts.add(new HtmlText(Basic");
                          _builder.append(name, "\t\t");
                          _builder.append("Param.");
                          String _firstUpper_1 = StringExtensions.toFirstUpper(newName_3);
                          _builder.append(_firstUpper_1, "\t\t");
                          _builder.append(", ");
                          String _nestedGets_6 = this.genUti.getNestedGets(Integer.valueOf(pos), artifact);
                          _builder.append(_nestedGets_6, "\t\t");
                          _builder.append(".toString(), \"");
                          String _lowerCase_1 = newPointName.toLowerCase();
                          _builder.append(_lowerCase_1, "\t\t");
                          _builder.append("\", \"");
                          String _name_2 = ((Primitive)att_3).getName();
                          _builder.append(_name_2, "\t\t");
                          _builder.append("\", \"\"));");
                          _builder.newLineIfNotEmpty();
                        } else {
                          boolean _isMany_7 = ((Primitive)att_3).isMany();
                          if (_isMany_7) {
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("texts.add(new HtmlText(Basic");
                            _builder.append(name, "\t\t");
                            _builder.append("Param.");
                            String _firstUpper_2 = StringExtensions.toFirstUpper(newName_3);
                            _builder.append(_firstUpper_2, "\t\t");
                            _builder.append(", Utils.listToString(");
                            String _nestedGets_7 = this.genUti.getNestedGets(Integer.valueOf(pos), artifact);
                            _builder.append(_nestedGets_7, "\t\t");
                            _builder.append("), \"");
                            String _lowerCase_2 = newPointName.toLowerCase();
                            _builder.append(_lowerCase_2, "\t\t");
                            _builder.append(" (");
                            String _name_3 = ((Primitive)att_3).getName();
                            _builder.append(_name_3, "\t\t");
                            _builder.append("1,");
                            String _name_4 = ((Primitive)att_3).getName();
                            _builder.append(_name_4, "\t\t");
                            _builder.append("2,...)\", \"");
                            String _name_5 = ((Primitive)att_3).getName();
                            _builder.append(_name_5, "\t\t");
                            _builder.append("\", \"\"));");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
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
        Object _xblockexpression_7 = null;
        {
          pos = (-1);
          _xblockexpression_7 = null;
        }
        _builder.append(_xblockexpression_7, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_4 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_8 = null;
            {
              pos++;
              _xblockexpression_8 = null;
            }
            _builder.append(_xblockexpression_8, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_4 instanceof Primitive)) {
                {
                  boolean _isRequired_1 = ((Primitive)att_4).isRequired();
                  if (_isRequired_1) {
                    _builder.append("\t");
                    _builder.append("\t");
                    String newName_4 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    final String newPointName_1 = this.genUti.getNewAttNameByPoint(Integer.valueOf(pos), artifact);
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_6 = false;
                      DataEnum _type_7 = ((Primitive)att_4).getType();
                      boolean _equals_7 = _type_7.equals(DataEnum.BOOLEAN);
                      if (!_equals_7) {
                        _and_6 = false;
                      } else {
                        boolean _isMany_8 = ((Primitive)att_4).isMany();
                        boolean _not_5 = (!_isMany_8);
                        _and_6 = _not_5;
                      }
                      if (_and_6) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("radios.add(new HtmlRadio(Basic");
                        _builder.append(name, "\t\t");
                        _builder.append("Param.");
                        String _firstUpper_3 = StringExtensions.toFirstUpper(newName_4);
                        _builder.append(_firstUpper_3, "\t\t");
                        _builder.append(", \"");
                        String _lowerCase_3 = newPointName_1.toLowerCase();
                        _builder.append(_lowerCase_3, "\t\t");
                        _builder.append("\", \"");
                        String _name_6 = ((Primitive)att_4).getName();
                        _builder.append(_name_6, "\t\t");
                        _builder.append("\", ");
                        String _nestedGets_8 = this.genUti.getNestedGets(Integer.valueOf(pos), artifact);
                        _builder.append(_nestedGets_8, "\t\t");
                        _builder.append("));");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.RADIOS, radios);");
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
        _builder.append(".getObjectid()));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.HIDDENS, hiddens);");
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
      boolean _contains_25 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_25) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to construct the upload form");
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
        _builder.append("HtmlForm form = new HtmlForm(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Spark.UploadJson, \"");
        _builder.append(namelow, "\t\t");
        _builder.append("-upload-form\", HtmlFreeMarker.ENCTYPE_FILE, \"Upload\", \"POST\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.FORM, form);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<HtmlText> texts = new ArrayList<HtmlText>();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Object _xblockexpression_9 = null;
        {
          pos = (-1);
          _xblockexpression_9 = null;
        }
        _builder.append(_xblockexpression_9, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_5 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_10 = null;
            {
              pos++;
              _xblockexpression_10 = null;
            }
            _builder.append(_xblockexpression_10, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_5 instanceof Primitive)) {
                {
                  boolean _isRequired_2 = ((Primitive)att_5).isRequired();
                  if (_isRequired_2) {
                    _builder.append("\t");
                    _builder.append("\t");
                    final String newName_5 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    final String newPointName_2 = this.genUti.getNewAttNameByPoint(Integer.valueOf(pos), artifact);
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_7 = false;
                      DataEnum _type_8 = ((Primitive)att_5).getType();
                      boolean _equals_8 = _type_8.equals(DataEnum.BOOLEAN);
                      boolean _not_6 = (!_equals_8);
                      if (!_not_6) {
                        _and_7 = false;
                      } else {
                        boolean _isMany_9 = ((Primitive)att_5).isMany();
                        boolean _not_7 = (!_isMany_9);
                        _and_7 = _not_7;
                      }
                      if (_and_7) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("texts.add(new HtmlText(Basic");
                        _builder.append(name, "\t\t");
                        _builder.append("Param.");
                        String _firstUpper_4 = StringExtensions.toFirstUpper(newName_5);
                        _builder.append(_firstUpper_4, "\t\t");
                        _builder.append(", \"\", \"");
                        String _lowerCase_4 = newPointName_2.toLowerCase();
                        _builder.append(_lowerCase_4, "\t\t");
                        _builder.append("\", \"");
                        String _name_7 = ((Primitive)att_5).getName();
                        _builder.append(_name_7, "\t\t");
                        _builder.append("\", \"Enter valid ");
                        DataEnum _type_9 = ((Primitive)att_5).getType();
                        String _string = _type_9.toString();
                        _builder.append(_string, "\t\t");
                        _builder.append("\"));");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _isMany_10 = ((Primitive)att_5).isMany();
                        if (_isMany_10) {
                          _builder.append("\t");
                          _builder.append("\t");
                          _builder.append("texts.add(new HtmlText(Basic");
                          _builder.append(name, "\t\t");
                          _builder.append("Param.");
                          String _firstUpper_5 = StringExtensions.toFirstUpper(newName_5);
                          _builder.append(_firstUpper_5, "\t\t");
                          _builder.append(", \"\", \"");
                          String _lowerCase_5 = newPointName_2.toLowerCase();
                          _builder.append(_lowerCase_5, "\t\t");
                          _builder.append(" (");
                          String _name_8 = ((Primitive)att_5).getName();
                          _builder.append(_name_8, "\t\t");
                          _builder.append("1,");
                          String _name_9 = ((Primitive)att_5).getName();
                          _builder.append(_name_9, "\t\t");
                          _builder.append("2,...)\", \"");
                          String _name_10 = ((Primitive)att_5).getName();
                          _builder.append(_name_10, "\t\t");
                          _builder.append("\", \"Enter new list of valid ");
                          DataEnum _type_10 = ((Primitive)att_5).getType();
                          String _string_1 = _type_10.toString();
                          _builder.append(_string_1, "\t\t");
                          _builder.append("\"));");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
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
        Object _xblockexpression_11 = null;
        {
          pos = (-1);
          _xblockexpression_11 = null;
        }
        _builder.append(_xblockexpression_11, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_6 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_12 = null;
            {
              pos++;
              _xblockexpression_12 = null;
            }
            _builder.append(_xblockexpression_12, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_6 instanceof Primitive)) {
                {
                  boolean _isRequired_3 = ((Primitive)att_6).isRequired();
                  if (_isRequired_3) {
                    _builder.append("\t");
                    _builder.append("\t");
                    final String newName_6 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    final String newPointName_3 = this.genUti.getNewAttNameByPoint(Integer.valueOf(pos), artifact);
                    _builder.newLineIfNotEmpty();
                    {
                      boolean _and_8 = false;
                      DataEnum _type_11 = ((Primitive)att_6).getType();
                      boolean _equals_9 = _type_11.equals(DataEnum.BOOLEAN);
                      if (!_equals_9) {
                        _and_8 = false;
                      } else {
                        boolean _isMany_11 = ((Primitive)att_6).isMany();
                        boolean _not_8 = (!_isMany_11);
                        _and_8 = _not_8;
                      }
                      if (_and_8) {
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("radios.add(new HtmlRadio(Basic");
                        _builder.append(name, "\t\t");
                        _builder.append("Param.");
                        String _firstUpper_6 = StringExtensions.toFirstUpper(newName_6);
                        _builder.append(_firstUpper_6, "\t\t");
                        _builder.append(", \"");
                        String _lowerCase_6 = newPointName_3.toLowerCase();
                        _builder.append(_lowerCase_6, "\t\t");
                        _builder.append("\", \"");
                        String _name_11 = ((Primitive)att_6).getName();
                        _builder.append(_name_11, "\t\t");
                        _builder.append("\", true));");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewObjects.put(HtmlFreeMarker.RADIOS, radios);");
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
