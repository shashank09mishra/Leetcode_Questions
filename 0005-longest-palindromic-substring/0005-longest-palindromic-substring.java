class Solution {
    public static boolean isPalindromic(String s , int i , int j){
        while(i<j){
            char ch1= s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int max=0;
        int start=0;
        int end=0;
        int n=s.length();
        for(int i =0; i<n;i++){
            for(int j=i;j<n; j++){
                if(isPalindromic(s,i,j)==true){
                    if(((j-i)+1)>max){
                        max=(j-i)+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
}