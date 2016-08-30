package arrays;

import java.util.PriorityQueue;

public class MaxReveneue_Tickets {
	
	static PriorityQueue<Integer> pq;

	public MaxReveneue_Tickets(int length) {
		pq = new PriorityQueue<Integer>(length);
	}
	
	

	public static void main(String[] args) {
			int numTickets = 5;
			int[] ticketWindow = {5, 1, 7, 10, 11, 9};
			
			@SuppressWarnings("unused")
			MaxReveneue_Tickets mx = new MaxReveneue_Tickets(ticketWindow.length);
			int maxRevenue = calculate(numTickets, ticketWindow); 
			
			System.out.println("Maximum Revenue generated by selling 5 tcikets is : "+maxRevenue);
	}



	private static int calculate(int numTickets, int[] ticketWindow) {
		
		int revenue = 0;
		
		for(int i=0; i< ticketWindow.length; i++){
			pq.offer(ticketWindow[i]);
		}
		
		while(numTickets > 0){
			int ticketPrice = pq.poll();
			revenue += ticketPrice;
			pq.offer(--ticketPrice);
			numTickets--;
		}
		
		return revenue;
	}
}
