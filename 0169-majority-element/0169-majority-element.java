class Solution {
    public int majorityElement(int[] nums) {
                HashMap<Integer,Integer> hm=new HashMap<>();
        int n=(nums.length)/2;
        for(int i=0;i<nums.length;i++){
                 int temp=hm.getOrDefault(nums[i], 0);
                temp++;
                if(temp>n) {
                    return nums[i];
                }
                hm.put(nums[i],temp);
        }
        // for(HashMap.Entry<Integer,Integer> entry:hm.entrySet()){
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }
        return 0;
    }
}