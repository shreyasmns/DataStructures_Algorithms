package practice4;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class StockBuySell {

	public static void main(String[] args) {
		
		StockBuySell stock = new StockBuySell();
        
        // stock prices on consecutive days
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        int n = price.length;
 
        stock.stockBuySell(price, n);
	}

	/**
	 * @param price
	 * @param n
	 */
	private void stockBuySell(int[] price, int n) {
		
		if(n==1) return;
		
		int buy, sell;
		int i=0;
		
		while(i < n-1){
			
			while((i< n-1) && (price[i+1] <= price[i]))
					i++;
			
			if(i == n-1) 
				break;
			
			buy = i++;
						
			while((i < n-1) && (price[i] >= price[i-1]))
				i++;
			
			sell = i-1;
			
			System.out.println("Buy on Day : "+buy + " ,  Sell on Day : "+sell);
		}
	}
}
