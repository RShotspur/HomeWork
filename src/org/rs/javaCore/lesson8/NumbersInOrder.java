package org.rs.javaCore.lesson8;

/**
 * Created by ADI on 16.06.2015.
 */
public class NumbersInOrder {
    public static void printInOrder(int start, int border){
        System.out.println(start);
        if (start == border) {
            return;
        }
        printInOrder(start+1, border);
    }
    public static void main(String[] args) {
        printInOrder(1, 5);
    }
}
