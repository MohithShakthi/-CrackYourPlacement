class Solution {
    public void reverseString(char[] s) {
        reverseCharArray(s,0);
    }
    public static void reverseCharArray(char[] arr,int i){
        if(i < arr.length/2){
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
            reverseCharArray(arr, i+1);
        }
        return;
    }
}