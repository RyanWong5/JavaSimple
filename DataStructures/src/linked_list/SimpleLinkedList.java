package linked_list;

public class SimpleLinkedList <T> {
	
	private LLNode <T> front; // Reference to front of list
	private LLNode<T> end; 	  // Reference to end of list
	
	public SimpleLinkedList() {
		front = null;
		end = null;
	}
	
	public String toString() {
		if(front == null) 
			return "[]";
		
		String value = "[";
		LLNode<T> temp = front; // clone
		while(temp.getNext() != null) {
			value += temp.getObject() + ", ";
			temp = temp.getNext();
		}
		value += temp.getObject();
		value += "]";
		return value;
	}
	
	public void prepend(T object) { // add to beginning of list
		if (front == null) { // empty
			front = new LLNode<T>(object);
			end = front;
		} else { 
			LLNode<T> temp = new LLNode<T>(object);
			temp.setNext(front);
			front = temp;
		}
	}
	
	// TODO: Work on the append
	public void append(T object) { // add to end of list
		if (front == null) { // empty
			front = new LLNode<T>(object);
			end = front;
		} else { 
			LLNode<T> temp = new LLNode<T>(object);
			end.setNext(temp);
			end = temp;
		}		
	}
	
	/**
	 * This Linked List will only be singly (one way)
	 * - add object from front or end
	 * - prints list
	 */

}
