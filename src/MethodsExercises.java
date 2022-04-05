import java.util.Scanner;

public class MethodsExercises {

    public static void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void multiplication(int num1, int num2) {
//        System.out.println(num1 * num2);

        //using for loop =>
        int result = 0;
        for (int i = 0; i < num2; i++){
            result += num1;
        }

        //using while loop =>
//        int result = 0;
//        while (num1 > 0) {
//            result += num2;
//            num1--;
//        }
        System.out.println(result);
    }

    public static void division(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    public static void modulus(int num1, int num2) {
        if (num2 == 0){
            System.out.println(num1);
        } else {
            System.out.println(num1 % num2);
        }
    }

    // TODO: use recursion to print out a given number up through 100
//     public static void countTo100(int num) {
//        System.out.println(num);
//        if (num >= 100){
//            return;
//        }
//
//        countTo100(num + 1);
//     }

    public static int countTo100(int num){
        System.out.println(num);
        if (num >= 100){
            return num;
        }
        return countTo100(num + 1);
    }

    // TODO: use recursion to add all numbers up from 1 to a given number
    public static int addNums(int num){
        if (num == 1){
            return 1;
        }
        return num + addNums(num - 1);
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10:");
        int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max){
            System.out.println("You got it!");
            return userInput;
        }
        return getInteger(min, max);
    }


    public static void calculateFactorial() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number between 1-10:");
            long userNumber = sc.nextLong();
            System.out.println("Your factorial: " + userNumber);

            System.out.println("Continue? [y/N]");
            String userInput2 = sc.next();

            long fact = 1;

            if (userInput2.equals("y") && userNumber <= 10) {
                for (int i = 1; i < userNumber; i++) {
                    fact = fact * i;
                    System.out.println("Fact = " + fact);
                }
            }
    }

    public static void diceGame(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of sides on your pair of dice:");
        int sidesOfDice = sc.nextInt();

        if (sidesOfDice == 0){
            System.out.println("Pick a different number...");
            diceGame();
        }

        double diceRoll1 = diceRoll(sidesOfDice);
        double diceRoll2 = diceRoll(sidesOfDice);

        System.out.println("You rolled: " + diceRoll1);
        System.out.println("You rolled: "+ diceRoll2);

        System.out.println("Play again? [y/N]");
        String answer = sc.next();
        if (answer.equals("y")){
            diceGame();
        }

    }

    public static double diceRoll(int num){
        double diceRoll = Math.floor(Math.random() * num + 1);
        return diceRoll;
    }

    public static void guessingGame() {
        System.out.println("Let's play a guessing game!");
        System.out.println("I'm thinking of a number between 1 and 10, try and guess the number: ");
        Scanner sc = new Scanner(System.in);
        int computerValue = (int) (Math.random() * 10 + 1);
        int numberOfTries = 0;
        while (true) {
            numberOfTries++;
            int guessedNum = sc.nextInt();

            if (guessedNum < computerValue) {
                System.out.println("HIGHER");
            } else if (guessedNum > computerValue) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS! You tried " + numberOfTries + " time(s).");
                break;
            }
        }
    }

    public static void main(String[] args) {

        //Exercise 1 =>
//            addition(86,2);
//            subtraction(98,10);
//            multiplication(4,22);
//            division(440,5);
//            modulus(11,2);

        //ToDo's =>
//        countTo100(1);
//        System.out.println(addNums(10));

        //Exercise 2 =>
//        getInteger(1,10);

        //Exercise 3 =>
//        calculateFactorial();

        //Exercise 4 =>
//        diceGame();

        //Exercise 5 =>
        guessingGame();



    }

    //END =>
}

