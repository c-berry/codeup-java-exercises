import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("test");

        //Loop Basics:
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        int u = 0;
//        do {
//            System.out.println(u);
//            u += 2;
//        }
//        while (u <= 100);

//        int y = 100;
//        do {
//            System.out.println(y);
//            y -= 5;
//        }
//        while (y > 0);

//        long t = 2;
//        do {
//            System.out.println(t);
//            t *= t;
//        }
//        while (t < 1_000_000);

//        for(int i = 5; i <=15; i++){
//            System.out.println(i);
//        }
//
//        for(int u = 0; u <= 100; u += 2){
//            System.out.println(u);
//        }

//        for(int y = 100; y > 0; y -= 5){
//            System.out.println(y);
//        }

//        for(long t = 2; t < 1_000_000; t *= t){
//            System.out.println(t);
//        }

        //Fizzbuzz:
//        for(int r = 1; r <= 100; r++){
//            if (r % 3 == 0 && r % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (r % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (r % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(r);
//            }
//        }

        //Table of Powers:
//        System.out.println("Enter number to increment to:");
//        int num = sc.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println();
//        System.out.println("number \t|\t squared \t|\t cubed");
//        System.out.println("------ \t|\t -------- \t|\t -------");
//        for(int i = 1; i <= num; i++){
//            System.out.println(i +" \t\t|\t\t"+ i*i +" \t\t|\t\t"+ i*i*i);
//        }

        //Convert to Letter Grades:
        System.out.println("Enter your numerical grade:");
        int grade = sc.nextInt();

        if (grade > 98){
            System.out.println("A+");
        } else if (grade > 87) {
            System.out.println("Grade: A");
        } else if (grade > 79) {
            System.out.println("Grade B");
        } else if(grade > 66){
            System.out.println("Grade C");
        } else if (grade > 59) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }


        //END=>
    }
}
