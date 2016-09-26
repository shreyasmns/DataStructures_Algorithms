package amazon;

public class Deepest_Node_BinaryTree {

	static int deepestLevel = 0;
	static int deepestNode;
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		root.left.left.left = new Node(1);
		
		int answer = findDeepestNode(root);
		System.out.println("\n The Deepest Node in the Binary Tree : "+answer);
	}

	private static int findDeepestNode(Node root) {
			find(root, 0);
			return deepestNode;
	} 

	private static void find(Node root, int level) {
		
		if(root != null){
		find(root.left, ++level);
		if(deepestLevel < level ){
			deepestNode = root.data;
			deepestLevel = level;
		}
		find(root.right, level);
	   }
	}
}



class Node{
	Node left;
	Node right;
	int data;
	
	public Node(int data){
		this.data = data;
	}
}