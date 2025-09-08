class Solution {
    public int[] getNoZeroIntegers(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < n; i++) {
            int x = n - i;
            map.put(i, x);
            if (map.containsKey(x)) {
                if (isNoZero(i) && isNoZero(x)) {
                    return new int[] { i, x };
                }
            } 
        }
        return new int[] { -1, -1 };
    }

    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0)
                return false;
            num /= 10;
        }
        return true;
    }
}