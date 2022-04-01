package shapes;

import util.Input;

class CircleApp {
    public static void main(String[] args) {

        Input input1 = new Input();

        System.out.println("Enter radius:");
        Circle circle1 = new Circle(input1.getDouble());

        System.out.println("circumference is: " + circle1.getCircumference());
        System.out.println("Area is: "+ circle1.getArea());



    }

}