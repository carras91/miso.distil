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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link codeGeneratorModel.impl.RootImpl#getMongoURIs <em>Mongo UR Is</em>}</li>
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
	protected EList<Artifact> artifacts;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getMongoURIs() <em>Mongo UR Is</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMongoURIs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mongoURIs;

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
	@Override
	protected EClass eStaticClass() {
		return CodeGeneratorModelPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getArtifacts() {
		if (artifacts == null) {
			artifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this, CodeGeneratorModelPackage.ROOT__ARTIFACTS);
		}
		return artifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, CodeGeneratorModelPackage.ROOT__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, CodeGeneratorModelPackage.ROOT__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMongoURIs() {
		if (mongoURIs == null) {
			mongoURIs = new EDataTypeUniqueEList<String>(String.class, this, CodeGeneratorModelPackage.ROOT__MONGO_UR_IS);
		}
		return mongoURIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				return getArtifacts();
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				return getEntities();
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				return getServices();
			case CodeGeneratorModelPackage.ROOT__MONGO_UR_IS:
				return getMongoURIs();
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
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case CodeGeneratorModelPackage.ROOT__MONGO_UR_IS:
				getMongoURIs().clear();
				getMongoURIs().addAll((Collection<? extends String>)newValue);
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
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				getArtifacts().clear();
				return;
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				getEntities().clear();
				return;
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				getServices().clear();
				return;
			case CodeGeneratorModelPackage.ROOT__MONGO_UR_IS:
				getMongoURIs().clear();
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
			case CodeGeneratorModelPackage.ROOT__ARTIFACTS:
				return artifacts != null && !artifacts.isEmpty();
			case CodeGeneratorModelPackage.ROOT__ENTITIES:
				return entities != null && !entities.isEmpty();
			case CodeGeneratorModelPackage.ROOT__SERVICES:
				return services != null && !services.isEmpty();
			case CodeGeneratorModelPackage.ROOT__MONGO_UR_IS:
				return mongoURIs != null && !mongoURIs.isEmpty();
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
		result.append(" (mongoURIs: ");
		result.append(mongoURIs);
		result.append(')');
		return result.toString();
	}

} //RootImpl
