package assignmentRecursion2;

import java.util.Scanner;

public class FindBiggerNumber {

	public static int factorial(int n){
		if(n == 1)
			return 1;
		return n * factorial(n-1); 
	}

	public static int checkBiggerNumber(String input){
		if(input.length() == 0){
			return 0;
		}
		int count = 0;
		for(int i = 0; i < input.length() - 1; i++){
			if((input.charAt(0) - '0') < (input.charAt(i+1) - '0')){
				
				count = count + factorial(input.length() - 1);
			}

		}
		return count + checkBiggerNumber(input.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String input = s.next();
		int c = checkBiggerNumber(input);
		System.out.println(c);
	}

}
