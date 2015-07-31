package miso.distil.codeGenerator.generator.entities;

import codeGeneratorModel.Root;
import com.google.inject.Inject;
import miso.distil.codeGenerator.generator.Names;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write MongoDataBase.java.
 * 
 * @author Carlos Carrascal.
 */
@SuppressWarnings("all")
public class generateMongoDataBase {
  @Inject
  private Names names;
  
  /**
   * To write MongoDataBase.java.
   * 
   * @param root the root.
   */
  public CharSequence write(final Root root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.names.RootChar, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.names.MisoBasic, "");
    _builder.append(".BasicInterfaceSpark;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.names.Miso, "");
    _builder.append(".MongoDB;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.names.MisoAbstract, "");
    _builder.append(".RecordDB;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated mongo data base.");
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
    _builder.append("public class MongoDataBase implements BasicInterfaceSpark ");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    int pos = 0;
    _builder.newLineIfNotEmpty();
    {
      EList<String> _mongoURIs = root.getMongoURIs();
      for(final String uri : _mongoURIs) {
        _builder.append("\t");
        _builder.append("private final static String MONGO_URI_");
        _builder.append(pos, "\t");
        _builder.append(" = \"");
        _builder.append(uri, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Object _xblockexpression = null;
        {
          pos++;
          _xblockexpression = null;
        }
        _builder.append(_xblockexpression, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated spark service to find and activate some Mongo DataBases.");
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
    _builder.append("// To create your own DB implementation you need to create a class implementing InterfaceDB");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// CustomDB customDB = new CustomDB();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// To register them or set default one of them");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Remember : all auto-generated code use the default DB");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Integer positionDB = RecordDB.register(customDB); \t// (Use RecordDB.getDB(positionDB) to reach it)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// RecordDB.setDefault(customDB);\t\t\t\t\t\t// (Use RecordDB.getDefault() to reach it)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    Object _xblockexpression_1 = null;
    {
      pos = 0;
      _xblockexpression_1 = null;
    }
    _builder.append(_xblockexpression_1, "\t\t");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _mongoURIs_1 = root.getMongoURIs();
      for(final String uri_1 : _mongoURIs_1) {
        _builder.append("\t\t");
        _builder.append("try {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("MongoDB mongoDB_");
        _builder.append(pos, "\t\t\t");
        _builder.append(" = new MongoDB(MONGO_URI_");
        _builder.append(pos, "\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("Integer positionDB_");
        _builder.append(pos, "\t\t\t");
        _builder.append(" = RecordDB.register(mongoDB_");
        _builder.append(pos, "\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("System.out.println(\"mongoDB_");
        _builder.append(pos, "\t\t\t");
        _builder.append(" registered in position \" + positionDB_");
        _builder.append(pos, "\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        {
          if ((pos == 0)) {
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("RecordDB.setDefault(mongoDB_");
            _builder.append(pos, "\t\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("System.out.println(\"mongoDB_");
            _builder.append(pos, "\t\t\t");
            _builder.append(" set default\");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("} catch (Exception e) {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("e.printStackTrace();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("System.out.println(\"mongoDB_");
        _builder.append(pos, "\t\t\t");
        _builder.append(" has found an exception\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        Object _xblockexpression_2 = null;
        {
          pos++;
          _xblockexpression_2 = null;
        }
        _builder.append(_xblockexpression_2, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
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
