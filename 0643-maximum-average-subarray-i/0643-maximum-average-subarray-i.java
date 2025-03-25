class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0.0;
        int sum=0;
        if(nums.length<=1){
            return (nums[0]/k);
        }
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
        avg=(double)sum/k;
        for(int j=k;j<nums.length;j++){
            sum-=nums[j-k];

            sum+=nums[j];
            double avgss=(double)sum/k;
            avg=Math.max(avg,avgss);

        }
        return avg;
    }
}