class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int k=1;
        int length=0;
        int zeroCount=0;
        if(nums.length==1){
            if(nums[0]==1){
                return 0;
            }else{
                return 0;
            }
        }
        if(nums[0]==0){
            zeroCount++;
            j++;
        }
        while(j<nums.length){
            if(nums[j]==0){
             zeroCount++;
            }
            while(zeroCount>k){
                if(nums[i]==0){
                    zeroCount--;
                }
                i++;
            }
            length=Math.max(length,j-i+1);
            j++;
        }
        return length-k;
    }
}