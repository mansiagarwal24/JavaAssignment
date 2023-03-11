/*
    Write a program to implement constructor reference.
 */


package Java8Features;

import java.util.function.Function;

class Student{
    private String name;

    public String getName() {
        return name;
    }

    Student(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

interface studentInterface{
    Student getStudent(String name);
}
public class ConstructorReference {
    public static void main(String[] args) {
        studentInterface stu = Student::new;
        Function<String,Student> s1 = Student::new;
        Function<String,Student> s2 = (name) -> new Student(name);

        System.out.println(stu.getStudent("Aditya").getName());
        System.out.println(s1.apply("Jai").getName());
        System.out.println(s2.apply("Mansi").getName());
    }
}
