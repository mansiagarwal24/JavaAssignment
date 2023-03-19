/*
     WAP to showcase the difference between shutdown() and shutdownNow().
 */
package MultithreadingPart2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test extends Thread{
    private String name;
    private int age;
    public Test(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public void run(){
        try{
            for(int i=0;i<2;i++){
                if(i==0){
                    System.out.println(Thread.currentThread().getName()+" have"+" "+name+" "+age);
                }
                else {
                    System.out.println(Thread.currentThread().getName() + " " + "have displayed ");
                }
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Ques5 {
    public static void main(String[] args) {
        Thread t1 = new Test("Mansi",22);
        Thread t2 = new Test("Simran",23);
        Thread t3 = new Test("Rashi",22);
        Thread t4 = new Test("Shivam",23);
        Thread t5 = new Test("Abhay",24);

        ExecutorService ex = Executors.newFixedThreadPool(5);
        ex.execute(t1);
        ex.execute(t2);
        ex.execute(t3);
        ex.shutdown();
        //ex.shutdownNow();
        ex.execute(t4);
        ex.execute(t5);
    }
}
