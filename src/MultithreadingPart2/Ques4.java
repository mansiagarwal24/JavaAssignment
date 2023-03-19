/*
     WAP to return a random integer value from a thread execution using Future.
 */
package MultithreadingPart2;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ques4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future future = executor.submit(() -> {
            Random random = new Random();
            return random.nextInt();
        });

        try {
            int randomNumber = (int)future.get();
            System.out.println("Random Number: " + randomNumber);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        executor.shutdown();
    }
}

