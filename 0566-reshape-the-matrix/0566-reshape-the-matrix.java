class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        else{
            int[][] arr=new int[r][c];
            int x=0;
            int y=0;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    arr[x][y]=mat[i][j];
                    y++;
                    if(y==c){
                        y=0;
                        x++;
                    }
                }
            }
            return arr;
        }
    }
}