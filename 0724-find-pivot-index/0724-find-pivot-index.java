class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            prefix[i] = sum; 
        }
        sum = 0;
        for(int i=n-1;i>=0;i--){
            sum = sum + nums[i];
            suffix[i] = sum;
        }
        for(int i=0;i<n;i++){
            if(prefix[i] == suffix[i]) return i;
        }
        return -1;
    }
    
}