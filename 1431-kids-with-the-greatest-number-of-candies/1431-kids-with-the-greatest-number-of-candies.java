class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = -1;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > max) max = candies[i];
        }
        for(int i=0;i<candies.length;i++){
            int current = candies[i] + extraCandies;
            if(current >= max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}