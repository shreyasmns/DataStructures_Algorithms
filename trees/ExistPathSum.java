package trees;

public class ExistPathSum {
	
	public static String path="";

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(12);
		root.right.left = new Node(12);
		root.right.right = new Node(2);
		
		findPath(root, 27, path);
	}

	private static void findPath(Node root, int sum, String path) {
			
		if(root != null){
		if(root.data > sum)
			return;
		
		path += " "+root.data + " --> ";
		sum = sum-root.data;
		if(sum == 0){
			System.out.println(path.substring(0, path.length()-5));
			System.out.println("");
		}
		
		findPath(root.left, sum, path);
		findPath(root.right, sum, path);
	  }
	}

}
