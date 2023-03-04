/*
    WAP showing try, multi-catch and finally blocks.
 */
package JavaAssignment2;

public class TryCatch {
    public static void main(String[] args){
        try{
            int[] array = new int[5];
            array[5]=7;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of BoundsException");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
        finally {
            System.out.println("finally block will always execute!!");
        }
        System.out.println("outside the try-catch-finally block");
    }
}
