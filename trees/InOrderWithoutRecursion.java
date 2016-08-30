package trees;

import java.util.Stack;

public class InOrderWithoutRecursion {

	public static void main(String[] args) {
			
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		System.out.println("Inorder Traversal : Recursive Method : ");
		inOrderTraversal(root);
		System.out.println("\nInoreder Traversal : Using Stack : ");
		inOrderUsingIteration(root);
	}

	private static void inOrderUsingIteration(Node root) {
		
		Stack<Node> s = new Stack<Node>();
		
		while(true){
			
			while(root != null){
				s.push(root);
				root = root.left;
			}
			
			if(s.isEmpty())
				return;
			
			root = s.pop();
			System.out.print(" "+root.data);
			root = root.right;
		}
		
	}

	private static void inOrderTraversal(Node root) {
		if(root != null){
			inOrderTraversal(root.left);
			System.out.print(" "+root.data);
			inOrderTraversal(root.right);
		}
		
	}

}
