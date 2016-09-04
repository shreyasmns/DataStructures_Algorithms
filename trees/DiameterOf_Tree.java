package trees;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class DiameterOf_Tree {

	public static void main(String[] args) {
			Node root = new Node(100);
			root.left = new Node(50);
			root.right = new Node(124);
			root.left.left = new Node(30);
			root.left.left.left = new Node(25);
			root.left.left.left.left = new Node(24);
			
			root.left.right = new Node(56);
			root.left.right.right =new Node(64);
			root.left.right.right.right = new Node(68);
			root.left.right.right.right.right = new Node(78);
			root.left.right.right.right.right.right = new Node(88);
			root.left.right.right.right.right.right.right = new Node(98);
			int diameter = getDiameter(root);
			System.out.println("\nDiameter of a Tree is : "+diameter);
	}

	/**
	 * @param root
	 * @return
	 */
	private static int getDiameter(Node root) {
		int result = 0;
		
		if(root != null){
			
			int lefth = getHeight(root.left);
			int righth = getHeight(root.right);
			
			int leftDiameter = getDiameter(root.left);
			int rightDiameter = getDiameter(root.right);
			
			result = getMax(lefth+righth+1, leftDiameter, rightDiameter);
			
		}
		return result;
	}

	/**
	 * @param i
	 * @param leftDiameter
	 * @param rightDiameter
	 * @return
	 */
	private static int getMax(int i, int leftDiameter, int rightDiameter) {
		
		return Math.max(Math.max(leftDiameter, rightDiameter), i);
		
	}

	/**
	 * @param left
	 * @return
	 */
	private static int getHeight(Node root) {
		if(root != null){
			return Math.max(getHeight(root.left)+1, getHeight(root.right)+1);
		}
		return 0;
	}

}
