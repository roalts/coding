package assignmentRecursion;

import java.util.Scanner;

public class FindingZeros {

    public static int countZeros(int input){
        if(input == 0)
            return 0;
        if(input%10 == 0)
            return 1+countZeros(input/10);
        else
            return countZeros(input/10);

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner=new Scanner(System.in);
        int number1 = scanner.nextInt();


        int result = countZeros(number1);
        System.out.print(result);


    }

}
