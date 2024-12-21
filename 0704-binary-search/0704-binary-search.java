class Solution {
    public int search(int[] nums, int target) {
        int res = binarySearch(nums, target);
        return res;
    }
    public int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == key) return mid;
            else if(key > arr[mid]) s = mid +1;
            else e = mid-1;
        }
        return -1;
    }
}