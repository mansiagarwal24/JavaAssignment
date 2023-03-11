/*
    Sum all the numbers greater than 5 in the integer list using streams
 */
package FeaturesPart2;

import java.util.Arrays;
import java.util.List;

public class StreamQues3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,6,8,2,0,7);
        System.out.println(
        numbers.stream()
                .filter(e->e>5)
                .reduce(0,(sum,i)->sum+i)
        );
    }

}
