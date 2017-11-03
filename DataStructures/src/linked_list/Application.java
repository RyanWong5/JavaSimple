package linked_list;

public class Application {

	public static void main(String[] args) {
		// LinkedLists (SimpleLinkedList) 
		// - uses LLNodes (of objects and reference to other nodes)
		
		SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
		list.prepend(1);
		list.prepend(5);
		list.prepend(2);

		System.out.println(list);
	}
	
}
