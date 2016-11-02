package practice;

import java.util.Stack;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class ParanthesesCheck {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		String input = "{()[]}";
		String in = input.replaceAll("[^\\[\\](){}]", "");
		System.out.println("Is Input Balanced : "+checkIfBalanced(in));
		long endtime = System.currentTimeMillis();
		System.out.println("Time elapsed in mili seconds: "+String.valueOf(endtime-starttime));
		
	}

	/**
	 * @param input
	 * @return boolean
	 */
	private static boolean checkIfBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i< s.length(); i++){
			
			if(s.charAt(i) == '(' ) stack.push('(');
			else if(s.charAt(i) == '{' ) stack.push('{');
			else if(s.charAt(i) == '[' ) stack.push('[');
			
			else if(s.charAt(i) == ']' ){
				if(stack.isEmpty()) return false;
				if(stack.pop() != '[') return false;
			}
			
			else if(s.charAt(i) == ')' ){
				if(stack.isEmpty()) return false;
				if(stack.pop() != '(') return false;
			}
			
			else if(s.charAt(i) == '}' ){
				if(stack.isEmpty()) return false;
				if(stack.pop() != '{') return false;
			}
		}
		return stack.isEmpty();
	}
}
