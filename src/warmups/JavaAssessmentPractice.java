package warmups;

//# Java Assessment Practice Problems
//
//        1. Create a class called Practice with a main method.
//        2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
//        3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
//        4. Create a class called Pet with two String instance variables, name and type.
//        5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
//        6. Create a PetDog class that inherits from Pet.
//        7. In PetDog, create a boolean instance variable, trained.
//        8. Write a constructor for PetDog that sets its name, type, and trained properties.
//        9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.

public class JavaAssessmentPractice {

    public static int subtractTen(int num){
        return num - 10;
    }

    public static double average(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum =+ arr[i];
        }
        return sum / arr.length;
    }


}

class Practice {
    public static void main(String[] args) {

    }
}
class Pet {

    private String name;
    private String type;

    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }


}
