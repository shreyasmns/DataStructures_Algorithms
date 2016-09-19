package google;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class NumberOf1s_in_Integer {

	public static void main(String[] args) {
		int number = 12;
		countNumberofOnes(number);
	}

	/**
	 * @param input
	 */
	private static void countNumberofOnes(int number) {
		int count = 0;
		
		for(int i=0; i<32; i++){
			if((number&1) ==1){
				count++;
			}
			number  = number >>> 1;
		}
		System.out.println("Number of Ones in input : "+count);
	}

}
