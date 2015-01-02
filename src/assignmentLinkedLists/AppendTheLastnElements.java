package assignmentLinkedLists;

import java.util.Scanner;

/*
 * Append the last n elements of a linked list to the front.
e.g. for 1-> 2-> 3 -> null and n = 2 return 3-> 2-> 1-> null
 */
public class AppendTheLastnElements {

	public static Node append(Node head, int num){
		
		if(num <= 0)
			return head;
		Node tail = head;
		Node previous = head;
		int elements = 0;
		while(tail.next != null){
			tail = tail.next;
			elements++;
		}
		elements++;
		while(elements > 2){
			previous = previous.next;
			elements--;
		}
		previous.next = null;
		tail.next = head;
		
		return append(tail, num-1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Node head = Palindrome.takeInput();
	Scanner s = new Scanner(System.in);
	System.out.println("Enter n = ");
	int n = s.nextInt();
	head = append(head, n);
	while(head != null){
		System.out.print(head.data + "-->");
		head = head.next;
	}
	
	}

}
