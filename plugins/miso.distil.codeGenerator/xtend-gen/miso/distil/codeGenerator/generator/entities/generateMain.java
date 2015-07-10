package miso.distil.codeGenerator.generator.entities;

import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.packages;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write Main.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateMain {
  @Inject
  private packages pack;
  
  /**
   * To write Main.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.pack.RootChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.pack.Miso, "");
    _builder.append(".CloudModelServices;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated main class");
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
    _builder.append("public class Main {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Running\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Call cloudModelServices to start all spark server");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("CloudModelServices.run();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
