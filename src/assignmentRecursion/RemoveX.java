package assignmentRecursion;

import java.util.Scanner;

public class RemoveX {
	
	 public static String noX(String input, int beginIndex){
	        String outout = "";
	        if(beginIndex > input.length()-1){
	            return "";
	        }
	        if(input.charAt(beginIndex) == 'x'){
	            return noX(input, beginIndex+1);
	        }
	        else
	            return  outout + input.charAt(beginIndex) + noX(input, beginIndex+1);
	    }




	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Scanner scanner=new Scanner(System.in);
	        String input = scanner.nextLine();

	        System.out.print(noX(input, 0));





	    }

}
