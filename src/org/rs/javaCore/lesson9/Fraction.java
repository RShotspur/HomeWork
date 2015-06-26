package org.rs.javaCore.lesson9;

/**
 * Created by roman.sydorenko on 26/06/2015.
 */
public class Fraction {
    private int numerator;
    private int denominator;
    private int integerFraction = integerFraction(numerator, denominator);
    private float divisionResult = divisionResult(numerator, denominator);

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public float returnDivisionResult(){
        return divisionResult;
    }

    public void printFraction() {
        System.out.println(integerFraction + " целых и " + numerator + "/" + denominator);
    }

    public void definitionOfComplexity(Fraction fraction){
        if (fraction.numerator >= fraction.denominator){
            System.out.println("Дробь сложная");
        }
        else {
            System.out.println("Дробь простая");
        }
    }

//   public ;

    private float divisionResult(int numerator, int denominator){

        return numerator/denominator;
    }

    private int integerFraction(int numerator, int denominator){

        return (int) Math.floor(numerator/denominator);
    }



}
