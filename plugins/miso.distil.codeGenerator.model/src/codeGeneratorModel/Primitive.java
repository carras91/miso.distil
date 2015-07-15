/**
 */
package codeGeneratorModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codeGeneratorModel.Primitive#getType <em>Type</em>}</li>
 *   <li>{@link codeGeneratorModel.Primitive#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getPrimitive()
 * @model
 * @generated
 */
public interface Primitive extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * The literals are from the enumeration {@link codeGeneratorModel.DataEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see codeGeneratorModel.DataEnum
	 * @see #setType(DataEnum)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getPrimitive_Type()
	 * @model default="String" required="true"
	 * @generated
	 */
	DataEnum getType();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.Primitive#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see codeGeneratorModel.DataEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(DataEnum value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getPrimitive_Required()
	 * @model default="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.Primitive#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

} // Primitive
