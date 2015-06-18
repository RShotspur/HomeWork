package org.rs.javaCore.lesson8;

import java.util.ArrayList;

/**
 * Created by ADI on 16.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> queens = Chess.possibleVariants(0);
        System.out.println();
        for (String element : queens){
            System.out.println(element);
        }

//        Queen first = new Queen("h", 3);
//        Queen second = new Queen("a", 6);
//        Queen third = new Queen("e", 4);
//        queens.add(first);
//        queens.add(second);
//        queens.add(third);
//        for(Queen queen : queens){
//            System.out.println(queen.position());
//        }
//        first.printDeskCoordinates();
//        first.printAllQueenActions();
//        Chess.figureScope(queens);


    }



    public static int Rand (){
        int rand = (int)Math.floor((Math.random() * (8 - 1)) + 1);
        return rand;
    }
}
