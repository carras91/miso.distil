package miso.carrascal.codeGenerator.generator.entities;

import com.google.inject.Inject;
import miso.carrascal.codeGenerator.generator.packages;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class generateMain {
  @Inject
  private packages pack;
  
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
