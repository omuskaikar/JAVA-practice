import java.util.Scanner;
public class  E1q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the employee no:");
        int EmpNo = sc.nextInt();
        sc.nextLine();
        System.out.print("enter the employee name:");
        String EmpName = sc.nextLine();
        System.out.print("enter the basic salary:");
        double BasicSalary = sc.nextDouble();

        double DA = 0.7 * BasicSalary;
        double HRA = 0.3 * BasicSalary;
        double CCA = 240 ;
        double PF = 0.1 * BasicSalary;
        double PT = 100;


        double GrossSalary = DA + HRA + CCA + BasicSalary;

        double NetSalary = GrossSalary - PF - PT ;
        System.out.println("\nEmployee Details:");
        System.out.println("Employee No: "+EmpNo);
        System.out.println("Employee Name: "+EmpName);
        System.out.println("Basic Salary: Rs."+BasicSalary);
        System.out.println("Gross Salary: Rs."+GrossSalary);
        System.out.println("Net Salary: Rs."+NetSalary);

        sc.close();

     }

}