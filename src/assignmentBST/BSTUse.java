package assignmentBST;

import java.util.Scanner;

public class BSTUse {

	public static BSTNode<Integer> makeBST(int[] input, int begin, int end){
		if(begin > end)
			return null;

		int mid = (begin + end)/2;
		BSTNode<Integer> root = new BSTNode<Integer>();
		root.data = input[mid];

		root.left = makeBST(input, begin, mid - 1);
		root.right = makeBST(input, mid + 1, end);

		return root;

	}
	public static BSTNode<Integer> addElement(BSTNode<Integer> root, int newElement){

		if(root == null){
			root = new BSTNode<Integer>();
			root.data = newElement;
			return root;
		}
		if(root.data < newElement){
			root.right = addElement(root.right, newElement);
		}
		else {
			root.left = addElement(root.left, newElement);

		}
		return root;


	}
	public static void addElement1(BSTNode<Integer> root, int newElement){

		if(root == null){
			root = new BSTNode<Integer>();
			root.data = newElement;
			return;
		}
		if(root.data < newElement){
			root.right = addElement(root.right, newElement);
		}
		else {
			root.left = addElement(root.left, newElement);

		}
		return;


	}
	
	public static BSTNode<Integer> takeInput(){
		Scanner s  = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return makeBST(input, 0, size-1);
	}

	public static BSTNode<Integer> findElement(BSTNode<Integer> root, int element){
		if (root == null)
			return null;
		if (root.data == element)
			return root;
		else if (root.data > element) {
			return findElement(root.left, element);
		} else {
			return findElement(root.right, element);
		}
	}

	public static BSTNode<Integer> removeElement(BSTNode<Integer> root, BSTNode<Integer> elementToBeRemoved){

		if(root == null){
			return null;
		}
		if(root == elementToBeRemoved){
			if(root.left == null && root.right==null){
				root = null;
				return root;
			} 
		} else if (root.data > elementToBeRemoved.data){

			root.left = removeElement(root.left, elementToBeRemoved );

		} else 
			root.right = removeElement(root.right, elementToBeRemoved );


		return root;

	}
	public static void removeElement1(BSTNode<Integer> root, BSTNode<Integer> elementToBeRemoved){

		if(root == null){
			return;
		}
		if(root == elementToBeRemoved){
			if(root.left == null && root.right==null){
				root = null;
				return;
			} 
		} else if (root.data > elementToBeRemoved.data){

			removeElement(root.left, elementToBeRemoved );

		} else 
			removeElement(root.right, elementToBeRemoved );


		return;

	}

	public static boolean checkBST(BSTNode<Integer> root, int min, int max){

		if (root == null)
			return true;

		if(root.data > max || root.data < min){
			return false;
		}

		boolean isLeftBST = checkBST(root, min, root.data);
		boolean isRightBST = checkBST(root, root.data, max);

		return isLeftBST && isRightBST;

	}

	public static void main(String[] args){


		Scanner s = new Scanner(System.in);
		
		BSTNode<Integer> root = takeInput();
		//root = addElement(root, newElement);
		int newElement = s.nextInt();
		
		BSTNode<Integer> elem = findElement(root, newElement);
		//root = removeElement(root, elem );
		removeElement1(root, elem );
		//	if(checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)){
		//addElement1(root, newElement);
		BinaryTreeUse.printBinaryTree(root);
		//}

	}

}
