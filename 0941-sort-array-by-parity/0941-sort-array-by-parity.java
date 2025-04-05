class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        if(nums.length==2){
            if((nums[0]%2==1) && (nums[1]%2==0)){
                int temp=nums[0];
        nums[0]=nums[1];
        nums[1]=temp;
        return nums;
            }
            else {
                return nums;
            }
        }
    int i=0;
    int j=nums.length-1;
    while(i<j){
        while(i<j && (nums[i]%2==0)){
            i++;
        }
         while(j>i && (nums[j]%2==1)){
            j--;
        }
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }
    return nums;

    }
}