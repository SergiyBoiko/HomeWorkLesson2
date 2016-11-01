package Shape;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle extends Shape{
	
	private double radius;
	
	@Override
	public BigDecimal calculateArea() {
		return new BigDecimal(Math.PI*Math.pow(radius, 2));
	}

	@Override
	public BigDecimal calculatePerimeter() {
		return new BigDecimal(2*Math.PI*radius);
	}

		@Override
	public void readParamertsShape(Scanner s) throws InputMismatchException {
		System.out.println("Enter radius:");
		this.radius = CheckNegativeSide.negativeSide(radius,s);;
		
	}
		
	@Override
	public String toString() {
		String s = String.format("Circle with radius = %.2f",radius);
		return s+String.format("\nP =%.5f",calculatePerimeter())+String.format("\nS =%.5f",calculateArea());
	}
}
