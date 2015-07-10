/**
 */
package codeGeneratorModel.impl;

import codeGeneratorModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeGeneratorModelFactoryImpl extends EFactoryImpl implements CodeGeneratorModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeGeneratorModelFactory init() {
		try {
			CodeGeneratorModelFactory theCodeGeneratorModelFactory = (CodeGeneratorModelFactory)EPackage.Registry.INSTANCE.getEFactory(CodeGeneratorModelPackage.eNS_URI);
			if (theCodeGeneratorModelFactory != null) {
				return theCodeGeneratorModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeGeneratorModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGeneratorModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CodeGeneratorModelPackage.ROOT: return createRoot();
			case CodeGeneratorModelPackage.ARTIFACT: return createArtifact();
			case CodeGeneratorModelPackage.SIMPLE_ATTRIBUTE: return createSimpleAttribute();
			case CodeGeneratorModelPackage.ENTITY: return createEntity();
			case CodeGeneratorModelPackage.SIMPLE_SERVICE: return createSimpleService();
			case CodeGeneratorModelPackage.MULTI_SERVICE: return createMultiService();
			case CodeGeneratorModelPackage.ON_SERVICE: return createOnService();
			case CodeGeneratorModelPackage.MULTI_ATTRIBUTE: return createMultiAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CodeGeneratorModelPackage.DATA_ENUM:
				return createDataEnumFromString(eDataType, initialValue);
			case CodeGeneratorModelPackage.FORMAT_ENUM:
				return createFormatEnumFromString(eDataType, initialValue);
			case CodeGeneratorModelPackage.SERVICE_ENUM:
				return createServiceEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CodeGeneratorModelPackage.DATA_ENUM:
				return convertDataEnumToString(eDataType, instanceValue);
			case CodeGeneratorModelPackage.FORMAT_ENUM:
				return convertFormatEnumToString(eDataType, instanceValue);
			case CodeGeneratorModelPackage.SERVICE_ENUM:
				return convertServiceEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAttribute createSimpleAttribute() {
		SimpleAttributeImpl simpleAttribute = new SimpleAttributeImpl();
		return simpleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleService createSimpleService() {
		SimpleServiceImpl simpleService = new SimpleServiceImpl();
		return simpleService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiService createMultiService() {
		MultiServiceImpl multiService = new MultiServiceImpl();
		return multiService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnService createOnService() {
		OnServiceImpl onService = new OnServiceImpl();
		return onService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiAttribute createMultiAttribute() {
		MultiAttributeImpl multiAttribute = new MultiAttributeImpl();
		return multiAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnum createDataEnumFromString(EDataType eDataType, String initialValue) {
		DataEnum result = DataEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatEnum createFormatEnumFromString(EDataType eDataType, String initialValue) {
		FormatEnum result = FormatEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormatEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEnum createServiceEnumFromString(EDataType eDataType, String initialValue) {
		ServiceEnum result = ServiceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGeneratorModelPackage getCodeGeneratorModelPackage() {
		return (CodeGeneratorModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeGeneratorModelPackage getPackage() {
		return CodeGeneratorModelPackage.eINSTANCE;
	}

} //CodeGeneratorModelFactoryImpl
