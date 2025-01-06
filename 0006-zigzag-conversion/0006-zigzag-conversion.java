class Solution {
    public String convert(String s, int numRows) {
        // If there's only one row or the string length is less than numRows
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create a list of StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Variables to track the current row and direction
        int currentRow = 0;
        boolean goingDown = false;

        // Traverse each character in the string
        for (char c : s.toCharArray()) {
            // Append the character to the current row
            rows[currentRow].append(c);

            // Change direction when hitting the top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row based on the direction
            currentRow += goingDown ? 1 : -1;
        }

        // Concatenate all rows to form the result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
