/**
 */
package codeGeneratorModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codeGeneratorModel.ArtifactID#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getArtifactID()
 * @model
 * @generated
 */
public interface ArtifactID extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Artifact)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getArtifactID_Type()
	 * @model required="true"
	 * @generated
	 */
	Artifact getType();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.ArtifactID#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Artifact value);

} // ArtifactID
