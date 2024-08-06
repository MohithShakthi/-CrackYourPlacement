class Solution {
    public int mySqrt(int x) {
        long n = 1;
        long r = n * n;
        while(x >= r){
            n++;
            r = n * n;
        }
        return (int)n-1;
    }
}