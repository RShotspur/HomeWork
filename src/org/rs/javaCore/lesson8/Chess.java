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
    public static ArrayList<String> arrayFoundAnswer = new ArrayList<String>();
    //Array of ALL blocked fields
    public static ArrayList<String> arrayOfAll = new ArrayList<String>();

    //Logic for task solution
    public static int count = 0;
    public static void possibleVariants(int num){
        if (num == 8){
            return;
        }
        System.out.println();
        count++;
        if (count > 20){
            count = 0;
            arrayFoundAnswer = new ArrayList<String>();
            arrayOfAll = new ArrayList<String>();
            System.out.println("array was set to zero");
            possibleVariants(0);
        }
        System.out.println("count is: " + count);
//        for (String arrayElement : arrayOfAll){
//            System.out.print(arrayElement);
//        }
        boolean status = false;
        for (int i = num; i < 8; i++) {
//            System.out.print("First round@ ");
            Queen temp = new Queen(num, Main.Rand());
            System.out.println(temp.position());
            for (String scope: temp.getScope()){
                if (status){
                    break;
                }
//                System.out.print("Second Round@ ");
                for (String queen : arrayFoundAnswer){
//                    System.out.print("Third round@ ");
                    if(scope.equals(queen)){
                        status = true;
                    }
                    if (status){
                        break;
                    }
                }
                if (status){
                    break;
                }

            }
            if (status){
                possibleVariants(num);
            }
            arrayFoundAnswer.add(temp.position());
            count = 0;
            num++;
            System.out.println("Element was added");
            for (String tempElement : temp.getScope()){
                arrayOfAll.add(tempElement);
            }
            System.out.println("Array was fulled");
            System.out.println("num is: " + num);
            possibleVariants(num);
        }

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
                    for (int k = 0; k < aQueen.getScope().size(); k++) {
                        if (desk[i][j].equals(aQueen.getScope().get(k))) {
                            activeDesk[i][j] = true;
                        }
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


