class Solution {
    public int numberOfSteps(int num) {
        return count(num, 0);
    }
    public int count(int num, int c){
        if(num == 0) return c;
        if(num % 2 == 0) num = num/2;
        else num = num-1;
        c++;
        return count(num, c);
    }
}