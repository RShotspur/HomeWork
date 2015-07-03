package org.rs.javaCore.lesson10;

/**
 * Created by ADI on 28.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = -3;
        System.out.println(new SquareEquation(a, b, c).getA());
        System.out.println(new SquareEquation(a, b, c).getB());
        System.out.println(new SquareEquation(a, b, c).getC());
        System.out.println(new SquareEquation(a, b, c).getD());
        System.out.println(new SquareEquation(a, b, c).getResult());

        System.out.println();

        Elevator elevator = new Elevator(1, 5);
        elevator.elevatorTrip();

    }


}
