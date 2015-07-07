/**
 */
package codeGeneratorModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Format Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getFormatEnum()
 * @model
 * @generated
 */
public final class FormatEnum extends AbstractEnumerator {
	/**
	 * The '<em><b>XMI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMI_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XMI = 0;

	/**
	 * The '<em><b>BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY = 1;

	/**
	 * The '<em><b>TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXT = 2;

	/**
	 * The '<em><b>XML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XML</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XML = 3;

	/**
	 * The '<em><b>JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JSON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JSON_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JSON = 4;

	/**
	 * The '<em><b>ATL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ATL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATL = 5;

	/**
	 * The '<em><b>ZIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZIP_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZIP = 6;

	/**
	 * The '<em><b>XMI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMI
	 * @generated
	 * @ordered
	 */
	public static final FormatEnum XMI_LITERAL = new FormatEnum(XMI, "XMI", "XMI");

	/**
	 * The '<em><b>BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @generated
	 * @ordered
	 */
	public static final FormatEnum BINARY_LITERAL = new FormatEnum(BINARY, "BINARY", "BINARY");

	/**
	 * The '<em><b>TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @generated
	 * @ordered
	 */
	public static final FormatEnum TEXT_LITERAL = new FormatEnum(TEXT, "TEXT", "TEXT");

	/**
	 * The '<em><b>XML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML
	 * @generated
	 * @ordered
	 */
	public static final FormatEnum XML_LITERAL = new FormatEnum(XML, "XML", "XML");

	/**
	 * The '<em><b>JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @generated
	 * @ordered
	 */
	public static final FormatEnum JSON_LITERAL = new FormatEnum(JSON, "JSON", "JSON");

	/**
	 * The '<em><b>ATL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATL
	 * @generated
	 * @ordered
	 */
	public static final FormatEnum ATL_LITERAL = new FormatEnum(ATL, "ATL", "ATL");

	/**
	 * The '<em><b>ZIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIP
	 * @generated
	 * @ordered
	 */
	public static final FormatEnum ZIP_LITERAL = new FormatEnum(ZIP, "ZIP", "ZIP");

	/**
	 * An array of all the '<em><b>Format Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormatEnum[] VALUES_ARRAY =
		new FormatEnum[] {
			XMI_LITERAL,
			BINARY_LITERAL,
			TEXT_LITERAL,
			XML_LITERAL,
			JSON_LITERAL,
			ATL_LITERAL,
			ZIP_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Format Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Format Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormatEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormatEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormatEnum get(int value) {
		switch (value) {
			case XMI: return XMI_LITERAL;
			case BINARY: return BINARY_LITERAL;
			case TEXT: return TEXT_LITERAL;
			case XML: return XML_LITERAL;
			case JSON: return JSON_LITERAL;
			case ATL: return ATL_LITERAL;
			case ZIP: return ZIP_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FormatEnum(int value, String name, String literal) {
		super(value, name, literal);
	}

} //FormatEnum
