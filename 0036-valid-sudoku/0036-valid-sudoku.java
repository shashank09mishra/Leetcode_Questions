class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
       for(int i =0; i<9;i++){
        for(int j=0;j<9;j++){
            if(board[i][j]=='.'){
                continue;
            }
            String row=board[i][j]+"row"+i;
            String col=board[i][j]+"col"+j;
            String box=board[i][j]+"box"+(i/3)+"-"+(j/3);

            if(set.contains(row)||set.contains(col)||set.contains(box)){
                return false;
            }
            set.add(row);
            set.add(col);
            set.add(box);

        }
       }
       return true; 
    }
}