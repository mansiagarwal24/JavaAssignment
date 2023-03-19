/*
     Use Synchronize method and synchronize block
     to enable synchronization between multiple threads trying to access method at same time.
 */
package MultithreadingPart1;

class Synchronized implements Runnable{
    int tickets = 6;
    static int i = 1, j = 2, k = 3;
    public void display(String s){
        synchronized (this){
            System.out.println("Current Thread is : "+s);
        }
    }
     public synchronized void bookticket( int wantedtickets) {
        if (wantedtickets <= tickets) {
            System.out.println(wantedtickets + "tickets are booked" );
            tickets = tickets - wantedtickets;
            System.out.println("remaining tickets are:"+tickets);

        } else {
            System.out.println("No tickets are available to book");
        }
    }

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("t1")) {
            bookticket(i);
            display(name);
        } else if (name.equals("t2")) {
            bookticket( j);
            display(name);
        } else {
            bookticket(k);
            display(name);
        }
    }
}


public class Ques2 {
    public static void main (String[]args) throws InterruptedException {
       Synchronized s = new Synchronized();
        Thread t1 = new Thread (s, "t1");
        Thread t2 = new Thread (s, "t2");
        Thread t3 = new Thread (s, "t3");

        t1.start ();
        t2.start ();
        t3.start ();
    }
}
