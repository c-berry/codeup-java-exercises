import util.Input;

class Person {
    Input input = new Input();
    private String name;
    private int age;


    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println(this.name);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
//END OF PERSON CLASS =>
}

public class PersonExercise{
    public static void main(String[] args) {



        Person person1 = new Person("John", 20);
        Person person2 = new Person("Greg", 18);

//        person1.sayHello();
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}


