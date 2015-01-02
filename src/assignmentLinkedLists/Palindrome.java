package assignmentLinkedLists;

import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(Node head, int noOfElements){
		if(noOfElements <= 1)
			return true;
		Node tail = head;
		int num = noOfElements; 
		while(num > 1){
			tail = tail.next;
			num--;
		}
		if(head.data == tail.data){
			 return checkPalindrome(head.next, noOfElements-2);
		}

		return false;
	}
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = takeInput();
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
		int num = 0;
		Node tail = head;
		while(tail != null){
			num++;
			tail = tail.next;
		}
		System.out.println(num);
		System.out.println(checkPalindrome(head, num));
	}

}
