package arrays;

import java.util.Arrays;

/*Replace element of an Array with nearest bigger number at right side of the Array in O(n) 
 * 
	For example if the input Array is 
	7, 5, 6, 3, 4, 1, 2, 9, 11 
	output array should be 
	9, 6, 9, 4, 9, 2, 9, 11, 11 */

public class ReplaceArrayElement_MaximumRight {

	public static void main(String[] args) {
			
			int[] a = {1, 44,22, 4, 40, 56, 57, 41};
			System.out.println(" Original Array : "+Arrays.toString(a));
			printMaxRightArray(a);
	}

	private static void printMaxRightArray(int[] a) {
			if(a == null) return;
			
			int i=0;
			int j=i+1;
			
			while( i < a.length && j < a.length){
				if(a[i] < a[j]){
					a[i] = a[j];
					i++;
					j = i+1;
				}
				else{
					if(j == a.length-1){
						i++;
						j=i+1;
					}
					else{
						j++;
					}
				}
			}
			System.out.println(" Required Array : "+Arrays.toString(a));
		
	}

}
