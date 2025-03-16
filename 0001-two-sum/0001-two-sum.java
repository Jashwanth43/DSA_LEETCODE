
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int v=target-nums[i];
            if(map.containsKey(v)){
                Integer res=map.get(v);
                int r=res.intValue();
return new int[] { r, i };
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}