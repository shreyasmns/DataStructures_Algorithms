package trees;

import java.util.LinkedList;
import java.util.Queue;

// BST search using queue, ie without using Recursion
public class BST_Search_without_recursion {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		System.out.println("\n Is 20 Prsesnt : "+isPresent(root,20));
		
	}

	private static boolean isPresent(Node root, int i) {
		
		if(root != null){
		
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			
			while(!q.isEmpty()){
				Node node = q.poll();
				if(node.data == i)
					return true;
				if(node.left != null)
					q.add(node.left);
				if(node.right != null)
					q.add(node.right);
			}
		}
		return false;
	}

}
