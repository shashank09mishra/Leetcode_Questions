class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> mark=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    mark.add(new int[]{i,j});
                }
            }
        }
        for(int[]pos:mark){
            int row=pos[0];
            int col=pos[1];

            for(int i=0;i<matrix[0].length;i++){
                matrix[row][i]=0;
            }
            for(int i=0;i<matrix.length;i++){
                matrix[i][col]=0;
            }
        }
    }
}