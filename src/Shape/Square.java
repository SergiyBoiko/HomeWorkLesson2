package Shape;

import java.math.BigDecimal;

public class Square extends Shape{
	private double lenghtSideSqeare;
	
	public Square(double a) {
		super();
		this.lenghtSideSqeare = a;
		//this.lenghtSideSqeare = getLenghtSide();
	}

	public double getLenghtSide() {
		return lenghtSideSqeare;
	}

	public void setLenghtSide(double lenghtSide) {
		this.lenghtSideSqeare = lenghtSide;
	}

	@Override
	public BigDecimal calculateArea() {
		return new BigDecimal(Math.pow(lenghtSideSqeare,2));
	}

	@Override
	public BigDecimal calculatePerimeter() {
		return new BigDecimal(4*lenghtSideSqeare);
	}

	@Override
	public String toString() {
		String s = String.format("Square with side = %.2f",lenghtSideSqeare);
		return s;
	}
	
	

}
