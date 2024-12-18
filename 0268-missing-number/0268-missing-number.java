class Solution {
    public int missingNumber(int[] nums) {
        cycleSort(nums);
        for(int n: nums) System.out.print(n+" ");
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i) return i;
        }
        return nums.length;
    }
    public static void cycleSort(int[] arr){
     for(int i=0;i<arr.length;i++){
        while(arr[i] < arr.length && !(arr[i] == i)){
            swap(i,arr[i],arr);
            }
        }   
    }
    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] =  arr[b];
        arr[b] = temp;
    }
}