package shapes;

public class Square extends Rectangle {
    protected int side;

    //constructors =>
    public Square(){
        System.out.println("Square created.");
    }
    public Square(int side){
        super(side, side);
        this.side = side;
        //super.length = side;
        //super.width = side;
    }

    //getter and setter =>
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    //methods =>
    public int getArea(){
        return side * side;
    }
    public int getPerimeter(){
        return 4 * side;
    }
}

