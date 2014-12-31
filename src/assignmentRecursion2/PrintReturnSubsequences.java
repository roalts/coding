package assignmentRecursion2;

public class PrintReturnSubsequences {

	public static String[] returnSubsequences(String input){
		if(input.length() == 0){
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallerOutput = returnSubsequences(input.substring(1));
		String[] output = new String[2 * smallerOutput.length];
		int i = 0, j = 0;
		while(i < output.length){
			output[i++] = input.charAt(0) + smallerOutput[j];
			output[i++] = smallerOutput[j++];

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
		String input = "abc";
		//printSubsequences(input, "");
		String[] output = returnSubsequences(input);
		for(int i = 0; i < output.length; i++)
			System.out.println(output[i]);

	}

}
