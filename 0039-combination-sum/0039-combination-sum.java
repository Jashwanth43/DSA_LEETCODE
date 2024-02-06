class Solution {
    static void sub(int index,ArrayList al,int[] arr,int target,List<List<Integer>> res){
        if(index==arr.length){
        if(target==0) {
            res.add(new ArrayList<>(al));        
        }
           return;
        }
        if(arr[index]<=target) {
            al.add(arr[index]);
            sub(index,al,arr,target-arr[index],res);
            al.remove(al.size()-1);
        }
        sub(index+1,al,arr,target,res);
        

        
        
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<Integer>();
        sub(0,p,candidates,target,res);
        return res;
    }
}