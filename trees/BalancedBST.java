package tress;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class BalancedBST {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7};
		BalancedBST bst = new BalancedBST();
		Node root = bst.createBalancedBST(array1, 0, array1.length);
		System.out.println("Root of the Tree : "+root.data);
	}

	/**
	 * @param array1
	 */
	private Node createBalancedBST(int[] array1, int start, int end) {
		
		if(start > end)  return null;
		
		int mid = (start+end)/2;
		System.out.println("mid : "+mid +",   mid-1 : "+(mid-1)+",    mid+1 : "+(mid+1));
		Node root = new Node(array1[mid]);
		root.left = createBalancedBST(array1, start, (mid-1));
		root.right = createBalancedBST(array1, (mid+1), end);
		
		return root;
	}

}
