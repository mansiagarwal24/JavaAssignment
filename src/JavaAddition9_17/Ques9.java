/*
    Create Unmodifiable List from a Stream
 */
package JavaAddition9_17;

import FeaturesPart2.StreamQues3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques9 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Mansi","Riya","Shikha","Bhavna");

        List<String> unmodifiable = stream.collect(Collectors.toUnmodifiableList());
        unmodifiable.forEach(i-> System.out.println(i+" "));

    }
}
