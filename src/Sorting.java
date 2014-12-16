import java.util.Scanner;


public class Sorting {

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
	public static void bubbleSort(int[] input){

		for(int i=0; i<input.length;i++){
			for(int j=0; j<input.length-i-1; j++){
				if(input[j]>input[j+1]){
					int temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}

			}

		}
		printArray(input);
	}

	public static void insertionSort(int[] input){
		
		for(int i=0; i<input.length; i++){
			for(int j = i-1;j>=0; j--){
				if(input[j]>input[j+1]){
					int temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
					
				}
			}
		}
		printArray(input);
		

	}
	public static void selectionSort(int[] input){
		
		for(int i=0; i<input.length; i++){
			for(int j =i+1; j<input.length; j++){
				if(input[i]>input[j]){
					int temp = input[j];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		printArray(input);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] userInput = takeInput();
		System.out.println("Bubble Sort = ");
		bubbleSort(userInput);
		System.out.println("Selection Sort = ");
		selectionSort(userInput);
		System.out.println("Insertion Sort = ");
		insertionSort(userInput);
	}

}
