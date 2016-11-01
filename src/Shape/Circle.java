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
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		String s = String.format("Circle with radius = %.2f",radius);
		return s;
	}
}
