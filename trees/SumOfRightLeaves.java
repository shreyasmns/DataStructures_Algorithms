package trees;

public class SumOfRightLeaves {

	public static int rightLeavesSum = 0;
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		sumRightleaves(root, root);
		
		System.out.println("Sum of right leaves : "+rightLeavesSum);
	}

	private static void sumRightleaves(Node root, Node parent) {
			
		if(root != null){
			
			sumRightleaves(root.left, root);
			
			if(root.left ==null && root.right == null && parent.right == root){
				rightLeavesSum += root.data;
			}
			
			sumRightleaves(root.right, root);
		}
	}
}
