import org.junit.Test;

import Gumayagay_Kenneth.sortColors;
import java.util.Arrays;

public class sortColorsTest {
    public static void main(String[] args) {
        sortColors sorter = new sortColors();

        // Example test cases
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        int[] nums2 = {2, 0, 1};
        int[] nums3 = {0, 1, 2, 0, 1, 2, 0};
        int[] nums4 = {1, 2, 0};

        System.out.println("Testing sortColors method:");

        testAndPrint(sorter, nums1);
        testAndPrint(sorter, nums2);
        testAndPrint(sorter, nums3);
        testAndPrint(sorter, nums4);
    }

    private static void testAndPrint(sortColors sorter, int[] nums) {
        System.out.println("Before: " + Arrays.toString(nums));
        sorter.sortColors(nums);
        System.out.println("After : " + Arrays.toString(nums));
        System.out.println();
    }
}
