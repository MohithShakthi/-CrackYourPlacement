class Solution {
    public int oddCells(int m, int n, int[][] ind) {
        int[][] arr =new int[m][n];
        for(int[] rc:ind){
            for(int i=0;i<n;i++){
                arr[rc[0]][i]++;
            }
            for(int j=0;j<m;j++){
                arr[j][rc[1]]++;
            }
        }
        int count=0;
        for(int[] row:arr){
            for(int col:row){
                if(col%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}