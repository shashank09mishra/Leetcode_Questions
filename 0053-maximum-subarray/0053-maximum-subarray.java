class Solution {
    public int maxSubArray(int[] nums) {
        int start=0;
        int end=0;
        int sum=0;
        int max=nums[0];
        while( end<nums.length){
            sum +=nums[end];
            max=Math.max(max,sum);
            if(sum<0){
                 sum =0;
                start = end+1;;
            }
            
            end++;   
        }
        return max;
    }
}