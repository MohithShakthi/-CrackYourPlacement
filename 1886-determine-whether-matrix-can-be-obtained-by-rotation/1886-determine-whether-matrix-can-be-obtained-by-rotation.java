class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        int m=mat[0].length;
        int rot90=0;
        int rot180=0;
        int rot270=0;
        int rot0=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(target[i][j]==mat[n-j-1][i]){
                    rot90++;
                }
                if(target[i][j]==mat[n-i-1][n-j-1]){
                    rot180++;
                }
                if(target[i][j]==mat[j][n-i-1]){
                    rot270++;
                }
                if(target[i][j]==mat[i][j]){
                    rot0++;
                }
            }

        }
        if(rot90==n*m||rot180==n*m||rot270==n*m||rot0==n*m){
            return true;
        }
        else{
            return false;
        }
    }
}