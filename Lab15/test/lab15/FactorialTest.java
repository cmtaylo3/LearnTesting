/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chanisetaylor
 */
public class FactorialTest {
    
    public FactorialTest() {
    }

    
    @Test
    public void testZeroFactorial() {
        Factorial fact = new Factorial();
        Assert.assertEquals("0 test case", 1, fact.factorial(0));
    }
    
    @Test
    public void testOneFactorial() {
        Factorial fact = new Factorial();
        Assert.assertEquals("1 test case", 1, fact.factorial(1));
        
    }
    
    @Test
    public void testTenFactorial() {
        Factorial fact = new Factorial();
        Assert.assertEquals("10 test case", 3628800, fact.factorial(10));
    }  
}
