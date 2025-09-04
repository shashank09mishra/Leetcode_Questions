class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=0;
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                ans=mid+1;
                low=mid+1;
            }
            else if(target<nums[mid]){
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}