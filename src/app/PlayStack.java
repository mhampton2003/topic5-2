package app;

import java.util.Iterator;
import java.util.Stack;

/**
 * 
 * @author Maya
 *
 */
public class PlayStack {

	/**
	 * creates 2 stacks with different datatypes and performs different functions with them
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		//set up a Stack of Integers
		Stack<Integer> integerStack = new Stack<Integer>();
		integerStack.push(1);
		integerStack.push(-1);
		integerStack.push(5);
		integerStack.push(10);
		integerStack.push(18);
		
		//set up a Stack of Strings
		Stack<String> stringStack = new Stack<String>();
		stringStack.push("Maya Hampton");
		stringStack.push("Carter Hampton");
		stringStack.push("Bailie Hampton");
		stringStack.push("Angie Hampton");
		stringStack.push("Jan Hampton");
		
		//print out size and second element in the Integer Stack
		System.out.println(integerStack);
		System.out.printf("Integer Stack Tests: size is %d and 2nd element is %d\n", integerStack.size(), integerStack.elementAt(1));
		
		//print out size and second element in the String Stack
		System.out.println(stringStack);
		System.out.printf("String Stack Tests: size is %s and 2nd element is %s\n", stringStack.size(), stringStack.elementAt(1));
	
		//print Integer Stack using toString()
		System.out.println(integerStack.toString());
		
		//use iterator to get elements from the String Stack
		Iterator<String> itr = stringStack.iterator();
		while(itr.hasNext()) {
			System.out.println(stringStack.pop());
		}
	
	}

}
