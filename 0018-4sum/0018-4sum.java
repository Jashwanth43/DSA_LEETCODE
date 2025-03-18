// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> ls=new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-2;i++){
//             if(i>0 && nums[i]==nums[i-1])continue;
//             for(int j=i+1;j<nums.length-1;j++){
//                 if(j>i+1 && nums[j]==nums[j-1])continue;
//                 int k=j+1;
//                 int l=nums.length-1;
//                 while(k<l){
//                     int sum=nums[i]+nums[j]+nums[k]+nums[l];
//                     if(sum >target) l--;
//                     else if (sum<target) k++;
//                     else{
//                         ls.add(List.of(nums[i],nums[j],nums[k],nums[l]));
//                         k++;
//                         l--;
//                         while(k<l && nums[k]==nums[k-1]) k++;
//                     }
//                 }
//             }
//         }
//         return ls;
//     }
// }

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        if (nums.length < 4) return ls;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            
            // Early termination if smallest sum exceeds target
            if (nums[i] > 0 && nums[i] > target) break;
            
            for(int j = i+1; j < nums.length-2; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) continue;
                
                int k = j + 1;
                int l = nums.length - 1;
                
                while (k < l) {
                    // Instead of summing all 4, calculate remaining need
                    int sumFirstTwo = nums[i] + nums[j];
                    // Check for overflow in first two numbers
                    if (nums[i] > 0 && nums[j] > Integer.MAX_VALUE - nums[i]) {
                        l--;
                        continue;
                    }
                    
                    int sumLastTwo = nums[k] + nums[l];
                    // Check for overflow in last two numbers
                    if (nums[k] > 0 && nums[l] > Integer.MAX_VALUE - nums[k]) {
                        l--;
                        continue;
                    }
                    
                    // Check if total would overflow
                    if (sumFirstTwo > 0 && sumLastTwo > Integer.MAX_VALUE - sumFirstTwo) {
                        l--;
                        continue;
                    }
                    
                    int total = sumFirstTwo + sumLastTwo;
                    
                    if (total > target) l--;
                    else if (total < target) k++;
                    else {
                        ls.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k-1]) k++;
                    }
                }
            }
        }
        return ls;
    }
}