/**
 */
package codeGeneratorModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getServiceEnum()
 * @model
 * @generated
 */
public final class ServiceEnum extends AbstractEnumerator {
	/**
	 * The '<em><b>Upload</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upload</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPLOAD_LITERAL
	 * @model name="upload"
	 * @generated
	 * @ordered
	 */
	public static final int UPLOAD = 0;

	/**
	 * The '<em><b>Download</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Download</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWNLOAD_LITERAL
	 * @model name="download"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNLOAD = 1;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE_LITERAL
	 * @model name="update"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE = 2;

	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_LITERAL
	 * @model name="read"
	 * @generated
	 * @ordered
	 */
	public static final int READ = 3;

	/**
	 * The '<em><b>Read All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ALL_LITERAL
	 * @model name="readAll"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ALL = 4;

	/**
	 * The '<em><b>Search</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Search</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH_LITERAL
	 * @model name="search"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH = 5;

	/**
	 * The '<em><b>Upload</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOAD
	 * @generated
	 * @ordered
	 */
	public static final ServiceEnum UPLOAD_LITERAL = new ServiceEnum(UPLOAD, "upload", "upload");

	/**
	 * The '<em><b>Download</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWNLOAD
	 * @generated
	 * @ordered
	 */
	public static final ServiceEnum DOWNLOAD_LITERAL = new ServiceEnum(DOWNLOAD, "download", "download");

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @generated
	 * @ordered
	 */
	public static final ServiceEnum UPDATE_LITERAL = new ServiceEnum(UPDATE, "update", "update");

	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @generated
	 * @ordered
	 */
	public static final ServiceEnum READ_LITERAL = new ServiceEnum(READ, "read", "read");

	/**
	 * The '<em><b>Read All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ALL
	 * @generated
	 * @ordered
	 */
	public static final ServiceEnum READ_ALL_LITERAL = new ServiceEnum(READ_ALL, "readAll", "readAll");

	/**
	 * The '<em><b>Search</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH
	 * @generated
	 * @ordered
	 */
	public static final ServiceEnum SEARCH_LITERAL = new ServiceEnum(SEARCH, "search", "search");

	/**
	 * An array of all the '<em><b>Service Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServiceEnum[] VALUES_ARRAY =
		new ServiceEnum[] {
			UPLOAD_LITERAL,
			DOWNLOAD_LITERAL,
			UPDATE_LITERAL,
			READ_LITERAL,
			READ_ALL_LITERAL,
			SEARCH_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Service Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Service Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServiceEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Service Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceEnum get(int value) {
		switch (value) {
			case UPLOAD: return UPLOAD_LITERAL;
			case DOWNLOAD: return DOWNLOAD_LITERAL;
			case UPDATE: return UPDATE_LITERAL;
			case READ: return READ_LITERAL;
			case READ_ALL: return READ_ALL_LITERAL;
			case SEARCH: return SEARCH_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ServiceEnum(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ServiceEnum
