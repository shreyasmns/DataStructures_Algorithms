package redditQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class PairOfIntegersSum {

	public static void main(String[] args) {
		Integer[] arr = {1,9,2,8,3,7,4,6,5,5,11,-1,12,-2};
		PairOfIntegersSum pairs = new PairOfIntegersSum();
		System.out.println("The Integer pairs are :");
		pairs.printPairs(arr,10);
	}

	/**
	 * @param arr
	 * @param i
	 */
	private void printPairs(Integer[] arr, int n) {
		if(arr.length < 2)
			return;
		
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
		
		for(int value : arr){
			int target = n -value;
			
			if(set.contains(target)){
				System.out.printf("%d %d ", value, target);
				System.out.println();
			}
		}
	}
}
