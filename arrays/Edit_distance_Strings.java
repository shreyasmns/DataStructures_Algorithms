package arrays;

public class Edit_distance_Strings {
	
	public static void main(String[] args){
		
		String s1 = "horizon";
		String s2 = "horizontal";
		
		int answer = editDistance(s1, s2);
		System.out.println("Minimum distance : "+answer);
	}

	private static int editDistance(String s1, String s2) {
			
		int[][] solution = new int[1+s1.length()][1+s2.length()];
		
		//Base case
		// If any of the string is empty, then either all chars will be inserted 
		// or removed
		
		// for case where all elements will be inserted
		for(int i=0; i< s2.length(); i++){
			solution[0][i]= i;
		}
		
		// for case, where all elements will be removed
		for(int i=0; i< s1.length(); i++){
			solution[i][0] = i;
		}
		
		
		int m = s1.length();
		int n = s2.length();
		
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				
				if(s1.charAt(i-1) == s2.charAt(j-1)){
					solution[i][j]= solution[i-1][j-1];
				}
				else{
					solution[i][j] = 1+ Math.min(solution[i-1][j], // insert
										Math.min(solution[i][j-1], // removal
												solution[i-1][j-1]));// replace
				}
			}
		}
		return solution[s1.length()][s2.length()];
	}
}
