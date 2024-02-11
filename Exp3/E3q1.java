package Exp3;

import java.util.Scanner;

public class E3q1{
    public static void main(String[] args) {
        int i , j , number ,fang1 ,fang2 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        number = sc.nextInt();
        if (number >= 1000 && number <= 9999) {
            for (i = 10; i <= 99; i++) {
                for (j = 10; j <= 99; j++) {
                    if (i * j == number) {
                        if (areAnagrams(i, j, number)) {
                            fang1 = i;
                            fang2 = j;
                            System.out.println(fang1+" x "+fang2+" = "+ fang1*fang2);
                        }
                    }
                }
            }
           
        }
        else{
            System.out.println("Please give a valid number");
        }
    }
    

    public static boolean areAnagrams(int num1, int num2, int number) {
        String num = String.valueOf(num1) + String.valueOf(num2);
        String og = String.valueOf(number);
        for (int i = 0; i < num.length(); i++) {
            if (num.indexOf(og.charAt(i))==-1){
                return false;
            }
        }
        return true;
    }
}
