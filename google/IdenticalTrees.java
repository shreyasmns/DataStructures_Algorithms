package google;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class IdenticalTrees {

	public static void main(String[] args) {
		Node root1 = new Node(15);
		root1.left = new Node(10);
		root1.right = new Node(20);
		root1.left.left = new Node(5);
		root1.left.right = new Node(12);
		root1.right.left = new Node(18);
		root1.right.right = new Node(26);
		
		Node root2 = new Node(15);
		root2.left = new Node(10);
		root2.right = new Node(20);
		root2.left.left = new Node(5);
		root2.left.right = new Node(12);
		root2.right.left = new Node(18);
//		root2.right.right = new Node(26);
		
		IdenticalTrees it = new IdenticalTrees();
		boolean identical = it.checkIfIdentical(root1, root2);
		System.out.println("Given Trees Identical ?  : "+String.valueOf(identical));
	}

	/**
	 * @param root1
	 * @param root2
	 * @return
	 */
	private boolean checkIfIdentical(Node root1, Node root2) {
		
		if(root1 == null && root2 == null)
			return true;
		
		if(root1== null || root2 == null)
			return false;
		
		if(root1.data != root2.data)
			return false;
		
		boolean res = true;
		
		return (res & checkIfIdentical(root1.left, root2.left) & checkIfIdentical(root1.right, root2.right));
		
	}
}
