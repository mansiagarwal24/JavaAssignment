/*
    Write a program to show application of Singleton Design Pattern.
 */
package JavaAssignment3;
import JavaAssignment3.Teacher;

public class SingletonMainClass {
    public static void main(String[] args) {
        SingletonClass singletonObj = SingletonClass.getInstance();
        singletonObj.simpleMethod();

        SingletonClass singletonObj2 = SingletonClass.getInstance();
        singletonObj2.simpleMethod();

        Teacher teacher = new Teacher();
        System.out.println(teacher);

        Teacher teacher2 = new Teacher();
        System.out.println(teacher2);
    }
}
