import java.util.Scanner;


public class MulitplyRecursion {
	public static int multiply(int a, int b){

		if(b==1)
			return a;

		return a+multiply(a,b-1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();

		int result = multiply(number1, number2);
		System.out.print(result);


	}

}
