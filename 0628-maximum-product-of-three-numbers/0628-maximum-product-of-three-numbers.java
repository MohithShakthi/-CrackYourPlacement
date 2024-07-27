class Solution {
    public int maximumProduct(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        int sum1 = nums[0]*nums[1]*nums[2];
        int sum2 = nums[n-1]*nums[n-2]*nums[n-3];
        int sum3 = nums[0]*nums[1]*nums[n-1];
        if(sum1>sum2){
            if(sum1>sum3){
                return sum1;
            }else{
                return sum3;
            }
        }else{return sum2;}
    }
}