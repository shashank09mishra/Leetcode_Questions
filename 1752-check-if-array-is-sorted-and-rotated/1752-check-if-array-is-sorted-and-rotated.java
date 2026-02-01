import java.util.*;

class Solution {
    public boolean check(int[] nums) {
        int ctr = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i]>=0)
                ctr++;
            else
                break;
        }

        if (ctr == nums.length) {
            return true;
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[(i + ctr) % nums.length];
        }

        int[] copy = nums.clone();
        Arrays.sort(copy);

        return Arrays.equals(result, copy);
    }
}