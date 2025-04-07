class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq=new int[26];
       int maxFreq=0,left=0,right=0,count=0;
       while(right<s.length()){
         freq[s.charAt(right)-'A']++;
         maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
         while((right-left+1)-maxFreq>k){
            freq[s.charAt(left)-'A']--;
            left++;

         }
         count=Math.max(count,right-left+1);
         right++;
       } 
       return count;
    }
}