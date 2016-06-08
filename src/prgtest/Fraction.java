/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prgtest;

/**
 *
 * @author semanticer
 */
public class Fraction {
    // čitatel 
    private final int numerator;
    
    // jmenovatel
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" + numerator + "/" + denominator + '}';
    }

    
}
