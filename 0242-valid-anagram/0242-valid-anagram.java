class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length()){
            return false;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        /*Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();
        for(int i=0; i<charS.length; i++){
            mapS.put(charS[i], mapS.getOrDefault(charS[i],0)+1);
            mapT.put(charT[i], mapT.getOrDefault(charT[i],0)+1);
        }
        return mapS.equals(mapT);*/
        Arrays.sort(charS);
        Arrays.sort(charT);
        return Arrays.equals(charS, charT);
    }
}