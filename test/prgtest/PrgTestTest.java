/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prgtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author semanticer
 */
public class PrgTestTest {
    
    public PrgTestTest() {
    }

    /**
     * Test of threes method, of class PrgTest.
     */
    @Test
    public void test_isPrime() {
        
        int value = 1;
        boolean primeResult = PrgTest.isPrime(value);
        assertFalse(primeResult);
        
        value = 2;
        primeResult = PrgTest.isPrime(value);
        assertTrue(primeResult);
        
        value = 7;
        primeResult = PrgTest.isPrime(value);
        assertTrue(primeResult);
        
        value = 12;
        primeResult = PrgTest.isPrime(value);
        assertFalse(primeResult);
        
        value = 14;
        primeResult = PrgTest.isPrime(value);
        assertFalse(primeResult);
        
        value = 97;
        primeResult = PrgTest.isPrime(value);
        assertTrue(primeResult);
        
        value = 93;
        primeResult = PrgTest.isPrime(value);
        assertFalse(primeResult);
        
    } 
    
    
    @Test
    public void test_printPrimes() {
        int value = 1;
        int expected = 2;
        int result = PrgTest.printPrimes(value);
        assertEquals(expected, result);
        
        
        value = 10;
        expected = 29;
        result = PrgTest.printPrimes(value);
        assertEquals(expected, result);
        
        value = 20;
        expected = 71;
        result = PrgTest.printPrimes(value);
        assertEquals(expected, result);
        
    } 
    
    @Test
    public void test_greatestCommonDivisor() {
        
        int first = 7;
        int second = 3;
        int expected = 1;
        int result = PrgTest.greatestCommonDivisor(first, second);
        assertEquals(expected, result);
        
        first = 36;
        second = 24;
        expected = 12;
        result = PrgTest.greatestCommonDivisor(first, second);
        assertEquals(expected, result);
        
        first = 104;
        second = 36;
        expected = 4;
        result = PrgTest.greatestCommonDivisor(first, second);
        assertEquals(expected, result);
        
        first = 4;
        second = 12;
        expected = 4;
        result = PrgTest.greatestCommonDivisor(first, second);
        assertEquals(expected, result);
       
    }
    
    @Test
    public void test_simplify() {
        
        Fraction fraction = new Fraction(2, 3);
        Fraction expected = new Fraction(2, 3);
        Fraction result = PrgTest.simplify(fraction);
        assertEquals(expected, result);
        
        fraction = new Fraction(8, 12);
        expected = new Fraction(2, 3);
        result = PrgTest.simplify(fraction);
        assertEquals(expected, result);
        
        fraction = new Fraction(16, 8);
        expected = new Fraction(2, 1);
        result = PrgTest.simplify(fraction);
        assertEquals(expected, result);
       
    }
    
}
