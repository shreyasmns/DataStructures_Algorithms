package trees;

public class BSTtoGreaterSumTree {

	public static int sum = 0;
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		BSTtoGreaterSumTree b = new BSTtoGreaterSumTree();
		
		b.inorder(root);
		System.out.println("");

		b.greaterSum(root);
		b.inorder(root);
	}

	private void greaterSum(Node root2) {
		
		if(root2 != null){
			
			greaterSum(root2.right);
			
			int temp = root2.data;
			root2.data = sum;
			sum = sum+temp;
			
			greaterSum(root2.left);
			
		}
	}

	private void inorder(Node root2) {
		
		if(root2 != null){
			inorder(root2.left);
			System.out.print(" "+root2.data);
			inorder(root2.right);
		}
	}
}
