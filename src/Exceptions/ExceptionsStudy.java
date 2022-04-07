package Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsStudy {
    public String maybeAnInteger = "42";
    public String certainlyNotAnInteger = "I am NOT an integer";
    public String myTestString = "Test string";


    public void askForAnInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput);
            System.out.println("The integer in your string is " + userInputInteger);
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("String is null." + iobe);
        } catch (NumberFormatException nfe){
            System.out.println("Uh oh, " + nfe.getMessage() + " there is no integer!");
        } finally {
            System.out.println("Thank you for using this complex and useful application.");
            System.out.println("Please come back and visit.");
        }
    }

    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);

        ArrayList<String> wordArrayList = new ArrayList<String>();
        String[] stringArray = sentence.split(" ");

        for (String word : stringArray){
            wordArrayList.add(word);
        }

        List<String> shorterList = wordArrayList.subList(firstInt, secondInt);
        String newSentence = String.join(" ", shorterList);
        System.out.println(newSentence);
    }

    //manual exception =>
    public void echoWorld(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something");
        String whatYouSaid = scanner.nextLine();
        if(whatYouSaid.equals("curses")){
            throw new IllegalArgumentException();
        }
    }

}


