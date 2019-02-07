package lec17;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		
		//put O(1)
		map.put("India", 100);
		map.put("USA", 20);
		System.out.println(map);
	
		System.out.println(map.get("India"));
		System.out.println(map.get("Aus"));
		
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsKey("Aus"));
		
		System.out.println(map);
		System.out.println(map.remove("Aus"));
	}

}
