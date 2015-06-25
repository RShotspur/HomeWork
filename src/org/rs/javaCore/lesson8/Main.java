package org.rs.javaCore.lesson8;


import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by ADI on 16.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        boolean temp = true;
        while (temp){
            AbstractList<String> array = Chess.possibleVariants(new ArrayList<String>());
            if (array.size() > 7){
                temp = false;
                for (String tempString : array){
                    System.out.println(tempString);
                }
            }

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
//        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int rand = (int)Math.floor((Math.random() * (9 - 1)) + 1);
        return rand;
    }
}
