package trees2;

import java.util.LinkedList;
import java.util.Queue;


/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class RightViewofBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		System.out.println("Right View of a Binary Tree : ");
		RightViewofBinaryTree rv = new RightViewofBinaryTree();
		rv.rightView(root);
	
	}

	/**
	 * @param root
	 */
	private void rightView(Node root) {
		
	if(root == null)
		return;
	
	Queue<Node> q = new LinkedList<Node>();
	q.add(root);
	
	while(!q.isEmpty()){
		
		Node node = q.poll();
		System.out.print(" "+node.data);
		
		if(node.right != null)
			q.add(node.right);
		}
	}
}

class Node{
	Node left;
	Node right;
	int data;
	
	Node(int data){
		this.data = data;
	}
}