class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
      if(nums.length==1) return nums[0];
        return Math.max(robHouse(nums,0,nums.length-2),robHouse(nums,1,nums.length-1));

    }
    public int robHouse(int[] nums,int start,int end){
        
        int prev1=nums[start];
        int prev2=0;
    
        for(int i=start+1;i<=end;i++) {
            int current=Math.max(prev1,nums[i]+prev2);
            prev2=prev1;
            prev1=current;
       }
       return prev1;
    }
}