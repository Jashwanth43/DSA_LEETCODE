class Solution {
    public int maxVowels(String s, int k) {
      int max=0;
      for(int i=0;i<k;i++){
        if(isVowel(s.charAt(i))){
            max++;
        }
      }
        int ans=max;
        for(int j=k;j<s.length();j++){
            if(isVowel(s.charAt(j-k))){
                max--;
            }              if(isVowel(s.charAt(j))){
                max++;
              }
            
           ans= Math.max(max,ans);
        }
      
             return ans;

    }
    public boolean isVowel(char c){
        return c =='a'|| c =='A' || c =='e' || c =='E' || c =='I' ||c =='i' ||c =='o'||c =='O' ||c =='u' || c =='U';
    }
}