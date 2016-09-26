package trees2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class MaximunWidth {
	
	public static int maxwidth = 0;
	
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(7);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		MaximunWidth maxwidth = new MaximunWidth();
		maxwidth.findMaxWidth(root);
		
		
	}

	/**
	 * @param root
	 */
	private void findMaxWidth(Node root) {
		int levelNodes = 0;
		if(root == null)
			return;
			
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()){
			levelNodes = q.size();
			
			if(levelNodes > maxwidth)
				maxwidth = levelNodes;
			
			while(levelNodes > 0){
				Node n = (Node)q.remove();
				
				if(n.left != null)   q.add(n.left);
				if(n.right != null)  q.add(n.right);
				levelNodes--;
			}
		}
		System.out.println("Maximum Width of Tree : "+maxwidth);
	}
}
