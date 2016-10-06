package tress;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class BFS_LevelOrderTraversal {

	public static void main(String[] args) {
			
		Node root = new Node(15);
		root.left = new Node(10);
		root.right =new Node(20);
		root.left.left = new Node(5);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(24);
		
		System.out.println("BFS or Level Order Traversal :");
		BFS(root);
	}

	/**
	 * @param root
	 */
	private static void BFS(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		
		if(root == null)
			return;
		
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
class Node {
	Node left;
	Node right;
	int data;
	
	Node(int data){
		this.data = data;
	}
}