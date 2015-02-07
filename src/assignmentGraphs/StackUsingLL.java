package assignmentGraphs;

public class StackUsingLL<T> {

	Node<T> head;
	int count;

	public StackUsingLL(){
		count = 0;
	}
	public int size(){
		return count;
	}
	public boolean isEmpty(){
		if (size() == 0){
			return true;
		}
		return false;
	}
	
	public T top() throws StackEmptyException{
		if(size() == 0){
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
		
	}
	public void push(T element){
		Node<T> newNode = new Node<T>();
		newNode.data = element;
		count++;
		if(head == null){
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	public T pop() throws StackEmptyException{
		if(size() == 0){
			StackEmptyException e = new StackEmptyException();
			throw e;
		} else {
			count--;
			T temp = head.data;
			head = head.next;
			return temp; 
		}
	}

}

