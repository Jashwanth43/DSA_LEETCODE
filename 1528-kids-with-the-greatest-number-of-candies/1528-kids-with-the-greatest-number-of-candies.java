class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> value=new ArrayList<>();
        int max=0;
        for(int i :candies){
            max=Math.max(max,i);
        }
        for(int i=0;i<candies.length;i++){
            int sum=candies[i]+extraCandies;
            if(sum>=max){
                value.add(true);
            }else {
                value.add(false);
            }
        }
        return value;
    }
}