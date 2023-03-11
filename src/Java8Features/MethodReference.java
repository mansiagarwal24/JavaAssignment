/*
    Using (instance) Method reference create and apply add and subtract method and using
    (Static) Method reference create and apply multiplication method for the functional interface created
 */
package Java8Features;

interface reference{
    int methRef(int a,int b);
}

public class MethodReference {
        static int multiply(int a, int b){
            return a*b;
        }
        int add(int a, int b){
            return a+b;
        }
        int subtract(int a, int b){
            return a-b;
        }
        public static void main(String[]args){
            reference multi = MethodReference::multiply;
            System.out.println("Multiply of 2 numbers = "+multi.methRef(2,3));
            reference sum = new MethodReference()::add;
            System.out.println("Addition of 2 numbers = "+sum.methRef(2,3));
            reference sub = new MethodReference()::subtract;
            System.out.println("Substraction of 2 numbers = "+sub.methRef(7,2));
        }

}
