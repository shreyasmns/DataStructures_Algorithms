package practice;

import java.util.Scanner;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class PermutationofString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String ");
		String input = sc.nextLine();
		
		PermutationofString sp = new PermutationofString();
		sp.printStringPermutations("",input);
		sc.close();
		
	}

	/**
	 * @param string
	 * @param input
	 */
	private void printStringPermutations(String prefix, String input) {
		int n = input.length();
		
		if(n==0) System.out.println(prefix);
		else{
			
			for(int i=0; i< input.length(); i++){
				printStringPermutations(prefix+ input.charAt(i), input.substring(0,i)+input.substring(i+1, n));
			}
		}
		
		
	}

}
