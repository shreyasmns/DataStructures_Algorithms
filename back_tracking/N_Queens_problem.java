package back_tracking;

import java.util.Arrays;

// Better Solution to N-Queens Problem
// Space complexity - O(N)

public class N_Queens_problem {
	
	static int[] result;

	public static void main(String[] args) {
		int queens = 8;
		result = new int[queens];
		placeQueens(0, queens);
			
	}

	private static void placeQueens(int x, int size) {
			
		for(int i=0; i< size; i++){
			
			if(canPlace(x, i)){
				result[x] = i;
				
				if(x == size-1){
					System.out.println("Order of the Queens : "+Arrays.toString(result));
				}
				
				placeQueens(x+1, size);
			}
		}
	}

	private static boolean canPlace(int n, int size) {
		
		for(int i=0; i< n; i++){
			
			if((result[i]==size) || (Math.abs(result[i]-size)== Math.abs(i-n))){
				return false;
			}
		}
		return true;
	}
}
