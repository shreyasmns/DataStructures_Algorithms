package google;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class Anagrams {

	public static void main(String[] args) {
		Anagrams an = new Anagrams();
		boolean anagrams = an.checkForAnagrams("word","word");
		System.out.println("Are Two Strings Anagrams : "+anagrams);
	}

	/**
	 * @param string
	 * @param string2
	 * @return
	 */
	private boolean checkForAnagrams(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;

		char[] s1Char = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		
		for(Character ch : s1Char){
			int index = sb.indexOf(""+ch);
			if(index != -1){
				sb.deleteCharAt(index);
			} else{
				return false;
			}
		}
		
		return sb.length()==0 ? true : false;
	}
}
