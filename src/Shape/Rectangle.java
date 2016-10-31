package Shape;

import java.math.BigDecimal;

public class Rectangle extends Shape{
		
	private double heightSideRectangle;
	private double widthSideRectangle;
	
	public Rectangle(double a, double b) {
		super();
		this.heightSideRectangle = a;
		this.widthSideRectangle = b;
	}
	public double getHeightSideRectangle() {
		return heightSideRectangle;
	}

	public void setHeightSideRectangle(double heightSideRectangle) {
		this.heightSideRectangle = heightSideRectangle;
	}

	public double getWidthSideRectangle() {
		return widthSideRectangle;
	}

	public void setWidthSideRectangle(double widthSideRectangle) {
		this.widthSideRectangle = widthSideRectangle;
	}

	@Override
	public BigDecimal calculateArea() {
		return new BigDecimal(heightSideRectangle*widthSideRectangle);
	}

	@Override
	public BigDecimal calculatePerimeter() {
		return new BigDecimal(2*(heightSideRectangle*widthSideRectangle));
	}
	@Override
	public String toString() {
		String s = String.format("Rectangle with sides a = %.2f b = %.2f",heightSideRectangle,widthSideRectangle);
		return s;
	}

}
