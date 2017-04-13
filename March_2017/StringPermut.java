package tPractice;

import java.util.Arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class StringPermut {

	public static void main(String[] args) {
		String[][] pairs = {{"apple", "aplrp"},{"nine", "enin"},{"ten", "net"}};
		String word1, word2;
		for(String[] pair : pairs){
			word1 = pair[0];
			word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + " and "+word2 +" are anagrams : "+anagram);
		}
	}

	private static boolean permutation(String word1, String word2) {
		
		return sort(word1).equals(sort(word2));
	}

	private static String sort(String word) {
		
		char[] content = word.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

}
