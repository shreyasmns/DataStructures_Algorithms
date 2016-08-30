package trees;

public class Check_Mirror_Tree {

	public static void main(String[] args) {
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.left.right = new Node(3);
		root1.right = new Node(4);

		Node root2 = new Node(1);
		root2.right = new Node(2);
		root2.right.left = new Node(3);
		root2.left = new Node(8);
		
		System.out.println("If two Trees are Mirrored : "+checkMirror(root1, root2));
	}

	private static boolean checkMirror(Node root1, Node root2) {
		
		if(root1 == null && root2 == null)
			return true;
		
		if(root1.data != root2.data)
			return false;
		
		if((root1 == null && root2 != null) || (root1 != null && root2 ==null))
			return false;
		
		return (checkMirror(root1.left, root2.right) && checkMirror(root1.right, root2.left));

	}
}