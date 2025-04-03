class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
         if((sum/k)>=threshold){
                count++;
            }
        for(int j=k;j<arr.length;j++){
            sum-=arr[j-k];
            sum+=arr[j];
            if((sum/k)>=threshold){
                count++;
            }
        }
        return count;
    }
}