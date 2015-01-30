package assignmentBST;

import java.util.Scanner;


public class BinaryTreeUse {
	public static void printBinaryTree(BSTNode<Integer> root) {
		if (root == null)
			return;

		Queue<BSTNode<Integer>> queue = new Queue<BSTNode<Integer>>();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			BSTNode<Integer> currentNode = null;
			try {
				currentNode = queue.dequeue();
			} catch (QueueEmptyException e) {
			}

			String toBePrinted = currentNode.data + ":";

			if (currentNode.left != null) {
				toBePrinted = toBePrinted + currentNode.left.data + ",";
				queue.enqueue(currentNode.left);
			}

			if (currentNode.right != null) {
				toBePrinted = toBePrinted + currentNode.right.data;
				queue.enqueue(currentNode.right);
			}
			System.out.println(toBePrinted);
		}
	}

	public static BSTNode<Integer> takeInput() {
		System.out.println("Enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();

		BSTNode<Integer> root = new BSTNode<Integer>();
		root.data = rootData;
		Queue<BSTNode<Integer>> queue = new Queue<BSTNode<Integer>>();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			BSTNode<Integer> currentNode = null;
			try {
				currentNode = queue.dequeue();
			} catch (QueueEmptyException e) {
			}

			System.out.println("Enter left child for " + currentNode.data);
			int leftData = s.nextInt();

			if (leftData != -1) {
				BSTNode<Integer> left = new BSTNode<Integer>();
				left.data = leftData;
				currentNode.left = left;
				queue.enqueue(left);
			}

			System.out.println("Enter right child for " + currentNode.data);
			int rightData = s.nextInt();

			if (rightData != -1) {
				BSTNode<Integer> right = new BSTNode<Integer>();
				right.data = rightData;
				currentNode.right = right;
				queue.enqueue(right);
			}	
		}
		return root;

	}

	public static void printPreOrder(BSTNode<Integer> root) {
		if (root == null)
			return;	
		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	public static int height(BSTNode<Integer> root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	public static int diameter(BSTNode<Integer> root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		int leftD = diameter(root.left);
		int rightD = diameter(root.right);
		
		return Math.max(leftHeight + rightHeight, Math.max(leftD, rightD));
		
	}
	
	public static void main(String args[]) {
		BSTNode<Integer> root = takeInput();
		printBinaryTree(root);
		printPreOrder(root);
	}

}
