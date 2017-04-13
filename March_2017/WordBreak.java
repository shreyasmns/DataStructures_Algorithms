package tPractice;

import java.util.Set;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class WordBreak {

	public boolean workBreak(String s, Set<String> dict){
		
		int n = s.length();
		boolean dp[] = new boolean[n+1];
		dp[n] = true;
		
		for(int i = n-1; i >= 0; --i){
			for(int j=i; j<n; ++j){
				if((dict.contains(s.substring(i, j+1)) && dp[j+1])){
					dp[i] = true;
					break;
				}
			}
		}
		return dp[0];
	}

}
