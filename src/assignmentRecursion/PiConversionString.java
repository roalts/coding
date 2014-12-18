package assignmentRecursion;

import java.util.Scanner;

public class PiConversionString {

    public static String convertPi(String input, int beginIndex){
        String output="";
        if(beginIndex > input.length())
            return "";
        else if(beginIndex==input.length()-1)
        	return output + input.charAt(beginIndex);
        if(input.substring(beginIndex,beginIndex+2).equals("pi")){
            return output + "3.14" + convertPi(input,beginIndex+2);
        }
        else
        return output+input.charAt(beginIndex)+convertPi(input,beginIndex+1);


    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();



        System.out.print(convertPi(input,0));

    }
}
