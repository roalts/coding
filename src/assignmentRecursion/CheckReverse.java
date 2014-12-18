package assignmentRecursion;

import java.util.Scanner;

public class CheckReverse {
	 public static boolean checkReverse(String input1, String input2, int beginIndex, int endIndex){

	        if(beginIndex == input1.length()-1 && endIndex == 0){
	            return true;
	        }
	        if(input1.charAt(beginIndex) == input2.charAt(endIndex)){
	            return checkReverse(input1, input2, beginIndex+1, endIndex-1);
	        }

	        return false;
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Scanner scanner=new Scanner(System.in);
	        String input1 = scanner.nextLine();
	        String input2 = scanner.nextLine();

	        int beginIndexInput1 = 0;
	        int endIndexInput2 = input2.length()-1;
	        System.out.print(checkReverse(input1, input2, beginIndexInput1, endIndexInput2));




	    }


}
