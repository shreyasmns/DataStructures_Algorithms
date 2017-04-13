package practice4;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class SpecialRevString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String input ="ab%3$nmb*op";
		System.out.println("Original String : "+input);
		reverseString(input);
		
	}

	private static void reverseString(String input) {
		
		int n = input.length();
		int l=0, r = n-1;
		
		while(l < r){
			
			if(!isAlphabet(input.charAt(l))) 
				l++;
			
			else if(!isAlphabet(input.charAt(r))) 
				r--;
			
			else{
				//swap(input[l], input[r]);
				l++;
				r--;
			}
		}
		System.out.println("Reversed String : "+input.toString());
		
	}

	private static boolean isAlphabet(char c) {
		if(((int) c >=65 && (int)c <= 122) && ((int) c >=48 && (int)c <=57))
			return true;
		
		return false;
	}

}
