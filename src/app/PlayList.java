package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Maya
 *
 */
public class PlayList {

	/**
	 * creates 2 lists with different datatypes and performs different functions with them
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		//create a List of Integers and add elements
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(10));
		integerList.add(Integer.valueOf(11));
		
		//create List of Strings and add elements
		List<String> stringList = new ArrayList<String>();
		stringList.add("Hello world");
		stringList.add("Hi world");
		
		//get first element from the List
		System.out.printf("Integer value: %d\n", integerList.get(0));
		System.out.printf("String value: %s\n", stringList.get(0));
		
		//print out the List using For Loop
		for (Integer data : integerList) {
			System.out.printf("Integer value: %d\n", data);
		}
		
		//print out the List using an Iterator
		Iterator<String> stringIterator = stringList.iterator();
		while (stringIterator.hasNext()) {
			System.out.printf("String value: %s\n", stringIterator.next());
		}

	}

}
