/*
    Use Of method to create List, Set and Map
 */
package JavaAddition9_17;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ques7 {
    public static void main(String[] args) {

        //create list
        System.out.println("This is s a list");
        System.out.println(
                List.of(1,2,5,7,3,9,10));

        System.out.println();

        //create set
        System.out.println("This is a set");
        System.out.println(
                Set.of(1,4,2,7,6,3));

        System.out.println();

        //create map
        System.out.println("This is a map");
        System.out.println(
                Map.of('A',65,'B',66,'C',67) );
    }
}
