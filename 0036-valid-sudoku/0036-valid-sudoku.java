class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[]rows= new HashSet[9];
        HashSet<Character>[]cols= new HashSet[9];
        HashSet<Character>[]box= new HashSet[9];

        for(int row=0;row<9;row++){
            rows[row] = new HashSet<Character>();
           // rows[r] = new HashSet<Character>();
            cols[row]=new HashSet<Character>();
            box[row]=new HashSet<Character>();
        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }

                char val=board[r][c];

                //check for 1-9 rows 0 based index for uniqueness
                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);


                //check for 1-9 cols 0 based index for uniqueness
                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);


                //check for 1-9 box 0 based index for uniqueness
                int indx=(r/3)*3+(c/3);
                if(box[indx].contains(val)){
                    return false;
                }
                box[indx].add(val);

            }
        }
        return true;
    }
}