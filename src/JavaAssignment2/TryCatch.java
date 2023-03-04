/*
    Write Java code to define List .
    Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
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
