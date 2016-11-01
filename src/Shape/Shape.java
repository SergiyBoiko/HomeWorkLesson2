package Shape;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Shape {

	public abstract BigDecimal calculateArea();

	public abstract BigDecimal calculatePerimeter();
	
	public abstract void readParamertsShape(Scanner s) throws InputMismatchException;
	
	public abstract String toString();

}
