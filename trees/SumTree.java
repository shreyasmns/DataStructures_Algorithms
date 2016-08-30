package trees;

public class SumTree {
	
	public Node newRoot;

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
		root.right.left = new Node(12);
		root.right.right = new Node(17);
		
		SumTree st = new SumTree();
		System.out.print("Original Tree : ");
		st.display(root);
		
		st.calculateSum(root);
		 
		System.out.println("");
		System.out.print("Sum Tree :      ");		
		st.display(root);
	}

	private int calculateSum(Node root) {
		
		if(root != null){
			int left = calculateSum(root.left);
			int right = calculateSum(root.right);
			int returnData = root.data + left+ right;
			root.data = left+right;
			newRoot = root;
			return returnData;
		}
		return 0;
	}

	public void display(Node root) {
		if(root != null){
			
			display(root.left);
			System.out.print(" "+root.data);
			display(root.right);
		}
	}
}
