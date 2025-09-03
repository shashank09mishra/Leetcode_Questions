class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int ans=nums[0];
        int count=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(ans +1 ==nums[i]){
                count++;
            }
            else if(nums[i]==ans){
                continue;
            }
            else {
                
                count=1;
            }
            ans=nums[i];
            max=Math.max(max,count);
        }
        return max;
    }
}