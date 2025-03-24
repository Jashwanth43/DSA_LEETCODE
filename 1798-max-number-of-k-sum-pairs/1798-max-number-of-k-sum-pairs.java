class Solution {
    public int maxOperations(int[] nums, int k) {
    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    int op=0;
    for(int i=0;i<nums.length;i++){
        int sum=k-nums[i];
        if(map.containsKey(sum)){
            if(map.get(sum)==1)map.remove(sum);
            else{
                map.put(sum,map.get(sum)-1);
            }
            op++;
        }else{
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

    }
      return op;
    }
}