import java.util.Scanner;
public class E1q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double tot_cost = 0.0;
        Double quantity;
        System.out.println("Enter the quantity:");
        quantity = sc.nextDouble();
        sc.nextLine();
        if (quantity * 100 >= 1000) {
            tot_cost = 0.9 * quantity * 100;
            System.out.println("The total cost is " + tot_cost);
        }
        else {
            tot_cost = quantity * 100;
            System.out.println("The total cost is " + tot_cost);
        }
    }
}
