import java.util.Scanner;

public class ZerosAtTheEnd {


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

	public static void zerosAtEnd(int[] input){

		int temp;

		for(int i=0; i<input.length; i++){

			for(int j=0; j<input.length-1; j++){
				if(input[j]==0&&input[j+1]!=0)
				{
					temp = input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
				
				printArray(input);
			}
		}
		
	}

	public static void main(String[] args){

		int[] userInput = takeInput();
		//printArray(userInput);
		zerosAtEnd(userInput);
		printArray(userInput);

		

	}
}

