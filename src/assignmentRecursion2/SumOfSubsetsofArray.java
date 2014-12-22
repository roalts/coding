package assignmentRecursion2;


//Q6. Given an array find all subsets of A which sum to K.
public class SumOfSubsetsofArray {

	public static void sumSubset(int[] input, int number, int beginIndex, int sum){

		if(sum == number){
			System.out.print("YO");
			return;
		}
		if(sum<number){
			for(int i = beginIndex; i<input.length; i++)
				sumSubset(input, number, beginIndex+1, sum + input[i]);
				sumSubset(input, number, beginIndex+1, sum + input[beginIndex]);
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {3,5,4,4};
		sumSubset(input, 8, 0,0 );
	}
}
