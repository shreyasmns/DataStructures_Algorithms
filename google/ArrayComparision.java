package google;

import java.util.Arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class ArrayComparision {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		if(arr1 == arr2)
			System.out.println("== Same");
		else
			System.out.println("== NOT Same");
		
		
		
		if(arr1.equals(arr2))
			System.out.println("equals Same");
		else
			System.out.println("equals NOT Same");
		
		
		
		if(Arrays.equals(arr1, arr2))
			System.out.println("Arrays.equals Same");
		else
			System.out.println("Arrays.equals NOT same");
	}	

}
