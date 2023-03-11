/*
    Use rangeClosed to create a  Stream
 */
package JavaAddition9_17;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Ques3 {
    public static void main(String[] args) {
        //this is a stream of Integers
        System.out.println("This is a Int Stream:");
        IntStream.rangeClosed(1,20)
                .forEach(i-> System.out.print(i+" "));

        System.out.println();

        //this is a stream of long number
        System.out.println("This is a Long Stream:");
        LongStream.rangeClosed(100000L,100007L)
                .forEach(i->System.out.print(i+" "));
    }
}
