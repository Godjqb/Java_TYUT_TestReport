package mymaths;

/**
 * Created by godjqb on 16-11-30.
 */
public class ThreeDigits implements Digits {
    private double a, b, c;

    public ThreeDigits(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double minimum() {
        if (this.a < this.b) {
            if (this.a < this.c) {
                return this.a;
            } else {
                return this.c;
            }
        } else {
            if (this.b < this.c) {
                return this.b;
            } else {
                return this.c;
            }
        }
    }

    public double maximum() {
        if (this.a > this.b) {
            if (this.a > this.c) {
                return this.a;
            } else {
                return this.c;
            }
        } else {
            if (this.b > this.c) {
                return this.b;
            } else {
                return this.c;
            }
        }
    }

}
