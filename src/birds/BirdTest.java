package birds;

public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal = new Bird();
        cardinal.setName("Cardinal");
        cardinal.setCanFly(true);
        //calls methods =>
        cardinal.makeNoise();
        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard birds.Duck");
        mallard.makeNoise();

        Finch goldenFinch = new Finch();
        goldenFinch.makeNoise();

        //polymorphism
        Bird theBird = new Bird();
        Bird myDuck = new Duck();
        myDuck.makeNoise();
    }
}