package assignmentRecursion;

import java.util.Scanner;

public class PairStar {

	public static String pairStar(String input, int beginIndex){
		String outout = "";
		if(beginIndex > input.length()-1){
			return "";
		}
		else if(beginIndex == input.length()-1){
			return outout + input.charAt(beginIndex);
		}
		if(input.charAt(beginIndex) == input.charAt(beginIndex+1)){
			return outout+input.charAt(beginIndex)+'*'+pairStar(input, beginIndex+1);
		}
		else
			return  outout + input.charAt(beginIndex) + pairStar(input, beginIndex+1);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		String input = scanner.nextLine();

		System.out.print(pairStar(input, 0));





	}
}
