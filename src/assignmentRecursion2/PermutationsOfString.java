package assignmentRecursion2;

//import java.util.Scanner;

public class PermutationsOfString {

	public static int factorial(int n){
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}

	public static String[] stringPermutations(String input){
		if(input.length() == 0){
			String[] output = new String[1];
			output[0] =  "";
			return output;
		}

		String[] smallerOutput = stringPermutations(input.substring(1));
		String[] output = new String[(smallerOutput[0].length() + 1) * smallerOutput.length];
		int k = 0;
		for(int i = 0; i < smallerOutput.length; i++){
			for(int j = 0; j < smallerOutput[0].length() +1 ; j++){
				output[k++] =  smallerOutput[i].substring(0, j) + input.charAt(0) + smallerOutput[i].substring(j); 
			}
		}
		return output;

		//		for(int i = 0; i < input.length; i++){
		//		String smaller
		//			for(int j = 0; j < smallerOutput[0].length() +1 ; j++){
		//				output[k++] =  smallerOutput[i].substring(0, j) + input.charAt(0) + smallerOutput[i].substring(j); 
		//			}
		//		}
		//		return output;
		//		

	}

	public static void printPermutations(String input, String output){
		if(input.length() == 0){
			System.out.println(output);
			return;
		}
		for(int i=0; i <= input.length()-1; i++){
			printPermutations(input.substring(0,i)+input.substring(i+1), output + input.charAt(i));
		}
	}
	public static String[] subsequenceOfString(String input){
		if(input.length() == 0){
			String[] output = new String[1];
			output[0] = "";
			return output;
		}

		String[] smallerOutput = subsequenceOfString(input.substring(1));
		String[] output = new String[2 * smallerOutput.length];
		for(int i = 0; i < smallerOutput.length; i++){
			output[i] = smallerOutput[i];
		}
		for(int i = 0; i < smallerOutput.length; i++){
			output[i + smallerOutput.length] = input.charAt(0) + smallerOutput[i];
		}
		return output;

	}
	public static void printSubsequences(String input, String output){
		if(input.length() == 0){
			System.out.println(output);
			return;
		}

		printSubsequences(input.substring(1), output + input.charAt(0));
		printSubsequences(input.substring(1), output);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	Scanner s = new Scanner(System.in);
		String input = "abc";//s.next();
		//stringPermutations(input,0);
		//String[] output = subsequenceOfString(input);
		//String[] output2 = stringPermutations(input);
		//printSubsequences(input, "");
		printPermutations(input, "");
		//for(int i=0; i < output2.length; i++)
		//System.out.println(output2[i]);
	}

}
