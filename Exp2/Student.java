package Exp2;

public class Student {
    private String name;

    public Student() {
        this.name = "unknown";
    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student("Om");

        System.out.println("Name of student 1 is :" + a.getName());
        System.out.println("Name of student 2 is :" + b.getName());
    }
    

}
