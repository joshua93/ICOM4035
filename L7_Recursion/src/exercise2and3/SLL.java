package exercise2and3;


import java.util.ArrayList;

import helperStructures.Pair;

public class SLL<E> {
	private static class Node<E> {
		private E element; 
		private Node<E> next;


		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}

		public Node(E element) { 
			this(element, null); 
		} 

		public Node() { 
			this(null, null); 
		}

		public E getElement() { 
			return element; 
		}

		public void setElement(E element) { 
			this.element = element; 
		}

		public Node<E> getNext() { 
			return next; 
		}

		public void setNext(Node<E> next) { 
			this.next = next; 
		}

		//added by H
		public String toString(){
			return ""+element;
		}
	}

	private Node<E> first = null; 
	private int size = 0; 	
	public void addFirst(E e) { 
		first = new Node<>(e, first); 
		size++; 
	}

	// returns string formed by elements in this list, separated by spaces
	public String toString() { 
		String s = ""; 
		Node<E> current = first; 
		while (current != null) { 
			s += " " + current.getElement(); 
			current = current.getNext(); 
		}
		return s; 
	}	

	//*************************************************************************
	//EXERCISE 2 
	public void reverse(){
		if(size>1){
			first = recReverse(first).getFirst();
		}
	}

	public Pair<Node<E>> recReverse(Node<E> first){
		if(first.getNext() == null) {
			this.first = first;
			Pair<Node<E>> p = new Pair<Node<E>>(first, first);
			return p;
		}

		Pair<Node<E>> p = recReverse(first.getNext());
		p.second().setNext(first);
		first.setNext(null);
		p = new Pair<Node<E>>(p.getFirst(), first);

		return p;
	}

	//*************************************************************************

	//OTHER DISCUSSED METHODS

	public ArrayList<E> lessThan(E e) { 
		ArrayList<E> result = new ArrayList<>();     // and empty ArrayList object
		if (size > 0) 
			recLessThan(first, e, result);   // passing only reference to result
		return result; 
	}
	private void recLessThan(Node<E> fr, E e, ArrayList<E> result) { 
		if (fr != null) { 
			if (((Comparable<E>) fr.getElement()).compareTo(e) < 0)
				result.add(e); 
			recLessThan(fr.getNext(), e, result);  // passing reference to result
		}
	} 

	//EXERCISE 3
	public ArrayList<Pair<E>> consecutiveIncreasingPairs() { 
		ArrayList<Pair<E>> result = new ArrayList<>();     // and empty ArrayList object
		if (size > 0) 
			recCIP(first, result); 
		return result; 
	}
	public void recCIP(Node<E> first, ArrayList<Pair<E>> result){
		//WORK ON EXERCISE
	}






}
