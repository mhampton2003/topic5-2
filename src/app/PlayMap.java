package app;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Maya
 *
 */
public class PlayMap {

	/**
	 * creates 2 maps with different datatypes and performs different functions with them
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		//create Map of Integers keyed by Integers
		Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
		integerMap.put(1, 1);
		integerMap.put(2, 2);
		integerMap.put(3, 3);
		integerMap.put(4, 4);
		integerMap.put(5, 5);
		
		//create Map of Strings keyed by Integers
		Map<Integer, String> stringMap = new HashMap<Integer, String>();
		stringMap.put(1, "One");
		stringMap.put(2, "Two");
		stringMap.put(3, "Three");
		stringMap.put(4, "Four");
		stringMap.put(5, "Five");
		
		//create Map of Strings keyed by Strings
		Map<String, String> nameMap = new HashMap<String, String>();
		nameMap.put("FirstName", "Maya");
		nameMap.put("LastName", "Hampton");
		
		//print out size and if a Map is empty
		System.out.printf("Integer Map Tests: size is %d and is empty %b\n", integerMap.size(), integerMap.isEmpty());
		System.out.printf("String Map Tests: size is %d and is empty %b\n", stringMap.size(), stringMap.isEmpty());
		System.out.printf("Name Map Tests: size is %d and is empty %b\n", nameMap.size(), nameMap.isEmpty());
		
		//use a For Loop to loop over the Keys to retrieve each Map Value
		for (Map.Entry<String, String> m : nameMap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", m.getKey(), m.getValue());
		}
		
		//cleanup
		integerMap.clear();
		stringMap.remove(1);
		stringMap.clear();
		nameMap.clear();

	}

}
