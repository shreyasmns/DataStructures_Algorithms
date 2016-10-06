package tress;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class DiameterOfTree {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(10);
		root.right =new Node(20);
		root.left.left = new Node(5);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(24);
		root.right.right.right = new Node(44);
		
		System.out.println("Diameter of a Tree : "+String.valueOf(diameter(root)));

	}

	/**
	 * @param root
	 */
	private static int diameter(Node root) {
		if(root != null){
			
			int lefth = getHeight(root.left);
			int righth = getHeight(root.right);
			
			int leftDiam = diameter(root.left);
			int rightdiam = diameter(root.right);
			
			return Math.max(lefth+righth+1, Math.max(leftDiam, rightdiam));
			
		}
		return 0;
	}

	/**
	 * @param left
	 * @return
	 */
	private static int getHeight(Node node) {
		
		if(node!= null){
			return 1+Math.max(getHeight(node.left), getHeight(node.right));
		}
		return 0;
	}

}
