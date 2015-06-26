package org.rs.javaCore.lesson8;


import java.util.ArrayList;

/**
 * Created by ADI on 16.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        boolean temp = true;
        while (temp){
            //Creates array with result
            ArrayList<Queen> queens = Chess.possibleVariants(new ArrayList<Queen>());
            //Until it becomes useful
            if (queens.size() > 7){
                //Say cycle when to stop
                temp = false;
                //And print out the result
                for (Queen tempQueen : queens){
                    System.out.println(tempQueen.position());
                }
                Chess.figureScopeOnDesk(queens);
            }


        }

    }


    public static int Rand (){
//        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int rand = (int)Math.floor((Math.random() * (9 - 1)) + 1);
        return rand;
    }
}
