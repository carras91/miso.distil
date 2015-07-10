/**
 */
package codeGeneratorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codeGeneratorModel.Artifact#getExtension <em>Extension</em>}</li>
 *   <li>{@link codeGeneratorModel.Artifact#getFormat <em>Format</em>}</li>
 *   <li>{@link codeGeneratorModel.Artifact#getBasicServices <em>Basic Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends AbstractEntity {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getArtifact_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.Artifact#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link codeGeneratorModel.FormatEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see codeGeneratorModel.FormatEnum
	 * @see #setFormat(FormatEnum)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getArtifact_Format()
	 * @model
	 * @generated
	 */
	FormatEnum getFormat();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.Artifact#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see codeGeneratorModel.FormatEnum
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatEnum value);

	/**
	 * Returns the value of the '<em><b>Basic Services</b></em>' attribute list.
	 * The list contents are of type {@link codeGeneratorModel.ServiceEnum}.
	 * The literals are from the enumeration {@link codeGeneratorModel.ServiceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Services</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Services</em>' attribute list.
	 * @see codeGeneratorModel.ServiceEnum
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getArtifact_BasicServices()
	 * @model default="readAll" upper="6"
	 * @generated
	 */
	EList<ServiceEnum> getBasicServices();

} // Artifact
