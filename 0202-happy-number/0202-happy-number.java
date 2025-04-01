class Solution {
    public boolean isHappy(int n) {
        int sum = sumSquare(n);
        Set<Integer> set = new HashSet<>();
        while(sum != 1){
            if(set.contains(sum)) return false;
            set.add(sum);
            sum = sumSquare(sum);
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