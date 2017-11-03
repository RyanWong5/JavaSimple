package linked_list;

public class LLNode <T> {
	
	private T object;
	private LLNode <T> next;
	
	public LLNode(T object) {
		this.object = object;
		next = null;
	}

	public void setNext(LLNode <T> next) {
		this.next = next;
	}
	
	public void setObject(T object) {
		this.object = object;
	}
	
	public LLNode <T> getNext() {
		return this.next;
	}
	
	public T getObject() {
		return this.object;
	}
	
	/**
	 *  For every node will contain a reference with an object
	 *  - reference can be null depending on how you use your custom linked list 
	 */
}
