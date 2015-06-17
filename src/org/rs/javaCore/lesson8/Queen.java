package org.rs.javaCore.lesson8;

import java.util.ArrayList;

public class Queen {
    private int positionChar;
    private int positionInt;
    private ArrayList<String> scope = new ArrayList<String>();



    public Queen(char positionChar, int positionInt) {
        char[] chars = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 0; i < chars.length; i++) {
            if (positionChar == chars[i]){
                this.positionChar = i;
            }
        }
        this.positionInt = positionInt-1;

        this.scope.add(Chess.desk[this.positionChar][this.positionInt]);

        for (int i = 0; i < 8; i++) {
            if (i != this.positionChar){
                this.scope.add(Chess.desk[i][this.positionInt]);
            }
            if (i != this.positionInt){
                this.scope.add(Chess.desk[this.positionInt][i]);
            }
        }
        int countChar = this.positionChar;
        int countInt = this.positionInt;
        while (countChar < 8 && countInt < 8){
            this.scope.add(Chess.desk[++countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar >= 0 && countInt >= 0){
            this.scope.add(Chess.desk[--countChar][--countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar >= 0 && countInt < 8){
            this.scope.add(Chess.desk[--countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar < 8 && countInt >= 0){
            this.scope.add(Chess.desk[++countChar][--countInt]);
        }

    }
    public Queen(String positionChar, int positionInt) {
        String[] chars = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < chars.length; i++) {
            if (positionChar == chars[i]){
                this.positionChar = i;
            }
        }
        this.positionInt = positionInt-1;


        this.scope.add(Chess.desk[this.positionChar][this.positionInt]);

        for (int i = 0; i < 8; i++) {
            if (i != this.positionChar){
                this.scope.add(Chess.desk[i][this.positionInt]);
            }
            if (i != this.positionInt){
                this.scope.add(Chess.desk[this.positionInt][i]);
            }
        }
        int countChar = this.positionChar;
        int countInt = this.positionInt;
        while (countChar < 8 && countInt < 8){
            this.scope.add(Chess.desk[++countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar >= 0 && countInt >= 0){
            this.scope.add(Chess.desk[--countChar][--countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar >= 0 && countInt < 8){
            this.scope.add(Chess.desk[--countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar < 8 && countInt >= 0){
            this.scope.add(Chess.desk[++countChar][--countInt]);
        }

    }

    public String position(){
        return Chess.desk[positionChar][positionInt];
    }
    public void printDeskCoordinates(){
        System.out.print(this.positionChar + " " + this.positionInt);
    }

    public void printAllQueenActions(){
        for (int i = 0; i < this.scope.size(); i++) {
            System.out.println(this.scope.get(i));
        }
    }





}

