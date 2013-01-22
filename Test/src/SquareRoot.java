import java.text.NumberFormat;


public class SquareRoot {
	public double sqrt(double num) {
		NumberFormat f=NumberFormat.getInstance();
		f.setMaximumFractionDigits(4);
		double d = Math.sqrt(num);
		return Double.parseDouble(f.format(d));
	}
	
	
	public static void main(String[] args) {
		SquareRoot s = new SquareRoot();
		System.out.println(s.sqrt(2));
	}
}
