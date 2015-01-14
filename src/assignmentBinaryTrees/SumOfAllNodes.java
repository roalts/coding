package assignmentBinaryTrees;

public class SumOfAllNodes {

	
	public static int sumOfNodes(TreeNode<Integer> root){
//		int sum = 0;
		if(root == null){
			return 0;
		}
//		int sumLeft = sumOfNodes(root.left);
//		sum = sum + sumLeft;
//		int sumRight = sumOfNodes(root.right);
//		sum = sum + sumRight;
//		sum = sum + root.data;
		return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root = TreeUse.takeInput();
		int sum = sumOfNodes(root);
		System.out.println(sum);
	}

}
