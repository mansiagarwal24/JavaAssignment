/*
    Implement multiple inheritance with default method inside interface.
 */
package Java8Features;

interface poet{
    default void write(){
        System.out.println("printing from poet interface");
    }
}

interface writer{
    default void write(){
        System.out.println("printing from writer interface");
    }
}

public class MultipleInheritance implements poet,writer{
    @Override
    public void write() {
        System.out.println("Printing is done!!");
    }

    public static void main(String[] args) {
        MultipleInheritance inheritance = new MultipleInheritance();
        inheritance.write();
    }
}
