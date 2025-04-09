class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result=new int[nums.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length*2;i++){
            while (!stack.isEmpty() && nums[i % nums.length]>nums[stack.peek()]){
                 result[stack.pop()]=nums[i%(nums.length)];
            }
            stack.push(i%nums.length);
        }
        return result;

    }
}