class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cycleSort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                list.add(i+1);
            }
        }
        return list;
    }
    public void cycleSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
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