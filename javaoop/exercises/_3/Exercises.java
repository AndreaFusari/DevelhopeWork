package javaoop.exercises._3;

import java.time.LocalDate;
import java.time.Month;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student student= new Student();

        student.setName("Mario Rossi");// Write and use your 5 getters and setters!
        student.setAge(30);
        student.setStudentBirthday(LocalDate.of(1992, Month.AUGUST,20));
        student.setCity("Torino");
        student.setStudentGender("Male");
        student.getCity();

        System.out.println(student);

        Student student1 = new Student();

        student1.setName("Laura Blu");
        student1.setAge(24);
        student1.setStudentBirthday(LocalDate.of(1999, Month.AUGUST,10));
        student1.setCity("Milano");
        student1.setStudentGender("Female");
        student1.getCity();

        System.out.println(student1.getStudentBirthday());
        System.out.println(student1);
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

       Student student2 = new Student();//Write your code here
        student2.setAge(15);
        student2.setName(" 2Marco");
        student2.setStudentGender("rmale");
        student2.setCity("Roma");
        student2.setStudentBirthday(LocalDate.of(2008,Month.APRIL,22));
        student2.getCity();
        student2.getCity();
        System.out.println(Student.countGetCity);
    }

}
