package assignmentRecursion2;


//Q6. Given an array find all subsets of A which sum to K.
public class SumOfSubsetsofArray {

	public static int sumSubset(int[] input, int number, int beginIndex){
		
		if(beginIndex == input.length){
			return 0;
		}
//		if(input[beginIndex] == number )
//			System.out.print(input[beginIndex]);
		for(int i = beginIndex; i<input.length; i++){
			
			if(number == input[i] + sumSubset(input, number, beginIndex+1)){
				System.out.print(input[i]);
			}
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1,2,3,4,5,6,7};
		sumSubset(input, 7, 0 );
		
		
	}

}
