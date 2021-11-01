
public class Executor {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(20);
		list.insert(35);
		
//		list.insertAtStart(325);
		list.deleteAt(1);
		list.insertAt(1,325);

		list.show();
	}
}
