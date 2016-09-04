package heaps;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class MinToMaxHeapify {
	static int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
	static int maxheap[] = new int[arr.length];
	
	public static void main(String[] args) {
		
	    int n = arr.length;
	    
	    MinToMaxHeapify mh = new MinToMaxHeapify();
	    System.out.println(" Min Heap Array : ");
	    mh.print(arr);
	    
	    System.out.println(" Max Heap Array : ");
	    mh.convertMinToMaxHeap(arr, n);
	    mh.print(maxheap);
	}

	/**
	 * @param arr
	 * @param n
	 */
	private void convertMinToMaxHeap(int[] arr, int n) {
		
		// start from the bottom most and right most
		// node and heapify all
		for(int i=(n-2)/2; i>=0; --i){
			maxHeapify(arr, i, n);
		}
	}

	/**
	 * @param maxheap
	 * @param i
	 * @param n
	 */
	private void maxHeapify(int[] arr, int i, int n) {
		    maxheap = arr;
			int left = 2*i + 1;
			int right = 2*i + 2;
			int largest = i;
			
			if(left < n && maxheap[left] > maxheap[largest])
				largest = left;
			
			if(right < n && maxheap[right] > maxheap[largest])
				largest = right;
			
			if(largest != i ){
				
				int temp = maxheap[i];
						maxheap[i] = maxheap[largest];
				maxheap[largest] = temp;
				maxHeapify(maxheap, largest, n);
			}
   	}

	/**
	 * @param i
	 * @param j
	 */
	private void swap(int i, int j) {
			int temp = i;
			i = j;
			j = temp; 
	}

	/**
	 * @param arr
	 */
	private void print(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i< n;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
	}

}
