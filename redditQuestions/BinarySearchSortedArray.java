package redditQuestions;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class BinarySearchSortedArray {

	public static void main(String[] args) {
		int num = 88;
		int[] array = {1,2,3,44,55,66,88,222,434,565,888,988};
		int elem = binarySearch(array, num);
		System.out.println("Index of the elemnet "+num +" is : "+elem);
	}

	/**
	 * @param array
	 * @param i
	 * @return
	 */
	private static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length-1;
		
		while(low<=high){
			int mid = (low + high)/2;
			
			if(key < array[mid]) high = mid-1;
			else if(key > array[mid]) low = mid+1;
			else return mid;
			
		}
		return -1;
	}

}
