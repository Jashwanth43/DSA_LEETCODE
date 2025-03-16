class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int water=0;
        while(i<j){
            int v=(j-i)*Math.min(height[i],height[j]);
            water=Math.max(water,v);
            if(height[i]>=height[j]) j--;
            else{
                i++;
            }
        }
        return water;
    }
}