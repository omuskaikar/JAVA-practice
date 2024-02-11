package Exp5;

import java.util.*;

class SharedBuffer {
    LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }


    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait();
            }
            buffer.add(item);
            notify();
        }
    }

    public void consume(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == 0) {
                wait();
            }
            buffer.remove(item);
            notify();
        }
    }
}

class Producer extends Thread {
    SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try{
                buffer.produce(i);
                System.out.println("Produced: " + i);
                wait(1500);
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread{
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume(i);
                System.out.println("Consumed item : "+i);
                wait(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class E5q2 {
    public static void main(String[] args) {
        SharedBuffer b = new SharedBuffer(4);
        Producer a = new Producer(b);
        Consumer c = new Consumer(b);
        a.start();
        c.start();
    }
}