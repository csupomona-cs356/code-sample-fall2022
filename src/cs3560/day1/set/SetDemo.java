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
		mySet.add(5);
		mySet.add(6);
		mySet.add(7);
		mySet.add(6);
		mySet.add(5);
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
