package assignmentRecursion;

import java.util.Scanner;

public class StringToInt {
	
	public static int stringToInteger(String number, int beginIndex){
		if(beginIndex > number.length()-1){
			return 0;
		}
		int num = number.charAt(beginIndex)-'0';
		return (num)*((int)(Math.pow(10, (number.length()-1-beginIndex)))) + stringToInteger(number, beginIndex+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String number = s.nextLine();
		
		System.out.print(stringToInteger(number, 0));

	}

}
