/**
 */
package codeGeneratorModel.impl;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.CodeGeneratorModelPackage;
import codeGeneratorModel.OnService;
import codeGeneratorModel.ServiceEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link codeGeneratorModel.impl.OnServiceImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link codeGeneratorModel.impl.OnServiceImpl#getWhenServices <em>When Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnServiceImpl extends MinimalEObjectImpl.Container implements OnService {
	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact artifact;

	/**
	 * The cached value of the '{@link #getWhenServices() <em>When Services</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceEnum> whenServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeGeneratorModelPackage.Literals.ON_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getArtifact() {
		if (artifact != null && artifact.eIsProxy()) {
			InternalEObject oldArtifact = (InternalEObject)artifact;
			artifact = (Artifact)eResolveProxy(oldArtifact);
			if (artifact != oldArtifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodeGeneratorModelPackage.ON_SERVICE__ARTIFACT, oldArtifact, artifact));
			}
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetArtifact() {
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifact(Artifact newArtifact) {
		Artifact oldArtifact = artifact;
		artifact = newArtifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodeGeneratorModelPackage.ON_SERVICE__ARTIFACT, oldArtifact, artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceEnum> getWhenServices() {
		if (whenServices == null) {
			whenServices = new EDataTypeUniqueEList<ServiceEnum>(ServiceEnum.class, this, CodeGeneratorModelPackage.ON_SERVICE__WHEN_SERVICES);
		}
		return whenServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodeGeneratorModelPackage.ON_SERVICE__ARTIFACT:
				if (resolve) return getArtifact();
				return basicGetArtifact();
			case CodeGeneratorModelPackage.ON_SERVICE__WHEN_SERVICES:
				return getWhenServices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodeGeneratorModelPackage.ON_SERVICE__ARTIFACT:
				setArtifact((Artifact)newValue);
				return;
			case CodeGeneratorModelPackage.ON_SERVICE__WHEN_SERVICES:
				getWhenServices().clear();
				getWhenServices().addAll((Collection<? extends ServiceEnum>)newValue);
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
			case CodeGeneratorModelPackage.ON_SERVICE__ARTIFACT:
				setArtifact((Artifact)null);
				return;
			case CodeGeneratorModelPackage.ON_SERVICE__WHEN_SERVICES:
				getWhenServices().clear();
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
			case CodeGeneratorModelPackage.ON_SERVICE__ARTIFACT:
				return artifact != null;
			case CodeGeneratorModelPackage.ON_SERVICE__WHEN_SERVICES:
				return whenServices != null && !whenServices.isEmpty();
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
		result.append(" (whenServices: ");
		result.append(whenServices);
		result.append(')');
		return result.toString();
	}

} //OnServiceImpl
