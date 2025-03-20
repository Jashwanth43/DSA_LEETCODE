class Solution {
    public String reverseWords(String s) {
        String[] ls = s.trim().split("\\s+"); // Remove extra spaces and split
        Collections.reverse(Arrays.asList(ls));  // Reverse the word order
        return String.join(" ", ls);
    }
}
