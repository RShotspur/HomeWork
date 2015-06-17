package org.rs.javaCore.lesson3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created by roman.sydorenko on 02/06/2015.
 */
public class Task3 {
    public static void main(String[] args) throws Exception{
        int[] negativeMassive = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String test = reader.readLine();
        for (int i = 0; i < negativeMassive.length; i++) {
            negativeMassive[i] = Integer.parseInt(reader.readLine());
        }
    }
}
