package assignmentBinaryTrees;

import java.util.Scanner;

public class BuildTreeUsingPreAndInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int noOfElements = s.nextInt();
		int[] preOrderArray = new int[noOfElements];
		int[] inOrderArray = new int[noOfElements];
		for(int i = 0; i < preOrderArray.length; i++){
			preOrderArray[i] = s.nextInt();
		}
		for(int i = 0; i < inOrderArray.length; i++){
			inOrderArray[i] = s.nextInt();
		}
		
		
	}
	
	public static int binarySearch(int[] input,int begin, int end, int k){
		
		if(begin > end)
			return -1;
		int mid = ( begin + end )/2;
		if(input[mid] == k)
			return mid;
		else if(input[mid] > k)
			return binarySearch(input,begin, mid -1, k);
		else
			return binarySearch(input, mid + 1, end, k);
	
	}

}
