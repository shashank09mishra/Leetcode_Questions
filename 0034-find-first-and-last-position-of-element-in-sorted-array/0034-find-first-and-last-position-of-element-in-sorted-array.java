class Solution {
    public int[] searchRange(int[] nums, int target) {
        int last=lastOcc(nums,target);
        if(last==-1){
            return new int[]{-1,-1};
        }
        int first =firstOcc(nums,target);
        return new int[]{first,last};

    }
    public int lastOcc(int[] nums, int target) {
        // code here
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=low+((high-low)/2);
            if(target==nums[mid]){
                ans=mid;
                low=mid+1;
            }
            else if(target<nums[mid]){
                
                high=mid-1;
            }else if(target>nums[mid]){
                low=mid+1;
            }
        }
        return ans;
    }
    public int firstOcc(int[] nums, int target) {
        
        // code here
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=low+((high-low)/2);
            
            if(target==nums[mid]){
                ans=mid;
                high=mid-1;
            }else if(target<nums[mid]){
                
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}