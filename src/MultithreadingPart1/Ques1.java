/*
    Create and Run a Thread using Runnable Interface and Thread class and
    show usage of sleep and join methods in the created threads.
 */
package MultithreadingPart1;

class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is created using runnable interface ");
        try{
            for(int i=0;i<5;i++){
                System.out.println("thread"+i);
                Thread.sleep(5000);
            }
        }catch(InterruptedException e){
            System.out.println("Thread is interrupted");
        }
        System.out.println("Thread stop its execution");
    }

}

class ThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is creating using thread class");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("thread "+ i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Thread is interrupted");
        }
        System.out.println("thread stop its execution");
    }

}

public class Ques1 {
    public static void main(String[] args) throws InterruptedException {

        //RUNNABLE INTERFACE
        /*RunnableThread rt = new RunnableThread("MyRunThread");
        Thread t1= new Thread(rt);
        t1.start();*/

        //THREAD CLASS
        ThreadClass tc1 = new ThreadClass();
        ThreadClass tc2 = new ThreadClass();
        ThreadClass tc3 = new ThreadClass();
        tc1.start();
        tc2.start();
        tc1.join();
        tc3.start();

        //tc1.interrupt();

    }
}
