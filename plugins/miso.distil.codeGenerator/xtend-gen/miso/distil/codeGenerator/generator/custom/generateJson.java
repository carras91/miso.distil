package miso.distil.codeGenerator.generator.custom;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ArtifactID;
import codeGeneratorModel.Attribute;
import codeGeneratorModel.DataEnum;
import codeGeneratorModel.Primitive;
import codeGeneratorModel.Reference;
import codeGeneratorModel.ServiceEnum;
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
    EList<ServiceEnum> _basicServices = artifact.getBasicServices();
    EList<ServiceEnum> basicServices = this.genUti.processBasicServices(_basicServices);
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
        boolean list = false;
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att : allAtts) {
            Object _xblockexpression = null;
            {
              pos = 0;
              _xblockexpression = null;
            }
            _builder.append(_xblockexpression, "");
            _builder.newLineIfNotEmpty();
            {
              if ((att instanceof Primitive)) {
                {
                  boolean _and = false;
                  boolean _and_1 = false;
                  boolean _isRequired = ((Primitive)att).isRequired();
                  boolean _not = (!_isRequired);
                  if (!_not) {
                    _and_1 = false;
                  } else {
                    boolean _isMany = ((Primitive)att).isMany();
                    _and_1 = _isMany;
                  }
                  if (!_and_1) {
                    _and = false;
                  } else {
                    _and = (!list);
                  }
                  if (_and) {
                    Object _xblockexpression_1 = null;
                    {
                      list = true;
                      _xblockexpression_1 = null;
                    }
                    _builder.append(_xblockexpression_1, "");
                    _builder.newLineIfNotEmpty();
                    _builder.append("import java.util.List;");
                    _builder.newLine();
                  }
                }
              }
            }
            {
              boolean _and_2 = false;
              boolean _and_3 = false;
              if (!(att instanceof ArtifactID)) {
                _and_3 = false;
              } else {
                boolean _isMany_1 = att.isMany();
                _and_3 = _isMany_1;
              }
              if (!_and_3) {
                _and_2 = false;
              } else {
                _and_2 = (!list);
              }
              if (_and_2) {
                Object _xblockexpression_2 = null;
                {
                  list = true;
                  _xblockexpression_2 = null;
                }
                _builder.append(_xblockexpression_2, "");
                _builder.newLineIfNotEmpty();
                _builder.append("import java.util.List;");
                _builder.newLine();
              }
            }
          }
        }
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
        boolean util = false;
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_1 : allAtts) {
            {
              if ((att_1 instanceof Primitive)) {
                {
                  boolean _and_4 = false;
                  boolean _and_5 = false;
                  boolean _isRequired_1 = ((Primitive)att_1).isRequired();
                  if (!_isRequired_1) {
                    _and_5 = false;
                  } else {
                    boolean _isMany_2 = ((Primitive)att_1).isMany();
                    _and_5 = _isMany_2;
                  }
                  if (!_and_5) {
                    _and_4 = false;
                  } else {
                    _and_4 = (!util);
                  }
                  if (_and_4) {
                    Object _xblockexpression_3 = null;
                    {
                      util = true;
                      _xblockexpression_3 = null;
                    }
                    _builder.append(_xblockexpression_3, "");
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
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// Required params");
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
              if ((att_2 instanceof Primitive)) {
                {
                  boolean _isRequired_2 = ((Primitive)att_2).isRequired();
                  if (_isRequired_2) {
                    _builder.append("\t");
                    _builder.append("\t");
                    CharSequence _typeName = this.genUti.getTypeName(att_2);
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
        Object _xblockexpression_6 = null;
        {
          pos = (-1);
          _xblockexpression_6 = null;
        }
        _builder.append(_xblockexpression_6, "\t\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_3 : allAtts) {
            _builder.append("\t");
            _builder.append("\t\t");
            Object _xblockexpression_7 = null;
            {
              pos++;
              _xblockexpression_7 = null;
            }
            _builder.append(_xblockexpression_7, "\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            final String newName = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
            _builder.newLineIfNotEmpty();
            {
              if ((att_3 instanceof Primitive)) {
                {
                  boolean _isRequired_3 = ((Primitive)att_3).isRequired();
                  if (_isRequired_3) {
                    {
                      boolean _and_6 = false;
                      DataEnum _type = ((Primitive)att_3).getType();
                      boolean _equals = _type.equals(DataEnum.STRING);
                      if (!_equals) {
                        _and_6 = false;
                      } else {
                        boolean _isMany_3 = ((Primitive)att_3).isMany();
                        boolean _not_1 = (!_isMany_3);
                        _and_6 = _not_1;
                      }
                      if (_and_6) {
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
                        boolean _and_7 = false;
                        DataEnum _type_1 = ((Primitive)att_3).getType();
                        boolean _equals_1 = _type_1.equals(DataEnum.INTEGER);
                        if (!_equals_1) {
                          _and_7 = false;
                        } else {
                          boolean _isMany_4 = ((Primitive)att_3).isMany();
                          boolean _not_2 = (!_isMany_4);
                          _and_7 = _not_2;
                        }
                        if (_and_7) {
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
                          boolean _and_8 = false;
                          DataEnum _type_2 = ((Primitive)att_3).getType();
                          boolean _equals_2 = _type_2.equals(DataEnum.DOUBLE);
                          if (!_equals_2) {
                            _and_8 = false;
                          } else {
                            boolean _isMany_5 = ((Primitive)att_3).isMany();
                            boolean _not_3 = (!_isMany_5);
                            _and_8 = _not_3;
                          }
                          if (_and_8) {
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
                            boolean _and_9 = false;
                            DataEnum _type_3 = ((Primitive)att_3).getType();
                            boolean _equals_3 = _type_3.equals(DataEnum.BOOLEAN);
                            if (!_equals_3) {
                              _and_9 = false;
                            } else {
                              boolean _isMany_6 = ((Primitive)att_3).isMany();
                              boolean _not_4 = (!_isMany_6);
                              _and_9 = _not_4;
                            }
                            if (_and_9) {
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
                              DataEnum _type_4 = ((Primitive)att_3).getType();
                              boolean _equals_4 = _type_4.equals(DataEnum.STRING);
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
                                DataEnum _type_5 = ((Primitive)att_3).getType();
                                boolean _equals_5 = _type_5.equals(DataEnum.INTEGER);
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
                                  DataEnum _type_6 = ((Primitive)att_3).getType();
                                  boolean _equals_6 = _type_6.equals(DataEnum.DOUBLE);
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
                                    DataEnum _type_7 = ((Primitive)att_3).getType();
                                    boolean _equals_7 = _type_7.equals(DataEnum.BOOLEAN);
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
        _builder.append("// Not required params and artifact\'s id");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("// TODO : complete these params!");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Object _xblockexpression_8 = null;
        {
          pos = (-1);
          _xblockexpression_8 = null;
        }
        _builder.append(_xblockexpression_8, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_4 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_9 = null;
            {
              pos++;
              _xblockexpression_9 = null;
            }
            _builder.append(_xblockexpression_9, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_4 instanceof Primitive)) {
                {
                  boolean _isRequired_4 = ((Primitive)att_4).isRequired();
                  boolean _not_5 = (!_isRequired_4);
                  if (_not_5) {
                    _builder.append("\t");
                    _builder.append("\t");
                    CharSequence _typeName_1 = this.genUti.getTypeName(att_4);
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
            {
              if ((att_4 instanceof ArtifactID)) {
                _builder.append("\t");
                _builder.append("\t");
                CharSequence _typeName_2 = this.genUti.getTypeName(att_4);
                _builder.append(_typeName_2, "\t\t");
                _builder.append(" ");
                String _newAttName_2 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                _builder.append(_newAttName_2, "\t\t");
                _builder.append(" = null;");
                _builder.newLineIfNotEmpty();
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
        Object _xblockexpression_10 = null;
        {
          pos = (-1);
          _xblockexpression_10 = null;
        }
        _builder.append(_xblockexpression_10, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_5 : allAtts) {
            _builder.append("\t");
            _builder.append("\t");
            Object _xblockexpression_11 = null;
            {
              pos++;
              _xblockexpression_11 = null;
            }
            _builder.append(_xblockexpression_11, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_5 instanceof Reference)) {
                _builder.append("\t");
                _builder.append("\t");
                final String newName_1 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                final CharSequence typeName = this.genUti.getTypeName(att_5);
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
        _builder.append(".getObjectname(), old");
        _builder.append(name, "\t\t");
        _builder.append(".getFilesize()");
        {
          for(final Attribute att_6 : atts) {
            _builder.append(", ");
            String _newAttName_3 = this.genUti.getNewAttName(att_6, artifact);
            _builder.append(_newAttName_3, "\t\t");
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
        _builder.append("// Required params");
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
            _builder.append("\t");
            _builder.append("\t\t");
            final String newName_2 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            final CharSequence type = this.genUti.getTypeName(att_7);
            _builder.newLineIfNotEmpty();
            {
              if ((att_7 instanceof Primitive)) {
                {
                  boolean _isRequired_5 = ((Primitive)att_7).isRequired();
                  if (_isRequired_5) {
                    {
                      boolean _and_10 = false;
                      DataEnum _type_8 = ((Primitive)att_7).getType();
                      boolean _equals_8 = _type_8.equals(DataEnum.BOOLEAN);
                      if (!_equals_8) {
                        _and_10 = false;
                      } else {
                        boolean _isMany_7 = ((Primitive)att_7).isMany();
                        boolean _not_6 = (!_isMany_7);
                        _and_10 = _not_6;
                      }
                      if (_and_10) {
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
                        boolean _and_11 = false;
                        DataEnum _type_9 = ((Primitive)att_7).getType();
                        boolean _equals_9 = _type_9.equals(DataEnum.INTEGER);
                        if (!_equals_9) {
                          _and_11 = false;
                        } else {
                          boolean _isMany_8 = ((Primitive)att_7).isMany();
                          boolean _not_7 = (!_isMany_8);
                          _and_11 = _not_7;
                        }
                        if (_and_11) {
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
                          boolean _and_12 = false;
                          DataEnum _type_10 = ((Primitive)att_7).getType();
                          boolean _equals_10 = _type_10.equals(DataEnum.DOUBLE);
                          if (!_equals_10) {
                            _and_12 = false;
                          } else {
                            boolean _isMany_9 = ((Primitive)att_7).isMany();
                            boolean _not_8 = (!_isMany_9);
                            _and_12 = _not_8;
                          }
                          if (_and_12) {
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
                            boolean _and_13 = false;
                            DataEnum _type_11 = ((Primitive)att_7).getType();
                            boolean _equals_11 = _type_11.equals(DataEnum.STRING);
                            if (!_equals_11) {
                              _and_13 = false;
                            } else {
                              boolean _isMany_10 = ((Primitive)att_7).isMany();
                              boolean _not_9 = (!_isMany_10);
                              _and_13 = _not_9;
                            }
                            if (_and_13) {
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
                              DataEnum _type_12 = ((Primitive)att_7).getType();
                              boolean _equals_12 = _type_12.equals(DataEnum.INTEGER);
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
                                DataEnum _type_13 = ((Primitive)att_7).getType();
                                boolean _equals_13 = _type_13.equals(DataEnum.DOUBLE);
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
                                  DataEnum _type_14 = ((Primitive)att_7).getType();
                                  boolean _equals_14 = _type_14.equals(DataEnum.STRING);
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
                                    DataEnum _type_15 = ((Primitive)att_7).getType();
                                    boolean _equals_15 = _type_15.equals(DataEnum.BOOLEAN);
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
        _builder.append("// Not required params and artifact\'s id");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("// TODO : complete these params!");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        Object _xblockexpression_14 = null;
        {
          pos = (-1);
          _xblockexpression_14 = null;
        }
        _builder.append(_xblockexpression_14, "\t\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_8 : allAtts) {
            _builder.append("\t");
            _builder.append("\t\t");
            Object _xblockexpression_15 = null;
            {
              pos++;
              _xblockexpression_15 = null;
            }
            _builder.append(_xblockexpression_15, "\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_8 instanceof Primitive)) {
                {
                  boolean _isRequired_6 = ((Primitive)att_8).isRequired();
                  boolean _not_10 = (!_isRequired_6);
                  if (_not_10) {
                    _builder.append("\t");
                    _builder.append("\t\t");
                    CharSequence _typeName_3 = this.genUti.getTypeName(att_8);
                    _builder.append(_typeName_3, "\t\t\t");
                    _builder.append(" ");
                    String _newAttName_4 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                    _builder.append(_newAttName_4, "\t\t\t");
                    _builder.append(" = null;");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            {
              if ((att_8 instanceof ArtifactID)) {
                _builder.append("\t");
                _builder.append("\t\t");
                CharSequence _typeName_4 = this.genUti.getTypeName(att_8);
                _builder.append(_typeName_4, "\t\t\t");
                _builder.append(" ");
                String _newAttName_5 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                _builder.append(_newAttName_5, "\t\t\t");
                _builder.append(" = null;");
                _builder.newLineIfNotEmpty();
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
        Object _xblockexpression_16 = null;
        {
          pos = (-1);
          _xblockexpression_16 = null;
        }
        _builder.append(_xblockexpression_16, "\t\t\t");
        _builder.newLineIfNotEmpty();
        {
          for(final Attribute att_9 : allAtts) {
            _builder.append("\t");
            _builder.append("\t\t");
            Object _xblockexpression_17 = null;
            {
              pos++;
              _xblockexpression_17 = null;
            }
            _builder.append(_xblockexpression_17, "\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              if ((att_9 instanceof Reference)) {
                _builder.append("\t");
                _builder.append("\t\t");
                final String newName_3 = this.genUti.getNewAttName(Integer.valueOf(pos), artifact);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t\t");
                final CharSequence typeName_1 = this.genUti.getTypeName(att_9);
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
        _builder.append("(fileName, fileSize");
        {
          for(final Attribute att_10 : atts) {
            _builder.append(", ");
            String _newAttName_6 = this.genUti.getNewAttName(att_10, artifact);
            _builder.append(_newAttName_6, "\t\t\t");
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
