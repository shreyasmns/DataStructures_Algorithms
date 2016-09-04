package heaps;

import java.util.Arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class MergeK_Sorted_Arrays {
	
	public int size;
	public int result[];
	public int position;
	public HeapNode[] Heap;
	

	/**
	 * @param length
	 */
	public MergeK_Sorted_Arrays(int k) {
		this.size = k;
		Heap = new HeapNode[k+1];
		position=0;
		Heap[0] = new HeapNode(0, -1);
	}

	public static void main(String[] args) {
		int[][] A = new int[5][];
		A[0] = new int[] { 1, 5, 8, 9 };
		A[1] = new int[] { 2, 3, 7, 10 };
		A[2] = new int[] { 4, 6, 11, 15 };
		A[3] = new int[] { 9, 14, 16, 19 };
		A[4] = new int[] { 2, 4, 6, 9 };
		
		MergeK_Sorted_Arrays mk = new MergeK_Sorted_Arrays(A.length);
		int op[] = mk.merge(A, A.length, A[0].length);
		System.out.println("Result : "+Arrays.toString(op));
	}

	/**
	 * @param a
	 * @param length
	 * @param i
	 * @return
	 */
	private int[] merge(int[][] a, int k, int n) {
		int nk = n*k;
		result = new int[nk];
		int[] ptrs = new int[k];
		int count=0;
		
		for(int i=0; i< ptrs.length; i++){
			ptrs[i]=0;
		}
		
		for(int i=0; i< k; i++){
			if(ptrs[i] < n){
				insert(a[i][ptrs[i]], i);
			}
			else{
				insert(Integer.MAX_VALUE, i);
			}
		}
		
		while(count < nk){
			HeapNode h = extractMin();
			result[count] = h.data;
			ptrs[h.listNo]++;
			
			if(ptrs[h.listNo] < n){
				insert(a[h.listNo][ptrs[h.listNo]], h.listNo);
			}
			else{
				insert(Integer.MAX_VALUE, h.listNo);
			}
		}
		
		return result;
	}

	/**
	 * @return
	 */
	private HeapNode extractMin() {
		HeapNode min = Heap[1];
		Heap[1] = Heap[position-1];
		Heap[position-1] = null;
		position--;
		sinkdown(1);
		
		return min;
	}

	/**
	 * @param i
	 */
	private void sinkdown(int k) {
		int left = 2*k;
		int right = 2*k+ 1;
		int smallest = k;
		
		if(left < position && Heap[smallest].data > Heap[left].data)
			smallest = left;
		if(right < position && Heap[smallest].data > Heap[right].data)
			smallest = right;
		
		if(smallest != k){
			swap(k, smallest);
			sinkdown(smallest);
		}
	}

	/**
	 * @param k
	 * @param smallest
	 */
	private void swap(int i, int j) {
		HeapNode temp = Heap[i];
		Heap[i] = Heap[j];
		Heap[j] = temp;
	}

	/**
	 * @param maxValue
	 * @param i
	 */
	private void insert(int data, int listNo) {
		if(position==0){
			Heap[position+1] = new HeapNode(data, listNo);
			position = 2;
		} else{
			Heap[position++] = new HeapNode(data, listNo);
			bubbleUp();
		}
	}

	/**
	 * 
	 */
	private void bubbleUp() {
			int pos = position-1;
			
			while(pos > 0 && Heap[pos/2].data > Heap[pos].data){
				HeapNode temp = Heap[pos];
				Heap[pos] = Heap[pos/2];
				Heap[pos/2] = temp;
				pos = pos/2;
			}
	}

}

class HeapNode{
	int data;
	int listNo;
	
	public HeapNode(int data, int listNo){
		this.data = data;
		this.listNo = listNo;
	}
}