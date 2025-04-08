class Solution {
    public int totalFruit(int[] fruits) {
        int i=0;
        int k=2;
        if(fruits.length==1){
            return 1;
        }
        int maxCount=0,count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<fruits.length;j++){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(map.size()>k){
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])==0) {
                    map.remove(fruits[i]);
                }
                count--;
                i++;
            }
            count=count+1;
            maxCount=Math.max(maxCount,count);

        }
        return maxCount;
    }
}