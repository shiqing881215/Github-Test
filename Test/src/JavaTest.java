import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


public class JavaTest {
	private String test;
	
	public void genericTest() {
		ArrayList<Object> al = new ArrayList<Object>();
//		ArrayList<T> al2 = new ArrayList<T>();
		Object o = new Object();
		String s = new String();
		al.add(s);
	}
	
//	public JavaTest(String test) {
//		this.test = test;
//	}
	
	public static double divideNoConsiderZero (double a, double b) throws ArithmeticException {
		return a/b;
	}
	
	public static void testFile() throws FileNotFoundException {
		File file = new File("/tmp/hello");
		try {
			Scanner scanner = new Scanner(new FileReader(file));
		} catch (Exception e) {
			throw new FileNotFoundException("ВиµД");
		}
	}
	
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
	
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
//		JavaTest jt = new JavaTest("hello");
//		System.out.println(jt.test);
		
//		String[] empty = null;
//		if (empty == null) {
//			
//		}
		
//		int[] array = new int[3];
//		String[] arrayStr = new String[3];
//		System.out.println(array[0]);
//		System.out.println(arrayStr[0]);
		
//		String s = "abc";
//		System.out.println(s.substring(1, 1) == null);
//		s.substring(2, 1);
		
//		System.out.print(divideNoConsiderZero(5,0));
		
//		testFile();
		
//		System.out.println("1");
////		throw new NullPointerException("heihei");
//		System.out.println(5/0);
//		System.out.println("3");
		
//		int[] src = {1,2,3,4,5,6};
//		int[] des = {6,7,8,9,10};
//		System.arraycopy(src, 0, des, 0, 3);
//		print(des);
		
//		String a  = null;
//		if (a == null) {
//			
//		}
		
//		String s1 = "abc";
//		String s2 = "abc";
//		String s3 = new String("abc");
//		String s4 = new String("abc");
//		System.out.println(s1.equals(s2));
//		System.out.println(s3.equals(s4));
//		System.out.println(s1 == s2);
//		System.out.println(s3 == s4);
		
//		double a = 22;
//		double b = 70;
//		System.out.print(a/b);
		
//		System.out.print('A' - 'a');
		
//		StringTokenizer st = new StringTokenizer("this is a test");
//		while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
//		int i = 01;
//		System.out.println(i);
		
//		int[] test = null;
//		for (int i = 1; i < 10; i++) {
//			test = new int[i];
//		}
//		System.out.println(test.length);
		
//		HashSet<Integer> set = new HashSet<Integer>();
//		System.out.println(set.size());
//		set.add(1);
//		System.out.println(set.size());
//		set.add(1);
//		System.out.println(set.size());
		
//		System.out.print(Integer.MIN_VALUE);
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(5);
//		list.remove(new Integer(5));
//		System.out.print(list.size());
		
//		String s = "hello world i love you";
//		String[] array = s.split(" ");
//		System.out.println(array.length);
		
//		int i = 1;
//		float f = 1.0f;
//		double d = 1.0000000000000001;
//		double d2 = Math.sqrt(2);
//		System.out.println(i == f);
//		System.out.println(i == d);
//		System.out.println(f == d);
//		System.out.println(d2 > i);
//		System.out.println(d2);

//		System.gc();
//		Runtime.getRuntime().gc();
		
//		Object o1 = new Object();
//		Object o2 = new Object();
//		Object o3 = o2;
//		System.out.println(o1.hashCode());
//		System.out.println(o2.hashCode());
//		System.out.println(o3.hashCode());
		
//		double d = 5/0;
		
//		String s = "   4  ";
//		System.out.println(s.split(" ",1).length);
		
//		String s = "abcabcdeabcedabc";
//		String s2 = s.replace("abc", "HHHH");
//		System.out.println(s2);
		
//		String s = "ddd";
//		System.out.println(s.compareTo(null));
		
		TreeSet<Double> mySet = new TreeSet<Double>();
		mySet.add(1.0);
		Double d = mySet.pollFirst();
		System.out.println(d);
	}

	
	
}
