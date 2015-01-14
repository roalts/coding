package assignmentLinkedLists;

/*Without using an additional Linked List arrange elements in a Linked List such that all
even numbers are placed after odd numbers. */

public class EvenOdd {

	public static Node evenOdd(Node head){
		Node tail = head, previous = null;
		while(tail != null){
			if(tail.data % 2 != 0){
				Node temp = tail, t = tail;
				if(tail != head){
					previous.next = t.next;
					t = t.next;
					temp.next = head;
					head = temp;
					tail = t;
				}
				else {
					previous = tail;
					tail = tail.next;
				}
			} else{

				previous = tail;
				if(tail != null)
					tail = tail.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Node head = Merge.takeInput();
		head = evenOdd(head);
		while(head != null){
			System.out.print(head.data + "-->");
			head = head.next;
		}
	}

}
