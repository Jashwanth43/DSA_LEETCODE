class Solution {
    public boolean isPalindrome(String s) {
       s=s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder st=new StringBuilder(s);
        st.reverse();
       // System.out.println(st);
       // System.out.println(s);

        String v=st.toString();
        if(s.equalsIgnoreCase(v)) return true;
        else return false;
    }
}