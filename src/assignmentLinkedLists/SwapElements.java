package assignmentLinkedLists;

public class SwapElements {



	public static Node swap(Node head, int position1, int position2){
		Node previous1 = head, t1, t2;
		Node temp1 = new Node();
		Node temp2 = new Node();
		Node previous2 = head;
		while(position2 > 2){
			previous2 = previous2.next;
			position2--;
		}
		while(position1 > 2){
			previous1 = previous1.next;
			position1--;
		}
		t2 = previous2;
		previous2.next = temp2;
		t2 = t2.next;
		t1 = previous1;
		previous1.next = temp1;
		t1 = t1.next;
		temp1.next = t1.next;
		
		
		temp2.next = t2.next;
		temp2.data = t1.data;
		temp1.data = t2.data;
		
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = InsertDelete.takeInput();
		InsertDelete.printLL(head);
		head = swap(head, 2, 4);
		InsertDelete.printLL(head);
	}

}
