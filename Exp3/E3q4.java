package Exp3;

import java.util.Vector;
import java.util.Scanner;

public class E3q4 {
    public static void main(String[] args) {
        Vector<String> shoppingList = new Vector<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the choice:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Print items");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addItem(shoppingList);
                    break;
                case 2:
                    removeItem(shoppingList);
                    break;
                case 3:
                    printItems(shoppingList);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    private static void addItem(Vector<String> shoppingList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item to add: ");
        String item = sc.nextLine();
        shoppingList.add(item);
        System.out.println(item + " added to the shopping list.");
    }

    private static void removeItem(Vector<String> shoppingList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the item to remove: ");
        int index = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (index >= 0 && index < shoppingList.size()) {
            String removedItem = shoppingList.remove(index);
            System.out.println(removedItem + " removed from the shopping list.");
        } else {
            System.out.println("Invalid index. No item removed.");
        }
    }

    private static void printItems(Vector<String> shoppingList) {
        System.out.println("Shopping List:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(i + ". " + shoppingList.get(i));
        }
    }
}
