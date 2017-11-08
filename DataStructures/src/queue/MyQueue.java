package queue;

import linked_list.LLNode;

public class MyQueue <T> {
	
	private LLNode<T> queue, end;

	public MyQueue() {
		queue = null;
		end = null;
	}
	
	// TODO (fix)
	public boolean enqueue(T object) { // Insert into queue
		if (object == null) {
			return false;
		}
		
		if(queue == null) {
			queue = new LLNode<T>(object);
			end = queue;
		} else { 
			LLNode<T> temp = new LLNode<T>(object);
			temp.setNext(end);
			end = temp;
		}
		return true;
		
	}
	
	// TODO (finish)
	public T dequeue() {
		T object = queue.getObject();
		queue = queue.getNext();
		return object;
	}
	
}
