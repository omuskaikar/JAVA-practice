package Exp5;

import java.util.Scanner;

public class E5q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the characters:");
        String str = sc.nextLine();
        int valid_count = 0;
        int invalid_count = 0;
        for (int i = 0; i < str.length(); i++) {
            try {
                int num = Integer.parseInt(Character.toString(str.charAt(i)));
                valid_count += 1;
            } catch (NumberFormatException e) {
                invalid_count += 1;
            }
        }
        System.out.println("valid integers : " + valid_count); 
        System.out.println("Invalid Integers : " + invalid_count); 
        sc.close(); 

    }
}
