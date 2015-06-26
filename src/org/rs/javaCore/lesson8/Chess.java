package org.rs.javaCore.lesson8;

import java.util.ArrayList;

/**
 * Created by ADI on 16.06.2015.
 */
public class Chess {
    //Model of desk
    public static String[][] desk = new String[][] {
            {"a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8"},
            {"b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8"},
            {"c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8"},
            {"d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8"},
            {"e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8"},
            {"f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8"},
            {"g1", "g2", "g3", "g4", "g5", "g6", "g7", "g8"},
            {"h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8"}
    };
    //Desk in Boolean
    public static Boolean[][] activeDesk = new Boolean[8][8];
    //Array of founded places on desk

    //Logic for task solution
    public static int count = 0;
    public static ArrayList<Queen> possibleVariants(ArrayList<Queen> arrayList){
        if (arrayList.size()>7){
            return arrayList;
        }
        if (count > 20){
            count = 0;
            return arrayList;

        }
        count++;
        Queen tempQueen = new Queen(arrayList.size(), Main.Rand());
        boolean status = false;
        for (Queen tempValue : arrayList){
            if(status){
                break;
            }
            for (String tempValue2 : tempQueen.getScope()){
                if (tempValue.position().equals(tempValue2)){
                    status = true;
                    break;
                }
            }

        }
        if(!status){
            arrayList.add(tempQueen);
            count = 0;
        }
        return possibleVariants(arrayList);
    }



    //Print out information about Queens on the desk
    public static void figureScopeOnDesk(ArrayList<Queen> queen) {

        //Form array with all false elements instead of null
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                activeDesk[i][j] = false;

            }

        }
        //Finding area of Queen impact
        for (Queen aQueen : queen) {

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (desk[i][j].equals(aQueen.position())) {
                            activeDesk[i][j] = true;
                    }

                }

            }

        }
        //Print out graphic of desk
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (activeDesk[i][j]){
                    System.out.print("[" + 1 + "]");
                }
                else {
                    System.out.print("[" + 0 + "]");
                }

            }
            System.out.println();

        }

    }


}


