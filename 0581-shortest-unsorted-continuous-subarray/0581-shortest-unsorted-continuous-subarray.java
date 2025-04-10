class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int max=nums[0];
        int count2=-1;
       int count1=-1;
       int min=nums[nums.length-1];
       //last decreasing
       for(int i=1;i<nums.length;i++){
          max=Math.max(max,nums[i]);
          if(nums[i]<max)count1=i;
       }
       if(count1==-1)return 0;
       //last increasing
       for(int j=nums.length-2;j>=0;j--){
        min=Math.min(min,nums[j]);
        if(nums[j]>min) count2=j;
       }
       return count1-count2+1;
    }
}