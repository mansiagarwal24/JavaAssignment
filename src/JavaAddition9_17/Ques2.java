/*
    Perform takeWhile and dropWhile operations on stream
 */
package JavaAddition9_17;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println("This is a takeWhile Example");
        Stream.of(1, 2, 3, 4, 5, 7, 8, 9, 0, 6)
                .takeWhile(e -> e < 5)
                .forEach(System.out::print);

        System.out.println();
        System.out.println("This is a dropWhile Example");
        Stream.of(1,2,8,3,4,5,6,7)
                .dropWhile(e->e<=2)
                .forEach(System.out::print);
    }
}
