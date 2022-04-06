package shapes;

public class Square extends Quadrilateral {

    protected int side;

    protected Square(){
        System.out.println("Square created.");
    }

    protected Square(int side){
        super(side, side);
        this.side = side;
    }

    @Override
    public void setLength(int length) {
//        this.length = length;
    }

    @Override
    public void setWidth(int width) {
//        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    //BEFORE INTERFACES AND ABSTRACT REFACTOR:
//    protected int side;
//
//    //constructors =>
//    public Square(){
//        System.out.println("Square created.");
//    }
//    public Square(int side){
//        //or:
////        super(side, side);
//        this.side = side;
//        super.length = side;
//        super.width = side;
//    }
//
//    //getter and setter =>
//    public int getSide() {
//        return side;
//    }
//    public void setSide(int side) {
//        this.side = side;
//    }
//
//    //methods =>
//    public int getArea(){
//        return side * side;
//    }
//    public int getPerimeter(){
//        return 4 * side;
//    }
}

