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
        System.out.println("3 random numbers");
        //-------------------------------------------------
        if (a <= b && a <= c){
            System.out.println(a);
            if (b < c){
                System.out.println(b);
                System.out.println(c);
            }
            else {
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (b <= a && b <= c){
            System.out.println(b);
            if (a < c){
                System.out.println(a);
                System.out.println(c);
            }
            else {
                System.out.println(c);
                System.out.println(a);
            }
        }
        else if (c <= a && c <= b){
            System.out.println(c);
            if (a < b){
                System.out.println(a);
                System.out.println(b);
            }
            else {
                System.out.println(b);
                System.out.println(a);
            }
        }

        //for 4 numbers
        System.out.println("4 random numbers");
        //-------------------------------------------------
        if (d <= a && d <= b && d <= c){
            System.out.println(d);
            if (a <= b && a <= c){
                System.out.println(a);
                if (b < c){
                    System.out.println(b);
                    System.out.println(c);
                }
                else {
                    System.out.println(c);
                    System.out.println(b);
                }
            }
            else if (b <= a && b <= c){
                System.out.println(b);
                if (a < c){
                    System.out.println(a);
                    System.out.println(c);
                }
                else {
                    System.out.println(c);
                    System.out.println(a);
                }
            }
            else if (c <= a && c <= b){
                System.out.println(c);
                if (a < b){
                    System.out.println(a);
                    System.out.println(b);
                }
                else {
                    System.out.println(b);
                    System.out.println(a);
                }
            }

        }
        else if (a <= b && a <= c && a <= d){
            System.out.println(a);
            if (d <= b && d <= c){
                System.out.println(d);
                if (b < c){
                    System.out.println(b);
                    System.out.println(c);
                }
                else {
                    System.out.println(c);
                    System.out.println(b);
                }
            }
            else if (b <= d && b <= c){
                System.out.println(b);
                if (d < c){
                    System.out.println(d);
                    System.out.println(c);
                }
                else {
                    System.out.println(c);
                    System.out.println(d);
                }
            }
            else if (c <= d && c <= b){
                System.out.println(c);
                if (d < b){
                    System.out.println(d);
                    System.out.println(b);
                }
                else {
                    System.out.println(b);
                    System.out.println(d);
                }
            }
        }
        else if (b <= a && b <= c && b <= d) {
            System.out.println(b);
            if (a <= d && a <= c){
                System.out.println(a);
                if (d < c){
                    System.out.println(d);
                    System.out.println(c);
                }
                else {
                    System.out.println(c);
                    System.out.println(d);
                }
            }
            else if (d <= a && d <= c){
                System.out.println(d);
                if (a < c){
                    System.out.println(a);
                    System.out.println(c);
                }
                else {
                    System.out.println(c);
                    System.out.println(a);
                }
            }
            else if (c <= a && c <= d){
                System.out.println(c);
                if (a < d){
                    System.out.println(a);
                    System.out.println(d);
                }
                else {
                    System.out.println(d);
                    System.out.println(a);
                }
            }
        }
        else if (c <= a && c <= b && c <= d) {
            System.out.println(c);
            if (a <= b && a <= d){
                System.out.println(a);
                if (b < d){
                    System.out.println(b);
                    System.out.println(d);
                }
                else {
                    System.out.println(d);
                    System.out.println(b);
                }
            }
            else if (b <= a && b <= d){
                System.out.println(b);
                if (a < d){
                    System.out.println(a);
                    System.out.println(d);
                }
                else {
                    System.out.println(d);
                    System.out.println(a);
                }
            }
            else if (d <= a && d <= b){
                System.out.println(d);
                if (a < b){
                    System.out.println(a);
                    System.out.println(b);
                }
                else {
                    System.out.println(b);
                    System.out.println(a);
                }
            }
        }

        //for 5 numbers
        System.out.println("5 random numbers");
        //-------------------------------------------------
        if (e <= a && e <= b && e <= c && e <= d) {
            System.out.println(e);
            if (d <= a && d <= b && d <= c){
                System.out.println(d);
                if (a <= b && a <= c){
                    System.out.println(a);
                    if (b < c){
                        System.out.println(b);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(b);
                    }
                }
                else if (b <= a && b <= c){
                    System.out.println(b);
                    if (a < c){
                        System.out.println(a);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(a);
                    }
                }
                else if (c <= a && c <= b){
                    System.out.println(c);
                    if (a < b){
                        System.out.println(a);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(a);
                    }
                }

            }
            else if (a <= b && a <= c && a <= d){
                System.out.println(a);
                if (d <= b && d <= c){
                    System.out.println(d);
                    if (b < c){
                        System.out.println(b);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(b);
                    }
                }
                else if (b <= d && b <= c){
                    System.out.println(b);
                    if (d < c){
                        System.out.println(d);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(d);
                    }
                }
                else if (c <= d && c <= b){
                    System.out.println(c);
                    if (d < b){
                        System.out.println(d);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(d);
                    }
                }
            }
            else if (b <= a && b <= c && b <= d) {
                System.out.println(b);
                if (a <= d && a <= c){
                    System.out.println(a);
                    if (d < c){
                        System.out.println(d);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(d);
                    }
                }
                else if (d <= a && d <= c){
                    System.out.println(d);
                    if (a < c){
                        System.out.println(a);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(a);
                    }
                }
                else if (c <= a && c <= d){
                    System.out.println(c);
                    if (a < d){
                        System.out.println(a);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(a);
                    }
                }
            }
            else if (c <= a && c <= b && c <= d) {
                System.out.println(c);
                if (a <= b && a <= d){
                    System.out.println(a);
                    if (b < d){
                        System.out.println(b);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(b);
                    }
                }
                else if (b <= a && b <= d){
                    System.out.println(b);
                    if (a < d){
                        System.out.println(a);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(a);
                    }
                }
                else if (d <= a && d <= b){
                    System.out.println(d);
                    if (a < b){
                        System.out.println(a);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(a);
                    }
                }
            }

        }
        else if (a <= b && a <= c && a <= d && a <= e) {
            System.out.println(a);
            if (d <= e && d <= b && d <= c){
                System.out.println(d);
                if (e <= b && e <= c){
                    System.out.println(e);
                    if (b < c){
                        System.out.println(b);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(b);
                    }
                }
                else if (b <= e && b <= c){
                    System.out.println(b);
                    if (e < c){
                        System.out.println(e);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(e);
                    }
                }
                else if (c <= e && c <= b){
                    System.out.println(c);
                    if (e < b){
                        System.out.println(e);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(e);
                    }
                }

            }
            else if (e <= b && e <= c && e <= d){
                System.out.println(e);
                if (d <= b && d <= c){
                    System.out.println(d);
                    if (b < c){
                        System.out.println(b);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(b);
                    }
                }
                else if (b <= d && b <= c){
                    System.out.println(b);
                    if (d < c){
                        System.out.println(d);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(d);
                    }
                }
                else if (c <= d && c <= b){
                    System.out.println(c);
                    if (d < b){
                        System.out.println(d);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(d);
                    }
                }
            }
            else if (b <= e && b <= c && b <= d) {
                System.out.println(b);
                if (e <= d && e <= c){
                    System.out.println(e);
                    if (d < c){
                        System.out.println(d);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(d);
                    }
                }
                else if (d <= e && d <= c){
                    System.out.println(d);
                    if (e < c){
                        System.out.println(e);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(e);
                    }
                }
                else if (c <= e && c <= d){
                    System.out.println(c);
                    if (e < d){
                        System.out.println(e);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(e);
                    }
                }
            }
            else if (c <= e && c <= b && c <= d) {
                System.out.println(c);
                if (e <= b && e <= d){
                    System.out.println(e);
                    if (b < d){
                        System.out.println(b);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(b);
                    }
                }
                else if (b <= e && b <= d){
                    System.out.println(b);
                    if (e < d){
                        System.out.println(e);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(e);
                    }
                }
                else if (d <= e && d <= b){
                    System.out.println(d);
                    if (e < b){
                        System.out.println(e);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(e);
                    }
                }
            }

        }
        else if (b <= a && b <= c && b <= d && b <= e) {
            System.out.println(b);
            if (d <= a && d <= e && d <= c){
                System.out.println(d);
                if (a <= e && a <= c){
                    System.out.println(a);
                    if (e < c){
                        System.out.println(e);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(e);
                    }
                }
                else if (e <= a && e <= c){
                    System.out.println(e);
                    if (a < c){
                        System.out.println(a);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(a);
                    }
                }
                else if (c <= a && c <= e){
                    System.out.println(c);
                    if (a < e){
                        System.out.println(a);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(a);
                    }
                }

            }
            else if (a <= e && a <= c && a <= d){
                System.out.println(a);
                if (d <= e && d <= c){
                    System.out.println(d);
                    if (e < c){
                        System.out.println(e);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(e);
                    }
                }
                else if (e <= d && e <= c){
                    System.out.println(e);
                    if (d < c){
                        System.out.println(d);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(d);
                    }
                }
                else if (c <= d && c <= e){
                    System.out.println(c);
                    if (d < e){
                        System.out.println(d);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(d);
                    }
                }
            }
            else if (e <= a && e <= c && e <= d) {
                System.out.println(e);
                if (a <= d && a <= c){
                    System.out.println(a);
                    if (d < c){
                        System.out.println(d);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(d);
                    }
                }
                else if (d <= a && d <= c){
                    System.out.println(d);
                    if (a < c){
                        System.out.println(a);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(a);
                    }
                }
                else if (c <= a && c <= d){
                    System.out.println(c);
                    if (a < d){
                        System.out.println(a);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(a);
                    }
                }
            }
            else if (c <= a && c <= e && c <= d) {
                System.out.println(c);
                if (a <= e && a <= d){
                    System.out.println(a);
                    if (e < d){
                        System.out.println(e);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(e);
                    }
                }
                else if (e <= a && e <= d){
                    System.out.println(e);
                    if (a < d){
                        System.out.println(a);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(a);
                    }
                }
                else if (d <= a && d <= e){
                    System.out.println(d);
                    if (a < e){
                        System.out.println(a);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(a);
                    }
                }
            }

        }
        else if (c <= a && c <= b && c <= d && c <= e) {
            System.out.println(c);
            if (d <= a && d <= b && d <= e){
                System.out.println(d);
                if (a <= b && a <= e){
                    System.out.println(a);
                    if (b < e){
                        System.out.println(b);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(b);
                    }
                }
                else if (b <= a && b <= e){
                    System.out.println(b);
                    if (a < e){
                        System.out.println(a);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(a);
                    }
                }
                else if (e <= a && e <= b){
                    System.out.println(e);
                    if (a < b){
                        System.out.println(a);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(a);
                    }
                }

            }
            else if (a <= b && a <= e && a <= d){
                System.out.println(a);
                if (d <= b && d <= e){
                    System.out.println(d);
                    if (b < e){
                        System.out.println(b);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(b);
                    }
                }
                else if (b <= d && b <= e){
                    System.out.println(b);
                    if (d < e){
                        System.out.println(d);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(d);
                    }
                }
                else if (e <= d && e <= b){
                    System.out.println(e);
                    if (d < b){
                        System.out.println(d);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(d);
                    }
                }
            }
            else if (b <= a && b <= e && b <= d) {
                System.out.println(b);
                if (a <= d && a <= e){
                    System.out.println(a);
                    if (d < e){
                        System.out.println(d);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(d);
                    }
                }
                else if (d <= a && d <= e){
                    System.out.println(d);
                    if (a < e){
                        System.out.println(a);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(a);
                    }
                }
                else if (e <= a && e <= d){
                    System.out.println(e);
                    if (a < d){
                        System.out.println(a);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(a);
                    }
                }
            }
            else if (e <= a && e <= b && e <= d) {
                System.out.println(e);
                if (a <= b && a <= d){
                    System.out.println(a);
                    if (b < d){
                        System.out.println(b);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(b);
                    }
                }
                else if (b <= a && b <= d){
                    System.out.println(b);
                    if (a < d){
                        System.out.println(a);
                        System.out.println(d);
                    }
                    else {
                        System.out.println(d);
                        System.out.println(a);
                    }
                }
                else if (d <= a && d <= b){
                    System.out.println(d);
                    if (a < b){
                        System.out.println(a);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(a);
                    }
                }
            }

        }
        else if (d <= a && d <= b && d <= c && d <= e) {
            System.out.println(d);
            if (e <= a && e <= b && e <= c){
                System.out.println(e);
                if (a <= b && a <= c){
                    System.out.println(a);
                    if (b < c){
                        System.out.println(b);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(b);
                    }
                }
                else if (b <= a && b <= c){
                    System.out.println(b);
                    if (a < c){
                        System.out.println(a);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(a);
                    }
                }
                else if (c <= a && c <= b){
                    System.out.println(c);
                    if (a < b){
                        System.out.println(a);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(a);
                    }
                }

            }
            else if (a <= b && a <= c && a <= e){
                System.out.println(a);
                if (e <= b && e <= c){
                    System.out.println(e);
                    if (b < c){
                        System.out.println(b);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(b);
                    }
                }
                else if (b <= e && b <= c){
                    System.out.println(b);
                    if (e < c){
                        System.out.println(e);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(e);
                    }
                }
                else if (c <= e && c <= b){
                    System.out.println(c);
                    if (e < b){
                        System.out.println(e);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(e);
                    }
                }
            }
            else if (b <= a && b <= c && b <= e) {
                System.out.println(b);
                if (a <= e && a <= c){
                    System.out.println(a);
                    if (e < c){
                        System.out.println(e);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(e);
                    }
                }
                else if (e <= a && e <= c){
                    System.out.println(e);
                    if (a < c){
                        System.out.println(a);
                        System.out.println(c);
                    }
                    else {
                        System.out.println(c);
                        System.out.println(a);
                    }
                }
                else if (c <= a && c <= e){
                    System.out.println(c);
                    if (a < e){
                        System.out.println(a);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(a);
                    }
                }
            }
            else if (c <= a && c <= b && c <= e) {
                System.out.println(c);
                if (a <= b && a <= e){
                    System.out.println(a);
                    if (b < e){
                        System.out.println(b);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(b);
                    }
                }
                else if (b <= a && b <= e){
                    System.out.println(b);
                    if (a < e){
                        System.out.println(a);
                        System.out.println(e);
                    }
                    else {
                        System.out.println(e);
                        System.out.println(a);
                    }
                }
                else if (e <= a && e <= b){
                    System.out.println(e);
                    if (a < b){
                        System.out.println(a);
                        System.out.println(b);
                    }
                    else {
                        System.out.println(b);
                        System.out.println(a);
                    }
                }
            }

        }


    }
    public static int Rand (){
        int rand =  (int)Math.floor((Math.random() * (100 - 1)) + 1);
        return rand;
    }
}
