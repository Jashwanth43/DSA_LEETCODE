class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int res[]=new  int[2];
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(hm.containsKey(temp)) {
                int j=hm.getOrDefault(temp,0);
                res[0]=i;
                res[1]=j;
            } 
            hm.put(nums[i],i);
        }
        return res;
    }
}