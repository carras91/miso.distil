package miso.carrascal.cloudModelServices.utils;

/**
 * Pair class.
 * 
 * @author Carlos Carrascal.
 *
 * @param <K> Key class.
 * @param <V> Value class.
 */
public class Pair<K, V> {

	/**
	 * Key object.
	 */
	private K key;
	/**
	 * Value object.
	 */
	private V value;
	
	/**
	 * Public constructor.
	 * 
	 * @param key Key object.
	 * @param value Value object.
	 */
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * Get key.
	 * 
	 * @return the key.
	 */
	public final K getKey() {
		return key;
	}

	/**
	 * Set key.
	 * 
	 * @param key new key.
	 */
	public final void setKey(K key) {
		this.key = key;
	}

	/**
	 * Get value.
	 * 
	 * @return the value.
	 */
	public final V getValue() {
		return value;
	}

	/**
	 * Set value.
	 * 
	 * @param value new value.
	 */
	public final void setValue(V value) {
		this.value = value;
	}
}
