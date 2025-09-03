class Solution {
    public void nextPermutation(int[] nums) {


        //  (s1)find the break point
        int indx=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                indx=i;
            }
        }


        if(indx==-1){

            for(int i=0;i<nums.length/2;i++){
                int temp=nums[nums.length-1-i];
                nums[nums.length-1-i]=nums[i];
                nums[i]=temp;
            }
            return;
        }

        //(s2) find the next greater element and swap with index;
         for(int i = nums.length - 1; i > indx; i--){
            if(nums[i] > nums[indx]){
                int temp = nums[i];
                nums[i] = nums[indx];
                nums[indx] = temp;
                break;  // ✅ swap only once
            }
        }

        //(s3) reverse the suffix
        for(int i = indx + 1, j = nums.length - 1; i < j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }


    }
}