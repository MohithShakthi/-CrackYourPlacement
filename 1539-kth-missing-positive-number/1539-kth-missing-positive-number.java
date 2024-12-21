class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=1000+k;i++){
            int check = binarySearch(arr,i);
            if(check == -1){
                list.add(i);
            }
            if(list.size() == k){
                return list.get(k-1);
            }
        }
        return list.get(k-1);
    }
    public int binarySearch(int[] arr, int k){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == k) return mid;
            else if(k > arr[mid]) s = mid+1;
            else e = mid-1;
        }
        return -1;
    } 
}