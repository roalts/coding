package assignmentLinkedLists;

import java.util.Scanner;

public class KReverse {
	
	public static Node kReverse(Node head, int k){
		
		int kTemp = k;
		
			if(head == null)
				return null;
		
		Node tail = head, tempHead = head ;
		kTemp = k;
		while(tail.next != null && kTemp > 1){
			tail = tail.next;
			kTemp--;
		}
		tempHead = tail;
		tempHead = tempHead.next;
		tail.next = null;
		Node smallerHead = ReverseLL.reverse(head);
		kTemp = k;
		tail = smallerHead;
		while(tail.next != null && kTemp > 1){
			tail = tail.next;
			kTemp--;
		}
		tail.next = kReverse(tempHead, k);	
		
		
		return smallerHead;
		 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = Merge.takeInput();
		Scanner s = new Scanner(System.in);

		int k = s.nextInt();
		head = kReverse(head,k);
		Merge.printLL(head);

	}

}
