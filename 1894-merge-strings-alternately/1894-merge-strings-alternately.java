class Solution {
    public String mergeAlternately(String word1, String word2) {
        int first=0;
        int second=0;
        StringBuffer sb= new StringBuffer();
        int max=Math.max(word1.length(),word2.length());
        for(int i=0;i<max;i++){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}