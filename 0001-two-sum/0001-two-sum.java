class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int check = 0;
        for (int i = 0; i < nums.length; i++) {
            check = target - nums[i];
            if (map.containsKey(check)) {
                return new int[] { map.get(check), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { 0 };
    }
}