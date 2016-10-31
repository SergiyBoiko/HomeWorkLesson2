import java.util.Scanner;

import Shape.Shape;

public class CreateShapeInMemory {
	public static Shape createShape(Scanner input){
		String nameShape;
		System.out.println("Please enter a shape name (Circle, Square, Rectangle, Triangle):");
		do{
			nameShape = input.next().toUpperCase();
		}while(!CheckInputNameShape.checkNameShape(nameShape));
		Shape shape = CheckInputNameShape.choosingEnumTypeShape(EnumTypeShape.valueOf(nameShape));
		String sP = String.format("P = %.2f",shape.calculatePerimeter());
		System.out.println(sP);
		String sS = String.format("S = %.2f",shape.calculateArea());
		System.out.println(sS);
		return shape;
	}
}
