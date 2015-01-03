package assignmentLinkedLists;

public class ReverseLL {
	
	public static Node reverse(Node head){
		if(head == null || head.next == null)
			return head;
		Node smallerHead = reverse(head.next);
		Node tail = smallerHead;
		while(tail.next != null){
			tail = tail.next;
		}
		tail.next = head;
		head.next = null;
		return smallerHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = Merge.takeInput();
		head = reverse(head);
		Merge.printLL(head);
	}

}
