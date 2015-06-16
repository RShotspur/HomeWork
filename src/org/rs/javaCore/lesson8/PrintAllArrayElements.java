package org.rs.javaCore.lesson8;

/**
 * Created by ADI on 16.06.2015.
 */
public class PrintAllArrayElements {
    public static void printArrayElement (int next, int[] array){
        System.out.println(array[next]);
        if (next == (array.length - 1)){
            return;
        }
        printArrayElement(next+1, array);
    }
    public static void main(String[] args) {
        printArrayElement(0, new int[] {2, 2, 3, 45, 321, 32121, 325451});
    }
}
