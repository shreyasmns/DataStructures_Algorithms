package google;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class InvertBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(5);
		root.left.right = new Node(12);
		root.right.left = new Node(18);
		root.right.right = new Node(26);
		
		System.out.println("Tree Before Inversion : ");
		inOrderTraversal(root);
		
		invertBinaryTree(root);
		
		System.out.println("\nTree After Inversion  : ");
		inOrderTraversal(root);
	}

	/**
	 * @param root
	 */
	private static void inOrderTraversal(Node root) {
		if(root != null){
			inOrderTraversal(root.left);
			System.out.print(" "+root.data);
			inOrderTraversal(root.right);
		}
	}

	/**
	 * @param root
	 */
	private static Node invertBinaryTree(Node root) {
		if(root != null){
			Node right = invertBinaryTree(root.right);
			Node left = invertBinaryTree(root.left);
			
			root.right = left;
			root.left = right;
		}
		return root;
	}
}

class Node{
	Node left;
	Node right;
	int data;
	
	Node(int data){
		this.data = data;
	}
}
