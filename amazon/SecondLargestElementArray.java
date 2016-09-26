package amazon;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class SecondLargestElementArray {

	public static void main(String[] args) {
		int[] A = {1,2,10, 20, 888, 44,66, 4444, 22, 34};
		findSecondLargest(A);
	}
	
	
	/**
	 * @param a
	 */
	private static void findSecondLargest(int[] A) {
			int firstLargest = A[0];
			int secondLargest = -1;
			
			for(int i=0; i<A.length; i++){
				if(firstLargest < A[i]){
					secondLargest = firstLargest; 
					firstLargest = A[i];
				}
				else if(secondLargest < A[i]){
					secondLargest = A[i];
				}
			}
			System.out.println("Second Largest Number in the Array : "+secondLargest);
	}

}
