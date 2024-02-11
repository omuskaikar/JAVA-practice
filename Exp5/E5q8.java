package Exp5;

class Bookings extends Thread {
    int vacant =2, reqd;

    Bookings(int r) {
        this.reqd = r;
    }

    public synchronized void run() {
        if (reqd <= vacant) {
            System.out.println(reqd + " ticket(s) booked for " + Thread.currentThread().getName());

            try {
                sleep(1000);
            } catch (Exception e) {

            }
            vacant = vacant - reqd;
        } else {
            System.out.println("No tickets left. Sorry, " + Thread.currentThread().getName());
        }
    }
}


public class E5q8 {
    public static void main(String[] args) {
        Bookings d = new Bookings(1);
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.setName("Om");
        t2.setName("ADITYA");
        t2.start();
        t1.start();
    }
}
