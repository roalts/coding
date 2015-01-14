package assignmentLinkedLists;

public class ReverseLLWithoutR {

	public static Node reverse(Node head, int noOfElements){

		//		while(noOfElements > 0){
		//			Node tail = head;
		//			while(tail.next.next != null){
		//				tail = tail.next;
		//			}
		//			Node temp = tail;
		//			temp = temp.next;
		//			temp.next = head;
		//			head = temp;
		//			tail.next = null;
		//			noOfElements--;
		//		}

		Node tail = head, newHead = head;
		tail = tail.next;
		while(head.next != null){
			tail = head.next;
			head.next = tail.next;
			tail.next = newHead;
			newHead = tail;	
		}
		return newHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = Merge.takeInput();
		Node tail = head;
		int count = 0;
		while(tail != null){
			count++;
			tail = tail.next;
		}
		head = reverse(head, count);
		Merge.printLL(head);

	}

}
