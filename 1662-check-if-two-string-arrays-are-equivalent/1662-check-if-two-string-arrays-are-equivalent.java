class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     StringBuilder s1 = new StringBuilder();
     StringBuilder s2 = new StringBuilder();
     for(int i=0;i<word1.length;i++){
        s1.append(word1[i]);
     }
     for(int i=0;i<word2.length;i++){
        s2.append(word2[i]);
     }
     System.out.println(s1);
     System.out.println(s2);
     String w1 = s1.toString();
     String w2 = s2.toString();
     if(w2.equals(w1)){
        return true;
     }else{
        return false;
     }
    }
}