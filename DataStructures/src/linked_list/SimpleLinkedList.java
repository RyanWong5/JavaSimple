package linked_list;

public class SimpleLinkedList <T> {
	
	private LLNode <T> front;
	
	public SimpleLinkedList() {
		front = null;
	}
	
	public String toString() {
		String value = "[";
		LLNode<T> temp = front; // clone
		while(temp.getNext() != null) {
			value += temp.getObject() + " ";
			temp = temp.getNext();
		}
		
		value += "]";
		return value;
	}
	
	public void prepend(T object) { // add to front of list
		if (front == null) { // empty
			front = new LLNode<T>(object);
		} else { 
			LLNode<T> temp = new LLNode<T>(object);
			temp.setNext(front);
			front = temp;
		}
	}
	
	// TODO: Work on the append
//	public void append(T object) { // add to back of list
//		if (front == null) { // empty
//			front = new LLNode<T>(object);
//		} else { 
//			LLNode<T> temp = new LLNode<T>(object);
//			temp.setNext(front);
//			front = temp;
//		}		
//	}
	
	/**
	 * This Linked List will only be singly (one way)
	 * - add object from front or end
	 * - prints list
	 */

}
