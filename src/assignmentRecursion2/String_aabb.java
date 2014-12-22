package assignmentRecursion2;

import java.util.Scanner;

public class String_aabb {
	/*Suppose you have a string made up of only the letters'a'and'b'.Write a recursive
function that checks if the string was generated using the following rules:
a. the string begins with an 'a'
b. each'a'is followed by nothing or an'a'or"bb"
c. each "bb" is followed by nothing or an 'a'
	 */
	public static boolean checkString(String input, int beginIndex){
		if(beginIndex >= input.length())
			return true;
		if(input.charAt(0)=='a')
		{
			if(input.charAt(beginIndex) == 'a' && (beginIndex == input.length()-1 || input.charAt(beginIndex+1) == 'a' || input.substring(beginIndex+1, beginIndex+3).equals("bb")))			
				return checkString(input, beginIndex+1);
			if(input.substring(beginIndex, beginIndex+2).equals("bb") && (beginIndex == input.length()-2 || input.charAt(beginIndex+2) == 'a'))
				return checkString(input, beginIndex+2);
		}


		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String input = s.next();
		if(checkString(input, 0))
			System.out.print("True");
		else
			System.out.print("False");

	}

}
