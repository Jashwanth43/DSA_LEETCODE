class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map<Character,Integer> map=new HashMap<>();
      int max=0;
      int i=0;
      int j=0;
      while(i<s.length() && j<s.length()){
        if(map.containsKey(s.charAt(j))){

          i=Math.max(i,map.get(s.charAt(j))+1);
        }
        // System.out.println(i+" "+j);

        max=Math.max(max,((j-i)+1));
        // System.out.println(max);
        map.put(s.charAt(j),j);
        j++;
      } 
      return max;
    }
}