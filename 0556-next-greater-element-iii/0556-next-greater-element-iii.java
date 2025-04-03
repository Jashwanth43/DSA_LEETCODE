class Solution {
    public int nextGreaterElement(int n) {
       char[] nums=(n+ "").toCharArray();
       if(nums.length<=1){
        return -1;
       } 
       int i=nums.length-2;
       while(i>=0 && nums[i]>=nums[i+1]){
        i--;
       }
       if(i<0) return -1;
       int j=nums.length-1;
       while(j>i && nums[j]<=nums[i]){
        j--;
       }
       swap(nums,i,j);
       reverse(nums,i+1,nums.length-1);
       long val=Long.parseLong(new String(nums));
       return val <=Integer.MAX_VALUE? (int) val: -1;

    }
    public void swap(char[] nums, int i, int j){
        char temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(char[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}