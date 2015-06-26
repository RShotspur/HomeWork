package org.rs.javaCore.lesson9;

/**
 * Created by roman.sydorenko on 26/06/2015.
 */
public class Main {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(25, 7);

        printTitle("Method 'Give me numerator'");
        System.out.println(fraction.getNumerator());

        printTitle("Method 'Give me denominator'");
        System.out.println(fraction.getDenominator());

        printTitle("Method returned division result");
        System.out.println(fraction.returnDivisionResult());

        printTitle("Print fraction");
        fraction.printFraction();

        printTitle("Says is it simple or complicated fraction");
        fraction.definitionOfComplexity();

        printTitle("The result of integer division");
        System.out.println(fraction.getIntegerFraction());

        printTitle("Numerator after division");
        System.out.println(fraction.getNumeratorAfterDivision());

        printTitle("Returned simplified fraction");
        fraction.printSimplifiedFraction();

    }

    public static void printTitle(String input){
        System.out.println("============================= " + input + " =============================");
    }
}
