package amazon;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class Missing_No_From_Sequence {

	public static void main(String[] args) {
		int[] array = {12, 13, 14, 15,16, 17, 18,19, 21, 22, 23};
		System.out.println("\nMissing Number is : "+binarySearch(array, 0, array.length-1, array.length-1));
	}

	/**
	 * @param array
	 * @param start
	 * @param end
	 * @param lastIndex
	 * @return int
	 */
	private static int binarySearch(int[] arr, int start, int end, int lastindex) {
		System.out.println("Start : "+start + "   end : "+end);
		
		if(start > end)
			return -1;
		int mid = (start+end)/2;
		System.out.println("Mid : "+mid);
		
		if(mid-1 > 0 && arr[mid]-1 != arr[mid-1])
			return arr[mid]-1;
		
		else if(mid+1 <= lastindex && arr[mid]+1 != arr[mid+1])
			return arr[mid]+1;
		
		else{
			if(arr[mid] - arr[0] == mid-0)
				return binarySearch(arr, mid+1, end, lastindex);
			else 
				return binarySearch(arr, 0, mid-1, lastindex);
		}
	}

}
