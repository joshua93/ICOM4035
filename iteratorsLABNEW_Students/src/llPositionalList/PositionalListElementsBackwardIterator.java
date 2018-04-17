package llPositionalList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.Position;
import interfaces.PositionalList;

public class PositionalListElementsBackwardIterator<T> implements Iterator {

	private Position<T> current, recent; 
	private PositionalList<T> theList; 
	
	public PositionalListElementsBackwardIterator(PositionalList<T> list) { 
		theList = list; 
		current = list.last();
		recent = null;
	}
	
	public boolean hasNext() {
		return current != null;
	}

	public T next() throws NoSuchElementException {
		if (!hasNext()) 
			throw new NoSuchElementException("Iterator has past the end.");
		
		recent = current;
		current = theList.before(current);
		
		return recent.getElement();
	}
	public void remove() {
		if(recent==null)
			throw new IllegalStateException("Invalid state to apply remove");
		theList.remove(recent);
		recent = null;
	}
	
	//

}