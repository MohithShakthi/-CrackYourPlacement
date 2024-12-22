class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target);
    }
    public int binary(int[] arr, int k){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == k) return mid;
            if(arr[s] <= arr[mid]){
                if(k >= arr[s] && k < arr[mid]) e = mid-1;
                else s = mid+1;
            }else{
                if(k > arr[mid] && k <= arr[e]) s = mid+1;
                else e = mid-1;
            }
        }
        return -1;
    }
}