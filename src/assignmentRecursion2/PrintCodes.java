package assignmentRecursion2;

import java.util.Scanner;

public class PrintCodes {

	public static char[] code(){

		char[] codes = new char[26];
		char A='a';
		for(int i=0; i<26; i++){
			codes[i] = A++;
		}
		return codes;	 
	}
	public static void printCodes(String input, int begin){

		if(begin == 2)
			return;
		char[] codes = code();

		for(int i=0; i<input.length()-begin; i++){

			int digit =  Integer.parseInt((input.substring(i, i+begin+1)));
			
			while(digit>26 && i<input.length()){
				int singledigit = input.charAt(i) - '0';
				
				System.out.print(codes[singledigit-1]);
				i++;
			}
			if(digit<=26)
				System.out.print(codes[digit-1]);
			i = i + begin;
		}
		System.out.println();
		printCodes(input, begin+1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String input = s.next();

		printCodes(input, 0);
	}

}
