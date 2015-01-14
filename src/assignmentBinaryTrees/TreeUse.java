package assignmentBinaryTrees;

import java.util.Scanner;

public class TreeUse {

	public static void printBinaryTree(TreeNode<Integer> root) {
		if (root == null)
			return;

		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			TreeNode<Integer> currentNode = null;
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

	public static TreeNode<Integer> takeInput() {
		System.out.println("Enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();

		TreeNode<Integer> root = new TreeNode<Integer>();
		root.data = rootData;
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			TreeNode<Integer> currentNode = null;
			try {
				currentNode = queue.dequeue();
			} catch (QueueEmptyException e) {
			}

			System.out.println("Enter left child for " + currentNode.data);
			int leftData = s.nextInt();

			if (leftData != -1) {
				TreeNode<Integer> left = new TreeNode<Integer>();
				left.data = leftData;
				currentNode.left = left;
				queue.enqueue(left);
			}

			System.out.println("Enter right child for " + currentNode.data);
			int rightData = s.nextInt();

			if (rightData != -1) {
				TreeNode<Integer> right = new TreeNode<Integer>();
				right.data = rightData;
				currentNode.right = right;
				queue.enqueue(right);
			}	
		}
		return root;

	}

}
