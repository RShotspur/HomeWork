package org.rs.javaCore.lesson3;

/**
 * Created by ADI on 31.05.2015.
 */
public class AverageElementNumber {
    public static void main(String[] args) {
        int[] massive = Main.CreateRandMassive(Main.Rand());
        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            sum += massive[i];
        }
        double avarage = (double) sum/(double)massive.length;
        System.out.println(avarage);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        double avarageNumber = avarage*100;
        System.out.println();
        for (int i = 0; i < massive.length; i++) {

            if ((Math.abs((double)massive[i]-avarage)) < Math.abs(avarageNumber-avarage)) {
                avarageNumber = massive[i];
            }
        }
        System.out.println();
        System.out.println((int)avarageNumber);
    }
}
