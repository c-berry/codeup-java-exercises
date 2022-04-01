package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(){
        System.out.println("Enter a string:");
        String userInput = sc.nextLine();
        System.out.println(userInput);
        return userInput;
    }
    public boolean yesNo(){
        System.out.println("[y/N]");
        String userInput = sc.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max){
        System.out.println("Enter a number between" + min + " and " + max + ":");
        int num = sc.nextInt();
        if (num >= min && num <= max) {
            System.out.println("Nice.");
            return num;
        }
        System.out.println("Try again.");
        return getInt(min, max);
    }
    public int getInt(){
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println(num);
        return num;
    }
    public double getDouble(double min, double max){
        System.out.println("Enter a decimal number:");
        double num = sc.nextDouble();
        if (num >= min && num <= max){
            System.out.println("Nice.");
            return num;
        }
        System.out.println("Try again.");
        return getDouble(min, max);
    }
    public double getDouble(){
        return sc.nextDouble();
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
//        input1.getDouble(1.1111,1.222222);
//        input1.getDouble();
        input1.yesNo("How are you?");


    }
}


