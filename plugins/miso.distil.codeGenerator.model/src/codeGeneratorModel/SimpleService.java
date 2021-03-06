/**
 */
package codeGeneratorModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link codeGeneratorModel.SimpleService#getInput <em>Input</em>}</li>
 *   <li>{@link codeGeneratorModel.SimpleService#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getSimpleService()
 * @model
 * @generated
 */
public interface SimpleService extends Service {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link codeGeneratorModel.Inout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getSimpleService_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inout> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link codeGeneratorModel.Inout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#getSimpleService_Output()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inout> getOutput();

} // SimpleService
