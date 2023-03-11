/*
    Implement following functional interfaces from java.util.function using lambdas:

    Consumer
    Supplier
    Predicate
    Function

 */
package FeaturesPart2;

interface Consumer{
    void show(int a);
}

interface Supplier{
    String print();
}

interface predicate{
    boolean check(int x,int y);
}

interface Function{
    String change(int n);
}

public class FunctionalInterface {
    public static void main(String[] args) {

        System.out.println("this is a predicate function");
        predicate pred=(a,b)->{
            return a>b;
        };
        System.out.println(pred.check(2,6));
        System.out.println();


        System.out.println("this is a consumer function");
        Consumer con=(a)->{
            System.out.println("does not return any value");
        };
        con.show(4);
        System.out.println();

        System.out.println("this is a supplier function");
        Supplier sup=()->{
            return "it will return string";
        };
        System.out.println(sup.print());
        System.out.println();

        System.out.println("this is a Function function");
        Function fun=(a)->{
            return "It will take input as a integer and return String.";
        };
        System.out.println(fun.change(5));

    }

}
