package trees;

import java.util.Stack;

public class PreOrderWithoutRecursion {

	public static void main(String[] args) {
		
			Node root = new Node(10);
			root.left = new Node(5);
			root.right = new Node(15);
			root.left.left = new Node(2);
			root.left.right = new Node(8);
			root.right.left = new Node(12);
			root.right.right = new Node(20);
			
			System.out.println("Pre Order Traversal Using Recursion : ");
			preOrderRecursion(root);
			System.out.println("\nPre Order Traversal Using Iteration: ");
			preOrderIteration(root);
	}

	private static void preOrderIteration(Node root) {
			if(root != null){
				System.out.print(" "+root.data);
				preOrderIteration(root.left);
				preOrderIteration(root.right);
			}
	}

	private static void preOrderRecursion(Node root) {
			
			Stack<Node> s = new Stack<Node>();
			while(true){
				
				while(root != null){
					System.out.print(" "+root.data);
					s.push(root);
					root = root.left;
				}
				
				if(s.isEmpty())
					return;
				
				root = s.pop();
				root = root.right;
			}
	  }
}
