package tress;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class LowestCommonAncestor {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(10);
		root.right =new Node(20);
		root.left.left = new Node(5);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(24);
		
		LowestCommonAncestor lca = new LowestCommonAncestor();
		Node result = lca.lowestCommonAncestor(root, new Node(5), new Node(12));
		System.out.println("Lowest Common ancestor : "+result.data);

	}

	private Node lowestCommonAncestor(Node root, Node node1, Node node2) {
				
		if(root.data > Math.max(node1.data, node2.data))
			return lowestCommonAncestor(root.left, node1, node2);
		else if(root.data < Math.min(node1.data, node2.data))
			return lowestCommonAncestor(root.right, node1, node2);
		else 
			return root;
	}

}
