
public class Sum {
	public static int[] sum (int[] array1, int[] array2) {
		if (array1 == null || array2 == null || array1.length != array2.length) {
			return null;
		}
		
		int[] result = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i] + array2[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		int[] c = sum (a,b);
		for (int i = 0; i < 3; i++) {
			System.out.print(c[i]);
		}
	}
}
