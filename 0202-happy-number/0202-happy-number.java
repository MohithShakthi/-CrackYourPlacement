class Solution {
    public boolean isHappy(int n) {
        int slow = sumSquare(n);
        int fast = sumSquare(sumSquare(n));
        while(slow != 1 || fast != 1){
            if(slow == fast) return false;
            slow = sumSquare(slow);
            fast = sumSquare(sumSquare(fast));
        }
        return true;
    }
    public int sumSquare(int num){
        int sum = 0, rem;
        while(num > 0){
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }
}