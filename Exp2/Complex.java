package Exp2;

public class Complex {
    private Double realPart;
    private Double imaginaryPart;

    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    public Complex(Double realPart, Double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(Double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Double getRealPart() {
        return this.realPart;
    }
    public Double getImaginaryPart() {
        return this.imaginaryPart;
    }
}