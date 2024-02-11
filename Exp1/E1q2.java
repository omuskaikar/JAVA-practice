import java.util.Scanner;


public class E1q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n1 : Factorial\n2 : testArmstrong\n3: testPalindrome\n");
        System.out.print("enter the choice:");

        String number = sc.nextLine();

        switch (number){
            case "factorial" :
                Factorial();
                break;

            case "armstrong" :
                testArmstrong();
                break;

            case "palindrome" :
                testPalindrome();
                break;
        }


    }

    private static void testPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string to check palindrome:");
        String str = sc.nextLine();
        int flag=1;
        for(int i=0,j=str.length()-1;i<j;i++,j--)
        {
            if(str.charAt(i) != str.charAt(j)) {
                flag = 0;
                break;
            }
        }
        if(flag == 1)
            System.out.printf("%s is palindrome",str);
        else
            System.out.printf("%s is not palindrome",str);
    }

    private static void testArmstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check armstrong:");
        int number = sc.nextInt();
        int n = number;
        int count = 0;
        while(n>0)
        {
            count ++;
            n = n/10;
        }
        int sum = 0;
        n = number;
        while(n>0){
            int digit = n%10;
            sum += (int) Math.pow(digit,count);
            n = n /10;
        }
        if(sum == number)
            System.out.printf("%d number is Armstrong",number);
        else
            System.out.printf("%d number is not Armstrong",number);
    }

    private static void Factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to find the factorial:");
        int number = sc.nextInt();
        int fact=1,n = number;
        for(;n>0;n--)
        {
            fact = fact * n;
        }
        System.out.printf("The factorial of %d number is %d:",number,fact);

    }
}
