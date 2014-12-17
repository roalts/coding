import java.util.Scanner;


public class SortArray {

	public static int[] takeInput(){

		Scanner s = new Scanner(System.in);

		int size = s.nextInt();

		int[] input = new int[size];

		for(int i = 0; i<size; i++){
			input[i]=s.nextInt();
		}

		return input;

	}
	public static void printArray(int[] input){
		for(int i=0; i<input.length; i++){
			System.out.print(input[i]+"\t");

		}
		System.out.print("\n");
	}
	
	public static int[] sortArray(int[] input){
		int[] sortedArray = new int[input.length];
		int k=0,j=input.length-1;
		for(int i=0; i<input.length; i++){
			if(input[i]==0){
				sortedArray[k++]=input[i];
			}
			else
				sortedArray[j--]=input[i];
		}
		return sortedArray;
		
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] userInput=takeInput();
		int[] output = sortArray(userInput);
		printArray(output);
	}

}
