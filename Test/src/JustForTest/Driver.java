package JustForTest;

public class Driver {
	
	public static void f(A a, D d) {
		System.out.println("1");
	}
    public static void f(B b, A a) {
		System.out.println("2");
    }
    public static void f(C c, D d) {
		System.out.println("3");
    }
    
	 public static void main(String[] args) {
	    	f(new A(), new E());
	        f(new C(), new A());
	        f(new C(), new E());
//	        f(new B(), new D());
	    }
}
