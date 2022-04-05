package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    //constructors =>
    public Rectangle(){
        System.out.println("Rectangle created.");
    }
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    //getter =>
    public int getLength() {
        return length;
    }

    //setter =>
    public void setLength(int length) {
        this.length = length;
    }

    //methods =>
    public int getArea(){
        return length * width;
    }
    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }

}

class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);

        System.out.println("box1 perimeter: "+ box1.getPerimeter());
        System.out.println("box1 area: " + box1.getArea());

        Rectangle box2 = new Square(5);

        System.out.println("box2 perimeter: " + box2.getPerimeter());
        System.out.println("box2 area: " + box2.getArea());

    }
}





