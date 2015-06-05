package org.rs.javaCore.lesson4;

/**
 * Created by ADI on 05.06.2015.
 */
public class Main {
    public static int Rand (){
        int rand = (int)Math.floor((Math.random() * (100 - 1)) + 1);
        return rand;
    }
    public static void main(String[] args) {
        System.out.println(Rand());
    }
}
