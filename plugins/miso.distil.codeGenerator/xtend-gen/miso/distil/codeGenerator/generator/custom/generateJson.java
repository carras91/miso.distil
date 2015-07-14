package miso.distil.codeGenerator.generator.custom;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.Attribute;
import codeGeneratorModel.DataEnum;
import codeGeneratorModel.MultiAttribute;
import codeGeneratorModel.ServiceEnum;
import codeGeneratorModel.SimpleAttribute;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.generator.generateUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * To write XXXJson.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateJson {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private Names names;
  
  /**
   * To write <artifact.name>Json.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write(final Artifact artifact) {
    StringConcatenation _builder = new StringConcatenation();
    EList<ServiceEnum> basicServices = artifact.getBasicServices();
    _builder.newLineIfNotEmpty();
    EList<Attribute> atts = artifact.getAttributes();
    _builder.newLineIfNotEmpty();
    EList<Attribute> _attributes = artifact.getAttributes();
    final EList<Attribute> allAtts = this.genUti.getAllNestedAttributes(_attributes);
    _builder.newLineIfNotEmpty();
    String _name = artifact.getName();
    final String namelow = _name.toLowerCase();
    _builder.newLineIfNotEmpty();
    final String name = artifact.getName();
    _builder.newLineIfNotEmpty();
    int pos = (-1);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    CharSequence _artifactChar = this.names.getArtifactChar(artifact);
    _builder.append(_artifactChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _contains = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains) {
        _builder.append("import java.io.IOException;");
        _builder.newLine();
        _builder.append("import java.util.List;");
        _builder.newLine();
      }
    }
    {
      boolean _or = false;
      boolean _contains_1 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_1) {
        _or = true;
      } else {
        boolean _contains_2 = basicServices.contains(ServiceEnum.UPDATE);
        _or = _contains_2;
      }
      if (_or) {
        _builder.append("import java.io.InputStream;");
        _builder.newLine();
      }
    }
    {
      boolean _contains_3 = basicServices.contains(ServiceEnum.UPDATE);
      if (_contains_3) {
        _builder.append("import java.util.Map;");
        _builder.newLine();
      }
    }
    {
      boolean _or_1 = false;
      boolean _contains_4 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_4) {
        _or_1 = true;
      } else {
        boolean _contains_5 = basicServices.contains(ServiceEnum.UPDATE);
        _or_1 = _contains_5;
      }
      if (_or_1) {
        _builder.newLine();
        _builder.append("import spark.Request;");
        _builder.newLine();
        _builder.append("import spark.Response;");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      boolean _contains_6 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_6) {
        _builder.append("import javax.servlet.MultipartConfigElement;");
        _builder.newLine();
        _builder.append("import javax.servlet.ServletException;");
        _builder.newLine();
        _builder.append("import javax.servlet.http.Part;");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _or_2 = false;
      boolean _contains_7 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_7) {
        _or_2 = true;
      } else {
        boolean _contains_8 = basicServices.contains(ServiceEnum.UPDATE);
        _or_2 = _contains_8;
      }
      if (_or_2) {
        _builder.append("import ");
        _builder.append(this.names.MisoAbstract, "");
        _builder.append(".RecordDB;");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        _builder.append(this.names.MisoUtils, "");
        _builder.append(".Utils;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import ");
    _builder.append(this.names.MisoBasic, "");
    _builder.append(".BasicAbstractJson;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    CharSequence _artifactFileChar = this.names.getArtifactFileChar(artifact);
    _builder.append(_artifactFileChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      boolean _or_3 = false;
      boolean _contains_9 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_9) {
        _or_3 = true;
      } else {
        boolean _contains_10 = basicServices.contains(ServiceEnum.UPDATE);
        _or_3 = _contains_10;
      }
      if (_or_3) {
        _builder.append("import ");
        CharSequence _bCodesFileChar = this.names.getBCodesFileChar(artifact);
        _builder.append(_bCodesFileChar, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        CharSequence _bParamFileChar = this.names.getBParamFileChar(artifact);
        _builder.append(_bParamFileChar, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        CharSequence _importCompose = this.genUti.getImportCompose(allAtts);
        _builder.append(_importCompose, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated custom json methods");
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
    _builder.append("public class ");
    _builder.append(name, "");
    _builder.append("Json extends BasicAbstractJson {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated empty constructor");
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
    _builder.append("public ");
    _builder.append(name, "\t");
    _builder.append("Json() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(");
    _builder.append(name, "\t\t");
    _builder.append(".class);\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      boolean _contains_11 = basicServices.contains(ServiceEnum.UPDATE);
      if (_contains_11) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to cusomice the update method");
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
        _builder.append("public Object postUpdate(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Basic Params");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Map<String, String> map = parseRequest(req, Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.values());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("String id = map.get(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.IdPost);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("String tags = map.get(Basic");
        _builder.append(name, "\t\t");
        _builder.append("Param.Tags);");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Required params");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Object _xblockexpression = null;
        {
          pos = (-1);
          _xblockexpression = null;
        }
        _builder.append(_xblockexpression, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_1 = null;
            {
              pos++;
              _xblockexpression_1 = null;
            }
            _builder.append(_xblockexpression_1, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att instanceof SimpleAttribute)) {
                {
                  boolean _isRequired = ((SimpleAttribute)att).isRequired();
                  if (_isRequired) {
                    _builder.append("\t");
                    _builder.append("\t");
                    CharSequence _typeName = this.genUti.getTypeName(att);
                    _builder.append(_typeName, "\t\t");
                    _builder.append(" ");
                    String _newAttName = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                    _builder.append(_newAttName, "\t\t");
                    _builder.append(" = null;");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("try {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        Object _xblockexpression_2 = null;
        {
          pos = (-1);
          _xblockexpression_2 = null;
        }
        _builder.append(_xblockexpression_2, "\t\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_1 : allAtts) {
            _builder.append("\t");
            _builder.append("\t\t");
            Object _xblockexpression_3 = null;
            {
              pos++;
              _xblockexpression_3 = null;
            }
            _builder.append(_xblockexpression_3, "\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            final String newName = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
            _builder.newLineIfNotEmpty();
            {
              if ((att_1 instanceof SimpleAttribute)) {
                {
                  boolean _isRequired_1 = ((SimpleAttribute)att_1).isRequired();
                  if (_isRequired_1) {
                    {
                      boolean _and = false;
                      DataEnum _data = ((SimpleAttribute)att_1).getData();
                      boolean _equals = _data.equals(DataEnum.STRING);
                      if (!_equals) {
                        _and = false;
                      } else {
                        boolean _isMany = ((SimpleAttribute)att_1).isMany();
                        boolean _not = (!_isMany);
                        _and = _not;
                      }
                      if (_and) {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append(newName, "\t\t\t");
                        _builder.append(" = map.get(Basic");
                        _builder.append(name, "\t\t\t");
                        _builder.append("Param.");
                        String _firstUpper = StringExtensions.toFirstUpper(newName);
                        _builder.append(_firstUpper, "\t\t\t");
                        _builder.append(");");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _and_1 = false;
                        DataEnum _data_1 = ((SimpleAttribute)att_1).getData();
                        boolean _equals_1 = _data_1.equals(DataEnum.INTEGER);
                        if (!_equals_1) {
                          _and_1 = false;
                        } else {
                          boolean _isMany_1 = ((SimpleAttribute)att_1).isMany();
                          boolean _not_1 = (!_isMany_1);
                          _and_1 = _not_1;
                        }
                        if (_and_1) {
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append(newName, "\t\t\t");
                          _builder.append(" = Integer.parseInt(map.get(Basic");
                          _builder.append(name, "\t\t\t");
                          _builder.append("Param.");
                          String _firstUpper_1 = StringExtensions.toFirstUpper(newName);
                          _builder.append(_firstUpper_1, "\t\t\t");
                          _builder.append("));");
                          _builder.newLineIfNotEmpty();
                        } else {
                          boolean _and_2 = false;
                          DataEnum _data_2 = ((SimpleAttribute)att_1).getData();
                          boolean _equals_2 = _data_2.equals(DataEnum.DOUBLE);
                          if (!_equals_2) {
                            _and_2 = false;
                          } else {
                            boolean _isMany_2 = ((SimpleAttribute)att_1).isMany();
                            boolean _not_2 = (!_isMany_2);
                            _and_2 = _not_2;
                          }
                          if (_and_2) {
                            _builder.append("\t");
                            _builder.append("\t\t");
                            _builder.append(newName, "\t\t\t");
                            _builder.append(" = Double.parseDouble(map.get(Basic");
                            _builder.append(name, "\t\t\t");
                            _builder.append("Param.");
                            String _firstUpper_2 = StringExtensions.toFirstUpper(newName);
                            _builder.append(_firstUpper_2, "\t\t\t");
                            _builder.append("));");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _and_3 = false;
                            DataEnum _data_3 = ((SimpleAttribute)att_1).getData();
                            boolean _equals_3 = _data_3.equals(DataEnum.BOOLEAN);
                            if (!_equals_3) {
                              _and_3 = false;
                            } else {
                              boolean _isMany_3 = ((SimpleAttribute)att_1).isMany();
                              boolean _not_3 = (!_isMany_3);
                              _and_3 = _not_3;
                            }
                            if (_and_3) {
                              _builder.append("\t");
                              _builder.append("\t\t");
                              _builder.append(newName, "\t\t\t");
                              _builder.append(" = map.get(Basic");
                              _builder.append(name, "\t\t\t");
                              _builder.append("Param.");
                              String _firstUpper_3 = StringExtensions.toFirstUpper(newName);
                              _builder.append(_firstUpper_3, "\t\t\t");
                              _builder.append(").equalsIgnoreCase(\"true\");");
                              _builder.newLineIfNotEmpty();
                            } else {
                              DataEnum _data_4 = ((SimpleAttribute)att_1).getData();
                              boolean _equals_4 = _data_4.equals(DataEnum.STRING);
                              if (_equals_4) {
                                _builder.append("\t");
                                _builder.append("\t\t");
                                _builder.append(newName, "\t\t\t");
                                _builder.append(" = Utils.StringToListString(map.get(Basic");
                                _builder.append(name, "\t\t\t");
                                _builder.append("Param.");
                                String _firstUpper_4 = StringExtensions.toFirstUpper(newName);
                                _builder.append(_firstUpper_4, "\t\t\t");
                                _builder.append("));");
                                _builder.newLineIfNotEmpty();
                              } else {
                                DataEnum _data_5 = ((SimpleAttribute)att_1).getData();
                                boolean _equals_5 = _data_5.equals(DataEnum.INTEGER);
                                if (_equals_5) {
                                  _builder.append("\t");
                                  _builder.append("\t\t");
                                  _builder.append(newName, "\t\t\t");
                                  _builder.append(" = Utils.StringToListInteger(map.get(Basic");
                                  _builder.append(name, "\t\t\t");
                                  _builder.append("Param.");
                                  String _firstUpper_5 = StringExtensions.toFirstUpper(newName);
                                  _builder.append(_firstUpper_5, "\t\t\t");
                                  _builder.append("));");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  DataEnum _data_6 = ((SimpleAttribute)att_1).getData();
                                  boolean _equals_6 = _data_6.equals(DataEnum.DOUBLE);
                                  if (_equals_6) {
                                    _builder.append("\t");
                                    _builder.append("\t\t");
                                    _builder.append(newName, "\t\t\t");
                                    _builder.append(" = Utils.StringToListDouble(map.get(Basic");
                                    _builder.append(name, "\t\t\t");
                                    _builder.append("Param.");
                                    String _firstUpper_6 = StringExtensions.toFirstUpper(newName);
                                    _builder.append(_firstUpper_6, "\t\t\t");
                                    _builder.append("));");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    DataEnum _data_7 = ((SimpleAttribute)att_1).getData();
                                    boolean _equals_7 = _data_7.equals(DataEnum.BOOLEAN);
                                    if (_equals_7) {
                                      _builder.append("\t");
                                      _builder.append("\t\t");
                                      _builder.append(newName, "\t\t\t");
                                      _builder.append(" = Utils.StringToListBoolean(map.get(Basic");
                                      _builder.append(name, "\t\t\t");
                                      _builder.append("Param.");
                                      String _firstUpper_7 = StringExtensions.toFirstUpper(newName);
                                      _builder.append(_firstUpper_7, "\t\t\t");
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
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} catch(Exception e) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("e.printStackTrace();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Codes.Param_error;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Read old ");
        _builder.append(name, "\t\t");
        _builder.append(" and his InputStream");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(name, "\t\t");
        _builder.append(" old");
        _builder.append(name, "\t\t");
        _builder.append(" = (");
        _builder.append(name, "\t\t");
        _builder.append(") RecordDB.getDefault().readOne(id, classType);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("InputStream IS = RecordDB.getDefault().getInputStream(id, classType);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if(old");
        _builder.append(name, "\t\t");
        _builder.append(" == null || IS == null) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Codes.DB_notfound;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Not required params");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// TODO : complete these params!");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Object _xblockexpression_4 = null;
        {
          pos = (-1);
          _xblockexpression_4 = null;
        }
        _builder.append(_xblockexpression_4, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_2 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_5 = null;
            {
              pos++;
              _xblockexpression_5 = null;
            }
            _builder.append(_xblockexpression_5, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_2 instanceof SimpleAttribute)) {
                {
                  boolean _isRequired_2 = ((SimpleAttribute)att_2).isRequired();
                  boolean _not_4 = (!_isRequired_2);
                  if (_not_4) {
                    _builder.append("\t");
                    _builder.append("\t");
                    CharSequence _typeName_1 = this.genUti.getTypeName(att_2);
                    _builder.append(_typeName_1, "\t\t");
                    _builder.append(" ");
                    String _newAttName_1 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                    _builder.append(_newAttName_1, "\t\t");
                    _builder.append(" = null;");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("//Composed params");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Object _xblockexpression_6 = null;
        {
          pos = (-1);
          _xblockexpression_6 = null;
        }
        _builder.append(_xblockexpression_6, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_3 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_7 = null;
            {
              pos++;
              _xblockexpression_7 = null;
            }
            _builder.append(_xblockexpression_7, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_3 instanceof MultiAttribute)) {
                _builder.append("\t");
                _builder.append("\t");
                final String newName_1 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                final CharSequence typeName = this.genUti.getTypeName(att_3);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append(typeName, "\t\t");
                _builder.append(" ");
                _builder.append(newName_1, "\t\t");
                _builder.append(" = new ");
                _builder.append(typeName, "\t\t");
                _builder.append("(");
                String _nestedAtt = this.genUti.getNestedAtt(Integer.valueOf(pos), artifact);
                _builder.append(_nestedAtt, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Create new ");
        _builder.append(name, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(name, "\t\t");
        _builder.append(" new");
        _builder.append(name, "\t\t");
        _builder.append(" = new ");
        _builder.append(name, "\t\t");
        _builder.append("(old");
        _builder.append(name, "\t\t");
        _builder.append(".getObjectName(), old");
        _builder.append(name, "\t\t");
        _builder.append(".getFileSize(), Utils.tagsStringToList(tags)");
        {
          for(final Attribute att_4 : atts) {
            _builder.append(", ");
            String _newAttName_2 = this.genUti.getNewAttName(att_4, artifact);
            _builder.append(_newAttName_2, "\t\t");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Save new ");
        _builder.append(name, "\t\t");
        _builder.append(" and delete old ");
        _builder.append(name, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if(RecordDB.getDefault().save(new");
        _builder.append(name, "\t\t");
        _builder.append(", IS)) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("if(!RecordDB.getDefault().delete(id, classType)) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t\t");
        _builder.append("Codes.DB_notfound;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("return new");
        _builder.append(name, "\t\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Codes.DB_notupdated;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    {
      boolean _contains_12 = basicServices.contains(ServiceEnum.UPLOAD);
      if (_contains_12) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* Auto-generated method to cusomice the upload method");
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
        _builder.append("public Object postUpload(Request req, Response res) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// There is a file");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("MultipartConfigElement multipartConfigElement = new MultipartConfigElement(\"/tmp\");");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("req.raw().setAttribute(\"org.eclipse.multipartConfig\", multipartConfigElement);");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("try {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// File Information");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("Part filePart = req.raw().getPart(Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Param.File);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t    ");
        _builder.append("String fileName = getFileName(filePart);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("long fileSize = filePart.getSize();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t    ");
        _builder.append("InputStream fileContent = filePart.getInputStream();");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("List<String> tags = Utils.tagsStringToList(req.raw().getParameter(Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Param.Tags));");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// Required params");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        Object _xblockexpression_8 = null;
        {
          pos = (-1);
          _xblockexpression_8 = null;
        }
        _builder.append(_xblockexpression_8, "\t\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_5 : allAtts) {
            _builder.append("\t");
            _builder.append("\t\t");
            Object _xblockexpression_9 = null;
            {
              pos++;
              _xblockexpression_9 = null;
            }
            _builder.append(_xblockexpression_9, "\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            final String newName_2 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            final CharSequence type = this.genUti.getTypeName(att_5);
            _builder.newLineIfNotEmpty();
            {
              if ((att_5 instanceof SimpleAttribute)) {
                {
                  boolean _isRequired_3 = ((SimpleAttribute)att_5).isRequired();
                  if (_isRequired_3) {
                    {
                      boolean _and_4 = false;
                      DataEnum _data_8 = ((SimpleAttribute)att_5).getData();
                      boolean _equals_8 = _data_8.equals(DataEnum.BOOLEAN);
                      if (!_equals_8) {
                        _and_4 = false;
                      } else {
                        boolean _isMany_4 = ((SimpleAttribute)att_5).isMany();
                        boolean _not_5 = (!_isMany_4);
                        _and_4 = _not_5;
                      }
                      if (_and_4) {
                        _builder.append("\t");
                        _builder.append("\t\t");
                        _builder.append(type, "\t\t\t");
                        _builder.append(" ");
                        _builder.append(newName_2, "\t\t\t");
                        _builder.append(" = req.raw().getParameter(Basic");
                        _builder.append(name, "\t\t\t");
                        _builder.append("Param.");
                        String _firstUpper_8 = StringExtensions.toFirstUpper(newName_2);
                        _builder.append(_firstUpper_8, "\t\t\t");
                        _builder.append(").equalsIgnoreCase(\"true\");");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _and_5 = false;
                        DataEnum _data_9 = ((SimpleAttribute)att_5).getData();
                        boolean _equals_9 = _data_9.equals(DataEnum.INTEGER);
                        if (!_equals_9) {
                          _and_5 = false;
                        } else {
                          boolean _isMany_5 = ((SimpleAttribute)att_5).isMany();
                          boolean _not_6 = (!_isMany_5);
                          _and_5 = _not_6;
                        }
                        if (_and_5) {
                          _builder.append("\t");
                          _builder.append("\t\t");
                          _builder.append(type, "\t\t\t");
                          _builder.append(" ");
                          _builder.append(newName_2, "\t\t\t");
                          _builder.append(" = Integer.parseInt(req.raw().getParameter(Basic");
                          _builder.append(name, "\t\t\t");
                          _builder.append("Param.");
                          String _firstUpper_9 = StringExtensions.toFirstUpper(newName_2);
                          _builder.append(_firstUpper_9, "\t\t\t");
                          _builder.append("));");
                          _builder.newLineIfNotEmpty();
                        } else {
                          boolean _and_6 = false;
                          DataEnum _data_10 = ((SimpleAttribute)att_5).getData();
                          boolean _equals_10 = _data_10.equals(DataEnum.DOUBLE);
                          if (!_equals_10) {
                            _and_6 = false;
                          } else {
                            boolean _isMany_6 = ((SimpleAttribute)att_5).isMany();
                            boolean _not_7 = (!_isMany_6);
                            _and_6 = _not_7;
                          }
                          if (_and_6) {
                            _builder.append("\t");
                            _builder.append("\t\t");
                            _builder.append(type, "\t\t\t");
                            _builder.append(" ");
                            _builder.append(newName_2, "\t\t\t");
                            _builder.append(" = Double.parseDouble(req.raw().getParameter(Basic");
                            _builder.append(name, "\t\t\t");
                            _builder.append("Param.");
                            String _firstUpper_10 = StringExtensions.toFirstUpper(newName_2);
                            _builder.append(_firstUpper_10, "\t\t\t");
                            _builder.append("));");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _and_7 = false;
                            DataEnum _data_11 = ((SimpleAttribute)att_5).getData();
                            boolean _equals_11 = _data_11.equals(DataEnum.STRING);
                            if (!_equals_11) {
                              _and_7 = false;
                            } else {
                              boolean _isMany_7 = ((SimpleAttribute)att_5).isMany();
                              boolean _not_8 = (!_isMany_7);
                              _and_7 = _not_8;
                            }
                            if (_and_7) {
                              _builder.append("\t");
                              _builder.append("\t\t");
                              _builder.append(type, "\t\t\t");
                              _builder.append(" ");
                              _builder.append(newName_2, "\t\t\t");
                              _builder.append(" = req.raw().getParameter(Basic");
                              _builder.append(name, "\t\t\t");
                              _builder.append("Param.");
                              String _firstUpper_11 = StringExtensions.toFirstUpper(newName_2);
                              _builder.append(_firstUpper_11, "\t\t\t");
                              _builder.append(");");
                              _builder.newLineIfNotEmpty();
                            } else {
                              DataEnum _data_12 = ((SimpleAttribute)att_5).getData();
                              boolean _equals_12 = _data_12.equals(DataEnum.INTEGER);
                              if (_equals_12) {
                                _builder.append("\t");
                                _builder.append("\t\t");
                                _builder.append(type, "\t\t\t");
                                _builder.append(" ");
                                _builder.append(newName_2, "\t\t\t");
                                _builder.append(" = Utils.StringToListInteger(req.raw().getParameter(Basic");
                                _builder.append(name, "\t\t\t");
                                _builder.append("Param.");
                                String _firstUpper_12 = StringExtensions.toFirstUpper(newName_2);
                                _builder.append(_firstUpper_12, "\t\t\t");
                                _builder.append("));");
                                _builder.newLineIfNotEmpty();
                              } else {
                                DataEnum _data_13 = ((SimpleAttribute)att_5).getData();
                                boolean _equals_13 = _data_13.equals(DataEnum.DOUBLE);
                                if (_equals_13) {
                                  _builder.append("\t");
                                  _builder.append("\t\t");
                                  _builder.append(type, "\t\t\t");
                                  _builder.append(" ");
                                  _builder.append(newName_2, "\t\t\t");
                                  _builder.append(" = Utils.StringToListDouble(req.raw().getParameter(Basic");
                                  _builder.append(name, "\t\t\t");
                                  _builder.append("Param.");
                                  String _firstUpper_13 = StringExtensions.toFirstUpper(newName_2);
                                  _builder.append(_firstUpper_13, "\t\t\t");
                                  _builder.append("));");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  DataEnum _data_14 = ((SimpleAttribute)att_5).getData();
                                  boolean _equals_14 = _data_14.equals(DataEnum.STRING);
                                  if (_equals_14) {
                                    _builder.append("\t");
                                    _builder.append("\t\t");
                                    _builder.append(type, "\t\t\t");
                                    _builder.append(" ");
                                    _builder.append(newName_2, "\t\t\t");
                                    _builder.append(" = Utils.StringToListString(req.raw().getParameter(Basic");
                                    _builder.append(name, "\t\t\t");
                                    _builder.append("Param.");
                                    String _firstUpper_14 = StringExtensions.toFirstUpper(newName_2);
                                    _builder.append(_firstUpper_14, "\t\t\t");
                                    _builder.append("));");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    DataEnum _data_15 = ((SimpleAttribute)att_5).getData();
                                    boolean _equals_15 = _data_15.equals(DataEnum.BOOLEAN);
                                    if (_equals_15) {
                                      _builder.append("\t");
                                      _builder.append("\t\t");
                                      _builder.append(type, "\t\t\t");
                                      _builder.append(" ");
                                      _builder.append(newName_2, "\t\t\t");
                                      _builder.append(" = Utils.StringToListBoolean(req.raw().getParameter(Basic");
                                      _builder.append(name, "\t\t\t");
                                      _builder.append("Param.");
                                      String _firstUpper_15 = StringExtensions.toFirstUpper(newName_2);
                                      _builder.append(_firstUpper_15, "\t\t\t");
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
                    }
                  }
                }
              }
            }
          }
        }
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("if(fileContent == null || fileName == null) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t\t");
        _builder.append("Codes.Param_emptyfile;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("if(fileName.isEmpty() ");
        {
          String _extension = artifact.getExtension();
          boolean _notEquals = (!Objects.equal(_extension, null));
          if (_notEquals) {
            _builder.append("|| !fileName.endsWith(\".");
            String _extension_1 = artifact.getExtension();
            _builder.append(_extension_1, "\t\t\t");
            _builder.append("\")");
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t\t");
        _builder.append("Codes.Param_emptyfile;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// Not required params");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// TODO : complete these params!");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        Object _xblockexpression_10 = null;
        {
          pos = (-1);
          _xblockexpression_10 = null;
        }
        _builder.append(_xblockexpression_10, "\t\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_6 : allAtts) {
            _builder.append("\t");
            _builder.append("\t\t");
            Object _xblockexpression_11 = null;
            {
              pos++;
              _xblockexpression_11 = null;
            }
            _builder.append(_xblockexpression_11, "\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_6 instanceof SimpleAttribute)) {
                {
                  boolean _isRequired_4 = ((SimpleAttribute)att_6).isRequired();
                  boolean _not_9 = (!_isRequired_4);
                  if (_not_9) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    CharSequence _typeName_2 = this.genUti.getTypeName(att_6);
                    _builder.append(_typeName_2, "\t\t\t");
                    _builder.append(" ");
                    String _newAttName_3 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                    _builder.append(_newAttName_3, "\t\t\t");
                    _builder.append(" = null;");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("//Composed params");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        Object _xblockexpression_12 = null;
        {
          pos = (-1);
          _xblockexpression_12 = null;
        }
        _builder.append(_xblockexpression_12, "\t\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_7 : allAtts) {
            _builder.append("\t");
            _builder.append("\t\t");
            Object _xblockexpression_13 = null;
            {
              pos++;
              _xblockexpression_13 = null;
            }
            _builder.append(_xblockexpression_13, "\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_7 instanceof MultiAttribute)) {
                _builder.append("\t");
                _builder.append("\t\t");
                final String newName_3 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                final CharSequence typeName_1 = this.genUti.getTypeName(att_7);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                _builder.append(typeName_1, "\t\t\t");
                _builder.append(" ");
                _builder.append(newName_3, "\t\t\t");
                _builder.append(" = new ");
                _builder.append(typeName_1, "\t\t\t");
                _builder.append("(");
                String _nestedAtt_1 = this.genUti.getNestedAtt(Integer.valueOf(pos), artifact);
                _builder.append(_nestedAtt_1, "\t\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// Create new ");
        _builder.append(name, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append(name, "\t\t\t");
        _builder.append(" ");
        _builder.append(namelow, "\t\t\t");
        _builder.append(" = new ");
        _builder.append(name, "\t\t\t");
        _builder.append("(fileName, fileSize, tags");
        {
          for(final Attribute att_8 : atts) {
            _builder.append(", ");
            String _newAttName_4 = this.genUti.getNewAttName(att_8, artifact);
            _builder.append(_newAttName_4, "\t\t\t");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("if(!RecordDB.getDefault().save(");
        _builder.append(namelow, "\t\t\t");
        _builder.append(", fileContent)) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t\t");
        _builder.append("Codes.DB_notuploaded;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return ");
        _builder.append(namelow, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} catch (IOException e) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("e.printStackTrace();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Codes.Param_corruptfile;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} catch (ServletException e) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("e.printStackTrace();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Codes.Param_corruptfile;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("} catch (Exception e) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("e.printStackTrace();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("return Basic");
        _builder.append(name, "\t\t\t");
        _builder.append("Codes.Param_error;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
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
