package person;

public class PersonTest {
        public static void main(String[] args) {


//            Person person1 = new Person("John", 20);
//            Person person2 = new Person("Greg", 18);

//        person1.sayHello();
//        person.Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


            Employee emp = new Employee("Peter Gibbons", "IT");
            System.out.println(emp.getName() + " works in " + emp.getDepartment());

        }
}
