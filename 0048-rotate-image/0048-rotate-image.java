class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int i=0; int j=n-1;
        while(i<j){
            for(int k=0;k<n;k++){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
            i++;
            j--;
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]= temp;
            }
        }
    }
}