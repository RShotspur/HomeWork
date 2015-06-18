package org.rs.javaCore.lesson8;

import java.util.ArrayList;

/**
 * Created by ADI on 16.06.2015.
 */
public class Chess {
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
    public static Boolean[][] activeDesk = new Boolean[8][8];
    public static ArrayList<String> arrayFoundAnswer = new ArrayList<String>();
    public static ArrayList<String> arrayOfAll = new ArrayList<String>();

    public static ArrayList<String> possibleVariants(int num){
        if (num == 8){
            return arrayFoundAnswer;
        }
        for (String arrayElement : arrayOfAll){
            System.out.print(arrayElement);
        }
        System.out.println();
        for (int i = num; i < 8; i++) {
            Queen temp = new Queen(num, Main.Rand());
            for (String scope: temp.getScope()){
                System.out.print(scope + " - ");
                for (String elementOfAll : arrayOfAll){
                    System.out.print(elementOfAll + " * ");
                    if(scope.equals(elementOfAll)){
                        return possibleVariants(num+1);
                    }
                }
            }
            arrayFoundAnswer.add(temp.position());
            for (String tempElement : temp.getScope()){
                arrayOfAll.add(tempElement);
            }
            num++;
        }
        return arrayFoundAnswer;
    }



    public static void figureScope(ArrayList<Queen> queen) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                activeDesk[i][j] = false;

            }

        }

        for (Queen aQueen : queen) {

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < aQueen.getScope().size(); k++) {
                        if (desk[i][j].equals(aQueen.getScope().get(k))) {
                            activeDesk[i][j] = true;
                        }
                    }

                }

            }

        }

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


