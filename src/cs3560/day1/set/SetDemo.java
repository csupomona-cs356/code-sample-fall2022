package cs3560.day1.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


// List
// LinkedList, ArrayList, Vector

// Map
// HashMap, Hashtable

public class SetDemo {

	public static void main(String[] args) {
		EnhancedHashSet2<Integer> mySet = new EnhancedHashSet2<>();
		mySet.add(3);
		mySet.add(1);
		mySet.add(2);
		mySet.add(0);
		mySet.add(2);
		
		System.out.println(mySet);
		System.out.println(mySet.size());
		System.out.println(mySet.getCount());
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);		
		mySet.addAll(myList);
		System.out.println(mySet);
		System.out.println(mySet.size());
		System.out.println(mySet.getCount());
	}

}
