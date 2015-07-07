/**
 */
package codeGeneratorModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codeGeneratorModel.SimpleAttribute#isMany <em>Many</em>}</li>
 *   <li>{@link codeGeneratorModel.SimpleAttribute#getData <em>Data</em>}</li>
 *   <li>{@link codeGeneratorModel.SimpleAttribute#isRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getSimpleAttribute()
 * @model
 * @generated
 */
public interface SimpleAttribute extends Attribute {
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
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getSimpleAttribute_Many()
	 * @model default="false"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.SimpleAttribute#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * The literals are from the enumeration {@link codeGeneratorModel.DataEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see codeGeneratorModel.DataEnum
	 * @see #setData(DataEnum)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getSimpleAttribute_Data()
	 * @model default="String" required="true"
	 * @generated
	 */
	DataEnum getData();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.SimpleAttribute#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see codeGeneratorModel.DataEnum
	 * @see #getData()
	 * @generated
	 */
	void setData(DataEnum value);

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
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getSimpleAttribute_Required()
	 * @model default="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.SimpleAttribute#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

} // SimpleAttribute
