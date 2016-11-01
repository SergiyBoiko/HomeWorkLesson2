import java.util.InputMismatchException;
import java.util.Scanner;

import Shape.Shape;

public class ShapeParamerts {
	private static boolean flag;

	public static void shapeParamerts(Shape shape) {
		flag = false;
		while(!flag){
			try {
				flag = true;
				shape.readParamertsShape(new Scanner(System.in));
			} catch (InputMismatchException e) {
				flag = false;
			}
		}
	}

}
