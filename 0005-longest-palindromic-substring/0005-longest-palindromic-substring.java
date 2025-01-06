class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Expand around a single character (odd-length palindromes)
            int len1 = expandAroundCenter(s, i, i);
            
            // Expand around two characters (even-length palindromes)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Get the maximum length from the two centers
            int len = Math.max(len1, len2);
            
            // Update the start and end indices if a longer palindrome is found
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        // Expand as long as the characters at left and right are equal and within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome
        return right - left - 1;
    }
}
