class Solution {
    public void sortColors(int[] nums) {
        sortColor(nums,0,nums.length-1);
    }
    public void sortColor(int[] arr, int s, int e){
        if(e<=s) return;
        int i = s-1;
        int pivote = e;
        for(int j=s;j<e;j++){
            if(arr[j] < arr[pivote]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[pivote];
        arr[pivote] = temp;
        pivote = i;
        sortColor(arr,s,pivote-1);
        sortColor(arr,pivote+1,e); 
    }
}