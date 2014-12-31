package assignmentRecursion2;

import com.sun.org.apache.bcel.internal.generic.GOTO;


//Q6. Given an array find all subsets of A which sum to K.

public class SumOfSubsetsofArray {

	public static void sumSubset(int[] input, int beginIndex, int sum, String output){

		if(sum == 0){
			System.out.println(output);
			return;
		}

		if(beginIndex == input.length){
			return;
		}

		sumSubset(input, beginIndex +1, sum - input[beginIndex], output + String.valueOf(input[beginIndex]+ " "));
		sumSubset(input, beginIndex +1, sum, output);

	}

	public static int[][] returnSubset(int[] input, int beginIndex){
		if(beginIndex == input.length){
			int[][] output = new int[1][1];
			output[0][0] = 0;

			return output;
		}

		int[][] smallerOutput = returnSubset(input, beginIndex+1);
		int[][] output = new int[(int) Math.pow(2,smallerOutput.length) ][smallerOutput.length+1];
		int i = 0;
		while(i < smallerOutput.length){
			int j = 0;
			for(j = 0; j < smallerOutput[0].length; j++){
				output[i][j] = smallerOutput[i][j];
			}
			i++;
		}
		while(i < output.length){
			int j = 0, k=0;
			for(j = 0; j < smallerOutput[0].length; j++){
				output[i][j] = smallerOutput[k][j];

				k++;
			}
			output[i][j] = input[beginIndex];
			i++;

		}

		return output;
	}

	public static void printSubsets(int[] input, int beginIndex, int[] output){
		if(beginIndex == input.length){
			for(int i=0; i < output.length; i++){
				System.out.print(output[i] + " ");
			}
			System.out.println();
			return;
		}
		printSubsets(input, beginIndex + 1, output);
		int[] output2 = new int[output.length + 1];
		for(int i=0; i< output.length; i++){
			output2[i] = output[i+5];
		}
		output2[output.length] = input[beginIndex];
		printSubsets(input, beginIndex + 1, output2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 3};
		int[] output = {};
		//sumSubset(input, 0, 8,"");
		//int[][] output = returnSubset(input,0);
//		for(int i=0; i < output.length; i++){
//			for(int j = 0; j < output[i].length; j++ )
//				System.out.print(output[i][j] + "  ");
//			System.out.println();
//		}
		printSubsets(input, 0, output);
		
	}
}
