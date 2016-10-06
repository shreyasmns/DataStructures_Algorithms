package tress;

import java.util.Stack;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class SpiralLevelOrder {

	public static void main(String[] args) {
		
		Node root = new Node(15);
		root.left = new Node(10);
		root.right =new Node(20);
		root.left.left = new Node(5);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(24);
		
		SpiralLevelOrder sl = new SpiralLevelOrder();
		sl.spiralLevelOrder(root);
		
	}

	/**
	 * @param root
	 */
	private void spiralLevelOrder(Node root) {
		
		if(root == null) return;
		
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		
		stack1.push(root);
		
	while(!stack1.isEmpty() || !stack2.isEmpty()){
		while(!stack1.isEmpty()){
			Node current = stack1.pop();
			System.out.print(" "+current.data);
			
			if(current.left != null)  stack2.push(current.left);
			if(current.right != null) stack2.push(current.right);
		}
		
		while(!stack2.isEmpty()){
			Node current = stack2.pop();
			System.out.print(" "+current.data);
			
			if(current.right != null) stack1.push(current.right);
			if(current.left != null)  stack1.push(current.left);
		}
	  }
	}

}
