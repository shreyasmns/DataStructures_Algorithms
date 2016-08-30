package trees;

public class BST_Search_Recursion {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		System.out.println("\n Is 12 Prsesnt : "+isPresent(root,12));
	}

	private static boolean isPresent(Node root, int i) {
			if(root == null)
				return false;
		
			if(root.data == i){
				return true;
			}
			else {
				return isPresent(root.left, 12) || isPresent(root.right, 12);
			}
	}

}
