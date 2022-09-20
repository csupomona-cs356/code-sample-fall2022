package cs3560.day1.set;

import java.util.Collection;
import java.util.HashSet;

public class EnhancedHashSet<E> extends HashSet<E> {

	private int counter = 0;
	
	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		counter++;
		return super.add(e);
	}	

	public int getCount() {
		return counter;
	}
	
}
