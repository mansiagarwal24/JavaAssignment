/*
    Demonstrate the use AutoCloseable
 */
package JavaAddition9_17;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

interface AutoCloseable{
    void close() throws Exception;
}

public class Ques8 implements AutoCloseable{
    public static void main(String[] args) throws IOException {
        File file =new File("txtfile");
        PrintWriter pw = new PrintWriter(file);
        pw.write("This is a autocloseable file.");
        System.out.println("file has been created");
    }

    @Override
    public void close() throws Exception {

    }
}


