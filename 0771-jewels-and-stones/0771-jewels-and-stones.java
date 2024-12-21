class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        char[] jew = jewels.toCharArray();
        char[] sto = stones.toCharArray();
        for(int i=0;i<sto.length;i++){
            for(int j=0;j<jew.length;j++){
                if(sto[i] == jew[j]){
                    count++;
                }
            }
        } 
        return count;
    }
}