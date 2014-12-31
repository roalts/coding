package assignmentRecursion2;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int[] input, int begin, int end, int numToBeSearched){
		if(begin > end)
			return -1;
		
		int mid = (begin + end)/2;
		if(numToBeSearched == input[mid])
			return mid;
		else if(numToBeSearched < input[mid]){
			return binarySearch(input, begin, mid - 1, numToBeSearched);
		}
		else
			return binarySearch(input, mid + 1, end, numToBeSearched);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int[] input = {3,4,5,6,7,8,9,44,32,112,34,56,45,22,11,1};
		int element = s.nextInt();
		
		System.out.print(binarySearch(input, 0, input.length-1, element) + 1);
		
	}

}
