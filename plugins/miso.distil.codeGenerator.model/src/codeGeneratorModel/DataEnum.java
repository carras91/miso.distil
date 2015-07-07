/**
 */
package codeGeneratorModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see codeGeneratorModel.CodeGeneratorModelPackage#getDataEnum()
 * @model
 * @generated
 */
public final class DataEnum extends AbstractEnumerator {
	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_LITERAL
	 * @model name="Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN = 0;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LITERAL
	 * @model name="Double"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE = 1;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LITERAL
	 * @model name="Integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER = 2;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_LITERAL
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING = 3;

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @generated
	 * @ordered
	 */
	public static final DataEnum BOOLEAN_LITERAL = new DataEnum(BOOLEAN, "Boolean", "Boolean");

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @generated
	 * @ordered
	 */
	public static final DataEnum DOUBLE_LITERAL = new DataEnum(DOUBLE, "Double", "Double");

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @generated
	 * @ordered
	 */
	public static final DataEnum INTEGER_LITERAL = new DataEnum(INTEGER, "Integer", "Integer");

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @generated
	 * @ordered
	 */
	public static final DataEnum STRING_LITERAL = new DataEnum(STRING, "String", "String");

	/**
	 * An array of all the '<em><b>Data Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataEnum[] VALUES_ARRAY =
		new DataEnum[] {
			BOOLEAN_LITERAL,
			DOUBLE_LITERAL,
			INTEGER_LITERAL,
			STRING_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataEnum get(int value) {
		switch (value) {
			case BOOLEAN: return BOOLEAN_LITERAL;
			case DOUBLE: return DOUBLE_LITERAL;
			case INTEGER: return INTEGER_LITERAL;
			case STRING: return STRING_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataEnum(int value, String name, String literal) {
		super(value, name, literal);
	}

} //DataEnum
