class Solution {
    public int maxSubArray(int[] nums) {
        int start = 0;           // subarray ka starting index (jab reset hoga toh yaha update hoga)
        int end = 0;             // current element ka index (loop ke liye)
        int sum = 0;             // abhi tak ka running sum (current subarray ka sum)
        int max = nums[0];       // maximum sum ko track karne ke liye (pehle element se hi shuru karna hai, warna negative case galat ho jayega)

        while (end < nums.length) {
            sum += nums[end];    // current element ko running sum me add kar diya

            max = Math.max(max, sum); // har step pe check kar ki ab tak ka sum maximum hai ya nahi

            if (sum < 0) {       // agar running sum negative ho gaya...
                sum = 0;         // ...toh iska matlab ye subarray bekar hai, reset kar do
                start = end + 1; // naya subarray agle index se start karega
            }

            end++;               // agle element pe move kar jao
        }
        return max;              // final maximum subarray sum return karo
    }
}
