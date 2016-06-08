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
public class PrgTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this is just for fun, you can find real tests in PrgTestTest
        int result = threes(131);
        System.out.println("Vysledek threes je: " + result); // should be 9
        
        result = leastCommonMultiple(3, 11);
        System.out.println("Vysledek leastCommonMultiple je: " + result); // should be 33
        
        result = PrgTest.comparator(new Fraction(1, 3), new Fraction(2, 3));
        System.out.println("Vysledek comparator je: " + result); // should be -1
        
    }
    /**
     *  first, you mash in a random large number to start with. Then, repeatedly do the following:
        If the number is divisible by 3, divide it by 3.
        If it's not, either add 1 or subtract 1 (to make it divisible by 3), then divide it by 3.
        The game stops when you reach "1".
     * @param value
     * @return number of steps required
     */
    public static int threes(int value) {
        int counter = 0;
        while (value != 1) {
            int mod = value % 3;
            if (mod == 0) {
                value = value / 3;
            } else if (mod == 1){
                value = value - 1;
            } else if (mod == 2) {
                value = value + 1;
            }
            System.out.println("Value: " + value);
            counter++;
        }
        return counter;
    }
    
    
    public static int leastCommonMultiple(int first, int second) {
        int bigger = Math.max(first, second);
        int smaller = Math.min(first, second);
        int testing = bigger;
        while (testing % smaller != 0) {
            testing = testing + bigger;
        }
        return testing;
    }
    
    /**
     * @param first
     * @param second
     * @return 1 if first fraction is bigger, -1 if second fraction is bigger and 0 if they are equal
     */
    public static int comparator(Fraction first, Fraction second) {
        int lcm = leastCommonMultiple(first.getDenominator(), second.getDenominator());
        
        int firstNominator = (lcm / first.getDenominator()) * first.getNumerator();
        int secondNominator = (lcm / second.getDenominator()) * second.getNumerator();
        
        if (firstNominator == secondNominator) return 0;
        else return firstNominator > secondNominator ? 1 : -1;
    }
    
}
