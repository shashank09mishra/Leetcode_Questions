class Solution {
    public String common(String s1, String s2){
        int n= Math.min(s1.length(),s2.length());
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<n; i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1==ch2){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        for(int i=1; i<strs.length; i++){
            res=common(res,strs[i]);
        }
        return res; 
    }
}