package heaps;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class MinHeapImpl {
	
	public int size;
	public int[] mh;
	public int position;
	
	public MinHeapImpl(int size){
		this.size = size;
		mh = new int[size+1];
		position = 0;
	}

	public static void main(String[] args) {
		int arr [] = {3,2,1,7,8,4,10,16,12};
		for(int i=0; i<arr.length; i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		
		MinHeapImpl min = new MinHeapImpl(arr.length);
		min.createHeap(arr);
		min.display();
		int mini = min.extractMin();
		System.out.println("\nExtract Min : "+mini);
		
	}

	/**
	 * @param arr1
	 */
	private void createHeap(int[] arr) {	
		if(arr.length > 0){
			for(int i=0;i< arr.length; i++){
				insert(arr[i]);
			}
			
		}
	}

	/**
	 * @param i
	 */
	private void insert(int x) {
		if(position ==0){
			mh[position+1] = x;
			position=2;
		} else{
			mh[position++] = x;
			bubbleUp();
		}
	}

	/**
	 * 
	 */
	private void bubbleUp() {
		int pos = position-1;
		
		while(pos > 0 && mh[pos/2]> mh[pos]){
			int temp = mh[pos/2];
			mh[pos/2] = mh[pos];
			mh[pos] = temp;
			pos = pos/2;
		}
	}

	/**
	 * @return
	 */
	private int extractMin() {
			int min = mh[1];
			mh[1] = mh[position-1];
			mh[position-1] = 0;
			position--;
			sinkdown(1);
			return min;
	}

	/**
	 * @param i
	 */
	private void sinkdown(int k) {
			int smallest = k;
			
			if(position > 2*k && mh[smallest]> mh[2*k]){
				smallest = 2*k;
			}
			
			if(position > 2*k+1 && mh[smallest] > mh[2*k+1]){
				smallest = 2*k+1;
			}
			if(smallest!=k){
				swap(k, smallest);
				sinkdown(smallest);
			}
	}

	/**
	 * @param k
	 * @param smallest
	 */
	private void swap(int k, int smallest) {
			int temp = mh[k];
			mh[k] = mh[smallest];
			mh[smallest] = temp;
	}

	/**
	 * 
	 */
	private void display() {
		for(int j=1; j< mh.length; j++){
			System.out.print(" "+mh[j]);
		}
	}

}
