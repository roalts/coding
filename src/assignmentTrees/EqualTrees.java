package assignmentTrees;

public class EqualTrees extends Tree{

	public static boolean checkEqualTrees(TreeNode root1, TreeNode root2){

		if(root1 == null && root2 == null){
			
		}
		if(root1.data != root2.data)
			return false;
		else {
			if(root1.children.size() != root2.children.size())
				return false;
			else{
				for(int i = 0, j = 0; i < root1.children.size() && j < root2.children.size(); i++, j++){
					if(root1.children.get(i).data == root2.children.get(j).data){
						boolean answer = checkEqualTrees(root1.children.get(i), root2.children.get(j));
						if(answer == false)
							return false;
					} else {
						return false;
					}
				}
			}

		} 
		return true;

	}


	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub

		TreeNode root1 = takeInput();
		TreeNode root2 = takeInput();
		System.out.println(checkEqualTrees(root1, root2));



	}

}
