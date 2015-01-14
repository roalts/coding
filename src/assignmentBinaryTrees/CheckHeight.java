package assignmentBinaryTrees;

public class CheckHeight {
	
	public static int treeHeight(TreeNode<Integer> root){
		if(root == null)
			return 0;
		int leftHeight = treeHeight(root.left);
		int rightHeight = treeHeight(root.right);
		
		return Math.max(rightHeight, leftHeight) + 1;
	}
	public static boolean checkHeight(TreeNode<Integer> root){
		if(root == null)
			return true;
		int leftHeight = treeHeight(root.left);
		int rightHeight = treeHeight(root.right);
		if(!(Math.abs(leftHeight - rightHeight) <= 1))
			return false;
		else
			if(checkHeight(root.left) && checkHeight(root.right))
				return true;
		
		return true;
			
	}
	
	public static void main(String[] args){
		TreeNode<Integer> root = TreeUse.takeInput();
		TreeUse.printBinaryTree(root);
		System.out.println(checkHeight(root));
	}

}
