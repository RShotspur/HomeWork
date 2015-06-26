package org.rs.javaCore.lesson9;

/**
 * Created by roman.sydorenko on 26/06/2015.
 */
public class Fraction {
    private int numerator;
    private int denominator;
    private int integerFraction;
    private int numeratorAfterDivision;

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public int getIntegerFraction(){
        return integerFraction;
    }

    public int getNumeratorAfterDivision(){
        return numeratorAfterDivision;
    }

    public float returnDivisionResult(){
        return (float)numerator/denominator;
    }

    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    public void printSimplifiedFraction(){
        System.out.println(integerFraction + " of int and " + numeratorAfterDivision + "/" + denominator);
    }


    public void definitionOfComplexity(){
        if (numerator >= denominator){
            System.out.println("Fraction complicated");
        }
        else {
            System.out.println("Fraction simple");
        }
    }


    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        this.integerFraction = (int) Math.floor(numerator/denominator);
        this.numeratorAfterDivision = numerator%denominator;
    }



}
