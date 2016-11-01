package Shape;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle extends Shape{
		
	private double heightSideRectangle;
	private double widthSideRectangle;

	@Override
	public BigDecimal calculateArea() {
		return new BigDecimal(heightSideRectangle*widthSideRectangle);
	}

	@Override
	public BigDecimal calculatePerimeter() {
		return new BigDecimal(2*(heightSideRectangle*widthSideRectangle));
	}
	
	@Override
	public void readParamertsShape(Scanner s) throws InputMismatchException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		String s = String.format("Rectangle with sides a = %.2f b = %.2f",heightSideRectangle,widthSideRectangle);
		return s;
	}
}
