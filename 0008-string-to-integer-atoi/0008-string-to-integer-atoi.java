class Solution {
    public int myAtoi(String s) {
        // Step 1: Trim leading and trailing whitespace
        s = s.trim();
        if (s.isEmpty()) return 0;

        // Step 2: Determine the sign
        int sign = 1;
        int index = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        // Step 3: Read the integer part
        long result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');

            // Step 4: Handle overflow
            if (result * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            index++;
        }

        return (int) (result * sign);
    }
}
