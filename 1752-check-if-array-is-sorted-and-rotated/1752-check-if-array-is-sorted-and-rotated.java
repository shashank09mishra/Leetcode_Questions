class Solution {
    public boolean check(int[] nums) {
        int c=0,c1=0;
        for(int i =1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){
                c++;
            }
            else{
                c1++;
            }
        }
        if(c==nums.length-1){
            return true;
        }
        else if(c1==1 && c==nums.length-2 && nums[nums.length-1]<=nums[0] ){
            return true;
        }
        else{
            return false;
        }

    }
}