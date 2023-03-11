/*
    Write a program to count number of occurrences of a word in a file.
    The file name and word should be supplied through commandline.
 */

package JavaAssignment3;
import java.io.*;
import java.util.Scanner;

public class WordCountFile {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter file name ");
        String filename = scan.next();

        System.out.println("Enter word you want to count");
        String word = scan.next();

        File file = new File(filename);

        FileReader fr = null;

        try
        {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            int countWord = 0;
            while((line = br.readLine()) != null)
            {
                String str_parts[] = line.split("\\s+");
                for(String s : str_parts)
                {
                    if(s.equals(word))
                    {
                        countWord++;
                    }
                }
            }
            if(countWord != 0)
            {
                System.out.println("This file has " + countWord + " occurrences of word : " + word);
            }
            else
            {
                System.out.println("This word doesn't exist in the entered file");
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        catch (IOException e)
        {
            System.out.println(e.toString());
        }
    }
}
