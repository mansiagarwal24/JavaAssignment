/*
    Create and access default and static method of an interface.
 */
package FeaturesPart2;

interface myInterface{
    //default method
    default void print(){
        System.out.println("This is a default method in interface");
    }

    //static method
    static String show(){
        return "This is a static method in interface";
    }
}

public class Ques2 implements myInterface{
    public static void main(String[] args) {
        myInterface mi = new Ques2();
        mi.print();
        System.out.println(myInterface.show());

    }
}
