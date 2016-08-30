package trees;

public class MaximumElement_BinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(106);
		root.right.right = new Node(24);
		
		System.out.println("Maximum Element is : "+findMax(root));

	}

	private static int findMax(Node root) {
		
		if(root != null){
			return max(root.data, findMax(root.left), findMax(root.right));
		}
		else
			return -1;
	}

	private static int max(int data, int left, int right) {
		
		return Math.max(data, Math.max(left,  right));
	}

}
