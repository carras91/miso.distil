/**
 */
package codeGeneratorModel.impl;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.CodeGeneratorModelPackage;
import codeGeneratorModel.Entity;
import codeGeneratorModel.Root;
import codeGeneratorModel.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link codeGeneratorModel.impl.RootImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link codeGeneratorModel.impl.RootImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link codeGeneratorModel.impl.RootImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getArtifacts() <em>Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList artifacts;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList entities;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CodeGeneratorModelPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList(Artifact.class, this, CodeGeneratorModelPackage.ROOT__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList(Entity.class, this, CodeGeneratorModelPackage.ROOT__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServices() {
		if (services == null) {
			services = new EObjectContainmentEList(Service.class, this, CodeGeneratorModelPackage.ROOT__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				return ((InternalEList)getArtifacts()).basicRemove(otherEnd, msgs);
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				return ((InternalEList)getEntities()).basicRemove(otherEnd, msgs);
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				return ((InternalEList)getServices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				return getArtifacts();
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				return getEntities();
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				return getServices();
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
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection)newValue);
				return;
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection)newValue);
				return;
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				getServices().clear();
				getServices().addAll((Collection)newValue);
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
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				getArtifacts().clear();
				return;
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				getEntities().clear();
				return;
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				getServices().clear();
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
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				return entities != null && !entities.isEmpty();
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				return services != null && !services.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
