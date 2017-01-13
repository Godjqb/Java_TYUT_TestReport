import Common.Complex;

/**
 * Created by godjqb on 16-11-30.
 */
public class complex {
    public static void main(String[] args) {
        Complex comp1 = new Complex(1,2);
        Complex comp2 = new Complex(2,2);
        Complex comp3 = new Complex();
        comp3.multiply(comp1,comp2);
        comp3.getComplex();
        comp3.add(comp1,comp2);
        comp3.getComplex();
        comp3.subtract(comp1,comp2);
        comp3.getComplex();
    }
}
