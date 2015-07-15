package miso.distil.codeGenerator.generator;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.ArtifactID;
import codeGeneratorModel.Attribute;
import codeGeneratorModel.DataEnum;
import codeGeneratorModel.Entity;
import codeGeneratorModel.Primitive;
import codeGeneratorModel.Reference;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import miso.distil.codeGenerator.generator.Names;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Some methos used everywhere
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateUtils {
  @Inject
  private Names pack;
  
  private HashMap<Artifact, List<Pair<Attribute, List<String>>>> nestedTree = new HashMap<Artifact, List<Pair<Attribute, List<String>>>>();
  
  /**
   * To write the chain ".getX().getY()..." from the attribute number "pos" in artifact
   * 
   * @author Carlos Carrascal
   */
  public String getNestedGets(final Integer pos, final Artifact artifact) {
    List<Pair<Attribute, List<String>>> _nestedTree = this.getNestedTree(artifact);
    Pair<Attribute, List<String>> _get = _nestedTree.get((pos).intValue());
    List<String> list = _get.getValue();
    List<Pair<Attribute, List<String>>> _nestedTree_1 = this.getNestedTree(artifact);
    Pair<Attribute, List<String>> _get_1 = _nestedTree_1.get((pos).intValue());
    Attribute _key = _get_1.getKey();
    String name = _key.getName();
    StringConcatenation _builder = new StringConcatenation();
    String nestedGets = _builder.toString();
    for (final String next : list) {
      String _get_2 = list.get(0);
      boolean _equals = _get_2.equals(next);
      if (_equals) {
        String _lowerCase = next.toLowerCase();
        nestedGets = _lowerCase;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(".get");
        String _plus = (nestedGets + _builder_1);
        String _firstUpper = StringExtensions.toFirstUpper(next);
        String _plus_1 = (_plus + _firstUpper);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("()");
        String _plus_2 = (_plus_1 + _builder_2);
        nestedGets = _plus_2;
      }
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append(".get");
    String _plus_3 = (nestedGets + _builder_3);
    String _string = name.toString();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_string);
    String _plus_4 = (_plus_3 + _firstUpper_1);
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("()");
    return (_plus_4 + _builder_4);
  }
  
  /**
   * To write a string "att1, att2, att3, ..." from the attributes inside the reference number pos in artifact
   * 
   * @author Carlos Carrascal
   */
  public String getNestedAtt(final Integer pos, final Artifact artifact) {
    String parentName = this.getNewAttName(pos, artifact);
    List<Pair<Attribute, List<String>>> _nestedTree = this.getNestedTree(artifact);
    Pair<Attribute, List<String>> _get = _nestedTree.get((pos).intValue());
    Attribute _key = _get.getKey();
    Entity _type = ((Reference) _key).getType();
    EList<Attribute> atts = _type.getAttributes();
    StringConcatenation _builder = new StringConcatenation();
    String nestedAtt = _builder.toString();
    for (final Attribute att : ((EList<Attribute>) atts)) {
      Attribute _last = IterableExtensions.<Attribute>last(atts);
      boolean _equals = _last.equals(att);
      if (_equals) {
        String _name = att.getName();
        String _plus = (nestedAtt + _name);
        String _plus_1 = (_plus + "_");
        String _plus_2 = (_plus_1 + parentName);
        nestedAtt = _plus_2;
      } else {
        String _name_1 = att.getName();
        String _plus_3 = (nestedAtt + _name_1);
        String _plus_4 = (_plus_3 + "_");
        String _plus_5 = (_plus_4 + parentName);
        String _plus_6 = (_plus_5 + ", ");
        nestedAtt = _plus_6;
      }
    }
    return nestedAtt;
  }
  
  /**
   * To get an attribute name by his position inside nestedTree
   * 
   * @author Carlos Carrascal
   */
  public String getNewAttName(final Integer pos, final Artifact artifact) {
    List<Pair<Attribute, List<String>>> _nestedTree = this.getNestedTree(artifact);
    Pair<Attribute, List<String>> _get = _nestedTree.get((pos).intValue());
    Attribute _key = _get.getKey();
    String newName = _key.getName();
    List<Pair<Attribute, List<String>>> _nestedTree_1 = this.getNestedTree(artifact);
    Pair<Attribute, List<String>> _get_1 = _nestedTree_1.get((pos).intValue());
    List<String> _value = _get_1.getValue();
    List<String> reverseList = ListExtensions.<String>reverseView(_value);
    for (final String str : reverseList) {
      String _last = IterableExtensions.<String>last(reverseList);
      boolean _equals = _last.equals(str);
      boolean _not = (!_equals);
      if (_not) {
        String _lowerCase = str.toLowerCase();
        String _plus = ((newName + "_") + _lowerCase);
        newName = _plus;
      }
    }
    return newName;
  }
  
  /**
   * To get an attribute name
   * 
   * @author Carlos Carrascal
   */
  public String getNewAttName(final Attribute att, final Artifact artifact) {
    List<Pair<Attribute, List<String>>> _nestedTree = this.getNestedTree(artifact);
    for (final Pair<Attribute, List<String>> pair : _nestedTree) {
      Attribute _key = pair.getKey();
      boolean _equals = _key.equals(att);
      if (_equals) {
        Attribute _key_1 = pair.getKey();
        String newName = _key_1.getName();
        List<String> _value = pair.getValue();
        List<String> _reverseView = ListExtensions.<String>reverseView(_value);
        for (final String str : _reverseView) {
          List<String> _value_1 = pair.getValue();
          String _last = IterableExtensions.<String>last(_value_1);
          boolean _equals_1 = _last.equals(str);
          boolean _not = (!_equals_1);
          if (_not) {
            String _lowerCase = str.toLowerCase();
            String _plus = ((newName + "_") + _lowerCase);
            newName = _plus;
          }
        }
        return newName;
      }
    }
    return null;
  }
  
  /**
   * To fill nestedTree and return artifact's attributes information
   * 
   * @author Carlos Carrascal
   */
  private List<Pair<Attribute, List<String>>> getNestedTree(final Artifact artifact) {
    Set<Artifact> _keySet = this.nestedTree.keySet();
    boolean _contains = _keySet.contains(artifact);
    if (_contains) {
      return this.nestedTree.get(artifact);
    } else {
      final ArrayList<Pair<Attribute, List<String>>> list = new ArrayList<Pair<Attribute, List<String>>>();
      EList<Attribute> _attributes = artifact.getAttributes();
      final Consumer<Attribute> _function = (Attribute it) -> {
        List<String> path = new ArrayList<String>();
        String _name = artifact.getName();
        path.add(_name);
        if ((it instanceof Reference)) {
          List<Pair<Attribute, List<String>>> _nested = this.getNested(((Reference)it), path);
          list.addAll(_nested);
        }
        Pair<Attribute, List<String>> _pair = new Pair<Attribute, List<String>>(it, path);
        list.add(_pair);
      };
      _attributes.forEach(_function);
      this.nestedTree.put(artifact, list);
      return list;
    }
  }
  
  /**
   * To get for each attribute his path in an ascendent way (recursive)
   * 
   * @author Carlos Carrascal
   */
  private List<Pair<Attribute, List<String>>> getNested(final Reference att, final List<String> parent) {
    final ArrayList<Pair<Attribute, List<String>>> list = new ArrayList<Pair<Attribute, List<String>>>();
    Entity _type = att.getType();
    EList<Attribute> _attributes = _type.getAttributes();
    final Consumer<Attribute> _function = (Attribute it) -> {
      List<String> path = new ArrayList<String>(parent);
      String _name = att.getName();
      path.add(_name);
      if ((it instanceof Reference)) {
        List<Pair<Attribute, List<String>>> _nested = this.getNested(((Reference)it), path);
        list.addAll(_nested);
      }
      Pair<Attribute, List<String>> _pair = new Pair<Attribute, List<String>>(it, path);
      list.add(_pair);
    };
    _attributes.forEach(_function);
    return list;
  }
  
  /**
   * To write "import java.util.List;" if needed
   * 
   * @author Carlos Carrascal
   */
  public CharSequence getImportList(final EList<Attribute> atts) {
    CharSequence _xblockexpression = null;
    {
      boolean presentList = false;
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final Attribute att : atts) {
          _builder.newLineIfNotEmpty();
          {
            boolean _and = false;
            CharSequence _typeName = this.getTypeName(att);
            String _string = _typeName.toString();
            boolean _contains = _string.contains("List<");
            if (!_contains) {
              _and = false;
            } else {
              _and = (!presentList);
            }
            if (_and) {
              Object _xblockexpression_1 = null;
              {
                presentList = true;
                _xblockexpression_1 = null;
              }
              _builder.append(_xblockexpression_1, "");
              _builder.newLineIfNotEmpty();
              _builder.append("import java.util.List;");
              _builder.newLine();
              _builder.newLine();
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * To write imports from atts
   * 
   * @author Carlos Carrascal
   */
  public CharSequence getImportCompose(final EList<Attribute> atts) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<String> nameList = new ArrayList<String>();
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final Attribute att : atts) {
          {
            if ((att instanceof Reference)) {
              {
                Entity _type = ((Reference)att).getType();
                String _name = _type.getName();
                boolean _contains = nameList.contains(_name);
                boolean _not = (!_contains);
                if (_not) {
                  Object _xblockexpression_1 = null;
                  {
                    Entity _type_1 = ((Reference)att).getType();
                    String _name_1 = _type_1.getName();
                    nameList.add(_name_1);
                    _xblockexpression_1 = null;
                  }
                  _builder.append(_xblockexpression_1, "");
                  _builder.newLineIfNotEmpty();
                  _builder.append("import ");
                  _builder.append(this.pack.EntitiesCha, "");
                  _builder.append(".");
                  Entity _type_1 = ((Reference)att).getType();
                  String _name_1 = _type_1.getName();
                  _builder.append(_name_1, "");
                  _builder.append(";");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * To get a list of nested attributes (primitive and reference) (recursive)
   * 
   * @author Carlos Carrascal
   */
  public EList<Attribute> getAllNestedAttributes(final EList<Attribute> atts) {
    final EList<Attribute> list = new BasicEList<Attribute>();
    final Consumer<Attribute> _function = (Attribute it) -> {
      if ((it instanceof Reference)) {
        Entity _type = ((Reference)it).getType();
        EList<Attribute> _attributes = _type.getAttributes();
        EList<Attribute> _allNestedAttributes = this.getAllNestedAttributes(_attributes);
        list.addAll(_allNestedAttributes);
      }
      list.add(it);
    };
    atts.forEach(_function);
    return list;
  }
  
  /**
   * To get a list of nested attributes (but not references) (recursive)
   * 
   * @author Carlos Carrascal
   */
  public EList<Attribute> getNestedAttributes(final Attribute att) {
    final EList<Attribute> list = new BasicEList<Attribute>();
    boolean _or = false;
    if ((att instanceof Primitive)) {
      _or = true;
    } else {
      _or = (att instanceof ArtifactID);
    }
    if (_or) {
      list.add(att);
    } else {
      Entity _type = ((Reference) att).getType();
      EList<Attribute> _attributes = _type.getAttributes();
      final Consumer<Attribute> _function = (Attribute it) -> {
        EList<Attribute> _nestedAttributes = this.getNestedAttributes(it);
        list.addAll(_nestedAttributes);
      };
      _attributes.forEach(_function);
    }
    return list;
  }
  
  /**
   * To write the class name of att
   * 
   * @author Carlos Carrascal
   */
  public CharSequence getTypeName(final Attribute att) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isMany = att.isMany();
      if (_isMany) {
        _builder.append("List<");
      }
    }
    {
      if ((att instanceof Reference)) {
        Entity _type = ((Reference)att).getType();
        String _name = _type.getName();
        _builder.append(_name, "");
      } else {
        if ((att instanceof Primitive)) {
          DataEnum _type_1 = ((Primitive) att).getType();
          String _string = _type_1.toString();
          _builder.append(_string, "");
        } else {
          _builder.append("String");
        }
      }
    }
    {
      boolean _isMany_1 = att.isMany();
      if (_isMany_1) {
        _builder.append(">");
      }
    }
    return _builder;
  }
  
  /**
   * To write private attributes
   * 
   * @author Carlos Carrascal
   */
  public CharSequence getPrivateAttributes(final EList<Attribute> atts) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Attribute att : atts) {
        _builder.append("private ");
        CharSequence _typeName = this.getTypeName(att);
        _builder.append(_typeName, "");
        _builder.append(" ");
        String _name = att.getName();
        _builder.append(_name, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  /**
   * To write getters and setters
   * 
   * @author Carlos Carrascal
   */
  public CharSequence getGetSetAtt(final EList<Attribute> atts) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Attribute att : atts) {
        _builder.append("public ");
        CharSequence _typeName = this.getTypeName(att);
        _builder.append(_typeName, "");
        _builder.append(" get");
        String _name = att.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return ");
        String _name_1 = att.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("public void set");
        String _name_2 = att.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_1, "");
        _builder.append("(");
        CharSequence _typeName_1 = this.getTypeName(att);
        _builder.append(_typeName_1, "");
        _builder.append(" ");
        String _name_3 = att.getName();
        _builder.append(_name_3, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        String _name_4 = att.getName();
        _builder.append(_name_4, "\t");
        _builder.append(" = ");
        String _name_5 = att.getName();
        _builder.append(_name_5, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        {
          Attribute _last = IterableExtensions.<Attribute>last(atts);
          boolean _equals = _last.equals(att);
          boolean _not = (!_equals);
          if (_not) {
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Process ServiceEnum.ALL
   * 
   * @author Carlos Carrascal
   */
  public EList<ServiceEnum> processBasicServices(final EList<ServiceEnum> services) {
    boolean _contains = services.contains(ServiceEnum.ALL);
    if (_contains) {
      services.add(ServiceEnum.UPLOAD);
      services.add(ServiceEnum.DOWNLOAD);
      services.add(ServiceEnum.UPDATE);
      services.add(ServiceEnum.READ);
      services.add(ServiceEnum.READ_ALL);
      services.add(ServiceEnum.SEARCH);
      services.add(ServiceEnum.DELETE);
    }
    return services;
  }
  
  /**
   * To write toString method
   * 
   * @author Carlos Carrascal
   */
  public CharSequence getToStringAtts(final EList<Attribute> atts) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public String toString() {");
    _builder.newLine();
    {
      boolean _isEmpty = atts.isEmpty();
      if (_isEmpty) {
        _builder.append("\t");
        _builder.append("return \"\";");
        _builder.newLine();
      } else {
        _builder.append("\t");
        _builder.append("return ");
        _builder.newLine();
        {
          for(final Attribute att : atts) {
            _builder.append("\t");
            _builder.append("\"(");
            String _name = att.getName();
            _builder.append(_name, "\t");
            _builder.append(" : \" + ");
            String _name_1 = att.getName();
            _builder.append(_name_1, "\t");
            _builder.append(".toString()");
            {
              Attribute _last = IterableExtensions.<Attribute>last(atts);
              boolean _equals = _last.equals(att);
              if (_equals) {
                _builder.append(" + \")\";");
              } else {
                _builder.append(" + \")\" + ");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
