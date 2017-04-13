package tPractice;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class ReverseNumber {

	public static void main(String[] args) {
		int input = 12348;
		int res = reverse(input);
		System.out.println("Reversed Number : "+String.valueOf(res));
	}

	/**
	 * @param x
	 * @return rev
	 */
	private static int reverse(int x) {
		int rev = 0;
		
		while(x > 0){
			rev = rev*10 + x%10;
			x = x/10;
		}
		return rev;
	}
}
