class Solution {
    public int largestAltitude(int[] gain) {
        int val=0;
        int sum=0;
        for(int i:gain){
            val+=i;
            if(val>0){
                sum=Math.max(sum,val);
            }

        }
        return sum;

    }
}