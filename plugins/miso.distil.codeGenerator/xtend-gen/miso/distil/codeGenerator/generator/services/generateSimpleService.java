package miso.distil.codeGenerator.generator.services;

import codeGeneratorModel.AbstractEntity;
import codeGeneratorModel.Artifact;
import codeGeneratorModel.Entity;
import codeGeneratorModel.Inout;
import codeGeneratorModel.SimpleService;
import com.google.inject.Inject;
import java.util.ArrayList;
import miso.distil.codeGenerator.generator.Names;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write XXXService.java.
 * 
 * @author Carlos Carrascal.
 */
@SuppressWarnings("all")
public class generateSimpleService {
  @Inject
  private Names names;
  
  /**
   * To write "simpleService.name"Service.java.
   * 
   * @param simpleService the SimpleService.
   */
  public CharSequence write(final SimpleService simpleService) {
    StringConcatenation _builder = new StringConcatenation();
    int position = 0;
    _builder.newLineIfNotEmpty();
    ArrayList<String> nameList = new ArrayList<String>();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(this.names.ServicesCha, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import spark.Request;");
    _builder.newLine();
    _builder.append("import spark.Response;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.names.MisoServices, "");
    _builder.append(".ServiceAbstractJson;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.names.MisoAbstract, "");
    _builder.append(".Persistent;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Inout> _input = simpleService.getInput();
      for(final Inout input : ((EList<Inout>) _input)) {
        {
          AbstractEntity _type = input.getType();
          String _name = _type.getName();
          boolean _contains = nameList.contains(_name);
          boolean _not = (!_contains);
          if (_not) {
            {
              AbstractEntity _type_1 = input.getType();
              if ((_type_1 instanceof Artifact)) {
                _builder.append("import ");
                AbstractEntity _type_2 = input.getType();
                CharSequence _artifactFileChar = this.names.getArtifactFileChar(((Artifact) _type_2));
                _builder.append(_artifactFileChar, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("import ");
                AbstractEntity _type_3 = input.getType();
                CharSequence _entityFileChar = this.names.getEntityFileChar(((Entity) _type_3));
                _builder.append(_entityFileChar, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
            Object _xblockexpression = null;
            {
              AbstractEntity _type_4 = input.getType();
              String _name_1 = _type_4.getName();
              nameList.add(_name_1);
              _xblockexpression = null;
            }
            _builder.append(_xblockexpression, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Inout> _output = simpleService.getOutput();
      for(final Inout output : ((EList<Inout>) _output)) {
        {
          AbstractEntity _type_4 = output.getType();
          String _name_1 = _type_4.getName();
          boolean _contains_1 = nameList.contains(_name_1);
          boolean _not_1 = (!_contains_1);
          if (_not_1) {
            {
              AbstractEntity _type_5 = output.getType();
              if ((_type_5 instanceof Artifact)) {
                _builder.append("import ");
                AbstractEntity _type_6 = output.getType();
                CharSequence _artifactFileChar_1 = this.names.getArtifactFileChar(((Artifact) _type_6));
                _builder.append(_artifactFileChar_1, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("import ");
                AbstractEntity _type_7 = output.getType();
                CharSequence _entityFileChar_1 = this.names.getEntityFileChar(((Entity) _type_7));
                _builder.append(_entityFileChar_1, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
            Object _xblockexpression_1 = null;
            {
              AbstractEntity _type_8 = output.getType();
              String _name_2 = _type_8.getName();
              nameList.add(_name_2);
              _xblockexpression_1 = null;
            }
            _builder.append(_xblockexpression_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _isEmpty = nameList.isEmpty();
      boolean _not_2 = (!_isEmpty);
      if (_not_2) {
        _builder.newLine();
      }
    }
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated service class.");
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
    _builder.append("public class Service");
    String _name_2 = simpleService.getName();
    _builder.append(_name_2, "");
    _builder.append(" extends ServiceAbstractJson {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated service constructor.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Service");
    String _name_3 = simpleService.getName();
    _builder.append(_name_3, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("// Input classes");
    _builder.newLine();
    {
      EList<Inout> _input_1 = simpleService.getInput();
      for(final Inout input_1 : ((EList<Inout>) _input_1)) {
        {
          boolean _isMany = input_1.isMany();
          boolean _not_3 = (!_isMany);
          if (_not_3) {
            _builder.append("\t\t");
            _builder.append("addInputClass(");
            AbstractEntity _type_8 = input_1.getType();
            String _name_4 = _type_8.getName();
            _builder.append(_name_4, "\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t");
            _builder.append("addInputClass((new ArrayList<");
            AbstractEntity _type_9 = input_1.getType();
            String _name_5 = _type_9.getName();
            _builder.append(_name_5, "\t\t");
            _builder.append(">()).getClass());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("// Output classes");
    _builder.newLine();
    {
      EList<Inout> _output_1 = simpleService.getOutput();
      for(final Inout output_1 : ((EList<Inout>) _output_1)) {
        {
          boolean _isMany_1 = output_1.isMany();
          boolean _not_4 = (!_isMany_1);
          if (_not_4) {
            _builder.append("\t\t");
            _builder.append("addOutputClass(");
            AbstractEntity _type_10 = output_1.getType();
            String _name_6 = _type_10.getName();
            _builder.append(_name_6, "\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t");
            _builder.append("addOutputClass((new ArrayList<");
            AbstractEntity _type_11 = output_1.getType();
            String _name_7 = _type_11.getName();
            _builder.append(_name_7, "\t\t");
            _builder.append(">()).getClass());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected List<Object> prepareService(Request req, Response res, List<? extends Persistent> artifacts) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<Object> input = new ArrayList<Object>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO : Create the input objects to your service and use (or not) the artifacts");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return input;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected List<Object> exeService(List<Object> input) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<Object> output = new ArrayList<Object>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(!this.testInput(input))");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return output;");
    _builder.newLine();
    {
      EList<Inout> _input_2 = simpleService.getInput();
      boolean _isEmpty_1 = _input_2.isEmpty();
      boolean _not_5 = (!_isEmpty_1);
      if (_not_5) {
        _builder.append("\t\t");
        Object _xblockexpression_2 = null;
        {
          position = 0;
          _xblockexpression_2 = null;
        }
        _builder.append(_xblockexpression_2, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Take your inputs");
        _builder.newLine();
      }
    }
    {
      EList<Inout> _input_3 = simpleService.getInput();
      for(final Inout input_2 : ((EList<Inout>) _input_3)) {
        {
          boolean _isMany_2 = input_2.isMany();
          if (_isMany_2) {
            _builder.append("\t\t");
            _builder.append("// List<");
            AbstractEntity _type_12 = input_2.getType();
            String _name_8 = _type_12.getName();
            _builder.append(_name_8, "\t\t");
            _builder.append(" ");
            AbstractEntity _type_13 = input_2.getType();
            String _name_9 = _type_13.getName();
            String _lowerCase = _name_9.toLowerCase();
            _builder.append(_lowerCase, "\t\t");
            _builder.append(position, "\t\t");
            _builder.append(" = (new ArrayList<");
            AbstractEntity _type_14 = input_2.getType();
            String _name_10 = _type_14.getName();
            _builder.append(_name_10, "\t\t");
            _builder.append(">()).getClass().cast(input.get(");
            _builder.append(position, "\t\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t");
            _builder.append("// ");
            AbstractEntity _type_15 = input_2.getType();
            String _name_11 = _type_15.getName();
            _builder.append(_name_11, "\t\t");
            _builder.append(" ");
            AbstractEntity _type_16 = input_2.getType();
            String _name_12 = _type_16.getName();
            String _lowerCase_1 = _name_12.toLowerCase();
            _builder.append(_lowerCase_1, "\t\t");
            _builder.append(position, "\t\t");
            _builder.append(" = ");
            AbstractEntity _type_17 = input_2.getType();
            String _name_13 = _type_17.getName();
            _builder.append(_name_13, "\t\t");
            _builder.append(".class.cast(input.get(");
            _builder.append(position, "\t\t");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        Object _xblockexpression_3 = null;
        {
          position++;
          _xblockexpression_3 = null;
        }
        _builder.append(_xblockexpression_3, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("// TODO : do something!");
    _builder.newLine();
    {
      EList<Inout> _output_2 = simpleService.getOutput();
      boolean _isEmpty_2 = _output_2.isEmpty();
      boolean _not_6 = (!_isEmpty_2);
      if (_not_6) {
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Create your outputs (do something!)");
        _builder.newLine();
      }
    }
    {
      EList<Inout> _output_3 = simpleService.getOutput();
      for(final Inout output_2 : ((EList<Inout>) _output_3)) {
        {
          boolean _isMany_3 = output_2.isMany();
          if (_isMany_3) {
            _builder.append("\t\t");
            _builder.append("output.add(new ArrayList<");
            AbstractEntity _type_18 = output_2.getType();
            String _name_14 = _type_18.getName();
            _builder.append(_name_14, "\t\t");
            _builder.append(">());");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t");
            _builder.append("output.add(new ");
            AbstractEntity _type_19 = output_2.getType();
            String _name_15 = _type_19.getName();
            _builder.append(_name_15, "\t\t");
            _builder.append("());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return output;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
