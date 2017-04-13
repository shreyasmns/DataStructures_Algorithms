package tPractice;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class LinkedListCycle {

	
	public boolean hasCycle(ListNode head){
		
		if(head == null || head.next == null) return false;
		ListNode slow = head, fast = head.next;
		
		while(fast != null || fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) return true;
		}
		
		if(fast==null || fast.next == null) return false;
		
		return true;
	}
}


class ListNode{
	int val;
	ListNode next;
	
	ListNode(int valIn){
		this.val = valIn;
		next = null;
	}
}