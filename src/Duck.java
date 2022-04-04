public class Duck extends Bird{
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Quack quack");
    }
}

class Penguin extends Bird{
    public void makeNoise(){
        System.out.println("Squawk squawk");
    }
    public void move(){
        System.out.println("Waddle waddle");
    }
}