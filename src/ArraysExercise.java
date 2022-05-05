//import person.Person;
//
//import java.util.Arrays;
//
//public class ArraysExercise {
//
//    public static Person[] addPerson(Person[] people, Person newPerson) {
//        Person[] newArray = new Person[people.length + 1];
//        for (int i = 0; i < people.length; i++ ){
//           newArray[i] = people[i];
//        }
//        newArray[newArray.length - 1] = newPerson;
//        return newArray;
//    }
//
//    public static Person[] addPersonCopy(Person[] people, Person newPerson){
//        Person[] newArray;
//        newArray = Arrays.copyOf(people, people.length + 1);
//        newArray[newArray.length - 1] = newPerson;
//        return newArray;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
////        System.out.println(numbers);
////        System.out.println(Arrays.toString(numbers));
//
//        //establishes array of objects
//        Person[] people = new Person[3];
//        people[0] = new Person("Dane", 32);
//        people[1] = new Person("Bob", 22);
//        people[2] = new Person("Joe", 12);
//
//        //or:
////        person.Person Timmy = new person.Person("Timmy", 10);
////        person.Person Johnny = new person.Person("Johnny", 18);
////        person.Person Susie = new person.Person("Susie", 20);
////        person.Person[] people = {Timmy, Johnny, Susie};
////        System.out.println(Arrays.toString(people));
////        for(person.Person person : people){
////            System.out.println(person.getName());
////        }
////        for (int i = 0; i < people.length; i++){
////        System.out.println(people[i].getName());
////        }
//
//        //calls method that adds new person to an array =>
//        Person[] newPeopleArray = ArraysExercise.addPersonCopy(people, new Person("Jay", 20));
//        for(Person person : newPeopleArray){
//            System.out.println(person.getName());
//        }
//
////        or:
//        Person[] newPeopleArray2 = ArraysExercise.addPerson(people, new Person("Jay", 20));
//        for(Person person : newPeopleArray2){
//            System.out.println(person.getName());
//        }
//
//
//
//
//    // END OF MAIN =>
//    }
//
//}
