import java.util.ArrayList;

public class ArrayListDemo {

	public static void print(ArrayList a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + ",");
		}
		System.out.println();
	}
	
	public static void print2(ArrayList a) {
		for (Object k : a) {
			System.out.print(k);
		}
		System.out.println();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
//		System.out.println(a.size());
		a.add(1);
//		System.out.println(a.size());
		String s = "56";
		a.add(Integer.parseInt(s));
//		System.out.println(a.size());
		print(a);
		a.add(0, 23);
		print(a);
		a.add(3, 44);
		print(a);
		
		
	}

}
