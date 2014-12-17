import java.util.Scanner;


public class MergeArrays {

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

	public static void mergeArrays(int[] array1, int[] array2) {
		// TODO Auto-generated method stub

		int size = array1.length+array2.length;
		int[] mergedArray = new int[size];
		int k=0, i=0, j=0;
		while(k<size){
			if(i<array1.length&&j<array2.length){
				if(array1[i]>array2[j]){
					mergedArray[k]=array2[j];
					k++;
					j++;
				}
				else
					mergedArray[k++]=array1[i++];

				//			while(i<array1.length)
				//				mergedArray[k++]=array1[i++];
				//			while(j<array2.length)
				//				mergedArray[k++]=array2[j++];
				//			
			}


		}
		printArray(mergedArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = takeInput();
		int[] array2 = takeInput();

		mergeArrays(array1, array2);

	}


}
