package tPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class GenerateParanthesis {

	public static void main(String[] args) {
		
		List<String> result = generateParanthesis(3);
		System.out.println("Parenthesis Generated : ");
		
		for(int i=0; i< result.size(); i++){
			System.out.println(" "+result.get(i));
		}
	}

	private static List<String> generateParanthesis(int n) {
		List<String> res = new ArrayList<>();
		  generate(res, n, n, "");
		 return res;
	}

	private static void generate(List<String> res, int left, int right, String s) {
		
		if(left == 0 && right == 0)
			res.add(s);
		
		if(left > 0)
			generate(res, left-1, right, s+"(");
		
		if(right > left)
			generate(res, left, right-1, s+")");
	 
	}

}
