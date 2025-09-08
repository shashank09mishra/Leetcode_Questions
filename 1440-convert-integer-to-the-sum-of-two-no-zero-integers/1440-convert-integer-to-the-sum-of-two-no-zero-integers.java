class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int x = n - i;
            int y=i;
           if(x>0 && y>0 && isNoZero(x)==true && isNoZero(y)==true){
            return new int[]{x,y};
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