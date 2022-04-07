package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

//        Input sc = new Input();
        Scanner sc = new Scanner(System.in);;

        Student chris = new Student("Chris", "c-berry");
        Student oscar = new Student("Oscar", "oscar-ct");
        Student jason = new Student("Jason", "jSON");
        Student john = new Student("John", "here's-johnny");

        chris.addGrade(100);
        chris.addGrade(99);
        chris.addGrade(98);

        oscar.addGrade(99);
        oscar.addGrade(98);
        oscar.addGrade(97);

        jason.addGrade(96);
        jason.addGrade(95);
        jason.addGrade(94);

        john.addGrade(93);
        john.addGrade(92);
        john.addGrade(91);

//        System.out.println(chris.getGrades());
//        System.out.println(chris.getGradeAverage());
//
//        System.out.println(oscar.getGrades());
//        System.out.println(oscar.getGradeAverage());
//
//        System.out.println(jason.getGrades());
//        System.out.println(jason.getGradeAverage());

        HashMap<String, Student> students = new HashMap<>();
        students.put("c-berry", chris);
        students.put("oscar-ct", oscar);
        students.put("jSON", jason);
        students.put("here's-johnny", john);

//        System.out.print("\nList of students by GitHub username: ");
//        for (Map.Entry<String, Student> student : students.entrySet()){
//            System.out.print("|" + student.getKey() + "|" + " ");
//        }
//        System.out.println();

        while(true) {
            System.out.println("Would you like to view student info? [y/N]");
            String response = sc.next();

            if (response.equalsIgnoreCase("y")
            || response.equalsIgnoreCase("yes")) {

                System.out.println("Which student would you like to see?");

                System.out.print("List of students by GitHub username: ");
                for (Map.Entry<String, Student> student : students.entrySet()){
                    System.out.print("|" + student.getKey() + "|" + " ");
                }

                String answer = sc.next();
                switch (answer) {
                    case "c-berry" -> {
                        System.out.println("Student: " + chris.getName());
                        System.out.println("Student grades: " + students.get("c-berry"));
                        System.out.println("Grade average is: " + chris.getGradeAverage());
                    }
                    case "oscar-ct" -> {
                        System.out.println("Student: " + oscar.getName());
                        System.out.println("Student grades: " + students.get("oscar-ct"));
                        System.out.println("Grade average is: " + oscar.getGradeAverage());
                    }
                    case "jSON" -> {
                        System.out.println("Student: " + jason.getName());
                        System.out.println("Student grades: " + students.get("jSON"));
                        System.out.println("Grade average is: " + jason.getGradeAverage());
                    }
                    case "here's-johnny" -> {
                        System.out.println("Student: " + john.getName());
                        System.out.println("Student grades: " + students.get("here's-johnny"));
                        System.out.println("Grade average is: " + john.getGradeAverage());
                    }
                    default -> System.out.println("No students match the username of \"" + answer + "\".");
                }
            } else if (response.equalsIgnoreCase("n")
            || response.equalsIgnoreCase("no")) {

                System.out.println("Goodbye.");
                break;
            }
        }


    //END OF MAIN =>
    }
}
