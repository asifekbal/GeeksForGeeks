package microsoft;

// A program to check if a binary tree is BST or not

public class CheckBST {

	public static void main(String[] args) {
		Node head = prepareTree();
		if (isBST(head)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean isBST(Node head) {
		return isBSTUtil(head, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isBSTUtil(Node ptr, int minValue, int maxValue) {
		if (ptr == null) {
			return true;
		}
		if (ptr.data < minValue || ptr.data > maxValue) {
			return false;
		}
		return isBSTUtil(ptr.left, minValue, ptr.data - 1) && isBSTUtil(ptr.right, ptr.data + 1, maxValue);
	}

	private static Node prepareTree() {
		Node head = new Node(4);
		head.left = new Node(2);
		head.right = new Node(5);
		head.left.left = new Node(1);
		head.left.right = new Node(3);
		return head;
	}

}

class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int data) {
		this.data = data;
	}
}
