package Exp4;

import java.util.Scanner;
interface Sports {
    public int score();
}

class Student {
    int rollno;
    public Student(int rollno){
        this.rollno = rollno;
    }
}

class Test extends Student {
    int sem1;
    int sem2;

    public Test(int sem1, int sem2, int rollno) {
        super(rollno);
        this.sem1 = sem1;
        this.sem2 = sem2;
    }

}

class Result extends Test implements Sports{
    int sports_score;

    public Result(int rollno, int sem1, int sem2, int sports_score) {
        super(sem1, sem2, rollno);
        this.sports_score = sports_score;
    }
    @Override
    public int score() {
        return sports_score;
    }

    public int calcTotal() {
        return sem1 + sem2 + sports_score;
    }

}

public class E4q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rollno :");
        int rollno = sc.nextInt();
        System.out.print("Enter the marks of sem1 :");
        int sem1 = sc.nextInt();
        System.out.print("Enter the marks of sem2 :");
        int sem2 = sc.nextInt();
        System.out.print("Enter the marks of sem1 :");
        int sports_score = sc.nextInt();
        sc.nextLine();
        Result a = new Result(rollno, sem1, sem2, sports_score);
        Result b = new Result(1, 100, 100, 100);

        System.out.println("roll no :" + b.rollno);
        System.out.println("sem1 marks :" + b.sem1);
        System.out.println("sem2 marks :" + b.sem2);
        System.out.println("sports_score :" + b.sports_score);
        System.out.println("total :" + b.calcTotal());

        
        
        
    }
}