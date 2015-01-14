package assignmentBinaryTrees;

public class CheckBalanced {

	public static boolean checkBalanced(TreeNode<Integer> root){
		if(root == null)
			return true;
		
		if(root.left == null && root.right == null)
			return true;
		
		if(root.left != null && root.right == null)
			return false;
		
		if(root.left == null && root.right != null)
			return false;
		
		
		


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode<Integer> root = TreeUse.takeInput();
		
		
	}

}
