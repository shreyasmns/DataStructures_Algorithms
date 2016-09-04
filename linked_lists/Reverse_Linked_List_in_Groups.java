package linked_List;

public class Reverse_Linked_List_in_Groups {

	public static void main(String[] args) {
			Node head = new Node(1);
			head.next = new Node(2);
			head.next.next = new Node(3);
			head.next.next.next = new Node(4);
			head.next.next.next.next = new Node(5);
			head.next.next.next.next.next = new Node(6);
			
			Node x = reverseLinkedList(head,3);
			display(x);
	}

	private static Node reverseLinkedList(Node head, int k) {
			
		int x = k;
		Node head_next = null;
		Node h = head;
		Node head_prev = null;
		
		while(h!= null && x>0){
			
		}
		
		return null;
	}

	private static void display(Node x) {
		// TODO Auto-generated method stub
		
	}

}


class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
	}
}
