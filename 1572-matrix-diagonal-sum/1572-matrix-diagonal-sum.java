class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0;
        int sum2=0;
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j) sum1 = sum1 + mat[i][j];
                if(i+j == n-1) sum2 = sum2 + mat[i][j];
            }
        }
        if(n%2 != 0){
            int mid = n/2;
            sum1 = sum1 - mat[mid][mid];
        }
        int sum = sum1+sum2;
        return sum;
    }
}