package assignmentLinkedLists;

import java.util.Scanner;

public class InsertDelete {

	public static Node takeInput(){
		Node head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();

		while(input != -1){
			Node newNode = new Node();
			newNode.data = input;
			if(head == null){
				head = newNode;
				tail = newNode;
			}
			else{
				tail.next = newNode;
				tail = newNode;
			}
			System.out.println("Enter the next Number = ");
			input = s.nextInt();
		}
		return head;
	}

	public static Node insert(Node head, int positionOfElement){

		Scanner s = new Scanner(System.in);
		int input = s.nextInt(); 
		Node newElement = new Node();
		newElement.data = input;
		Node previous = null;
		previous = head;
		if(positionOfElement == 0){
			newElement.next = head;
			head = newElement;
			return head;
			
		} else {


			while(positionOfElement > 1){
				previous = previous.next;
				positionOfElement--;
			}
			newElement.next = previous.next;
			previous.next = newElement;
			

			return head;
		}
	}
	
	public static Node delete(Node head, int positionOfElement){
		Node previous = head;
		if(positionOfElement == 0){
			head = head.next;
			return head;
		} else {
			while(positionOfElement > 1){
				previous = previous.next;
				positionOfElement--;
			}
			Node temp = previous;
			temp = temp.next;
			previous.next = temp.next;
			return head;
		}
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

		//Node insert = insert(head, 4);

		Node delete = delete(head, 4);
		
		printLL(delete);
		

	}

}
