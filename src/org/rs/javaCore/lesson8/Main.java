package org.rs.javaCore.lesson8;

import java.util.ArrayList;

/**
 * Created by ADI on 16.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Queen> queens = new ArrayList<Queen>();
        Queen first = new Queen("h", 3);
        Queen second = new Queen("a", 6);
        Queen third = new Queen("e", 4);
        queens.add(first);
        queens.add(second);
        queens.add(third);
        for(Queen queen : queens){
            System.out.println(queen.position());
        }
//        first.printDeskCoordinates();
//        first.printAllQueenActions();
        Chess.figureScope(queens);

    }
}
