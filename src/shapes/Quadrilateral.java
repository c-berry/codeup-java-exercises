package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;

    //constructors =>
    public Quadrilateral(){
        System.out.println("Quadrilateral created.");
    }
    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;

    }

    //getters =>
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    //setters =>
    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;

    }

}
