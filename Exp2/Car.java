package Exp2;

public class Car {
    private String brand;

    public Car() {
        this.brand = "Ford";
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }
    
    public static void main(String[] args) {
        Car a = new Car();
        String Brand = a.getBrand();
        Car b = new Car("Ferrari");
        System.out.println("Brand of the car is "+b.getBrand());
        System.out.println("Brand of the car is "+Brand);
    }

}
