class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long contiguous = 0;
        for(int n : nums){
            if(n == 0){
                contiguous ++;
                count = count + contiguous;
            }else{
                contiguous = 0;
            }
        }
        return count;
    }
}