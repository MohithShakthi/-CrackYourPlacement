class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length == 1) return 1;
        int tub = 1;
        char sign = ' ';
        int res = 1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1] && sign != '>'){
                tub++;
                sign = '>';
            }
            else if(arr[i] < arr[i+1] && sign != '<'){
                tub++;
                sign = '<';
            }else{
                res = Math.max(res,tub);
                if(arr[i] == arr[i+1]){
                    sign = ' ';
                    tub = 1;
                }else{
                    tub = 2;
                }
            }
        }
        res = Math.max(res,tub);
        return res;
    }
}