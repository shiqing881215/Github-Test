
public class Test {
	public int i = 0;
	public static int j = 0;
	
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		t1.i++;
		t1.j++;
		System.out.println(t2.i);
		System.out.println(t2.j);
		
        // Add this line just for github test
	}

}
