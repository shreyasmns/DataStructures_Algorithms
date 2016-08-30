package trees;

public class TopView_Binart_Tree {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		root.left.left.left = new Node(1);
		
		System.out.println("The Top View : ");
		printTopView(root);
		
		int height = heightOfBinaryTree(root);
		System.out.println("\nHeight of this Binary Tree is : "+height);
	}

	private static int heightOfBinaryTree(Node root) {
			if(root == null)
				return 0;
			
			return Math.max(heightOfBinaryTree(root.left)+1, heightOfBinaryTree(root.right)+1);
	}

	private static void printTopView(Node root) {
		if(root != null){
			topLeftView(root);
			topRightView(root.right);
	} }

	private static void topLeftView(Node root) {
		if(root != null){
			topLeftView(root.left);
			System.out.print(" "+root.data);
		}
	} 


	private static void topRightView(Node root) {
		if(root != null){
			System.out.print(" "+root.data);
			topRightView(root.right);
		}
	}
}
