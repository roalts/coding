package assignmentLinkedLists;

import java.util.Scanner;

public class Merge {

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
	
	public static void printLL(Node head){
		while(head != null){
			System.out.print(head.data + "-->");
			head = head.next;
		}
	}
	
	public static Node merge(Node list1, Node list2){
		Node head = null, tail = null;
		
		while(list1 != null && list2 != null){
			if(head == null){
				if(list1.data > list2.data){
					head = list2;
					tail = list2;
					list2 = list2.next;
				} else {
					head = list1;
					tail = list1;
					list1 = list1.next;
				}
			} else {
				if(list1.data > list2.data){
					tail.next = list2;
					tail = list2;
					list2 = list2.next;
				} else {
					tail.next = list1;
					tail = list1;
					list1 = list1.next;
				}
			}
		}
		while (list1 != null){
			tail.next = list1;
			tail = list1;
			list1 = list1.next;
		}
		while (list2 != null){
			tail.next = list2;
			tail = list2;
			list2 = list2.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node list1 = takeInput();
		printLL(list1);
		System.out.println();
		Node list2 = takeInput();
		printLL(list2);
		System.out.println();
		Node head = merge(list1, list2);
		printLL(head);
	}

}
