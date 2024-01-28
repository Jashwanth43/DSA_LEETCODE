class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
      for(int x[]:accounts){
          int count=0;
          for(int j:x){
              
               count =count+j;
          }
          max=Math.max(max,count);
      }  
        return max;
    }
}