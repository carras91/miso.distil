package miso.distil.codeGenerator.generator.services;

import codeGeneratorModel.MultiService;
import codeGeneratorModel.Service;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.packages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write XXXService.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateMultiService {
  @Inject
  private packages pack;
  
  /**
   * To write <multiService.name>Service.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write(final MultiService multiService) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.pack.ServicesCha, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.pack.MisoServices, "");
    _builder.append(".MultiServiceAbstractJson;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated multi service class");
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
    String _name = multiService.getName();
    _builder.append(_name, "");
    _builder.append(" extends MultiServiceAbstractJson {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated multi service constructor");
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
    String _name_1 = multiService.getName();
    _builder.append(_name_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(");
    boolean _isParallel = multiService.isParallel();
    _builder.append(_isParallel, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      EList<Service> _services = multiService.getServices();
      for(final Service service : ((EList<Service>) _services)) {
        _builder.append("\t\t");
        _builder.append("addService(new Service");
        String _name_2 = service.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
