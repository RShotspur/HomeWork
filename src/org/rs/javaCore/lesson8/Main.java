package org.rs.javaCore.lesson8;

/**
 * Created by ADI on 16.06.2015.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Queen first = new Queen("a", 4);
        System.out.println(first.position());
        first.printDeskCoordinates();
        System.out.println();
        first.printAllQueenActions();
        Chess.figureScope(first);

    }
}
