package shapes;

public class Rectangle extends Quadrilateral {

    protected  int length;
    protected int width;

    protected Rectangle(){};

    protected Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }


    //BEFORE INTERFACES AND ABSTRACT REFACTOR:
//    protected int length;
//    protected int width;
//
//    //constructors =>
//    public Rectangle(){
//        System.out.println("Rectangle created.");
//    }
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    //getter =>
//    public int getLength() {
//        return length;
//    }
//
//    //setter =>
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    //methods =>
//    public int getArea(){
//        return length * width;
//    }
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }

}







