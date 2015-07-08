package miso.carrascal.codeGenerator.generator.services;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.OnService;
import codeGeneratorModel.Service;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import miso.carrascal.codeGenerator.generator.packages;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * To write ServicesSpark.java
 * 
 * @author Carlos Carrascal
 */
@SuppressWarnings("all")
public class generateServicesSpark {
  @Inject
  private packages pack;
  
  /**
   * To get each artifacts list of services and when they are triggered
   * 
   * @author Carlos Carrascal
   */
  public HashMap<Artifact, HashMap<ServiceEnum, ArrayList<Service>>> info(final EList<Service> services) {
    HashMap<Artifact, HashMap<ServiceEnum, ArrayList<Service>>> map = new HashMap<Artifact, HashMap<ServiceEnum, ArrayList<Service>>>();
    for (final Service service : services) {
      EList _when = service.getWhen();
      for (final OnService onService : ((EList<OnService>) _when)) {
        Artifact _artifact = onService.getArtifact();
        boolean _containsKey = map.containsKey(_artifact);
        if (_containsKey) {
          EList _whenServices = onService.getWhenServices();
          for (final ServiceEnum when : ((EList<ServiceEnum>) _whenServices)) {
            Artifact _artifact_1 = onService.getArtifact();
            HashMap<ServiceEnum, ArrayList<Service>> _get = map.get(_artifact_1);
            boolean _containsKey_1 = _get.containsKey(when);
            if (_containsKey_1) {
              Artifact _artifact_2 = onService.getArtifact();
              HashMap<ServiceEnum, ArrayList<Service>> _get_1 = map.get(_artifact_2);
              ArrayList<Service> _get_2 = _get_1.get(when);
              _get_2.add(service);
            } else {
              ArrayList<Service> list = new ArrayList<Service>();
              list.add(service);
              Artifact _artifact_3 = onService.getArtifact();
              HashMap<ServiceEnum, ArrayList<Service>> _get_3 = map.get(_artifact_3);
              _get_3.put(when, list);
            }
          }
        } else {
          HashMap<ServiceEnum, ArrayList<Service>> inMap = new HashMap<ServiceEnum, ArrayList<Service>>();
          EList _whenServices_1 = onService.getWhenServices();
          for (final ServiceEnum when_1 : ((EList<ServiceEnum>) _whenServices_1)) {
            {
              ArrayList<Service> list_1 = new ArrayList<Service>();
              list_1.add(service);
              inMap.put(when_1, list_1);
            }
          }
          Artifact _artifact_4 = onService.getArtifact();
          map.put(_artifact_4, inMap);
        }
      }
    }
    return map;
  }
  
