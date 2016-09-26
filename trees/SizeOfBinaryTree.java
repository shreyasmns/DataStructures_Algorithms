package trees2;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class SizeOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(18);
		root.right.right = new Node(28);
		root.right.right.right = new Node(44);
		
		SizeOfBinaryTree size = new SizeOfBinaryTree();
		int sizeoftree = size.findSizeofTree(root);
		System.out.println("Size of Binary Tree : "+sizeoftree);
	}

	/**
	 * @param root
	 */
	private int findSizeofTree(Node root) {
		if(root == null)
			return 0;
		
		return 1+findSizeofTree(root.left) + findSizeofTree(root.right);
		
	}

}
