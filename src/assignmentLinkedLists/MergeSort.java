package assignmentLinkedLists;

public class MergeSort {
	
	public static void mergeSort(Node head, Node tail){
		int noOfElements = 0;
		tail = head;
		while(tail.next != null){
			tail = tail.next;
			noOfElements++;
		} 
		noOfElements++;
		int midElement = noOfElements/2;
		
		Node mid = head;
		
		while(midElement > 1){
			mid = mid.next;
			midElement--;
		}
		mergeSort(head, mid);
		mergeSort(mid.next, tail);
		merge(head, mid, tail);
	
	}
	public static Node merge(Node head, Node mid, Node tail){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
