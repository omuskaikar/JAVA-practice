package Exp4;
abstract class Shape {
    abstract double calcArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calcArea() {
        return 3.14 * radius * radius;
    }

}


class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calcArea() {
        return length * breadth;
    }

}

class Triangle extends Shape {

    double height;
    double base;

    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double calcArea() {
        return 0.5 * height * base;
    }

}


public class E4q2{
    public static void main(String[] args) {
        double radius = 2;
        double length = 2;
        double breadth = 2;
        double height = 2;
        double base = 2;

        Circle a = new Circle(radius);
        Rectangle b = new Rectangle(length, breadth);
        Triangle c = new Triangle(height, base);

        System.out.println("Area of circle : "+a.calcArea());
        System.out.println("Area of Rectangle : "+b.calcArea());
        System.out.println("Area of Triangle : "+c.calcArea());
    }
}

