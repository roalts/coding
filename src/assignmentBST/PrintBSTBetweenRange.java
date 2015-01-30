package assignmentBST;

import java.util.Scanner;

public class PrintBSTBetweenRange {

	
	
	public static void printElements(BSTNode<Integer> root, int min, int max){
		if(root == null){
			return;
		}
		if(root.data >= min && root.data <= max){
			System.out.print(root.data);
			printElements(root.left, min, max);
			printElements(root.right, min, max);
		}
		if(root.data < min){
			printElements(root.right, min, max);
		}
		if(root.data > max)
			printElements(root.left, min, max);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTNode<Integer> root = BSTUse.takeInput();
		System.out.println("Enter the range = ");
		Scanner s = new Scanner(System.in);
		int min = s.nextInt();
		int max = s.nextInt();
		
		printElements(root, min, max);

	}

}
