package Gumayagay_Kenneth;
public class singleNumber{
    public int singleNum(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            ans ^= x;
        }
        return ans;
    }
}