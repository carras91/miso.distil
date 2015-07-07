/**
 */
package codeGeneratorModel.impl;

import codeGeneratorModel.AbstractEntity;
import codeGeneratorModel.Artifact;
import codeGeneratorModel.Attribute;
import codeGeneratorModel.CodeGeneratorModelFactory;
import codeGeneratorModel.CodeGeneratorModelPackage;
import codeGeneratorModel.DataEnum;
import codeGeneratorModel.Entity;
import codeGeneratorModel.FormatEnum;
import codeGeneratorModel.MultiAttribute;
import codeGeneratorModel.MultiService;
import codeGeneratorModel.OnService;
import codeGeneratorModel.Root;
import codeGeneratorModel.Service;
import codeGeneratorModel.ServiceEnum;
import codeGeneratorModel.SimpleAttribute;
import codeGeneratorModel.SimpleService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeGeneratorModelPackageImpl extends EPackageImpl implements CodeGeneratorModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formatEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see codeGeneratorModel.CodeGeneratorModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeGeneratorModelPackageImpl() {
		super(eNS_URI, CodeGeneratorModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CodeGeneratorModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeGeneratorModelPackage init() {
		if (isInited) return (CodeGeneratorModelPackage)EPackage.Registry.INSTANCE.getEPackage(CodeGeneratorModelPackage.eNS_URI);

		// Obtain or create and register package
		CodeGeneratorModelPackageImpl theCodeGeneratorModelPackage = (CodeGeneratorModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CodeGeneratorModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CodeGeneratorModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCodeGeneratorModelPackage.createPackageContents();

		// Initialize created meta-data
		theCodeGeneratorModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeGeneratorModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeGeneratorModelPackage.eNS_URI, theCodeGeneratorModelPackage);
		return theCodeGeneratorModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Artifacts() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Entities() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Services() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Extension() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Format() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_BasicServices() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEntity() {
		return abstractEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEntity_Attributes() {
		return (EReference)abstractEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEntity_Name() {
		return (EAttribute)abstractEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAttribute() {
		return simpleAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAttribute_Many() {
		return (EAttribute)simpleAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAttribute_Data() {
		return (EAttribute)simpleAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleAttribute_Required() {
		return (EAttribute)simpleAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleService() {
		return simpleServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleService_Input() {
		return (EReference)simpleServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleService_Output() {
		return (EReference)simpleServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiService() {
		return multiServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiService_Services() {
		return (EReference)multiServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiService_Parallel() {
		return (EAttribute)multiServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_When() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnService() {
		return onServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnService_Artifact() {
		return (EReference)onServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnService_WhenServices() {
		return (EAttribute)onServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiAttribute() {
		return multiAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiAttribute_Type() {
		return (EReference)multiAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataEnum() {
		return dataEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormatEnum() {
		return formatEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceEnum() {
		return serviceEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGeneratorModelFactory getCodeGeneratorModelFactory() {
		return (CodeGeneratorModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__ARTIFACTS);
		createEReference(rootEClass, ROOT__ENTITIES);
		createEReference(rootEClass, ROOT__SERVICES);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__EXTENSION);
		createEAttribute(artifactEClass, ARTIFACT__FORMAT);
		createEAttribute(artifactEClass, ARTIFACT__BASIC_SERVICES);

		abstractEntityEClass = createEClass(ABSTRACT_ENTITY);
		createEReference(abstractEntityEClass, ABSTRACT_ENTITY__ATTRIBUTES);
		createEAttribute(abstractEntityEClass, ABSTRACT_ENTITY__NAME);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);

		simpleAttributeEClass = createEClass(SIMPLE_ATTRIBUTE);
		createEAttribute(simpleAttributeEClass, SIMPLE_ATTRIBUTE__MANY);
		createEAttribute(simpleAttributeEClass, SIMPLE_ATTRIBUTE__DATA);
		createEAttribute(simpleAttributeEClass, SIMPLE_ATTRIBUTE__REQUIRED);

		entityEClass = createEClass(ENTITY);

		simpleServiceEClass = createEClass(SIMPLE_SERVICE);
		createEReference(simpleServiceEClass, SIMPLE_SERVICE__INPUT);
		createEReference(simpleServiceEClass, SIMPLE_SERVICE__OUTPUT);

		multiServiceEClass = createEClass(MULTI_SERVICE);
		createEReference(multiServiceEClass, MULTI_SERVICE__SERVICES);
		createEAttribute(multiServiceEClass, MULTI_SERVICE__PARALLEL);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__WHEN);

		onServiceEClass = createEClass(ON_SERVICE);
		createEReference(onServiceEClass, ON_SERVICE__ARTIFACT);
		createEAttribute(onServiceEClass, ON_SERVICE__WHEN_SERVICES);

		multiAttributeEClass = createEClass(MULTI_ATTRIBUTE);
		createEReference(multiAttributeEClass, MULTI_ATTRIBUTE__TYPE);

		// Create enums
		dataEnumEEnum = createEEnum(DATA_ENUM);
		formatEnumEEnum = createEEnum(FORMAT_ENUM);
		serviceEnumEEnum = createEEnum(SERVICE_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		artifactEClass.getESuperTypes().add(this.getAbstractEntity());
		simpleAttributeEClass.getESuperTypes().add(this.getAttribute());
		entityEClass.getESuperTypes().add(this.getAbstractEntity());
		simpleServiceEClass.getESuperTypes().add(this.getService());
		multiServiceEClass.getESuperTypes().add(this.getService());
		multiAttributeEClass.getESuperTypes().add(this.getAttribute());

		// Initialize classes and features; add operations and parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Artifacts(), this.getArtifact(), null, "artifacts", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoot_Artifacts().getEKeys().add(this.getAbstractEntity_Name());
		initEReference(getRoot_Entities(), this.getEntity(), null, "entities", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoot_Entities().getEKeys().add(this.getAbstractEntity_Name());
		initEReference(getRoot_Services(), this.getService(), null, "services", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoot_Services().getEKeys().add(this.getService_Name());

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Format(), this.getFormatEnum(), "format", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_BasicServices(), this.getServiceEnum(), "basicServices", "readAll", 0, 6, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEntityEClass, AbstractEntity.class, "AbstractEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, AbstractEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getAbstractEntity_Attributes().getEKeys().add(this.getAttribute_Name());
		initEAttribute(getAbstractEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleAttributeEClass, SimpleAttribute.class, "SimpleAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleAttribute_Many(), ecorePackage.getEBoolean(), "many", "false", 0, 1, SimpleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAttribute_Data(), this.getDataEnum(), "data", "String", 1, 1, SimpleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleAttribute_Required(), ecorePackage.getEBoolean(), "required", "false", 0, 1, SimpleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleServiceEClass, SimpleService.class, "SimpleService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleService_Input(), this.getAbstractEntity(), null, "input", null, 0, -1, SimpleService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSimpleService_Input().getEKeys().add(this.getAbstractEntity_Name());
		initEReference(getSimpleService_Output(), this.getAbstractEntity(), null, "output", null, 0, -1, SimpleService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSimpleService_Output().getEKeys().add(this.getAbstractEntity_Name());

		initEClass(multiServiceEClass, MultiService.class, "MultiService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiService_Services(), this.getService(), null, "services", null, 2, -1, MultiService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getMultiService_Services().getEKeys().add(this.getService_Name());
		initEAttribute(getMultiService_Parallel(), ecorePackage.getEBoolean(), "parallel", null, 0, 1, MultiService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_When(), this.getOnService(), null, "when", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onServiceEClass, OnService.class, "OnService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnService_Artifact(), this.getArtifact(), null, "artifact", null, 1, 1, OnService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOnService_Artifact().getEKeys().add(this.getAbstractEntity_Name());
		initEAttribute(getOnService_WhenServices(), this.getServiceEnum(), "whenServices", "upload", 1, -1, OnService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiAttributeEClass, MultiAttribute.class, "MultiAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiAttribute_Type(), this.getEntity(), null, "type", null, 1, 1, MultiAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getMultiAttribute_Type().getEKeys().add(this.getAbstractEntity_Name());

		// Initialize enums and add enum literals
		initEEnum(dataEnumEEnum, DataEnum.class, "DataEnum");
		addEEnumLiteral(dataEnumEEnum, DataEnum.BOOLEAN_LITERAL);
		addEEnumLiteral(dataEnumEEnum, DataEnum.DOUBLE_LITERAL);
		addEEnumLiteral(dataEnumEEnum, DataEnum.INTEGER_LITERAL);
		addEEnumLiteral(dataEnumEEnum, DataEnum.STRING_LITERAL);

		initEEnum(formatEnumEEnum, FormatEnum.class, "FormatEnum");
		addEEnumLiteral(formatEnumEEnum, FormatEnum.XMI_LITERAL);
		addEEnumLiteral(formatEnumEEnum, FormatEnum.BINARY_LITERAL);
		addEEnumLiteral(formatEnumEEnum, FormatEnum.TEXT_LITERAL);
		addEEnumLiteral(formatEnumEEnum, FormatEnum.XML_LITERAL);
		addEEnumLiteral(formatEnumEEnum, FormatEnum.JSON_LITERAL);
		addEEnumLiteral(formatEnumEEnum, FormatEnum.ATL_LITERAL);
		addEEnumLiteral(formatEnumEEnum, FormatEnum.ZIP_LITERAL);

		initEEnum(serviceEnumEEnum, ServiceEnum.class, "ServiceEnum");
		addEEnumLiteral(serviceEnumEEnum, ServiceEnum.UPLOAD_LITERAL);
		addEEnumLiteral(serviceEnumEEnum, ServiceEnum.DOWNLOAD_LITERAL);
		addEEnumLiteral(serviceEnumEEnum, ServiceEnum.UPDATE_LITERAL);
		addEEnumLiteral(serviceEnumEEnum, ServiceEnum.READ_LITERAL);
		addEEnumLiteral(serviceEnumEEnum, ServiceEnum.READ_ALL_LITERAL);
		addEEnumLiteral(serviceEnumEEnum, ServiceEnum.SEARCH_LITERAL);

		// Create resource
		createResource(eNS_URI);
	}

} //CodeGeneratorModelPackageImpl
