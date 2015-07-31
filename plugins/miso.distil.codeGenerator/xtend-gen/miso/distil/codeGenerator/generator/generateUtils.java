package miso.distil.codeGenerator.generator;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.List;
import miso.distil.codeGenerator.generator.Names;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Pair;

/**
 * Some methos used everywhere.
 * 
 * @author Carlos Carrascal.
 */
@SuppressWarnings("all")
public class generateUtils {
  @Inject
  private Names pack;
  
  private /* HashMap<Artifact, List<Pair<Attribute, List<String>>>> */Object nestedTree /* Skipped initializer because of errors */;
  
  /**
   * To write the chain ".getX().getY()..." from the attribute number "pos" in artifact.
   * 
   * @param pos the position.
   * @param artifact the artifact.
   */
  public String getNestedGets(final Integer pos, final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nnestedTree cannot be resolved"
      + "\nget cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nnestedTree cannot be resolved"
      + "\nget cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nname cannot be resolved"
      + "\nget cannot be resolved"
      + "\nequals cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ntoFirstUpper cannot be resolved");
  }
  
  /**
   * To write a string "att1, att2, att3, ..." from the attributes inside the reference number pos in artifact.
   * 
   * @param pos the position.
   * @param artifact the artifact.
   */
  public String getNestedAtt(final Integer pos, final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nReference cannot be resolved to a type."
      + "\nAttribute cannot be resolved to a type."
      + "\nnestedTree cannot be resolved"
      + "\nget cannot be resolved"
      + "\nkey cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nattributes cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * To get an attribute name by his position inside nestedTree (separated by _).
   * 
   * @param pos the position.
   * @param artifact the artifact.
   */
  public Object getNewAttName(final Integer pos, final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nnestedTree cannot be resolved"
      + "\nget cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nname cannot be resolved"
      + "\nnestedTree cannot be resolved"
      + "\nget cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nreverseView cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n! cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ntoLowerCase cannot be resolved");
  }
  
  /**
   * To get an attribute name by his position inside nestedTree (separated by .).
   * 
   * @param pos the position.
   * @param artifact the artifact.
   */
  public String getNewAttNameByPoint(final Integer pos, final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nnestedTree cannot be resolved"
      + "\nget cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nget cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\nnestedTree cannot be resolved"
      + "\nget cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * To get an attribute name.
   * 
   * @param att the attribute.
   * @param artifact the artifact.
   */
  public Object getNewAttName(final /* Attribute */Object att, final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nnestedTree cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nkey cannot be resolved"
      + "\nname cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nreverseView cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n! cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ntoLowerCase cannot be resolved");
  }
  
  /**
   * To fill nestedTree and return artifact's attributes information.
   * 
   * @param artifact the artifact.
   */
  private /* List<Pair<Attribute, List<String>>> */Object getNestedTree(final /* Artifact */Object artifact) {
    throw new Error("Unresolved compilation problems:"
      + "\nAttribute cannot be resolved to a type."
      + "\nReference cannot be resolved to a type."
      + "\nattributes cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nname cannot be resolved"
      + "\ngetNested cannot be resolved");
  }
  
  /**
   * To get for each attribute his path in an ascendent way (recursive).
   * 
   * @param att the reference.
   * @param parent the path.
   */
  private /* List<Pair<Attribute, List<String>>> */Object getNested(final /* Reference */Object att, final List<String> parent) {
    throw new Error("Unresolved compilation problems:"
      + "\nAttribute cannot be resolved to a type."
      + "\nReference cannot be resolved to a type."
      + "\ntype cannot be resolved"
      + "\nattributes cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nname cannot be resolved"
      + "\ngetNested cannot be resolved");
  }
  
  /**
   * To write "import java.util.List;" if needed.
   * 
   * @param atts list of attributes.
   */
  public CharSequence getImportList(final /* EList<Attribute> */Object atts) {
    throw new Error("Unresolved compilation problems:"
      + "\ntypeName cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n&& cannot be resolved");
  }
  
  /**
   * To write entities imports from atts.
   * 
   * @param atts list of attributes.
   */
  public CharSequence getImportCompose(final /* EList<Attribute> */Object atts) {
    throw new Error("Unresolved compilation problems:"
      + "\nReference cannot be resolved to a type."
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * To get a list of nested attributes (primitive and reference) (recursive).
   * 
   * @param atts list of attributes.
   */
  public /* EList<Attribute> */Object getAllNestedAttributes(final /* EList<Attribute> */Object atts) {
    throw new Error("Unresolved compilation problems:"
      + "\nAttribute cannot be resolved to a type."
      + "\nAttribute cannot be resolved to a type."
      + "\nReference cannot be resolved to a type."
      + "\ntype cannot be resolved"
      + "\nattributes cannot be resolved"
      + "\nallNestedAttributes cannot be resolved");
  }
  
  /**
   * To get a list of nested attributes (but not references) (recursive).
   * 
   * @param atts list of attributes.
   */
  public /* EList<Attribute> */Object getNestedAttributes(final /* Attribute */Object att) {
    throw new Error("Unresolved compilation problems:"
      + "\nAttribute cannot be resolved to a type."
      + "\nAttribute cannot be resolved to a type."
      + "\nPrimitive cannot be resolved to a type."
      + "\nArtifactID cannot be resolved to a type."
      + "\nReference cannot be resolved to a type."
      + "\ntype cannot be resolved"
      + "\nattributes cannot be resolved"
      + "\nforEach cannot be resolved");
  }
  
  /**
   * To write the class name of att.
   * 
   * @param att the attribute.
   */
  public CharSequence getTypeName(final /* Attribute */Object att) {
    throw new Error("Unresolved compilation problems:"
      + "\nReference cannot be resolved to a type."
      + "\nPrimitive cannot be resolved to a type."
      + "\nPrimitive cannot be resolved to a type."
      + "\nmany cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nmany cannot be resolved");
  }
  
  /**
   * To write private attributes.
   * 
   * @param atts list of attributes.
   */
  public CharSequence getPrivateAttributes(final /* EList<Attribute> */Object atts) {
    throw new Error("Unresolved compilation problems:"
      + "\ntypeName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * To write getters and setters.
   * 
   * @param atts list of attributes.
   */
  public CharSequence getGetSetAtt(final /* EList<Attribute> */Object atts) {
    throw new Error("Unresolved compilation problems:"
      + "\nPrimitive cannot be resolved to a type."
      + "\nReference cannot be resolved to a type."
      + "\nThe method or field DataEnum is undefined for the type generateUtils"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntypeName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntoFirstUpper cannot be resolved"
      + "\ntypeName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\nequals cannot be resolved"
      + "\nSTRING cannot be resolved"
      + "\nmany cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nmany cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Process ServiceEnum.ALL.
   * 
   * @param services the services.
   */
  public /* EList<ServiceEnum> */Object processBasicServices(final /* EList<ServiceEnum> */Object services) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ServiceEnum is undefined for the type generateUtils"
      + "\nThe method or field ServiceEnum is undefined for the type generateUtils"
      + "\nThe method or field ServiceEnum is undefined for the type generateUtils"
      + "\nThe method or field ServiceEnum is undefined for the type generateUtils"
      + "\nThe method or field ServiceEnum is undefined for the type generateUtils"
      + "\nThe method or field ServiceEnum is undefined for the type generateUtils"
      + "\nThe method or field ServiceEnum is undefined for the type generateUtils"
      + "\nThe method or field ServiceEnum is undefined for the type generateUtils"
      + "\nALL cannot be resolved"
      + "\nUPLOAD cannot be resolved"
      + "\nDOWNLOAD cannot be resolved"
      + "\nUPDATE cannot be resolved"
      + "\nREAD cannot be resolved"
      + "\nREAD_ALL cannot be resolved"
      + "\nSEARCH cannot be resolved"
      + "\nDELETE cannot be resolved");
  }
  
  /**
   * To write toString method.
   * 
   * @param atts list of attributes.
   */
  public CharSequence getToStringAtts(final /* EList<Attribute> */Object atts) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nequals cannot be resolved");
  }
}
