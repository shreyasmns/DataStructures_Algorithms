package trees;

public class DeepestNode {
	
	static int deepestLevel=0;
	static int deepestNode;

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right.left = new Node(12);
		root.right.right = new Node(20);
		
		root.left.left.left = new Node(88);
		
		int ans = findDeepest(root, 0);
		System.out.println("\nDeepest Node in the Binary Tree : "+ans);

	}

	private static int findDeepest(Node root, int level) {
			
			if(root != null){
				
				findDeepest(root.left, ++level);
				
				if(deepestLevel < level){
					deepestLevel = level;
					deepestNode = root.data;
				}
				findDeepest(root.right, level);
				
			}
			return deepestNode;
	}

}
