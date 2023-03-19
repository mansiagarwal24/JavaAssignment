/*
    Implement following functional interfaces from java.util.function using lambdas:

    Consumer
    Supplier
    Predicate
    Function

 */
package FeaturesPart2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


class Person{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {

        //PREDICATE
        Predicate<String> checkLength = (str)->str.length()>5;
        System.out.println(checkLength.test("HelloWorld"));

        //CONSUMER
        Person p=new Person();
        Consumer<Person> setname=t->t.setName("Mansi");
        setname.accept(p);
        System.out.println(p.getName());

        //FUNCTION
        Function<String,String> getString=t->t+" Morning";
        System.out.println(getString.apply("Good"));

        //SUPPLIER
        Supplier<Integer> getOutput=()->5;
        System.out.println(getOutput.get());

    }

}
