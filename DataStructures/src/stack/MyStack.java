package stack;

import linked_list.LLNode;

public class MyStack <T> {
	
	private LLNode<T> stack;
	
	public MyStack() {
		stack = null;
	}
	
	public boolean push(T object) {
		if(object == null) { // Exception handling
			return false;
		}
		
		
		if (stack == null) {
			stack = new LLNode<T>(object);
		} else {
			LLNode<T> temp = new LLNode<>(object);
			temp.setNext(stack);
			stack = temp;
		}
		return true;
	}
	
	public T pop() {
		if(stack.getObject() == null) {
			return null;
		}
		else { 
			return null;
		}
	}

}
