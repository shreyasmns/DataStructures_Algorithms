package tPractice;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class Sqrt {

	public static void main(String[] args) {
		int x = 40;
		
		int res = sqrt(x);
		System.out.println("The sqrt of a Number "+x +" is : "+res);
	
	}
	
	private static int sqrt(int x) {
		
		int left =1, right = x/2;
		if(x < 2) return x;
		
		while(left <= right){
			
			int mid = (left +right)/2;
			
			if(x/mid == mid) return mid;
			if(x/mid > mid) left = mid+1;
			else  right = mid-1;
		}
		
		return right;
	}

}
