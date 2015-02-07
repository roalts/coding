package assignmentBST;

import java.util.Scanner;

public class InOrderBSTSuccessor {

	public static BSTNode<Integer> giveInOrderSuccessor(BSTNode<Integer> root, BSTNode<Integer> lastLeft, int inOrderPre){
		if(root == null){
			return null;
		}

		if(root.left == null && root.right == null){
			return lastLeft;
		}
		if(root.data == inOrderPre){
			if(root.right == null)
				return lastLeft;
			else {
				BSTNode<Integer> temp = root.right;
				while(temp.left != null){
					temp = temp.left;
				}
				return temp;
			}
				
		}
		if(inOrderPre > root.data){
			return giveInOrderSuccessor(root.right, lastLeft, inOrderPre);
		}

		if(inOrderPre < root.data){
			return giveInOrderSuccessor(root.left, root, inOrderPre);
		}

		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTNode<Integer> root = BSTUse.takeInput();
		Scanner s = new Scanner(System.in);
		int inOrderPre = s.nextInt();
		BSTNode<Integer> output = giveInOrderSuccessor(root, null, inOrderPre);
		if(output != null)
			System.out.println(output.data);
		else
			System.out.println("Null");

	}

}
