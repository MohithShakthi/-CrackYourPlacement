class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int index = binary(letters, target);
        return letters[index];
    }
    public int binary(char[] arr, char k){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid] == k){
                if(mid+1<arr.length) return mid+1;
                else return 0;
            }
            else if(k > arr[mid]) s = mid+1;
            else e = mid-1; 
        }
        if(s < arr.length) return s;
        else return 0; 
    }
}