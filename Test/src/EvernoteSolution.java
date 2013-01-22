import java.util.ArrayList;


public class EvernoteSolution {
	
	/*
	 * Consider this question is just return the first 4th max value,
	 * we can just use an ArrayList to hold all return value, and we can have the time complexity O(n)
	 * If the return number is too large, I mean, like find the first 1000 max value in 100,000 numbers,
	 * we can use a min heap to hold all values, that will be much faster.
	 */
	public ArrayList<Integer> findFourthMax(int[] array) {
		if (array == null || array.length < 4) {   // error situation
			return null;
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			result.add(array[i]);
		}
		
		int min = getMin(result);
		for (int i = 4; i < array.length; i++) {
			if (array[i] > min) {
				result.remove(new Integer(min));
				result.add(array[i]);
				min = getMin(result);
			}
		}
		
		return result;
	}
	
	// return the min value in an ArrayList which size is 4 in this question
	public int getMin(ArrayList<Integer> list) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}
		return min;
	}
}
