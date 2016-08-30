package trees;

import java.util.Stack;

public class DFS_BinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		System.out.println(" DFS of a Binary Tree : ");
		dfs(root);
	}

	private static void dfs(Node root) {
		
		if(root != null){
			
			Stack<Node> s = new Stack<Node>();
			s.add(root);
			
			while(!s.isEmpty()){
				Node x = s.pop();
				if(x.right != null)s.add(x.right);
				if(x.left != null) s.add(x.left);
				System.out.print(" "+x.data);
				
			}
			
			
		}
	}

}
