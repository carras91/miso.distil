package miso.distil.codeGenerator.generator.services;

import codeGeneratorModel.AbstractEntity;
import codeGeneratorModel.Artifact;
import codeGeneratorModel.Entity;
import codeGeneratorModel.SimpleService;
import com.google.inject.Inject;
import java.util.ArrayList;
import miso.distil.codeGenerator.generator.Names;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write XXXService.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateSimpleService {
  @Inject
  private Names names;
  
  /**
   * To write <simpleService.name>Service.java
   * 
   * @author Carlos Carrascal
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
    _builder.append(".AbstractPersistentClass;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<AbstractEntity> _input = simpleService.getInput();
      for(final AbstractEntity input : ((EList<AbstractEntity>) _input)) {
        {
          String _name = input.getName();
          boolean _contains = nameList.contains(_name);
          boolean _not = (!_contains);
          if (_not) {
            {
              if ((input instanceof Artifact)) {
                _builder.append("import ");
                CharSequence _artifactFileChar = this.names.getArtifactFileChar(((Artifact)input));
                _builder.append(_artifactFileChar, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("import ");
                Entity _cast = Entity.class.cast(input);
                CharSequence _entityFileChar = this.names.getEntityFileChar(_cast);
                _builder.append(_entityFileChar, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
            Object _xblockexpression = null;
            {
              String _name_1 = input.getName();
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
      EList<AbstractEntity> _output = simpleService.getOutput();
      for(final AbstractEntity output : ((EList<AbstractEntity>) _output)) {
        {
          String _name_1 = output.getName();
          boolean _contains_1 = nameList.contains(_name_1);
          boolean _not_1 = (!_contains_1);
          if (_not_1) {
            {
              if ((output instanceof Artifact)) {
                _builder.append("import ");
                CharSequence _artifactFileChar_1 = this.names.getArtifactFileChar(((Artifact)output));
                _builder.append(_artifactFileChar_1, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("import ");
                Entity _cast_1 = Entity.class.cast(output);
                CharSequence _entityFileChar_1 = this.names.getEntityFileChar(_cast_1);
                _builder.append(_entityFileChar_1, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
            Object _xblockexpression_1 = null;
            {
              String _name_2 = output.getName();
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
    _builder.append("* Auto-generated service class");
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
    _builder.append("* Auto-generated service constructor");
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
    _builder.append("public Service");
    String _name_3 = simpleService.getName();
    _builder.append(_name_3, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("// Input classes");
    _builder.newLine();
    {
      EList<AbstractEntity> _input_1 = simpleService.getInput();
      for(final AbstractEntity input_1 : ((EList<AbstractEntity>) _input_1)) {
        _builder.append("\t\t");
        _builder.append("addInputClass(");
        String _name_4 = input_1.getName();
        _builder.append(_name_4, "\t\t");
        _builder.append(".class);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("// Outpu classes");
    _builder.newLine();
    {
      EList<AbstractEntity> _output_1 = simpleService.getOutput();
      for(final AbstractEntity output_1 : ((EList<AbstractEntity>) _output_1)) {
        _builder.append("\t\t");
        _builder.append("addOutputClass(");
        String _name_5 = output_1.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append(".class);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Method called automatically");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* If triggered :");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* - after upload, download, update, read -> artifacts.size = 1, (request, response) from these services");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* - after readAll, search -> the results of these services, (request, response) from these services");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* - on request -> artifacts.size = 0, , (request, response) sent by user");
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
    _builder.append("public List<Object> runService(Request req, Response res, List<? extends AbstractPersistentClass> artifacts) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<Object> input = new ArrayList<Object>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Create the input objects to your service and use (or not) the artifacts");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.exeService(input);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Execution method. It uses an object\'s list (see the constructor input order) and generates other object\'s list (see the constructor output order)");
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
    _builder.append("public List<Object> exeService(List<Object> input) {");
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
      EList<AbstractEntity> _input_2 = simpleService.getInput();
      boolean _isEmpty_1 = _input_2.isEmpty();
      boolean _not_3 = (!_isEmpty_1);
      if (_not_3) {
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
      EList<AbstractEntity> _input_3 = simpleService.getInput();
      for(final AbstractEntity input_2 : ((EList<AbstractEntity>) _input_3)) {
        _builder.append("\t\t");
        _builder.append("// ");
        String _name_6 = input_2.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append(" ");
        String _name_7 = input_2.getName();
        String _lowerCase = _name_7.toLowerCase();
        _builder.append(_lowerCase, "\t\t");
        _builder.append(position, "\t\t");
        _builder.append(" = ");
        String _name_8 = input_2.getName();
        _builder.append(_name_8, "\t\t");
        _builder.append(".class.cast(input.get(");
        _builder.append(position, "\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
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
    {
      EList<AbstractEntity> _input_4 = simpleService.getInput();
      boolean _isEmpty_2 = _input_4.isEmpty();
      boolean _not_4 = (!_isEmpty_2);
      if (_not_4) {
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("// Create your outputs (do something!)");
        _builder.newLine();
      }
    }
    {
      EList<AbstractEntity> _output_2 = simpleService.getOutput();
      for(final AbstractEntity output_2 : ((EList<AbstractEntity>) _output_2)) {
        _builder.append("\t\t");
        _builder.append("output.add(new ");
        String _name_9 = output_2.getName();
        _builder.append(_name_9, "\t\t");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
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
