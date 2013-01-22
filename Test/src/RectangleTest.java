
public class RectangleTest {
	public static void main (String[] args) {
		Rectangle r2 = new Rectangle(3,5);
		System.out.println(r2.getLength());
		r2.setLength(18);
		System.out.println(r2.getLength());
		r2.printArea();
	}
}
