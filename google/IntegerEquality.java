package google;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class IntegerEquality {

	public static void main(String[] args) {
		Integer x=400, y=400;
		
		if(x==y)
			System.out.println("Same");
		else
			System.out.println("Not Same");
		
		/*
		 * In Java, values from -128 to 127 are cached,
		 * so the same objects are returned. The implementation 
		 * of valueOf() uses cached objects if the value is between -128 to 127.
		 */
		Integer x1=40, y1=40;
		if(x1==y1)
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}
