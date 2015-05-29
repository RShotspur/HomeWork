package org.rs.javaCore.lesson3;

/**
 * Created by roman.sydorenko on 28/05/2015.
 */
public class Main {
    public static void main(String[] args) {
        int a = Rand();
        int b = Rand();
        int c = Rand();
        int d = Rand();
        int e = Rand();

        //for 3 numbers
        //-------------------------------------------------
        if (a < b && b < c){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if (b < a && a < c){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }



        //for 4 numbers
        //-------------------------------------------------


        //for 5 numbers
        //-------------------------------------------------


    }
    public static int Rand (){
        int rand =  (int)Math.floor((Math.random() * (100 - 1)) + 1);
        return rand;
    }
}
