/**
 * generated by Xtext
 */
package miso.distil.codeGenerator.validation;

import codeGeneratorModel.AbstractEntity;
import codeGeneratorModel.Artifact;
import codeGeneratorModel.Attribute;
import codeGeneratorModel.CodeGeneratorModelPackage;
import codeGeneratorModel.Entity;
import codeGeneratorModel.Inout;
import codeGeneratorModel.MultiService;
import codeGeneratorModel.OnService;
import codeGeneratorModel.Reference;
import codeGeneratorModel.Root;
import codeGeneratorModel.Service;
import codeGeneratorModel.ServiceEnum;
import codeGeneratorModel.SimpleService;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import miso.distil.codeGenerator.generator.Names;
import miso.distil.codeGenerator.validation.AbstractRulesValidator;
import miso.distil.codeGenerator.validation.nameVariables;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * @author Carlos Carrascal
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class RulesValidator extends AbstractRulesValidator {
  public final static String LOWER_CASE = "lowerCase";
  
  public final static String UPPER_CASE = "upperCase";
  
  public final static String REPEATED_NAME = "repeatedName";
  
  public final static String INPUT_WRONG = "wrongInput";
  
  public final static String PROHIBITED_NAME = "prohibitedName";
  
  public final static String PROHIBITED_REFERENCE = "prohibitedReference";
  
  public final static String RECURSIVE_REFERENCE = "recursiveReference";
  
  public final static String ARTIFACT_TODO = "artifactToDo";
  
  public final static String SERVICE_TODO = "serviceToDo";
  
  @Inject
  private Names names;
  
  @Check
  public void chechOnService(final OnService onSer) {
    EList<ServiceEnum> _whenServices = onSer.getWhenServices();
    final Consumer<ServiceEnum> _function = (ServiceEnum it) -> {
      Artifact _artifact = onSer.getArtifact();
      EList<ServiceEnum> _basicServices = _artifact.getBasicServices();
      boolean _notEquals = (!Objects.equal(_basicServices, null));
      if (_notEquals) {
        boolean _and = false;
        Artifact _artifact_1 = onSer.getArtifact();
        EList<ServiceEnum> _basicServices_1 = _artifact_1.getBasicServices();
        boolean _contains = _basicServices_1.contains(it);
        boolean _not = (!_contains);
        if (!_not) {
          _and = false;
        } else {
          Artifact _artifact_2 = onSer.getArtifact();
          EList<ServiceEnum> _basicServices_2 = _artifact_2.getBasicServices();
          boolean _contains_1 = _basicServices_2.contains(ServiceEnum.ALL);
          boolean _not_1 = (!_contains_1);
          _and = _not_1;
        }
        if (_and) {
          Artifact _artifact_3 = onSer.getArtifact();
          String _name = _artifact_3.getName();
          String _plus = (" Artifact " + _name);
          String _plus_1 = (_plus + " does not have service ");
          String _string = it.toString();
          String _plus_2 = (_plus_1 + _string);
          String _plus_3 = (_plus_2 + " enabled");
          this.error(_plus_3, 
            CodeGeneratorModelPackage.Literals.ON_SERVICE__WHEN_SERVICES, 
            RulesValidator.PROHIBITED_REFERENCE);
        }
      }
    };
    _whenServices.forEach(_function);
  }
  
  @Check
  public void checkReferenceNotRecursive(final Entity ent) {
    EList<Attribute> _attributes = ent.getAttributes();
    for (final Attribute att : _attributes) {
      if ((att instanceof Reference)) {
        Entity _type = ((Reference)att).getType();
        EList<Attribute> _attributes_1 = _type.getAttributes();
        String _name = ent.getName();
        Boolean _lookForRepeated = this.lookForRepeated(_attributes_1, _name);
        if ((_lookForRepeated).booleanValue()) {
          String _name_1 = ((Reference)att).getName();
          String _plus = ("This entity contains " + _name_1);
          String _plus_1 = (_plus + ", who contains this entity");
          this.error(_plus_1, 
            CodeGeneratorModelPackage.Literals.ABSTRACT_ENTITY__NAME, 
            RulesValidator.RECURSIVE_REFERENCE);
        }
      }
    }
  }
  
  private Boolean lookForRepeated(final EList<Attribute> atts, final String name) {
    for (final Attribute att : atts) {
      if ((att instanceof Reference)) {
        Entity _type = ((Reference)att).getType();
        String _name = _type.getName();
        boolean _equalsIgnoreCase = _name.equalsIgnoreCase(name);
        if (_equalsIgnoreCase) {
          return Boolean.valueOf(true);
        } else {
          Entity _type_1 = ((Reference)att).getType();
          EList<Attribute> _attributes = _type_1.getAttributes();
          Boolean _lookForRepeated = this.lookForRepeated(_attributes, name);
          if ((_lookForRepeated).booleanValue()) {
            return Boolean.valueOf(true);
          }
        }
      }
    }
    return Boolean.valueOf(false);
  }
  
  @Check
  public void checkMultiServiceParameters(final MultiService mulSer) {
    boolean _and = false;
    boolean _isParallel = mulSer.isParallel();
    boolean _not = (!_isParallel);
    if (!_not) {
      _and = false;
    } else {
      EList<Service> _services = mulSer.getServices();
      boolean _isEmpty = _services.isEmpty();
      boolean _not_1 = (!_isEmpty);
      _and = _not_1;
    }
    if (_and) {
      EList<Service> _services_1 = mulSer.getServices();
      Service _get = _services_1.get(0);
      EList<Inout> out = this.getOutput(((Service) _get));
      for (int j = 1; (j < mulSer.getServices().size()); j++) {
        {
          EList<Service> _services_2 = mulSer.getServices();
          Service service = ((EList<Service>) _services_2).get(j);
          int _size = out.size();
          EList<Inout> _input = this.getInput(service);
          int _size_1 = _input.size();
          boolean _notEquals = (_size != _size_1);
          if (_notEquals) {
            String _name = service.getName();
            String _plus = ("Service " + _name);
            String _plus_1 = (_plus + " requires ");
            EList<Inout> _input_1 = this.getInput(service);
            int _size_2 = _input_1.size();
            String _plus_2 = (_plus_1 + Integer.valueOf(_size_2));
            String _plus_3 = (_plus_2 + " inputs but receives ");
            int _size_3 = out.size();
            String _plus_4 = (_plus_3 + Integer.valueOf(_size_3));
            String _plus_5 = (_plus_4 + " from ");
            EList<Service> _services_3 = mulSer.getServices();
            Service _get_1 = ((EList<Service>) _services_3).get((j - 1));
            String _name_1 = _get_1.getName();
            String _plus_6 = (_plus_5 + _name_1);
            this.error(_plus_6, 
              CodeGeneratorModelPackage.Literals.MULTI_SERVICE__SERVICES, 
              RulesValidator.INPUT_WRONG);
          }
          for (int i = 0; (i < this.getInput(service).size()); i++) {
            boolean _or = false;
            Inout _get_2 = out.get(i);
            AbstractEntity _type = _get_2.getType();
            EList<Inout> _input_2 = this.getInput(service);
            Inout _get_3 = _input_2.get(i);
            AbstractEntity _type_1 = _get_3.getType();
            boolean _equals = _type.equals(_type_1);
            boolean _not_2 = (!_equals);
            if (_not_2) {
              _or = true;
            } else {
              Inout _get_4 = out.get(i);
              boolean _isMany = _get_4.isMany();
              EList<Inout> _input_3 = this.getInput(service);
              Inout _get_5 = _input_3.get(i);
              boolean _isMany_1 = _get_5.isMany();
              boolean _equals_1 = Boolean.valueOf(_isMany).equals(Boolean.valueOf(_isMany_1));
              boolean _not_3 = (!_equals_1);
              _or = _not_3;
            }
            if (_or) {
              String _name_2 = service.getName();
              String _plus_7 = ((("Input " + Integer.valueOf(i)) + " of service ") + _name_2);
              String _plus_8 = (_plus_7 + " requires ");
              EList<Inout> _input_4 = this.getInput(service);
              Inout _get_6 = _input_4.get(i);
              AbstractEntity _type_2 = _get_6.getType();
              String _name_3 = _type_2.getName();
              String _plus_9 = (_plus_8 + _name_3);
              String _plus_10 = (_plus_9 + " and many ");
              EList<Inout> _input_5 = this.getInput(service);
              Inout _get_7 = _input_5.get(i);
              boolean _isMany_2 = _get_7.isMany();
              String _plus_11 = (_plus_10 + Boolean.valueOf(_isMany_2));
              String _plus_12 = (_plus_11 + " but ");
              Inout _get_8 = out.get(i);
              AbstractEntity _type_3 = _get_8.getType();
              String _name_4 = _type_3.getName();
              String _plus_13 = (_plus_12 + _name_4);
              String _plus_14 = (_plus_13 + " with many ");
              Inout _get_9 = out.get(i);
              boolean _isMany_3 = _get_9.isMany();
              String _plus_15 = (_plus_14 + Boolean.valueOf(_isMany_3));
              String _plus_16 = (_plus_15 + " given");
              this.error(_plus_16, 
                CodeGeneratorModelPackage.Literals.MULTI_SERVICE__SERVICES, 
                RulesValidator.INPUT_WRONG);
            }
          }
          EList<Inout> _output = this.getOutput(service);
          out = _output;
        }
      }
    }
  }
  
  private EList<Inout> getInput(final Service service) {
    if ((service instanceof SimpleService)) {
      return ((SimpleService)service).getInput();
    } else {
      if ((service instanceof MultiService)) {
        boolean _isParallel = ((MultiService)service).isParallel();
        if (_isParallel) {
          EList<Inout> input = new BasicEList<Inout>();
          EList<Service> _services = ((MultiService)service).getServices();
          for (final Service ser : ((EList<Service>) _services)) {
            EList<Inout> _input = this.getInput(ser);
            input.addAll(_input);
          }
          return input;
        } else {
          EList<Service> _services_1 = ((MultiService)service).getServices();
          Service _get = _services_1.get(0);
          return this.getInput(((Service) _get));
        }
      }
    }
    return null;
  }
  
  private EList<Inout> getOutput(final Service service) {
    if ((service instanceof SimpleService)) {
      return ((SimpleService)service).getOutput();
    } else {
      if ((service instanceof MultiService)) {
        boolean _isParallel = ((MultiService)service).isParallel();
        if (_isParallel) {
          EList<Inout> output = new BasicEList<Inout>();
          EList<Service> _services = ((MultiService)service).getServices();
          for (final Service ser : ((EList<Service>) _services)) {
            EList<Inout> _output = this.getOutput(ser);
            output.addAll(_output);
          }
          return output;
        } else {
          EList<Service> _services_1 = ((MultiService)service).getServices();
          Service _last = IterableExtensions.<Service>last(_services_1);
          return this.getOutput(((Service) _last));
        }
      }
    }
    return null;
  }
  
  @Check
  public void checkEntityStartsWithCapital(final AbstractEntity ent) {
    String _name = ent.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.error("Identifier should start with a capital", 
        CodeGeneratorModelPackage.Literals.ABSTRACT_ENTITY__NAME, 
        RulesValidator.UPPER_CASE);
    }
  }
  
  @Check
  public void checkAttributeStartsWithLower(final Attribute att) {
    String _name = att.getName();
    char _charAt = _name.charAt(0);
    boolean _isLowerCase = Character.isLowerCase(_charAt);
    boolean _not = (!_isLowerCase);
    if (_not) {
      this.error("Identifier should start with a low case", 
        CodeGeneratorModelPackage.Literals.ATTRIBUTE__NAME, 
        RulesValidator.LOWER_CASE);
    }
  }
  
  @Check
  public void checkServiceStartsWithCapital(final Service ser) {
    String _name = ser.getName();
    char _charAt = _name.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.error("Identifier should start with a capital", 
        CodeGeneratorModelPackage.Literals.SERVICE__NAME, 
        RulesValidator.UPPER_CASE);
    }
  }
  
  @Check
  public void checkUniqueNames(final Root root) {
    final List<String> names = new ArrayList<String>();
    EList<Artifact> _artifacts = root.getArtifacts();
    final Consumer<Artifact> _function = (Artifact it) -> {
      String _name = it.getName();
      String _lowerCase = _name.toLowerCase();
      boolean _contains = names.contains(_lowerCase);
      if (_contains) {
        String _name_1 = it.getName();
        String _plus = ("Name " + _name_1);
        String _plus_1 = (_plus + " is repeated");
        this.error(_plus_1, it, 
          CodeGeneratorModelPackage.Literals.ABSTRACT_ENTITY__NAME, 
          RulesValidator.REPEATED_NAME);
      } else {
        String _name_2 = it.getName();
        String _lowerCase_1 = _name_2.toLowerCase();
        names.add(_lowerCase_1);
      }
      EList<Attribute> _attributes = it.getAttributes();
      final Consumer<Attribute> _function_1 = (Attribute it_1) -> {
        String _name_3 = it_1.getName();
        String _lowerCase_2 = _name_3.toLowerCase();
        boolean _contains_1 = names.contains(_lowerCase_2);
        if (_contains_1) {
          String _name_4 = it_1.getName();
          String _plus_2 = ("Name " + _name_4);
          String _plus_3 = (_plus_2 + " is repeated");
          this.error(_plus_3, it_1, 
            CodeGeneratorModelPackage.Literals.ATTRIBUTE__NAME, 
            RulesValidator.REPEATED_NAME);
        } else {
          String _name_5 = it_1.getName();
          String _lowerCase_3 = _name_5.toLowerCase();
          names.add(_lowerCase_3);
        }
      };
      ((EList<Attribute>) _attributes).forEach(_function_1);
    };
    ((EList<Artifact>) _artifacts).forEach(_function);
    EList<Entity> _entities = root.getEntities();
    final Consumer<Entity> _function_1 = (Entity it) -> {
      String _name = it.getName();
      String _lowerCase = _name.toLowerCase();
      boolean _contains = names.contains(_lowerCase);
      if (_contains) {
        String _name_1 = it.getName();
        String _plus = ("Name " + _name_1);
        String _plus_1 = (_plus + " is repeated");
        this.error(_plus_1, it, 
          CodeGeneratorModelPackage.Literals.ABSTRACT_ENTITY__NAME, 
          RulesValidator.REPEATED_NAME);
      } else {
        String _name_2 = it.getName();
        String _lowerCase_1 = _name_2.toLowerCase();
        names.add(_lowerCase_1);
      }
      EList<Attribute> _attributes = it.getAttributes();
      final Consumer<Attribute> _function_2 = (Attribute it_1) -> {
        String _name_3 = it_1.getName();
        String _lowerCase_2 = _name_3.toLowerCase();
        boolean _contains_1 = names.contains(_lowerCase_2);
        if (_contains_1) {
          String _name_4 = it_1.getName();
          String _plus_2 = ("Name " + _name_4);
          String _plus_3 = (_plus_2 + " is repeated");
          this.error(_plus_3, it_1, 
            CodeGeneratorModelPackage.Literals.ATTRIBUTE__NAME, 
            RulesValidator.REPEATED_NAME);
        } else {
          String _name_5 = it_1.getName();
          String _lowerCase_3 = _name_5.toLowerCase();
          names.add(_lowerCase_3);
        }
      };
      ((EList<Attribute>) _attributes).forEach(_function_2);
    };
    ((EList<Entity>) _entities).forEach(_function_1);
    EList<Service> _services = root.getServices();
    final Consumer<Service> _function_2 = (Service it) -> {
      String _name = it.getName();
      String _lowerCase = _name.toLowerCase();
      boolean _contains = names.contains(_lowerCase);
      if (_contains) {
        String _name_1 = it.getName();
        String _plus = ("Name " + _name_1);
        String _plus_1 = (_plus + " is repeated");
        this.error(_plus_1, it, 
          CodeGeneratorModelPackage.Literals.SERVICE__NAME, 
          RulesValidator.REPEATED_NAME);
      } else {
        String _name_2 = it.getName();
        String _lowerCase_1 = _name_2.toLowerCase();
        names.add(_lowerCase_1);
      }
    };
    ((EList<Service>) _services).forEach(_function_2);
  }
  
  @Check
  public void checkNamesEntityNotProhibited(final AbstractEntity ent) {
    final Consumer<String> _function = (String it) -> {
      String _name = ent.getName();
      boolean _equalsIgnoreCase = _name.equalsIgnoreCase(it);
      if (_equalsIgnoreCase) {
        String _name_1 = ent.getName();
        String _plus = ("Name " + _name_1);
        String _plus_1 = (_plus + " is prohibited");
        this.error(_plus_1, 
          CodeGeneratorModelPackage.Literals.ABSTRACT_ENTITY__NAME, 
          RulesValidator.PROHIBITED_NAME);
      }
    };
    nameVariables.prohibitedNames.forEach(_function);
  }
  
  @Check
  public void checkNamesAttributeNotProhibited(final Attribute att) {
    final Consumer<String> _function = (String it) -> {
      String _name = att.getName();
      boolean _equalsIgnoreCase = _name.equalsIgnoreCase(it);
      if (_equalsIgnoreCase) {
        String _name_1 = att.getName();
        String _plus = ("Name " + _name_1);
        String _plus_1 = (_plus + " is prohibited");
        this.error(_plus_1, 
          CodeGeneratorModelPackage.Literals.ATTRIBUTE__NAME, 
          RulesValidator.PROHIBITED_NAME);
      }
    };
    nameVariables.prohibitedNames.forEach(_function);
  }
  
  @Check
  public void checkNamesServiceNotProhibited(final Service ser) {
    final Consumer<String> _function = (String it) -> {
      String _name = ser.getName();
      boolean _equalsIgnoreCase = _name.equalsIgnoreCase(it);
      if (_equalsIgnoreCase) {
        String _name_1 = ser.getName();
        String _plus = ("Name " + _name_1);
        String _plus_1 = (_plus + " is prohibited");
        this.error(_plus_1, 
          CodeGeneratorModelPackage.Literals.SERVICE__NAME, 
          RulesValidator.PROHIBITED_NAME);
      }
    };
    nameVariables.prohibitedNames.forEach(_function);
  }
  
  @Check
  public void checkToDo(final Artifact artifact) {
    try {
      boolean _or = false;
      boolean _or_1 = false;
      EList<ServiceEnum> _basicServices = artifact.getBasicServices();
      boolean _contains = _basicServices.contains(ServiceEnum.UPDATE);
      if (_contains) {
        _or_1 = true;
      } else {
        EList<ServiceEnum> _basicServices_1 = artifact.getBasicServices();
        boolean _contains_1 = _basicServices_1.contains(ServiceEnum.UPLOAD);
        _or_1 = _contains_1;
      }
      if (_or_1) {
        _or = true;
      } else {
        EList<ServiceEnum> _basicServices_2 = artifact.getBasicServices();
        boolean _contains_2 = _basicServices_2.contains(ServiceEnum.ALL);
        _or = _contains_2;
      }
      if (_or) {
        Resource _eResource = artifact.eResource();
        URI _uRI = _eResource.getURI();
        final String platformString = _uRI.toPlatformString(true);
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot _root = _workspace.getRoot();
        Path _path = new Path(platformString);
        final IFile rules_file = _root.getFile(_path);
        final IProject project = rules_file.getProject();
        String _artifactJsonFileStri = this.names.getArtifactJsonFileStri(artifact);
        String _plus = ("src/main/java/" + _artifactJsonFileStri);
        String _plus_1 = (_plus + ".java");
        Path _path_1 = new Path(_plus_1);
        final IFile file_json = project.getFile(_path_1);
        boolean _exists = file_json.exists();
        if (_exists) {
          InputStream _contents = file_json.getContents();
          final Scanner scanner = new Scanner(_contents);
          int lineNumber = 0;
          while (scanner.hasNextLine()) {
            {
              final String line = scanner.nextLine();
              lineNumber++;
              boolean _contains_3 = line.contains("TODO");
              if (_contains_3) {
                String _artifactJsonFileStri_1 = this.names.getArtifactJsonFileStri(artifact);
                String _plus_2 = ("You need to complete Update or Upload methods on package " + _artifactJsonFileStri_1);
                String _plus_3 = (_plus_2 + " line ");
                String _plus_4 = (_plus_3 + Integer.valueOf(lineNumber));
                this.warning(_plus_4, 
                  CodeGeneratorModelPackage.Literals.ABSTRACT_ENTITY__NAME, 
                  RulesValidator.ARTIFACT_TODO);
              }
            }
          }
          scanner.close();
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Check
  public void checkToDo(final SimpleService service) {
    try {
      Resource _eResource = service.eResource();
      URI _uRI = _eResource.getURI();
      final String platformString = _uRI.toPlatformString(true);
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = _workspace.getRoot();
      Path _path = new Path(platformString);
      final IFile rules_file = _root.getFile(_path);
      final IProject project = rules_file.getProject();
      String _serviceFileStri = this.names.getServiceFileStri(service);
      String _plus = ("src/main/java/" + _serviceFileStri);
      String _plus_1 = (_plus + ".java");
      Path _path_1 = new Path(_plus_1);
      final IFile file_json = project.getFile(_path_1);
      boolean _exists = file_json.exists();
      if (_exists) {
        InputStream _contents = file_json.getContents();
        final Scanner scanner = new Scanner(_contents);
        int lineNumber = 0;
        while (scanner.hasNextLine()) {
          {
            final String line = scanner.nextLine();
            lineNumber++;
            boolean _contains = line.contains("TODO");
            if (_contains) {
              String _serviceFileStri_1 = this.names.getServiceFileStri(service);
              String _plus_2 = ("You need to complete Update or Upload methods on package " + _serviceFileStri_1);
              String _plus_3 = (_plus_2 + " line ");
              String _plus_4 = (_plus_3 + Integer.valueOf(lineNumber));
              this.warning(_plus_4, 
                CodeGeneratorModelPackage.Literals.SERVICE__NAME, 
                RulesValidator.SERVICE_TODO);
            }
          }
        }
        scanner.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
