/**
 */
package codeGeneratorModel.impl;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.CodeGeneratorModelPackage;
import codeGeneratorModel.FormatEnum;
import codeGeneratorModel.ServiceEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link codeGeneratorModel.impl.ArtifactImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link codeGeneratorModel.impl.ArtifactImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link codeGeneratorModel.impl.ArtifactImpl#getBasicServices <em>Basic Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactImpl extends AbstractEntityImpl implements Artifact {
	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final FormatEnum FORMAT_EDEFAULT = FormatEnum.XMI_LITERAL;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected FormatEnum format = FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBasicServices() <em>Basic Services</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicServices()
	 * @generated
	 * @ordered
	 */
	protected EList basicServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodeGeneratorModelPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGeneratorModelPackage.ARTIFACT__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatEnum getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(FormatEnum newFormat) {
		FormatEnum oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGeneratorModelPackage.ARTIFACT__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBasicServices() {
		if (basicServices == null) {
			basicServices = new EDataTypeUniqueEList(ServiceEnum.class, this, CodeGeneratorModelPackage.ARTIFACT__BASIC_SERVICES);
		}
		return basicServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodeGeneratorModelPackage.ARTIFACT__EXTENSION:
				return getExtension();
			case CodeGeneratorModelPackage.ARTIFACT__FORMAT:
				return getFormat();
			case CodeGeneratorModelPackage.ARTIFACT__BASIC_SERVICES:
				return getBasicServices();
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
			case CodeGeneratorModelPackage.ARTIFACT__EXTENSION:
				setExtension((String)newValue);
				return;
			case CodeGeneratorModelPackage.ARTIFACT__FORMAT:
				setFormat((FormatEnum)newValue);
				return;
			case CodeGeneratorModelPackage.ARTIFACT__BASIC_SERVICES:
				getBasicServices().clear();
				getBasicServices().addAll((Collection)newValue);
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
			case CodeGeneratorModelPackage.ARTIFACT__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case CodeGeneratorModelPackage.ARTIFACT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case CodeGeneratorModelPackage.ARTIFACT__BASIC_SERVICES:
				getBasicServices().clear();
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
			case CodeGeneratorModelPackage.ARTIFACT__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case CodeGeneratorModelPackage.ARTIFACT__FORMAT:
				return format != FORMAT_EDEFAULT;
			case CodeGeneratorModelPackage.ARTIFACT__BASIC_SERVICES:
				return basicServices != null && !basicServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extension: ");
		result.append(extension);
		result.append(", format: ");
		result.append(format);
		result.append(", basicServices: ");
		result.append(basicServices);
		result.append(')');
		return result.toString();
	}

} //ArtifactImpl
