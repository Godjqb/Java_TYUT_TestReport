package Common;

/**
 * Created by godjqb on 16-11-30.
 */
public class Complex {
    private double real,imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real,double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void getComplex() {
        if(this.imaginary > 0) {
            System.out.println(this.real + "+" + this.imaginary + "i");
        } else if (this.imaginary == 0) {
            System.out.println(this.real);
        } else {
            System.out.println(this.real + "" + this.imaginary + "i");
        }
    }

    public void add(Complex a, Complex b) {
        this.real = a.real + b.real;
        this.imaginary = a.imaginary + b.imaginary;
    }

    public void subtract(Complex a, Complex b) {
        this.real = a.real - b.real;
        this.imaginary = a.imaginary - b.imaginary;
    }

    public void multiply(Complex a, Complex b) {
        this.real = a.real * b.real - a.imaginary * b.imaginary;
        this.imaginary = a.imaginary * b.real + a.real * b.imaginary;
    }

}
