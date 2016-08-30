package trees;

public class DeepestLeftNode {
	
	int deepestLevel = 0;
	int deepLeftNode;

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		root.left.left.left = new Node(1);
		
		DeepestLeftNode dp = new DeepestLeftNode();
		System.out.println("Deepest Left Node : "+dp.deepLeft(root));
	}

	private int deepLeft(Node root) {
		
		find(root, 0, true);
		return deepLeftNode;
	}

	private void find(Node root, int level, boolean left) {
		
		if(root != null){
			
			find(root.left, ++level, true);
			
			if(left && deepestLevel < level){
				deepestLevel = level;
				deepLeftNode = root.data;
			}
			
			find(root.right, level, false);
		}
	}
}
