import java.util.Scanner;
public class E1q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of person 1: ");
        int age1=sc.nextInt();

        System.out.print("Enter age of person 2: ");
        int age2=sc.nextInt();

        System.out.print("Enter age of person 3: ");
        int age3=sc.nextInt();

        System.out.printf("\nMaximum age is %d:",(age1 > age2) ? (age1 > age3) ? age1 : age3 : (age2 > age3) ? age2 : age3);
        System.out.printf("\nMinimum age is %d:",(age1 < age2) ? (age1 < age3) ? age1 : age3 : (age2 < age3) ? age2 : age3);
    }
}
