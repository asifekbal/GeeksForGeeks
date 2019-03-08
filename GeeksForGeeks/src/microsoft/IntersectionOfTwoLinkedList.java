package microsoft;

//Write a function to get the intersection point of two Linked Lists
public class IntersectionOfTwoLinkedList {

	public static void main(String[] args) {
		Node list1 = createLinkedList(list1);
		Node list2 = null;
		, list2);
		getIntersectionPoint();
	}

	private static void createLinkedList1(Node list1) {
		// creating first linked list
		list1 = new Node(3);
		list1.next = new Node(6);
		list1.next.next = new Node(9);
		list1.next.next.next = new Node(15);
		list1.next.next.next.next = new Node(30);
		return list1;
		// creating second linked list
		list2 = new Node(10);
		list2.next = new Node(15);
		list2.next.next = new Node(30);
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
