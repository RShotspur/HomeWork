package org.rs.javaCore.lesson3;

/**
 * Created by ADI on 31.05.2015.
 */
public class AverageNumberOfMassive {

    public static void main(String[] args) {
        // Average of massive
        int[] massiveOfInt = Main.CreateRandMassive(Main.Rand());
        int sum = 0;
        int average;
        for (int i = 0; i < massiveOfInt.length; i++) {
            sum += massiveOfInt[i];
        }
        average = Math.round(sum/massiveOfInt.length);

        System.out.println("Average number is: " + average);

    }


}
