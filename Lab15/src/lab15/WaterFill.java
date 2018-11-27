/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

/**
 *
 * @author chanisetaylor
 */
public class WaterFill {

  public static int fill(int[] histogram) {
    int[] maxRight = new int[histogram.length];
    int[] maxLeft = new int[histogram.length];
    
    int leftMax = 0;
    for (int i = 0; i < histogram.length; i++) {
      if (histogram[i] > leftMax) {
        leftMax = histogram[i];
      }
      maxLeft[i] = leftMax;
    }

    int rightMax = 0;
    for (int i = histogram.length - 1; i >= 0; i--) {
      if (histogram[i] > rightMax) {
        rightMax = histogram[i];
      }
      maxRight[i] = rightMax;
    }
    
    int sum = 0; 
    for (int i = 0; i < histogram.length; i++) {
      int secondHeight = (maxLeft[i] > maxRight[i]) ? maxRight[i] : maxLeft[i];
      sum += secondHeight - histogram[i];
    }

    return sum;
  }

  public static void main(String[] args) {
    int[] histoFirst = {6, 4, 3, 2, 1, 5, 5};
    int[] histoSecond = {3, 1, 4, 1, 3};
    int[] histoThird = {1, 3, 5, 4, 2};
    int expectedFirst = 10;
    int expectedSecond = 4;
    int expectedThird = 0;
    
    System.out.println("Actual: " + fill(histoFirst) + ", expected " + expectedFirst);
    System.out.println("Actual: " + fill(histoSecond) + ", expected " + expectedSecond);
    System.out.println("Actual: " + fill(histoThird) + ", expected " + expectedThird);
  }
  
}
