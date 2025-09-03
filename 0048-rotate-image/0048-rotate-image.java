class Solution {
    public void rotate(int[][] matrix) {

        //s1--> transpose
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //s2 reverse every row;
         for (int i = 0; i < matrix.length; i++) {
            int start = 0, end = matrix[i].length - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}