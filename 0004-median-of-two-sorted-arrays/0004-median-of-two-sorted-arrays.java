class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        for(int i=0;i<m+n;i++){
            if(i<m){
                arr[i] = nums1[i];
            }else{
                arr[i] = nums2[i-m];
            }
        }
        Arrays.sort(arr);
        if((m+n)%2==0){
            double mid =((double)arr[(m+n)/2-1]+(double)arr[(m+n)/2])/2;
            return mid;
        }else{
            return arr[(m+n)/2];
        }
    }
}