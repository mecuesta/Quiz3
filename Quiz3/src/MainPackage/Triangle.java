package MainPackage;

public class Triangle extends GeometricObject {
	// Declaring the Private Attributes of class Triangle
	private double side1;
	private double side2;
	private double side3;
	// the constructor for default triangle with all sides equal to one
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	// The Constructor for triangle with specified sides
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;			
		}
	// public getters and setters for triangle
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	// javadoc Override for getArea() method
	@Override
	// getArea() method that returns the area of the triangle
	public double getArea() {
		double multiplier = ((side1 + side2 + side3)/2);
		return Math.sqrt(multiplier*(multiplier-side1)*(multiplier-side3));
	}
	// javadoc Override for getPerimeter() method
	@Override
	// getPerimeter() method that returns the perimeter of the triangle
	public double getPerimeter() {
		return (side1+side2+side3);
	}
	// toString() method that returns a description of the triangle
	public String toString() {
		return ("The area of the triangle is " + getArea() + " and the "
				+ "perimeter of the triangle is " + getPerimeter());
	}
	
	
	// needed to run, does nothing other than that
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
