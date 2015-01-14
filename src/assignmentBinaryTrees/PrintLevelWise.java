package assignmentBinaryTrees;


public class PrintLevelWise {

	public static void printLevelWise(TreeNode<Integer> root){
		if (root == null)
			return;

		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enqueue(root);
		System.out.println(root.data);
		while (!queue.isEmpty()) {
			TreeNode<Integer> currentNode = null;
			try {
				currentNode = queue.dequeue();
			} catch (QueueEmptyException e) {
			}
			String toBePrinted = "";


			if (currentNode.left != null) {
				toBePrinted = toBePrinted + currentNode.left.data + " ";
				queue.enqueue(currentNode.left);
			}

			if (currentNode.right != null) {
				toBePrinted = toBePrinted + currentNode.right.data;
				queue.enqueue(currentNode.right);
			}
			System.out.println(toBePrinted);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root = TreeUse.takeInput();
		printLevelWise(root);
	}

}
