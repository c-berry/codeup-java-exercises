import java.util.Scanner;

public class JavaWarmups {

//    public static char returnFirstCapitalLetter(String s) {
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == Character.toUpperCase(s.charAt(i))) {
//                return s.charAt(i);
//            }
//        }
//        return ' ';
//    }
//
//    public static char returnFirstCapitalLetter2(String string){
//        for (int i = 0; i < string.length(); i++) {
//            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z' ) return string.charAt(i);
//        }
//        return ' ';
//    }
//
    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);

//        Create a Java class, JavaWarmups. Add a main method to test the warmup methods.
//                Create a method, returnFirstCapitalLetter, that takes in a string and returns the first capital letter as a char. If no capital letter is found, return a single space character ' '. Assume only letters in the input string and all possible inputs will have at least one letter.
//        System.out.println(returnFirstCapitalLetter("hellO")); // returns 'O'
//        System.out.println(returnFirstCapitalLetter("hello")); // returns ' '
//        System.out.println(returnFirstCapitalLetter("hEllo")); // returns 'E'
//        System.out.println(returnFirstCapitalLetter("hELlO")); // returns 'E'
//        System.out.println(returnFirstCapitalLetter("H"));     // returns) 'H'


        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }


        //END =>
    }
}
