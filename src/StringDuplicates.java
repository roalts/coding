import java.util.Scanner;


public class StringDuplicates {

	public static String checkDuplicate(String input){
		String s = "";
		for(int i=0; i<input.length(); i++){
			if(i!=input.length()-1){
				if(input.charAt(i)==input.charAt(i+1)){
					s = s+ input.charAt(i);
					i++;
				}

				else
					s= s + input.charAt(i);
			}
			else 
				s= s+input.charAt(i);
		}
		return s;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output = checkDuplicate(input);
		System.out.print(output);
	}

}
