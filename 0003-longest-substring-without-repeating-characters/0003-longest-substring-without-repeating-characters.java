class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Use a HashSet to track characters in the current window
        Set<Character> set = new HashSet<>();
        
        // Pointers for the sliding window
        int left = 0;
        int maxLength = 0;

        // Iterate through the string
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, remove characters from the left
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(currentChar);

            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
