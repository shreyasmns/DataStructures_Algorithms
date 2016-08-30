package arrays;
import java.util.Arrays;

public class Reverse_Array {
	
	static int[] a;

	public static void main(String[] args) {
		a = new int[]{5, 88, 44, 22, 2, 8};
		
		System.out.println("Original Array :        "+Arrays.toString(a));
		
		reverseIteration();
		System.out.println("Reversing : Iteration : "+Arrays.toString(a));
		
		reverseRecursion(0, a.length-1);
		System.out.println("Reversing : Recursion : "+Arrays.toString(a));
	}

	private static void reverseIteration() {
			int start = 0;
			int end = a.length-1;
			
			while(start <  end ){
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
	}
	

	private static void reverseRecursion(int start, int end) {
		
			if(start <  end){
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
				reverseRecursion(start, end);
		}
	}
}
