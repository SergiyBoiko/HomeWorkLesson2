package Shape;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle extends Shape{
	private double oneSideTriangle;
	private double otherSideTriangle;
	private double angleBetweenSidesTriangle;

	Triangle(double a, double b, double y) {
		super();
		this.oneSideTriangle = a;
		this.otherSideTriangle = b;
		this.angleBetweenSidesTriangle = y;

	}

	public Triangle() {}

	@Override
	public BigDecimal calculateArea() {
		return new BigDecimal(oneSideTriangle*otherSideTriangle*Math.sin(angleBetweenSidesTriangle*Math.PI/180));
	}

	@Override
	public BigDecimal calculatePerimeter() {
		double hypotenuse = Math.sqrt(Math.pow(oneSideTriangle, 2)+Math.pow(otherSideTriangle, 2)-2*oneSideTriangle*otherSideTriangle*Math.cos(angleBetweenSidesTriangle*Math.PI/180));
		return new BigDecimal(oneSideTriangle+otherSideTriangle+hypotenuse);
	}

	@Override
	public void readParamertsShape(Scanner s) throws InputMismatchException {
		System.out.println("Enter side a:");
		this.oneSideTriangle = CheckNegativeSide.negativeSide(oneSideTriangle,s);
		System.out.println("Enter side b:");
		this.otherSideTriangle = CheckNegativeSide.negativeSide(otherSideTriangle,s);
		System.out.println("Enter angle between sides a and b:");
		do{
		this.angleBetweenSidesTriangle = s.nextDouble();
		if(angleBetweenSidesTriangle>0 && angleBetweenSidesTriangle<180){
			break;
			}else System.out.println("Angel angle must be > 0 and < 180");
		continue;
		}while(true);

	}
	@Override
	public String toString() {
		String s = String.format("Triangle with side a = %.2f b = %.2f angle between sides = %.2f",oneSideTriangle,otherSideTriangle,angleBetweenSidesTriangle);
		return s+String.format("\nP =%.5f",calculatePerimeter())+String.format("\nS =%.5f",calculateArea());
	}
}
