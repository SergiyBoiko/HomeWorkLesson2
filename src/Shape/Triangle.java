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
	
	public Triangle(){}

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		String s = String.format("Triangle with side a = %.2f b = %.2f angle between sides = %.2f",oneSideTriangle,otherSideTriangle,angleBetweenSidesTriangle);
		return s;
	}
}
