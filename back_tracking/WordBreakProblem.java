package back_tracking;

import java.util.HashSet;

/*Objec­tive : Given an string and a dic­tio­nary of words, find out if the input string can be bro­ken into a space-separated sequence of one or more dic­tio­nary words.

dictionary = ["I" , "have", "Jain", "Sumit", "am", "this", "dog"]

String = "IamSumit"
Output: "I am Sumit"

String ="thisisadog"
Output : String can't be broken*/

// draw back -here we rae solving many subproblems repeatedly
// look for dynamic prog version
public class WordBreakProblem {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("I");
		hs.add("am");
		hs.add("aa");
		hs.add("a");
		hs.add("masters");
		hs.add("student");
		
		String s = "Iaamastersstudent";
		
		wordBreak(hs, s);
	}

	private static void wordBreak(HashSet<String> hs, String s) {
			
		if(s.equalsIgnoreCase(null) || s.equalsIgnoreCase("")){
			System.out.println("Null/Empty String");
			System.exit(1);
		}
		
		if(hs.isEmpty()){
			System.out.println("Dictionary is Empty.!!");
			System.exit(1);
		}
		
		if(find(hs, s, "")){
			System.out.println("String can be found in dictionary");
		}
		else{
			System.out.println("Cannot brake the word");
		}
	}

	private static boolean find(HashSet<String> dict, String s, String answer) {
		
		if(s.length()==0){
			System.out.println(" "+answer);
			return true;
		}
		else{
			int index = 0;
			String word = "";
			
			while(index < s.length()){
				word += s.charAt(index);
				
				if(dict.contains(word)){
					if(find(dict, s.substring(index+1), answer+word+" ")){
						return true;
					}
					else{
						System.out.println("Back Tracking");
						index++;
					}
				}	
				else{
						index++;
				}
			}
		return false;
  
	  }
   }
}
