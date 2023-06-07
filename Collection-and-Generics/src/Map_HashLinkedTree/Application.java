package Map_HashLinkedTree;

import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		
		//HashMap has no insertion order, LinkedHashMap does maintains insertion order
		//TreeMap sort in natural or alphabetical order of keys
		//Cant have duplicate keys in Maps
		TreeMap<String, String> dictionary = new TreeMap<>();
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the feeling or belief that one can have faith in or rely on someone or something.");
		dictionary.put("Rhythm", "a strong, regular repeated pattern of movement or sound.");
		
		for(String key: dictionary.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("--------");
		
		for(String value: dictionary.values()) {
			System.out.println(value);
		}
		
		System.out.println("--------");
		
		for(Map.Entry<String, String> set: dictionary.entrySet()) {
			System.out.println(set.getKey()+" - "+set.getValue());
		}

	}

}
