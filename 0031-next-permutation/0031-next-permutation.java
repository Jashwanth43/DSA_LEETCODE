class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return;
        }
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i<0){  // Changed from i==0 to i<0 since i can go to -1
            rev(nums,0,nums.length-1);
            return;
        }
        int j=nums.length-1;
        while(j>i && nums[j]<=nums[i]){
            j--;
        }
        swap(nums,i,j);
        int first=i+1;
        int last=nums.length-1;
        rev(nums,first,last);
    }
    
    public void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public void rev(int nums[],int first, int last){
        while(first<last){
            swap(nums,first,last);
            first++;
            last--;
        }
    }
}