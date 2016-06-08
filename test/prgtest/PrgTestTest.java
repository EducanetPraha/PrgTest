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
    public void testThrees() {
        System.out.println("threes 10 => 3");
        int value = 10;
        int expResult = 3;
        int result = PrgTest.threes(value);
        assertEquals(expResult, result);
        
        System.out.println("threes 3 => 1");
        value = 3;
        expResult = 1;
        result = PrgTest.threes(value);
        assertEquals(expResult, result);
        
        System.out.println("threes 21 => 5");
        value = 21;
        expResult = 5;
        result = PrgTest.threes(value);
        assertEquals(expResult, result);
        
        System.out.println("threes 131 => 9");
        value = 131;
        expResult = 9;
        result = PrgTest.threes(value);
    }
    
    @Test
    public void testLeastCommonMultiple() {
        System.out.println("threes 10,5 => 10");
        int value1 = 10;
        int value2 = 5;
        int expResult = 10;
        int result = PrgTest.leastCommonMultiple(value1, value2);
        assertEquals(expResult, result);
               
        
        System.out.println("threes 3,11 => 33");
        value1 = 3;
        value2 = 11;
        expResult = 33;
        result = PrgTest.leastCommonMultiple(value1, value2);
        assertEquals(expResult, result);
        
        
        System.out.println("threes 212,48 => 2544");
        value1 = 212;
        value2 = 48;
        expResult = 2544;
        result = PrgTest.leastCommonMultiple(value1, value2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComparator() {
        System.out.println("threes 1/3,2/3 => -1");
        Fraction value1 = new Fraction(1, 3);
        Fraction value2 = new Fraction(2, 3);
        int expResult = -1;
        int result = PrgTest.comparator(value1, value2);
        assertEquals(expResult, result);
               

        System.out.println("threes 2/3, 6/11 => 1");
        value1 = new Fraction(2, 3);
        value2 = new Fraction(6, 11);
        expResult = 1;
        result = PrgTest.comparator(value1, value2);
        assertEquals(expResult, result);
        
        System.out.println("threes 15/30, 2/4 => 0");
        value1 = new Fraction(15, 30);
        value2 = new Fraction(2, 4);
        expResult = 0;
        result = PrgTest.comparator(value1, value2);
        assertEquals(expResult, result);
        
       
    }
    
}
