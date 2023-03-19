/*
    WAP to show usage of Callable and demonstrate how it is different from Runnable
 */
package MultithreadingPart2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class callable implements Callable{
    @Override
    public Integer call() throws Exception {
        return 5;
    }
}


class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("this is a runnable interface");
    }
}
public class Ques1 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor= Executors.newFixedThreadPool(2);
        callable call = new callable();
        Future<Integer> output = executor.submit(call);
        System.out.println(output.get().toString());

        RunnableThread run = new RunnableThread();
        Thread t1 = new Thread(run);
        t1.start();

    }
}
