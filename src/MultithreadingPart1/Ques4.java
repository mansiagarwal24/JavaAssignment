package MultithreadingPart1;

public class DeadLockExm {
    public static void main(String[] args) {

        Synchronized lock1=new Synchronized();
        Synchronized lock2=new Synchronized();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Lock1 Acquired");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (lock2){
                        System.out.println("Lock2 Acquired");
                    }
                }
            }
        };
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("Lock2 Acquired");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (lock1){
                        System.out.println("Lock1 Acquired");
                    }
                }
            }
        };
        Thread t1=new Thread(r);
        Thread t2=new Thread(r1);
        t1.start();
        t2.start();
    }
}