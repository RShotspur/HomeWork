package org.rs.javaCore.lesson4;

import sun.misc.Sort;

/**
 * Created by ADI on 09.06.2015.
 */
public class SortMas {
    public static void main(String[] args) {
        int[] mas = Sort(Main.CreateRandMassive(Main.Rand()));
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
    public static int[] Sort(int[] input){
        int temp;
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[j] < input[i]){
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }


}
