package assignmentRecursion;

import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int[] input, int beginIndex, int endIndex){
		if(beginIndex >= endIndex)
			return;
		
		int mid = (beginIndex + endIndex)/2;
		mergeSort(input, beginIndex, mid);
		mergeSort(input, mid+1, endIndex);
		merge(input, beginIndex, mid, endIndex);
	}
	
	public static void merge(int[] input, int begin, int mid, int end){
		
		int[] output = new int[end - begin + 1];
		int i = begin, j = mid + 1, k = 0;
		while(i <= mid && j<=end){
			if(input[i] < input[j]){
				output[k++] = input[i++];
			}
			else 
				output[k++] = input[j++];
		}
		while(i <= mid){
			output[k++] = input[i++];
		}
		while(j <= end){
			output[k++] = input[j++];
		}
		k=0;
		while(begin <= end){
			
			input[begin++] = output[k++];
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 0;
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		
		int[] userInput = new int[size];
		
		for(int i = 0; i < size; i++){
			userInput[i] = s.nextInt();
		}
		
		mergeSort(userInput, 0, size-1);
		
		for(int i = 0; i < userInput.length; i++){
			System.out.print(userInput[i] + " ");
		}
	}

}
