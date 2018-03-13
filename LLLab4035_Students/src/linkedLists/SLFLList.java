package linkedLists;
/**
 * Singly linked list with references to its first and its
 * last node. 
 * 
 * @author pirvos
 *
 */

import java.util.NoSuchElementException;

import linkedLists.LinkedList;

public class SLFLList<E> extends SLList<E>
{
	private SNode<E> first, last;   // reference to the first node and to the last node
	int length; 
	
	public SLFLList() {       // to create an empty list instance
		first = last = null; 
		length = 0; 
	}
	
	
	public void addFirstNode(Node<E> nuevo) {
		// TODO Auto-generated method stub
		SNode<E> newNode = (SNode<E>) nuevo;
		
		if(length == 0) {
			last = first = newNode;
		} else {
			SNode<E> prevNode = first;
			first = newNode;
			first.setNext(prevNode);
		}
		length++;
	}

	public void addNodeAfter(Node<E> target, Node<E> nuevo) {
		// TODO Auto-generated method stub
		SNode<E> newNode = (SNode<E>) nuevo;
		if(target == last) {
			last.setNext(newNode);
			last = newNode;
		} else {
			newNode.setNext(((SNode<E>) target).getNext()); 
			((SNode<E>) target).setNext(newNode); 		
			}
		length++;
	}
	

	public void addNodeBefore(Node<E> target, Node<E> nuevo) {
		// TODO Auto-generated method stub
		SNode<E> nuevoNodo = (SNode<E>) nuevo;
		
		 if(target == first) {
			 this.addFirstNode(nuevoNodo);
		 } else {
		 nuevoNodo.setNext((SNode<E>)target);
		 ((SNode<E>) this.getNodeBefore(target)).setNext(nuevoNodo);

		 }
		 
		 length ++;
		
	}

	public Node<E> getFirstNode() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if(length == 0 ) {
			throw new IndexOutOfBoundsException("List - Empty");
		}
		return first;
	}

	public Node<E> getLastNode() throws NoSuchElementException {
		// TODO Auto-generated method stub
		if (length == 0) {
			throw new IndexOutOfBoundsException("List - Empty");
		}		
		return last;
	}

	public Node<E> getNodeAfter(Node<E> target) throws NoSuchElementException {
		// TODO Auto-generated method stub
		if((SNode<E>)target == last) {
			throw new IndexOutOfBoundsException("Target is the last node");
		}
		return ((SNode<E>)target).getNext();
	}

	public Node<E> getNodeBefore(Node<E> target) throws NoSuchElementException {
		// TODO Auto-generated method stub
		if((SNode<E>)target == first) {
			throw new IndexOutOfBoundsException("Target is the first node");
		} else {
			
		SNode<E> prev = first; 
		
		while (prev != null && prev.getNext() != target) 
			prev = prev.getNext();  
		return prev; 
		}
	}

	public int length() {
		// TODO Auto-generated method stub
		return length;
	}

	public void removeNode(Node<E> target) {
		// TODO Auto-generated method stub
		SNode<E> nodeToRemove = (SNode<E>) target; 
		if(target == first){	
			first = first.getNext(); 

		} else {
			SNode<E> prevNode = (SNode<E>) this.getNodeBefore(target); 
			prevNode.setNext(((SNode<E>) target).getNext()); 
		}
		nodeToRemove.setNext(null);
		length --;
	}
	
	public Node<E> createNewNode() {
		return new SNode<E>();
	}

}