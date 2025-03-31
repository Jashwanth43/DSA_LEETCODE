class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i:nums){
            total+=i;
        }
        int leftTotal=0;  //since it is RT=T-LT-nums[i](Pivot) so we need to keep tack of leftsum not right sum , Since we have to keep track of it to get the other
        for(int i=0;i<nums.length;i++){
            int rt=total-leftTotal-nums[i];
            if(rt==leftTotal) return i;
            leftTotal+=nums[i];
             
        }
        return -1;

    }
}