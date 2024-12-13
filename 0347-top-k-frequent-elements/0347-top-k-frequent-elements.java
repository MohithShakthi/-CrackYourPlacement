class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                int value = map.get(n);
                map.put(n,value+1);
            }else{
                map.put(n,1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        for(int i=0;i<k;i++){
            result[i] = list.get(i);
        }
        return result;
    }
} 