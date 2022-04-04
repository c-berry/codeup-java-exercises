public class Vehicle {
    private String name;
    private int year;

    public void makeNoise(){
        System.out.println("vroom vroom");
    }

    public void mpg(){
        System.out.println("Good MPG.");
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Car extends Vehicle{
    public void mpg(){
        System.out.println("Fantastic MPG.");
    }
}


