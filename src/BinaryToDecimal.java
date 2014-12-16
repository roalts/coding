import java.util.Scanner;


public class BinaryToDecimal {

	public static int binaryToDecimal(int input){
		int num, decimal = 0, i=0;
		
		while(input>0){
			num = input%10;
			decimal = (int) (decimal + Math.pow(2, i)*num);
			input=input/10;
			i++;
			
		}
		
		return decimal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		s.close();
		int output = binaryToDecimal(input);
		
		System.out.print(output);
		
		

	}

}
