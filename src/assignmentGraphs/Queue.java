package assignmentGraphs;

import assignmentBinaryTrees.QueueEmptyException;

public class Queue<T> {
	Node<T> head, tail;
	int size;


	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size == 0)
			return true;
		return false;
	}

	public T front(){
		if(size() == 0){
			//TODO

		}
		return head.data;
	}
	public void enqueue(T element){
		Node<T> newNode = new Node<T>();
		size++;
		newNode.data = element;
		if(tail != null){
			tail.next = newNode;
			tail = newNode;
		} else {
			tail = newNode;
			head = newNode;
		}	
	}

	public T dequeue() throws QueueEmptyException{
		if(size() == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		size--;
		T temp = head.data;
		head = head.next;
		if(head == null){
			tail = null;
		}
		return temp;
	}
}
