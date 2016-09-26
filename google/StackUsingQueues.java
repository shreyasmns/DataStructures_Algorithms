package google;

import java.util.LinkedList;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 * using single Queue
 * Time complexity : O(n)O(n). The algorithm removes n elements and inserts n + 1n+1 elements to q1 , where n is the stack size. This gives 2n + 12n+1 operations. The operations add and remove in linked lists has O(1)O(1) complexity.

	Space complexity : O(1)O(1).
 */
public class StackUsingQueues<E> {
	
	private LinkedList<E> q1 = new LinkedList<E>();
	
	
	public void push(E element){
		q1.add(element);
		int size = q1.size();
		
		while(size > 1){
			q1.add(q1.remove());
			size--;
		}
	}
	
	public E pop(){
		return q1.remove();
	}
	
	public int size(){
		return q1.size();
	}
	
	public E peek(){
		return q1.element();
	}
	
	public boolean Empty(){
		return q1.isEmpty();
	}
	
	public int seacrh(E elem){
		return q1.indexOf(elem);
	}
	
}
