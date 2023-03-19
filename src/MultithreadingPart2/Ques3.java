/*
     Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool()
     to submit a list of tasks and wait for completion of all tasks.
 */
package MultithreadingPart2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Ques3 {
    public static void main(String[] args) {
                List<Callable<String>> tasks = new ArrayList<>();

                tasks.add(new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        Thread.sleep(1000);
                        return "Task 1";
                    }
                });
                tasks.add(() -> {
                    Thread.sleep(1000);
                    return "Task 2";
                });
                tasks.add(() -> {
                    Thread.sleep(1000);
                    return "Task 3";
                });
                ExecutorService executorService = Executors.newSingleThreadExecutor();
//              ExecutorService executorService = Executors.newCachedThreadPool();
//              ExecutorService executorService = Executors.newFixedThreadPool(3);

                try
                {
                    List<Future<String>> futures = executorService.invokeAll(tasks);
                    for(Future<String> future : futures)
                    {
                        System.out.println(future.get());
                    }
                }
                catch(InterruptedException | ExecutionException e)
                {
                    e.printStackTrace();
                }
                finally {
                    executorService.shutdown();
                }
            }
        }

