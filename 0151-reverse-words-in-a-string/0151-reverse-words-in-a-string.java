class Solution {
    public String reverseWords(String s) {
        String ans="";//take an empty string
        for(int i=0; i<s.length();i++){//traverse the string
            StringBuilder sb= new StringBuilder();
            while(i<s.length() && s.charAt(i)!=' '){//wherever u find any space before that space print all the character
                sb.append(s.charAt(i));
                i++;// suppose u r printing "the" so as to maintain conituity cz after the word 'the' the while will terminate
            }
            if(sb.length()!=0){
                ans= " "+ sb+ ans; //store space thn stringbuilder and then ans
            }
        }
        return ans.substring(1); //leave the first space and move on to the rest
    }
}