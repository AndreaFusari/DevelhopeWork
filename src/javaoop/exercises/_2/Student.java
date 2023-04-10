package src.javaoop.exercises._2;

public class Student {
    String name;
    int age;
    Student(String name, int age){
        System.out.println("Constructing!");
        this.name= name;
        this.age= age;
        System.out.println("Constructed!");
    }
    Student(String name){
        this.name= name;
    }
    Student(int age){
        this.age=age;
    }
    Student(){
    }

    @Override
    public String toString() {
        return  "Student{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
