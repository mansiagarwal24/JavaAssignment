/*
    Convert an Optional type into Stream
 */
package JavaAddition9_17;

import java.util.Arrays;
import java.util.List;

public class Ques6 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7);
                Integer num1 =num.stream()
                        .filter(e->e%2==0)
                        .findFirst()
                        .get();

        System.out.println(num1);
                        //.stream()
//                        .forEach(System.out::println);


    }
}
