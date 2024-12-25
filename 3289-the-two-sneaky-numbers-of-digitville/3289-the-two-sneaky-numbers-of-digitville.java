class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        cycleSort(nums);
        int[] list = new int[2];
        for(int n : nums) System.out.print(n+" ");
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                list[0] = nums[i];
                list[1] = nums[i]+1;
            }
        }
        return list;
    }
    public void cycleSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if(nums[i] != nums[correctIndex]){
                swap(i,correctIndex,nums);
            }else{
                i++;
            }
        }
    }
    public void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}