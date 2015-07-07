/**
 */
package codeGeneratorModel.impl;

import codeGeneratorModel.AbstractEntity;
import codeGeneratorModel.CodeGeneratorModelPackage;
import codeGeneratorModel.SimpleService;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link codeGeneratorModel.impl.SimpleServiceImpl#getInput <em>Input</em>}</li>
 *   <li>{@link codeGeneratorModel.impl.SimpleServiceImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleServiceImpl extends ServiceImpl implements SimpleService {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodeGeneratorModelPackage.Literals.SIMPLE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInput() {
		if (input == null) {
			input = new EObjectResolvingEList(AbstractEntity.class, this, CodeGeneratorModelPackage.SIMPLE_SERVICE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList(AbstractEntity.class, this, CodeGeneratorModelPackage.SIMPLE_SERVICE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodeGeneratorModelPackage.SIMPLE_SERVICE__INPUT:
				return getInput();
			case CodeGeneratorModelPackage.SIMPLE_SERVICE__OUTPUT:
				return getOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodeGeneratorModelPackage.SIMPLE_SERVICE__INPUT:
				getInput().clear();
				getInput().addAll((Collection)newValue);
				return;
			case CodeGeneratorModelPackage.SIMPLE_SERVICE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodeGeneratorModelPackage.SIMPLE_SERVICE__INPUT:
				getInput().clear();
				return;
			case CodeGeneratorModelPackage.SIMPLE_SERVICE__OUTPUT:
				getOutput().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodeGeneratorModelPackage.SIMPLE_SERVICE__INPUT:
				return input != null && !input.isEmpty();
			case CodeGeneratorModelPackage.SIMPLE_SERVICE__OUTPUT:
				return output != null && !output.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleServiceImpl
