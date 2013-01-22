
public class Rectangle extends Shape{
	private int width;
	private int length;
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	
	public void setLength(int newLength){
		length = newLength;
	}
	
	public Rectangle(int x, int y) {
		super(30);
		width = x;
		length = y;
	}
	
	public String toString() {
		String r = new String();
		r = "Rectangle : \n";
		r += "width = " + width + "\n"; 
		r += "length = " + length;
		return r;
	}
	
	public static void main (String[] args) {
		Rectangle r = new Rectangle(3,6);
		System.out.println(r.width);
		System.out.println(r.length);
	}
}
