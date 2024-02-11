package Exp5;
import java.util.LinkedList;
class SharedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;
    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait(); // Wait if the buffer is full
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            notify(); // Notify consumer that an item is produced
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait(); // Wait if the buffer is empty
            }

            int item = buffer.removeFirst();
            System.out.println("Consumed: " + item);

            notify(); // Notify producer that an item is consumed
        }
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.produce(i);
                sleep(1000); // Simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.consume();
                sleep(1500); // Simulate consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class E5q1 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(3);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
