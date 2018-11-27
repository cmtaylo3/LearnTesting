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
public class WaterFillTest {
    
    public WaterFillTest() {
    }
    
    @Test
    public void testHistoFirst() {
        int[] histoFirst = {6, 4, 3, 2, 1, 5, 5};
        WaterFill water = new WaterFill();
        Assert.assertEquals("First test case", 10, water.fill(histoFirst));
    }
    
    @Test
    public void testHistoSecond() {
        int[] histoSecond = {3, 1, 4, 1, 3};
        WaterFill water = new WaterFill();
        Assert.assertEquals("Second test case", 4, water.fill(histoSecond));
    }
    
    @Test
    public void testHistoThird() {
        int[] histoThird = {1, 3, 5, 4, 2};
        WaterFill water = new WaterFill();
        Assert.assertEquals("Third test case", 0, water.fill(histoThird));
    }
}
