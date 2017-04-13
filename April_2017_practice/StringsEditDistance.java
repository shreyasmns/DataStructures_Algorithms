package practice4;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class StringsEditDistance {

	public static void main(String[] args) {
		String s1 = "Yashas";
		String s2 = "Shreyas";
		
		int res = editDistance(s1,s2, s1.length(), s2.length());
		System.out.println("Distance required between s1 and s2 is : "+res);
	}

	private static int editDistance(String s1, String s2, int m, int n) {
		
		if(m == 0) return n;
		
		if(n == 0) return m;
		
		if(s1.charAt(m-1) == s2.charAt(n-1))
		  return editDistance(s1, s2, m-1, n-1);
		
		return 1+ min (
						editDistance(s1, s2, m, n-1),
						editDistance(s1, s2, m-1, n),
						editDistance(s1, s2, m-1, n-1));
	}

	private static int min(int dist1, int dist2, int dist3) {
		
		return Math.min(dist1, Math.min(dist2, dist3));
	}
	
}
