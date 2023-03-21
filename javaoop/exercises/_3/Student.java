package javaoop.exercises._3;

import java.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private LocalDate studentBirthday;
    private String city;
    private String studentGender;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentBirthday=" + studentBirthday +
                ", city='" + city + '\'' +
                ", gender=" + studentGender +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.matches(".*\\d+.*")){
            System.out.println("Not valid name");
        }
            else {this.name = name;
            }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age<18){
            System.out.println("Too young for this course");
        } else { this.age = age;
        }
    }

    public LocalDate getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(LocalDate studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        if (studentGender.equals("Male")||studentGender.equals("Female")) {
        this.studentGender = studentGender;
        } else {
            System.out.println("Gender not specified!");
    }
    }

}
