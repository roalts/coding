package assignmentLinkedLists;

public class BubbleSort {
	
	
	public static Node bubbleSort(Node head){
		if(head == null || head.next == null){
			return head;
		}
		Node temp = head;
		Node previous = null;
		while(temp.next != null){
			if(temp.next.data < temp.data){
				if(previous == null){
					Node temp2 = temp.next.next;
					temp.next.next = head;
					head = temp.next;
					temp.next = temp2;
					previous = head;
				} else {
					Node temp2 = temp.next.next;
					previous.next = temp.next;
					temp.next.next = temp;
					temp.next = temp2;
					previous = previous.next;
				}
			} else {
				previous = temp;
				temp = temp.next;
			}
		}
		previous.next = null;
		head = bubbleSort(head);
		Node tail = head;
		while(tail.next != null){
			tail = tail.next;
		}
		tail.next = temp;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = Merge.takeInput();
		Merge.printLL(head);
		head = bubbleSort(head);
		System.out.println();
		Merge.printLL(head);
	}

}
