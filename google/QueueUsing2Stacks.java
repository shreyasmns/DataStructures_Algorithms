package google;

import java.util.Stack;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class QueueUsing2Stacks<E> {
	
	private Stack<E> inbox = new Stack<E>(); 
	private Stack<E> outbox = new Stack<E>();
	
	public void queue(E item){
		inbox.push(item);
	}
	
	public E dequeue(){
		if(outbox.isEmpty()){
			outbox.push(inbox.pop());
		}
		return outbox.pop();
	}
	
	public boolean isEmpty(){
		return (inbox.isEmpty() && outbox.isEmpty()); 
	}
	
	public int size(){
		return (inbox.size() + outbox.size());
	}
	
	public E element(){
	if(!inbox.isEmpty()){
		return inbox.firstElement();
	}
		return null;
	}
}
