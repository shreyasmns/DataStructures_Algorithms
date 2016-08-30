package arrays;

public class Maximum_SubArray {

	public static void main(String[] args) {
			int[] array = {1, 2, -3, -4, 2, -7, -2, 8};
			
			int maxsubarray = findMaxSubArrray(array);
			System.out.println("The Maximum SubArray is :"+maxsubarray);
	}

	private static int findMaxSubArrray(int[] array) {
		
		int[] solution = new int[array.length+1];
		
		solution[0] = 0;
		
		for(int i=1;i< solution.length; i++){
			solution[i] = Math.max(solution[i-1]+array[i-1], array[i-1]);
		}
		
		int result = solution[0];
		
		for(int i=0; i< solution.length; i++){
			if(result < solution[i])
				result = solution[i];
		}
		
		return result;
	}
}
