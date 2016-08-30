package trees;

public class Tree_Traversals {

	
	// remember to use if instead of while in tree traversals
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		System.out.println(" InOrder Traversal : ");
		inOrderTraversal(root);
		
		System.out.println(" \nPreOrder Traversal : ");
		preOrderTraversal(root);
		
		System.out.println(" \nPostOrder Traversal : ");
		postOrderTraversal(root);
	
	}

	private static void preOrderTraversal(Node root) {

		if(root != null){
				System.out.print(" "+root.data);
				preOrderTraversal(root.left);
				preOrderTraversal(root.right);
			}
	}

	private static void inOrderTraversal(Node root) {
			
		if(root != null){
			inOrderTraversal(root.left);
			System.out.print(" "+root.data);
			inOrderTraversal(root.right);
		}
	}

	private static void postOrderTraversal(Node root) {
			
		if(root != null){
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(" "+root.data);
		}
	}
}
