class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    
        List<Boolean> result=new ArrayList<Boolean>();
        int max=0;
       for(int i: candies){
            max=Math.max(max,i);
       }
        for(int i: candies){
            result.add((i+extraCandies)>=max);
        }
        return result;
    }
}
