/*
    Use ifPresentOrElse, or, orElseThrow Operations with Optional
 */
package JavaAddition9_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ques5 {
    public static void main(String[] args) {

        //IFPRESENTORELSE
        IntStream.of(1,2,4,6,3,7,9,8)
                .filter(e->e>2)
                .findFirst()
                .ifPresentOrElse(System.out::println,
        ()-> System.out.println("Number is not present"));

        //ORELSETHROW
        List<Integer> list = Arrays.asList(1,2,4,5,6,7,8,9);
        System.out.println(
        list.stream()
                .filter(e->e>8)
                .findFirst()
                .orElseThrow());
    }
}
