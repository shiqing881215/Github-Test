
public class Test1 extends Thread {
    private int tick = 1;
    private int num;
    
    public Test1 (int num) {
        this.num = num;
    }
    
    public void run() {
        while (tick < 400000) {
        	tick++;
        	if ((tick % 50000) == 0) {
        	    System.out.println("Thread #" + num + ", tick = " + tick);
        	}
        } 
    }
    
    public static void main(String[] args) {
    	Test1 t1 = new Test1(1);
    	Test1 t2 = new Test1(2);
    	try {
			t2.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	t1.start();
    	t1.notify();
    	t2.start();
    	Test1 t3 = new Test1(3);
    	try {
			t3.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	t2.notify();
    	t3.start();
    	Test1 t4 = new Test1(4);
    	try {
			t4.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	t3.notify();
    	t4.start();
    }
}