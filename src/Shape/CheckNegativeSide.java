package Shape;

import java.util.Scanner;

public class CheckNegativeSide {
	public static double negativeSide(double side, Scanner s) {
		do{
			side = s.nextDouble();
			if(side>0){
				break;
			}else System.out.println("Figure can not have negative side");
			continue;
		}while(true);
		return side;
	}
}
