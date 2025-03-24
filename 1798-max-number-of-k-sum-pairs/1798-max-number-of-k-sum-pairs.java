class Solution {
    public int maxOperations(int[] nums, int k) {
    Arrays.sort(nums);
    int op=0;
    int i=0;
    int j=nums.length-1;
    int sum=0;
    while(i<j){
        sum=nums[i]+nums[j];
        if(sum==k){
            op++;
            i++;
            j--;
        }
        else if(sum>k){
            j--;

        }else{
            i++;
        }
    }   
    return op;
    }
}