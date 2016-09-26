package amazon;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 * If a customer bought A and B items and another buys A item, B should come as recommendations. 
There are two types of recommendations based on the connections 
1) Two items are strongly connected if a customer buys those items. 
2) Two items are weakly connected if each items are strongly/weakly connected to another third item. 

Provided the sample input 
ABC 

10 

first:ABC 
first:HIJ 
sec:HIJ 
sec:KLM 
third:NOP 
fourth:ABC 
fourth:QRS 
first:DEF 
fifth:KLM 
fifth:TUV 

first, sec, third.. represents the customer names 
ABC, HIJ... represents the item codes 

For the Input item Id "ABC", since "ABC" is strongly connected to HIJ, DEF, QRS 
and whereas ABC is weakly connected to KLM and TUV 

the output should be count of strong and weak connection i.e., [3,2]
 */
public class ItemRecommendation {

	public static void main(String[] args) {
		
	}

}
