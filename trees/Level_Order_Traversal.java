package trees;

import java.util.LinkedList;
import java.util.Queue;

// Level Order Traversal is also known as  -  Breadth First Search (BFS)
public class Level_Order_Traversal {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		System.out.println("Level Order Traversal (BFS) : ");
		levelOrderTraversal(root);
	}

	private static void levelOrderTraversal(Node root) {
		
		if(root == null)
			return;
		
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		while(!q.isEmpty()){
			
			Node node = q.poll();
			System.out.print(" "+node.data);
			
			if(node.left != null)
				q.add(node.left);
			
			if(node.right != null)
				q.add(node.right);
		}
	}

}
