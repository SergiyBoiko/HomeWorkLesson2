package Shape;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle extends Shape{
		
	private double heightSideRectangle;
	private double widthSideRectangle;
	private Triangle triangleRectangle;
	private double hipotenusa;
	
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
		System.out.println("Enter height:");
		this.heightSideRectangle = CheckNegativeSide.negativeSide(heightSideRectangle,s);
		System.out.println("Enter width:");
		this.widthSideRectangle = CheckNegativeSide.negativeSide(widthSideRectangle,s);
		
		double angleBetweenSidesTriangle = 90;
		hipotenusa = Math.sqrt(Math.pow(heightSideRectangle, 2)+Math.pow(widthSideRectangle, 2));

		triangleRectangle = new Triangle(heightSideRectangle,widthSideRectangle,angleBetweenSidesTriangle);
		
	}
	
	@Override
	public String toString() {
		String s = String.format("Rectangle with sides a = %.2f b = %.2f",heightSideRectangle,widthSideRectangle);
		return s+String.format("\nP =%.5f",calculatePerimeter())
		+String.format("\nS =%.5f",calculateArea())
		+"\nRectangle consists from two triangles, triangle properties:"+"\n"+triangleRectangle.toString()
		+String.format("\nhipotenusa =%.2f",hipotenusa);
	}
}
