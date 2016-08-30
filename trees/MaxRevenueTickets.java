package trees;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxRevenueTickets {

	public static PriorityQueue<Integer> pq;
	
	public MaxRevenueTickets(int numTickets) {
		pq = new PriorityQueue<>(numTickets, new Comparator<Integer>(){
			
			public int compare(Integer o1, Integer o2){
				return o2-o1;
			}
		});
	}

	public static void main(String[] args) {
		int[] windowTickets = {5, 1, 7, 10, 11, 9};
		int numTickets = 6;
		
		@SuppressWarnings("unused")
		MaxRevenueTickets mt = new MaxRevenueTickets(numTickets);
		
		int maxRevenue = calculateMaxRevenue(windowTickets, numTickets);
		System.out.println("\nMax Revenue Generated : "+maxRevenue);
	}

	public static int calculateMaxRevenue(int[] windowTickets, int numTickets) {
		
		int revenue = 0;
			
		for(int i=0; i< windowTickets.length; i++){
			pq.offer(windowTickets[i]);
		}
		
		for(int i=0; i< numTickets; i++){
			int ticketPrice = pq.poll();
			revenue  +=  ticketPrice;
			pq.offer(--ticketPrice);
		}
		return revenue;
	}
}
