class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;

        // Step 1: Find the first decreasing element from the end
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: Find the just larger element to the right and swap
        if (index != -1) {
            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums, i, index); // use nums, not arr
                    break;
                }
            }
        }

        // Step 3: Reverse the elements after index
        reverse(nums, index + 1, n - 1); // use nums, not arr
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
