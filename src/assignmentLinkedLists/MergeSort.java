package assignmentLinkedLists;

import java.util.Scanner;

public class MergeSort {

	public static Node mergeSort(Node head){
		
		if(head.next == null )
			return head;
		int noOfElements = 0;
		Node t = head;
		while(t != null){
			t = t.next;
			noOfElements++;
		} 
		noOfElements++;
		int midElement = noOfElements/2;
		Node mid = head;
		while(midElement > 1){
			mid = mid.next;
			midElement--;
		}
		
		Node list1 = mergeSort(mid.next);
		mid.next = null;
		Node list2 = mergeSort(head);
		head = Merge.merge(list1, list2);
		
		return head;
	}

	public static void printLL(Node head){
		while(head != null){
			System.out.print(head.data + "-->");
			head = head.next;
		}
	}
//	public static Node merge(Node head, Node mid, Node tail){
//		Node list1 = head;
//		Node list2 = mid.next;
//		Node end = null, start = null;
//		mid = mid.next;
//		while(list1 != mid && list2 != null){
//			if(start == null){
//				if(list1.data > list2.data){
//					start = list2; 
//					end = list2;
//					list2 = list2.next;
//				} else {
//					start = list1;
//					end = list1;
//					list1 = list1.next;
//				}
//			} else {
//				if(list1.data > list2.data){
//					end.next = list2;
//					end = list2;
//					list2 = list2.next;
//				} else {
//					end.next = list1;
//					end = list1;
//					list1 = list1.next;
//				}
//			}
//		}
//			while( list1 != mid){
//				end.next = list1;
//				end = list1;
//				list1 = list1.next;
//			}
//			while(list2 != null){
//				end.next = list2;
//				end = list2;
//				list2 = list2.next;
//			}
//		
//		return start;
//	}
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
				Node tail = head;
				while(tail.next != null){
					tail = tail.next; 
				}
				head = mergeSort(head);
				printLL(head);
	}

}
