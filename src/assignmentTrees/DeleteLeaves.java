package assignmentTrees;

public class DeleteLeaves {


	public static TreeNode deleteLeaves(TreeNode root){
		if(root == null)
			return null;
		if(root.children.size() == 0){
			return null;
		}
		for(int i = 0; i < root.children.size(); i++){
			TreeNode temp = deleteLeaves(root.children.get(i));
			if(temp == null){
				root.children.remove(i);
				i--;
			}
		}
		return root;
	}
	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		TreeNode root = Tree.takeInput();
		root=deleteLeaves(root);
		Tree.printTree(root);
	}

}
