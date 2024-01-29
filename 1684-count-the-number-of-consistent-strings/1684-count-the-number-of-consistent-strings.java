class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int a=words.length;
        boolean[] b=new boolean[26];
        for(Character ch:allowed.toCharArray()){
            b[ch-'a']=true;
        }
            for(String s:words){
                for(Character c:s.toCharArray()){
                    if(b[c-'a']==false){
                        a--;
                        break;
                    }
                }
            }
        
        return a;
    }
  
}