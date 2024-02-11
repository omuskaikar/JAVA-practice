package Exp3;

import java.util.Scanner;

public class fangs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fang1, fang2, i, j;
        if (n >= 1000 && n <= 9999) {
            for (i = 10; i <= 99; i++) {
                for (j = 10; j <= 99; j++) {
                    if (i * j == n) {
                        if (areAnagrams(i, j, n)) {
                            fang1 = i;
                            fang2 = j;
                            System.out.println("Fang1 :"+fang1+"Fang2:"+fang2 +"output:" +fang1*fang2);
                        }
                    }
                }
            }
        } else {
            System.out.println("Give valid 4 digint no.");
        }
    }

    public static Boolean areAnagrams(int a ,int b,int n){
        String num1 = String.valueOf(a) + String.valueOf(b);
        String num2 = String.valueOf(n);
        for (int i = 0; i < num1.length(); i++) {
            if (num1.indexOf(num2.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
