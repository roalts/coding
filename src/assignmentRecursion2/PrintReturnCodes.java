package assignmentRecursion2;

import java.util.Scanner;

public class PrintReturnCodes {

	public static char[] code(){

		char[] codes = new char[26];
		char A='a';
		for(int i=0; i<26; i++){
			codes[i] = A++;
		}
		return codes;	 
	}
	
	public static String[] returnCodes(String input){
		if(input.length() == 0){
			
			String[] output = new String[1];
			output[0] = "";
			return output;
			
		}
		
		String smallerOutput[] = returnCodes(input.substring(1));
		
		
		String output[] = new String[2 * smallerOutput.length];
		
		
		
		
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		String input = s.next();
		
		
		returnCodes(input);
	}

}
