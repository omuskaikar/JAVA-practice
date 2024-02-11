package Exp2;

public class ComplexDemo {
    public static void main(String[] args) {
        Complex no1 = new Complex();
        Complex no2 = new Complex(4.0, 5.0);
        System.out.println("The complex number 1 is :" + no1.getRealPart() + " + " + no1.getImaginaryPart() + "i");
        System.out.println("The complex number 2 is :" + no2.getRealPart() + " + " + no2.getImaginaryPart() + "i");
        no1.setRealPart(2.2);
        no1.setImaginaryPart(1.1);
        System.out.println("The complex number 1 is :" + no1.getRealPart() + " + " + no1.getImaginaryPart() + "i");
    }
}
