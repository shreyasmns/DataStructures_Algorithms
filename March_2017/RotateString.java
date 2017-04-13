package arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class RotateString {
	
	public static void main(String[] args){
		
		String s1 = "rotation";
		String s2 = "tationros";
		
		System.out.println("Is Rotation Substring possible : "+isRotationPossible(s1,s2));
	}

	/**
	 * @param s1
	 * @param s2
	 * @return isRotationPossible
	 */
	private static boolean isRotationPossible(String s1, String s2) {
		if(!s1.equalsIgnoreCase(null) && !s2.equalsIgnoreCase(null))
		 {
			String str = s1 + s2;
			return ((s1.length() == s2.length()) && str.contains(s2));
		 }
		return false;
	}

}
