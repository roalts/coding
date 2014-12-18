package assignmentRecursion;

import java.util.Scanner;

public class GeometricSum {
	 public static double geometricSum(int input){

	        if(input < 0){
	            return 0;
	        }
	        return Math.pow(0.5,input)+geometricSum(input-1);


	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Scanner scanner=new Scanner(System.in);
	        int number1 = scanner.nextInt();

	        

	        double result = geometricSum(number1);
	        System.out.print(result);


	    }

}
