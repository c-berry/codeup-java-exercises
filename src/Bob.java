import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //This code will continue the conversation with Bob until break conditional is met=>
        while(true){
            System.out.println("Ask Bob a question");
            String question = sc.nextLine();
            if (question.endsWith("?")){
                System.out.println("Sure, Dude.");
            } else if (question.endsWith("!")){
                System.out.println("Whoa, chill out man!");
            } else if (question.isBlank()) {
                System.out.println("Fine, I didn't want to talk to you anyways...");
            } else if (question.equalsIgnoreCase("goodbye")
            || question.equalsIgnoreCase("bye")){
                System.out.println("Goodbye.");
                break;
            } else {
                System.out.println("Whatever.");
            }
        }


    //END=>
    }
}
