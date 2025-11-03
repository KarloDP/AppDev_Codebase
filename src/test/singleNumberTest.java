package test;
import org.junit.Test;

import Gumayagay_Kenneth.singleNumber;

public class singleNumberTest {
    @Test
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            ans ^= x;
        }
        return ans;
    }
}
