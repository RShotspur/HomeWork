package org.rs.javaCore.lesson3;

/**
 * Created by ADI on 31.05.2015.
 */
public class MaxNumber {
    public static void main(String[] args) {
        //Max element in massive
        int[] massiveOfInt = Main.CreateRandMassive(Main.Rand());

        System.out.println("V massive iz:");
        for (int i = 0; i < massiveOfInt.length; i++) {
            System.out.print(massiveOfInt[i] + " ");
        }
        int max = 0;
        for (int i = 0; i < massiveOfInt.length; i++) {
            if (massiveOfInt[i] > max){
                max = massiveOfInt[i];
            }
        }
        System.out.println("\nMax number is: " + max);

    }


}
