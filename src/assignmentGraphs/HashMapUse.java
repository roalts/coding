package assignmentGraphs;

import java.util.HashMap;

public class HashMapUse {

	public static int findMaxOccurenceCount(int[] input) {
		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			Integer prevCount = counts.get(input[i]);
			if (prevCount == null) {
				counts.put(input[i], 1);
				if (max < 1) {
					max = 1;
				}
			} else {
				counts.put(input[i], prevCount + 1);
				if (max < prevCount + 1) {
					max = prevCount + 1;
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,2,8,2,6,8,5,1};
		System.out.println(findMaxOccurenceCount(input));
	}


}
