package practice;

import java.util.Scanner;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class Palindrome  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String ");
		String input = sc.nextLine();
		sc.close();
		
		Palindrome pl = new Palindrome();
		Boolean result = pl.isPalindrome(input);
		System.out.println("Is Palindrome : "+result);
		
		// Usig String Builder
		Boolean res = pl.isItPalindrome(input);
		System.out.println("Palindrome using String builder : "+res);
	}

	/**
	 * @param input
	 * @return
	 */
	private Boolean isItPalindrome(String input) {
		return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
	}

	/**
	 * @param input
	 * @return
	 */
	private Boolean isPalindrome(String input) {
		
		int start = 0;
		int end = input.length()-1;
		
		while(end > start){
			if(!input.substring(start, start+1).equalsIgnoreCase(input.substring(end, end+1))){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
