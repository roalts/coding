package assignmentBST;

public class MaxBST {

	int max;
	int min;
	int noOfNodes;
	BSTNode<Integer> maxBST;



}


//else if(leftMax != null){
//	if(leftMax.max < root.data && leftMax.maxBST == root.left){
//		output.max = root.data;
//		output.maxBST = root;
//		output.noOfNodes = leftMax.noOfNodes + 1;
//	} else
//		return null;
//}
//else if(rightMax != null){
//	if(rightMax.min > root.data && rightMax.maxBST == root.right){
//		output.min = root.data;
//		output.maxBST = root;
//		output.noOfNodes = rightMax.noOfNodes + 1;
//	} else 
//		return null;
//}
//else{
//	output.maxBST = root;
//	output.max = root.data;
//	output.min = root.data;
//	output.noOfNodes = 1;
//}