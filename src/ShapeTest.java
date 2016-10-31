import java.util.Scanner;

import Shape.*;

public class ShapeTest {
	
	private static Scanner input;
	
	public static void main(String[] args){
		Shape shape = CreateShapeInMemory.createShape(input = new Scanner(System.in));
		CheckInputNameShape.infoShape(shape);
	}
}
