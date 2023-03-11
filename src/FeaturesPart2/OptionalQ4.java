/*
    Write a program to showcase the use of optional class
 */
package FeaturesPart2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalQ4 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> ans = num.stream()
                .filter(e -> e > 9)
                .reduce(Integer::sum);
        if (ans.isPresent()) {
            System.out.println(ans.get());
        } else {
            System.out.println("No values greater than 9");

        }
    }
}
