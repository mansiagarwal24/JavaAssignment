/*
    Use iterator stream method to generate a stream
 */
package JavaAddition9_17;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ques4 {
    public static void main(String[] args) {
        IntStream
                .iterate(0,i->i<=10, i->i+2)
                .forEach(System.out::println);
    }
}
