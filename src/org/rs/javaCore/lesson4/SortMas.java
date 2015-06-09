package org.rs.javaCore.lesson4;

/**
 * Created by ADI on 09.06.2015.
 */
public class SortMas {
    public static void main(String[] args) {
        int[] mas = Main.CreateRandMassive(Main.Rand());
        int temp;
        //Sort array like that
        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length; j++) {
                if (mas[j] < mas[i]){
                    temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }


}
