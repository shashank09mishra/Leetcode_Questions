class Solution {
    public String removeOuterParentheses(String s) {
        int counter=0;
        String ans="";
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='('){
                if(counter!=0){
                    ans +='(';
                }
                counter +=1;
            }
            else{
                counter -= 1;
                if(counter !=0){
                    ans +=')';
                }
                
            }
        }
        return ans;

    }
}