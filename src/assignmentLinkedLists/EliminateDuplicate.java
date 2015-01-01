package assignmentLinkedLists;

import java.util.Scanner;

public class EliminateDuplicate {

	public static Node takeInput(){

		Node head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();

		while(input != -1){
			Node newElement = new Node();	
			newElement.data = input;
			if(head == null){

				head = newElement;
				tail = newElement;

			} else {

				tail.next = newElement;
				tail = newElement;

			}
			input = s.nextInt();
		}

		return head;

	}

	public static Node eliminateDuplicate(Node head, Node first, Node second){
//		Node fi, s;
//		fi = first;
//		s = second;
//		fi.next = s.next;
		
		first.next = second.next;
		return head;
	}

	public static Node findDuplicate(Node head){
		Node first, second;
		first = head;
		second = head;
		second = second.next;
		while (second != null && first.data <= second.data){
			if(first.data == second.data){
				head =	eliminateDuplicate(head, first, second);
				second = second.next;
			}
			if(second != null){
			first = first.next;
			second = second.next;
			}
		}
		return head;
	}
	public static void printLL(Node head){
		while(head != null){
			System.out.print(head.data + "-->");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = takeInput();
		printLL(head);
		System.out.println();
		head = findDuplicate(head);
		printLL(head);

	}

}
