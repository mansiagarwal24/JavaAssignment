/*
    WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
 */

package JavaAssignment2;

class Excption{
    public void getExcp(){
        System.out.println("exception has been occurred");
    }
}
public class ClassNotFoundExp {

    public static void main(String[] args){

        Excption exp = new Excption();
        exp.getExcp();

        try {
            Class.forName("ExceptionClass");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
