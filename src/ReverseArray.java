import java.util.Scanner;


public class ReverseArray {
	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] userInput=takeInput();
		for(int i=0, j=userInput.length-1;i<userInput.length/2; i++,j--){
			int temp = userInput[i];
			userInput[i]=userInput[j];
			userInput[j]=temp;
			printArray(userInput);
		}
	}
}
