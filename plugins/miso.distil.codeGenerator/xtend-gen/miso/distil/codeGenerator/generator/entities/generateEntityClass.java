package miso.distil.codeGenerator.generator.entities;

import codeGeneratorModel.Attribute;
import codeGeneratorModel.DataEnum;
import codeGeneratorModel.Entity;
import codeGeneratorModel.Primitive;
import codeGeneratorModel.Reference;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.generator.generateUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * To write <entity>.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateEntityClass {
  @Inject
  private generateUtils genUti;
  
  @Inject
  private Names names;
  
  /**
   * To write <entity.name>.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.names.EntitiesCha, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    EList<Attribute> _attributes = entity.getAttributes();
    CharSequence _importList = this.genUti.getImportList(_attributes);
    _builder.append(_importList, "");
    _builder.newLineIfNotEmpty();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated entity class");
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
    String _name = entity.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Attributes");
    _builder.newLine();
    _builder.append("\t");
    EList<Attribute> _attributes_1 = entity.getAttributes();
    CharSequence _privateAttributes = this.genUti.getPrivateAttributes(_attributes_1);
    _builder.append(_privateAttributes, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Attribute> _attributes_2 = entity.getAttributes();
      boolean _isEmpty = _attributes_2.isEmpty();
      if (_isEmpty) {
        _builder.append("\t");
        _builder.append("// Constructor");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _name_1 = entity.getName();
        _builder.append(_name_1, "\t");
        _builder.append("() {}");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t");
        _builder.append("// Empty constructor");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _name_2 = entity.getName();
        _builder.append(_name_2, "\t");
        _builder.append("() {}");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("// Full constructor");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _constructorEntity = this.getConstructorEntity(entity);
        _builder.append(_constructorEntity, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Getters and setters");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    EList<Attribute> _attributes_3 = entity.getAttributes();
    CharSequence _getSetAtt = this.genUti.getGetSetAtt(_attributes_3);
    _builder.append(_getSetAtt, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// To string method");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    EList<Attribute> _attributes_4 = entity.getAttributes();
    CharSequence _toStringAtts = this.genUti.getToStringAtts(_attributes_4);
    _builder.append(_toStringAtts, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * To write the full constructor of entity
   * 
   * @author Carlos Carrascal
   */
  private CharSequence getConstructorEntity(final Entity entity) {
    StringConcatenation _builder = new StringConcatenation();
    final EList<Attribute> atts = entity.getAttributes();
    _builder.newLineIfNotEmpty();
    _builder.append("public ");
    String _name = entity.getName();
    _builder.append(_name, "");
    _builder.append("(");
    {
      for(final Attribute att : atts) {
        CharSequence _typeName = this.genUti.getTypeName(att);
        _builder.append(_typeName, "");
        _builder.append(" ");
        String _name_1 = att.getName();
        _builder.append(_name_1, "");
        {
          Attribute _last = IterableExtensions.<Attribute>last(atts);
          boolean _equals = _last.equals(att);
          boolean _not = (!_equals);
          if (_not) {
            _builder.append(", ");
          }
        }
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      for(final Attribute att_1 : atts) {
        {
          if ((att_1 instanceof Primitive)) {
            {
              DataEnum _type = ((Primitive)att_1).getType();
              boolean _equals_1 = _type.equals(DataEnum.STRING);
              if (_equals_1) {
                {
                  boolean _isMany = ((Primitive)att_1).isMany();
                  if (_isMany) {
                    _builder.append("\t");
                    _builder.append("this.");
                    String _name_2 = ((Primitive)att_1).getName();
                    _builder.append(_name_2, "\t");
                    _builder.append(" = ");
                    String _name_3 = ((Primitive)att_1).getName();
                    _builder.append(_name_3, "\t");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("for(int i=0; i < this.");
                    String _name_4 = ((Primitive)att_1).getName();
                    _builder.append(_name_4, "\t");
                    _builder.append(".size(); i++) {");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("this.");
                    String _name_5 = ((Primitive)att_1).getName();
                    _builder.append(_name_5, "\t\t");
                    _builder.append(".set(i, this.");
                    String _name_6 = ((Primitive)att_1).getName();
                    _builder.append(_name_6, "\t\t");
                    _builder.append(".get(i).toLowerCase());");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    _builder.append("\t");
                    _builder.append("this.");
                    String _name_7 = ((Primitive)att_1).getName();
                    _builder.append(_name_7, "\t");
                    _builder.append(" = ");
                    String _name_8 = ((Primitive)att_1).getName();
                    _builder.append(_name_8, "\t");
                    _builder.append(".toLowerCase();");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                _builder.append("\t");
                _builder.append("this.");
                String _name_9 = ((Primitive)att_1).getName();
                _builder.append(_name_9, "\t");
                _builder.append(" = ");
                String _name_10 = ((Primitive)att_1).getName();
                _builder.append(_name_10, "\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            if ((att_1 instanceof Reference)) {
              _builder.append("\t");
              _builder.append("this.");
              String _name_11 = att_1.getName();
              _builder.append(_name_11, "\t");
              _builder.append(" = ");
              String _name_12 = att_1.getName();
              _builder.append(_name_12, "\t");
              _builder.append(";");
              _builder.newLineIfNotEmpty();
            } else {
              {
                boolean _isMany_1 = att_1.isMany();
                if (_isMany_1) {
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_13 = att_1.getName();
                  _builder.append(_name_13, "\t");
                  _builder.append(" = ");
                  String _name_14 = att_1.getName();
                  _builder.append(_name_14, "\t");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("for(int i=0; i < this.");
                  String _name_15 = att_1.getName();
                  _builder.append(_name_15, "\t");
                  _builder.append(".size(); i++) {");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_16 = att_1.getName();
                  _builder.append(_name_16, "\t\t");
                  _builder.append(".set(i, this.");
                  String _name_17 = att_1.getName();
                  _builder.append(_name_17, "\t\t");
                  _builder.append(".get(i).toLowerCase());");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  _builder.append("\t");
                  _builder.append("this.");
                  String _name_18 = att_1.getName();
                  _builder.append(_name_18, "\t");
                  _builder.append(" = ");
                  String _name_19 = att_1.getName();
                  _builder.append(_name_19, "\t");
                  _builder.append(".toLowerCase();");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
