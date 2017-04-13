package practice4;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class BinaryRepNumber {

	public static void main(String[] args) {
		
		bin(8);
		System.out.println(" ");
		
		bin(18);
	}

	private static void bin(int n) {
		if(n > 1)
			bin(n/2);
		
		System.out.print(" "+(n%2));
	}

}

