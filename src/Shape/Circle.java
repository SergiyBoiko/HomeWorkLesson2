package Shape;

import java.math.BigDecimal;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double r) {
		super();
		this.radius = r;		
	}

	@Override
	public BigDecimal calculateArea() {
		return new BigDecimal(Math.PI*Math.pow(radius, 2));
	}

	@Override
	public BigDecimal calculatePerimeter() {
		return new BigDecimal(2*Math.PI*radius);
	}

	@Override
	public String toString() {
		String s = String.format("Circle with radius = %.2f",radius);
		return s;
	}
	
	
	

}
