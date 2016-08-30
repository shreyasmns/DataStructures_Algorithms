package trees;

public class DeleteBinaryTree {

	public static void main(String[] args) {
			
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		deleteTree(root);
	}

	private static void deleteTree(Node root) {
			
		while(root != null){
			
			deleteTree(root.left);
			deleteTree(root.right);
			System.out.println(" Deleting the Node : "+root.data);
			root = null;
		}
	}

}
