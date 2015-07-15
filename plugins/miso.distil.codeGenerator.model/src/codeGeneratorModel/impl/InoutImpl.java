/**
 */
package codeGeneratorModel.impl;

import codeGeneratorModel.AbstractEntity;
import codeGeneratorModel.CodeGeneratorModelPackage;
import codeGeneratorModel.Inout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link codeGeneratorModel.impl.InoutImpl#isMany <em>Many</em>}</li>
 *   <li>{@link codeGeneratorModel.impl.InoutImpl#getType <em>Type</em>}</li>
 *   <li>{@link codeGeneratorModel.impl.InoutImpl#getCompatibility <em>Compatibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InoutImpl extends MinimalEObjectImpl.Container implements Inout {
	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected boolean many = MANY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AbstractEntity type;

	/**
	 * The default value of the '{@link #getCompatibility() <em>Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibility()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPATIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompatibility() <em>Compatibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibility()
	 * @generated
	 * @ordered
	 */
	protected String compatibility = COMPATIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeGeneratorModelPackage.Literals.INOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMany() {
		return many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany(boolean newMany) {
		boolean oldMany = many;
		many = newMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGeneratorModelPackage.INOUT__MANY, oldMany, many));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntity getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (AbstractEntity)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodeGeneratorModelPackage.INOUT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntity basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AbstractEntity newType) {
		AbstractEntity oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGeneratorModelPackage.INOUT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompatibility() {
		return compatibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompatibility(String newCompatibility) {
		String oldCompatibility = compatibility;
		compatibility = newCompatibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGeneratorModelPackage.INOUT__COMPATIBILITY, oldCompatibility, compatibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodeGeneratorModelPackage.INOUT__MANY:
				return isMany();
			case CodeGeneratorModelPackage.INOUT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CodeGeneratorModelPackage.INOUT__COMPATIBILITY:
				return getCompatibility();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodeGeneratorModelPackage.INOUT__MANY:
				setMany((Boolean)newValue);
				return;
			case CodeGeneratorModelPackage.INOUT__TYPE:
				setType((AbstractEntity)newValue);
				return;
			case CodeGeneratorModelPackage.INOUT__COMPATIBILITY:
				setCompatibility((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodeGeneratorModelPackage.INOUT__MANY:
				setMany(MANY_EDEFAULT);
				return;
			case CodeGeneratorModelPackage.INOUT__TYPE:
				setType((AbstractEntity)null);
				return;
			case CodeGeneratorModelPackage.INOUT__COMPATIBILITY:
				setCompatibility(COMPATIBILITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodeGeneratorModelPackage.INOUT__MANY:
				return many != MANY_EDEFAULT;
			case CodeGeneratorModelPackage.INOUT__TYPE:
				return type != null;
			case CodeGeneratorModelPackage.INOUT__COMPATIBILITY:
				return COMPATIBILITY_EDEFAULT == null ? compatibility != null : !COMPATIBILITY_EDEFAULT.equals(compatibility);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (many: ");
		result.append(many);
		result.append(", compatibility: ");
		result.append(compatibility);
		result.append(')');
		return result.toString();
	}

} //InoutImpl
