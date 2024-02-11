package Exp3;

import java.util.Scanner;
import java.util.Vector;

public class E3q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> ShoppingList = new Vector<>();
        int count = 0,element;
        System.out.println("Enter the element");
        element = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            ShoppingList.add(i);
        }
        ShoppingList.add(4);
        ShoppingList.add(4);
        for (int i = 0; i < ShoppingList.size(); i++) {
            if (ShoppingList.elementAt(i) == element) {
                count++;
            }
        }
        System.out.println("frequency of "+element+"is "+count);
    }
}
