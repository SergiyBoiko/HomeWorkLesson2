package Shape;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Square extends Shape{
	private double lenghtSideSqeare;

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
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		String s = String.format("Square with side = %.2f",lenghtSideSqeare);
		return s;
	}
}
