package assignmentRecursion2;

import java.util.Scanner;

public class PermutationsOfString {

	public static int factorial(int n){
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
	
	public static void stringPermutations(String input, int beginChar){
		//int size = input.length();
		//System.out.println("the total permutaions of this string are = " + factorial(size));
		int i=0;
		if(beginChar == input.length())
			return;
		while(beginChar + i < input.length()){
			System.out.print(input.charAt(beginChar + i));
			i++;
		}
		while(beginChar + i >= input.length() && (input.length()-i) > 0){
				System.out.print(input.charAt(beginChar -(input.length() - i)));
				i++;
		}
		System.out.print("\n");
		stringPermutations(input, beginChar+1);
//		String s = "";
//		for(i = beginChar; i<input.length()-1; i++){
//			 s = s + input.charAt(i + 1 );
//		}
//		System.out.print(input.charAt(beginChar));
//		stringPermutations(s, beginChar+1);
		
	}
	public static void subsequenceOfString(String input, int beginChar){
		if( beginChar == input.length()){
			System.out.print("");	
			return;
		}
		String s = "";
		//System.out.print(input);
		for(int i = beginChar; i < input.length(); i++){
			s = s + input.charAt(i);
			System.out.print(s+" ");
		}

		stringPermutations(input,0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String input = s.next();
		stringPermutations(input,0);
	}

}
