package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author Maya
 *
 */
public class PlayQueue {

	/**
	 * creates 2 queues with different datatypes and performs different functions with them
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		//set up a Queue of Integers
		Queue<Integer> integerQueue = new LinkedList<Integer>();
		integerQueue.add(18);
		integerQueue.offer(20);
		integerQueue.add(15);
		integerQueue.offer(46);
		integerQueue.add(45);
		
		//set up a Queue of Strings
		Queue<String> stringQueue = new LinkedList<String>();
		stringQueue.offer("Maya Hampton");
		stringQueue.add("Bailie Hampton");
		stringQueue.offer("Carter Hampton");
		stringQueue.add("Jan Hampton");
		stringQueue.offer("Angie Hampton");
		
		//print out size and head element of the Queue
		System.out.println(integerQueue);
		System.out.printf("Integer Queue Tests: size is %d and head element is %d\n", integerQueue.size(), integerQueue.peek());
		System.out.println(stringQueue);
		System.out.printf("String Queue Tests: size is %d and head element is %s\n", stringQueue.size(), stringQueue.peek());
		
		//print Integer Queue using toString()
		System.out.println(integerQueue.toString());
		
		//use iterator to get elements from the Queue
		Iterator<String> itr = stringQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
