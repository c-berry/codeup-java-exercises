package Exceptions;

import java.util.InputMismatchException;

public class ExceptionsTest {
    public static void main(String[] args) {

        ExceptionsStudy study = new ExceptionsStudy();

//        try {
//            System.out.println(Integer.parseInt(study.maybeAnInteger));
//
//            System.out.println(Integer.parseInt(study.certainlyNotAnInteger));
//        } catch (NumberFormatException nfe) {
//            System.out.println("Got an exception => " + nfe);
////            nfe.printStackTrace(); //shows error message
//        }

        String myTestString = "Test string";
//        try{
////            int myStringLength = myTestString.length();
//            String mySubString = myTestString.substring(0,24);
//            System.out.println(mySubString);
//
//        } catch (IndexOutOfBoundsException iobe){
//            System.out.println("Index out of bounds => " + iobe);
//        }

//        study.askForAnInteger();


//        try{
//            study.subListMaker("8");
//        } catch (IndexOutOfBoundsException iobe){
//            System.out.println("Exception caught! => " + iobe);
//        } catch (InputMismatchException ime) {
//            System.out.println("Exception intercepted! => " + ime);
//        } catch (NullPointerException npe) {
//            System.out.println("Exception inception! => " + npe);
//        } catch (IllegalArgumentException iae){
//            System.out.println("Wait, that's illegal! => " + iae);
//        } finally {
//            System.out.println("Wasn't this fun?!");
//        }

        //throws exception =>
        study.echoWorld();

    }
}


