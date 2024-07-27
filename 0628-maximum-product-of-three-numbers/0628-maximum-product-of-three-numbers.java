class Solution {
    public int maximumProduct(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        int sum1 = nums[0]*nums[1]*nums[n-1];
        int sum2 = nums[n-1]*nums[n-2]*nums[n-3];
        if(sum1>sum2){
            return sum1;
        }else{
            return sum2;    
        }
    }
}