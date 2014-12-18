package assignmentRecursion;

import java.util.Scanner;

public class CheckPalindrome {
	 public static boolean checkPalindrome(String input, int beginIndex, int endIndex){

	        if(beginIndex >= endIndex ){
	            return true;
	        }
	        if(input.charAt(beginIndex) == input.charAt(endIndex)){
	            return checkPalindrome(input, beginIndex+1, endIndex-1);
	        }

	        return false;
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Scanner scanner=new Scanner(System.in);
	        String input = scanner.nextLine();

	        System.out.print(checkPalindrome(input,0,input.length()-1));

	    }

}
