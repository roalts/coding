package assignmentRecursion2;

//import java.util.Scanner;

public class Keypad {

	public static char[][] phone = new char[] [] {
		{ '2', 'a', 'b','c' },
		{ '3', 'd', 'e','f' },
		{ '4', 'g', 'h','i' },
		{ '5', 'j', 'k','l' },
		{ '6', 'm', 'n','o' },
		{ '7', 'p', 'q','r' ,'s'},
		{ '8', 't', 'u', 'v'},
		{ '9', 'w', 'x', 'y','z' }
	} ;
	public static String[] phonekeypad = new String[] {
		"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
	};
	public static void keypad(String input, int beginIndex, String s){

		if(beginIndex > input.length()-1){
			System.out.println(s);
			return;
		}
		//int num = input.charAt(beginIndex) - '0';
		//int num2 = input.charAt(beginIndex+1) - '0';


		for(int i=0; i<8; i++){
			if(input.charAt(beginIndex) == phone[i][0] ){
				//	System.out.print(phone[i][1]);

				if(i !=6 || i != 8 ){

					for(int j=1; j<=3; j++){
						keypad(input, beginIndex +1, s+ phone[i][j]); 	
					}
				}
			}

		}
	}

	public static String[] phoneKeypad(String input){
		if(input.length() == 0){
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		int num = input.charAt(0) - '0';
		String[] smallerOutput = phoneKeypad(input.substring(1));
		String[] output = new String[phonekeypad[num-2].length()*smallerOutput.length];
		int k = 0;
		for( int i = 0; i < phonekeypad[num-2].length(); i++){
			for(int j = 0; j < smallerOutput.length; j++){
				output[k++] = phonekeypad[num-2].charAt(i) + smallerOutput[j];
			}

		}
		return output;


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner s = new Scanner(System.in);
		//String input = s.next();
		//keypad(input, 0);
		//keypad(input, 0, "");
		//System.out.print(output);
		//		 String input = "234523455553";
		String input = "2";
		long startTime = System.currentTimeMillis();
		keypad(input, 0, "");
		long endTime = System.currentTimeMillis();
		System.out.println();
		
		long startTime1 = System.currentTimeMillis();
		String[] output = phoneKeypad(input);

		for(int i=0; i < output.length; i++){
			System.out.println(output[i]);
		}
		long endTime2 = System.currentTimeMillis();	
		System.out.println("Time by first method =  " + (endTime - startTime));
		System.out.println("Time by second method =  " + (endTime2 - startTime1));
	}

}
