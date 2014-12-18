import java.util.Scanner;



public class SortArray2 {

	int ones;
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
	public static void sortArray(int[] input){
		int i = 0, j=input.length-1, temp;
		while(i<j){
			if(input[i]>input[j]){
				temp = input[i];
				input[i]=input[j];
				input[j]=temp;

				if(input[i]==2){
					i++;
				}
				else if(input[j]==0){
					j--;
				}


			}

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] userInput=takeInput();
		sortArray(userInput);
		printArray(userInput);
	}

}
