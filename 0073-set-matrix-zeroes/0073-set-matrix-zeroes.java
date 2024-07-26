class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[i][j] = matrix[i][j];
            }
        } 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int row=0;row<matrix.length;row++){
                        arr[row][j] = 0;
                    }
                    for(int col=0;col<matrix[0].length;col++){
                        arr[i][col] = 0;
                    }
                }
                else{
                    continue;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = arr[i][j];
            }
        }

    }
}