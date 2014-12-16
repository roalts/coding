import java.util.Scanner;


public class IntersectionArray {


	public static int[] takeInput(){
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		int size = s.nextInt();
		int[] input = new int[size];
		
		for(int i = 0; i < size; i++){
			System.out.print("Enter the element = ");
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static int[] insertionArray(int[] input1, int[] input2){
		int size,k=0;
		
		
		for(int i=0; i<input1.length; i++){
			for(int j=0; j<input2.length; j++){
				if(input1[i]==input2[j]){
					k++;
				}
			}
		}
		size = k; 
		int[] output = new int[size];
		k=0;
		for(int i=0; i<input1.length; i++){
			for(int j=0; j<input2.length; j++){
				if(input1[i]==input2[j]){
					output[k++]=input1[i];
					
				}
			}
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = takeInput();
		int[] array2 = takeInput();
		
		int[] output = insertionArray(array1, array2);
		System.out.print(output);
		
		
		

	}

}
