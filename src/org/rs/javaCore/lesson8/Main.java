package org.rs.javaCore.lesson8;

/**
 * Created by ADI on 16.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        Queen first = new Queen("d", 3);
        System.out.println(first.position());
        first.printDeskCoordinates();
        System.out.println();
        first.printAllQueenActions();

    }
}
