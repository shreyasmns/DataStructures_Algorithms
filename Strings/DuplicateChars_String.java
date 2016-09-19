package google;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class DuplicateChars_String {

	public static void main(String[] args) {
		printDupliacteChars("shreyasyashas");
	}

	/**
	 * @param string
	 */
	private static void printDupliacteChars(String string) {
		char[] characters = string.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char character : characters){
			if(charMap.containsKey(character)){
				charMap.put(character, charMap.get(character)+1);
			} else{
				charMap.put(character, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		
		System.out.println("List of Duplicate Chars in a word are : ");
		
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue() > 1)
				System.out.println("char : "+entry.getKey() + " Value : "+entry.getValue());
		}
	}

}
