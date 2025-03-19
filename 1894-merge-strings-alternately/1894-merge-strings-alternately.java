class Solution {
    public String mergeAlternately(String word1, String word2) {
        int first=0;
        int second=0;
        StringBuffer sb= new StringBuffer();
        while(first<word1.length() && second<word2.length()){
          sb.append(word1.charAt(first));
         sb.append(word2.charAt(second));
         first++;
         second++;

        }
        while(first<word1.length()){
             sb.append(word1.charAt(first));
             first++;
        }
        while(second<word2.length()){
             sb.append(word2.charAt(second));
             second++;
        }
        return sb.toString();
    }
}