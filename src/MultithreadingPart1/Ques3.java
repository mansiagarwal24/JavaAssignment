/*
     WAP to showcase the usage of volatile in java.
 */

package MultithreadingPart1;

public class Ques3 implements Runnable{
        private static  boolean flag;
        @Override
        public void run() {
            int i=0;
            while(!flag){
                i++;
            }
            System.out.println("Method is executed");

        }
    public static void main(String[] args) throws InterruptedException{
        Ques3 q = new Ques3();
        Thread t1 = new Thread(q);
        t1.start();
        Thread.sleep(1000);
        flag=true;
        System.out.println("Main is completed");

    }
}
