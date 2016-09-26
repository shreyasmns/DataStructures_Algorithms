package redditQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class CoomonsIn2Arrays {

	public static void main(String[] args) {
		Integer[] array1 = {554,332,44,56,78,88,98, 1,2,58};
		Integer[] array2 = {33,45,67,1,2,34,88,98,0,-12,34};
		
		System.out.println("Common Elements in both Arrays : ");
		CoomonsIn2Arrays ca = new CoomonsIn2Arrays();
		ca.findCommons(array1, array2);
	}

	/**
	 * @param array1
	 * @param array2
	 */
	private void findCommons(Integer[] array1, Integer[] array2) {
			
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(array2));
		
		for(Integer val : array1){
			if(set.contains(val)){
				System.out.print(" "+val);
			}
		}
	}

}
