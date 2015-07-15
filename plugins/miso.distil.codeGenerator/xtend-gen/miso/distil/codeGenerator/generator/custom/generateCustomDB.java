package miso.distil.codeGenerator.generator.custom;

import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write CustomDb.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateCustomDB {
  @Inject
  private Names names;
  
  /**
   * To write CustomDb.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.names.RootChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.InputStream;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.names.MisoBasic, "");
    _builder.append(".BasicInterfaceSpark;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.names.MisoAbstract, "");
    _builder.append(".Persistent;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.names.MisoAbstract, "");
    _builder.append(".InterfaceDB;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated custom data base class");
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
    _builder.append("public class CustomDB implements InterfaceDB, BasicInterfaceSpark ");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated spark service to find and activate this data base.");
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
    _builder.append("public void runService() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// To create your own DB implementation (implementing InterfaceDB)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// CustomDB customDB = new CustomDB();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// To create another MongoDB");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// String MONGO_URI = \"\"; // Valid mongo uri!! Example : mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?options]]");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// MongoDB mongoDB = new MongoDB(MONGO_URI);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// To register them or set default one of them");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Remember : all auto-generated code use the default DB");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("// Integer positionDB = RecordDB.register(customDB); \t// (Use RecordDB.getDB(positionDB) to reach it)");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("// RecordDB.setDefault(mongoDB);\t\t\t\t\t\t// (Use RecordDB.getDefault() to reach it)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated empty constructor.");
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
    _builder.append("public CustomDB() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Do something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated save method. It has to save \"artifact\" and his associated file\'s \"inputstream\".");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* When saved, it will be necessary to store the artifact class");
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
    _builder.append("public Boolean save(Persistent artifact, InputStream inputStream) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated delete method. It has to delete the \"id\" artifact, knowing his class \"classType\".");
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
    _builder.append("public Boolean delete(String id, Class<? extends Persistent> classType) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated read method. It has to return the \"id\" artifact, knowing his class \"classType\".");
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
    _builder.append("public Persistent readOne(String id, Class<? extends Persistent> classType) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated readAll method. It has to return all the artifacts with \"classType\" class.");
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
    _builder.append("public ArrayList<? extends Persistent> readAll(Class<? extends Persistent> classType) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ArrayList<Persistent>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated search method. It has to return all the artifacts with and \"attribute\" coincident with \"value\" with class \"classType\".");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* \"synonymes_att\" allows to search \"attribute\" synonymes and \"synonymes_val\" allows to search \"value\" synonymes. ");
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
    _builder.append("public ArrayList<? extends Persistent> search(String attribute, Boolean synonymes_att, String value, Boolean synonymes_val, Class<? extends Persistent> classType) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ArrayList<Persistent>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated search by tag method. Its similar to search(\"tags\", false, tag, synonymes, classType).");
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
    _builder.append("public ArrayList<? extends Persistent> searchTag(String tag, Boolean synonymes, Class<? extends Persistent> classType) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ArrayList<Persistent>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated synonymes method. It returns the synonymes used with a word \"query\" in search and searchTag.");
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
    _builder.append("public List<String> getSynonymes(String query) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return new ArrayList<String>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated getInputStream method. It has to return the input stream associated to the \"id\" artifact with class \"classType\"");
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
    _builder.append("public InputStream getInputStream(String id, Class<? extends Persistent> classType) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated count method. It returns the quantity of artifacts stored.");
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
    _builder.append("public long count() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated count method. It returns the quantity of artifacts with class \"classType\" stored.");
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
    _builder.append("public long count(Class<? extends Persistent> classType) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated max size method. It returns the maximum size allowed to one artifact.");
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
    _builder.append("public int maxSaveSize() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
