package linked_list;

public class Application {

	public static void main(String[] args) {
		
		// LinkedLists (SimpleLinkedList) 
		// - uses LLNodes (of objects and reference to other nodes)
		
		/** Prepend Test **/
		SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
		list.prepend(1);
		list.prepend(5);
		list.prepend(2);
		System.out.println(list); // Print 2, 5, 1
		
		
		/** Append Test **/
		SimpleLinkedList<Integer> list2 = new SimpleLinkedList<Integer>();
		list2.append(1);
		list2.append(5);
		list2.append(2);
		System.out.println(list2); // Print 1, 5, 2
		
		
		/** Prepend & Append Test **/
		SimpleLinkedList<Integer> list3 = new SimpleLinkedList<Integer>();
		list3.append(1);
		list3.append(5);
		list3.append(2);
		list3.prepend(1);
		list3.prepend(3);
		System.out.println(list3); // Print 3, 1, 1, 5, 2
	}
	
}
