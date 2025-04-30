class Solution {
    public int majorityElement(int[] nums) {
        int maj=0;
        int count=1;
        for(int i=1; i<nums.length; i++){
            if(nums[maj]==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maj=i;
                count=1;
            }
        }
        return nums[maj];
    }
}