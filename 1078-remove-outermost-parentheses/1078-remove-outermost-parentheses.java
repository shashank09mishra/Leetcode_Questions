class Solution {
    public String removeOuterParentheses(String s) {
        int counter=0;
        StringBuilder ans= new StringBuilder();
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='('){
                if(counter!=0){
                    ans.append('(');
                }
                counter +=1;
            }
            else{
                counter -= 1;
                if(counter !=0){
                    ans.append(')');
                }
                
            }
        }
        return ans.toString();

    }
}