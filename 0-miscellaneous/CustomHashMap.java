
public class CustomHashMap {

	String[] keys;
	String[] values;
	int MAPSIZE;
	
	public CustomHashMap(int size){
		this.keys = new String[size];
		this.values = new String[size];
		this.MAPSIZE = size;
	}
	
	private int hashFunction(String key){
		int hash = key.hashCode()%this.MAPSIZE;
		System.out.println("Hash of " + key + " is " + hash);
		return hash;
	}
	
	public void put(String key, String value){
		int hash = hashFunction(key);
		keys[hash] = key;
		values[hash] = value;
	}
	
	public String get(String key){
		int hash = hashFunction(key);
		return values[hash];
	}
	
	public String getKey(String value){
		int hash = hashFunction(value);
		return keys[hash];
	}
}
