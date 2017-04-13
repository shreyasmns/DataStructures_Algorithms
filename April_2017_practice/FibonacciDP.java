package practice4;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class FibonacciDP {

	public static void main(String[] args) {
		int[] result= fibonacciDP(20);
		System.out.println("Fibonacci Series : ");
		for(int i=0; i< result.length; i++){
			System.out.print(" "+result[i]);
		}
	}

	private static int[] fibonacciDP(int n) {

		int[] fib = new int[n];
		fib[0] = 0;
		fib[1] = 1;
		
		if(n==0 || n== 1) return fib;
		
		for(int i=2; i< n; i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib;
	}

}
