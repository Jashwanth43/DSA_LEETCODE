class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else {
                    List<Integer> l=List.of(nums[i],nums[j],nums[k]);
                    ls.add(l);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                }
            }
        }
        return ls;
    }
}