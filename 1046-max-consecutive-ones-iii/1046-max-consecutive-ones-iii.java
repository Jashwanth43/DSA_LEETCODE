class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int zeroCount=0;
        int length=0;
        if(nums.length==1){
            if(nums[0]==0 && k==1){
                return 1;
            }else{
                return 0;
            }
        }
        if(nums[j]==0){
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
        return length;
    }
}