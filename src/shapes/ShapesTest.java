package shapes;

public class ShapesTest {
        public static void main(String[] args) {

            Measurable myShape = new Square(5);

            System.out.println("Square area: " + myShape.getArea());
            System.out.println("Square perimeter: " + myShape.getPerimeter());

            Measurable myShape2 = new Rectangle(5, 4);

            System.out.println("Rectangle area: " + myShape2.getArea());
            System.out.println("Rectangle perimeter: " + myShape2.getPerimeter());

            //BEFORE REFACTOR:
//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println("box1 perimeter: "+ box1.getPerimeter());
//        System.out.println("box1 area: " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println("box2 perimeter: " + box2.getPerimeter());
//        System.out.println("box2 area: " + box2.getArea());
        }
}
