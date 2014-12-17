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

		int temp, i=0;;
		while(i<input.length){

			if(input[i]==0){
				temp=input[i];
				for(int j=i+1; j<=input.length-1; j++){


					input[j-1]=input[j];


				}
				input[input.length-1]=temp;
				if(i==input.length-1){
					break;
				}

			}
			else
				i++;


		}
		return input;
	}

	public static void main(String[] args){

		int[] userInput = takeInput();

		userInput=zerosAtEnd(userInput);

		printArray(userInput);

	}

}
