class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","");
        if(s.length()<=0) return true;
        s=s.toLowerCase();
        
        // StringBuffer sb=new StringBuffer();
        // for(int i=s.length()-1;i>=0;i--){
        //  sb.append(s.charAt(i));
        // }
        // String res=sb.toString();

        // return s.equals(res);
        int length=s.length();
        int start=0;
        int end=length-1;
        while(start<end){
           if(s.charAt(start)!=s.charAt(end)){
            return false;
           }
           start++;
           end--;
        }
        return true;

    }
}