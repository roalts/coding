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
	public static int[] zerosAtEnd(int[] input){
		
		int temp;
		int[] newArray = new int[input.length];
		for(int i=0; i<input.length; i++){
			if(input[i]==0){
				temp=input[i];
				for(int j=i+1, k=i; j<=input.length-1; j++){

					
					newArray[k++]=input[j];
					

				}
				newArray[input.length-1]=temp;
				
				//printArray(input);
			}
			else
				newArray[i]=input[i];
		}
		
		return newArray;
	}

	public static void main(String[] args){

		int[] userInput = takeInput();
		//printArray(userInput);
		int[] output=zerosAtEnd(userInput);
		printArray(output);

	}

}
