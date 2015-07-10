/**
 */
package codeGeneratorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codeGeneratorModel.Root#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link codeGeneratorModel.Root#getEntities <em>Entities</em>}</li>
 *   <li>{@link codeGeneratorModel.Root#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link codeGeneratorModel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getRoot_Artifacts()
	 * @model containment="true" keys="name" required="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link codeGeneratorModel.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getRoot_Entities()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link codeGeneratorModel.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getRoot_Services()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Service> getServices();

} // Root
