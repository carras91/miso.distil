package miso.distil.codeGenerator.generator.services;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.OnService;
import codeGeneratorModel.Service;
import codeGeneratorModel.ServiceEnum;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import miso.distil.codeGenerator.generator.Names;
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
  private Names names;
  
  /**
   * To get each artifacts list of services and when they are triggered
   * 
   * @author Carlos Carrascal
   */
  public HashMap<Artifact, HashMap<ServiceEnum, ArrayList<Service>>> info(final EList<Service> services) {
    HashMap<Artifact, HashMap<ServiceEnum, ArrayList<Service>>> map = new HashMap<Artifact, HashMap<ServiceEnum, ArrayList<Service>>>();
    for (final Service service : services) {
      EList<OnService> _when = service.getWhen();
      for (final OnService onService : ((EList<OnService>) _when)) {
        Artifact _artifact = onService.getArtifact();
        boolean _containsKey = map.containsKey(_artifact);
        if (_containsKey) {
          EList<ServiceEnum> _whenServices = onService.getWhenServices();
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
          EList<ServiceEnum> _whenServices_1 = onService.getWhenServices();
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
    ArrayList<Service> listServices = new ArrayList<Service>();
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    _builder.append(this.names.ServicesCha, "");
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
            boolean _or_1 = false;
            boolean _containsKey = inMap.containsKey(ServiceEnum.READ_ALL);
            if (_containsKey) {
              _or_1 = true;
            } else {
              boolean _containsKey_1 = inMap.containsKey(ServiceEnum.ALL);
              _or_1 = _containsKey_1;
            }
            if (_or_1) {
              _or = true;
            } else {
              boolean _containsKey_2 = inMap.containsKey(ServiceEnum.SEARCH);
              _or = _containsKey_2;
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
            boolean _or_2 = false;
            boolean _or_3 = false;
            boolean _or_4 = false;
            boolean _containsKey_3 = inMap_1.containsKey(ServiceEnum.UPLOAD);
            if (_containsKey_3) {
              _or_4 = true;
            } else {
              boolean _containsKey_4 = inMap_1.containsKey(ServiceEnum.ALL);
              _or_4 = _containsKey_4;
            }
            if (_or_4) {
              _or_3 = true;
            } else {
              boolean _containsKey_5 = inMap_1.containsKey(ServiceEnum.READ_ALL);
              _or_3 = _containsKey_5;
            }
            if (_or_3) {
              _or_2 = true;
            } else {
              boolean _containsKey_6 = inMap_1.containsKey(ServiceEnum.SEARCH);
              _or_2 = _containsKey_6;
            }
            _and_1 = _or_2;
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
    _builder.append(this.names.MisoBasic, "");
    _builder.append(".JsonTransformer;");
    _builder.newLineIfNotEmpty();
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
    _builder.append(".RecordDB;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Set<Artifact> _keySet = map.keySet();
      for(final Artifact artifact : _keySet) {
        {
          boolean _or_5 = false;
          boolean _or_6 = false;
          boolean _or_7 = false;
          HashMap<ServiceEnum, ArrayList<Service>> _get = map.get(artifact);
          boolean _containsKey_7 = _get.containsKey(ServiceEnum.DOWNLOAD);
          if (_containsKey_7) {
            _or_7 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_1 = map.get(artifact);
            boolean _containsKey_8 = _get_1.containsKey(ServiceEnum.UPDATE);
            _or_7 = _containsKey_8;
          }
          if (_or_7) {
            _or_6 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_2 = map.get(artifact);
            boolean _containsKey_9 = _get_2.containsKey(ServiceEnum.ALL);
            _or_6 = _containsKey_9;
          }
          if (_or_6) {
            _or_5 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_3 = map.get(artifact);
            boolean _containsKey_10 = _get_3.containsKey(ServiceEnum.READ);
            _or_5 = _containsKey_10;
          }
          if (_or_5) {
            _builder.append("import ");
            CharSequence _bParamFileChar = this.names.getBParamFileChar(artifact);
            _builder.append(_bParamFileChar, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          HashMap<ServiceEnum, ArrayList<Service>> _get_4 = map.get(artifact);
          Set<ServiceEnum> _keySet_1 = _get_4.keySet();
          boolean _isEmpty = _keySet_1.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append("import ");
            CharSequence _bSparkFileChar = this.names.getBSparkFileChar(artifact);
            _builder.append(_bSparkFileChar, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("import ");
            CharSequence _artifactFileChar = this.names.getArtifactFileChar(artifact);
            _builder.append(_artifactFileChar, "");
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
        String _name = service.getName();
        _builder.append(_name, "\t");
        _builder.append("Url = \"/service/");
        String _name_1 = service.getName();
        String _lowerCase = _name_1.toLowerCase();
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
        String _name_2 = service_1.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append(" service");
        String _name_3 = service_1.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(" = new Service");
        String _name_4 = service_1.getName();
        _builder.append(_name_4, "\t\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("post(");
        String _name_5 = service_1.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append("Url, \"application/json\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("(request, response) -> {");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("List<Persistent> list = new ArrayList<Persistent>();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("return service");
        String _name_6 = service_1.getName();
        _builder.append(_name_6, "\t\t\t\t");
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
          boolean _or_8 = false;
          HashMap<ServiceEnum, ArrayList<Service>> _get_5 = map.get(artifact_1);
          boolean _containsKey_11 = _get_5.containsKey(ServiceEnum.DOWNLOAD);
          if (_containsKey_11) {
            _or_8 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_6 = map.get(artifact_1);
            boolean _containsKey_12 = _get_6.containsKey(ServiceEnum.ALL);
            _or_8 = _containsKey_12;
          }
          if (_or_8) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_7 = artifact_1.getName();
            _builder.append(_name_7, "\t\t");
            _builder.append("Spark.DownloadZipIdJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("String id = request.params(Basic");
            String _name_8 = artifact_1.getName();
            _builder.append(_name_8, "\t\t\t\t\t");
            _builder.append("Param.IdGet);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("Persistent artifact = RecordDB.getDefault().readOne(id, ");
            String _name_9 = artifact_1.getName();
            _builder.append(_name_9, "\t\t\t\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("List<Persistent> list = new ArrayList<Persistent>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            Object _xblockexpression_2 = null;
            {
              listServices.clear();
              _xblockexpression_2 = null;
            }
            _builder.append(_xblockexpression_2, "\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_7 = map.get(artifact_1);
              boolean _containsKey_13 = _get_7.containsKey(ServiceEnum.DOWNLOAD);
              if (_containsKey_13) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                Object _xblockexpression_3 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_8 = map.get(artifact_1);
                  ArrayList<Service> _get_9 = _get_8.get(ServiceEnum.DOWNLOAD);
                  listServices.addAll(_get_9);
                  _xblockexpression_3 = null;
                }
                _builder.append(_xblockexpression_3, "\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_8 = map.get(artifact_1);
              boolean _containsKey_14 = _get_8.containsKey(ServiceEnum.ALL);
              if (_containsKey_14) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                Object _xblockexpression_4 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_9 = map.get(artifact_1);
                  ArrayList<Service> _get_10 = _get_9.get(ServiceEnum.ALL);
                  listServices.addAll(_get_10);
                  _xblockexpression_4 = null;
                }
                _builder.append(_xblockexpression_4, "\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              for(final Service service_2 : listServices) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("service");
                String _name_10 = service_2.getName();
                _builder.append(_name_10, "\t\t\t\t\t");
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
            String _name_11 = artifact_1.getName();
            _builder.append(_name_11, "\t\t");
            _builder.append("Spark.DownloadFileIdJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("String id = request.params(Basic");
            String _name_12 = artifact_1.getName();
            _builder.append(_name_12, "\t\t\t\t\t");
            _builder.append("Param.IdGet);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("Persistent artifact = RecordDB.getDefault().readOne(id, ");
            String _name_13 = artifact_1.getName();
            _builder.append(_name_13, "\t\t\t\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("List<Persistent> list = new ArrayList<Persistent>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            {
              for(final Service service_3 : listServices) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("service");
                String _name_14 = service_3.getName();
                _builder.append(_name_14, "\t\t\t\t\t");
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
          boolean _or_9 = false;
          HashMap<ServiceEnum, ArrayList<Service>> _get_9 = map.get(artifact_1);
          boolean _containsKey_15 = _get_9.containsKey(ServiceEnum.READ);
          if (_containsKey_15) {
            _or_9 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_10 = map.get(artifact_1);
            boolean _containsKey_16 = _get_10.containsKey(ServiceEnum.ALL);
            _or_9 = _containsKey_16;
          }
          if (_or_9) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_15 = artifact_1.getName();
            _builder.append(_name_15, "\t\t");
            _builder.append("Spark.ReadIdJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("String id = request.params(Basic");
            String _name_16 = artifact_1.getName();
            _builder.append(_name_16, "\t\t\t\t\t");
            _builder.append("Param.IdGet);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("Persistent artifact = RecordDB.getDefault().readOne(id, ");
            String _name_17 = artifact_1.getName();
            _builder.append(_name_17, "\t\t\t\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("List<Persistent> list = new ArrayList<Persistent>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            Object _xblockexpression_5 = null;
            {
              listServices.clear();
              _xblockexpression_5 = null;
            }
            _builder.append(_xblockexpression_5, "\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_11 = map.get(artifact_1);
              boolean _containsKey_17 = _get_11.containsKey(ServiceEnum.READ);
              if (_containsKey_17) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                Object _xblockexpression_6 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_12 = map.get(artifact_1);
                  ArrayList<Service> _get_13 = _get_12.get(ServiceEnum.READ);
                  listServices.addAll(_get_13);
                  _xblockexpression_6 = null;
                }
                _builder.append(_xblockexpression_6, "\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_12 = map.get(artifact_1);
              boolean _containsKey_18 = _get_12.containsKey(ServiceEnum.ALL);
              if (_containsKey_18) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                Object _xblockexpression_7 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_13 = map.get(artifact_1);
                  ArrayList<Service> _get_14 = _get_13.get(ServiceEnum.ALL);
                  listServices.addAll(_get_14);
                  _xblockexpression_7 = null;
                }
                _builder.append(_xblockexpression_7, "\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              for(final Service service_4 : listServices) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("service");
                String _name_18 = service_4.getName();
                _builder.append(_name_18, "\t\t\t\t\t");
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
          boolean _or_10 = false;
          HashMap<ServiceEnum, ArrayList<Service>> _get_13 = map.get(artifact_1);
          boolean _containsKey_19 = _get_13.containsKey(ServiceEnum.UPDATE);
          if (_containsKey_19) {
            _or_10 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_14 = map.get(artifact_1);
            boolean _containsKey_20 = _get_14.containsKey(ServiceEnum.ALL);
            _or_10 = _containsKey_20;
          }
          if (_or_10) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_19 = artifact_1.getName();
            _builder.append(_name_19, "\t\t");
            _builder.append("Spark.UpdateJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("String id = request.queryParams(Basic");
            String _name_20 = artifact_1.getName();
            _builder.append(_name_20, "\t\t\t\t\t");
            _builder.append("Param.IdPost);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("Persistent artifact = RecordDB.getDefault().readOne(id, ");
            String _name_21 = artifact_1.getName();
            _builder.append(_name_21, "\t\t\t\t\t");
            _builder.append(".class);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("List<Persistent> list = new ArrayList<Persistent>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            Object _xblockexpression_8 = null;
            {
              listServices.clear();
              _xblockexpression_8 = null;
            }
            _builder.append(_xblockexpression_8, "\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_15 = map.get(artifact_1);
              boolean _containsKey_21 = _get_15.containsKey(ServiceEnum.UPDATE);
              if (_containsKey_21) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                Object _xblockexpression_9 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_16 = map.get(artifact_1);
                  ArrayList<Service> _get_17 = _get_16.get(ServiceEnum.UPDATE);
                  listServices.addAll(_get_17);
                  _xblockexpression_9 = null;
                }
                _builder.append(_xblockexpression_9, "\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_16 = map.get(artifact_1);
              boolean _containsKey_22 = _get_16.containsKey(ServiceEnum.ALL);
              if (_containsKey_22) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                Object _xblockexpression_10 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_17 = map.get(artifact_1);
                  ArrayList<Service> _get_18 = _get_17.get(ServiceEnum.ALL);
                  listServices.addAll(_get_18);
                  _xblockexpression_10 = null;
                }
                _builder.append(_xblockexpression_10, "\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              for(final Service service_5 : listServices) {
                _builder.append("\t\t");
                _builder.append("\t\t\t");
                _builder.append("service");
                String _name_22 = service_5.getName();
                _builder.append(_name_22, "\t\t\t\t\t");
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
          boolean _or_11 = false;
          HashMap<ServiceEnum, ArrayList<Service>> _get_17 = map.get(artifact_1);
          boolean _containsKey_23 = _get_17.containsKey(ServiceEnum.UPLOAD);
          if (_containsKey_23) {
            _or_11 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_18 = map.get(artifact_1);
            boolean _containsKey_24 = _get_18.containsKey(ServiceEnum.ALL);
            _or_11 = _containsKey_24;
          }
          if (_or_11) {
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("after(Basic");
            String _name_23 = artifact_1.getName();
            _builder.append(_name_23, "\t\t");
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
            _builder.append("Persistent artifact = ((Persistent)(new Gson()).fromJson(response.body(), ");
            String _name_24 = artifact_1.getName();
            _builder.append(_name_24, "\t\t\t            ");
            _builder.append(".class));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("List<Persistent> list = new ArrayList<Persistent>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            Object _xblockexpression_11 = null;
            {
              listServices.clear();
              _xblockexpression_11 = null;
            }
            _builder.append(_xblockexpression_11, "\t\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_19 = map.get(artifact_1);
              boolean _containsKey_25 = _get_19.containsKey(ServiceEnum.UPLOAD);
              if (_containsKey_25) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                Object _xblockexpression_12 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_20 = map.get(artifact_1);
                  ArrayList<Service> _get_21 = _get_20.get(ServiceEnum.UPLOAD);
                  listServices.addAll(_get_21);
                  _xblockexpression_12 = null;
                }
                _builder.append(_xblockexpression_12, "\t\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_20 = map.get(artifact_1);
              boolean _containsKey_26 = _get_20.containsKey(ServiceEnum.ALL);
              if (_containsKey_26) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                Object _xblockexpression_13 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_21 = map.get(artifact_1);
                  ArrayList<Service> _get_22 = _get_21.get(ServiceEnum.ALL);
                  listServices.addAll(_get_22);
                  _xblockexpression_13 = null;
                }
                _builder.append(_xblockexpression_13, "\t\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              for(final Service service_6 : listServices) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("service");
                String _name_25 = service_6.getName();
                _builder.append(_name_25, "\t\t\t\t\t\t");
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
          boolean _or_12 = false;
          HashMap<ServiceEnum, ArrayList<Service>> _get_21 = map.get(artifact_1);
          boolean _containsKey_27 = _get_21.containsKey(ServiceEnum.DELETE);
          if (_containsKey_27) {
            _or_12 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_22 = map.get(artifact_1);
            boolean _containsKey_28 = _get_22.containsKey(ServiceEnum.ALL);
            _or_12 = _containsKey_28;
          }
          if (_or_12) {
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("after(Basic");
            String _name_26 = artifact_1.getName();
            _builder.append(_name_26, "\t\t\t");
            _builder.append("Spark.DeleteJson, \"application/json\",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("(request, response) -> {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t            ");
            _builder.append("Persistent artifact = ((Persistent)(new Gson()).fromJson(response.body(), ");
            String _name_27 = artifact_1.getName();
            _builder.append(_name_27, "\t\t\t\t            ");
            _builder.append(".class));");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("List<Persistent> list = new ArrayList<Persistent>();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("list.add(artifact);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            Object _xblockexpression_14 = null;
            {
              listServices.clear();
              _xblockexpression_14 = null;
            }
            _builder.append(_xblockexpression_14, "\t\t\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_23 = map.get(artifact_1);
              boolean _containsKey_29 = _get_23.containsKey(ServiceEnum.DELETE);
              if (_containsKey_29) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t\t");
                Object _xblockexpression_15 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_24 = map.get(artifact_1);
                  ArrayList<Service> _get_25 = _get_24.get(ServiceEnum.DELETE);
                  listServices.addAll(_get_25);
                  _xblockexpression_15 = null;
                }
                _builder.append(_xblockexpression_15, "\t\t\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_24 = map.get(artifact_1);
              boolean _containsKey_30 = _get_24.containsKey(ServiceEnum.ALL);
              if (_containsKey_30) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t\t");
                Object _xblockexpression_16 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_25 = map.get(artifact_1);
                  ArrayList<Service> _get_26 = _get_25.get(ServiceEnum.ALL);
                  listServices.addAll(_get_26);
                  _xblockexpression_16 = null;
                }
                _builder.append(_xblockexpression_16, "\t\t\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              for(final Service service_7 : listServices) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t\t");
                _builder.append("service");
                String _name_28 = service_7.getName();
                _builder.append(_name_28, "\t\t\t\t\t\t\t");
                _builder.append(".runService(request, response, list);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("} catch (JsonSyntaxException e) {");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t\t");
            _builder.append("e.printStackTrace();");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t");
            _builder.append("});");
            _builder.newLine();
          }
        }
        {
          boolean _or_13 = false;
          HashMap<ServiceEnum, ArrayList<Service>> _get_25 = map.get(artifact_1);
          boolean _containsKey_31 = _get_25.containsKey(ServiceEnum.READ_ALL);
          if (_containsKey_31) {
            _or_13 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_26 = map.get(artifact_1);
            boolean _containsKey_32 = _get_26.containsKey(ServiceEnum.ALL);
            _or_13 = _containsKey_32;
          }
          if (_or_13) {
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
            _builder.append("Persistent[] list = (new Gson()).fromJson(response.body(), Persistent[].class);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t            ");
            _builder.append("List<Persistent> newList = new ArrayList<Persistent>(Arrays.asList(list));");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            Object _xblockexpression_17 = null;
            {
              listServices.clear();
              _xblockexpression_17 = null;
            }
            _builder.append(_xblockexpression_17, "\t\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_27 = map.get(artifact_1);
              boolean _containsKey_33 = _get_27.containsKey(ServiceEnum.READ_ALL);
              if (_containsKey_33) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                Object _xblockexpression_18 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_28 = map.get(artifact_1);
                  ArrayList<Service> _get_29 = _get_28.get(ServiceEnum.READ_ALL);
                  listServices.addAll(_get_29);
                  _xblockexpression_18 = null;
                }
                _builder.append(_xblockexpression_18, "\t\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_28 = map.get(artifact_1);
              boolean _containsKey_34 = _get_28.containsKey(ServiceEnum.ALL);
              if (_containsKey_34) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                Object _xblockexpression_19 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_29 = map.get(artifact_1);
                  ArrayList<Service> _get_30 = _get_29.get(ServiceEnum.ALL);
                  listServices.addAll(_get_30);
                  _xblockexpression_19 = null;
                }
                _builder.append(_xblockexpression_19, "\t\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              for(final Service service_8 : listServices) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("service");
                String _name_30 = service_8.getName();
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
          boolean _or_14 = false;
          HashMap<ServiceEnum, ArrayList<Service>> _get_29 = map.get(artifact_1);
          boolean _containsKey_35 = _get_29.containsKey(ServiceEnum.SEARCH);
          if (_containsKey_35) {
            _or_14 = true;
          } else {
            HashMap<ServiceEnum, ArrayList<Service>> _get_30 = map.get(artifact_1);
            boolean _containsKey_36 = _get_30.containsKey(ServiceEnum.ALL);
            _or_14 = _containsKey_36;
          }
          if (_or_14) {
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
            _builder.append("Persistent[] list = (new Gson()).fromJson(response.body(), Persistent[].class);");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t            ");
            _builder.append("List<Persistent> newList = new ArrayList<Persistent>(Arrays.asList(list));");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t\t\t\t");
            Object _xblockexpression_20 = null;
            {
              listServices.clear();
              _xblockexpression_20 = null;
            }
            _builder.append(_xblockexpression_20, "\t\t\t\t\t\t");
            _builder.newLineIfNotEmpty();
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_31 = map.get(artifact_1);
              boolean _containsKey_37 = _get_31.containsKey(ServiceEnum.SEARCH);
              if (_containsKey_37) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                Object _xblockexpression_21 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_32 = map.get(artifact_1);
                  ArrayList<Service> _get_33 = _get_32.get(ServiceEnum.SEARCH);
                  listServices.addAll(_get_33);
                  _xblockexpression_21 = null;
                }
                _builder.append(_xblockexpression_21, "\t\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              HashMap<ServiceEnum, ArrayList<Service>> _get_32 = map.get(artifact_1);
              boolean _containsKey_38 = _get_32.containsKey(ServiceEnum.ALL);
              if (_containsKey_38) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                Object _xblockexpression_22 = null;
                {
                  HashMap<ServiceEnum, ArrayList<Service>> _get_33 = map.get(artifact_1);
                  ArrayList<Service> _get_34 = _get_33.get(ServiceEnum.ALL);
                  listServices.addAll(_get_34);
                  _xblockexpression_22 = null;
                }
                _builder.append(_xblockexpression_22, "\t\t\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              for(final Service service_9 : listServices) {
                _builder.append("\t\t");
                _builder.append("\t\t\t\t");
                _builder.append("service");
                String _name_32 = service_9.getName();
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
