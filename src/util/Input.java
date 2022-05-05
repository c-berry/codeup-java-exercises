package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private final Scanner sc = new Scanner(System.in);

    public String getString(){
//        System.out.println("Enter a string:");
//        String userInput = sc.nextLine();
//        System.out.println(userInput);
        return sc.nextLine();
    }
    public boolean yesNo(){
        System.out.println("[y/N]");
        String userInput = sc.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max) {
        System.out.println("Enter a number between" + min + " and " + max + ":");
//        int num = sc.nextInt();
        try {
            int num = Integer.valueOf(getString());
            if (num >= min && num <= max) {
                System.out.println("Nice.");
                return num;
            }
            System.out.println("Try again.");
            return getInt(min, max);
        } catch (NumberFormatException nfe){
            System.out.println("Not an integer");
        }
        return getInt(min, max);
    }

    public int getInt(){
        System.out.println("Enter a Number: ");
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException nfe) {
            System.out.println("Not an integer! Try again.");
        }
        return getInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal number between: " + min + " and " + max);
        try {
            double num = Double.valueOf(getString());
            if (num >= min && num <= max) {
                System.out.println("Nice.");
                return num;
            }
            System.out.println("Try again.");
            return getDouble(min, max);
        } catch (NumberFormatException nfe){
            System.out.println("Not a double");
            return getDouble(min, max);
        } catch (InputMismatchException ime){
            System.out.println("Not a double");
        }
        return getDouble(min, max);
    }

    public double getDouble(){
        System.out.println("Enter a double: ");
        try {
            return Double.valueOf(getString());
        } catch (NumberFormatException nfe){
            System.out.println("Not a double");
        }
        return getDouble();
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }

}



class InputTest{
    public static void main(String[] args) {

        Input input1 = new Input();

//        input1.getString();
//        System.out.println(input1.yesNo());
//        input1.getInt(1,10);
//        input1.getInt();
        System.out.println("Success! " + input1.getDouble(1.12340,100.12350));
//        System.out.println("success " + input1.getDouble());
//        input1.yesNo("How are you?");



    }
}


