package practice;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class Anagrams {

	public static void main(String[] args) {
		
		Anagrams anagrams = new Anagrams();
		boolean result = anagrams.checkForAnagrams("word", "word");
		System.out.println("\nInputs Are Anagrams ? : "+result);
	}

	/**
	 * @param string
	 * @param string2
	 * @return
	 */
	private boolean checkForAnagrams(String s1, String s2) {
		
		if(s1.length() != s2.length()){
			return false;
		}
		
		char[] s1Char = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		
		for(char ch : s1Char){
			int index = sb.indexOf(""+ch);
			if(index != -1){
				sb.deleteCharAt(index);
			}
		}
		
		return sb.length()==0 ? true : false;
		
	}
}
