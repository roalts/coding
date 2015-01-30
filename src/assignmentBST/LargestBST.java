package assignmentBST;

public class LargestBST {

	public static int findLargestBST(BSTNode<Integer> root){
		if(root == null)
			return -1;
		int maxSum = 0;
		if(root.left != null && root.right != null)
			maxSum = root.data + root.left.data + root.right.data;
		else if(root.left != null)
			maxSum = root.data + root.left.data;
		else if(root.right != null)
			maxSum = root.data + root.right.data;

		int maxSumLeft = findLargestBST(root.left);
		int maxSumRight = findLargestBST(root.right);
		
		return Math.max(maxSum, Math.max(maxSumRight, maxSumLeft));


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTNode<Integer> root = BSTUse.takeInput();
		System.out.println(findLargestBST(root));

	}

}
