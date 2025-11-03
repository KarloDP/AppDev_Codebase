package test;

import org.junit.Test;
import Gumayagay_Kenneth.containsMostWater;

public class containsMostWaterTest {
    @Test
    public void containsMostWaterTest() {
        containsMostWater sol = new containsMostWater();

        int[] heights1 = {1,8,6,2,5,4,8,3,7};
        int[] heights2 = {1,1};
        int[] heights3 = {4,3,2,1,4};
        int[] heights4 = {1,2,1};

        System.out.println("Testing maxArea method:");
        System.out.println("Input: [1,8,6,2,5,4,8,3,7] → Output: " + sol.maxArea(heights1)); // Expected 49
        System.out.println("Input: [1,1] → Output: " + sol.maxArea(heights2));              // Expected 1
        System.out.println("Input: [4,3,2,1,4] → Output: " + sol.maxArea(heights3));        // Expected 16
        System.out.println("Input: [1,2,1] → Output: " + sol.maxArea(heights4));            // Expected 2
    }
}
