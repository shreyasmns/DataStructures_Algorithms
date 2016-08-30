package recursion;

public class GreaterSum_Tree {
	
	static int sum = 0;

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(24);
		
		System.out.println("InOrder Traversal : ");
		inOrder(root);
		
		System.out.println("\nGreater Sum Tree : ");
		greaterSum(root);
		inOrder(root);
	}

	private static void inOrder(Node root) {
		
		if(root != null){
			inOrder(root.left);
			System.out.print(" "+root.data);
			inOrder(root.right);
		}
			
	}

	private static void greaterSum(Node root) {
			
		if(root != null){
				
			greaterSum(root.right);
			
			int temp = root.data;
			root.data = sum;
			sum = sum+temp;
			
			greaterSum(root.left);
		}
	}
}


class Node{
	Node left;
	Node right;
	int data;
	
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
