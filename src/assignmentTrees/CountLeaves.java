package assignmentTrees;

public class CountLeaves extends Tree {
	
	public static int countLeaves(TreeNode root){
		int count = 0;
		if(root.children.size() == 0)
			return 1;
		for(int i = 0; i < root.children.size(); i++){
			count = count + countLeaves(root.children.get(i));
		}
		return count;
	}

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		
		TreeNode root = takeInput();
		System.out.println(countLeaves(root));
		
	}

}
