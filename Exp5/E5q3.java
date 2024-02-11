package Exp5;


class MultiplicationTable extends Thread {
    private int multiplier;

    public MultiplicationTable(int multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplier + " X " + i + " = " + multiplier * i);
        }
        long end = System.currentTimeMillis();
        long finish = end - start;
        System.out.println("Time taken for " + multiplier +" is "+ finish);
    }
}

public class E5q3 {
    public static void main(String[] args) {
        MultiplicationTable m7 = new MultiplicationTable(7);
        MultiplicationTable m11 = new MultiplicationTable(11);
        MultiplicationTable m9 = new MultiplicationTable(9);


        m7.run();
        m11.run();
        m9.run();

    }
}