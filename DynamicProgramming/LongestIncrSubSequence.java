package google;

import java.util.Arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class LongestIncrSubSequence {

	public static void main(String[] args) {
		
		int[] arr = {10, 9, 2,5,3,7,102,104, 108,18};
		int len = lengthOfLIS_DP(arr);
		System.out.println("\nLength of Longest Increasing Subsequence : "+len);
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int lengthOfLIS_DP(int[] nums) {
		int[] dp = new int[nums.length];
		int len = 0;
		
		for(int x : nums){
			int i = Arrays.binarySearch(dp, 0, len, x);
			
			if(i < 0) i = -(i+1);
			dp[i] = x;
			if(i==len){
				len++;
			}
		}
		return len;
	}

}
