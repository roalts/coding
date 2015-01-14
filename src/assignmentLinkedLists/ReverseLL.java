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

	public static Node simpleReverse(Node head){
		if(head == null || head.next == null)
			return head;
		Node smallerHead = reverse(head.next);
		//		Node tail = smallerHead;
		//		while(tail.next != null){
		//			tail = tail.next;
		//		}
		Node tail = head.next;

		tail.next = head;
		head.next = null;
		return smallerHead;
	}

	public static DoubleNode reverseDN(Node head){
		DoubleNode output = new DoubleNode();
		if(head == null || head.next == null){
			output.head = head;
			output.tail = head;

			return output;
		}
		DoubleNode smallerHead = reverseDN(head.next);

		smallerHead.tail.next = head;
		head.next = null;
		smallerHead.tail = head;

		return smallerHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = Merge.takeInput();
		DoubleNode newHead = reverseDN(head);
		//		while(newHead.head != null)
		//		{
		//			System.out.print(newHead.head.data + "-->");
		//			newHead.head = newHead.head.next;
		//		}
		//	}
		Merge.printLL(newHead.head);
		//head = simpleReverse(head);
		//Merge.printLL(head);
	}
}
class DoubleNode {
	Node head; 
	Node tail;
}
