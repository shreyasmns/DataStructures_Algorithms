/*
You are given a large string. You need to cut the string into chunks such that each sub­string that you get is a palin­drome. Remem­ber that each 1 length string is always a palin­drome. You need to find the min­i­mum num­ber of cuts that you need to make such that each sub­string is a palindrome.

Exam­ple:

String x = "xabaay"
5 cuts makes all the substrings palindrome : x, a, b, a, a, y
4 cuts makes all the substrings palindrome : x, a, b, aa, y
3 cuts makes all the substrings palindrome : x, aba, a, y
Output: 3 cuts

We will use Hash Map and store the solu­tion of sub prob­lems. So every time we make a cut,
we check whether we have already solved the sub prob­lem by check­ing its entry in Hash Map,
if yes then use it and if not then solve it and store it in HashMap for future use.

Now this way every prob­lem will be solved only once. Time Com­plex­ity will be num­ber of
sub prob­lems so it will O(N2).
*/

package dynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class SplitStringintoMinPalindromes {
	
	static HashMap<String, Integer> solutions = new HashMap<String, Integer>();
	
	public int splitDP(String s){
		int leftSolution = 0;
		int rightSolution = 0;
		
		if(s=="" || isPalindrome(s)){
			System.out.println("s");
			return 0;
		}
		
		int cuts = Integer.MAX_VALUE;
		for(int i=1; i< s.length(); i++){
			
			
			String leftPart = s.substring(0,i);
			String rightPart = s.substring(i, s.length());
			
			if(solutions.containsKey(leftPart)){
				leftSolution = solutions.get(leftPart);
			}
			else{
				leftSolution = splitDP(leftPart);
				solutions.put(leftPart, leftSolution);
			}
			
			if(solutions.containsKey(rightPart)){
				rightSolution = solutions.get(rightPart);
			}
			else{
				rightSolution = splitDP(rightPart);
				solutions.put(rightPart, rightSolution);
			}
		}
		return Math.min(1+ leftSolution + rightSolution, cuts);
	}
	
	
	public boolean isPalindrome(String s){
		
		int n = s.length();
		for(int i=0; i< (n/2)+1; ++i){
			if(s.charAt(i) !=  s.charAt(n-i-1)){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string You want to be tested :");
		String in = sc.next();
		
		SplitStringintoMinPalindromes s = new SplitStringintoMinPalindromes();
		long startTime = System.currentTimeMillis();
		int cuts = s.splitDP(in);
		long stopTime = System.currentTimeMillis();
		System.out.println(" Number of cuts required by Dynamic Programming : "+cuts);
		System.out.println(" Time reuqired By Dynamic Programming : "+(stopTime - startTime)+ " mili seconds");
	}

}
