package Exp3;

import java.util.Scanner;
import java.util.Arrays;

public class E3q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        for (int i = 0; i < number; i++) {
            int size = sc.nextInt();
            int a[] = new int[size];
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < a.length; j++) {
                sum += a[j];
            }
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%d ", sum - a[j]);
            }
            System.out.println();

        }


    }
}
 