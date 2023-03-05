/*
    Write a program to count number of occurrences of a word in a file.
    The file name and word should be supplied through commandline.
 */

package JavaAssignment3;
import java.io.*;
public class WordCountFile {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("/home/mansi/txtfile1");
        BufferedReader br = new BufferedReader(file);

        String line ;
        int wordCount = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            wordCount  += words.length;
        }

        System.out.println("The number of words in a file is: "+wordCount);
    }
}
