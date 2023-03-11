/*
    Demonstrate the use of private methods in interfaces
 */
package JavaAddition9_17;
interface Demonstrate {
   default void show(){
        System.out.println("This is a default method");
        method();
   }

    private void method(){
        System.out.println("This is a private method in interface");
    }

    static void show1(){
        System.out.println("This is a static method");
        method1();
    }

    private static void method1(){
        System.out.println("This is a private static method in interface");
    }
}

public class Ques1 implements Demonstrate {
    public static void main(String[] args) {
        //this reference is used to access default methods
        Demonstrate demo = new Ques1();
        demo.show();
        //this reference is used to access static methods
        Demonstrate.show1();
    }
}
