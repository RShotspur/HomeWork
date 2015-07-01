package org.rs.javaCore.lesson10;

/**
 * Created by roman.sydorenko on 01/07/2015.
 */
public class ComplexNumber {
    private double x;
    private double y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
