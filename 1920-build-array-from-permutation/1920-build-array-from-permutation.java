class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int j=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            j=nums[i];
            arr[i]=nums[j];
        }
        return arr; 
    }
}