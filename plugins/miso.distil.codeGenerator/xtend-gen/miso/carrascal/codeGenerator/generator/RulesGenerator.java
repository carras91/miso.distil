/**
 * generated by Xtext
 */
package miso.carrascal.codeGenerator.generator;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.Entity;
import codeGeneratorModel.MultiService;
import codeGeneratorModel.Root;
import codeGeneratorModel.Service;
import codeGeneratorModel.ServiceEnum;
import codeGeneratorModel.SimpleService;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import miso.carrascal.codeGenerator.generator.GeneratorOutputConfiguration;
import miso.carrascal.codeGenerator.generator.basic.generateBasicCodes;
import miso.carrascal.codeGenerator.generator.basic.generateBasicParam;
import miso.carrascal.codeGenerator.generator.basic.generateBasicSpark;
import miso.carrascal.codeGenerator.generator.custom.generateCustomDB;
import miso.carrascal.codeGenerator.generator.custom.generateCustomHtml;
import miso.carrascal.codeGenerator.generator.custom.generateJson;
import miso.carrascal.codeGenerator.generator.entities.generateArtifactClass;
import miso.carrascal.codeGenerator.generator.entities.generateEntityClass;
import miso.carrascal.codeGenerator.generator.entities.generateMain;
import miso.carrascal.codeGenerator.generator.html.generateHtmlJson;
import miso.carrascal.codeGenerator.generator.html.generateHtmlLinks;
import miso.carrascal.codeGenerator.generator.html.generateHtmlSpark;
import miso.carrascal.codeGenerator.generator.html.generateHtmlView;
import miso.carrascal.codeGenerator.generator.packages;
import miso.carrascal.codeGenerator.generator.services.generateMultiService;
import miso.carrascal.codeGenerator.generator.services.generateServicesSpark;
import miso.carrascal.codeGenerator.generator.services.generateSimpleService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * This class contains custom generation rules.
 * 
 * @author Carlos Carrascal
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RulesGenerator implements IGenerator {
  @Inject
  private packages pack;
  
  @Inject
  private generateMain genMain;
  
  @Inject
  private generateCustomDB genCusDB;
  
  @Inject
  private generateJson genJso;
  
  @Inject
  private generateArtifactClass genArtifact;
  
  @Inject
  private generateEntityClass genEnti;
  
  @Inject
  private generateBasicCodes genBasCod;
  
  @Inject
  private generateBasicSpark genBasSpa;
  
  @Inject
  private generateBasicParam genBasPar;
  
  @Inject
  private generateHtmlSpark genHtmSpa;
  
  @Inject
  private generateHtmlJson genHtmJso;
  
  @Inject
  private generateHtmlLinks genHtmLin;
  
  @Inject
  private generateHtmlView genHtmVie;
  
  @Inject
  private generateMultiService genMulSer;
  
  @Inject
  private generateSimpleService genSimSer;
  
  @Inject
  private generateServicesSpark genSerSpa;
  
  @Inject
  private generateCustomHtml genCusHtm;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CharSequence _write = this.genMain.write();
    fsa.generateFile(
      (this.pack.RootStri + "/Main.java"), _write);
    CharSequence _write_1 = this.genCusDB.write();
    fsa.generateFile(
      (this.pack.RootStri + "/CustomDB.java"), 
      GeneratorOutputConfiguration.GEN_ONCE_OUTPUT, _write_1);
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Entity> _filter = Iterators.<Entity>filter(_allContents, Entity.class);
    final Procedure1<Entity> _function = (Entity it) -> {
      String _name = it.getName();
      String _plus = ((this.pack.EntitiesStr + "/") + _name);
      String _plus_1 = (_plus + ".java");
      CharSequence _write_2 = this.genEnti.write(it);
      fsa.generateFile(_plus_1, _write_2);
    };
    IteratorExtensions.<Entity>forEach(_filter, _function);
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<SimpleService> _filter_1 = Iterators.<SimpleService>filter(_allContents_1, SimpleService.class);
    final Procedure1<SimpleService> _function_1 = (SimpleService it) -> {
      String _name = it.getName();
      String _plus = (((this.pack.ServicesStr + "/") + "Service") + _name);
      String _plus_1 = (_plus + ".java");
      CharSequence _write_2 = this.genSimSer.write(it);
      fsa.generateFile(_plus_1, 
        GeneratorOutputConfiguration.GEN_ONCE_OUTPUT, _write_2);
    };
    IteratorExtensions.<SimpleService>forEach(_filter_1, _function_1);
    TreeIterator<EObject> _allContents_2 = resource.getAllContents();
    Iterator<MultiService> _filter_2 = Iterators.<MultiService>filter(_allContents_2, MultiService.class);
    final Procedure1<MultiService> _function_2 = (MultiService it) -> {
      String _name = it.getName();
      String _plus = (((this.pack.ServicesStr + "/") + "Service") + _name);
      String _plus_1 = (_plus + ".java");
      CharSequence _write_2 = this.genMulSer.write(it);
      fsa.generateFile(_plus_1, _write_2);
    };
    IteratorExtensions.<MultiService>forEach(_filter_2, _function_2);
    TreeIterator<EObject> _allContents_3 = resource.getAllContents();
    Iterator<Root> _filter_3 = Iterators.<Root>filter(_allContents_3, Root.class);
    Root _last = IteratorExtensions.<Root>last(_filter_3);
    EList _services = _last.getServices();
    boolean _isEmpty = _services.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      TreeIterator<EObject> _allContents_4 = resource.getAllContents();
      Iterator<Root> _filter_4 = Iterators.<Root>filter(_allContents_4, Root.class);
      Root _last_1 = IteratorExtensions.<Root>last(_filter_4);
      EList _services_1 = _last_1.getServices();
      CharSequence _write_2 = this.genSerSpa.write(((EList<Service>) _services_1));
      fsa.generateFile(
        ((this.pack.ServicesStr + "/") + "ServicesSpark.java"), _write_2);
    }
    TreeIterator<EObject> _allContents_5 = resource.getAllContents();
    Iterator<Root> _filter_5 = Iterators.<Root>filter(_allContents_5, Root.class);
    Root _last_2 = IteratorExtensions.<Root>last(_filter_5);
    EList _artifacts = _last_2.getArtifacts();
    for (final Artifact artifact : ((EList<Artifact>) _artifacts)) {
      {
        String _artifactStri = this.pack.getArtifactStri(artifact);
        String packageArtifact = (_artifactStri + "/");
        String _basicStri = this.pack.getBasicStri(artifact);
        String _plus = (_basicStri + "/Basic");
        String _name = artifact.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        String packageBasic = (_plus + _firstUpper);
        String _htmlStri = this.pack.getHtmlStri(artifact);
        String _plus_1 = (_htmlStri + "/Html");
        String _name_1 = artifact.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        String packageHtml = (_plus_1 + _firstUpper_1);
        String _name_2 = artifact.getName();
        String _plus_2 = (packageArtifact + _name_2);
        String _plus_3 = (_plus_2 + ".java");
        CharSequence _write_3 = this.genArtifact.write(artifact);
        fsa.generateFile(_plus_3, _write_3);
        EList _basicServices = artifact.getBasicServices();
        boolean _isEmpty_1 = _basicServices.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          String _name_3 = artifact.getName();
          String _plus_4 = (packageArtifact + _name_3);
          String _plus_5 = (_plus_4 + "Json.java");
          CharSequence _write_4 = this.genJso.write(artifact);
          fsa.generateFile(_plus_5, 
            GeneratorOutputConfiguration.GEN_ONCE_OUTPUT, _write_4);
        }
        boolean _or = false;
        boolean _or_1 = false;
        boolean _or_2 = false;
        boolean _or_3 = false;
        EList _basicServices_1 = artifact.getBasicServices();
        boolean _contains = _basicServices_1.contains(ServiceEnum.READ_LITERAL);
        if (_contains) {
          _or_3 = true;
        } else {
          EList _basicServices_2 = artifact.getBasicServices();
          boolean _contains_1 = _basicServices_2.contains(ServiceEnum.READ_ALL_LITERAL);
          _or_3 = _contains_1;
        }
        if (_or_3) {
          _or_2 = true;
        } else {
          EList _basicServices_3 = artifact.getBasicServices();
          boolean _contains_2 = _basicServices_3.contains(ServiceEnum.UPDATE_LITERAL);
          _or_2 = _contains_2;
        }
        if (_or_2) {
          _or_1 = true;
        } else {
          EList _basicServices_4 = artifact.getBasicServices();
          boolean _contains_3 = _basicServices_4.contains(ServiceEnum.UPLOAD_LITERAL);
          _or_1 = _contains_3;
        }
        if (_or_1) {
          _or = true;
        } else {
          EList _basicServices_5 = artifact.getBasicServices();
          boolean _contains_4 = _basicServices_5.contains(ServiceEnum.SEARCH_LITERAL);
          _or = _contains_4;
        }
        if (_or) {
          String _name_4 = artifact.getName();
          String _plus_6 = ((packageArtifact + "Custom") + _name_4);
          String _plus_7 = (_plus_6 + "Html.java");
          CharSequence _write_5 = this.genCusHtm.write(artifact);
          fsa.generateFile(_plus_7, 
            GeneratorOutputConfiguration.GEN_ONCE_OUTPUT, _write_5);
        }
        EList _basicServices_6 = artifact.getBasicServices();
        boolean _isEmpty_2 = _basicServices_6.isEmpty();
        boolean _not_2 = (!_isEmpty_2);
        if (_not_2) {
          CharSequence _write_6 = this.genBasSpa.write(artifact);
          fsa.generateFile(
            (packageBasic + "Spark.java"), _write_6);
          CharSequence _write_7 = this.genBasCod.write(artifact);
          fsa.generateFile(
            (packageBasic + "Codes.java"), _write_7);
          CharSequence _write_8 = this.genBasPar.write(artifact);
          fsa.generateFile(
            (packageBasic + "Param.java"), _write_8);
        }
        boolean _or_4 = false;
        boolean _or_5 = false;
        boolean _or_6 = false;
        boolean _or_7 = false;
        EList _basicServices_7 = artifact.getBasicServices();
        boolean _contains_5 = _basicServices_7.contains(ServiceEnum.READ_LITERAL);
        if (_contains_5) {
          _or_7 = true;
        } else {
          EList _basicServices_8 = artifact.getBasicServices();
          boolean _contains_6 = _basicServices_8.contains(ServiceEnum.READ_ALL_LITERAL);
          _or_7 = _contains_6;
        }
        if (_or_7) {
          _or_6 = true;
        } else {
          EList _basicServices_9 = artifact.getBasicServices();
          boolean _contains_7 = _basicServices_9.contains(ServiceEnum.UPDATE_LITERAL);
          _or_6 = _contains_7;
        }
        if (_or_6) {
          _or_5 = true;
        } else {
          EList _basicServices_10 = artifact.getBasicServices();
          boolean _contains_8 = _basicServices_10.contains(ServiceEnum.UPLOAD_LITERAL);
          _or_5 = _contains_8;
        }
        if (_or_5) {
          _or_4 = true;
        } else {
          EList _basicServices_11 = artifact.getBasicServices();
          boolean _contains_9 = _basicServices_11.contains(ServiceEnum.SEARCH_LITERAL);
          _or_4 = _contains_9;
        }
        if (_or_4) {
          CharSequence _write_9 = this.genHtmSpa.write(artifact);
          fsa.generateFile(
            (packageHtml + "Spark.java"), _write_9);
          CharSequence _write_10 = this.genHtmVie.write(artifact);
          fsa.generateFile(
            (packageHtml + "View.java"), _write_10);
          CharSequence _write_11 = this.genHtmJso.write(artifact);
          fsa.generateFile(
            (packageHtml + "Json.java"), _write_11);
        }
        boolean _or_8 = false;
        boolean _or_9 = false;
        boolean _or_10 = false;
        EList _basicServices_12 = artifact.getBasicServices();
        boolean _contains_10 = _basicServices_12.contains(ServiceEnum.READ_LITERAL);
        if (_contains_10) {
          _or_10 = true;
        } else {
          EList _basicServices_13 = artifact.getBasicServices();
          boolean _contains_11 = _basicServices_13.contains(ServiceEnum.DOWNLOAD_LITERAL);
          _or_10 = _contains_11;
        }
        if (_or_10) {
          _or_9 = true;
        } else {
          EList _basicServices_14 = artifact.getBasicServices();
          boolean _contains_12 = _basicServices_14.contains(ServiceEnum.UPDATE_LITERAL);
          _or_9 = _contains_12;
        }
        if (_or_9) {
          _or_8 = true;
        } else {
          EList _basicServices_15 = artifact.getBasicServices();
          boolean _contains_13 = _basicServices_15.contains(ServiceEnum.UPLOAD_LITERAL);
          _or_8 = _contains_13;
        }
        if (_or_8) {
          CharSequence _write_12 = this.genHtmLin.write(artifact);
          fsa.generateFile(
            (packageHtml + "Links.java"), _write_12);
        }
      }
    }
  }
}
