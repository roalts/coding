package assignmentBST;

public class MaxBSTInBinaryTree {


	public static MaxBST findMaxBST(BSTNode<Integer> root){
		MaxBST output = new MaxBST();
		if(root == null){
			output.maxBST = null;
			output.max = Integer.MIN_VALUE;
			output.min = Integer.MAX_VALUE;
			output.noOfNodes = 0;
			return output;
		}

		MaxBST leftMax = findMaxBST(root.left);
		MaxBST rightMax = findMaxBST(root.right);

		if(leftMax != null && rightMax != null){
			if(leftMax.max < root.data && rightMax.min > root.data && leftMax.maxBST == root.left && rightMax.maxBST == root.right){
				output.maxBST = root;
				output.max = Math.max(rightMax.max, root.data);
				output.min = Math.min(leftMax.min, root.data);
				output.noOfNodes = leftMax.noOfNodes + rightMax.noOfNodes + 1;
			}
			else {
				if(leftMax.noOfNodes > rightMax.noOfNodes)
					return leftMax;
				else 
					return rightMax;
			}
		}
		return output;
	}

	public static void main(String[] args){

		BSTNode<Integer> root = BinaryTreeUse.takeInput();
		MaxBST answer = findMaxBST(root);
		if(answer.maxBST != null)
			System.out.println(answer.maxBST.data);
		else
			System.out.println("NULL");

	}

}
