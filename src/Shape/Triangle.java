package Shape;

import java.math.BigDecimal;

public class Triangle extends Shape{
	private double oneSideTriangle;
	private double otherSideTriangle;
	private double angleBetweenSidesTriangle;
	
	public Triangle(double a, double b, double y) {
		super();
		this.oneSideTriangle = a;
		this.otherSideTriangle = b;
		this.angleBetweenSidesTriangle = y;
		
	}
		
	public double getOneSideTriangle() {
		return oneSideTriangle;
	}

	public void setOneSideTriangle(double oneSideTriangle) {
		this.oneSideTriangle = oneSideTriangle;
	}

	public double getOtherSideTriangle() {
		return otherSideTriangle;
	}

	public void setOtherSideTriangle(double otherSideTriangle) {
		this.otherSideTriangle = otherSideTriangle;
	}

	public double getAngleBetweenSidesTriangle() {
		return angleBetweenSidesTriangle;
	}

	public void setAngleBetweenSidesTriangle(double angleBetweenSidesTriangle) {
		this.angleBetweenSidesTriangle = angleBetweenSidesTriangle;
	}

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
	public String toString() {
		String s = String.format("Triangle with side a = %.2f b = %.2f angle between sides = %.2f",oneSideTriangle,otherSideTriangle,angleBetweenSidesTriangle);
		return s;
	}
	
	

}
