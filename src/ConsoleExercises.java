import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Exercise 1:
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
//        System.out.println("Enter a Number:");
//        int favNumber = sc.nextInt();
//        System.out.printf("Your number is: %d%n", favNumber);
//        System.out.println("Here it is again: " + favNumber);

        //Exercise 2:
//        System.out.println("Enter your first name:");
//        String first = sc.next();
//        System.out.println("Enter your middle name:");
//        String middle = sc.next();
//        System.out.println("Enter your last name:");
//        String last = sc.next();
//        System.out.printf("Your name is: %s %s %s%n",first, middle, last);

//        System.out.println("Enter a quote:");
//        String quote = sc.nextLine();
//        System.out.println(quote + " ..nice.");

        //Exercise 3:
        System.out.println("Enter length:");
        String length = sc.nextLine();
        float intLength = Float.parseFloat(length);

        System.out.println("Enter width:");
        String width = sc.nextLine();
        float intWidth = Float.parseFloat(width);

        System.out.println("Area: " + intLength * intWidth);
        System.out.println("Perimeter: " + 2 * (intLength + intWidth));

    }
}
