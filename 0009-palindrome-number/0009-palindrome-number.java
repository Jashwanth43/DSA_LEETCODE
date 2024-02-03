class Solution {
    public boolean isPalindrome(int x) {
        int c=0;
        int p=x;
        if(x<0) return false;
        while(x>0){
            int v=x%10;
            c=(c*10)+v;
            x=x/10;
        }
        if(p==c){
            return true;
        }
        else {
            return false;
        }
    }
}