import java.util.Scanner;


public class Split {


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
	
	public static boolean splitArray(int[] input){
		int min, minIndex=0;
		min = input[0];
		for(int i=0; i<input.length; i++){
			if(min>input[i]){
				min=input[i];
				minIndex=i;	
			}
		}
		for(int i=0, j=minIndex; i<minIndex-1 || j<input.length-1; i++, j++){
			if(i<minIndex-1)
				if(input[i]<input[i+1])
					return false;
			if(j<input.length-1)
				if(input[j]>input[j+1])
					return false;
		}
		return true;
	}

	public static void main(String[] args){

		int[] userInput = takeInput();
		boolean check = splitArray(userInput);

		if(check==true)
			System.out.print("true");
		else
			System.out.print("false");

	}
}
