package amazon;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 * int[] A = { 1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2 };
 *
 * length of LIS is 7 and LIS is {1, 12, 23, 52, 61, 69, 70}.
 */
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] A = { 1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2 };
		LongestIncreasingSubsequence i = new LongestIncreasingSubsequence();
		i.findSubsequence(A);
	}

	/**
	 * @param a
	 */
	private void findSubsequence(int[] a) {
		int[] LIS = new int[a.length];
		
		for(int i=0; i<a.length; i++){
			int max = -1;
			
			for(int j=0; j< i; j++){
				if(a[i]> a[j]){
					if(max== -1 || max < LIS[j]+1){
						max = 1+ LIS[j];
					}
				}
			}
			if(max == -1) max = 1;
			LIS[i]= max;
		}
		
		int result = -1;
		int index = -1;
		
		for(int i=0; i<LIS.length; i++ ){
			if(result < LIS[i]){
				result = LIS[i];
				index=i;
			}
		}
		// Print the result
		
		String path = a[index]+" ";
		int res = result-1;
		for(int i=index-1; i>=0; i--){
				if(LIS[i] == res){
					path = a[i]+ " "+path;
					res--;
				}
		}
		System.out.println("Longest Increasing subsequence: " + result);
		System.out.println("Actual Elements: " + path);
	}
}
