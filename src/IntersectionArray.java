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
	public static int[] insertionArray2(int[] input1, int[] input2){
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
	public static int[] insertionArray(int[] input1, int[] input2){
		int size,k=0;
		

		
		for(int i=0; i<input2.length; i++){
			int loc = binarySearch(input1, input2[i], 0, input1.length - 1);
			if(loc!= -1){
				k++;		
			}
		}
		size = k; 
		int[] output = new int[size];
		k=0;
//		for(int i=0; i<input1.length; i++){
//			for(int j=0; j<input2.length; j++){
//				if(input1[i]==input2[j]){
//					output[k++]=input1[i];
//
		for(int i=0; i<input2.length; i++){
			int loc = binarySearch(input1, input2[i], 0, input1.length - 1);
			if(loc!= -1){
				output[k++] = input2[i];		
			}
		}
		
		return output;
		
	}
	
	 public static void mergeSort(int[] input, int begin, int end){
	        if(begin >= end){
	            return;
	        }
	        int mid = (begin + end)/2;

	        mergeSort(input, begin, mid);
	        mergeSort(input, mid+1, end);
	        merge(input, begin, mid, end);
	    }

	    public static void merge(int[] input, int begin, int mid, int end) {

	        int i = begin, j = mid+1, k = 0;
	        int[] output = new int[end - begin + 1];
	        while(i <= mid && j <= end){
	            if(input[i] < input[j]){
	                output[k++] = input[i++];
	            }
	            if(input[i] >= input[j]){
	                output[k++] = input[j++];
	            }
	        }
	        while(i <= mid){
	            output[k++] = input[i++];
	        }
	        while(j <= end){
	            output[k++] = input[j++];
	        }
	        for(i = 0; i < output.length; i++){
	            input[begin + i] = output[i];
	        }

	    }
	    public static int binarySearch(int[] input, int elementToBeSearched, int begin, int end) {
	        if (begin > end) {
	            return -1;
	        }

	        int mid = (end + begin)/2;
	        if (elementToBeSearched == input[mid]) {
	            return mid;
	        } else if (elementToBeSearched < input[mid]) {
	            return binarySearch(input, elementToBeSearched, begin, mid - 1);
	        } else {
	            return binarySearch(input, elementToBeSearched, mid + 1, end);
	        }
	    }
		public static void printArray(int[] input){
			for(int i=0; i<input.length; i++){
				System.out.print(input[i]+"\t");

			}
			System.out.print("\n");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] input1 = new int[1000000];
		for (int i = 0; i < input1.length; i++) {
			input1[i] = input1.length - i;
		}
		int[] input = new int[1000000];
		for (int i = 0; i < input.length; i++) {
			input[i] = input.length - i;
		}
		
		
		long startTime = System.currentTimeMillis();
		mergeSort(input1, 0, input1.length - 1);
		//int[] output = insertionArray(input1, input);
		long endTime = System.currentTimeMillis();
		long startTime1 = System.currentTimeMillis();
		//int[] output2 = insertionArray2(input1, input);
		long endTime2 = System.currentTimeMillis();
		System.out.println("Time by merge sort " + (endTime - startTime));
		System.out.println("Time by second method" + (endTime2 - startTime1));
		
		


	}

}
