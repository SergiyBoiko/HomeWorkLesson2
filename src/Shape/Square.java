package Shape;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Square extends Shape{
	private double lenghtSideSqeare;
	private Triangle triangleSquare;
	private double hipotenusa;

	@Override
	public BigDecimal calculateArea() {
		return new BigDecimal(Math.pow(lenghtSideSqeare,2));
	}

	@Override
	public BigDecimal calculatePerimeter() {
		return new BigDecimal(4*lenghtSideSqeare);
	}

	@Override
	public void readParamertsShape(Scanner s) throws InputMismatchException {
		System.out.println("Enter side square:");
		this.lenghtSideSqeare = CheckNegativeSide.negativeSide(lenghtSideSqeare,s);
		
		double angleBetweenSidesTriangle = 90;
		hipotenusa = Math.sqrt(Math.pow(lenghtSideSqeare, 2)+Math.pow(lenghtSideSqeare, 2));

		triangleSquare = new Triangle(lenghtSideSqeare,lenghtSideSqeare,angleBetweenSidesTriangle);

	}

	@Override
	public String toString() {
		String s = String.format("Square with side = %.2f",lenghtSideSqeare);
		return s+String.format("\nP =%.5f",calculatePerimeter())+String.format("\nS =%.5f",calculateArea())
		+"\nSquare consists from two triangles, triangle properties:"+"\n"+triangleSquare.toString()
		+String.format("\nhipotenusa =%.2f",hipotenusa);
	}
}
