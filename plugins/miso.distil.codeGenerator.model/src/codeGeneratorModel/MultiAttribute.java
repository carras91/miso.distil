/**
 */
package codeGeneratorModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codeGeneratorModel.MultiAttribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getMultiAttribute()
 * @model
 * @generated
 */
public interface MultiAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Entity)
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getMultiAttribute_Type()
	 * @model keys="name" required="true"
	 * @generated
	 */
	Entity getType();

	/**
	 * Sets the value of the '{@link codeGeneratorModel.MultiAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Entity value);

} // MultiAttribute
