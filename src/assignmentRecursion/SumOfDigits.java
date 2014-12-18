package assignmentRecursion;

import java.util.Scanner;

public class SumOfDigits {

	public static int sumOfDigits(int number) {
		if(number == 0){
			return 0;
		}
		return (number%10) + sumOfDigits(number/10);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int number = scanner.nextInt();

		System.out.print(sumOfDigits(number));

	}




}
