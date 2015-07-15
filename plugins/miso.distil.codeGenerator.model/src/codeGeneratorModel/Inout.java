/**
 */
package codeGeneratorModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codeGeneratorModel.Inout#isMany <em>Many</em>}</li>
 *   <li>{@link codeGeneratorModel.Inout#getType <em>Type</em>}</li>
 *   <li>{@link codeGeneratorModel.Inout#getCompatibility <em>Compatibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getInout()
 * @model
 * @generated
 */
public interface Inout extends EObject {
	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getInout_Many()
	 * @model default="false"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.Inout#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(AbstractEntity)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getInout_Type()
	 * @model required="true"
	 * @generated
	 */
	AbstractEntity getType();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.Inout#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractEntity value);

	/**
	 * Returns the value of the '<em><b>Compatibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatibility</em>' attribute.
	 * @see #setCompatibility(String)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getInout_Compatibility()
	 * @model
	 * @generated
	 */
	String getCompatibility();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.Inout#getCompatibility <em>Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compatibility</em>' attribute.
	 * @see #getCompatibility()
	 * @generated
	 */
	void setCompatibility(String value);

} // Inout
