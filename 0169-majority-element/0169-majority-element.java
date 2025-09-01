class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[0];
        int count=1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
            else{
                count=1;
            }
            if (count > (nums.length / 2)) {
                ans = nums[i];
                break;
            }

        }
        return ans;
    }
}
