class Solution {
    public int smallestRepunitDivByK(int k) {
        int n=0;
        if(k%2==0){
            return -1;
        }
        else{
            for(int i =1;i<=k; i++){
                n=(n*10+1)%k;//-->here n get reduced earlier so it will not effect in if // n=n*10+1;(not this)
                if(n==0){
                    return i;
                }
            }
        }
        return -1;
    }
}