  /**
   * To write ServicesSpark.java
   * 
   * @author Carlos Carrascal
   */
  public CharSequence write(final EList<Service> services) {
    StringConcatenation _builder = new StringConcatenation();
    HashMap<Artifact, HashMap<ServiceEnum, ArrayList<Service>>> map = this.info(services);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(this.pack.ServicesCha, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    boolean arrays = false;
    _builder.newLineIfNotEmpty();
    {
      Collection<HashMap<ServiceEnum, ArrayList<Service>>> _values = map.values();
      for(final HashMap<ServiceEnum, ArrayList<Service>> inMap : _values) {
        {
          boolean _and = false;
          if (!(!arrays)) {
            _and = false;
          } else {
            boolean _or = false;
            boolean _containsKey = inMap.containsKey(ServiceEnum.READ_ALL_LITERAL);
            if (_containsKey) {
              _or = true;
            } else {
              boolean _containsKey_1 = inMap.containsKey(ServiceEnum.SEARCH_LITERAL);
              _or = _containsKey_1;
            }
            _and = _or;
          }
          if (_and) {
            Object _xblockexpression = null;
            {
              arrays = true;
              _xblockexpression = null;
            }
            _builder.append(_xblockexpression, "");
            _builder.newLineIfNotEmpty();
            _builder.append("import java.util.Arrays;");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import static spark.Spark.post;");
    _builder.newLine();
    boolean upload = false;
    _builder.newLineIfNotEmpty();
    {
      Collection<HashMap<ServiceEnum, ArrayList<Service>>> _values_1 = map.values();
      for(final HashMap<ServiceEnum, ArrayList<Service>> inMap_1 : _values_1) {
        {
          boolean _and_1 = false;
          if (!(!upload)) {
            _and_1 = false;
          } else {
            boolean _or_1 = false;
            boolean _or_2 = false;
            boolean _containsKey_2 = inMap_1.containsKey(ServiceEnum.UPLOAD_LITERAL);
            if (_containsKey_2) {
              _or_2 = true;
            } else {
              boolean _containsKey_3 = inMap_1.containsKey(ServiceEnum.READ_ALL_LITERAL);
              _or_2 = _containsKey_3;
            }
            if (_or_2) {
              _or_1 = true;
            } else {
              boolean _containsKey_4 = inMap_1.containsKey(ServiceEnum.SEARCH_LITERAL);
              _or_1 = _containsKey_4;
            }
            _and_1 = _or_1;
          }
          if (_and_1) {
            Object _xblockexpression_1 = null;
            {
              upload = true;
              _xblockexpression_1 = null;
            }
            _builder.append(_xblockexpression_1, "");
            _builder.newLineIfNotEmpty();
            _builder.append("import static spark.Spark.after;");
            _builder.newLine();
            _builder.newLine();
            _builder.append("import com.google.gson.Gson;");
            _builder.newLine();
            _builder.append("import com.google.gson.JsonSyntaxException;");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("import ");
    _builder.append(this.pack.MisoBasic, "");
    _builder.append(".JsonTransformer;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.pack.MisoBasic, "");
    _builder.append(".BasicInterfaceSpark;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.pack.MisoAbstract, "");
    _builder.append(".AbstractPersistentClass;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(this.pack.MisoAbstract, "");
    _builder.append(".RecordDB;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Set<Artifact> _keySet = map.keySet();
      for(final Artifact artifact : _keySet) {
        {
          boolean _or_3 = false;
          boolean _or_4 = false;
          HashMap<ServiceEnum, ArrayList<Service>> _get = map.get(artifact);
          boolean _containsKey_5 = _get.containsKey(ServiceEnum.DOWNLOAD_LITERAL);
          if (_containsKey_5) {
            _or_4 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_1 = map.get(artifact);
            boolean _containsKey_6 = _get_1.containsKey(ServiceEnum.UPDATE_LITERAL);
            _or_4 = _containsKey_6;
          }
          if (_or_4) {
            _or_3 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_2 = map.get(artifact);
            boolean _containsKey_7 = _get_2.containsKey(ServiceEnum.READ_LITERAL);
            _or_3 = _containsKey_7;
          }
          if (_or_3) {
            _builder.append("import ");
            CharSequence _basicChar = this.pack.getBasicChar(artifact);
            _builder.append(_basicChar, "");
            _builder.append(".Basic");
            String _name = artifact.getName();
            _builder.append(_name, "");
            _builder.append("Param;");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          HashMap<ServiceEnum, ArrayList<Service>> _get_3 = map.get(artifact);
          Set<ServiceEnum> _keySet_1 = _get_3.keySet();
          boolean _isEmpty = _keySet_1.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append("import ");
            CharSequence _basicChar_1 = this.pack.getBasicChar(artifact);
            _builder.append(_basicChar_1, "");
            _builder.append(".Basic");
            String _name_1 = artifact.getName();
            _builder.append(_name_1, "");
            _builder.append("Spark;");
            _builder.newLineIfNotEmpty();
            _builder.append("import ");
            CharSequence _artifactChar = this.pack.getArtifactChar(artifact);
            _builder.append(_artifactChar, "");
            _builder.append(".");
            String _name_2 = artifact.getName();
            _builder.append(_name_2, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Auto-generated services spark server");
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
    _builder.append("public final class ServicesSpark implements BasicInterfaceSpark {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// URL\'s");
    _builder.newLine();
    {
      for(final Service service : services) {
        _builder.append("\t");
        _builder.append("public static String ");
        String _name_3 = service.getName();
        _builder.append(_name_3, "\t");
        _builder.append("Url = \"/service/");
        String _name_4 = service.getName();
        String _lowerCase = _name_4.toLowerCase();
        _builder.append(_lowerCase, "\t");
        _builder.append("/\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Auto-generated services spark service. It initializes all services url\'s");
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
    {
      for(final Service service_1 : services) {
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("Service");
        String _name_5 = service_1.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append(" service");
        String _name_6 = service_1.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append(" = new Service");
        String _name_7 = service_1.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("post(");
        String _name_8 = service_1.getName();
        _builder.append(_name_8, "\t\t");
        _builder.append("Url, \"application/json\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("return service");
        String _name_9 = service_1.getName();
        _builder.append(_name_9, "\t\t\t\t");
        _builder.append(".runService(request, response, list);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("}, new JsonTransformer());");
        _builder.newLine();
      }
    }
    {
      Set<Artifact> _keySet_2 = map.keySet();
      for(final Artifact artifact_1 : _keySet_2) {
        {
          HashMap<ServiceEnum, ArrayList<Service>> _get_4 = map.get(artifact_1);
          boolean _containsKey_8 = _get_4.containsKey(ServiceEnum.DOWNLOAD_LITERAL);
          if (_containsKey_8) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_10 = artifact_1.getName();
            _builder.append(_name_10, "\t\t");
            _builder.append("Spark.DownloadZipIdJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("String id = request.params(Basic");
            String _name_11 = artifact_1.getName();
            _builder.append(_name_11, "\t\t\t\t\t");
            _builder.append("Param.IdGet);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, ");
            String _name_12 = artifact_1.getName();
            _builder.append(_name_12, "\t\t\t\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_5 = map.get(artifact_1);
              ArrayList<Service> _get_6 = _get_5.get(ServiceEnum.DOWNLOAD_LITERAL);
              for(final Service service_2 : _get_6) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("service");
                String _name_13 = service_2.getName();
                _builder.append(_name_13, "\t\t\t\t\t");
                _builder.append(".runService(request, response, list);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_14 = artifact_1.getName();
            _builder.append(_name_14, "\t\t");
            _builder.append("Spark.DownloadFileIdJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("String id = request.params(Basic");
            String _name_15 = artifact_1.getName();
            _builder.append(_name_15, "\t\t\t\t\t");
            _builder.append("Param.IdGet);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, ");
            String _name_16 = artifact_1.getName();
            _builder.append(_name_16, "\t\t\t\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_7 = map.get(artifact_1);
              ArrayList<Service> _get_8 = _get_7.get(ServiceEnum.DOWNLOAD_LITERAL);
              for(final Service service_3 : _get_8) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("service");
                String _name_17 = service_3.getName();
                _builder.append(_name_17, "\t\t\t\t\t");
                _builder.append(".runService(request, response, list);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
          }
        }
        {
          HashMap<ServiceEnum, ArrayList<Service>> _get_9 = map.get(artifact_1);
          boolean _containsKey_9 = _get_9.containsKey(ServiceEnum.READ_LITERAL);
          if (_containsKey_9) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_18 = artifact_1.getName();
            _builder.append(_name_18, "\t\t");
            _builder.append("Spark.ReadIdJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("String id = request.params(Basic");
            String _name_19 = artifact_1.getName();
            _builder.append(_name_19, "\t\t\t\t\t");
            _builder.append("Param.IdGet);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, ");
            String _name_20 = artifact_1.getName();
            _builder.append(_name_20, "\t\t\t\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_10 = map.get(artifact_1);
              ArrayList<Service> _get_11 = _get_10.get(ServiceEnum.READ_LITERAL);
              for(final Service service_4 : _get_11) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("service");
                String _name_21 = service_4.getName();
                _builder.append(_name_21, "\t\t\t\t\t");
                _builder.append(".runService(request, response, list);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
          }
        }
        {
          HashMap<ServiceEnum, ArrayList<Service>> _get_12 = map.get(artifact_1);
          boolean _containsKey_10 = _get_12.containsKey(ServiceEnum.UPDATE_LITERAL);
          if (_containsKey_10) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_22 = artifact_1.getName();
            _builder.append(_name_22, "\t\t");
            _builder.append("Spark.UpdateJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("String id = request.queryParams(Basic");
            String _name_23 = artifact_1.getName();
            _builder.append(_name_23, "\t\t\t\t\t");
            _builder.append("Param.IdPost);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("AbstractPersistentClass artifact = RecordDB.getDefault().readOne(id, ");
            String _name_24 = artifact_1.getName();
            _builder.append(_name_24, "\t\t\t\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_13 = map.get(artifact_1);
              ArrayList<Service> _get_14 = _get_13.get(ServiceEnum.UPDATE_LITERAL);
              for(final Service service_5 : _get_14) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("service");
                String _name_25 = service_5.getName();
                _builder.append(_name_25, "\t\t\t\t\t");
                _builder.append(".runService(request, response, list);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
          }
        }
        {
          HashMap<ServiceEnum, ArrayList<Service>> _get_15 = map.get(artifact_1);
          boolean _containsKey_11 = _get_15.containsKey(ServiceEnum.UPLOAD_LITERAL);
          if (_containsKey_11) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_26 = artifact_1.getName();
            _builder.append(_name_26, "\t\t");
            _builder.append("Spark.UploadJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t            ");
            _builder.append("AbstractPersistentClass artifact = ((AbstractPersistentClass)(new Gson()).fromJson(response.body(), ");
            String _name_27 = artifact_1.getName();
            _builder.append(_name_27, "\t\t\t            ");
            _builder.append(".class));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("List<AbstractPersistentClass> list = new ArrayList<AbstractPersistentClass>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_16 = map.get(artifact_1);
              ArrayList<Service> _get_17 = _get_16.get(ServiceEnum.UPLOAD_LITERAL);
              for(final Service service_6 : _get_17) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("service");
                String _name_28 = service_6.getName();
                _builder.append(_name_28, "\t\t\t\t\t\t");
                _builder.append(".runService(request, response, list);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("} catch (JsonSyntaxException e) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("e.printStackTrace();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
          }
        }
        {
          HashMap<ServiceEnum, ArrayList<Service>> _get_18 = map.get(artifact_1);
          boolean _containsKey_12 = _get_18.containsKey(ServiceEnum.READ_ALL_LITERAL);
          if (_containsKey_12) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_29 = artifact_1.getName();
            _builder.append(_name_29, "\t\t");
            _builder.append("Spark.ReadAllJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("AbstractPersistentClass[] list = (new Gson()).fromJson(response.body(), AbstractPersistentClass[].class);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t            ");
            _builder.append("List<AbstractPersistentClass> newList = new ArrayList<AbstractPersistentClass>(Arrays.asList(list));");
            _builder.newLine();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_19 = map.get(artifact_1);
              ArrayList<Service> _get_20 = _get_19.get(ServiceEnum.READ_ALL_LITERAL);
              for(final Service service_7 : _get_20) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("service");
                String _name_30 = service_7.getName();
                _builder.append(_name_30, "\t\t\t\t\t\t");
                _builder.append(".runService(request, response, newList);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("} catch (JsonSyntaxException e) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("e.printStackTrace();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
          }
        }
        {
          HashMap<ServiceEnum, ArrayList<Service>> _get_21 = map.get(artifact_1);
          boolean _containsKey_13 = _get_21.containsKey(ServiceEnum.SEARCH_LITERAL);
          if (_containsKey_13) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_31 = artifact_1.getName();
            _builder.append(_name_31, "\t\t");
            _builder.append("Spark.SearchJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("AbstractPersistentClass[] list = (new Gson()).fromJson(response.body(), AbstractPersistentClass[].class);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t            ");
            _builder.append("List<AbstractPersistentClass> newList = new ArrayList<AbstractPersistentClass>(Arrays.asList(list));");
            _builder.newLine();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_22 = map.get(artifact_1);
              ArrayList<Service> _get_23 = _get_22.get(ServiceEnum.SEARCH_LITERAL);
              for(final Service service_8 : _get_23) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("service");
                String _name_32 = service_8.getName();
                _builder.append(_name_32, "\t\t\t\t\t\t");
                _builder.append(".runService(request, response, newList);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("} catch (JsonSyntaxException e) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("e.printStackTrace();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("});");
            _builder.newLine();
          }
        }
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
