package org.rs.javaCore.lesson4;


/**
 * Created by ADI on 05.06.2015.
 */
public class RandArrayWithUniqueNumbers {
    public static void main(String[] args) {
        int[] randArrayUnique = new int[Main.Rand()];
        int count = 0;
        //fill in array
        for (int i = 0; i < randArrayUnique.length; i++) {
            randArrayUnique[i] = Main.Rand();
            for (int j = i; j >= 0; j--) {
                //check for unique number
                if(randArrayUnique[i] == randArrayUnique[j]){
                    count++;
                    randArrayUnique[i] = Main.Rand();
                    //begin from the start
                    j = i;
                }
            }

        }
        System.out.println("array.length is = " + randArrayUnique.length);
        System.out.println("count of retry = " + count);
        for (int i = 0; i < randArrayUnique.length; i++) {
            System.out.println("array[" + randArrayUnique[i] + "]");

        }

    }
}
