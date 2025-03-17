class Solution {
    public void reverseString(char[] s) {
        int length=s.length;
        int start=0;
        int end=length-1;
        while(start<end){
            char swap=s[start];
            s[start]=s[end];
            s[end]=swap;
            start++;
            end--;
        }
        
    }
}