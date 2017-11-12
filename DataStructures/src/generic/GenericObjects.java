package generic;

import linked_list.SimpleLinkedList;

public class GenericObjects {
		
	public static void main(String[] args) {
		SimpleLinkedList<String> list1 = new SimpleLinkedList<>();
		SimpleLinkedList<Integer> list2 = new SimpleLinkedList<>();
		SimpleLinkedList<Character> list3 = new SimpleLinkedList<>();

		// Notice how I'm able to use any type from my own linked list object
		// It's because I included the <T> for any type to be incorporated into the object type
		// Check out the other classes for other examples
	}

}
