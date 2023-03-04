/*
    Write Java code to define List .
    Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
 */
package CollectionAssignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void list(){
        ArrayList<Float> list = new ArrayList<>();
        list.add(3.5f);
        list.add(4.7f);
        list.add(5.5f);
        list.add(2.9f);
        list.add(4.7f);

        Iterator<Float> itr = list.iterator();

        float sum=0;
            while(itr.hasNext()) {
                float val = itr.next();
                sum += val;
            }
        System.out.println("The sum of list is : "+ sum);
    }

    public static void main(String[] args){
        list();
    }
}
