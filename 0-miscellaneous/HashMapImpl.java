
public class HashMapImpl {

	public static void main(String[] args) {
		CustomHashMap map = new CustomHashMap(2500);
		map.put("Hello", "World");
		map.put("Mama", "Mia");
		map.put("David", "Hasselhoff");
		map.put("Penn", "State");
		map.put("Stefan", "Achleitner");
		
		System.out.println(map.get("Hello"));
	}

}
