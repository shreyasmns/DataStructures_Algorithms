package tress;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class ReverseLevelOrder {

	public static void main(String[] args) {
		
		Node root = new Node(15);
		root.left = new Node(10);
		root.right =new Node(20);
		root.left.left = new Node(5);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(24);
		
		ReverseLevelOrder rlo = new ReverseLevelOrder();
		rlo.reverseLevelOrder(root);
	}

	/**
	 * @param root
	 * @return
	 */
	private void reverseLevelOrder(Node root) {

		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<Node>();
		
		if(root == null) return;
		
		q.add(root);
		
		while(!q.isEmpty()){
			Node current = q.poll();
			s.push(current);
			
			if(current.right != null)
				q.add(current.right);
			if(current.left != null)
				q.add(current.left);
		}
		
		System.out.println("Reverse Level Order Traversal : ");
		while(!s.isEmpty())
			System.out.print(" "+s.pop().data);
		}
	}
