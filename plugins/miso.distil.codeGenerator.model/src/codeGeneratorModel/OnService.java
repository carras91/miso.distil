/**
 */
package codeGeneratorModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codeGeneratorModel.OnService#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link codeGeneratorModel.OnService#getWhenServices <em>When Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getOnService()
 * @model
 * @generated
 */
public interface OnService extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' reference.
	 * @see #setArtifact(Artifact)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getOnService_Artifact()
	 * @model keys="name" required="true"
	 * @generated
	 */
	Artifact getArtifact();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.OnService#getArtifact <em>Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' reference.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(Artifact value);

	/**
	 * Returns the value of the '<em><b>When Services</b></em>' attribute list.
	 * The list contents are of type {@link codeGeneratorModel.ServiceEnum}.
	 * The literals are from the enumeration {@link codeGeneratorModel.ServiceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Services</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Services</em>' attribute list.
	 * @see codeGeneratorModel.ServiceEnum
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getOnService_WhenServices()
	 * @model default="upload" dataType="codeGeneratorModel.ServiceEnum" required="true"
	 * @generated
	 */
	EList getWhenServices();

} // OnService
