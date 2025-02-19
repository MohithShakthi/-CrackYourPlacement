class Solution {
    public String intToRoman(int num) {
        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hund = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thou = {"","M","MM","MMM"};
        StringBuilder ans = new StringBuilder();
        ans.append(thou[num/1000]);
        ans.append(hund[(num%1000)/100]);
        ans.append(tens[(num%100)/10]);
        ans.append(ones[num%10]);
        return ans.toString();
    }
}