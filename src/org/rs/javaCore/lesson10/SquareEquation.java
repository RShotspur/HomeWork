package org.rs.javaCore.lesson10;

/**
 * Created by ADI on 01.07.2015.
 */
public  class SquareEquation {
    private int a;
    private int b;
    private int c;
    private int d;

    public SquareEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = b*b - 4 * a * c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

//    protected int discriminant(){
//        return (b*b - (4 * a * c));
//    }

    public ComplexNumber getResult(){
        if (this.d > 0) {

            return new ComplexNumber(((-b) + Math.sqrt(d))/(2*a), ((-b)-Math.sqrt(d))/(2*a));
        }
        if (this.d == 0) {
            return new ComplexNumber(((-b)/(2*a)), ((-b)/(2*a)));
        }
        return new ComplexNumber(0, 0);

    }
}
