package stack;

public class StackApplication {
	
	public static void main(String[] args) {
		MyStack <String> stack = new MyStack<>();
		stack.push("Hello");
		stack.push("World");
		stack.push("It's");
		stack.push("Me");
		
		for(int i = 0; i < 4; i++)
			System.out.println(stack.pop());

	}

	/**
	 * Stack is a First in First Out (FIFO) data structure
	 * I used the LLNode from the linked_list package to create the custom structure
	 */
	
}
