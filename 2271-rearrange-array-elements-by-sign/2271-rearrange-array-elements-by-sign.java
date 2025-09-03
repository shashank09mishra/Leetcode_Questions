class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]= new int[nums.length];
        int posI=0;
        int posJ=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[posI]=nums[i];
                posI +=2;
            }
            else{
                ans[posJ]=nums[i];
                posJ +=2;
            }
        }
        return ans;
    }
}