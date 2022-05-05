package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOLectureExercise {

    public static void main(String[] args)  {

//        // Lecture examples to work out after students
//        String myPath = "/Users/files/this.text";
//        String fileName = "test.txt";
//        String directory = "data";
//
//        // Getting the file full path from this method get
//        Path filePath = Paths.get(directory,fileName);
//
//        System.out.println("filePath.getFileName() = " + filePath.getFileName());
//        System.out.println("filePath.toString() = " + filePath.toString());
//
//        Path fakePath = Paths.get("dir1","dir2","dir3","dir4", "file.text");
//
//        System.out.println("fakePath.toAbsolutePath() = " + fakePath.toAbsolutePath());

//        String myPath2 = "Users/Documents/wsa";
//        String fileName2 = "WSA Voucher.pdf";
//        String directory2 = "/IdeaProjects";
//        String directory3 = "FakeDir";
//        String directory4 = "FakeDir2";
//
//        Path filePath2 = Paths.get(directory2);
////        System.out.println(filePath2);
//
//        Path filePath3 = Paths.get(directory3,directory4,fileName2);
////        System.out.println(filePath3);
//
////        System.out.println(filePath3.toAbsolutePath());
//
//        Path filePath4 = Paths.get(directory2);
////        System.out.println(filePath4.isAbsolute());
//
//        String dishDir = "data";
//        String dishesFile = "dishes.txt";
//
//        List<String> FileData = null;
//
//        Path dishPath = Paths.get(dishDir, dishesFile);
//
////        List<String> fileData = Files.readAllLines(dishPath);
//
//        try {
//            if (Files.notExists(dishPath)) Files.createDirectories(dishPath);
////            if (Files.notExists(dishesFile)) Files.createFile(dishesFile);
//            } catch(IOException e){
//                System.out.println("Does not exists");
//                e.printStackTrace();
//        }
//
//        for (String line : fileData){
//            System.out.println(line);
//        }
//
//        FileManager dishesFile1 = new FileManager("dishes.txt", "data");
//
//
//
//
//    }

        Path dishesPath = Paths.get("data", "dishes.txt");
        Path dishesDirectory = Paths.get("data");


        List<String> fileData = null;
        List<String> moreDishes = Arrays.asList("hello", "fellas");

        try {
            if (Files.notExists(dishesDirectory)) Files.createDirectories(dishesDirectory);
            if (Files.notExists(dishesPath)) Files.createFile(dishesPath);
            fileData = Files.readAllLines(dishesPath);


            fileData.add("Whats up");
            fileData.add("Hi");
            Files.write(dishesPath, fileData);
            Files.write(
                    Paths.get("data", "dishes.txt"),
                    moreDishes,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println("Error!");
        }


        for (String line : fileData) {
            System.out.println(line);
        }


    }
}