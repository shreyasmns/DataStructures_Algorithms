package redditQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class MostFreqIntegerInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,1,2,2,2,4,334,44,22,11,33,44,2,2,4,4,4,4,4,4,4,4,4,4,4};
		
		MostFreqIntegerInArray mi = new MostFreqIntegerInArray();
		mi.findFreqInteger(arr);
	}

	/**
	 * @param arr
	 */
	private void findFreqInteger(int[] arr) {
		int maxkey = -1, maxval = -1;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i < arr.length; i++){
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i])+1);
		}	
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() > maxval){
				maxkey = entry.getKey();
				maxval = entry.getValue();
			}
		}
		System.out.println("Maxkey : "+maxkey + ", maxval : "+maxval);
	}
}
