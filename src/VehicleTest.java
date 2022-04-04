public class VehicleTest {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle();
        truck.makeNoise();
        truck.mpg();

        Car honda = new Car();
        honda.makeNoise();
        honda.mpg();
    }
}
