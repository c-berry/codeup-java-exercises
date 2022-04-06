package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private String username;
    private ArrayList<Integer> grades;

    //constructors =>
    public Student(){
        this.grades = new ArrayList<>();
    }
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public Student(String name, String username){
        this.name = name;
        this.username = username;
        this.grades = new ArrayList<>();
    }
//    public Student(String name, String username, ArrayList<Integer> grades, int grade){
//        this.name = name;
//        this.username = username;
//        this.grades = grades;
//        this.addGrade(grade);
//    }

    //getters =>
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    //setters =>
    public void setName(String name) {
        this.name = name;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    //methods =>
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
        }
        return sum / grades.size();
        //or:
//        double sum = 0;
//        for (Integer grade : grades) {
//            sum += grade;
//        }
//        return sum / grades.size();
    }

    public String toString(){
        return getGrades().toString();
    }


}

