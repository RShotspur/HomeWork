package org.rs.javaCore.lesson8;

import java.util.ArrayList;

public class Queen {
    private int positionChar;
    private int positionInt;
    //Array of blocked fields
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
                this.scope.add(Chess.desk[this.positionChar][i]);
            }
        }
        int countChar = this.positionChar;
        int countInt = this.positionInt;
        while (countChar < 7 && countInt < 7){
            this.scope.add(Chess.desk[++countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar > 0 && countInt > 0){
            this.scope.add(Chess.desk[--countChar][--countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar > 0 && countInt < 7){
            this.scope.add(Chess.desk[--countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar < 7 && countInt > 0){
            this.scope.add(Chess.desk[++countChar][--countInt]);
        }

    }
    public Queen(String positionChar, int positionInt) {
        String[] chars = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < chars.length; i++) {
            if (positionChar.equals(chars[i])){
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
                this.scope.add(Chess.desk[this.positionChar][i]);
            }
        }
        int countChar = this.positionChar;
        int countInt = this.positionInt;
        while (countChar < 7 && countInt < 7){
            this.scope.add(Chess.desk[++countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar > 0 && countInt > 0){
            this.scope.add(Chess.desk[--countChar][--countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar > 0 && countInt < 7){
            this.scope.add(Chess.desk[--countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar < 7 && countInt > 0){
            this.scope.add(Chess.desk[++countChar][--countInt]);
        }

    }
    public Queen(int positionChar, int positionInt) {
        this.positionChar = positionChar;
        this.positionInt = positionInt - 1;

        this.scope.add(Chess.desk[this.positionChar][this.positionInt]);

        for (int i = 0; i < 8; i++) {
            if (i != this.positionChar){
                this.scope.add(Chess.desk[i][this.positionInt]);
            }
            if (i != this.positionInt){
                this.scope.add(Chess.desk[this.positionChar][i]);
            }
        }
        int countChar = this.positionChar;
        int countInt = this.positionInt;
        while (countChar < 7 && countInt < 7){
            this.scope.add(Chess.desk[++countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar > 0 && countInt > 0){
            this.scope.add(Chess.desk[--countChar][--countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar > 0 && countInt < 7){
            this.scope.add(Chess.desk[--countChar][++countInt]);
        }
        countChar = this.positionChar;
        countInt = this.positionInt;
        while (countChar < 7 && countInt > 0){
            this.scope.add(Chess.desk[++countChar][--countInt]);
        }

    }
    //Returned the arrayValue of position
    public String position(){
        return Chess.desk[positionChar][positionInt];
    }
    //Full in array with Queens
//    public ArrayList<Queen> setQueensArray(ArrayList<String> temp){
//
//    }
    //Returned the position of Queen on the desk
    public void printDeskCoordinates(){
        System.out.print(this.positionChar + " " + this.positionInt);
    }
    //Returned area of Queen impact by every field
    public void printAllQueenActions(){
        for (String aScope : this.scope) {
            System.out.print("[" + aScope + " ]");
        }
        System.out.println();
    }
    //Returned area of Queen impact by array
    public ArrayList<String> getScope(){
        return this.scope;
    }





}

