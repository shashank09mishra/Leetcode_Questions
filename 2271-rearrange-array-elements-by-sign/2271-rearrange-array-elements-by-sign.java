class Solution {
    public int[] rearrangeArray(int[] nums) {
       ArrayList<Integer> ansPos=new ArrayList<>();
        ArrayList<Integer> ansNeg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ansNeg.add(nums[i]);
            }
            else{
                ansPos.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i+=2){
            nums[i]=ansPos.get(i/2);
            nums[i+1]=ansNeg.get(i/2);
        }
        return nums;
    }
}