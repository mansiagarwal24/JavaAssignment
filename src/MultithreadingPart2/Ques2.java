/*
     Improve the code written in Basics of Multi Threading Part 1 exercise question 4
     to handle the deadlock using reentract lock.
 */
package MultithreadingPart2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Bank extends Thread{
    private int bal;
    private ReentrantLock lock= new ReentrantLock();

    public Bank(int bal) {
        this.bal = bal;
    }

    public void updateBalance(int amt) {
        lock.lock();
        try {
            bal+=amt;
            System.out.println(Thread.currentThread().getName() + "  lock acquired and balance is "
                    + bal);
        } finally {
            System.out.println(Thread.currentThread().getName() + " lock released");
            lock.unlock();
        }
    }

    public void withdraw(int amount){
        lock.lock();
        try{
            if(bal<amount) {
                System.out.println("error");
                throw new IllegalArgumentException();
            }
            else{
                System.out.println(Thread.currentThread().getName()+"lock acquired for withdraw" );
                bal=bal-amount;
            }
        }finally {
            System.out.println(Thread.currentThread().getName()+"lock relesed and balance is "+
                    bal);

            lock.unlock();
        }
    }

}
public class Ques2 {
    public static void main(String[] args) {
        Bank b= new Bank(100);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.updateBalance(100);
                b.withdraw(20);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.updateBalance(100);
                b.withdraw(20);
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                b.updateBalance(100);
                b.withdraw(20);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }

}


