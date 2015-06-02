package org.rs.javaCore.lesson3;

/**
 * Created by ADI on 31.05.2015.
 */
public class AverageElementNumber {
    public static void main(String[] args) {
        int[] massive = new int[10];
        massive[0] = -1;
        massive[1] = 2;
        massive[2] = -5;
        massive[3] = 6;
        massive[4] = -3;
        massive[5] = 5;
        massive[6] = -8;
        massive[7] = 7;
        massive[8] = 9;
        massive[9] = -222;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < 0) {
                massive[i] *= -1;
            }
        }
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
    }
}
