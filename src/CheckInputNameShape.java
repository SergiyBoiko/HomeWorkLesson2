import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;
import Shape.Square;
import Shape.Triangle;

public class CheckInputNameShape {
    public static Shape choosingEnumTypeShape(EnumTypeShape typeShape){
        switch (typeShape){
            case CIRCLE:
                return new Circle(2);
            case SQUARE:
                return new Square(2);
            case RECTANGLE:
                return new Rectangle(2,3);
            case TRIANGLE:
                return new Triangle(3,4,120);
        }
        return null;
    }

    public static boolean checkNameShape(String inputNameShape){
        try{
        	choosingEnumTypeShape(EnumTypeShape.valueOf(inputNameShape));
            return true;
        }catch (Exception e){
                System.out.println("Incorrect input name Shape!");
            return false;
        }
    }
    public static void infoShape(Shape shape){
        System.out.println(shape.toString());
    }
}
