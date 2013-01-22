
public class Ship {
	private String name;
	private double x;
	private double y;
	private Port destination;
	
	public Ship(String name) {
		this.name = name;
	}
	
	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setDestination(Port destination) {
		this.destination = destination;
	}
	
	public double getDistance() {
		return Math.sqrt(Math.pow(Math.abs(this.x-destination.getX()), 2) + Math.pow(Math.abs(this.y-destination.getY()), 2));
	}
	
	public String toString() {
		String s = "Ship " + name + " has a distance " + getDistance() + " from the destination.";
		return s;
	}
}
