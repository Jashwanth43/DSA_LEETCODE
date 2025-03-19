class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String strs1=str1+str2;
        String strs2=str2+str1;
        if(!strs1.equals(strs2)) return "";
        return str1.substring(0,gcd(str1.length(),str2.length()));

    }
    public int gcd(int len1,int len2){
        while(len2!=0){
            int temp=len1%len2;
            len1=len2;
            len2=temp;

        }
        return len1;
    }
}