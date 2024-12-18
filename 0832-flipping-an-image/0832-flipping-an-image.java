class Solution {
    public int[][] flipAndInvertImage(int[][] im) {
        for(int i=0;i<im.length;i++){
            int s=0;
            int e=im[i].length-1;
            while(e>s){
                int temp=im[i][s];
                im[i][s]=im[i][e];
                im[i][e]=temp;
                s++;
                e--;
            }
            for(int j=0;j<im[i].length;j++){
                if(im[i][j]==1){
                    im[i][j]=0;
                }
                else{
                    im[i][j]=1;
                }
                }
        }
        return im;
    }
}