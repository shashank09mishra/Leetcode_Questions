public class Solution {
    public string RestoreString(string s, int[] indices) {
        int n= indices.Length;
        char [] ans= new char[n];

        for(int i=0; i<n;i++){
            ans[indices[i]]=s[i];
        }
        return new string(ans);
    }
}