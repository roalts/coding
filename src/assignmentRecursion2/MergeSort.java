package assignmentRecursion2;

public class MergeSort {

	public static void mergeSort(int[] input, int begin, int end){
		if(begin >= end)
			return;
		int mid = (begin + end)/2;
		mergeSort(input, begin, mid);
		mergeSort(input, mid + 1, end);
		merge(input, begin, mid, end);
	}
	
	public static void merge(int[] input, int begin, int mid, int end){
		int[] output = new int[end - begin + 1];
		int i = begin;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <=  end){
			if(input[i] < input[j]){
				output[k++] = input[i++];
			}
			if(input[i] > input[j]){
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
			input[i + begin] = output[i];
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {10,9,33,24,25,2,67,8,5,3,1,45};
		mergeSort(input, 0, input.length-1);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] + "  ");
		}

	}

}
